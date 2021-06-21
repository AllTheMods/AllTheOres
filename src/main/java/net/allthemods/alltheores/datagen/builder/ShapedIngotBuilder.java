package net.allthemods.alltheores.datagen.builder;

import net.allthemods.alltheores.datagen.RecipeException;
import net.allthemods.alltheores.infos.Reference;
import net.minecraft.advancements.ICriterionInstance;
import net.minecraft.advancements.criterion.InventoryChangeTrigger;
import net.minecraft.advancements.criterion.ItemPredicate;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.ShapedRecipeBuilder;
import net.minecraft.item.Item;
import net.minecraft.tags.ITag;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;

import java.util.EnumMap;
import java.util.Locale;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;

public class ShapedIngotBuilder {
    public enum Slot {
        INGOT;
        public String lower() {
            return toString().toLowerCase(Locale.ROOT);
        }
    }


    private final String criteriaName;
    private final ICriterionInstance criterion;
    private final EnumMap<Slot, Item> pieces = new EnumMap<>(Slot.class);
    private final ITag<Item> nugget;


    public ShapedIngotBuilder(ITag<Item> nugget) {
        this.nugget = nugget;

        ResourceLocation tagLocation = Objects.requireNonNull(ItemTags.getAllTags().getId(nugget));
        this.criteriaName = String.format("has_%s_nugget", tagLocation.getPath().replace("nugget/", ""));

        ItemPredicate predicate = ItemPredicate.Builder.item().of(nugget).build();
        this.criterion = InventoryChangeTrigger.Instance.hasItems(predicate);
    }

    public static ShapedIngotBuilder builder(ITag<Item> nugget) {
        return new ShapedIngotBuilder(nugget);
    }



    public ShapedIngotBuilder setIngot(RegistryObject<Item> object) {
        pieces.put(Slot.INGOT, object.get());
        return this;
    }


    protected void validate(ResourceLocation id) {
        if (pieces.isEmpty()) {
            throw new RecipeException(id.toString(), "recipe must have at least 1 output");
        }
    }

    public void build(Consumer<IFinishedRecipe> consumer) {

        Consumer<ShapedRecipeBuilder> register = builder -> builder.save(consumer);

        Optional.ofNullable(pieces.get(Slot.INGOT))
            .map(this::ingot)
            .map(this::addCriterionNugget)
            .ifPresent(register);

    }

    private ShapedRecipeBuilder shaped(IItemProvider provider) {
        return ShapedRecipeBuilder.shaped(provider)
            .group(Reference.MOD_ID);
    }

    private ShapedRecipeBuilder addCriterionNugget(ShapedRecipeBuilder builder) {
        return builder
            .define('a', nugget)
            .unlockedBy(criteriaName, criterion);
    }

    private ShapedRecipeBuilder ingot(IItemProvider provider) {
        return shaped(provider)
                .pattern("aaa")
                .pattern("aaa")
                .pattern("aaa");
    }
}

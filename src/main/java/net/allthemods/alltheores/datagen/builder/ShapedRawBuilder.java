package net.allthemods.alltheores.datagen.builder;

import net.allthemods.alltheores.datagen.RecipeException;
import net.allthemods.alltheores.infos.Reference;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.registries.RegistryObject;

import java.util.EnumMap;
import java.util.Locale;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;

public class ShapedRawBuilder {
    public enum Slot {
        RAW;
        public String lower() {
            return toString().toLowerCase(Locale.ROOT);
        }
    }


    private final String criteriaName;
    private final InventoryChangeTrigger.TriggerInstance criterion;
    private final EnumMap<Slot, Item> pieces = new EnumMap<>(Slot.class);
    private final TagKey<Item> raw;


    public ShapedRawBuilder(TagKey<Item> raw) {
        this.raw = raw;


        this.criteriaName = String.format("has_raw_%s", raw);

        ItemPredicate predicate = ItemPredicate.Builder.item().of(raw).build();
        this.criterion = InventoryChangeTrigger.TriggerInstance.hasItems(predicate);
    }

    public static ShapedRawBuilder builder(TagKey<Item> raw) {
        return new ShapedRawBuilder(raw);
    }



    public ShapedRawBuilder setRaw(RegistryObject<Item> object) {
        pieces.put(Slot.RAW, object.get());
        return this;
    }


    protected void validate(ResourceLocation id) {
        if (pieces.isEmpty()) {
            throw new RecipeException(id.toString(), "recipe must have at least 1 output");
        }
    }

    public void build(Consumer<FinishedRecipe> consumer) {

        Consumer<ShapedRecipeBuilder> register = builder -> builder.save(consumer);

        Optional.ofNullable(pieces.get(Slot.RAW))
            .map(this::raw_block)
            .map(this::addCriterionRaw)
            .ifPresent(register);

    }

    private ShapedRecipeBuilder shaped(ItemLike provider) {
        return ShapedRecipeBuilder.shaped(provider)
            .group(Reference.MOD_ID);
    }

    private ShapedRecipeBuilder addCriterionRaw(ShapedRecipeBuilder builder) {
        return builder
            .define('a', raw)
            .unlockedBy(criteriaName, criterion);
    }

    private ShapedRecipeBuilder raw_block(ItemLike provider) {
        return shaped(provider)
                .pattern("aaa")
                .pattern("aaa")
                .pattern("aaa");
    }
}

package net.allthemods.alltheores.datagen.builder;

import net.allthemods.alltheores.datagen.RecipeException;
import net.allthemods.alltheores.infos.Reference;
import net.minecraft.advancements.ICriterionInstance;
import net.minecraft.advancements.criterion.InventoryChangeTrigger;
import net.minecraft.advancements.criterion.ItemPredicate;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.ShapedRecipeBuilder;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.tags.ITag;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.Tags;
import net.minecraftforge.fml.RegistryObject;

import java.util.EnumMap;
import java.util.Locale;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;

public class ShapedArmorBuilder {

    public enum Slot {
        HELMET, CHESTPLATE, LEGGINGS, BOOTS;

        public String lower() {
            return toString().toLowerCase(Locale.ROOT);
        }
    }

    private final String criteriaName;
    private final ICriterionInstance criterion;
    private final EnumMap<Slot, Item> pieces = new EnumMap<>(Slot.class);
    private final ITag<Item> ingot;
    private Item core;


    public ShapedArmorBuilder(ITag<Item> ingot) {
        this.ingot = ingot;

        ResourceLocation tagLocation = Objects.requireNonNull(ItemTags.getAllTags().getId(ingot));
        this.criteriaName = String.format("has_%s_ingot", tagLocation.getPath().replace("ingot/", ""));

        ItemPredicate predicate = ItemPredicate.Builder.item().of(ingot).build();
        this.criterion = InventoryChangeTrigger.Instance.hasItems(predicate);
    }

    public static ShapedArmorBuilder builder(ITag<Item> ingot) {
        return new ShapedArmorBuilder(ingot);
    }

    public ShapedArmorBuilder setCore(RegistryObject<Item> object) {
        this.core = object.get();
        return this;
    }

    public ShapedArmorBuilder setHelmet(RegistryObject<ArmorItem> object) {
        pieces.put(Slot.HELMET, object.get());
        return this;
    }

    public ShapedArmorBuilder setChestplate(RegistryObject<ArmorItem> object) {
        pieces.put(Slot.CHESTPLATE, object.get());
        return this;
    }

    public ShapedArmorBuilder setLeggings(RegistryObject<ArmorItem> object) {
        pieces.put(Slot.LEGGINGS, object.get());
        return this;
    }

    public ShapedArmorBuilder setBoots(RegistryObject<ArmorItem> object) {
        pieces.put(Slot.BOOTS, object.get());
        return this;
    }


    protected void validate(ResourceLocation id) {
        if (core == null) {
            throw new RecipeException(id.toString(), "recipe must have a core");
        }

        if (pieces.isEmpty()) {
            throw new RecipeException(id.toString(), "recipe must have at least 1 output");
        }
    }

    public void build(Consumer<IFinishedRecipe> consumer) {

        Consumer<ShapedRecipeBuilder> register = builder -> builder.save(consumer);

        Optional.ofNullable(pieces.get(Slot.HELMET))
            .map(this::helmet)
            .map(this::addCriterion)
            .ifPresent(register);

        Optional.ofNullable(pieces.get(Slot.CHESTPLATE))
            .map(this::chestplate)
            .map(this::addCriterion)
            .ifPresent(register);

        Optional.ofNullable(pieces.get(Slot.LEGGINGS))
            .map(this::leggings)
            .map(this::addCriterion)
            .ifPresent(register);

        Optional.ofNullable(pieces.get(Slot.BOOTS))
            .map(this::boots)
            .map(this::addCriterion)
            .ifPresent(register);
    }

    private ShapedRecipeBuilder shaped(IItemProvider provider) {
        return ShapedRecipeBuilder.shaped(provider)
            .group(Reference.MOD_ID);
    }

    private ShapedRecipeBuilder addCriterion(ShapedRecipeBuilder builder) {
        return builder
            .define('c', core)
            .define('a', ingot)
            .unlockedBy(criteriaName, criterion);
    }

    private ShapedRecipeBuilder helmet(IItemProvider provider) {
        return shaped(provider)
            .pattern("aca")
            .pattern("aga")
            .pattern("   ")
            .define('g', Tags.Items.GLASS);

    }

    private ShapedRecipeBuilder chestplate(IItemProvider provider) {
        return shaped(provider)
            .pattern("a a")
            .pattern("aca")
            .pattern("aaa");
    }

    private ShapedRecipeBuilder leggings(IItemProvider provider) {
        return shaped(provider)
            .pattern("aca")
            .pattern("a a")
            .pattern("a a");
    }

    private ShapedRecipeBuilder boots(IItemProvider provider) {
        return shaped(provider)
            .pattern("a a")
            .pattern("aca")
            .pattern("   ");
    }
}

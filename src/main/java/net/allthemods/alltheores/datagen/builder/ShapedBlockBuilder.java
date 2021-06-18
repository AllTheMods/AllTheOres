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

public class ShapedBlockBuilder {
    public enum Slot {
        METALBLOCK, GEAR, ROD, PLATE;
        public String lower() {
            return toString().toLowerCase(Locale.ROOT);
        }
    }


    private final String criteriaName;
    private final ICriterionInstance criterion;
    private final EnumMap<Slot, Item> pieces = new EnumMap<>(Slot.class);
    private final ITag<Item> ingot;
    private Item core;


    public ShapedBlockBuilder(ITag<Item> ingot) {
        this.ingot = ingot;

        ResourceLocation tagLocation = Objects.requireNonNull(ItemTags.getAllTags().getId(ingot));
        this.criteriaName = String.format("has_%s_ingot", tagLocation.getPath().replace("ingot/", ""));

        ItemPredicate predicate = ItemPredicate.Builder.item().of(ingot).build();
        this.criterion = InventoryChangeTrigger.Instance.hasItems(predicate);
    }

    public static ShapedBlockBuilder builder(ITag<Item> ingot) {
        return new ShapedBlockBuilder(ingot);
    }



    public ShapedBlockBuilder setBlock(RegistryObject<Item> object) {
        pieces.put(Slot.METALBLOCK, object.get());
        return this;
    }
    public ShapedBlockBuilder setGear(RegistryObject<Item> object) {
        pieces.put(Slot.GEAR, object.get());
        return this;
    }
    public ShapedBlockBuilder setPlate(RegistryObject<Item> object) {
        pieces.put(Slot.PLATE, object.get());
        return this;
    }
    public ShapedBlockBuilder setRod(RegistryObject<Item> object) {
        pieces.put(Slot.ROD, object.get());
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

        Optional.ofNullable(pieces.get(Slot.METALBLOCK))
            .map(this::block)
            .map(this::addCriterion)
            .ifPresent(register);
        Optional.ofNullable(pieces.get(Slot.GEAR))
                .map(this::gear)
                .map(this::addCriterion)
                .ifPresent(register);
        Optional.ofNullable(pieces.get(Slot.ROD))
                .map(this::rod)
                .map(this::addCriterion)
                .ifPresent(register);
        Optional.ofNullable(pieces.get(Slot.PLATE))
                .map(this::plate)
                .map(this::addCriterion)
                .ifPresent(register);
    }

    private ShapedRecipeBuilder shaped(IItemProvider provider) {
        return ShapedRecipeBuilder.shaped(provider)
            .group(Reference.MOD_ID);
    }

    private ShapedRecipeBuilder addCriterion(ShapedRecipeBuilder builder) {
        return builder
            .define('a', ingot)
            .unlockedBy(criteriaName, criterion);
    }

    private ShapedRecipeBuilder block(IItemProvider provider) {
        return shaped(provider)
            .pattern("aaa")
            .pattern("aaa")
            .pattern("aaa");

    }
    private ShapedRecipeBuilder gear(IItemProvider provider) {
        return shaped(provider)
                .pattern("aaa")
                .pattern("a a")
                .pattern("aaa");

    }
    private ShapedRecipeBuilder rod(IItemProvider provider) {
        return shaped(provider)
                .pattern("a  ")
                .pattern("a  ")
                .pattern("a  ");

    }
    private ShapedRecipeBuilder plate(IItemProvider provider) {
        return shaped(provider)
                .pattern("aa ")
                .pattern("aa ")
                .pattern("   ");

    }
}

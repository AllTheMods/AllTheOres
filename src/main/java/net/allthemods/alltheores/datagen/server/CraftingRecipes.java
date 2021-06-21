package net.allthemods.alltheores.datagen.server;

import net.allthemods.alltheores.blocks.BlockList;
import net.allthemods.alltheores.datagen.builder.ShapedBlockBuilder;
import net.allthemods.alltheores.datagen.builder.ShapedIngotBuilder;
import net.allthemods.alltheores.infos.ItemTagRegistry;
import net.allthemods.alltheores.infos.Reference;
import net.minecraft.data.*;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.IItemProvider;
import net.minecraftforge.common.Tags;

import java.util.function.Consumer;

public class CraftingRecipes extends RecipeProvider {
    public CraftingRecipes(DataGenerator generatorIn) {
        super(generatorIn);
    }

    private ShapedRecipeBuilder shaped(IItemProvider provider) {
        return ShapedRecipeBuilder.shaped(provider)
            .group(Reference.MOD_ID);
    }


    @Override
    protected void buildShapelessRecipes(Consumer<IFinishedRecipe> consumer) {
/*
        shaped(TheGuide.TIER_1_CORE.get())
            .pattern("g g")
            .pattern("ppp")
            .pattern("g g")
            .define('g', Tags.Items.INGOTS_GOLD)
            .define('p', ItemTagRegistry.PLATINUM_INGOT)
            .unlockedBy("has_platinum_ingot", has(ItemTagRegistry.PLATINUM_INGOT))
            .save(consumer);
*/
        final String hasCondition = "has_item";

        ShapedBlockBuilder.builder(ItemTagRegistry.ALUMINUM_INGOT)
                .setBlock(BlockList.ALUMINUM_BLOCK_ITEM)
                .setGear(BlockList.ALUMINUM_GEAR)
                .setPlate(BlockList.ALUMINUM_PLATE)
                .setRod(BlockList.ALUMINUM_ROD)
                .build(consumer);
        ShapedBlockBuilder.builder(ItemTagRegistry.LEAD_INGOT)
                .setBlock(BlockList.LEAD_BLOCK_ITEM)
                .setGear(BlockList.LEAD_GEAR)
                .setPlate(BlockList.LEAD_PLATE)
                .setRod(BlockList.LEAD_ROD)
                .build(consumer);
        ShapedBlockBuilder.builder(ItemTagRegistry.NICKEL_INGOT)
                .setBlock(BlockList.NICKEL_BLOCK_ITEM)
                .setGear(BlockList.NICKEL_GEAR)
                .setPlate(BlockList.NICKEL_PLATE)
                .setRod(BlockList.NICKEL_ROD)
                .build(consumer);
        ShapedBlockBuilder.builder(ItemTagRegistry.OSMIUM_INGOT)
                .setBlock(BlockList.OSMIUM_BLOCK_ITEM)
                .setGear(BlockList.OSMIUM_GEAR)
                .setPlate(BlockList.OSMIUM_PLATE)
                .setRod(BlockList.OSMIUM_ROD)
                .build(consumer);
        ShapedBlockBuilder.builder(ItemTagRegistry.PLATINUM_INGOT)
                .setBlock(BlockList.PLATINUM_BLOCK_ITEM)
                .setGear(BlockList.PLATINUM_GEAR)
                .setPlate(BlockList.PLATINUM_PLATE)
                .setRod(BlockList.PLATINUM_ROD)
                .build(consumer);
        ShapedBlockBuilder.builder(ItemTagRegistry.SILVER_INGOT)
                .setBlock(BlockList.SILVER_BLOCK_ITEM)
                .setGear(BlockList.SILVER_GEAR)
                .setPlate(BlockList.SILVER_PLATE)
                .setRod(BlockList.SILVER_ROD)
                .build(consumer);
        ShapedBlockBuilder.builder(ItemTagRegistry.TIN_INGOT)
                .setBlock(BlockList.TIN_BLOCK_ITEM)
                .setGear(BlockList.TIN_GEAR)
                .setPlate(BlockList.TIN_PLATE)
                .setRod(BlockList.TIN_ROD)
                .build(consumer);
        ShapedBlockBuilder.builder(ItemTagRegistry.URANIUM_INGOT)
                .setBlock(BlockList.URANIUM_BLOCK_ITEM)
                .setGear(BlockList.URANIUM_GEAR)
                .setPlate(BlockList.URANIUM_PLATE)
                .setRod(BlockList.URANIUM_ROD)
                .build(consumer);
        ShapedBlockBuilder.builder(ItemTagRegistry.ZINC_INGOT)
                .setBlock(BlockList.ZINC_BLOCK_ITEM)
                .setGear(BlockList.ZINC_GEAR)
                .setPlate(BlockList.ZINC_PLATE)
                .setRod(BlockList.ZINC_ROD)
                .build(consumer);

        ShapedBlockBuilder.builder(Tags.Items.INGOTS_IRON)
                .setGear(BlockList.IRON_GEAR)
                .setPlate(BlockList.IRON_PLATE)
                .setRod(BlockList.IRON_ROD)
                .build(consumer);

        ShapedBlockBuilder.builder(Tags.Items.INGOTS_GOLD)
                .setGear(BlockList.GOLD_GEAR)
                .setPlate(BlockList.GOLD_PLATE)
                .setRod(BlockList.GOLD_ROD)
                .build(consumer);

        ShapedBlockBuilder.builder(Tags.Items.GEMS_DIAMOND)
                .setGear(BlockList.DIAMOND_GEAR)
                .setPlate(BlockList.DIAMOND_PLATE)
                .setRod(BlockList.DIAMOND_ROD)
                .build(consumer);

        ShapedBlockBuilder.builder(ItemTagRegistry.BRONZE_INGOT)
                .setBlock(BlockList.BRONZE_BLOCK_ITEM)
                .setGear(BlockList.BRONZE_GEAR)
                .setPlate(BlockList.BRONZE_PLATE)
                .setRod(BlockList.BRONZE_ROD)
                .build(consumer);

        ShapedBlockBuilder.builder(ItemTagRegistry.CONSTANTAN_INGOT)
                .setBlock(BlockList.CONSTANTAN_BLOCK_ITEM)
                .setGear(BlockList.CONSTANTAN_GEAR)
                .setPlate(BlockList.CONSTANTAN_PLATE)
                .setRod(BlockList.CONSTANTAN_ROD)
                .build(consumer);

        ShapedBlockBuilder.builder(ItemTagRegistry.ELECTRUM_INGOT)
                .setBlock(BlockList.ELECTRUM_BLOCK_ITEM)
                .setGear(BlockList.ELECTRUM_GEAR)
                .setPlate(BlockList.ELECTRUM_PLATE)
                .setRod(BlockList.ELECTRUM_ROD)
                .build(consumer);

        ShapedBlockBuilder.builder(ItemTagRegistry.ENDERIUM_INGOT)
                .setBlock(BlockList.ENDERIUM_BLOCK_ITEM)
                .setGear(BlockList.ENDERIUM_GEAR)
                .setPlate(BlockList.ENDERIUM_PLATE)
                .setRod(BlockList.ENDERIUM_ROD)
                .build(consumer);

        ShapedBlockBuilder.builder(ItemTagRegistry.INVAR_INGOT)
                .setBlock(BlockList.INVAR_BLOCK_ITEM)
                .setGear(BlockList.INVAR_GEAR)
                .setPlate(BlockList.INVAR_PLATE)
                .setRod(BlockList.INVAR_ROD)
                .build(consumer);

        ShapedBlockBuilder.builder(ItemTagRegistry.LUMIUM_INGOT)
                .setBlock(BlockList.LUMIUM_BLOCK_ITEM)
                .setGear(BlockList.LUMIUM_GEAR)
                .setPlate(BlockList.LUMIUM_PLATE)
                .setRod(BlockList.LUMIUM_ROD)
                .build(consumer);

        ShapedBlockBuilder.builder(ItemTagRegistry.SIGNALUM_INGOT)
                .setBlock(BlockList.SIGNALUM_BLOCK_ITEM)
                .setGear(BlockList.SIGNALUM_GEAR)
                .setPlate(BlockList.SIGNALUM_PLATE)
                .setRod(BlockList.SIGNALUM_ROD)
                .build(consumer);

        ShapedBlockBuilder.builder(ItemTagRegistry.STEEL_INGOT)
                .setBlock(BlockList.STEEL_BLOCK_ITEM)
                .setGear(BlockList.STEEL_GEAR)
                .setPlate(BlockList.STEEL_PLATE)
                .setRod(BlockList.STEEL_ROD)
                .build(consumer);

        ShapedIngotBuilder.builder(ItemTagRegistry.ALUMINUM_NUGGET)
                .setIngot(BlockList.ALUMINUM_INGOT)
                .build(consumer);

        ShapedIngotBuilder.builder(ItemTagRegistry.LEAD_NUGGET)
                .setIngot(BlockList.LEAD_INGOT)
                .build(consumer);

        ShapedIngotBuilder.builder(ItemTagRegistry.NICKEL_NUGGET)
                .setIngot(BlockList.NICKEL_INGOT)
                .build(consumer);

        ShapedIngotBuilder.builder(ItemTagRegistry.OSMIUM_NUGGET)
                .setIngot(BlockList.OSMIUM_INGOT)
                .build(consumer);

        ShapedIngotBuilder.builder(ItemTagRegistry.PLATINUM_NUGGET)
                .setIngot(BlockList.PLATINUM_INGOT)
                .build(consumer);

        ShapedIngotBuilder.builder(ItemTagRegistry.SILVER_NUGGET)
                .setIngot(BlockList.SILVER_INGOT)
                .build(consumer);

        ShapedIngotBuilder.builder(ItemTagRegistry.TIN_NUGGET)
                .setIngot(BlockList.TIN_INGOT)
                .build(consumer);

        ShapedIngotBuilder.builder(ItemTagRegistry.URANIUM_NUGGET)
                .setIngot(BlockList.URANIUM_INGOT)
                .build(consumer);

        ShapedIngotBuilder.builder(ItemTagRegistry.ZINC_NUGGET)
                .setIngot(BlockList.ZINC_INGOT)
                .build(consumer);

        ShapedIngotBuilder.builder(ItemTagRegistry.BRONZE_NUGGET)
                .setIngot(BlockList.BRONZE_INGOT)
                .build(consumer);

        ShapedIngotBuilder.builder(ItemTagRegistry.CONSTANTAN_NUGGET)
                .setIngot(BlockList.CONSTANTAN_INGOT)
                .build(consumer);

        ShapedIngotBuilder.builder(ItemTagRegistry.ELECTRUM_NUGGET)
                .setIngot(BlockList.ELECTRUM_INGOT)
                .build(consumer);

        ShapedIngotBuilder.builder(ItemTagRegistry.ENDERIUM_NUGGET)
                .setIngot(BlockList.ENDERIUM_INGOT)
                .build(consumer);

        ShapedIngotBuilder.builder(ItemTagRegistry.INVAR_NUGGET)
                .setIngot(BlockList.INVAR_INGOT)
                .build(consumer);

        ShapedIngotBuilder.builder(ItemTagRegistry.LUMIUM_NUGGET)
                .setIngot(BlockList.LUMIUM_INGOT)
                .build(consumer);

        ShapedIngotBuilder.builder(ItemTagRegistry.SIGNALUM_NUGGET)
                .setIngot(BlockList.SIGNALUM_INGOT)
                .build(consumer);

        ShapedIngotBuilder.builder(ItemTagRegistry.STEEL_NUGGET)
                .setIngot(BlockList.STEEL_INGOT)
                .build(consumer);

        ShapelessRecipeBuilder
                .shapeless(BlockList.ALUMINUM_INGOT.get(),9)
                .requires(ItemTagRegistry.ALUMINUM_BLOCK_ITEM)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.ALUMINUM_BLOCK_ITEM.get()))
                .group("shapeless")
                .save(consumer);
        ShapelessRecipeBuilder
                .shapeless(BlockList.ALUMINUM_NUGGET.get(),9)
                .requires(ItemTagRegistry.ALUMINUM_INGOT)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.ALUMINUM_INGOT.get()))
                .group("shapeless")
                .save(consumer);

        ShapelessRecipeBuilder
                .shapeless(BlockList.LEAD_INGOT.get(),9)
                .requires(ItemTagRegistry.LEAD_BLOCK_ITEM)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.LEAD_BLOCK_ITEM.get()))
                .group("shapeless")
                .save(consumer);

        ShapelessRecipeBuilder
                .shapeless(BlockList.LEAD_NUGGET.get(),9)
                .requires(ItemTagRegistry.LEAD_INGOT)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.LEAD_INGOT.get()))
                .group("shapeless")
                .save(consumer);

        ShapelessRecipeBuilder
                .shapeless(BlockList.OSMIUM_INGOT.get(),9)
                .requires(ItemTagRegistry.OSMIUM_BLOCK_ITEM)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.OSMIUM_BLOCK_ITEM.get()))
                .group("shapeless")
                .save(consumer);

        ShapelessRecipeBuilder
                .shapeless(BlockList.OSMIUM_NUGGET.get(),9)
                .requires(ItemTagRegistry.OSMIUM_INGOT)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.OSMIUM_INGOT.get()))
                .group("shapeless")
                .save(consumer);

        ShapelessRecipeBuilder
                .shapeless(BlockList.NICKEL_INGOT.get(),9)
                .requires(ItemTagRegistry.NICKEL_BLOCK_ITEM)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.NICKEL_BLOCK_ITEM.get()))
                .group("shapeless")
                .save(consumer);

        ShapelessRecipeBuilder
                .shapeless(BlockList.NICKEL_NUGGET.get(),9)
                .requires(ItemTagRegistry.NICKEL_INGOT)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.NICKEL_INGOT.get()))
                .group("shapeless")
                .save(consumer);

        ShapelessRecipeBuilder
                .shapeless(BlockList.PLATINUM_INGOT.get(),9)
                .requires(ItemTagRegistry.PLATINUM_BLOCK_ITEM)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.PLATINUM_BLOCK_ITEM.get()))
                .group("shapeless")
                .save(consumer);

        ShapelessRecipeBuilder
                .shapeless(BlockList.PLATINUM_NUGGET.get(),9)
                .requires(ItemTagRegistry.PLATINUM_INGOT)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.PLATINUM_INGOT.get()))
                .group("shapeless")
                .save(consumer);

        ShapelessRecipeBuilder
                .shapeless(BlockList.SILVER_INGOT.get(),9)
                .requires(ItemTagRegistry.SILVER_BLOCK_ITEM)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.SILVER_BLOCK_ITEM.get()))
                .group("shapeless")
                .save(consumer);

        ShapelessRecipeBuilder
                .shapeless(BlockList.SILVER_NUGGET.get(),9)
                .requires(ItemTagRegistry.SILVER_INGOT)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.SILVER_INGOT.get()))
                .group("shapeless")
                .save(consumer);

        ShapelessRecipeBuilder
                .shapeless(BlockList.TIN_INGOT.get(),9)
                .requires(ItemTagRegistry.TIN_BLOCK_ITEM)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.TIN_BLOCK_ITEM.get()))
                .group("shapeless")
                .save(consumer);

        ShapelessRecipeBuilder
                .shapeless(BlockList.TIN_NUGGET.get(),9)
                .requires(ItemTagRegistry.TIN_INGOT)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.TIN_INGOT.get()))
                .group("shapeless")
                .save(consumer);

        ShapelessRecipeBuilder
                .shapeless(BlockList.URANIUM_INGOT.get(),9)
                .requires(ItemTagRegistry.URANIUM_BLOCK_ITEM)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.URANIUM_BLOCK_ITEM.get()))
                .group("shapeless")
                .save(consumer);

        ShapelessRecipeBuilder
                .shapeless(BlockList.URANIUM_NUGGET.get(),9)
                .requires(ItemTagRegistry.URANIUM_INGOT)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.URANIUM_INGOT.get()))
                .group("shapeless")
                .save(consumer);

        ShapelessRecipeBuilder
                .shapeless(BlockList.ZINC_INGOT.get(),9)
                .requires(ItemTagRegistry.ZINC_BLOCK_ITEM)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.ZINC_BLOCK_ITEM.get()))
                .group("shapeless")
                .save(consumer);

        ShapelessRecipeBuilder
                .shapeless(BlockList.ZINC_NUGGET.get(),9)
                .requires(ItemTagRegistry.ZINC_INGOT)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.ZINC_INGOT.get()))
                .group("shapeless")
                .save(consumer);

        ShapelessRecipeBuilder
                .shapeless(BlockList.BRONZE_INGOT.get(),9)
                .requires(ItemTagRegistry.BRONZE_BLOCK_ITEM)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.BRONZE_BLOCK_ITEM.get()))
                .group("shapeless")
                .save(consumer);

        ShapelessRecipeBuilder
                .shapeless(BlockList.BRONZE_NUGGET.get(),9)
                .requires(ItemTagRegistry.BRONZE_INGOT)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.BRONZE_INGOT.get()))
                .group("shapeless")
                .save(consumer);

        ShapelessRecipeBuilder
                .shapeless(BlockList.CONSTANTAN_INGOT.get(),9)
                .requires(ItemTagRegistry.CONSTANTAN_BLOCK_ITEM)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.CONSTANTAN_BLOCK_ITEM.get()))
                .group("shapeless")
                .save(consumer);

        ShapelessRecipeBuilder
                .shapeless(BlockList.CONSTANTAN_NUGGET.get(),9)
                .requires(ItemTagRegistry.CONSTANTAN_INGOT)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.CONSTANTAN_INGOT.get()))
                .group("shapeless")
                .save(consumer);

        ShapelessRecipeBuilder
                .shapeless(BlockList.ELECTRUM_INGOT.get(),9)
                .requires(ItemTagRegistry.ELECTRUM_BLOCK_ITEM)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.ELECTRUM_BLOCK_ITEM.get()))
                .group("shapeless")
                .save(consumer);

        ShapelessRecipeBuilder
                .shapeless(BlockList.ELECTRUM_NUGGET.get(),9)
                .requires(ItemTagRegistry.ELECTRUM_INGOT)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.ELECTRUM_INGOT.get()))
                .group("shapeless")
                .save(consumer);

        ShapelessRecipeBuilder
                .shapeless(BlockList.ENDERIUM_INGOT.get(),9)
                .requires(ItemTagRegistry.ENDERIUM_BLOCK_ITEM)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.ENDERIUM_BLOCK_ITEM.get()))
                .group("shapeless")
                .save(consumer);

        ShapelessRecipeBuilder
                .shapeless(BlockList.ENDERIUM_NUGGET.get(),9)
                .requires(ItemTagRegistry.ENDERIUM_INGOT)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.ENDERIUM_INGOT.get()))
                .group("shapeless")
                .save(consumer);

        ShapelessRecipeBuilder
                .shapeless(BlockList.INVAR_INGOT.get(),9)
                .requires(ItemTagRegistry.INVAR_BLOCK_ITEM)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.INVAR_BLOCK_ITEM.get()))
                .group("shapeless")
                .save(consumer);

        ShapelessRecipeBuilder
                .shapeless(BlockList.INVAR_NUGGET.get(),9)
                .requires(ItemTagRegistry.INVAR_INGOT)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.INVAR_INGOT.get()))
                .group("shapeless")
                .save(consumer);

        ShapelessRecipeBuilder
                .shapeless(BlockList.LUMIUM_INGOT.get(),9)
                .requires(ItemTagRegistry.LUMIUM_BLOCK_ITEM)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.LUMIUM_BLOCK_ITEM.get()))
                .group("shapeless")
                .save(consumer);

        ShapelessRecipeBuilder
                .shapeless(BlockList.LUMIUM_NUGGET.get(),9)
                .requires(ItemTagRegistry.LUMIUM_INGOT)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.LUMIUM_INGOT.get()))
                .group("shapeless")
                .save(consumer);

        ShapelessRecipeBuilder
                .shapeless(BlockList.SIGNALUM_INGOT.get(),9)
                .requires(ItemTagRegistry.SIGNALUM_BLOCK_ITEM)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.SIGNALUM_BLOCK_ITEM.get()))
                .group("shapeless")
                .save(consumer);

        ShapelessRecipeBuilder
                .shapeless(BlockList.SIGNALUM_NUGGET.get(),9)
                .requires(ItemTagRegistry.SIGNALUM_INGOT)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.SIGNALUM_INGOT.get()))
                .group("shapeless")
                .save(consumer);

        ShapelessRecipeBuilder
                .shapeless(BlockList.STEEL_INGOT.get(),9)
                .requires(ItemTagRegistry.STEEL_BLOCK_ITEM)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.STEEL_BLOCK_ITEM.get()))
                .group("shapeless")
                .save(consumer);

        ShapelessRecipeBuilder
                .shapeless(BlockList.STEEL_NUGGET.get(),9)
                .requires(ItemTagRegistry.STEEL_INGOT)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.STEEL_INGOT.get()))
                .group("shapeless")
                .save(consumer);

        CookingRecipeBuilder
                .smelting(Ingredient.of(BlockList.ALUMINUM_RAW.get()),BlockList.ALUMINUM_INGOT.get(),0.15f,200)
                .blasting(Ingredient.of(BlockList.ALUMINUM_RAW.get()),BlockList.ALUMINUM_INGOT.get(),0.15f,200)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.ALUMINUM_RAW.get()))
                .save(consumer);

        CookingRecipeBuilder
                .smelting(Ingredient.of(BlockList.LEAD_RAW.get()),BlockList.LEAD_INGOT.get(),0.15f,200)
                .blasting(Ingredient.of(BlockList.LEAD_RAW.get()),BlockList.LEAD_INGOT.get(),0.15f,200)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.LEAD_RAW.get()))
                .save(consumer);

        CookingRecipeBuilder
                .smelting(Ingredient.of(BlockList.OSMIUM_RAW.get()),BlockList.OSMIUM_INGOT.get(),0.15f,200)
                .blasting(Ingredient.of(BlockList.OSMIUM_RAW.get()),BlockList.OSMIUM_INGOT.get(),0.15f,200)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.OSMIUM_RAW.get()))
                .save(consumer);

        CookingRecipeBuilder
                .smelting(Ingredient.of(BlockList.NICKEL_RAW.get()),BlockList.NICKEL_INGOT.get(),0.15f,200)
                .blasting(Ingredient.of(BlockList.NICKEL_RAW.get()),BlockList.NICKEL_INGOT.get(),0.15f,200)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.NICKEL_RAW.get()))
                .save(consumer);

        CookingRecipeBuilder
                .smelting(Ingredient.of(BlockList.PLATINUM_RAW.get()),BlockList.PLATINUM_INGOT.get(),0.15f,200)
                .blasting(Ingredient.of(BlockList.PLATINUM_RAW.get()),BlockList.PLATINUM_INGOT.get(),0.15f,200)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.PLATINUM_RAW.get()))
                .save(consumer);

        CookingRecipeBuilder
                .smelting(Ingredient.of(BlockList.SILVER_RAW.get()),BlockList.SILVER_INGOT.get(),0.15f,200)
                .blasting(Ingredient.of(BlockList.SILVER_RAW.get()),BlockList.SILVER_INGOT.get(),0.15f,200)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.SILVER_RAW.get()))
                .save(consumer);

        CookingRecipeBuilder
                .smelting(Ingredient.of(BlockList.TIN_RAW.get()),BlockList.TIN_INGOT.get(),0.15f,200)
                .blasting(Ingredient.of(BlockList.TIN_RAW.get()),BlockList.TIN_INGOT.get(),0.15f,200)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.TIN_RAW.get()))
                .save(consumer);

        CookingRecipeBuilder
                .smelting(Ingredient.of(BlockList.URANIUM_RAW.get()),BlockList.URANIUM_INGOT.get(),0.15f,200)
                .blasting(Ingredient.of(BlockList.URANIUM_RAW.get()),BlockList.URANIUM_INGOT.get(),0.15f,200)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.URANIUM_RAW.get()))
                .save(consumer);

        CookingRecipeBuilder
                .smelting(Ingredient.of(BlockList.ZINC_RAW.get()),BlockList.ZINC_INGOT.get(),0.15f,200)
                .blasting(Ingredient.of(BlockList.ZINC_RAW.get()),BlockList.ZINC_INGOT.get(),0.15f,200)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.ZINC_RAW.get()))
                .save(consumer);

    }
}

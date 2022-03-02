package net.allthemods.alltheores.datagen.server;

import net.allthemods.alltheores.blocks.BlockList;
import net.allthemods.alltheores.datagen.builder.ShapedBlockBuilder;
import net.allthemods.alltheores.datagen.builder.ShapedIngotBuilder;
import net.allthemods.alltheores.datagen.builder.ShapedRawBuilder;
import net.allthemods.alltheores.infos.ItemTagRegistry;
import net.allthemods.alltheores.infos.Reference;
import net.minecraft.data.*;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.Tags;

import java.util.function.Consumer;

public class CraftingRecipes extends RecipeProvider {
    public CraftingRecipes(DataGenerator generatorIn) {
        super(generatorIn);
    }

    private ShapedRecipeBuilder shaped(ItemLike provider) {
        return ShapedRecipeBuilder.shaped(provider)
            .group(Reference.MOD_ID);
    }


    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {
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

        shaped(Items.COPPER_INGOT)
                .pattern("nnn")
                .pattern("nnn")
                .pattern("nnn")
                .define('n',ItemTagRegistry.COPPER_NUGGET)
                .unlockedBy("has_copper_nugget",has(BlockList.COPPER_NUGGET.get()))
                .save(consumer);

        shaped(BlockList.COPPER_ORE_HAMMER.get())
                .pattern(" gt")
                .pattern(" tg")
                .pattern("t  ")
                .define('g', Items.COPPER_BLOCK)
                .define('t', Items.STICK)
                .unlockedBy("has_copper_ingot", has(Items.COPPER_BLOCK))
                .save(consumer);

        shaped(BlockList.BRONZE_ORE_HAMMER.get())
                .pattern(" gt")
                .pattern(" tg")
                .pattern("t  ")
                .define('g', BlockList.BRONZE_BLOCK_ITEM.get())
                .define('t', Items.STICK)
                .unlockedBy("has_bronze_block", has(BlockList.BRONZE_BLOCK_ITEM.get()))
                .save(consumer);

        shaped(BlockList.IRON_ORE_HAMMER.get())
                .pattern(" gt")
                .pattern(" tg")
                .pattern("t  ")
                .define('g', Items.IRON_BLOCK)
                .define('t', Items.STICK)
                .unlockedBy("has_iron_block", has(Items.IRON_BLOCK))
                .save(consumer);

        shaped(BlockList.INVAR_ORE_HAMMER.get())
                .pattern(" gt")
                .pattern(" tg")
                .pattern("t  ")
                .define('g', BlockList.INVAR_BLOCK_ITEM.get())
                .define('t', Items.STICK)
                .unlockedBy("has_invar_block", has(BlockList.INVAR_BLOCK_ITEM.get()))
                .save(consumer);

        shaped(BlockList.PLATINUM_ORE_HAMMER.get())
                .pattern(" gt")
                .pattern(" tg")
                .pattern("t  ")
                .define('g', BlockList.PLATINUM_BLOCK_ITEM.get())
                .define('t', Items.STICK)
                .unlockedBy("has_platinum_block", has(BlockList.PLATINUM_BLOCK_ITEM.get()))
                .save(consumer);

        ShapedRawBuilder.builder(ItemTagRegistry.RAW_ALUMINUM)
                .setRaw(BlockList.RAW_ALUMINUM_BLOCK_ITEM)
                .build(consumer);

        ShapedRawBuilder.builder(ItemTagRegistry.RAW_LEAD)
                .setRaw(BlockList.RAW_LEAD_BLOCK_ITEM)
                .build(consumer);

        ShapedRawBuilder.builder(ItemTagRegistry.RAW_NICKEL)
                .setRaw(BlockList.RAW_NICKEL_BLOCK_ITEM)
                .build(consumer);

        ShapedRawBuilder.builder(ItemTagRegistry.RAW_OSMIUM)
                .setRaw(BlockList.RAW_OSMIUM_BLOCK_ITEM)
                .build(consumer);

        ShapedRawBuilder.builder(ItemTagRegistry.RAW_PLATINUM)
                .setRaw(BlockList.RAW_PLATINUM_BLOCK_ITEM)
                .build(consumer);

        ShapedRawBuilder.builder(ItemTagRegistry.RAW_SILVER)
                .setRaw(BlockList.RAW_SILVER_BLOCK_ITEM)
                .build(consumer);

        ShapedRawBuilder.builder(ItemTagRegistry.RAW_TIN)
                .setRaw(BlockList.RAW_TIN_BLOCK_ITEM)
                .build(consumer);

        ShapedRawBuilder.builder(ItemTagRegistry.RAW_URANIUM)
                .setRaw(BlockList.RAW_URANIUM_BLOCK_ITEM)
                .build(consumer);

        ShapedRawBuilder.builder(ItemTagRegistry.RAW_ZINC)
                .setRaw(BlockList.RAW_ZINC_BLOCK_ITEM)
                .build(consumer);

        ShapedBlockBuilder.builder(ItemTagRegistry.COPPER_INGOT)
                .setGear(BlockList.COPPER_GEAR)
                .setPlate(BlockList.COPPER_PLATE)
                .setRod(BlockList.COPPER_ROD)
                .build(consumer);

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

        ShapedBlockBuilder.builder(ItemTagRegistry.BRASS_INGOT)
                .setBlock(BlockList.BRASS_BLOCK_ITEM)
                .setGear(BlockList.BRASS_GEAR)
                .setPlate(BlockList.BRASS_PLATE)
                .setRod(BlockList.BRASS_ROD)
                .build(consumer);


    }
}

package net.allthemods.alltheores.datagen.server;

import net.allthemods.alltheores.blocks.BlockList;
import net.allthemods.alltheores.datagen.builder.ShapedBlockBuilder;
import net.allthemods.alltheores.infos.ItemTagRegistry;
import net.allthemods.alltheores.infos.Reference;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.RecipeProvider;
import net.minecraft.data.ShapedRecipeBuilder;
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



    }
}

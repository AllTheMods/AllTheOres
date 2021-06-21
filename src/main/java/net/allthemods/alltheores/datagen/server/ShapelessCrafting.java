package net.allthemods.alltheores.datagen.server;

import net.allthemods.alltheores.blocks.BlockList;
import net.allthemods.alltheores.infos.ItemTagRegistry;
import net.allthemods.alltheores.infos.Reference;
import net.minecraft.data.*;
import net.minecraft.util.ResourceLocation;

import java.io.IOException;
import java.nio.file.Path;
import java.util.function.Consumer;

public class ShapelessCrafting extends RecipeProvider {

private ResourceLocation recipeDir(String typeIn, String typeOut) {
    return new ResourceLocation(Reference.MOD_ID,typeIn + "_from_" + typeOut);
}
    @Override
    protected void buildShapelessRecipes(Consumer<IFinishedRecipe> consumer) {

        final String hasCondition = "has_item";




        ShapelessRecipeBuilder
                .shapeless(BlockList.ALUMINUM_INGOT.get(),9)
                .requires(ItemTagRegistry.ALUMINUM_BLOCK_ITEM)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.ALUMINUM_BLOCK_ITEM.get()))
                .save(consumer,recipeDir("aluminum_ingot","block"));

        ShapelessRecipeBuilder
                .shapeless(BlockList.ALUMINUM_NUGGET.get(),9)
                .requires(ItemTagRegistry.ALUMINUM_INGOT)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.ALUMINUM_INGOT.get()))
                .save(consumer,recipeDir("aluminum_nugget","ingot"));

        ShapelessRecipeBuilder
                .shapeless(BlockList.LEAD_INGOT.get(),9)
                .requires(ItemTagRegistry.LEAD_BLOCK_ITEM)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.LEAD_BLOCK_ITEM.get()))
                .save(consumer,recipeDir("lead_ingot","block"));

        ShapelessRecipeBuilder
                .shapeless(BlockList.LEAD_NUGGET.get(),9)
                .requires(ItemTagRegistry.LEAD_INGOT)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.LEAD_INGOT.get()))
                .save(consumer,recipeDir("lead_nugget","ingot"));

        ShapelessRecipeBuilder
                .shapeless(BlockList.OSMIUM_INGOT.get(),9)
                .requires(ItemTagRegistry.OSMIUM_BLOCK_ITEM)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.OSMIUM_BLOCK_ITEM.get()))
                .save(consumer,recipeDir("osmium_ingot","block"));

        ShapelessRecipeBuilder
                .shapeless(BlockList.OSMIUM_NUGGET.get(),9)
                .requires(ItemTagRegistry.OSMIUM_INGOT)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.OSMIUM_INGOT.get()))
                .save(consumer,recipeDir("osmium_nugget","ingot"));

        ShapelessRecipeBuilder
                .shapeless(BlockList.NICKEL_INGOT.get(),9)
                .requires(ItemTagRegistry.NICKEL_BLOCK_ITEM)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.NICKEL_BLOCK_ITEM.get()))
                .save(consumer,recipeDir("nickel_ingot","block"));

        ShapelessRecipeBuilder
                .shapeless(BlockList.NICKEL_NUGGET.get(),9)
                .requires(ItemTagRegistry.NICKEL_INGOT)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.NICKEL_INGOT.get()))
                .save(consumer,recipeDir("nickel_nugget","ingot"));

        ShapelessRecipeBuilder
                .shapeless(BlockList.PLATINUM_INGOT.get(),9)
                .requires(ItemTagRegistry.PLATINUM_BLOCK_ITEM)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.PLATINUM_BLOCK_ITEM.get()))
                .save(consumer,recipeDir("platinum_ingot","block"));

        ShapelessRecipeBuilder
                .shapeless(BlockList.PLATINUM_NUGGET.get(),9)
                .requires(ItemTagRegistry.PLATINUM_INGOT)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.PLATINUM_INGOT.get()))
                .save(consumer,recipeDir("platinum_nugget","ingot"));

        ShapelessRecipeBuilder
                .shapeless(BlockList.SILVER_INGOT.get(),9)
                .requires(ItemTagRegistry.SILVER_BLOCK_ITEM)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.SILVER_BLOCK_ITEM.get()))
                .save(consumer,recipeDir("silver_ingot","block"));

        ShapelessRecipeBuilder
                .shapeless(BlockList.SILVER_NUGGET.get(),9)
                .requires(ItemTagRegistry.SILVER_INGOT)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.SILVER_INGOT.get()))
                .save(consumer,recipeDir("silver_nugget","ingot"));

        ShapelessRecipeBuilder
                .shapeless(BlockList.TIN_INGOT.get(),9)
                .requires(ItemTagRegistry.TIN_BLOCK_ITEM)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.TIN_BLOCK_ITEM.get()))
                .save(consumer,recipeDir("tin_ingot","block"));

        ShapelessRecipeBuilder
                .shapeless(BlockList.TIN_NUGGET.get(),9)
                .requires(ItemTagRegistry.TIN_INGOT)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.TIN_INGOT.get()))
                .save(consumer,recipeDir("tin_nugget","ingot"));

        ShapelessRecipeBuilder
                .shapeless(BlockList.URANIUM_INGOT.get(),9)
                .requires(ItemTagRegistry.URANIUM_BLOCK_ITEM)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.URANIUM_BLOCK_ITEM.get()))
                .save(consumer,recipeDir("uranium_ingot","block"));

        ShapelessRecipeBuilder
                .shapeless(BlockList.URANIUM_NUGGET.get(),9)
                .requires(ItemTagRegistry.URANIUM_INGOT)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.URANIUM_INGOT.get()))
                .save(consumer,recipeDir("uranium_nugget","ingot"));

        ShapelessRecipeBuilder
                .shapeless(BlockList.ZINC_INGOT.get(),9)
                .requires(ItemTagRegistry.ZINC_BLOCK_ITEM)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.ZINC_BLOCK_ITEM.get()))
                .save(consumer,recipeDir("zinc_ingot","block"));

        ShapelessRecipeBuilder
                .shapeless(BlockList.ZINC_NUGGET.get(),9)
                .requires(ItemTagRegistry.ZINC_INGOT)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.ZINC_INGOT.get()))
                .save(consumer,recipeDir("zinc_nugget","ingot"));

        ShapelessRecipeBuilder
                .shapeless(BlockList.BRONZE_INGOT.get(),9)
                .requires(ItemTagRegistry.BRONZE_BLOCK_ITEM)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.BRONZE_BLOCK_ITEM.get()))
                .save(consumer,recipeDir("bronze_ingot","block"));

        ShapelessRecipeBuilder
                .shapeless(BlockList.BRONZE_NUGGET.get(),9)
                .requires(ItemTagRegistry.BRONZE_INGOT)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.BRONZE_INGOT.get()))
                .save(consumer,recipeDir("bronze_nugget","ingot"));

        ShapelessRecipeBuilder
                .shapeless(BlockList.CONSTANTAN_INGOT.get(),9)
                .requires(ItemTagRegistry.CONSTANTAN_BLOCK_ITEM)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.CONSTANTAN_BLOCK_ITEM.get()))
                .save(consumer,recipeDir("constantan_ingot","block"));

        ShapelessRecipeBuilder
                .shapeless(BlockList.CONSTANTAN_NUGGET.get(),9)
                .requires(ItemTagRegistry.CONSTANTAN_INGOT)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.CONSTANTAN_INGOT.get()))
                .save(consumer,recipeDir("constantan_nugget","ingot"));

        ShapelessRecipeBuilder
                .shapeless(BlockList.ELECTRUM_INGOT.get(),9)
                .requires(ItemTagRegistry.ELECTRUM_BLOCK_ITEM)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.ELECTRUM_BLOCK_ITEM.get()))
                .save(consumer,recipeDir("electrum_ingot","block"));

        ShapelessRecipeBuilder
                .shapeless(BlockList.ELECTRUM_NUGGET.get(),9)
                .requires(ItemTagRegistry.ELECTRUM_INGOT)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.ELECTRUM_INGOT.get()))
                .save(consumer,recipeDir("electrum_nugget","ingot"));

        ShapelessRecipeBuilder
                .shapeless(BlockList.ENDERIUM_INGOT.get(),9)
                .requires(ItemTagRegistry.ENDERIUM_BLOCK_ITEM)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.ENDERIUM_BLOCK_ITEM.get()))
                .save(consumer,recipeDir("enderium_ingot","block"));

        ShapelessRecipeBuilder
                .shapeless(BlockList.ENDERIUM_NUGGET.get(),9)
                .requires(ItemTagRegistry.ENDERIUM_INGOT)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.ENDERIUM_INGOT.get()))
                .save(consumer,recipeDir("enderium_nugget","ingot"));

        ShapelessRecipeBuilder
                .shapeless(BlockList.INVAR_INGOT.get(),9)
                .requires(ItemTagRegistry.INVAR_BLOCK_ITEM)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.INVAR_BLOCK_ITEM.get()))
                .save(consumer,recipeDir("invar_ingot","block"));

        ShapelessRecipeBuilder
                .shapeless(BlockList.INVAR_NUGGET.get(),9)
                .requires(ItemTagRegistry.INVAR_INGOT)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.INVAR_INGOT.get()))
                .save(consumer,recipeDir("invar_nugget","ingot"));

        ShapelessRecipeBuilder
                .shapeless(BlockList.LUMIUM_INGOT.get(),9)
                .requires(ItemTagRegistry.LUMIUM_BLOCK_ITEM)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.LUMIUM_BLOCK_ITEM.get()))
                .save(consumer,recipeDir("lumium_ingot","block"));

        ShapelessRecipeBuilder
                .shapeless(BlockList.LUMIUM_NUGGET.get(),9)
                .requires(ItemTagRegistry.LUMIUM_INGOT)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.LUMIUM_INGOT.get()))
                .save(consumer,recipeDir("lumium_nugget","ingot"));

        ShapelessRecipeBuilder
                .shapeless(BlockList.SIGNALUM_INGOT.get(),9)
                .requires(ItemTagRegistry.SIGNALUM_BLOCK_ITEM)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.SIGNALUM_BLOCK_ITEM.get()))
                .save(consumer,recipeDir("signalum_ingot","block"));

        ShapelessRecipeBuilder
                .shapeless(BlockList.SIGNALUM_NUGGET.get(),9)
                .requires(ItemTagRegistry.SIGNALUM_INGOT)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.SIGNALUM_INGOT.get()))
                .save(consumer,recipeDir("signalum_nugget","ingot"));

        ShapelessRecipeBuilder
                .shapeless(BlockList.STEEL_INGOT.get(),9)
                .requires(ItemTagRegistry.STEEL_BLOCK_ITEM)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.STEEL_BLOCK_ITEM.get()))
                .save(consumer,recipeDir("steel_ingot","block"));

        ShapelessRecipeBuilder
                .shapeless(BlockList.STEEL_NUGGET.get(),9)
                .requires(ItemTagRegistry.STEEL_INGOT)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.STEEL_INGOT.get()))
                .save(consumer,recipeDir("steel_nugget","ingot"));

    }

    public ShapelessCrafting(DataGenerator generatorIn) {
        super(generatorIn);
    }
}

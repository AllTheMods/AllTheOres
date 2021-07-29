package net.allthemods.alltheores.datagen.server;

import net.allthemods.alltheores.blocks.BlockList;
import net.allthemods.alltheores.infos.Reference;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Consumer;

public class BlastingRecipes extends RecipeProvider {
    public BlastingRecipes(DataGenerator generator) {
        super(generator);
    }
    private ResourceLocation recipeDir(String typeIn, String typeOut) {
        return new ResourceLocation(Reference.MOD_ID,typeIn + "_from_" + typeOut + "_blasting");
    }
    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {

        final String hasCondition = "has_item";

        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(BlockList.ALUMINUM_RAW.get()),BlockList.ALUMINUM_INGOT.get(),0.15f,100)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.ALUMINUM_RAW.get()))
                .save(consumer,recipeDir("aluminum_ingot","raw"));

        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(BlockList.LEAD_RAW.get()),BlockList.LEAD_INGOT.get(),0.15f,100)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.LEAD_RAW.get()))
                .save(consumer,recipeDir("lead_ingot","raw"));

        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(BlockList.OSMIUM_RAW.get()),BlockList.OSMIUM_INGOT.get(),0.15f,100)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.OSMIUM_RAW.get()))
                .save(consumer,recipeDir("osmium_ingot","raw"));

        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(BlockList.NICKEL_RAW.get()),BlockList.NICKEL_INGOT.get(),0.15f,100)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.NICKEL_RAW.get()))
                .save(consumer,recipeDir("nickel_ingot","raw"));

        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(BlockList.PLATINUM_RAW.get()),BlockList.PLATINUM_INGOT.get(),0.15f,100)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.PLATINUM_RAW.get()))
                .save(consumer,recipeDir("platinum_ingot","raw"));

        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(BlockList.SILVER_RAW.get()),BlockList.SILVER_INGOT.get(),0.15f,100)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.SILVER_RAW.get()))
                .save(consumer,recipeDir("silver_ingot","raw"));

        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(BlockList.TIN_RAW.get()),BlockList.TIN_INGOT.get(),0.15f,100)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.TIN_RAW.get()))
                .save(consumer,recipeDir("tin_ingot","raw"));

        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(BlockList.URANIUM_RAW.get()),BlockList.URANIUM_INGOT.get(),0.15f,100)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.URANIUM_RAW.get()))
                .save(consumer,recipeDir("uranium_ingot","raw"));

        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(BlockList.ZINC_RAW.get()),BlockList.ZINC_INGOT.get(),0.15f,100)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.ZINC_RAW.get()))
                .save(consumer,recipeDir("zinc_ingot","raw"));

        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(BlockList.ALUMINUM_ORE.get()),BlockList.ALUMINUM_INGOT.get(),0.15f,200)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.ALUMINUM_ORE.get()))
                .save(consumer,recipeDir("aluminum_ingot","ore"));

        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(BlockList.LEAD_ORE.get()),BlockList.LEAD_INGOT.get(),0.15f,200)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.LEAD_ORE.get()))
                .save(consumer,recipeDir("lead_ingot","ore"));

        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(BlockList.OSMIUM_ORE.get()),BlockList.OSMIUM_INGOT.get(),0.15f,200)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.OSMIUM_ORE.get()))
                .save(consumer,recipeDir("osmium_ingot","ore"));

        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(BlockList.NICKEL_ORE.get()),BlockList.NICKEL_INGOT.get(),0.15f,200)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.NICKEL_ORE.get()))
                .save(consumer,recipeDir("nickel_ingot","ore"));

        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(BlockList.PLATINUM_ORE.get()),BlockList.PLATINUM_INGOT.get(),0.15f,200)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.PLATINUM_ORE.get()))
                .save(consumer,recipeDir("platinum_ingot","ore"));

        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(BlockList.SILVER_ORE.get()),BlockList.SILVER_INGOT.get(),0.15f,200)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.SILVER_ORE.get()))
                .save(consumer,recipeDir("silver_ingot","ore"));

        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(BlockList.TIN_ORE.get()),BlockList.TIN_INGOT.get(),0.15f,200)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.TIN_ORE.get()))
                .save(consumer,recipeDir("tin_ingot","ore"));

        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(BlockList.URANIUM_ORE.get()),BlockList.URANIUM_INGOT.get(),0.15f,200)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.URANIUM_ORE.get()))
                .save(consumer,recipeDir("uranium_ingot","ore"));

        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(BlockList.ZINC_ORE.get()),BlockList.ZINC_INGOT.get(),0.15f,200)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.ZINC_ORE.get()))
                .save(consumer,recipeDir("zinc_ingot","ore"));


        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(BlockList.ALUMINUM_SLATE_ORE.get()),BlockList.ALUMINUM_INGOT.get(),0.15f,200)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.ALUMINUM_SLATE_ORE.get()))
                .save(consumer,recipeDir("aluminum_ingot","slate_ore"));

        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(BlockList.LEAD_SLATE_ORE.get()),BlockList.LEAD_INGOT.get(),0.15f,200)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.LEAD_SLATE_ORE.get()))
                .save(consumer,recipeDir("lead_ingot","slate_ore"));

        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(BlockList.OSMIUM_SLATE_ORE.get()),BlockList.OSMIUM_INGOT.get(),0.15f,200)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.OSMIUM_SLATE_ORE.get()))
                .save(consumer,recipeDir("osmium_ingot","slate_ore"));

        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(BlockList.NICKEL_SLATE_ORE.get()),BlockList.NICKEL_INGOT.get(),0.15f,200)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.NICKEL_SLATE_ORE.get()))
                .save(consumer,recipeDir("nickel_ingot","slate_ore"));

        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(BlockList.PLATINUM_SLATE_ORE.get()),BlockList.PLATINUM_INGOT.get(),0.15f,200)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.PLATINUM_SLATE_ORE.get()))
                .save(consumer,recipeDir("platinum_ingot","slate_ore"));

        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(BlockList.SILVER_SLATE_ORE.get()),BlockList.SILVER_INGOT.get(),0.15f,200)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.SILVER_SLATE_ORE.get()))
                .save(consumer,recipeDir("silver_ingot","slate_ore"));

        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(BlockList.TIN_SLATE_ORE.get()),BlockList.TIN_INGOT.get(),0.15f,200)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.TIN_SLATE_ORE.get()))
                .save(consumer,recipeDir("tin_ingot","slate_ore"));

        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(BlockList.URANIUM_SLATE_ORE.get()),BlockList.URANIUM_INGOT.get(),0.15f,200)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.URANIUM_SLATE_ORE.get()))
                .save(consumer,recipeDir("uranium_ingot","slate_ore"));

        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(BlockList.ZINC_SLATE_ORE.get()),BlockList.ZINC_INGOT.get(),0.15f,200)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.ZINC_SLATE_ORE.get()))
                .save(consumer,recipeDir("zinc_ingot","slate_ore"));


    }
}

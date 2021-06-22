package net.allthemods.alltheores.datagen.server;

import net.allthemods.alltheores.infos.Reference;
import net.minecraft.data.CookingRecipeBuilder;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.RecipeProvider;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;

import java.util.function.Consumer;

public class BlastingRecipes extends RecipeProvider {
    public BlastingRecipes(DataGenerator generator) {
        super(generator);
    }

    private ResourceLocation res(String format, String groupName) {
        return new ResourceLocation(Reference.MOD_ID, String.format(format, groupName));
    }

    @Override
    protected void buildShapelessRecipes(Consumer<IFinishedRecipe> consumer) {
        GroupHelper.applyToOre(group -> {
            CookingRecipeBuilder
                    .blasting(Ingredient.of(group.RAW.get()), group.INGOT.get(), 0.15f, 100)
                    .unlockedBy("has_raw", RecipeProvider.has(group.RAW.get()))
                    .save(consumer, res("blasting/%s_ingot_from_raw", group.name));

            CookingRecipeBuilder
                    .blasting(Ingredient.of(group.DUST_TAG), group.INGOT.get(), 0.15f, 100)
                    .unlockedBy("has_dust", RecipeProvider.has(group.DUST_TAG))
                    .save(consumer, res("blasting/%s_ingot_from_dust", group.name));
        });
    }
}

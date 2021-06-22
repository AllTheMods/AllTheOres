package net.allthemods.alltheores.datagen.server;

import net.allthemods.alltheores.infos.Reference;
import net.minecraft.data.CookingRecipeBuilder;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.RecipeProvider;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;

import java.util.function.Consumer;

public class SmeltingRecipes extends RecipeProvider {
    public SmeltingRecipes(DataGenerator generator) {
        super(generator);
    }

    private ResourceLocation res(String format, String groupName) {
        return new ResourceLocation(Reference.MOD_ID, String.format(format, groupName));
    }

    @Override
    protected void buildShapelessRecipes(Consumer<IFinishedRecipe> consumer) {
        GroupHelper.applyToOre(group -> {
            CookingRecipeBuilder
                    .smelting(Ingredient.of(group.RAW.get()), group.INGOT.get(), 0.15f, 200)
                    .unlockedBy("has_raw", RecipeProvider.has(group.RAW.get()))
                    .save(consumer, res("smelting/%s_ingot_from_raw", group.name));

            CookingRecipeBuilder
                    .smelting(Ingredient.of(group.DUST_TAG), group.INGOT.get(), 0.15f, 200)
                    .unlockedBy("has_dust", RecipeProvider.has(group.DUST_TAG))
                    .save(consumer, res("smelting/%s_ingot_from_dust", group.name));
        });
    }
}

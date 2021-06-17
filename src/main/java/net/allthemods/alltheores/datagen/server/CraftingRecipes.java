package net.allthemods.alltheores.datagen.server;

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
*/ /*
        ShapedArmorBuilder.builder(ItemTagRegistry.COPPER_INGOT)
            .setCore(TheGuide.TIER_1_CORE)
            .setHelmet(TheGuide.SPACE_HELM)
            .setChestplate(TheGuide.SPACE_CHEST)
            .setLeggings(TheGuide.SPACE_LEGGINGS)
            .setBoots(TheGuide.SPACE_BOOTS)
            .build(consumer);
*/

    }
}

package net.allthemods.alltheores.datagen.server;

import net.allthemods.alltheores.infos.Reference;
import net.allthemods.alltheores.registry.AlloyRegistryGroup;
import net.allthemods.alltheores.registry.OreRegistryGroup;
import net.allthemods.alltheores.registry.VanillaRegistryGroup;
import net.minecraft.data.*;
import net.minecraft.item.Item;
import net.minecraft.tags.ITag;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.ResourceLocation;

import java.util.function.Consumer;

public class CraftingRecipes extends RecipeProvider {
    public CraftingRecipes(DataGenerator generatorIn) {
        super(generatorIn);
    }

    private ResourceLocation res(String format, String groupName) {
        return new ResourceLocation(Reference.MOD_ID, String.format(format, groupName));
    }

    private ShapedRecipeBuilder single(IItemProvider provider, ITag<Item> tag) {
        return ShapedRecipeBuilder.shaped(provider)
                .define('a', tag)
                .unlockedBy("has_item", RecipeProvider.has(tag));
    }

    private ShapedRecipeBuilder block(IItemProvider provider, ITag<Item> tag) {
        return single(provider, tag)
                .pattern("aaa")
                .pattern("aaa")
                .pattern("aaa");
    }

    private ShapedRecipeBuilder gear(IItemProvider provider, ITag<Item> tag) {
        return single(provider, tag)
                .pattern("aaa")
                .pattern("a a")
                .pattern("aaa");
    }
    private ShapedRecipeBuilder rod(IItemProvider provider, ITag<Item> tag) {
        return single(provider, tag)
                .pattern("a  ")
                .pattern("a  ")
                .pattern("a  ");
    }
    private ShapedRecipeBuilder plate(IItemProvider provider, ITag<Item> tag) {
        return single(provider, tag)
                .pattern("aa ")
                .pattern("aa ")
                .pattern("   ");
    }

    private void registerOreGroup(OreRegistryGroup group, Consumer<IFinishedRecipe> consumer) {
        registerAlloyGroup(group, consumer);

        ShapedRecipeBuilder.shaped(group.RAW_BLOCK_ITEM.get())
                .pattern("aaa")
                .pattern("aaa")
                .pattern("aaa")
                .define('a', group.RAW.get())
                .unlockedBy("has_item", RecipeProvider.has(group.RAW.get()))
                .save(consumer, res("shaped/raw_%s_block_from_raw", group.name));

        ShapelessRecipeBuilder
                .shapeless(group.RAW.get(), 9)
                .requires(group.RAW_BLOCK_ITEM.get())
                .unlockedBy("has_block", RecipeProvider.has(group.RAW_BLOCK_ITEM.get()))
                .save(consumer, res("shapeless/raw_%s_from_block", group.name));
    }

    private void registerAlloyGroup(AlloyRegistryGroup group, Consumer<IFinishedRecipe> consumer) {
        block(group.BLOCK_ITEM.get(), group.INGOT_TAG)
                .save(consumer, res("shaped/%s_block_from_ingot", group.name));

        gear(group.GEAR.get(), group.INGOT_TAG)
                .save(consumer, res("shaped/%s_gear_from_ingot", group.name));

        plate(group.PLATE.get(), group.INGOT_TAG)
                .save(consumer, res("shaped/%s_plate_from_ingot", group.name));

        rod(group.ROD.get(), group.INGOT_TAG)
                .save(consumer, res("shaped/%s_rod_from_ingot", group.name));

        // block to ingot
        ShapelessRecipeBuilder
                .shapeless(group.INGOT.get(), 9)
                .requires(group.BLOCK_ITEM_TAG)
                .unlockedBy("has_block", RecipeProvider.has(group.BLOCK_ITEM_TAG))
                .save(consumer, res("shapeless/%s_ingot_from_block", group.name));

        // nugget to ingot
        block(group.INGOT.get(), group.NUGGET_TAG)
                .save(consumer, res("shaped/%s_ingot_from_nugget", group.name));

        // ingot to nugget
        ShapelessRecipeBuilder
                .shapeless(group.NUGGET.get(), 9)
                .requires(group.INGOT_TAG)
                .unlockedBy("has_ingot", RecipeProvider.has(group.INGOT_TAG))
                .save(consumer, res("shapeless/%s_nugget_from_ingot", group.name));
    }

    private void registerVanillaGroup(VanillaRegistryGroup group, Consumer<IFinishedRecipe> consumer) {
        gear(group.GEAR.get(), group.MATERIAL_TAG)
                .save(consumer, res("shaped/%s_gear_from_ingot", group.name));

        plate(group.PLATE.get(), group.MATERIAL_TAG)
                .save(consumer, res("shaped/%s_plate_from_ingot", group.name));

        rod(group.ROD.get(), group.MATERIAL_TAG)
                .save(consumer, res("shaped/%s_rod_from_ingot", group.name));
    }

    @Override
    protected void buildShapelessRecipes(Consumer<IFinishedRecipe> consumer) {
        GroupHelper.applyToOre(group -> registerOreGroup(group, consumer));
        GroupHelper.applyToAlloy(group -> registerAlloyGroup(group, consumer));
        GroupHelper.applyToVanilla(group -> registerVanillaGroup(group, consumer));
    }
}

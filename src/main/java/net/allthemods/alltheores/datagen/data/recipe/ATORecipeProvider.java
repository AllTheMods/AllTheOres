package net.allthemods.alltheores.datagen.data.recipe;

import net.allthemods.alltheores.content.blocks.sets.ATOSetHelper;
import net.allthemods.alltheores.infos.Reference;
import net.allthemods.alltheores.registry.ATORegistry;
import net.allthemods.alltheores.registry.ATOTagRegistry;
import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.Tags;

import java.util.concurrent.CompletableFuture;

public class ATORecipeProvider extends RecipeProvider {

    public ATORecipeProvider(PackOutput packOutput, CompletableFuture<Provider> provider) {
        super(packOutput, provider);
    }

    private ResourceLocation smeltingRecipeDir(String type, String name) {
        return ResourceLocation.fromNamespaceAndPath(Reference.MOD_ID, "smelting/" + name + "/" + type + "_smelting");
    }

    private ResourceLocation blastingRecipeDir(String type, String name) {
        return ResourceLocation.fromNamespaceAndPath(Reference.MOD_ID, "smelting/" + name + "/" + type + "_blasting");
    }

    private ResourceLocation shapelessIORecipeDir(String typeIn, String name, String typeOut) {
        return ResourceLocation.fromNamespaceAndPath(Reference.MOD_ID, "crafting/" + name + "/" + typeOut + "_from_" + typeIn);
    }

    private ResourceLocation shapelessRecipeDir(String name, String type) {
        return ResourceLocation.fromNamespaceAndPath(Reference.MOD_ID, "crafting/" + name + "/" + type);
    }

    private ResourceLocation hammerRecipeDir(String typeIn, String name, String typeOut) {
        return ResourceLocation.fromNamespaceAndPath(Reference.MOD_ID, "crafting/hammer/" + name + "/" + typeOut + "_from_" + typeIn);
    }

    private ShapedRecipeBuilder compress(TagKey<Item> tag, Item output) {
        return ShapedRecipeBuilder.shaped(RecipeCategory.MISC, output)
                .pattern("aaa")
                .pattern("aaa")
                .pattern("aaa")
                .define('a', tag);
    }

    private ShapelessRecipeBuilder uncompress(TagKey<Item> tag, Item output) {
        return ShapelessRecipeBuilder
                .shapeless(RecipeCategory.MISC, output, 9)
                .requires(tag);
    }

    private ShapedRecipeBuilder gear(TagKey<Item> tag, Item output) {
        return ShapedRecipeBuilder.shaped(RecipeCategory.MISC, output)
                .pattern(" a ")
                .pattern("ana")
                .pattern(" a ")
                .define('a', tag)
                .define('n', Tags.Items.NUGGETS_IRON);
    }

    private ShapedRecipeBuilder rod(TagKey<Item> tag, Item output) {
        return ShapedRecipeBuilder.shaped(RecipeCategory.MISC, output)
                .pattern("   ")
                .pattern("  a")
                .pattern("ha ")
                .define('a', tag)
                .define('h', ATOTagRegistry.ORE_HAMMERS);
    }

    private ShapedRecipeBuilder plate(TagKey<Item> tag, Item output) {
        return ShapedRecipeBuilder.shaped(RecipeCategory.MISC, output)
                .pattern("   ")
                .pattern("ha ")
                .pattern("a  ")
                .define('a', tag)
                .define('h', ATOTagRegistry.ORE_HAMMERS);
    }

    private ShapelessRecipeBuilder hammer(TagKey<Item> tag, int amount, Item output) {
        return ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, output, amount)
                .requires(ATOTagRegistry.ORE_HAMMERS)
                .requires(tag)
                .unlockedBy("has_hammer", has(ATOTagRegistry.ORE_HAMMERS));
    }

    private ShapedRecipeBuilder hammerBuilder(TagKey<Item> tag, Item output) {
        return ShapedRecipeBuilder.shaped(RecipeCategory.MISC, output)
                .pattern(" as")
                .pattern(" sa")
                .pattern("s  ")
                .define('a', tag)
                .define('s', Tags.Items.RODS_WOODEN);
    }

    private SimpleCookingRecipeBuilder blasting(TagKey<Item> tag, Item output) {
        return SimpleCookingRecipeBuilder.blasting(Ingredient.of(tag), RecipeCategory.MISC, output, 0.7f, 100);
    }

    private SimpleCookingRecipeBuilder smelting(TagKey<Item> tag, Item output) {
        return SimpleCookingRecipeBuilder.smelting(Ingredient.of(tag), RecipeCategory.MISC, output, 0.7f, 200);
    }


    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {

        ATOSetHelper.applyToVanillaIngot(set -> {

            // ##### Hammer #####

            // Hammer + Ore -> 2x Dust
            hammer(set.ORE_BLOCK_ITEM_TAG, 2, set.DUST.get()).save(recipeOutput, hammerRecipeDir("ore", set.name, "dust"));
            // Hammer + Raw -> 2x Dust
            hammer(set.RAW_TAG, 2, set.DUST.get()).save(recipeOutput, hammerRecipeDir("raw", set.name, "dust"));
            // Hammer + Ingot -> Dust
            hammer(set.INGOT_TAG, 1, set.DUST.get()).save(recipeOutput, hammerRecipeDir("ingot", set.name, "dust"));

            // ##### Smelting #####

            // Dust -> Ingot
            smelting(set.DUST_TAG, set.INGOT)
                    .unlockedBy(String.format("has_%s_dust", set.name), has(set.DUST_TAG))
                    .save(recipeOutput, smeltingRecipeDir("dust", set.name));
            blasting(set.DUST_TAG, set.INGOT)
                    .unlockedBy(String.format("has_%s_dust", set.name), has(set.DUST_TAG))
                    .save(recipeOutput, blastingRecipeDir("dust", set.name));

            // ##### Crafting #####

            // Gear
            gear(set.INGOT_TAG, set.GEAR.get())
                    .unlockedBy(String.format("has_%s_ingot", set.name), has(set.INGOT_TAG))
                    .save(recipeOutput, shapelessRecipeDir(set.name, "gear"));
            // Rod
            rod(set.INGOT_TAG, set.ROD.get())
                    .unlockedBy(String.format("has_%s_ingot", set.name), has(set.INGOT_TAG))
                    .save(recipeOutput, shapelessRecipeDir(set.name, "rod"));
            // Plate
            plate(set.INGOT_TAG, set.PLATE.get())
                    .unlockedBy(String.format("has_%s_ingot", set.name), has(set.INGOT_TAG))
                    .save(recipeOutput, shapelessRecipeDir(set.name, "plate"));
        });

        ATOSetHelper.applyToVanillaGem(set -> {

            // ##### Hammer #####

            // Hammer + Ore -> 2x Dust
            hammer(set.ORE_BLOCK_ITEM_TAG, 2, set.DUST.get()).save(recipeOutput, hammerRecipeDir("ore", set.name, "dust"));
            // Hammer + Gem -> Dust
            hammer(set.GEM_TAG, 1, set.DUST.get()).save(recipeOutput, hammerRecipeDir("gem", set.name, "dust"));

            // ##### Crafting #####

            // Gear
            gear(set.GEM_TAG, set.GEAR.get())
                    .unlockedBy(String.format("has_%s_gem", set.name), has(set.GEM_TAG))
                    .save(recipeOutput, shapelessRecipeDir(set.name, "gear"));
            // Rod
            rod(set.GEM_TAG, set.ROD.get())
                    .unlockedBy(String.format("has_%s_gem", set.name), has(set.GEM_TAG))
                    .save(recipeOutput, shapelessRecipeDir(set.name, "rod"));
            // Plate
            plate(set.GEM_TAG, set.PLATE.get())
                    .unlockedBy(String.format("has_%s_gem", set.name), has(set.GEM_TAG))
                    .save(recipeOutput, shapelessRecipeDir(set.name, "plate"));
        });

        ATOSetHelper.applyToVanillaDebris(set -> {

            // ##### Hammer #####

            // Hammer + Debris -> 2x Scrap
            hammer(set.DEBRIS_ITEM_TAG, 2, set.SCRAP).save(recipeOutput, hammerRecipeDir("debris", set.name, "scrap"));
            // Hammer + Ingot -> Dust
            hammer(set.INGOT_TAG, 1, set.DUST.get()).save(recipeOutput, hammerRecipeDir("ingot", set.name, "dust"));

            // ##### Smelting #####

            // Dust -> Ingot
            smelting(set.DUST_TAG, set.INGOT)
                    .unlockedBy(String.format("has_%s_dust", set.name), has(set.DUST_TAG))
                    .save(recipeOutput, smeltingRecipeDir("dust", set.name));
            blasting(set.DUST_TAG, set.INGOT)
                    .unlockedBy(String.format("has_%s_dust", set.name), has(set.DUST_TAG))
                    .save(recipeOutput, blastingRecipeDir("dust", set.name));

            // ##### Crafting #####

            // Gear
            gear(set.INGOT_TAG, set.GEAR.get())
                    .unlockedBy(String.format("has_%s_ingot", set.name), has(set.INGOT_TAG))
                    .save(recipeOutput, shapelessRecipeDir(set.name, "gear"));
            // Rod
            rod(set.INGOT_TAG, set.ROD.get())
                    .unlockedBy(String.format("has_%s_ingot", set.name), has(set.INGOT_TAG))
                    .save(recipeOutput, shapelessRecipeDir(set.name, "rod"));
            // Plate
            plate(set.INGOT_TAG, set.PLATE.get())
                    .unlockedBy(String.format("has_%s_ingot", set.name), has(set.INGOT_TAG))
                    .save(recipeOutput, shapelessRecipeDir(set.name, "plate"));
        });

        ATOSetHelper.applyToAlloy(set -> {

            // ##### Compressing #####

            // Ingot -> 9x Nugget
            uncompress(set.INGOT_TAG, set.NUGGET.get())
                    .unlockedBy(String.format("has_%s_ingot", set.name), has(set.INGOT_TAG))
                    .save(recipeOutput, shapelessIORecipeDir("ingot", set.name, "nugget"));
            // 9x Nugget -> Ingot
            compress(set.NUGGET_TAG, set.INGOT.get())
                    .unlockedBy(String.format("has_%s_nugget", set.name), has(set.NUGGET_TAG))
                    .save(recipeOutput, shapelessIORecipeDir("nugget", set.name, "ingot"));

            // Block -> 9x Ingot
            uncompress(set.BLOCK_ITEM_TAG, set.INGOT.get())
                    .unlockedBy(String.format("has_%s_block", set.name), has(set.BLOCK_ITEM_TAG))
                    .save(recipeOutput, shapelessIORecipeDir("block", set.name, "ingot"));
            // 9x Ingot -> Block
            compress(set.INGOT_TAG, set.BLOCK_ITEM.get())
                    .unlockedBy(String.format("has_%s_ingot", set.name), has(set.INGOT_TAG))
                    .save(recipeOutput, shapelessIORecipeDir("ingot", set.name, "block"));

            // ##### Hammer #####

            // Hammer + Ingot -> Dust
            hammer(set.INGOT_TAG, 1, set.DUST.get()).save(recipeOutput, hammerRecipeDir("ingot", set.name, "dust"));

            // ##### Crafting #####

            // Gear
            gear(set.INGOT_TAG, set.GEAR.get())
                    .unlockedBy(String.format("has_%s_ingot", set.name), has(set.INGOT_TAG))
                    .save(recipeOutput, shapelessRecipeDir(set.name, "gear"));
            // Rod
            rod(set.INGOT_TAG, set.ROD.get())
                    .unlockedBy(String.format("has_%s_ingot", set.name), has(set.INGOT_TAG))
                    .save(recipeOutput, shapelessRecipeDir(set.name, "rod"));
            // Plate
            plate(set.INGOT_TAG, set.PLATE.get())
                    .unlockedBy(String.format("has_%s_ingot", set.name), has(set.INGOT_TAG))
                    .save(recipeOutput, shapelessRecipeDir(set.name, "plate"));

            // ##### Smelting #####

            // Dust -> Ingot
            blasting(set.DUST_TAG, set.INGOT.get())
                    .unlockedBy(String.format("has_%s_dust", set.name), has(set.DUST_TAG))
                    .save(recipeOutput, blastingRecipeDir("dust", set.name));
            smelting(set.DUST_TAG, set.INGOT.get())
                    .unlockedBy(String.format("has_%s_dust", set.name), has(set.DUST_TAG))
                    .save(recipeOutput, smeltingRecipeDir("dust", set.name));
        });

        ATOSetHelper.applyToIngot(set -> {

            // ##### Compressing #####

            // Raw Block -> 9x Raw
            uncompress(set.RAW_BLOCK_ITEM_TAG, set.RAW.get())
                    .unlockedBy(String.format("has_%s_raw_block", set.name), has(set.RAW_BLOCK_ITEM_TAG))
                    .save(recipeOutput, shapelessIORecipeDir("raw", set.name, "raw_block"));
            // 9x Raw -> Raw Block
            compress(set.RAW_TAG, set.RAW_BLOCK_ITEM.get())
                    .unlockedBy(String.format("has_raw_%st", set.name), has(set.RAW_TAG))
                    .save(recipeOutput, shapelessIORecipeDir("raw_block", set.name, "raw"));

            // ##### Hammer #####

            // Hammer + Ore -> 2x Dust
            hammer(set.ORES.ORE_BLOCK_ITEM_TAG, 2, set.DUST.get()).save(recipeOutput, hammerRecipeDir("ore", set.name, "dust"));
            // Hammer + Raw -> 2x Dust
            hammer(set.RAW_TAG, 2, set.DUST.get()).save(recipeOutput, hammerRecipeDir("raw", set.name, "dust"));

            // ##### Smelting #####

            // Raw -> Ingot
            blasting(set.RAW_TAG, set.INGOT.get())
                    .unlockedBy(String.format("has_raw_%s", set.name), has(set.RAW_TAG))
                    .save(recipeOutput, blastingRecipeDir("raw", set.name));
            smelting(set.RAW_TAG, set.INGOT.get())
                    .unlockedBy(String.format("has_raw_%s", set.name), has(set.RAW_TAG))
                    .save(recipeOutput, smeltingRecipeDir("raw", set.name));

            // Raw Block -> Block
            blasting(set.RAW_BLOCK_ITEM_TAG, set.BLOCK_ITEM.get())
                    .unlockedBy(String.format("has_raw_%s_block", set.name), has(set.RAW_BLOCK_ITEM_TAG))
                    .save(recipeOutput, blastingRecipeDir("raw_block", set.name));
            smelting(set.RAW_BLOCK_ITEM_TAG, set.BLOCK_ITEM.get())
                    .unlockedBy(String.format("has_raw_%s_block", set.name), has(set.RAW_BLOCK_ITEM_TAG))
                    .save(recipeOutput, smeltingRecipeDir("raw_block", set.name));

            // Ore -> Ingot
            blasting(set.ORES.ORE_BLOCK_ITEM_TAG, set.INGOT.get())
                    .unlockedBy(String.format("has_%s_ore", set.name), has(set.ORES.ORE_BLOCK_ITEM_TAG))
                    .save(recipeOutput, blastingRecipeDir("ore", set.name));
            smelting(set.ORES.ORE_BLOCK_ITEM_TAG, set.INGOT.get())
                    .unlockedBy(String.format("has_%s_ore", set.name), has(set.ORES.ORE_BLOCK_ITEM_TAG))
                    .save(recipeOutput, smeltingRecipeDir("ore", set.name));
        });

        ATOSetHelper.applyToGem(set -> {

            // ##### Compressing #####

            // Block -> 9x Gem
            uncompress(set.BLOCK_ITEM_TAG, set.GEM.get())
                    .unlockedBy(String.format("has_%s_block", set.name), has(set.BLOCK_ITEM_TAG))
                    .save(recipeOutput, shapelessIORecipeDir("block", set.name, "gem"));
            // 9x Gem -> Block
            compress(set.GEM_TAG, set.BLOCK_ITEM.get())
                    .unlockedBy(String.format("has_%s", set.name), has(set.GEM_TAG))
                    .save(recipeOutput, shapelessIORecipeDir("gem", set.name, "block"));

            // ##### Hammer #####

            // Hammer + Ore -> 2x Gem
            hammer(set.ORES.ORE_BLOCK_ITEM_TAG, 2, set.GEM.get()).save(recipeOutput, hammerRecipeDir("ore", set.name, "gem"));
            // Hammer + Gem -> Dust
            hammer(set.GEM_TAG, 1, set.DUST.get()).save(recipeOutput, hammerRecipeDir("gem", set.name, "dust"));
        });

        ATOSetHelper.applyToDust(set -> {

            // ##### Compressing #####

            // Block -> 9x Dust
            uncompress(set.BLOCK_ITEM_TAG, set.DUST.get())
                    .unlockedBy(String.format("has_%s_block", set.name), has(set.BLOCK_ITEM_TAG))
                    .save(recipeOutput, shapelessIORecipeDir("block", set.name, "dust"));
            // 9x Dust -> Block
            compress(set.DUST_TAG, set.BLOCK_ITEM.get())
                    .unlockedBy(String.format("has_%s", set.name), has(set.DUST_TAG))
                    .save(recipeOutput, shapelessIORecipeDir("dust", set.name, "block"));

            // ##### Hammer #####

            // Hammer + Ore -> 2x Scrap
            hammer(set.ORES.ORE_BLOCK_ITEM_TAG, 2, set.DUST.get()).save(recipeOutput, hammerRecipeDir("ore", set.name, "dust"));

            // ##### Smelting #####

            // Ore -> Dust
            blasting(set.ORES.ORE_BLOCK_ITEM_TAG, set.DUST.get())
                    .unlockedBy(String.format("has_%s_ore", set.name), has(set.ORES.ORE_BLOCK_ITEM_TAG))
                    .save(recipeOutput, blastingRecipeDir("ore", set.name));
            smelting(set.ORES.ORE_BLOCK_ITEM_TAG, set.DUST.get())
                    .unlockedBy(String.format("has_%s_ore", set.name), has(set.ORES.ORE_BLOCK_ITEM_TAG))
                    .save(recipeOutput, smeltingRecipeDir("ore", set.name));
        });

        // ############# AllTheOres ###############

        // ##### Copper #####

        // 9x Nugget -> Ingot
        compress(ATOTagRegistry.COPPER_NUGGET, Items.COPPER_INGOT)
                .unlockedBy("has_copper_nugget", has(ATOTagRegistry.COPPER_NUGGET))
                .save(recipeOutput, shapelessIORecipeDir("nugget", "copper", "ingot"));
        // Ingot -> 9x Nugget
        uncompress(Tags.Items.INGOTS_COPPER, ATORegistry.COPPER_NUGGET.get())
                .unlockedBy("has_copper_ingot", has(Tags.Items.INGOTS_COPPER))
                .save(recipeOutput, shapelessIORecipeDir("ingot", "copper", "nugget"));

        // ##### Hammer #####

        // Copper Ore Hammer
        hammerBuilder(Tags.Items.STORAGE_BLOCKS_COPPER, ATORegistry.COPPER_ORE_HAMMER.get())
                .unlockedBy("has_copper_ingot", has(Tags.Items.INGOTS_COPPER))
                .save(recipeOutput);
        // Iron Ore Hammer
        hammerBuilder(Tags.Items.STORAGE_BLOCKS_IRON, ATORegistry.IRON_ORE_HAMMER.get())
                .unlockedBy("has_iron", has(Tags.Items.INGOTS_IRON))
                .save(recipeOutput);
        // Bronze Ore Hammer
        hammerBuilder(ATORegistry.BRONZE.BLOCK_ITEM_TAG, ATORegistry.BRONZE_ORE_HAMMER.get())
                .unlockedBy("has_bronze_ingot", has(ATORegistry.INVAR.INGOT_TAG))
                .save(recipeOutput);
        // Invar Ore Hammer
        hammerBuilder(ATORegistry.INVAR.BLOCK_ITEM_TAG, ATORegistry.INVAR_ORE_HAMMER.get())
                .unlockedBy("has_invar_ingot", has(ATORegistry.INVAR.INGOT_TAG))
                .save(recipeOutput);
        // Platinum Ore Hammer
        hammerBuilder(ATORegistry.PLATINUM.BLOCK_ITEM_TAG, ATORegistry.PLATINUM_ORE_HAMMER.get())
                .unlockedBy("has_platinum_ingot", has(ATORegistry.INVAR.INGOT_TAG))
                .save(recipeOutput);

        // ##### Alloy Blending #####

        ShapelessRecipeBuilder
                .shapeless(RecipeCategory.MISC, ATORegistry.INVAR.DUST.get(), 3)
                .requires(Ingredient.of(ATORegistry.IRON.DUST_TAG), 2)
                .requires(ATORegistry.NICKEL.DUST_TAG)
                .unlockedBy("has_hammer", has(ATOTagRegistry.ORE_HAMMERS))
                .save(recipeOutput, shapelessIORecipeDir("dust", "invar", "alloy_blending"));


        ShapelessRecipeBuilder
                .shapeless(RecipeCategory.MISC, ATORegistry.STEEL.DUST.get(), 1)
                .requires(Ingredient.of(ATORegistry.IRON.DUST_TAG), 1)
                .requires(Items.COAL, 4)
                .requires(ATOTagRegistry.ORE_HAMMERS)
                .unlockedBy("has_hammer", has(ATOTagRegistry.ORE_HAMMERS))
                .save(recipeOutput, shapelessIORecipeDir("dust", "steel", "alloy_blending"));

        ShapelessRecipeBuilder
                .shapeless(RecipeCategory.MISC, ATORegistry.ELECTRUM.DUST.get(), 2)
                .requires(ATORegistry.GOLD.DUST_TAG)
                .requires(ATORegistry.SILVER.DUST_TAG)
                .unlockedBy("has_hammer", has(ATOTagRegistry.ORE_HAMMERS))
                .save(recipeOutput, shapelessIORecipeDir("dust", "electrum", "alloy_blending"));

        ShapelessRecipeBuilder
                .shapeless(RecipeCategory.MISC, ATORegistry.BRONZE.DUST.get(), 4)
                .requires(Ingredient.of(ATORegistry.COPPER.DUST_TAG), 3)
                .requires(ATORegistry.TIN.DUST_TAG)
                .unlockedBy("has_hammer", has(ATOTagRegistry.ORE_HAMMERS))
                .save(recipeOutput, shapelessIORecipeDir("dust", "bronze", "alloy_blending"));

        ShapelessRecipeBuilder
                .shapeless(RecipeCategory.MISC, ATORegistry.BRASS.DUST.get(), 4)
                .requires(Ingredient.of(ATORegistry.COPPER.DUST_TAG), 3)
                .requires(ATORegistry.ZINC.DUST_TAG)
                .unlockedBy("has_hammer", has(ATOTagRegistry.ORE_HAMMERS))
                .save(recipeOutput, shapelessIORecipeDir("dust", "brass", "alloy_blending"));

        ShapelessRecipeBuilder
                .shapeless(RecipeCategory.MISC, ATORegistry.LUMIUM.DUST.get(), 4)
                .requires(Items.GLOWSTONE_DUST, 4)
                .requires(ATORegistry.SILVER.DUST_TAG)
                .requires(Ingredient.of(ATORegistry.TIN.DUST_TAG), 3)
                .unlockedBy("has_hammer", has(ATOTagRegistry.ORE_HAMMERS))
                .save(recipeOutput, shapelessIORecipeDir("dust", "lumium", "alloy_blending"));

        ShapelessRecipeBuilder
                .shapeless(RecipeCategory.MISC, ATORegistry.CONSTANTAN.DUST.get(), 2)
                .requires(ATORegistry.COPPER.DUST_TAG)
                .requires(ATORegistry.NICKEL.DUST_TAG)
                .unlockedBy("has_hammer", has(ATOTagRegistry.ORE_HAMMERS))
                .save(recipeOutput, shapelessIORecipeDir("dust", "constantan", "alloy_blending"));

        ShapelessRecipeBuilder
                .shapeless(RecipeCategory.MISC, ATORegistry.SIGNALUM.DUST.get(), 4)
                .requires(Ingredient.of(ATORegistry.COPPER.DUST_TAG), 3)
                .requires(ATORegistry.SILVER.DUST_TAG)
                .requires(Items.REDSTONE, 4)
                .unlockedBy("has_hammer", has(ATOTagRegistry.ORE_HAMMERS))
                .save(recipeOutput, shapelessIORecipeDir("dust", "signalum", "alloy_blending"));

        ShapelessRecipeBuilder
                .shapeless(RecipeCategory.MISC, ATORegistry.ENDERIUM.DUST.get(), 4)
                .requires(Ingredient.of(ATORegistry.LEAD.DUST_TAG), 3)
                .requires(ATORegistry.PLATINUM.DUST_TAG)
                .requires(Items.ENDER_PEARL, 2)
                .requires(ATOTagRegistry.ORE_HAMMERS)
                .unlockedBy("has_hammer", has(ATOTagRegistry.ORE_HAMMERS))
                .save(recipeOutput, shapelessIORecipeDir("dust", "enderium", "alloy_blending"));
    }
}

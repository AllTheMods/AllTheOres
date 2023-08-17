package net.allthemods.alltheores.datagen.server;

import net.allthemods.alltheores.blocks.BlockList;
import net.allthemods.alltheores.datagen.builder.ShapedBlockBuilder;
import net.allthemods.alltheores.datagen.builder.ShapedIngotBuilder;
import net.allthemods.alltheores.datagen.builder.ShapedRawBuilder;
import net.allthemods.alltheores.infos.ItemTagRegistry;
import net.allthemods.alltheores.infos.Reference;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.Tags;

import java.util.function.Consumer;

public class CraftingRecipes extends RecipeProvider {
    public CraftingRecipes(PackOutput packOutput) {
        super(packOutput);
    }

    private ShapedRecipeBuilder shaped(ItemLike provider) {
        return ShapedRecipeBuilder.shaped(RecipeCategory.MISC,provider)
            .group(Reference.MOD_ID);
    }


    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> consumer) {
        buildBlastingRecipes(consumer);
        buildShapelessRecipes(consumer);
        buildSmeltingRecipes(consumer);
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

        ShapedRawBuilder.builder(ItemTagRegistry.RAW_IRIDIUM)
                .setRaw(BlockList.RAW_IRIDIUM_BLOCK_ITEM)
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



        ShapedBlockBuilder.builder(ItemTagRegistry.RUBY)
                .setBlock(BlockList.RUBY_BLOCK_ITEM)
                .build(consumer);


        ShapedBlockBuilder.builder(ItemTagRegistry.SAPPHIRE)
                .setBlock(BlockList.SAPPHIRE_BLOCK_ITEM)
                .build(consumer);


        ShapedBlockBuilder.builder(ItemTagRegistry.PERIDOT)
                .setBlock(BlockList.PERIDOT_BLOCK_ITEM)
                .build(consumer);

        ShapedBlockBuilder.builder(ItemTagRegistry.ALUMINUM_INGOT)
                .setBlock(BlockList.ALUMINUM_BLOCK_ITEM)
                .setGear(BlockList.ALUMINUM_GEAR)
                .setPlate(BlockList.ALUMINUM_PLATE)
                .setRod(BlockList.ALUMINUM_ROD)
                .build(consumer);

        ShapedBlockBuilder.builder(ItemTagRegistry.IRIDIUM_INGOT)
                .setBlock(BlockList.IRIDIUM_BLOCK_ITEM)
                .setGear(BlockList.IRIDIUM_GEAR)
                .setPlate(BlockList.IRIDIUM_PLATE)
                .setRod(BlockList.IRIDIUM_ROD)
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

        ShapedIngotBuilder.builder(ItemTagRegistry.IRIDIUM_NUGGET)
                .setIngot(BlockList.IRIDIUM_INGOT)
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

        ShapedIngotBuilder.builder(ItemTagRegistry.BRASS_NUGGET)
                .setIngot(BlockList.BRASS_INGOT)
                .build(consumer);

        ShapedBlockBuilder.builder(ItemTagRegistry.BRASS_INGOT)
                .setBlock(BlockList.BRASS_BLOCK_ITEM)
                .setGear(BlockList.BRASS_GEAR)
                .setPlate(BlockList.BRASS_PLATE)
                .setRod(BlockList.BRASS_ROD)
                .build(consumer);


    }
    private ResourceLocation blastingRecipeDir(String typeIn, String typeOut) {
        return new ResourceLocation(Reference.MOD_ID,typeIn + "_from_" + typeOut + "_blasting");
    }
    protected void buildBlastingRecipes(Consumer<FinishedRecipe> consumer) {

        final String hasCondition = "has_item";

        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(BlockList.INVAR_DUST.get()), RecipeCategory.MISC, BlockList.INVAR_INGOT.get(),0.15f,100)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.INVAR_DUST.get()))
                .save(consumer, blastingRecipeDir("invar_ingot","dust"));

        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(BlockList.STEEL_DUST.get()), RecipeCategory.MISC,BlockList.STEEL_INGOT.get(),0.15f,100)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.STEEL_DUST.get()))
                .save(consumer, blastingRecipeDir("steel_ingot","dust"));

        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(BlockList.BRONZE_DUST.get()), RecipeCategory.MISC,BlockList.BRONZE_INGOT.get(),0.15f,100)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.BRONZE_DUST.get()))
                .save(consumer, blastingRecipeDir("bronze_ingot","dust"));

        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(BlockList.BRASS_DUST.get()), RecipeCategory.MISC,BlockList.BRASS_INGOT.get(),0.15f,100)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.BRASS_DUST.get()))
                .save(consumer, blastingRecipeDir("brass_ingot","dust"));

        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(BlockList.CONSTANTAN_DUST.get()), RecipeCategory.MISC,BlockList.CONSTANTAN_INGOT.get(),0.15f,100)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.CONSTANTAN_DUST.get()))
                .save(consumer, blastingRecipeDir("constantan_ingot","dust"));

        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(BlockList.LUMIUM_DUST.get()), RecipeCategory.MISC,BlockList.LUMIUM_INGOT.get(),0.15f,100)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.LUMIUM_DUST.get()))
                .save(consumer, blastingRecipeDir("lumium_ingot","dust"));

        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(BlockList.IRIDIUM_DUST.get()), RecipeCategory.MISC,BlockList.IRIDIUM_INGOT.get(),0.15f,100)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.IRIDIUM_DUST.get()))
                .save(consumer, blastingRecipeDir("iridium_ingot","dust"));

        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(BlockList.ENDERIUM_DUST.get()), RecipeCategory.MISC,BlockList.ENDERIUM_INGOT.get(),0.15f,100)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.ENDERIUM_DUST.get()))
                .save(consumer, blastingRecipeDir("enderium_ingot","dust"));

        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(BlockList.SIGNALUM_DUST.get()), RecipeCategory.MISC,BlockList.SIGNALUM_INGOT.get(),0.15f,100)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.SIGNALUM_DUST.get()))
                .save(consumer, blastingRecipeDir("signalum_ingot","dust"));

        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(BlockList.ELECTRUM_DUST.get()), RecipeCategory.MISC,BlockList.ELECTRUM_INGOT.get(),0.15f,100)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.ELECTRUM_DUST.get()))
                .save(consumer, blastingRecipeDir("electrum_ingot","dust"));

        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(BlockList.IRON_DUST.get()), RecipeCategory.MISC,Items.IRON_INGOT,0.15f,100)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.IRON_DUST.get()))
                .save(consumer, blastingRecipeDir("iron_ingot","dust"));

        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(BlockList.GOLD_DUST.get()), RecipeCategory.MISC, Items.GOLD_INGOT,0.15f,100)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.GOLD_DUST.get()))
                .save(consumer, blastingRecipeDir("gold_ingot","dust"));

        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(BlockList.COPPER_DUST.get()), RecipeCategory.MISC,Items.COPPER_INGOT,0.15f,100)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.COPPER_DUST.get()))
                .save(consumer, blastingRecipeDir("copper_ingot","dust"));

        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(BlockList.ALUMINUM_RAW.get()), RecipeCategory.MISC,BlockList.ALUMINUM_INGOT.get(),0.15f,100)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.ALUMINUM_RAW.get()))
                .save(consumer, blastingRecipeDir("aluminum_ingot","raw"));

        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(BlockList.IRIDIUM_RAW.get()), RecipeCategory.MISC,BlockList.IRIDIUM_INGOT.get(),0.15f,100)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.IRIDIUM_RAW.get()))
                .save(consumer, blastingRecipeDir("iridium_ingot","raw"));

        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(BlockList.LEAD_RAW.get()), RecipeCategory.MISC,BlockList.LEAD_INGOT.get(),0.15f,100)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.LEAD_RAW.get()))
                .save(consumer, blastingRecipeDir("lead_ingot","raw"));

        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(BlockList.OSMIUM_RAW.get()), RecipeCategory.MISC,BlockList.OSMIUM_INGOT.get(),0.15f,100)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.OSMIUM_RAW.get()))
                .save(consumer, blastingRecipeDir("osmium_ingot","raw"));

        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(BlockList.NICKEL_RAW.get()), RecipeCategory.MISC,BlockList.NICKEL_INGOT.get(),0.15f,100)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.NICKEL_RAW.get()))
                .save(consumer, blastingRecipeDir("nickel_ingot","raw"));

        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(BlockList.PLATINUM_RAW.get()), RecipeCategory.MISC,BlockList.PLATINUM_INGOT.get(),0.15f,100)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.PLATINUM_RAW.get()))
                .save(consumer, blastingRecipeDir("platinum_ingot","raw"));

        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(BlockList.SILVER_RAW.get()), RecipeCategory.MISC,BlockList.SILVER_INGOT.get(),0.15f,100)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.SILVER_RAW.get()))
                .save(consumer, blastingRecipeDir("silver_ingot","raw"));

        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(BlockList.TIN_RAW.get()), RecipeCategory.MISC,BlockList.TIN_INGOT.get(),0.15f,100)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.TIN_RAW.get()))
                .save(consumer, blastingRecipeDir("tin_ingot","raw"));

        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(BlockList.URANIUM_RAW.get()), RecipeCategory.MISC,BlockList.URANIUM_INGOT.get(),0.15f,100)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.URANIUM_RAW.get()))
                .save(consumer, blastingRecipeDir("uranium_ingot","raw"));

        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(BlockList.ZINC_RAW.get()), RecipeCategory.MISC,BlockList.ZINC_INGOT.get(),0.15f,100)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.ZINC_RAW.get()))
                .save(consumer, blastingRecipeDir("zinc_ingot","raw"));

        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(BlockList.ALUMINUM_ORE.get()), RecipeCategory.MISC,BlockList.ALUMINUM_INGOT.get(),0.15f,200)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.ALUMINUM_ORE.get()))
                .save(consumer, blastingRecipeDir("aluminum_ingot","ore"));

        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(BlockList.IRIDIUM_ORE.get()), RecipeCategory.MISC,BlockList.IRIDIUM_INGOT.get(),0.15f,200)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.IRIDIUM_ORE.get()))
                .save(consumer, blastingRecipeDir("iridium_ingot","ore"));

        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(BlockList.LEAD_ORE.get()), RecipeCategory.MISC,BlockList.LEAD_INGOT.get(),0.15f,200)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.LEAD_ORE.get()))
                .save(consumer, blastingRecipeDir("lead_ingot","ore"));

        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(BlockList.OSMIUM_ORE.get()), RecipeCategory.MISC,BlockList.OSMIUM_INGOT.get(),0.15f,200)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.OSMIUM_ORE.get()))
                .save(consumer, blastingRecipeDir("osmium_ingot","ore"));

        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(BlockList.NICKEL_ORE.get()), RecipeCategory.MISC,BlockList.NICKEL_INGOT.get(),0.15f,200)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.NICKEL_ORE.get()))
                .save(consumer, blastingRecipeDir("nickel_ingot","ore"));

        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(BlockList.PLATINUM_ORE.get()), RecipeCategory.MISC,BlockList.PLATINUM_INGOT.get(),0.15f,200)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.PLATINUM_ORE.get()))
                .save(consumer, blastingRecipeDir("platinum_ingot","ore"));

        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(BlockList.SILVER_ORE.get()), RecipeCategory.MISC,BlockList.SILVER_INGOT.get(),0.15f,200)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.SILVER_ORE.get()))
                .save(consumer, blastingRecipeDir("silver_ingot","ore"));

        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(BlockList.TIN_ORE.get()), RecipeCategory.MISC,BlockList.TIN_INGOT.get(),0.15f,200)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.TIN_ORE.get()))
                .save(consumer, blastingRecipeDir("tin_ingot","ore"));

        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(BlockList.URANIUM_ORE.get()), RecipeCategory.MISC,BlockList.URANIUM_INGOT.get(),0.15f,200)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.URANIUM_ORE.get()))
                .save(consumer, blastingRecipeDir("uranium_ingot","ore"));

        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(BlockList.ZINC_ORE.get()), RecipeCategory.MISC,BlockList.ZINC_INGOT.get(),0.15f,200)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.ZINC_ORE.get()))
                .save(consumer, blastingRecipeDir("zinc_ingot","ore"));


        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(BlockList.ALUMINUM_SLATE_ORE.get()), RecipeCategory.MISC,BlockList.ALUMINUM_INGOT.get(),0.15f,200)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.ALUMINUM_SLATE_ORE.get()))
                .save(consumer, blastingRecipeDir("aluminum_ingot","slate_ore"));


        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(BlockList.IRIDIUM_SLATE_ORE.get()), RecipeCategory.MISC,BlockList.IRIDIUM_INGOT.get(),0.15f,200)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.IRIDIUM_SLATE_ORE.get()))
                .save(consumer, blastingRecipeDir("iridium_ingot","slate_ore"));

        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(BlockList.LEAD_SLATE_ORE.get()), RecipeCategory.MISC,BlockList.LEAD_INGOT.get(),0.15f,200)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.LEAD_SLATE_ORE.get()))
                .save(consumer, blastingRecipeDir("lead_ingot","slate_ore"));

        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(BlockList.OSMIUM_SLATE_ORE.get()), RecipeCategory.MISC,BlockList.OSMIUM_INGOT.get(),0.15f,200)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.OSMIUM_SLATE_ORE.get()))
                .save(consumer, blastingRecipeDir("osmium_ingot","slate_ore"));

        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(BlockList.NICKEL_SLATE_ORE.get()), RecipeCategory.MISC,BlockList.NICKEL_INGOT.get(),0.15f,200)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.NICKEL_SLATE_ORE.get()))
                .save(consumer, blastingRecipeDir("nickel_ingot","slate_ore"));

        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(BlockList.PLATINUM_SLATE_ORE.get()), RecipeCategory.MISC,BlockList.PLATINUM_INGOT.get(),0.15f,200)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.PLATINUM_SLATE_ORE.get()))
                .save(consumer, blastingRecipeDir("platinum_ingot","slate_ore"));

        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(BlockList.SILVER_SLATE_ORE.get()), RecipeCategory.MISC,BlockList.SILVER_INGOT.get(),0.15f,200)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.SILVER_SLATE_ORE.get()))
                .save(consumer, blastingRecipeDir("silver_ingot","slate_ore"));

        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(BlockList.TIN_SLATE_ORE.get()), RecipeCategory.MISC,BlockList.TIN_INGOT.get(),0.15f,200)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.TIN_SLATE_ORE.get()))
                .save(consumer, blastingRecipeDir("tin_ingot","slate_ore"));

        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(BlockList.URANIUM_SLATE_ORE.get()), RecipeCategory.MISC,BlockList.URANIUM_INGOT.get(),0.15f,200)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.URANIUM_SLATE_ORE.get()))
                .save(consumer, blastingRecipeDir("uranium_ingot","slate_ore"));

        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(BlockList.ZINC_SLATE_ORE.get()), RecipeCategory.MISC,BlockList.ZINC_INGOT.get(),0.15f,200)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.ZINC_SLATE_ORE.get()))
                .save(consumer, blastingRecipeDir("zinc_ingot","slate_ore"));


    }

    private ResourceLocation shapelessRecipeDir(String typeIn, String typeOut) {
        return new ResourceLocation(Reference.MOD_ID,typeIn + "_from_" + typeOut);
    }

    protected void buildShapelessRecipes(Consumer<FinishedRecipe> consumer) {

        final String hasCondition = "has_item";

        ShapelessRecipeBuilder
                .shapeless(RecipeCategory.MISC,BlockList.RUBY.get(),3)
                .requires(ItemTagRegistry.ORE_HAMMERS)
                .requires(ItemTagRegistry.RUBY_ORE_ITEM)
                .unlockedBy(hasCondition,RecipeProvider.inventoryTrigger(ItemPredicate.Builder.item().of(ItemTagRegistry.ORE_HAMMERS).build()))
                .save(consumer, shapelessRecipeDir("ruby","hammer_crushing"));

        ShapelessRecipeBuilder
                .shapeless(RecipeCategory.MISC,BlockList.SAPPHIRE.get(),3)
                .requires(ItemTagRegistry.ORE_HAMMERS)
                .requires(ItemTagRegistry.SAPPHIRE_ORE_ITEM)
                .unlockedBy(hasCondition,RecipeProvider.inventoryTrigger(ItemPredicate.Builder.item().of(ItemTagRegistry.ORE_HAMMERS).build()))
                .save(consumer, shapelessRecipeDir("sapphire","hammer_crushing"));

        ShapelessRecipeBuilder
                .shapeless(RecipeCategory.MISC,BlockList.PERIDOT.get(),3)
                .requires(ItemTagRegistry.ORE_HAMMERS)
                .requires(ItemTagRegistry.PERIDOT_ORE_ITEM)
                .unlockedBy(hasCondition,RecipeProvider.inventoryTrigger(ItemPredicate.Builder.item().of(ItemTagRegistry.ORE_HAMMERS).build()))
                .save(consumer, shapelessRecipeDir("peridot","hammer_crushing"));

        ShapelessRecipeBuilder
                .shapeless(RecipeCategory.MISC,BlockList.RUBY.get(),9)
                .requires(ItemTagRegistry.RUBY_BLOCK_ITEM)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.RUBY_BLOCK_ITEM.get()))
                .save(consumer, shapelessRecipeDir("ruby","block"));

        ShapelessRecipeBuilder
                .shapeless(RecipeCategory.MISC,BlockList.SAPPHIRE.get(),9)
                .requires(ItemTagRegistry.SAPPHIRE_BLOCK_ITEM)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.SAPPHIRE_BLOCK_ITEM.get()))
                .save(consumer, shapelessRecipeDir("sapphire","block"));

        ShapelessRecipeBuilder
                .shapeless(RecipeCategory.MISC,BlockList.PERIDOT.get(),9)
                .requires(ItemTagRegistry.PERIDOT_BLOCK_ITEM)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.PERIDOT_BLOCK_ITEM.get()))
                .save(consumer, shapelessRecipeDir("peridot","block"));

        ShapelessRecipeBuilder
                .shapeless(RecipeCategory.MISC,BlockList.INVAR_DUST.get(),3)
                .requires(BlockList.IRON_DUST.get(),2)
                .requires(ItemTagRegistry.NICKEL_DUST)
                .unlockedBy(hasCondition,RecipeProvider.inventoryTrigger(ItemPredicate.Builder.item().of(ItemTagRegistry.ORE_HAMMERS).build()))
                .save(consumer, shapelessRecipeDir("invar_dust","alloy_blending"));


        ShapelessRecipeBuilder
                .shapeless(RecipeCategory.MISC,BlockList.STEEL_DUST.get(),1)
                .requires(BlockList.IRON_DUST.get(),1)
                .requires(Items.COAL,4)
                .requires(ItemTagRegistry.ORE_HAMMERS)
                .unlockedBy(hasCondition,RecipeProvider.inventoryTrigger(ItemPredicate.Builder.item().of(ItemTagRegistry.ORE_HAMMERS).build()))
                .save(consumer, shapelessRecipeDir("steel_dust","alloy_blending"));

        ShapelessRecipeBuilder
                .shapeless(RecipeCategory.MISC,BlockList.ELECTRUM_DUST.get(),2)
                .requires(BlockList.GOLD_DUST.get())
                .requires(ItemTagRegistry.SILVER_DUST)
                .unlockedBy(hasCondition,RecipeProvider.inventoryTrigger(ItemPredicate.Builder.item().of(ItemTagRegistry.ORE_HAMMERS).build()))
                .save(consumer, shapelessRecipeDir("electrum_dust","alloy_blending"));

        ShapelessRecipeBuilder
                .shapeless(RecipeCategory.MISC,BlockList.BRONZE_DUST.get(),4)
                .requires(BlockList.COPPER_DUST.get(),3)
                .requires(ItemTagRegistry.TIN_DUST)
                .unlockedBy(hasCondition,RecipeProvider.inventoryTrigger(ItemPredicate.Builder.item().of(ItemTagRegistry.ORE_HAMMERS).build()))
                .save(consumer, shapelessRecipeDir("bronze_dust","alloy_blending"));

        ShapelessRecipeBuilder
                .shapeless(RecipeCategory.MISC,BlockList.BRASS_DUST.get(),4)
                .requires(BlockList.COPPER_DUST.get(),3)
                .requires(ItemTagRegistry.ZINC_DUST)
                .unlockedBy(hasCondition,RecipeProvider.inventoryTrigger(ItemPredicate.Builder.item().of(ItemTagRegistry.ORE_HAMMERS).build()))
                .save(consumer, shapelessRecipeDir("brass_dust","alloy_blending"));

        ShapelessRecipeBuilder
                .shapeless(RecipeCategory.MISC,BlockList.LUMIUM_DUST.get(),4)
                .requires(Items.GLOWSTONE_DUST,4)
                .requires(ItemTagRegistry.SILVER_DUST)
                .requires(BlockList.TIN_DUST.get(),3)
                .unlockedBy(hasCondition,RecipeProvider.inventoryTrigger(ItemPredicate.Builder.item().of(ItemTagRegistry.ORE_HAMMERS).build()))
                .save(consumer, shapelessRecipeDir("lumium_dust","alloy_blending"));

        ShapelessRecipeBuilder
                .shapeless(RecipeCategory.MISC,BlockList.CONSTANTAN_DUST.get(),2)
                .requires(BlockList.COPPER_DUST.get())
                .requires(ItemTagRegistry.NICKEL_DUST)
                .unlockedBy(hasCondition,RecipeProvider.inventoryTrigger(ItemPredicate.Builder.item().of(ItemTagRegistry.ORE_HAMMERS).build()))
                .save(consumer, shapelessRecipeDir("constantan_dust","alloy_blending"));

        ShapelessRecipeBuilder
                .shapeless(RecipeCategory.MISC,BlockList.SIGNALUM_DUST.get(),4)
                .requires(BlockList.COPPER_DUST.get(),3)
                .requires(ItemTagRegistry.SILVER_DUST)
                .requires(Items.REDSTONE,4)
                .unlockedBy(hasCondition,RecipeProvider.inventoryTrigger(ItemPredicate.Builder.item().of(ItemTagRegistry.ORE_HAMMERS).build()))
                .save(consumer, shapelessRecipeDir("signalum_dust","alloy_blending"));

        ShapelessRecipeBuilder
                .shapeless(RecipeCategory.MISC,BlockList.ENDERIUM_DUST.get(),4)
                .requires(BlockList.LEAD_DUST.get(),3)
                .requires(ItemTagRegistry.PLATINUM_DUST)
                .requires(Items.ENDER_PEARL,2)
                .requires(ItemTagRegistry.ORE_HAMMERS)
                .unlockedBy(hasCondition,RecipeProvider.inventoryTrigger(ItemPredicate.Builder.item().of(ItemTagRegistry.ORE_HAMMERS).build()))
                .save(consumer, shapelessRecipeDir("enderium_dust","alloy_blending"));

        ShapelessRecipeBuilder
                .shapeless(RecipeCategory.MISC,BlockList.NETHERITE_DUST.get(),1)
                .requires(Items.NETHERITE_INGOT)
                .requires(ItemTagRegistry.ORE_HAMMERS)
                .unlockedBy(hasCondition,RecipeProvider.inventoryTrigger(ItemPredicate.Builder.item().of(ItemTagRegistry.ORE_HAMMERS).build()))
                .save(consumer, shapelessRecipeDir("netherite_dust","hammer_crushing"));

        ShapelessRecipeBuilder
                .shapeless(RecipeCategory.MISC,BlockList.DIAMOND_DUST.get(),1)
                .requires(Items.DIAMOND)
                .requires(ItemTagRegistry.ORE_HAMMERS)
                .unlockedBy(hasCondition,RecipeProvider.inventoryTrigger(ItemPredicate.Builder.item().of(ItemTagRegistry.ORE_HAMMERS).build()))
                .save(consumer, shapelessRecipeDir("diamond_dust","hammer_crushing"));

        ShapelessRecipeBuilder
                .shapeless(RecipeCategory.MISC,BlockList.RUBY_DUST.get(),1)
                .requires(BlockList.RUBY.get())
                .requires(ItemTagRegistry.ORE_HAMMERS)
                .unlockedBy(hasCondition,RecipeProvider.inventoryTrigger(ItemPredicate.Builder.item().of(ItemTagRegistry.ORE_HAMMERS).build()))
                .save(consumer, shapelessRecipeDir("ruby_dust","hammer_crushing"));

        ShapelessRecipeBuilder
                .shapeless(RecipeCategory.MISC,BlockList.PERIDOT_DUST.get(),1)
                .requires(BlockList.PERIDOT.get())
                .requires(ItemTagRegistry.ORE_HAMMERS)
                .unlockedBy(hasCondition,RecipeProvider.inventoryTrigger(ItemPredicate.Builder.item().of(ItemTagRegistry.ORE_HAMMERS).build()))
                .save(consumer, shapelessRecipeDir("peridot_dust","hammer_crushing"));

        ShapelessRecipeBuilder
                .shapeless(RecipeCategory.MISC,BlockList.SAPPHIRE_DUST.get(),1)
                .requires(BlockList.SAPPHIRE.get())
                .requires(ItemTagRegistry.ORE_HAMMERS)
                .unlockedBy(hasCondition,RecipeProvider.inventoryTrigger(ItemPredicate.Builder.item().of(ItemTagRegistry.ORE_HAMMERS).build()))
                .save(consumer, shapelessRecipeDir("sapphire_dust","hammer_crushing"));

        ShapelessRecipeBuilder
                .shapeless(RecipeCategory.MISC,BlockList.ALUMINUM_DUST.get(),2)
                .requires(ItemTagRegistry.ORE_HAMMERS)
                .requires(ItemTagRegistry.RAW_ALUMINUM)
                .unlockedBy(hasCondition,RecipeProvider.inventoryTrigger(ItemPredicate.Builder.item().of(ItemTagRegistry.ORE_HAMMERS).build()))
                .save(consumer, shapelessRecipeDir("aluminum_dust","hammer_crushing"));

        ShapelessRecipeBuilder
                .shapeless(RecipeCategory.MISC,BlockList.COPPER_DUST.get(),2)
                .requires(ItemTagRegistry.ORE_HAMMERS)
                .requires(Items.RAW_COPPER)
                .unlockedBy(hasCondition,RecipeProvider.inventoryTrigger(ItemPredicate.Builder.item().of(ItemTagRegistry.ORE_HAMMERS).build()))
                .save(consumer, shapelessRecipeDir("copper_dust","hammer_crushing"));

        ShapelessRecipeBuilder
                .shapeless(RecipeCategory.MISC,BlockList.LEAD_DUST.get(),2)
                .requires(ItemTagRegistry.ORE_HAMMERS)
                .requires(ItemTagRegistry.RAW_LEAD)
                .unlockedBy(hasCondition,RecipeProvider.inventoryTrigger(ItemPredicate.Builder.item().of(ItemTagRegistry.ORE_HAMMERS).build()))
                .save(consumer, shapelessRecipeDir("lead_dust","hammer_crushing"));

        ShapelessRecipeBuilder
                .shapeless(RecipeCategory.MISC,BlockList.NICKEL_DUST.get(),2)
                .requires(ItemTagRegistry.ORE_HAMMERS)
                .requires(ItemTagRegistry.RAW_NICKEL)
                .unlockedBy(hasCondition,RecipeProvider.inventoryTrigger(ItemPredicate.Builder.item().of(ItemTagRegistry.ORE_HAMMERS).build()))
                .save(consumer, shapelessRecipeDir("nickel_dust","hammer_crushing"));

        ShapelessRecipeBuilder
                .shapeless(RecipeCategory.MISC,BlockList.IRIDIUM_DUST.get(),2)
                .requires(ItemTagRegistry.ORE_HAMMERS)
                .requires(ItemTagRegistry.RAW_IRIDIUM)
                .unlockedBy(hasCondition,RecipeProvider.inventoryTrigger(ItemPredicate.Builder.item().of(ItemTagRegistry.ORE_HAMMERS).build()))
                .save(consumer, shapelessRecipeDir("iridium_dust","hammer_crushing"));

        ShapelessRecipeBuilder
                .shapeless(RecipeCategory.MISC,BlockList.OSMIUM_DUST.get(),2)
                .requires(ItemTagRegistry.ORE_HAMMERS)
                .requires(ItemTagRegistry.RAW_OSMIUM)
                .unlockedBy(hasCondition,RecipeProvider.inventoryTrigger(ItemPredicate.Builder.item().of(ItemTagRegistry.ORE_HAMMERS).build()))
                .save(consumer, shapelessRecipeDir("osmium_dust","hammer_crushing"));

        ShapelessRecipeBuilder
                .shapeless(RecipeCategory.MISC,BlockList.PLATINUM_DUST.get(),2)
                .requires(ItemTagRegistry.ORE_HAMMERS)
                .requires(ItemTagRegistry.RAW_PLATINUM)
                .unlockedBy(hasCondition,RecipeProvider.inventoryTrigger(ItemPredicate.Builder.item().of(ItemTagRegistry.ORE_HAMMERS).build()))
                .save(consumer, shapelessRecipeDir("platinum_dust","hammer_crushing"));

        ShapelessRecipeBuilder
                .shapeless(RecipeCategory.MISC,BlockList.SILVER_DUST.get(),2)
                .requires(ItemTagRegistry.ORE_HAMMERS)
                .requires(ItemTagRegistry.RAW_SILVER)
                .unlockedBy(hasCondition,RecipeProvider.inventoryTrigger(ItemPredicate.Builder.item().of(ItemTagRegistry.ORE_HAMMERS).build()))
                .save(consumer, shapelessRecipeDir("silver_dust","hammer_crushing"));

        ShapelessRecipeBuilder
                .shapeless(RecipeCategory.MISC,BlockList.TIN_DUST.get(),2)
                .requires(ItemTagRegistry.ORE_HAMMERS)
                .requires(ItemTagRegistry.RAW_TIN)
                .unlockedBy(hasCondition,RecipeProvider.inventoryTrigger(ItemPredicate.Builder.item().of(ItemTagRegistry.ORE_HAMMERS).build()))
                .save(consumer, shapelessRecipeDir("tin_dust","hammer_crushing"));

        ShapelessRecipeBuilder
                .shapeless(RecipeCategory.MISC,BlockList.URANIUM_DUST.get(),2)
                .requires(ItemTagRegistry.ORE_HAMMERS)
                .requires(ItemTagRegistry.RAW_URANIUM)
                .unlockedBy(hasCondition,RecipeProvider.inventoryTrigger(ItemPredicate.Builder.item().of(ItemTagRegistry.ORE_HAMMERS).build()))
                .save(consumer, shapelessRecipeDir("uranium_dust","hammer_crushing"));

        ShapelessRecipeBuilder
                .shapeless(RecipeCategory.MISC,BlockList.ZINC_DUST.get(),2)
                .requires(ItemTagRegistry.ORE_HAMMERS)
                .requires(ItemTagRegistry.RAW_ZINC)
                .unlockedBy(hasCondition,RecipeProvider.inventoryTrigger(ItemPredicate.Builder.item().of(ItemTagRegistry.ORE_HAMMERS).build()))
                .save(consumer, shapelessRecipeDir("zinc_dust","hammer_crushing"));

        ShapelessRecipeBuilder
                .shapeless(RecipeCategory.MISC,BlockList.IRON_DUST.get(),2)
                .requires(ItemTagRegistry.ORE_HAMMERS)
                .requires(Items.RAW_IRON)
                .unlockedBy(hasCondition,RecipeProvider.inventoryTrigger(ItemPredicate.Builder.item().of(ItemTagRegistry.ORE_HAMMERS).build()))
                .save(consumer, shapelessRecipeDir("iron_dust","hammer_crushing"));

        ShapelessRecipeBuilder
                .shapeless(RecipeCategory.MISC,BlockList.GOLD_DUST.get(),2)
                .requires(ItemTagRegistry.ORE_HAMMERS)
                .requires(Items.RAW_GOLD)
                .unlockedBy(hasCondition,RecipeProvider.inventoryTrigger(ItemPredicate.Builder.item().of(ItemTagRegistry.ORE_HAMMERS).build()))
                .save(consumer, shapelessRecipeDir("gold_dust","hammer_crushing"));

        // DUST FROM INGOTS

        ShapelessRecipeBuilder
                .shapeless(RecipeCategory.MISC,BlockList.ALUMINUM_DUST.get(),1)
                .requires(ItemTagRegistry.ORE_HAMMERS)
                .requires(ItemTagRegistry.ALUMINUM_INGOT)
                .unlockedBy(hasCondition,RecipeProvider.inventoryTrigger(ItemPredicate.Builder.item().of(ItemTagRegistry.ORE_HAMMERS).build()))
                .save(consumer, shapelessRecipeDir("aluminum_dust","hammer_ingot_crushing"));

        ShapelessRecipeBuilder
                .shapeless(RecipeCategory.MISC,BlockList.COPPER_DUST.get(),1)
                .requires(ItemTagRegistry.ORE_HAMMERS)
                .requires(Items.COPPER_INGOT)
                .unlockedBy(hasCondition,RecipeProvider.inventoryTrigger(ItemPredicate.Builder.item().of(ItemTagRegistry.ORE_HAMMERS).build()))
                .save(consumer, shapelessRecipeDir("copper_dust","hammer_ingot_crushing"));

        ShapelessRecipeBuilder
                .shapeless(RecipeCategory.MISC,BlockList.LEAD_DUST.get(),1)
                .requires(ItemTagRegistry.ORE_HAMMERS)
                .requires(ItemTagRegistry.LEAD_INGOT)
                .unlockedBy(hasCondition,RecipeProvider.inventoryTrigger(ItemPredicate.Builder.item().of(ItemTagRegistry.ORE_HAMMERS).build()))
                .save(consumer, shapelessRecipeDir("lead_dust","hammer_ingot_crushing"));

        ShapelessRecipeBuilder
                .shapeless(RecipeCategory.MISC,BlockList.NICKEL_DUST.get(),1)
                .requires(ItemTagRegistry.ORE_HAMMERS)
                .requires(ItemTagRegistry.NICKEL_INGOT)
                .unlockedBy(hasCondition,RecipeProvider.inventoryTrigger(ItemPredicate.Builder.item().of(ItemTagRegistry.ORE_HAMMERS).build()))
                .save(consumer, shapelessRecipeDir("nickel_dust","hammer_ingot_crushing"));

        ShapelessRecipeBuilder
                .shapeless(RecipeCategory.MISC,BlockList.OSMIUM_DUST.get(),1)
                .requires(ItemTagRegistry.ORE_HAMMERS)
                .requires(ItemTagRegistry.OSMIUM_INGOT)
                .unlockedBy(hasCondition,RecipeProvider.inventoryTrigger(ItemPredicate.Builder.item().of(ItemTagRegistry.ORE_HAMMERS).build()))
                .save(consumer, shapelessRecipeDir("osmium_dust","hammer_ingot_crushing"));

        ShapelessRecipeBuilder
                .shapeless(RecipeCategory.MISC,BlockList.PLATINUM_DUST.get(),1)
                .requires(ItemTagRegistry.ORE_HAMMERS)
                .requires(ItemTagRegistry.PLATINUM_INGOT)
                .unlockedBy(hasCondition,RecipeProvider.inventoryTrigger(ItemPredicate.Builder.item().of(ItemTagRegistry.ORE_HAMMERS).build()))
                .save(consumer, shapelessRecipeDir("platinum_dust","hammer_ingot_crushing"));

        ShapelessRecipeBuilder
                .shapeless(RecipeCategory.MISC,BlockList.SILVER_DUST.get(),1)
                .requires(ItemTagRegistry.ORE_HAMMERS)
                .requires(ItemTagRegistry.SILVER_INGOT)
                .unlockedBy(hasCondition,RecipeProvider.inventoryTrigger(ItemPredicate.Builder.item().of(ItemTagRegistry.ORE_HAMMERS).build()))
                .save(consumer, shapelessRecipeDir("silver_dust","hammer_ingot_crushing"));

        ShapelessRecipeBuilder
                .shapeless(RecipeCategory.MISC,BlockList.TIN_DUST.get(),1)
                .requires(ItemTagRegistry.ORE_HAMMERS)
                .requires(ItemTagRegistry.TIN_INGOT)
                .unlockedBy(hasCondition,RecipeProvider.inventoryTrigger(ItemPredicate.Builder.item().of(ItemTagRegistry.ORE_HAMMERS).build()))
                .save(consumer, shapelessRecipeDir("tin_dust","hammer_ingot_crushing"));

        ShapelessRecipeBuilder
                .shapeless(RecipeCategory.MISC,BlockList.URANIUM_DUST.get(),1)
                .requires(ItemTagRegistry.ORE_HAMMERS)
                .requires(ItemTagRegistry.URANIUM_INGOT)
                .unlockedBy(hasCondition,RecipeProvider.inventoryTrigger(ItemPredicate.Builder.item().of(ItemTagRegistry.ORE_HAMMERS).build()))
                .save(consumer, shapelessRecipeDir("uranium_dust","hammer_ingot_crushing"));

        ShapelessRecipeBuilder
                .shapeless(RecipeCategory.MISC,BlockList.ZINC_DUST.get(),1)
                .requires(ItemTagRegistry.ORE_HAMMERS)
                .requires(ItemTagRegistry.ZINC_INGOT)
                .unlockedBy(hasCondition,RecipeProvider.inventoryTrigger(ItemPredicate.Builder.item().of(ItemTagRegistry.ORE_HAMMERS).build()))
                .save(consumer, shapelessRecipeDir("zinc_dust","hammer_ingot_crushing"));

        ShapelessRecipeBuilder
                .shapeless(RecipeCategory.MISC,BlockList.IRON_DUST.get(),1)
                .requires(ItemTagRegistry.ORE_HAMMERS)
                .requires(Items.IRON_INGOT)
                .unlockedBy(hasCondition,RecipeProvider.inventoryTrigger(ItemPredicate.Builder.item().of(ItemTagRegistry.ORE_HAMMERS).build()))
                .save(consumer, shapelessRecipeDir("iron_dust","hammer_ingot_crushing"));

        ShapelessRecipeBuilder
                .shapeless(RecipeCategory.MISC,BlockList.GOLD_DUST.get(),1)
                .requires(ItemTagRegistry.ORE_HAMMERS)
                .requires(Items.GOLD_INGOT)
                .unlockedBy(hasCondition,RecipeProvider.inventoryTrigger(ItemPredicate.Builder.item().of(ItemTagRegistry.ORE_HAMMERS).build()))
                .save(consumer, shapelessRecipeDir("gold_dust","hammer_ingot_crushing"));


        // RAW
        ShapelessRecipeBuilder
                .shapeless(RecipeCategory.MISC,BlockList.ALUMINUM_RAW.get(),9)
                .requires(ItemTagRegistry.RAW_ALUMINUM_BLOCK_ITEM)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.RAW_ALUMINUM_BLOCK_ITEM.get()))
                .save(consumer, shapelessRecipeDir("raw_aluminum","block"));

        ShapelessRecipeBuilder
                .shapeless(RecipeCategory.MISC,BlockList.NICKEL_RAW.get(),9)
                .requires(ItemTagRegistry.RAW_NICKEL_BLOCK_ITEM)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.RAW_NICKEL_BLOCK_ITEM.get()))
                .save(consumer, shapelessRecipeDir("raw_nickel","block"));

        ShapelessRecipeBuilder
                .shapeless(RecipeCategory.MISC,BlockList.LEAD_RAW.get(),9)
                .requires(ItemTagRegistry.RAW_LEAD_BLOCK_ITEM)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.RAW_LEAD_BLOCK_ITEM.get()))
                .save(consumer, shapelessRecipeDir("raw_lead","block"));

        ShapelessRecipeBuilder
                .shapeless(RecipeCategory.MISC,BlockList.IRIDIUM_RAW.get(),9)
                .requires(ItemTagRegistry.RAW_IRIDIUM_BLOCK_ITEM)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.RAW_IRIDIUM_BLOCK_ITEM.get()))
                .save(consumer, shapelessRecipeDir("raw_iridium","block"));

        ShapelessRecipeBuilder
                .shapeless(RecipeCategory.MISC,BlockList.OSMIUM_RAW.get(),9)
                .requires(ItemTagRegistry.RAW_OSMIUM_BLOCK_ITEM)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.RAW_OSMIUM_BLOCK_ITEM.get()))
                .save(consumer, shapelessRecipeDir("raw_osmium","block"));

        ShapelessRecipeBuilder
                .shapeless(RecipeCategory.MISC,BlockList.PLATINUM_RAW.get(),9)
                .requires(ItemTagRegistry.RAW_PLATINUM_BLOCK_ITEM)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.RAW_PLATINUM_BLOCK_ITEM.get()))
                .save(consumer, shapelessRecipeDir("raw_platinum","block"));

        ShapelessRecipeBuilder
                .shapeless(RecipeCategory.MISC,BlockList.SILVER_RAW.get(),9)
                .requires(ItemTagRegistry.RAW_SILVER_BLOCK_ITEM)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.RAW_SILVER_BLOCK_ITEM.get()))
                .save(consumer, shapelessRecipeDir("raw_silver","block"));

        ShapelessRecipeBuilder
                .shapeless(RecipeCategory.MISC,BlockList.TIN_RAW.get(),9)
                .requires(ItemTagRegistry.RAW_TIN_BLOCK_ITEM)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.RAW_TIN_BLOCK_ITEM.get()))
                .save(consumer, shapelessRecipeDir("raw_tin","block"));

        ShapelessRecipeBuilder
                .shapeless(RecipeCategory.MISC,BlockList.URANIUM_RAW.get(),9)
                .requires(ItemTagRegistry.RAW_URANIUM_BLOCK_ITEM)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.RAW_URANIUM_BLOCK_ITEM.get()))
                .save(consumer, shapelessRecipeDir("raw_uranium","block"));

        ShapelessRecipeBuilder
                .shapeless(RecipeCategory.MISC,BlockList.ZINC_RAW.get(),9)
                .requires(ItemTagRegistry.RAW_ZINC_BLOCK_ITEM)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.RAW_ZINC_BLOCK_ITEM.get()))
                .save(consumer, shapelessRecipeDir("raw_zinc","block"));

        ShapelessRecipeBuilder
                .shapeless(RecipeCategory.MISC,BlockList.ALUMINUM_INGOT.get(),9)
                .requires(ItemTagRegistry.ALUMINUM_BLOCK_ITEM)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.ALUMINUM_BLOCK_ITEM.get()))
                .save(consumer, shapelessRecipeDir("aluminum_ingot","block"));

        ShapelessRecipeBuilder
                .shapeless(RecipeCategory.MISC,BlockList.IRIDIUM_INGOT.get(),9)
                .requires(ItemTagRegistry.IRIDIUM_BLOCK_ITEM)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.IRIDIUM_BLOCK_ITEM.get()))
                .save(consumer, shapelessRecipeDir("iridium_ingot","block"));

        ShapelessRecipeBuilder
                .shapeless(RecipeCategory.MISC,BlockList.BRASS_NUGGET.get(),9)
                .requires(ItemTagRegistry.BRASS_INGOT)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.BRASS_INGOT.get()))
                .save(consumer, shapelessRecipeDir("brass_nugget","ingot"));

        ShapelessRecipeBuilder
                .shapeless(RecipeCategory.MISC,BlockList.ALUMINUM_NUGGET.get(),9)
                .requires(ItemTagRegistry.ALUMINUM_INGOT)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.ALUMINUM_INGOT.get()))
                .save(consumer, shapelessRecipeDir("aluminum_nugget","ingot"));

        ShapelessRecipeBuilder
                .shapeless(RecipeCategory.MISC,BlockList.IRIDIUM_NUGGET.get(),9)
                .requires(ItemTagRegistry.IRIDIUM_INGOT)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.IRIDIUM_INGOT.get()))
                .save(consumer, shapelessRecipeDir("iridium_nugget","ingot"));

        ShapelessRecipeBuilder
                .shapeless(RecipeCategory.MISC,BlockList.LEAD_INGOT.get(),9)
                .requires(ItemTagRegistry.LEAD_BLOCK_ITEM)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.LEAD_BLOCK_ITEM.get()))
                .save(consumer, shapelessRecipeDir("lead_ingot","block"));

        ShapelessRecipeBuilder
                .shapeless(RecipeCategory.MISC,BlockList.LEAD_NUGGET.get(),9)
                .requires(ItemTagRegistry.LEAD_INGOT)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.LEAD_INGOT.get()))
                .save(consumer, shapelessRecipeDir("lead_nugget","ingot"));

        ShapelessRecipeBuilder
                .shapeless(RecipeCategory.MISC,BlockList.OSMIUM_INGOT.get(),9)
                .requires(ItemTagRegistry.OSMIUM_BLOCK_ITEM)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.OSMIUM_BLOCK_ITEM.get()))
                .save(consumer, shapelessRecipeDir("osmium_ingot","block"));

        ShapelessRecipeBuilder
                .shapeless(RecipeCategory.MISC,BlockList.OSMIUM_NUGGET.get(),9)
                .requires(ItemTagRegistry.OSMIUM_INGOT)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.OSMIUM_INGOT.get()))
                .save(consumer, shapelessRecipeDir("osmium_nugget","ingot"));

        ShapelessRecipeBuilder
                .shapeless(RecipeCategory.MISC,BlockList.NICKEL_INGOT.get(),9)
                .requires(ItemTagRegistry.NICKEL_BLOCK_ITEM)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.NICKEL_BLOCK_ITEM.get()))
                .save(consumer, shapelessRecipeDir("nickel_ingot","block"));

        ShapelessRecipeBuilder
                .shapeless(RecipeCategory.MISC,BlockList.NICKEL_NUGGET.get(),9)
                .requires(ItemTagRegistry.NICKEL_INGOT)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.NICKEL_INGOT.get()))
                .save(consumer, shapelessRecipeDir("nickel_nugget","ingot"));

        ShapelessRecipeBuilder
                .shapeless(RecipeCategory.MISC,BlockList.PLATINUM_INGOT.get(),9)
                .requires(ItemTagRegistry.PLATINUM_BLOCK_ITEM)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.PLATINUM_BLOCK_ITEM.get()))
                .save(consumer, shapelessRecipeDir("platinum_ingot","block"));

        ShapelessRecipeBuilder
                .shapeless(RecipeCategory.MISC,BlockList.PLATINUM_NUGGET.get(),9)
                .requires(ItemTagRegistry.PLATINUM_INGOT)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.PLATINUM_INGOT.get()))
                .save(consumer, shapelessRecipeDir("platinum_nugget","ingot"));

        ShapelessRecipeBuilder
                .shapeless(RecipeCategory.MISC,BlockList.SILVER_INGOT.get(),9)
                .requires(ItemTagRegistry.SILVER_BLOCK_ITEM)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.SILVER_BLOCK_ITEM.get()))
                .save(consumer, shapelessRecipeDir("silver_ingot","block"));

        ShapelessRecipeBuilder
                .shapeless(RecipeCategory.MISC,BlockList.SILVER_NUGGET.get(),9)
                .requires(ItemTagRegistry.SILVER_INGOT)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.SILVER_INGOT.get()))
                .save(consumer, shapelessRecipeDir("silver_nugget","ingot"));

        ShapelessRecipeBuilder
                .shapeless(RecipeCategory.MISC,BlockList.TIN_INGOT.get(),9)
                .requires(ItemTagRegistry.TIN_BLOCK_ITEM)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.TIN_BLOCK_ITEM.get()))
                .save(consumer, shapelessRecipeDir("tin_ingot","block"));

        ShapelessRecipeBuilder
                .shapeless(RecipeCategory.MISC,BlockList.TIN_NUGGET.get(),9)
                .requires(ItemTagRegistry.TIN_INGOT)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.TIN_INGOT.get()))
                .save(consumer, shapelessRecipeDir("tin_nugget","ingot"));

        ShapelessRecipeBuilder
                .shapeless(RecipeCategory.MISC,BlockList.URANIUM_INGOT.get(),9)
                .requires(ItemTagRegistry.URANIUM_BLOCK_ITEM)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.URANIUM_BLOCK_ITEM.get()))
                .save(consumer, shapelessRecipeDir("uranium_ingot","block"));

        ShapelessRecipeBuilder
                .shapeless(RecipeCategory.MISC,BlockList.URANIUM_NUGGET.get(),9)
                .requires(ItemTagRegistry.URANIUM_INGOT)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.URANIUM_INGOT.get()))
                .save(consumer, shapelessRecipeDir("uranium_nugget","ingot"));

        ShapelessRecipeBuilder
                .shapeless(RecipeCategory.MISC,BlockList.ZINC_INGOT.get(),9)
                .requires(ItemTagRegistry.ZINC_BLOCK_ITEM)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.ZINC_BLOCK_ITEM.get()))
                .save(consumer, shapelessRecipeDir("zinc_ingot","block"));

        ShapelessRecipeBuilder
                .shapeless(RecipeCategory.MISC,BlockList.ZINC_NUGGET.get(),9)
                .requires(ItemTagRegistry.ZINC_INGOT)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.ZINC_INGOT.get()))
                .save(consumer, shapelessRecipeDir("zinc_nugget","ingot"));

        ShapelessRecipeBuilder
                .shapeless(RecipeCategory.MISC,BlockList.BRONZE_INGOT.get(),9)
                .requires(ItemTagRegistry.BRONZE_BLOCK_ITEM)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.BRONZE_BLOCK_ITEM.get()))
                .save(consumer, shapelessRecipeDir("bronze_ingot","block"));

        ShapelessRecipeBuilder
                .shapeless(RecipeCategory.MISC,BlockList.BRONZE_NUGGET.get(),9)
                .requires(ItemTagRegistry.BRONZE_INGOT)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.BRONZE_INGOT.get()))
                .save(consumer, shapelessRecipeDir("bronze_nugget","ingot"));

        ShapelessRecipeBuilder
                .shapeless(RecipeCategory.MISC,BlockList.CONSTANTAN_INGOT.get(),9)
                .requires(ItemTagRegistry.CONSTANTAN_BLOCK_ITEM)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.CONSTANTAN_BLOCK_ITEM.get()))
                .save(consumer, shapelessRecipeDir("constantan_ingot","block"));

        ShapelessRecipeBuilder
                .shapeless(RecipeCategory.MISC,BlockList.CONSTANTAN_NUGGET.get(),9)
                .requires(ItemTagRegistry.CONSTANTAN_INGOT)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.CONSTANTAN_INGOT.get()))
                .save(consumer, shapelessRecipeDir("constantan_nugget","ingot"));

        ShapelessRecipeBuilder
                .shapeless(RecipeCategory.MISC,BlockList.ELECTRUM_INGOT.get(),9)
                .requires(ItemTagRegistry.ELECTRUM_BLOCK_ITEM)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.ELECTRUM_BLOCK_ITEM.get()))
                .save(consumer, shapelessRecipeDir("electrum_ingot","block"));

        ShapelessRecipeBuilder
                .shapeless(RecipeCategory.MISC,BlockList.ELECTRUM_NUGGET.get(),9)
                .requires(ItemTagRegistry.ELECTRUM_INGOT)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.ELECTRUM_INGOT.get()))
                .save(consumer, shapelessRecipeDir("electrum_nugget","ingot"));

        ShapelessRecipeBuilder
                .shapeless(RecipeCategory.MISC,BlockList.COPPER_NUGGET.get(),9)
                .requires(ItemTagRegistry.COPPER_INGOT)
                .unlockedBy(hasCondition,RecipeProvider.has(Items.COPPER_INGOT))
                .save(consumer, shapelessRecipeDir("copper_nugget","ingot"));

        ShapelessRecipeBuilder
                .shapeless(RecipeCategory.MISC,BlockList.ENDERIUM_INGOT.get(),9)
                .requires(ItemTagRegistry.ENDERIUM_BLOCK_ITEM)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.ENDERIUM_BLOCK_ITEM.get()))
                .save(consumer, shapelessRecipeDir("enderium_ingot","block"));

        ShapelessRecipeBuilder
                .shapeless(RecipeCategory.MISC,BlockList.ENDERIUM_NUGGET.get(),9)
                .requires(ItemTagRegistry.ENDERIUM_INGOT)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.ENDERIUM_INGOT.get()))
                .save(consumer, shapelessRecipeDir("enderium_nugget","ingot"));

        ShapelessRecipeBuilder
                .shapeless(RecipeCategory.MISC,BlockList.INVAR_INGOT.get(),9)
                .requires(ItemTagRegistry.INVAR_BLOCK_ITEM)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.INVAR_BLOCK_ITEM.get()))
                .save(consumer, shapelessRecipeDir("invar_ingot","block"));

        ShapelessRecipeBuilder
                .shapeless(RecipeCategory.MISC,BlockList.INVAR_NUGGET.get(),9)
                .requires(ItemTagRegistry.INVAR_INGOT)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.INVAR_INGOT.get()))
                .save(consumer, shapelessRecipeDir("invar_nugget","ingot"));

        ShapelessRecipeBuilder
                .shapeless(RecipeCategory.MISC,BlockList.LUMIUM_INGOT.get(),9)
                .requires(ItemTagRegistry.LUMIUM_BLOCK_ITEM)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.LUMIUM_BLOCK_ITEM.get()))
                .save(consumer, shapelessRecipeDir("lumium_ingot","block"));

        ShapelessRecipeBuilder
                .shapeless(RecipeCategory.MISC,BlockList.LUMIUM_NUGGET.get(),9)
                .requires(ItemTagRegistry.LUMIUM_INGOT)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.LUMIUM_INGOT.get()))
                .save(consumer, shapelessRecipeDir("lumium_nugget","ingot"));

        ShapelessRecipeBuilder
                .shapeless(RecipeCategory.MISC,BlockList.SIGNALUM_INGOT.get(),9)
                .requires(ItemTagRegistry.SIGNALUM_BLOCK_ITEM)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.SIGNALUM_BLOCK_ITEM.get()))
                .save(consumer, shapelessRecipeDir("signalum_ingot","block"));

        ShapelessRecipeBuilder
                .shapeless(RecipeCategory.MISC,BlockList.SIGNALUM_NUGGET.get(),9)
                .requires(ItemTagRegistry.SIGNALUM_INGOT)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.SIGNALUM_INGOT.get()))
                .save(consumer, shapelessRecipeDir("signalum_nugget","ingot"));

        ShapelessRecipeBuilder
                .shapeless(RecipeCategory.MISC,BlockList.STEEL_INGOT.get(),9)
                .requires(ItemTagRegistry.STEEL_BLOCK_ITEM)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.STEEL_BLOCK_ITEM.get()))
                .save(consumer, shapelessRecipeDir("steel_ingot","block"));

        ShapelessRecipeBuilder
                .shapeless(RecipeCategory.MISC,BlockList.STEEL_NUGGET.get(),9)
                .requires(ItemTagRegistry.STEEL_INGOT)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.STEEL_INGOT.get()))
                .save(consumer, shapelessRecipeDir("steel_nugget","ingot"));

        ShapelessRecipeBuilder
                .shapeless(RecipeCategory.MISC,Items.COPPER_INGOT,9)
                .requires(ItemTagRegistry.COPPER_BLOCK_ITEM)
                .unlockedBy(hasCondition,RecipeProvider.has(Items.COPPER_BLOCK))
                .save(consumer, shapelessRecipeDir("copper_ingot","block"));
    }
    private ResourceLocation smeltingRecipeDir(String typeIn, String typeOut) {
        return new ResourceLocation(Reference.MOD_ID,typeIn + "_from_" + typeOut);
    }

    protected void buildSmeltingRecipes(Consumer<FinishedRecipe> consumer) {

        final String hasCondition = "has_item";

        SimpleCookingRecipeBuilder
                .smelting(Ingredient.of(BlockList.BRONZE_DUST.get()), RecipeCategory.MISC,BlockList.BRONZE_INGOT.get(),0.15f,200)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.BRONZE_DUST.get()))
                .save(consumer, smeltingRecipeDir("bronze_ingot","dust"));

        SimpleCookingRecipeBuilder
                .smelting(Ingredient.of(BlockList.BRASS_DUST.get()), RecipeCategory.MISC,BlockList.BRASS_INGOT.get(),0.15f,200)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.BRASS_DUST.get()))
                .save(consumer, smeltingRecipeDir("brass_ingot","dust"));

        SimpleCookingRecipeBuilder
                .smelting(Ingredient.of(BlockList.CONSTANTAN_DUST.get()), RecipeCategory.MISC,BlockList.CONSTANTAN_INGOT.get(),0.15f,200)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.CONSTANTAN_DUST.get()))
                .save(consumer, smeltingRecipeDir("constantan_ingot","dust"));

        SimpleCookingRecipeBuilder
                .smelting(Ingredient.of(BlockList.INVAR_DUST.get()),RecipeCategory.MISC,BlockList.INVAR_INGOT.get(),0.15f,200)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.INVAR_DUST.get()))
                .save(consumer, smeltingRecipeDir("invar_ingot","dust"));

        SimpleCookingRecipeBuilder
                .smelting(Ingredient.of(BlockList.STEEL_DUST.get()),RecipeCategory.MISC,BlockList.STEEL_INGOT.get(),0.15f,200)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.STEEL_DUST.get()))
                .save(consumer, smeltingRecipeDir("steel_ingot","dust"));

        SimpleCookingRecipeBuilder
                .smelting(Ingredient.of(BlockList.LUMIUM_DUST.get()),RecipeCategory.MISC,BlockList.LUMIUM_INGOT.get(),0.15f,200)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.LUMIUM_DUST.get()))
                .save(consumer, smeltingRecipeDir("lumium_ingot","dust"));

        SimpleCookingRecipeBuilder
                .smelting(Ingredient.of(BlockList.IRIDIUM_DUST.get()),RecipeCategory.MISC,BlockList.IRIDIUM_INGOT.get(),0.15f,200)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.IRIDIUM_DUST.get()))
                .save(consumer, smeltingRecipeDir("iridium_ingot","dust"));

        SimpleCookingRecipeBuilder
                .smelting(Ingredient.of(BlockList.ENDERIUM_DUST.get()),RecipeCategory.MISC,BlockList.ENDERIUM_INGOT.get(),0.15f,200)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.ENDERIUM_DUST.get()))
                .save(consumer, smeltingRecipeDir("enderium_ingot","dust"));

        SimpleCookingRecipeBuilder
                .smelting(Ingredient.of(BlockList.SIGNALUM_DUST.get()),RecipeCategory.MISC,BlockList.SIGNALUM_INGOT.get(),0.15f,200)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.SIGNALUM_DUST.get()))
                .save(consumer, smeltingRecipeDir("signalum_ingot","dust"));

        SimpleCookingRecipeBuilder
                .smelting(Ingredient.of(BlockList.ELECTRUM_DUST.get()),RecipeCategory.MISC,BlockList.ELECTRUM_INGOT.get(),0.15f,200)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.ELECTRUM_DUST.get()))
                .save(consumer, smeltingRecipeDir("electrum_ingot","dust"));

        SimpleCookingRecipeBuilder
                .smelting(Ingredient.of(BlockList.IRON_DUST.get()),RecipeCategory.MISC, Items.IRON_INGOT,0.15f,200)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.IRON_DUST.get()))
                .save(consumer, smeltingRecipeDir("iron_ingot","dust"));

        SimpleCookingRecipeBuilder
                .smelting(Ingredient.of(BlockList.GOLD_DUST.get()),RecipeCategory.MISC, Items.GOLD_INGOT,0.15f,200)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.GOLD_DUST.get()))
                .save(consumer, smeltingRecipeDir("gold_ingot","dust"));

        SimpleCookingRecipeBuilder
                .smelting(Ingredient.of(BlockList.COPPER_DUST.get()),RecipeCategory.MISC, Items.COPPER_INGOT,0.15f,200)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.COPPER_DUST.get()))
                .save(consumer, smeltingRecipeDir("copper_ingot","dust"));

        SimpleCookingRecipeBuilder
                .smelting(Ingredient.of(BlockList.ALUMINUM_RAW.get()),RecipeCategory.MISC,BlockList.ALUMINUM_INGOT.get(),0.15f,200)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.ALUMINUM_RAW.get()))
                .save(consumer, smeltingRecipeDir("aluminum_ingot","raw"));

        SimpleCookingRecipeBuilder
                .smelting(Ingredient.of(BlockList.IRIDIUM_RAW.get()),RecipeCategory.MISC,BlockList.IRIDIUM_INGOT.get(),0.15f,200)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.IRIDIUM_RAW.get()))
                .save(consumer, smeltingRecipeDir("iridium_ingot","raw"));

        SimpleCookingRecipeBuilder
                .smelting(Ingredient.of(BlockList.LEAD_RAW.get()),RecipeCategory.MISC,BlockList.LEAD_INGOT.get(),0.15f,200)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.LEAD_RAW.get()))
                .save(consumer, smeltingRecipeDir("lead_ingot","raw"));

        SimpleCookingRecipeBuilder
                .smelting(Ingredient.of(BlockList.OSMIUM_RAW.get()),RecipeCategory.MISC,BlockList.OSMIUM_INGOT.get(),0.15f,200)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.OSMIUM_RAW.get()))
                .save(consumer, smeltingRecipeDir("osmium_ingot","raw"));

        SimpleCookingRecipeBuilder
                .smelting(Ingredient.of(BlockList.NICKEL_RAW.get()),RecipeCategory.MISC,BlockList.NICKEL_INGOT.get(),0.15f,200)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.NICKEL_RAW.get()))
                .save(consumer, smeltingRecipeDir("nickel_ingot","raw"));

        SimpleCookingRecipeBuilder
                .smelting(Ingredient.of(BlockList.PLATINUM_RAW.get()),RecipeCategory.MISC,BlockList.PLATINUM_INGOT.get(),0.15f,200)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.PLATINUM_RAW.get()))
                .save(consumer, smeltingRecipeDir("platinum_ingot","raw"));

        SimpleCookingRecipeBuilder
                .smelting(Ingredient.of(BlockList.SILVER_RAW.get()),RecipeCategory.MISC,BlockList.SILVER_INGOT.get(),0.15f,200)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.SILVER_RAW.get()))
                .save(consumer, smeltingRecipeDir("silver_ingot","raw"));

        SimpleCookingRecipeBuilder
                .smelting(Ingredient.of(BlockList.TIN_RAW.get()),RecipeCategory.MISC,BlockList.TIN_INGOT.get(),0.15f,200)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.TIN_RAW.get()))
                .save(consumer, smeltingRecipeDir("tin_ingot","raw"));

        SimpleCookingRecipeBuilder
                .smelting(Ingredient.of(BlockList.URANIUM_RAW.get()),RecipeCategory.MISC,BlockList.URANIUM_INGOT.get(),0.15f,200)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.URANIUM_RAW.get()))
                .save(consumer, smeltingRecipeDir("uranium_ingot","raw"));

        SimpleCookingRecipeBuilder
                .smelting(Ingredient.of(BlockList.ZINC_RAW.get()),RecipeCategory.MISC,BlockList.ZINC_INGOT.get(),0.15f,200)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.ZINC_RAW.get()))
                .save(consumer, smeltingRecipeDir("zinc_ingot","raw"));

        SimpleCookingRecipeBuilder
                .smelting(Ingredient.of(BlockList.ALUMINUM_ORE.get()),RecipeCategory.MISC,BlockList.ALUMINUM_INGOT.get(),0.15f,200)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.ALUMINUM_ORE.get()))
                .save(consumer, smeltingRecipeDir("aluminum_ingot","ore"));

        SimpleCookingRecipeBuilder
                .smelting(Ingredient.of(BlockList.IRIDIUM_ORE.get()),RecipeCategory.MISC,BlockList.IRIDIUM_INGOT.get(),0.15f,200)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.IRIDIUM_ORE.get()))
                .save(consumer, smeltingRecipeDir("iridium_ingot","ore"));

        SimpleCookingRecipeBuilder
                .smelting(Ingredient.of(BlockList.LEAD_ORE.get()),RecipeCategory.MISC,BlockList.LEAD_INGOT.get(),0.15f,200)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.LEAD_ORE.get()))
                .save(consumer, smeltingRecipeDir("lead_ingot","ore"));

        SimpleCookingRecipeBuilder
                .smelting(Ingredient.of(BlockList.OSMIUM_ORE.get()),RecipeCategory.MISC,BlockList.OSMIUM_INGOT.get(),0.15f,200)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.OSMIUM_ORE.get()))
                .save(consumer, smeltingRecipeDir("osmium_ingot","ore"));

        SimpleCookingRecipeBuilder
                .smelting(Ingredient.of(BlockList.NICKEL_ORE.get()),RecipeCategory.MISC,BlockList.NICKEL_INGOT.get(),0.15f,200)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.NICKEL_ORE.get()))
                .save(consumer, smeltingRecipeDir("nickel_ingot","ore"));

        SimpleCookingRecipeBuilder
                .smelting(Ingredient.of(BlockList.PLATINUM_ORE.get()),RecipeCategory.MISC,BlockList.PLATINUM_INGOT.get(),0.15f,200)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.PLATINUM_ORE.get()))
                .save(consumer, smeltingRecipeDir("platinum_ingot","ore"));

        SimpleCookingRecipeBuilder
                .smelting(Ingredient.of(BlockList.SILVER_ORE.get()),RecipeCategory.MISC,BlockList.SILVER_INGOT.get(),0.15f,200)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.SILVER_ORE.get()))
                .save(consumer, smeltingRecipeDir("silver_ingot","ore"));

        SimpleCookingRecipeBuilder
                .smelting(Ingredient.of(BlockList.TIN_ORE.get()),RecipeCategory.MISC,BlockList.TIN_INGOT.get(),0.15f,200)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.TIN_ORE.get()))
                .save(consumer, smeltingRecipeDir("tin_ingot","ore"));

        SimpleCookingRecipeBuilder
                .smelting(Ingredient.of(BlockList.URANIUM_ORE.get()),RecipeCategory.MISC,BlockList.URANIUM_INGOT.get(),0.15f,200)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.URANIUM_ORE.get()))
                .save(consumer, smeltingRecipeDir("uranium_ingot","ore"));

        SimpleCookingRecipeBuilder
                .smelting(Ingredient.of(BlockList.ZINC_ORE.get()),RecipeCategory.MISC,BlockList.ZINC_INGOT.get(),0.15f,200)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.ZINC_ORE.get()))
                .save(consumer, smeltingRecipeDir("zinc_ingot","ore"));


        SimpleCookingRecipeBuilder
                .smelting(Ingredient.of(BlockList.ALUMINUM_SLATE_ORE.get()),RecipeCategory.MISC,BlockList.ALUMINUM_INGOT.get(),0.15f,200)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.ALUMINUM_SLATE_ORE.get()))
                .save(consumer, smeltingRecipeDir("aluminum_ingot","slate_ore"));

        SimpleCookingRecipeBuilder
                .smelting(Ingredient.of(BlockList.IRIDIUM_SLATE_ORE.get()),RecipeCategory.MISC,BlockList.IRIDIUM_INGOT.get(),0.15f,200)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.IRIDIUM_SLATE_ORE.get()))
                .save(consumer, smeltingRecipeDir("iridium_ingot","slate_ore"));

        SimpleCookingRecipeBuilder
                .smelting(Ingredient.of(BlockList.LEAD_SLATE_ORE.get()),RecipeCategory.MISC,BlockList.LEAD_INGOT.get(),0.15f,200)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.LEAD_SLATE_ORE.get()))
                .save(consumer, smeltingRecipeDir("lead_ingot","slate_ore"));

        SimpleCookingRecipeBuilder
                .smelting(Ingredient.of(BlockList.OSMIUM_SLATE_ORE.get()),RecipeCategory.MISC,BlockList.OSMIUM_INGOT.get(),0.15f,200)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.OSMIUM_SLATE_ORE.get()))
                .save(consumer, smeltingRecipeDir("osmium_ingot","slate_ore"));

        SimpleCookingRecipeBuilder
                .smelting(Ingredient.of(BlockList.NICKEL_SLATE_ORE.get()),RecipeCategory.MISC,BlockList.NICKEL_INGOT.get(),0.15f,200)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.NICKEL_SLATE_ORE.get()))
                .save(consumer, smeltingRecipeDir("nickel_ingot","slate_ore"));

        SimpleCookingRecipeBuilder
                .smelting(Ingredient.of(BlockList.PLATINUM_SLATE_ORE.get()),RecipeCategory.MISC,BlockList.PLATINUM_INGOT.get(),0.15f,200)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.PLATINUM_SLATE_ORE.get()))
                .save(consumer, smeltingRecipeDir("platinum_ingot","slate_ore"));

        SimpleCookingRecipeBuilder
                .smelting(Ingredient.of(BlockList.SILVER_SLATE_ORE.get()),RecipeCategory.MISC,BlockList.SILVER_INGOT.get(),0.15f,200)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.SILVER_SLATE_ORE.get()))
                .save(consumer, smeltingRecipeDir("silver_ingot","slate_ore"));

        SimpleCookingRecipeBuilder
                .smelting(Ingredient.of(BlockList.TIN_SLATE_ORE.get()),RecipeCategory.MISC,BlockList.TIN_INGOT.get(),0.15f,200)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.TIN_SLATE_ORE.get()))
                .save(consumer, smeltingRecipeDir("tin_ingot","slate_ore"));

        SimpleCookingRecipeBuilder
                .smelting(Ingredient.of(BlockList.URANIUM_SLATE_ORE.get()),RecipeCategory.MISC,BlockList.URANIUM_INGOT.get(),0.15f,200)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.URANIUM_SLATE_ORE.get()))
                .save(consumer, smeltingRecipeDir("uranium_ingot","slate_ore"));

        SimpleCookingRecipeBuilder
                .smelting(Ingredient.of(BlockList.ZINC_SLATE_ORE.get()),RecipeCategory.MISC,BlockList.ZINC_INGOT.get(),0.15f,200)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.ZINC_SLATE_ORE.get()))
                .save(consumer, smeltingRecipeDir("zinc_ingot","slate_ore"));


    }
}

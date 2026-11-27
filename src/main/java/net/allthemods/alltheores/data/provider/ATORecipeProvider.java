package net.allthemods.alltheores.data.provider;

import net.neoforged.neoforge.common.Tags;

import net.minecraft.core.HolderGetter;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.CookingBookCategory;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;

import net.allthemods.alltheores.api.ATO;
import net.allthemods.alltheores.common.material.Material;
import net.allthemods.alltheores.common.parts.BlockPartType;
import net.allthemods.alltheores.common.parts.ItemPartType;
import net.allthemods.alltheores.core.registry.ATORegistry;
import net.allthemods.alltheores.core.registry.Materials;

import java.util.concurrent.CompletableFuture;

public class ATORecipeProvider extends RecipeProvider {
    private final HolderGetter<Item> items;
    private final RecipeOutput output;
    
    public ATORecipeProvider(HolderLookup.Provider lookupProvider, RecipeOutput output) {
        super(lookupProvider, output);
        this.items = lookupProvider.lookupOrThrow(Registries.ITEM);
        this.output = output;
    }
    
    @Override
    protected void buildRecipes() {
        this.addHammerRecipes();
        this.addSpecialRecipes();
        Material.forAll(this::addMaterialRecipes);
    }
    
    private void addHammerRecipes() {
        this.addHammerRecipe(Materials.COPPER, ATORegistry.COPPER_ORE_HAMMER.get());
        this.addHammerRecipe(Materials.IRON, ATORegistry.IRON_ORE_HAMMER.get());
        this.addHammerRecipe(Materials.BRONZE, ATORegistry.BRONZE_ORE_HAMMER.get());
        this.addHammerRecipe(Materials.INVAR, ATORegistry.INVAR_ORE_HAMMER.get());
        this.addHammerRecipe(Materials.PLATINUM, ATORegistry.PLATINUM_ORE_HAMMER.get());
    }
    
    private void addHammerRecipe(Material material, Item output) {
        material.apply(BlockPartType.BLOCK, ItemPartType.INGOT, (block, ingot) -> this.hammerBuilder(this.itemTag(block.getTag()), output)
                .unlockedBy(this.hasName(material.getGroup(), "ingot"), this.has(ingot.getTag()))
                .save(this.output));
    }
    
    private void addSpecialRecipes() {
        this.addCopperRecipes();
        this.addNetheriteRecipes();
        this.addAlloyBlendingRecipes();
    }
    
    private void addMaterialRecipes(Material material) {
        if (material.has(ItemPartType.INGOT)) {
            this.addIngotRecipes(material);
            return;
        }
        
        if (material.has(ItemPartType.GEM)) {
            this.addGemRecipes(material);
            return;
        }
        
        this.addDustRecipes(material);
    }
    
    private void addIngotRecipes(Material material) {
        this.addBasePartRecipes(material, ItemPartType.INGOT, "ingot");
        
        material.apply(ItemPartType.INGOT, ItemPartType.DUST, (ingot, dust) -> {
            this.smelting(material, dust.getTag(), Material.item(ingot), "dust");
            this.blasting(material, dust.getTag(), Material.item(ingot), "dust");
        });
        material.apply(BlockPartType.STONE_ORE, ItemPartType.DUST, (ore, dust) -> this.hammer(material, this.itemTag(ore.getTag()), 2, Material.item(dust), "ore", "dust"));
        
        if (!this.isVanilla(material, ItemPartType.INGOT)) {
            material.apply(BlockPartType.BLOCK, ItemPartType.INGOT, ItemPartType.NUGGET, (block, ingot, nugget) -> {
                this.up(material, nugget.getTag(), Material.item(ingot), "nugget", "ingot");
                this.down(material, ingot.getTag(), Material.item(nugget), "ingot", "nugget");
                
                this.up(material, ingot.getTag(), Material.item(block), "ingot", "block");
                this.down(material, this.itemTag(block.getTag()), Material.item(ingot), "block", "ingot");
            });
        }
        
        if (material.has(ItemPartType.RAW)) {
            this.addRawMaterialRecipes(material);
        }
    }
    
    private void addRawMaterialRecipes(Material material) {
        material.apply(BlockPartType.RAW_BLOCK, ItemPartType.RAW, (rawBlock, raw) -> {
            this.down(material, this.itemTag(rawBlock.getTag()), Material.item(raw), "raw_block", "raw");
            this.up(material, raw.getTag(), Material.item(rawBlock), "raw", "raw_block");
        });
        material.apply(ItemPartType.RAW, ItemPartType.DUST, (raw, dust) -> this.hammer(material, raw.getTag(), 2, Material.item(dust), "raw", "dust"));
        material.apply(ItemPartType.RAW, ItemPartType.INGOT, (raw, ingot) -> {
            this.smelting(material, raw.getTag(), Material.item(ingot), "raw");
            this.blasting(material, raw.getTag(), Material.item(ingot), "raw");
        });
        material.apply(BlockPartType.RAW_BLOCK, BlockPartType.BLOCK, (rawBlock, block) -> {
            this.smelting(material, this.itemTag(rawBlock.getTag()), Material.item(block), "raw_block");
            this.blasting(material, this.itemTag(rawBlock.getTag()), Material.item(block), "raw_block");
        });
        material.apply(BlockPartType.STONE_ORE, ItemPartType.INGOT, (ore, ingot) -> {
            this.smelting(material, this.itemTag(ore.getTag()), Material.item(ingot), "ore");
            this.blasting(material, this.itemTag(ore.getTag()), Material.item(ingot), "ore");
        });
    }
    
    private void addGemRecipes(Material material) {
        this.addBasePartRecipes(material, ItemPartType.GEM, "gem");
        
        if (this.isVanilla(material, ItemPartType.GEM)) {
            material.apply(BlockPartType.STONE_ORE, ItemPartType.DUST, (ore, dust) -> this.hammer(material, this.itemTag(ore.getTag()), 2, Material.item(dust), "ore", "dust"));
            return;
        }
        
        material.apply(BlockPartType.STONE_ORE, ItemPartType.GEM, (ore, gem) -> this.hammer(material, this.itemTag(ore.getTag()), 2, Material.item(gem), "ore", "gem"));
        material.apply(BlockPartType.BLOCK, ItemPartType.GEM, (block, gem) -> {
            this.down(material, this.itemTag(block.getTag()), Material.item(gem), "block", "gem");
            this.up(material, gem.getTag(), Material.item(block), "gem", "block");
        });
    }
    
    private void addDustRecipes(Material material) {
        material.apply(BlockPartType.BLOCK, ItemPartType.DUST, (block, dust) -> {
            this.down(material, this.itemTag(block.getTag()), Material.item(dust), "block", "dust");
            this.up(material, dust.getTag(), Material.item(block), "dust", "block");
        });
        material.apply(BlockPartType.STONE_ORE, ItemPartType.DUST, (ore, dust) -> {
            this.hammer(material, this.itemTag(ore.getTag()), 2, Material.item(dust), "ore", "dust");
            this.smelting(material, this.itemTag(ore.getTag()), Material.item(dust), "ore");
            this.blasting(material, this.itemTag(ore.getTag()), Material.item(dust), "ore");
        });
    }
    
    private void addBasePartRecipes(Material material, ItemPartType type, String partName) {
        material.apply(type, ItemPartType.DUST, (input, dust) -> this.hammer(material, input.getTag(), 1, Material.item(dust), partName, "dust"));
        material.apply(type, ItemPartType.GEAR, (input, gear) -> this.gear(material, input.getTag(), Material.item(gear), partName));
        material.apply(type, ItemPartType.ROD, (input, rod) -> this.rod(material, input.getTag(), Material.item(rod), partName));
        material.apply(type, ItemPartType.PLATE, (input, plate) -> this.plate(material, input.getTag(), Material.item(plate), partName));
    }
    
    private void down(Material material, TagKey<Item> input, Item output, String inputName, String outputName) {
        ShapelessRecipeBuilder.shapeless(this.items, RecipeCategory.MISC, output, 9)
                .requires(input)
                .unlockedBy("has_" + inputName, this.has(input))
                .save(this.output, this.craftingFromToPath(material, inputName, outputName));
    }
    
    private void up(Material material, TagKey<Item> input, Item output, String inputName, String outputName) {
        ShapedRecipeBuilder.shaped(this.items, RecipeCategory.MISC, output)
                .pattern("aaa")
                .pattern("aaa")
                .pattern("aaa")
                .define('a', input)
                .unlockedBy("has_" + outputName, this.has(input))
                .save(this.output, this.craftingFromToPath(material, inputName, outputName));
    }
    
    private void hammer(Material material, TagKey<Item> input, int amount, Item output, String inputName, String outputName) {
        ShapelessRecipeBuilder.shapeless(this.items, RecipeCategory.MISC, output, amount)
                .requires(ATORegistry.ORE_HAMMER)
                .requires(input)
                .unlockedBy("has_hammer", this.has(ATORegistry.ORE_HAMMER))
                .save(this.output, this.hammerPath(material, inputName, outputName));
    }
    
    private ShapedRecipeBuilder hammerBuilder(TagKey<Item> input, Item output) {
        return ShapedRecipeBuilder.shaped(this.items, RecipeCategory.MISC, output)
                .pattern(" as")
                .pattern(" sa")
                .pattern("s  ")
                .define('a', input)
                .define('s', Tags.Items.RODS_WOODEN);
    }
    
    private void gear(Material material, TagKey<Item> inputs, Item output, String inputName) {
        ShapedRecipeBuilder.shaped(this.items, RecipeCategory.MISC, output)
                .pattern(" a ")
                .pattern("ana")
                .pattern(" a ")
                .define('a', inputs)
                .define('n', Tags.Items.NUGGETS_IRON)
                .unlockedBy(this.hasName(material.getGroup(), inputName), this.has(inputs))
                .save(this.output, this.craftingPath(material, "gear"));
    }
    
    private void rod(Material material, TagKey<Item> inputs, Item output, String inputName) {
        ShapedRecipeBuilder.shaped(this.items, RecipeCategory.MISC, output)
                .pattern("  a")
                .pattern("ha ")
                .define('a', inputs)
                .define('h', ATORegistry.ORE_HAMMER)
                .unlockedBy(this.hasName(material.getGroup(), inputName), this.has(inputs))
                .save(this.output, this.craftingPath(material, "rod"));
    }
    
    private void plate(Material material, TagKey<Item> inputs, Item output, String inputName) {
        ShapedRecipeBuilder.shaped(this.items, RecipeCategory.MISC, output)
                .pattern("ha ")
                .pattern("a  ")
                .define('a', inputs)
                .define('h', ATORegistry.ORE_HAMMER)
                .unlockedBy(this.hasName(material.getGroup(), inputName), this.has(inputs))
                .save(this.output, this.craftingPath(material, "plate"));
    }
    
    private void smelting(Material material, TagKey<Item> input, Item output, String inputName) {
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(this.items.getOrThrow(input)), RecipeCategory.MISC, CookingBookCategory.MISC, output, 0.7F, 200)
                .unlockedBy(this.hasName(material.getGroup(), inputName), this.has(input))
                .save(this.output, this.smeltingPath(material, inputName));
    }
    
    private void blasting(Material material, TagKey<Item> input, Item output, String inputName) {
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(this.items.getOrThrow(input)), RecipeCategory.MISC, CookingBookCategory.MISC, output, 0.7F, 100)
                .unlockedBy(this.hasName(material.getGroup(), inputName), this.has(input))
                .save(this.output, this.blastingPath(material, inputName));
    }
    
    private String craftingPath(Material material, String name) {
        return ATO.id("crafting/" + material.getGroup() + "/" + name).toString();
    }
    
    private String craftingFromToPath(Material material, String from, String to) {
        return ATO.id("crafting/" + material.getGroup() + "/" + from + "_to_" + to).toString();
    }
    
    private String alloyBlendingPath(Material material) {
        return ATO.id("crafting/alloy_blending/" + material.getGroup()).toString();
    }
    
    private String hammerPath(Material material, String inputName, String outputName) {
        return ATO.id("crafting/hammer/" + material.getGroup() + "/" + outputName + "_from_" + inputName).toString();
    }
    
    private TagKey<Item> itemTag(TagKey<Block> tag) {
        return TagKey.create(Registries.ITEM, tag.location());
    }
    
    private String smeltingPath(Material material, String inputName) {
        return ATO.id("smelting/" + material.getGroup() + "/" + inputName + "_from_smelting").toString();
    }
    
    private String blastingPath(Material material, String inputName) {
        return ATO.id("smelting/" + material.getGroup() + "/" + inputName + "_from_blasting").toString();
    }
    
    private String hasName(String group, String suffix) {
        return "has_" + group + "_" + suffix;
    }
    
    private boolean isVanilla(Material material, ItemPartType type) {
        final boolean[] isVanilla = { false };
        material.apply(type, part -> isVanilla[0] = part.isVanilla());
        return isVanilla[0];
    }
    
    private void addCopperRecipes() {
        this.up(Materials.COPPER, ItemPartType.NUGGET.getTag("copper"), Items.COPPER_INGOT, "nugget", "ingot");
        this.down(Materials.COPPER, ItemPartType.INGOT.getTag("copper"), Items.COPPER_NUGGET, "ingot", "nugget");
    }
    
    private void addNetheriteRecipes() {
        ShapelessRecipeBuilder.shapeless(this.items, RecipeCategory.MISC, Items.NETHERITE_SCRAP, 2)
                .requires(ATORegistry.ORE_HAMMER)
                .requires(Items.ANCIENT_DEBRIS)
                .unlockedBy("has_hammer", this.has(ATORegistry.ORE_HAMMER))
                .save(this.output, ATO.id("crafting/hammer/netherite/scrap_from_debris").toString());
    }
    
    private void addAlloyBlendingRecipes() {
        this.alloyBlend(Materials.INVAR, 3, false,
                RecipeIngredient.tag(ItemPartType.DUST.getTag("iron"), 2),
                RecipeIngredient.tag(ItemPartType.DUST.getTag("nickel"))
        );
        this.alloyBlend(Materials.STEEL, 1, true,
                RecipeIngredient.tag(ItemPartType.DUST.getTag("iron")),
                RecipeIngredient.item(Items.COAL, 4)
        );
        this.alloyBlend(Materials.ELECTRUM, 2, false,
                RecipeIngredient.tag(ItemPartType.DUST.getTag("gold")),
                RecipeIngredient.tag(ItemPartType.DUST.getTag("silver"))
        );
        this.alloyBlend(Materials.BRONZE, 4, false,
                RecipeIngredient.tag(ItemPartType.DUST.getTag("copper"), 3),
                RecipeIngredient.tag(ItemPartType.DUST.getTag("tin"))
        );
        this.alloyBlend(Materials.BRASS, 4, false,
                RecipeIngredient.tag(ItemPartType.DUST.getTag("copper"), 3),
                RecipeIngredient.tag(ItemPartType.DUST.getTag("zinc"))
        );
        this.alloyBlend(Materials.LUMIUM, 4, false,
                RecipeIngredient.item(Items.GLOWSTONE_DUST, 4),
                RecipeIngredient.tag(ItemPartType.DUST.getTag("silver")),
                RecipeIngredient.tag(ItemPartType.DUST.getTag("tin"), 3)
        );
        this.alloyBlend(Materials.CONSTANTAN, 2, false,
                RecipeIngredient.tag(ItemPartType.DUST.getTag("copper")),
                RecipeIngredient.tag(ItemPartType.DUST.getTag("nickel"))
        );
        this.alloyBlend(Materials.SIGNALUM, 4, false,
                RecipeIngredient.tag(ItemPartType.DUST.getTag("copper"), 3),
                RecipeIngredient.tag(ItemPartType.DUST.getTag("silver")),
                RecipeIngredient.item(Items.REDSTONE, 4)
        );
        this.alloyBlend(Materials.ENDERIUM, 4, true,
                RecipeIngredient.tag(ItemPartType.DUST.getTag("lead"), 3),
                RecipeIngredient.tag(ItemPartType.DUST.getTag("platinum")),
                RecipeIngredient.item(Items.ENDER_PEARL, 2)
        );
    }
    
    private void alloyBlend(Material material, int amount, boolean requiresHammer, RecipeIngredient... ingredients) {
        ShapelessRecipeBuilder builder = ShapelessRecipeBuilder.shapeless(this.items, RecipeCategory.MISC, Material.item(material.get(ItemPartType.DUST)), amount);
        if (requiresHammer) {
            builder.requires(ATORegistry.ORE_HAMMER);
        }
        for (RecipeIngredient ingredient : ingredients) {
            ingredient.addTo(builder);
        }
        builder.unlockedBy("has_hammer", this.has(ATORegistry.ORE_HAMMER))
                .save(this.output, this.alloyBlendingPath(material));
    }
    
    private record RecipeIngredient(Item item, TagKey<Item> tag, int count) {
        private static RecipeIngredient item(Item item) {
            return RecipeIngredient.item(item, 1);
        }
        
        private static RecipeIngredient item(Item item, int count) {
            return new RecipeIngredient(item, null, count);
        }
        
        private static RecipeIngredient tag(TagKey<Item> tag) {
            return RecipeIngredient.tag(tag, 1);
        }
        
        private static RecipeIngredient tag(TagKey<Item> tag, int count) {
            return new RecipeIngredient(null, tag, count);
        }
        
        private void addTo(ShapelessRecipeBuilder builder) {
            for (int i = 0; i < this.count; i++) {
                if (this.item != null) {
                    builder.requires(this.item);
                    continue;
                }
                builder.requires(this.tag);
            }
        }
    }
    
    public static class Runner extends RecipeProvider.Runner {
        public Runner(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
            super(output, lookupProvider);
        }
        
        @Override
        protected RecipeProvider createRecipeProvider(HolderLookup.Provider lookupProvider, RecipeOutput output) {
            return new ATORecipeProvider(lookupProvider, output);
        }
        
        @Override
        public String getName() {
            return "AllTheOres recipes";
        }
    }
}

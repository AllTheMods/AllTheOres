package net.allthemods.alltheores.worldgen.features;

import com.google.common.collect.ImmutableList;
import net.allthemods.alltheores.blocks.BlockList;
import net.allthemods.alltheores.infos.ItemTagRegistry;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

public class ATOOtherFeatures {

    public static final ImmutableList<OreConfiguration.TargetBlockState> ORE_ALUMINUM_TARGET_LIST = ImmutableList.of(OreConfiguration.target(new TagMatchTest(ItemTagRegistry.ANCIENT_STONE), BlockList.OTHER_ALUMINUM_ORE.get().defaultBlockState()), OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, BlockList.ALUMINUM_SLATE_ORE.get().defaultBlockState()), OreConfiguration.target(OreFeatures.NETHERRACK,BlockList.ALUMINUM_NETHER_ORE.get().defaultBlockState()));
    public static final ImmutableList<OreConfiguration.TargetBlockState> ORE_LEAD_TARGET_LIST = ImmutableList.of(OreConfiguration.target(new TagMatchTest(ItemTagRegistry.ANCIENT_STONE), BlockList.OTHER_LEAD_ORE.get().defaultBlockState()), OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, BlockList.LEAD_SLATE_ORE.get().defaultBlockState()), OreConfiguration.target(OreFeatures.NETHERRACK,BlockList.LEAD_NETHER_ORE.get().defaultBlockState()));
    public static final ImmutableList<OreConfiguration.TargetBlockState> ORE_NICKEL_TARGET_LIST = ImmutableList.of(OreConfiguration.target(new TagMatchTest(ItemTagRegistry.ANCIENT_STONE), BlockList.OTHER_NICKEL_ORE.get().defaultBlockState()), OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, BlockList.NICKEL_SLATE_ORE.get().defaultBlockState()), OreConfiguration.target(OreFeatures.NETHERRACK,BlockList.NICKEL_NETHER_ORE.get().defaultBlockState()));
    public static final ImmutableList<OreConfiguration.TargetBlockState> ORE_OSMIUM_TARGET_LIST = ImmutableList.of(OreConfiguration.target(new TagMatchTest(ItemTagRegistry.ANCIENT_STONE), BlockList.OTHER_OSMIUM_ORE.get().defaultBlockState()), OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, BlockList.OSMIUM_SLATE_ORE.get().defaultBlockState()), OreConfiguration.target(OreFeatures.NETHERRACK,BlockList.OSMIUM_NETHER_ORE.get().defaultBlockState()));
    public static final ImmutableList<OreConfiguration.TargetBlockState> ORE_PLATINUM_TARGET_LIST = ImmutableList.of(OreConfiguration.target(new TagMatchTest(ItemTagRegistry.ANCIENT_STONE), BlockList.OTHER_PLATINUM_ORE.get().defaultBlockState()), OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, BlockList.PLATINUM_SLATE_ORE.get().defaultBlockState()), OreConfiguration.target(OreFeatures.NETHERRACK,BlockList.PLATINUM_NETHER_ORE.get().defaultBlockState()));
    public static final ImmutableList<OreConfiguration.TargetBlockState> ORE_SILVER_TARGET_LIST = ImmutableList.of(OreConfiguration.target(new TagMatchTest(ItemTagRegistry.ANCIENT_STONE), BlockList.OTHER_SILVER_ORE.get().defaultBlockState()), OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, BlockList.SILVER_SLATE_ORE.get().defaultBlockState()), OreConfiguration.target(OreFeatures.NETHERRACK,BlockList.SILVER_NETHER_ORE.get().defaultBlockState()));
    public static final ImmutableList<OreConfiguration.TargetBlockState> ORE_TIN_TARGET_LIST = ImmutableList.of(OreConfiguration.target(new TagMatchTest(ItemTagRegistry.ANCIENT_STONE), BlockList.OTHER_TIN_ORE.get().defaultBlockState()), OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, BlockList.TIN_SLATE_ORE.get().defaultBlockState()), OreConfiguration.target(OreFeatures.NETHERRACK,BlockList.TIN_NETHER_ORE.get().defaultBlockState()));
    public static final ImmutableList<OreConfiguration.TargetBlockState> ORE_URANIUM_TARGET_LIST = ImmutableList.of(OreConfiguration.target(new TagMatchTest(ItemTagRegistry.ANCIENT_STONE), BlockList.OTHER_URANIUM_ORE.get().defaultBlockState()), OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, BlockList.URANIUM_SLATE_ORE.get().defaultBlockState()), OreConfiguration.target(OreFeatures.NETHERRACK,BlockList.URANIUM_NETHER_ORE.get().defaultBlockState()));
    public static final ImmutableList<OreConfiguration.TargetBlockState> ORE_ZINC_TARGET_LIST = ImmutableList.of(OreConfiguration.target(new TagMatchTest(ItemTagRegistry.ANCIENT_STONE), BlockList.OTHER_ZINC_ORE.get().defaultBlockState()), OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, BlockList.ZINC_SLATE_ORE.get().defaultBlockState()), OreConfiguration.target(OreFeatures.NETHERRACK,BlockList.ZINC_NETHER_ORE.get().defaultBlockState()));

    public static final ImmutableList<OreConfiguration.TargetBlockState> ORE_COAL_TARGET_LIST = ImmutableList.of(OreConfiguration.target(new TagMatchTest(ItemTagRegistry.ANCIENT_STONE), BlockList.OTHER_COAL_ORE.get().defaultBlockState()), OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, Blocks.EMERALD_ORE.defaultBlockState()));
    public static final ImmutableList<OreConfiguration.TargetBlockState> ORE_COPPER_TARGET_LIST = ImmutableList.of(OreConfiguration.target(new TagMatchTest(ItemTagRegistry.ANCIENT_STONE), BlockList.OTHER_COPPER_ORE.get().defaultBlockState()), OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, Blocks.DEEPSLATE_COPPER_ORE.defaultBlockState()));
    public static final ImmutableList<OreConfiguration.TargetBlockState> ORE_DIAMOND_TARGET_LIST = ImmutableList.of(OreConfiguration.target(new TagMatchTest(ItemTagRegistry.ANCIENT_STONE), BlockList.OTHER_DIAMOND_ORE.get().defaultBlockState()), OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, Blocks.DEEPSLATE_DIAMOND_ORE.defaultBlockState()));
    public static final ImmutableList<OreConfiguration.TargetBlockState> ORE_EMERALD_TARGET_LIST = ImmutableList.of(OreConfiguration.target(new TagMatchTest(ItemTagRegistry.ANCIENT_STONE), BlockList.OTHER_EMERALD_ORE.get().defaultBlockState()), OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, Blocks.DEEPSLATE_EMERALD_ORE.defaultBlockState()));
    public static final ImmutableList<OreConfiguration.TargetBlockState> ORE_GOLD_TARGET_LIST = ImmutableList.of(OreConfiguration.target(new TagMatchTest(ItemTagRegistry.ANCIENT_STONE), BlockList.OTHER_GOLD_ORE.get().defaultBlockState()), OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, Blocks.DEEPSLATE_GOLD_ORE.defaultBlockState()));
    public static final ImmutableList<OreConfiguration.TargetBlockState> ORE_IRON_TARGET_LIST = ImmutableList.of(OreConfiguration.target(new TagMatchTest(ItemTagRegistry.ANCIENT_STONE), BlockList.OTHER_IRON_ORE.get().defaultBlockState()), OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, Blocks.DEEPSLATE_IRON_ORE.defaultBlockState()));
    public static final ImmutableList<OreConfiguration.TargetBlockState> ORE_LAPIS_TARGET_LIST = ImmutableList.of(OreConfiguration.target(new TagMatchTest(ItemTagRegistry.ANCIENT_STONE), BlockList.OTHER_LAPIS_ORE.get().defaultBlockState()), OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, Blocks.DEEPSLATE_LAPIS_ORE.defaultBlockState()));
    public static final ImmutableList<OreConfiguration.TargetBlockState> ORE_QUARTZ_TARGET_LIST = ImmutableList.of(OreConfiguration.target(new TagMatchTest(ItemTagRegistry.ANCIENT_STONE), BlockList.OTHER_QUARTZ_ORE.get().defaultBlockState()));
    public static final ImmutableList<OreConfiguration.TargetBlockState> ORE_REDSTONE_TARGET_LIST = ImmutableList.of(OreConfiguration.target(new TagMatchTest(ItemTagRegistry.ANCIENT_STONE), BlockList.OTHER_REDSTONE_ORE.get().defaultBlockState()), OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, Blocks.DEEPSLATE_REDSTONE_ORE.defaultBlockState()));

    public static final OreConfiguration ORE_COAL_CONFIG = new OreConfiguration(ORE_COAL_TARGET_LIST, 17);
    public static final OreConfiguration ORE_COPPER_CONFIG = new OreConfiguration(ORE_COPPER_TARGET_LIST, 20);
    public static final OreConfiguration ORE_DIAMOND_CONFIG = new OreConfiguration(ORE_DIAMOND_TARGET_LIST, 12,0.7f);
    public static final OreConfiguration ORE_EMERALD_CONFIG = new OreConfiguration(ORE_EMERALD_TARGET_LIST, 6);
    public static final OreConfiguration ORE_GOLD_CONFIG = new OreConfiguration(ORE_GOLD_TARGET_LIST, 9);
    public static final OreConfiguration ORE_IRON_CONFIG = new OreConfiguration(ORE_IRON_TARGET_LIST, 9);
    public static final OreConfiguration ORE_LAPIS_CONFIG = new OreConfiguration(ORE_LAPIS_TARGET_LIST, 8,0.5f);
    public static final OreConfiguration ORE_QUARTZ_CONFIG = new OreConfiguration(ORE_QUARTZ_TARGET_LIST, 14);
    public static final OreConfiguration ORE_REDSTONE_CONFIG = new OreConfiguration(ORE_REDSTONE_TARGET_LIST, 8);

    public static Holder<ConfiguredFeature<OreConfiguration, ?>> OTHER_ORE_COAL = FeatureUtils.register("alltheores:other_coal_ore", Feature.ORE,ORE_COAL_CONFIG);
    public static Holder<ConfiguredFeature<OreConfiguration, ?>> OTHER_ORE_COPPER = FeatureUtils.register("alltheores:other_copper_ore",Feature.ORE,ORE_COPPER_CONFIG);
    public static Holder<ConfiguredFeature<OreConfiguration, ?>> OTHER_ORE_DIAMOND = FeatureUtils.register("alltheores:other_diamond_ore",Feature.ORE,ORE_DIAMOND_CONFIG);
    public static Holder<ConfiguredFeature<OreConfiguration, ?>> OTHER_ORE_EMERALD = FeatureUtils.register("alltheores:other_emerald_ore",Feature.ORE,ORE_EMERALD_CONFIG);
    public static Holder<ConfiguredFeature<OreConfiguration, ?>> OTHER_ORE_GOLD = FeatureUtils.register("alltheores:other_gold_ore",Feature.ORE,ORE_GOLD_CONFIG);
    public static Holder<ConfiguredFeature<OreConfiguration, ?>> OTHER_ORE_IRON = FeatureUtils.register("alltheores:other_iron_ore",Feature.ORE,ORE_IRON_CONFIG);
    public static Holder<ConfiguredFeature<OreConfiguration, ?>> OTHER_ORE_LAPIS = FeatureUtils.register("alltheores:other_lapis_ore",Feature.ORE,ORE_LAPIS_CONFIG);
    public static Holder<ConfiguredFeature<OreConfiguration, ?>> OTHER_ORE_QUARTZ = FeatureUtils.register("alltheores:other_quartz_ore",Feature.ORE,ORE_QUARTZ_CONFIG);
    public static Holder<ConfiguredFeature<OreConfiguration, ?>> OTHER_ORE_REDSTONE = FeatureUtils.register("alltheores:other_redstone_ore",Feature.ORE,ORE_REDSTONE_CONFIG);


}

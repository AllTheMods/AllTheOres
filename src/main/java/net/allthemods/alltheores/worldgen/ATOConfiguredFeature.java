package net.allthemods.alltheores.worldgen;

import com.google.common.collect.ImmutableList;
import net.allthemods.alltheores.blocks.BlockList;
import net.allthemods.alltheores.infos.Configuration;
import net.allthemods.alltheores.infos.ItemTagRegistry;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

public class ATOConfiguredFeature {

	public static final ImmutableList<OreConfiguration.TargetBlockState> ORE_ALUMINUM_TARGET_LIST = ImmutableList.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockList.ALUMINUM_ORE.get().defaultBlockState()), OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, BlockList.ALUMINUM_SLATE_ORE.get().defaultBlockState()), OreConfiguration.target(OreFeatures.NETHERRACK,BlockList.ALUMINUM_NETHER_ORE.get().defaultBlockState()),OreConfiguration.target(new BlockMatchTest(Blocks.END_STONE),BlockList.ALUMINUM_END_ORE.get().defaultBlockState()),OreConfiguration.target(new TagMatchTest(ItemTagRegistry.ANCIENT_STONE), BlockList.OTHER_ALUMINUM_ORE.get().defaultBlockState()));
	public static final ImmutableList<OreConfiguration.TargetBlockState> ORE_LEAD_TARGET_LIST = ImmutableList.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockList.LEAD_ORE.get().defaultBlockState()), OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, BlockList.LEAD_SLATE_ORE.get().defaultBlockState()), OreConfiguration.target(OreFeatures.NETHERRACK,BlockList.LEAD_NETHER_ORE.get().defaultBlockState()),OreConfiguration.target(new BlockMatchTest(Blocks.END_STONE),BlockList.LEAD_END_ORE.get().defaultBlockState()),OreConfiguration.target(new TagMatchTest(ItemTagRegistry.ANCIENT_STONE), BlockList.OTHER_LEAD_ORE.get().defaultBlockState()));
	public static final ImmutableList<OreConfiguration.TargetBlockState> ORE_NICKEL_TARGET_LIST = ImmutableList.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockList.NICKEL_ORE.get().defaultBlockState()), OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, BlockList.NICKEL_SLATE_ORE.get().defaultBlockState()), OreConfiguration.target(OreFeatures.NETHERRACK,BlockList.NICKEL_NETHER_ORE.get().defaultBlockState()),OreConfiguration.target(new BlockMatchTest(Blocks.END_STONE),BlockList.NICKEL_END_ORE.get().defaultBlockState()),OreConfiguration.target(new TagMatchTest(ItemTagRegistry.ANCIENT_STONE), BlockList.OTHER_NICKEL_ORE.get().defaultBlockState()));
	public static final ImmutableList<OreConfiguration.TargetBlockState> ORE_OSMIUM_TARGET_LIST = ImmutableList.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockList.OSMIUM_ORE.get().defaultBlockState()), OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, BlockList.OSMIUM_SLATE_ORE.get().defaultBlockState()), OreConfiguration.target(OreFeatures.NETHERRACK,BlockList.OSMIUM_NETHER_ORE.get().defaultBlockState()),OreConfiguration.target(new BlockMatchTest(Blocks.END_STONE),BlockList.OSMIUM_END_ORE.get().defaultBlockState()),OreConfiguration.target(new TagMatchTest(ItemTagRegistry.ANCIENT_STONE), BlockList.OTHER_OSMIUM_ORE.get().defaultBlockState()));
	public static final ImmutableList<OreConfiguration.TargetBlockState> ORE_PLATINUM_TARGET_LIST = ImmutableList.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockList.PLATINUM_ORE.get().defaultBlockState()), OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, BlockList.PLATINUM_SLATE_ORE.get().defaultBlockState()), OreConfiguration.target(OreFeatures.NETHERRACK,BlockList.PLATINUM_NETHER_ORE.get().defaultBlockState()),OreConfiguration.target(new BlockMatchTest(Blocks.END_STONE),BlockList.PLATINUM_END_ORE.get().defaultBlockState()),OreConfiguration.target(new TagMatchTest(ItemTagRegistry.ANCIENT_STONE), BlockList.OTHER_PLATINUM_ORE.get().defaultBlockState()));
	public static final ImmutableList<OreConfiguration.TargetBlockState> ORE_SILVER_TARGET_LIST = ImmutableList.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockList.SILVER_ORE.get().defaultBlockState()), OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, BlockList.SILVER_SLATE_ORE.get().defaultBlockState()), OreConfiguration.target(OreFeatures.NETHERRACK,BlockList.SILVER_NETHER_ORE.get().defaultBlockState()),OreConfiguration.target(new BlockMatchTest(Blocks.END_STONE),BlockList.SILVER_END_ORE.get().defaultBlockState()),OreConfiguration.target(new TagMatchTest(ItemTagRegistry.ANCIENT_STONE), BlockList.OTHER_SILVER_ORE.get().defaultBlockState()));
	public static final ImmutableList<OreConfiguration.TargetBlockState> ORE_TIN_TARGET_LIST = ImmutableList.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockList.TIN_ORE.get().defaultBlockState()), OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, BlockList.TIN_SLATE_ORE.get().defaultBlockState()), OreConfiguration.target(OreFeatures.NETHERRACK,BlockList.TIN_NETHER_ORE.get().defaultBlockState()),OreConfiguration.target(new BlockMatchTest(Blocks.END_STONE),BlockList.TIN_END_ORE.get().defaultBlockState()),OreConfiguration.target(new TagMatchTest(ItemTagRegistry.ANCIENT_STONE), BlockList.OTHER_TIN_ORE.get().defaultBlockState()));
	public static final ImmutableList<OreConfiguration.TargetBlockState> ORE_URANIUM_TARGET_LIST = ImmutableList.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockList.URANIUM_ORE.get().defaultBlockState()), OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, BlockList.URANIUM_SLATE_ORE.get().defaultBlockState()), OreConfiguration.target(OreFeatures.NETHERRACK,BlockList.URANIUM_NETHER_ORE.get().defaultBlockState()),OreConfiguration.target(new BlockMatchTest(Blocks.END_STONE),BlockList.URANIUM_END_ORE.get().defaultBlockState()),OreConfiguration.target(new TagMatchTest(ItemTagRegistry.ANCIENT_STONE), BlockList.OTHER_URANIUM_ORE.get().defaultBlockState()));
	public static final ImmutableList<OreConfiguration.TargetBlockState> ORE_ZINC_TARGET_LIST = ImmutableList.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockList.ZINC_ORE.get().defaultBlockState()), OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, BlockList.ZINC_SLATE_ORE.get().defaultBlockState()), OreConfiguration.target(OreFeatures.NETHERRACK,BlockList.ZINC_NETHER_ORE.get().defaultBlockState()),OreConfiguration.target(new BlockMatchTest(Blocks.END_STONE),BlockList.ZINC_END_ORE.get().defaultBlockState()),OreConfiguration.target(new TagMatchTest(ItemTagRegistry.ANCIENT_STONE), BlockList.OTHER_ZINC_ORE.get().defaultBlockState()));

	public static final ImmutableList<OreConfiguration.TargetBlockState> RAW_ALUMINUM_TARGET_LIST = ImmutableList.of(OreConfiguration.target(new BlockMatchTest(BlockList.ALUMINUM_SLATE_ORE.get()),BlockList.RAW_ALUMINUM_BLOCK.get().defaultBlockState()));
	public static final ImmutableList<OreConfiguration.TargetBlockState> RAW_LEAD_TARGET_LIST = ImmutableList.of(OreConfiguration.target(new BlockMatchTest(BlockList.LEAD_SLATE_ORE.get()),BlockList.RAW_LEAD_BLOCK.get().defaultBlockState()));
	public static final ImmutableList<OreConfiguration.TargetBlockState> RAW_NICKEL_TARGET_LIST = ImmutableList.of(OreConfiguration.target(new BlockMatchTest(BlockList.NICKEL_SLATE_ORE.get()),BlockList.RAW_NICKEL_BLOCK.get().defaultBlockState()));
	public static final ImmutableList<OreConfiguration.TargetBlockState> RAW_OSMIUM_TARGET_LIST = ImmutableList.of(OreConfiguration.target(new BlockMatchTest(BlockList.OSMIUM_SLATE_ORE.get()),BlockList.RAW_OSMIUM_BLOCK.get().defaultBlockState()));
	public static final ImmutableList<OreConfiguration.TargetBlockState> RAW_PLATINUM_TARGET_LIST = ImmutableList.of(OreConfiguration.target(new BlockMatchTest(BlockList.PLATINUM_SLATE_ORE.get()),BlockList.RAW_PLATINUM_BLOCK.get().defaultBlockState()));
	public static final ImmutableList<OreConfiguration.TargetBlockState> RAW_SILVER_TARGET_LIST = ImmutableList.of(OreConfiguration.target(new BlockMatchTest(BlockList.SILVER_SLATE_ORE.get()),BlockList.RAW_SILVER_BLOCK.get().defaultBlockState()));
	public static final ImmutableList<OreConfiguration.TargetBlockState> RAW_TIN_TARGET_LIST = ImmutableList.of(OreConfiguration.target(new BlockMatchTest(BlockList.TIN_SLATE_ORE.get()),BlockList.RAW_TIN_BLOCK.get().defaultBlockState()));
	public static final ImmutableList<OreConfiguration.TargetBlockState> RAW_URANIUM_TARGET_LIST = ImmutableList.of(OreConfiguration.target(new BlockMatchTest(BlockList.URANIUM_SLATE_ORE.get()),BlockList.RAW_URANIUM_BLOCK.get().defaultBlockState()));
	public static final ImmutableList<OreConfiguration.TargetBlockState> RAW_ZINC_TARGET_LIST = ImmutableList.of(OreConfiguration.target(new BlockMatchTest(BlockList.ZINC_SLATE_ORE.get()),BlockList.RAW_ZINC_BLOCK.get().defaultBlockState()));

	public static final OreConfiguration ORE_ALUMINUM_CONFIG = new OreConfiguration(ORE_ALUMINUM_TARGET_LIST, Configuration.COMMON.aluminum_SpawnSize.get());
	public static final OreConfiguration ORE_LEAD_CONFIG = new OreConfiguration(ORE_LEAD_TARGET_LIST, Configuration.COMMON.lead_SpawnSize.get());
	public static final OreConfiguration ORE_NICKEL_CONFIG = new OreConfiguration(ORE_NICKEL_TARGET_LIST, Configuration.COMMON.nickel_SpawnSize.get());
	public static final OreConfiguration ORE_OSMIUM_CONFIG = new OreConfiguration(ORE_OSMIUM_TARGET_LIST, Configuration.COMMON.osmium_SpawnSize.get());
	public static final OreConfiguration ORE_PLATINUM_CONFIG = new OreConfiguration(ORE_PLATINUM_TARGET_LIST, Configuration.COMMON.platinum_SpawnSize.get());
	public static final OreConfiguration ORE_SILVER_CONFIG = new OreConfiguration(ORE_SILVER_TARGET_LIST, Configuration.COMMON.silver_SpawnSize.get());
	public static final OreConfiguration ORE_TIN_CONFIG = new OreConfiguration(ORE_TIN_TARGET_LIST, Configuration.COMMON.tin_SpawnSize.get());
	public static final OreConfiguration ORE_URANIUM_CONFIG = new OreConfiguration(ORE_URANIUM_TARGET_LIST, Configuration.COMMON.uranium_SpawnSize.get());
	public static final OreConfiguration ORE_ZINC_CONFIG = new OreConfiguration(ORE_ZINC_TARGET_LIST, Configuration.COMMON.zinc_SpawnSize.get());

	public static final OreConfiguration RAW_ALUMINUM_CONFIG = new OreConfiguration(RAW_ALUMINUM_TARGET_LIST, 1);
	public static final OreConfiguration RAW_LEAD_CONFIG = new OreConfiguration(RAW_LEAD_TARGET_LIST, 1);
	public static final OreConfiguration RAW_NICKEL_CONFIG = new OreConfiguration(RAW_NICKEL_TARGET_LIST, 1);
	public static final OreConfiguration RAW_OSMIUM_CONFIG = new OreConfiguration(RAW_OSMIUM_TARGET_LIST, 1);
	public static final OreConfiguration RAW_PLATINUM_CONFIG = new OreConfiguration(RAW_PLATINUM_TARGET_LIST, 1);
	public static final OreConfiguration RAW_SILVER_CONFIG = new OreConfiguration(RAW_SILVER_TARGET_LIST, 1);
	public static final OreConfiguration RAW_TIN_CONFIG = new OreConfiguration(RAW_TIN_TARGET_LIST, 1);
	public static final OreConfiguration RAW_URANIUM_CONFIG = new OreConfiguration(RAW_URANIUM_TARGET_LIST, 1);
	public static final OreConfiguration RAW_ZINC_CONFIG = new OreConfiguration(RAW_ZINC_TARGET_LIST, 1);


	public static Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_ALUMINUM = FeatureUtils.register("aluminum_ore",Feature.ORE,ORE_ALUMINUM_CONFIG);
	public static Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_LEAD = FeatureUtils.register("lead_ore",Feature.ORE,ORE_LEAD_CONFIG);
	public static Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_NICKEL = FeatureUtils.register("nickel_ore",Feature.ORE,ORE_NICKEL_CONFIG);
	public static Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_OSMIUM = FeatureUtils.register("osmium_ore",Feature.ORE,ORE_OSMIUM_CONFIG);
	public static Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_PLATINUM = FeatureUtils.register("platinum_ore",Feature.ORE,ORE_PLATINUM_CONFIG);
	public static Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_SILVER = FeatureUtils.register("silver_ore",Feature.ORE,ORE_SILVER_CONFIG);
	public static Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_TIN = FeatureUtils.register("tin_ore",Feature.ORE,ORE_TIN_CONFIG);
	public static Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_URANIUM = FeatureUtils.register("uranium_ore",Feature.ORE,ORE_URANIUM_CONFIG);
	public static Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_ZINC = FeatureUtils.register("zinc_ore",Feature.ORE,ORE_ZINC_CONFIG);

	public static Holder<ConfiguredFeature<OreConfiguration, ?>> RAW_ALUMINUM = FeatureUtils.register("raw_aluminum_ore",Feature.ORE,RAW_ALUMINUM_CONFIG);
	public static Holder<ConfiguredFeature<OreConfiguration, ?>> RAW_LEAD = FeatureUtils.register("raw_lead_ore",Feature.ORE,RAW_LEAD_CONFIG);
	public static Holder<ConfiguredFeature<OreConfiguration, ?>> RAW_NICKEL = FeatureUtils.register("raw_nickel_ore",Feature.ORE,RAW_NICKEL_CONFIG);
	public static Holder<ConfiguredFeature<OreConfiguration, ?>> RAW_OSMIUM = FeatureUtils.register("raw_osmium_ore",Feature.ORE,RAW_OSMIUM_CONFIG);
	public static Holder<ConfiguredFeature<OreConfiguration, ?>> RAW_PLATINUM = FeatureUtils.register("raw_platinum_ore",Feature.ORE,RAW_PLATINUM_CONFIG);
	public static Holder<ConfiguredFeature<OreConfiguration, ?>> RAW_SILVER = FeatureUtils.register("raw_silver_ore",Feature.ORE,RAW_SILVER_CONFIG);
	public static Holder<ConfiguredFeature<OreConfiguration, ?>> RAW_TIN = FeatureUtils.register("raw_tin_ore",Feature.ORE,RAW_TIN_CONFIG);
	public static Holder<ConfiguredFeature<OreConfiguration, ?>> RAW_URANIUM = FeatureUtils.register("raw_uranium_ore",Feature.ORE,RAW_URANIUM_CONFIG);
	public static Holder<ConfiguredFeature<OreConfiguration, ?>> RAW_ZINC = FeatureUtils.register("raw_zinc_ore",Feature.ORE,RAW_ZINC_CONFIG);

}

package net.allthemods.alltheores.worldgen;

import com.google.common.collect.ImmutableList;
import net.allthemods.alltheores.blocks.BlockList;
import net.allthemods.alltheores.infos.Configuration;
import net.allthemods.alltheores.infos.Reference;
import net.allthemods.alltheores.worldgen.features.OreVein;
import net.minecraft.core.MappedRegistry;
import net.minecraft.core.Registry;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.data.worldgen.Features;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.OreVeinifier;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.WorldGenSettings;
import net.minecraft.world.level.levelgen.WorldGenerationContext;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.NoOpFeature;
import net.minecraft.world.level.levelgen.feature.OreFeature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.RangeDecoratorConfiguration;
import net.minecraft.world.level.levelgen.heightproviders.UniformHeight;
import net.minecraft.world.level.levelgen.placement.RangeDecorator;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryManager;

import java.io.ObjectInputFilter;

public class ATOConfiguredFeature {

	public static final ImmutableList<OreConfiguration.TargetBlockState> ORE_ALUMINUM_TARGET_LIST = ImmutableList.of(OreConfiguration.target(OreConfiguration.Predicates.STONE_ORE_REPLACEABLES, BlockList.ALUMINUM_ORE.get().defaultBlockState()), OreConfiguration.target(OreConfiguration.Predicates.DEEPSLATE_ORE_REPLACEABLES, BlockList.ALUMINUM_SLATE_ORE.get().defaultBlockState()), OreConfiguration.target(OreConfiguration.Predicates.NETHERRACK,BlockList.ALUMINUM_NETHER_ORE.get().defaultBlockState()),OreConfiguration.target(new BlockMatchTest(Blocks.END_STONE),BlockList.ALUMINUM_END_ORE.get().defaultBlockState()));
	public static final ImmutableList<OreConfiguration.TargetBlockState> ORE_LEAD_TARGET_LIST = ImmutableList.of(OreConfiguration.target(OreConfiguration.Predicates.STONE_ORE_REPLACEABLES, BlockList.LEAD_ORE.get().defaultBlockState()), OreConfiguration.target(OreConfiguration.Predicates.DEEPSLATE_ORE_REPLACEABLES, BlockList.LEAD_SLATE_ORE.get().defaultBlockState()), OreConfiguration.target(OreConfiguration.Predicates.NETHERRACK,BlockList.LEAD_NETHER_ORE.get().defaultBlockState()),OreConfiguration.target(new BlockMatchTest(Blocks.END_STONE),BlockList.LEAD_END_ORE.get().defaultBlockState()));
	public static final ImmutableList<OreConfiguration.TargetBlockState> ORE_NICKEL_TARGET_LIST = ImmutableList.of(OreConfiguration.target(OreConfiguration.Predicates.STONE_ORE_REPLACEABLES, BlockList.NICKEL_ORE.get().defaultBlockState()), OreConfiguration.target(OreConfiguration.Predicates.DEEPSLATE_ORE_REPLACEABLES, BlockList.NICKEL_SLATE_ORE.get().defaultBlockState()), OreConfiguration.target(OreConfiguration.Predicates.NETHERRACK,BlockList.NICKEL_NETHER_ORE.get().defaultBlockState()),OreConfiguration.target(new BlockMatchTest(Blocks.END_STONE),BlockList.NICKEL_END_ORE.get().defaultBlockState()));
	public static final ImmutableList<OreConfiguration.TargetBlockState> ORE_OSMIUM_TARGET_LIST = ImmutableList.of(OreConfiguration.target(OreConfiguration.Predicates.STONE_ORE_REPLACEABLES, BlockList.OSMIUM_ORE.get().defaultBlockState()), OreConfiguration.target(OreConfiguration.Predicates.DEEPSLATE_ORE_REPLACEABLES, BlockList.OSMIUM_SLATE_ORE.get().defaultBlockState()), OreConfiguration.target(OreConfiguration.Predicates.NETHERRACK,BlockList.OSMIUM_NETHER_ORE.get().defaultBlockState()),OreConfiguration.target(new BlockMatchTest(Blocks.END_STONE),BlockList.OSMIUM_END_ORE.get().defaultBlockState()));
	public static final ImmutableList<OreConfiguration.TargetBlockState> ORE_PLATINUM_TARGET_LIST = ImmutableList.of(OreConfiguration.target(OreConfiguration.Predicates.STONE_ORE_REPLACEABLES, BlockList.PLATINUM_ORE.get().defaultBlockState()), OreConfiguration.target(OreConfiguration.Predicates.DEEPSLATE_ORE_REPLACEABLES, BlockList.PLATINUM_SLATE_ORE.get().defaultBlockState()), OreConfiguration.target(OreConfiguration.Predicates.NETHERRACK,BlockList.PLATINUM_NETHER_ORE.get().defaultBlockState()),OreConfiguration.target(new BlockMatchTest(Blocks.END_STONE),BlockList.PLATINUM_END_ORE.get().defaultBlockState()));
	public static final ImmutableList<OreConfiguration.TargetBlockState> ORE_SILVER_TARGET_LIST = ImmutableList.of(OreConfiguration.target(OreConfiguration.Predicates.STONE_ORE_REPLACEABLES, BlockList.SILVER_ORE.get().defaultBlockState()), OreConfiguration.target(OreConfiguration.Predicates.DEEPSLATE_ORE_REPLACEABLES, BlockList.SILVER_SLATE_ORE.get().defaultBlockState()), OreConfiguration.target(OreConfiguration.Predicates.NETHERRACK,BlockList.SILVER_NETHER_ORE.get().defaultBlockState()),OreConfiguration.target(new BlockMatchTest(Blocks.END_STONE),BlockList.SILVER_END_ORE.get().defaultBlockState()));
	public static final ImmutableList<OreConfiguration.TargetBlockState> ORE_TIN_TARGET_LIST = ImmutableList.of(OreConfiguration.target(OreConfiguration.Predicates.STONE_ORE_REPLACEABLES, BlockList.TIN_ORE.get().defaultBlockState()), OreConfiguration.target(OreConfiguration.Predicates.DEEPSLATE_ORE_REPLACEABLES, BlockList.TIN_SLATE_ORE.get().defaultBlockState()), OreConfiguration.target(OreConfiguration.Predicates.NETHERRACK,BlockList.TIN_NETHER_ORE.get().defaultBlockState()),OreConfiguration.target(new BlockMatchTest(Blocks.END_STONE),BlockList.TIN_END_ORE.get().defaultBlockState()));
	public static final ImmutableList<OreConfiguration.TargetBlockState> ORE_URANIUM_TARGET_LIST = ImmutableList.of(OreConfiguration.target(OreConfiguration.Predicates.STONE_ORE_REPLACEABLES, BlockList.URANIUM_ORE.get().defaultBlockState()), OreConfiguration.target(OreConfiguration.Predicates.DEEPSLATE_ORE_REPLACEABLES, BlockList.URANIUM_SLATE_ORE.get().defaultBlockState()), OreConfiguration.target(OreConfiguration.Predicates.NETHERRACK,BlockList.URANIUM_NETHER_ORE.get().defaultBlockState()),OreConfiguration.target(new BlockMatchTest(Blocks.END_STONE),BlockList.URANIUM_END_ORE.get().defaultBlockState()));
	public static final ImmutableList<OreConfiguration.TargetBlockState> ORE_ZINC_TARGET_LIST = ImmutableList.of(OreConfiguration.target(OreConfiguration.Predicates.STONE_ORE_REPLACEABLES, BlockList.ZINC_ORE.get().defaultBlockState()), OreConfiguration.target(OreConfiguration.Predicates.DEEPSLATE_ORE_REPLACEABLES, BlockList.ZINC_SLATE_ORE.get().defaultBlockState()), OreConfiguration.target(OreConfiguration.Predicates.NETHERRACK,BlockList.ZINC_NETHER_ORE.get().defaultBlockState()),OreConfiguration.target(new BlockMatchTest(Blocks.END_STONE),BlockList.ZINC_END_ORE.get().defaultBlockState()));

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

	public static ConfiguredFeature<?, ?> ORE_ALUMINUM = newConfiguredFeature("aluminum_ore",Feature.ORE.configured(ORE_ALUMINUM_CONFIG).rangeTriangle(VerticalAnchor.aboveBottom(Configuration.COMMON.aluminum_MinY.get()), VerticalAnchor.aboveBottom(Configuration.COMMON.aluminum_MaxY.get())).squared().count(Configuration.COMMON.aluminum_SpawnCount.get()));
	public static ConfiguredFeature<?, ?> ORE_LEAD = newConfiguredFeature("lead_ore",Feature.ORE.configured(ORE_LEAD_CONFIG).rangeTriangle(VerticalAnchor.aboveBottom(Configuration.COMMON.lead_MinY.get()), VerticalAnchor.aboveBottom(Configuration.COMMON.lead_MaxY.get())).squared().count(Configuration.COMMON.lead_SpawnCount.get()));
	public static ConfiguredFeature<?, ?> ORE_NICKEL = newConfiguredFeature("nickel_ore",Feature.ORE.configured(ORE_NICKEL_CONFIG).rangeTriangle(VerticalAnchor.aboveBottom(Configuration.COMMON.nickel_MinY.get()), VerticalAnchor.aboveBottom(Configuration.COMMON.nickel_MaxY.get())).squared().count(Configuration.COMMON.nickel_SpawnCount.get()));
	public static ConfiguredFeature<?, ?> ORE_OSMIUM = newConfiguredFeature("osmium_ore",Feature.ORE.configured(ORE_OSMIUM_CONFIG).rangeTriangle(VerticalAnchor.aboveBottom(Configuration.COMMON.osmium_MinY.get()), VerticalAnchor.aboveBottom(Configuration.COMMON.osmium_MaxY.get())).squared().count(Configuration.COMMON.osmium_SpawnCount.get()));
	public static ConfiguredFeature<?, ?> ORE_PLATINUM = newConfiguredFeature("platinum_ore",Feature.ORE.configured(ORE_PLATINUM_CONFIG).rangeTriangle(VerticalAnchor.aboveBottom(Configuration.COMMON.platinum_MinY.get()), VerticalAnchor.aboveBottom(Configuration.COMMON.platinum_MaxY.get())).squared().count(Configuration.COMMON.platinum_SpawnCount.get()));
	public static ConfiguredFeature<?, ?> ORE_SILVER = newConfiguredFeature("silver_ore",Feature.ORE.configured(ORE_SILVER_CONFIG).rangeTriangle(VerticalAnchor.aboveBottom(Configuration.COMMON.silver_MinY.get()), VerticalAnchor.aboveBottom(Configuration.COMMON.silver_MaxY.get())).squared().count(Configuration.COMMON.silver_SpawnCount.get()));
	public static ConfiguredFeature<?, ?> ORE_TIN = newConfiguredFeature("tin_ore",Feature.ORE.configured(ORE_TIN_CONFIG).rangeTriangle(VerticalAnchor.aboveBottom(Configuration.COMMON.tin_MinY.get()), VerticalAnchor.aboveBottom(Configuration.COMMON.tin_MaxY.get())).squared().count(Configuration.COMMON.tin_SpawnCount.get()));
	public static ConfiguredFeature<?, ?> ORE_URANIUM = newConfiguredFeature("uranium_ore",Feature.ORE.configured(ORE_URANIUM_CONFIG).rangeTriangle(VerticalAnchor.aboveBottom(Configuration.COMMON.uranium_MinY.get()), VerticalAnchor.aboveBottom(Configuration.COMMON.uranium_MaxY.get())).squared().count(Configuration.COMMON.uranium_SpawnCount.get()));
	public static ConfiguredFeature<?, ?> ORE_ZINC = newConfiguredFeature("zinc_ore",Feature.ORE.configured(ORE_ZINC_CONFIG).rangeTriangle(VerticalAnchor.aboveBottom(Configuration.COMMON.zinc_MinY.get()), VerticalAnchor.aboveBottom(Configuration.COMMON.zinc_MaxY.get())).squared().count(Configuration.COMMON.zinc_SpawnCount.get()));

	public static ConfiguredFeature<?, ?> NETHER_ORE_ALUMINUM = newConfiguredFeature("nether_aluminum_ore",Feature.ORE.configured(ORE_ALUMINUM_CONFIG).rangeTriangle(VerticalAnchor.aboveBottom(Configuration.COMMON.aluminum_MinY.get()), VerticalAnchor.aboveBottom(Configuration.COMMON.aluminum_MaxY.get())).squared().count(Configuration.COMMON.aluminum_SpawnCount.get()));
	public static ConfiguredFeature<?, ?> NETHER_ORE_LEAD = newConfiguredFeature("nether_lead_ore",Feature.ORE.configured(ORE_LEAD_CONFIG).rangeTriangle(VerticalAnchor.aboveBottom(Configuration.COMMON.lead_MinY.get()), VerticalAnchor.aboveBottom(Configuration.COMMON.lead_MaxY.get())).squared().count(Configuration.COMMON.lead_SpawnCount.get()));
	public static ConfiguredFeature<?, ?> NETHER_ORE_NICKEL = newConfiguredFeature("nether_nickel_ore",Feature.ORE.configured(ORE_NICKEL_CONFIG).rangeTriangle(VerticalAnchor.aboveBottom(Configuration.COMMON.nickel_MinY.get()), VerticalAnchor.aboveBottom(Configuration.COMMON.nickel_MaxY.get())).squared().count(Configuration.COMMON.nickel_SpawnCount.get()));
	public static ConfiguredFeature<?, ?> NETHER_ORE_OSMIUM = newConfiguredFeature("nether_osmium_ore",Feature.ORE.configured(ORE_OSMIUM_CONFIG).rangeTriangle(VerticalAnchor.aboveBottom(Configuration.COMMON.osmium_MinY.get()), VerticalAnchor.aboveBottom(Configuration.COMMON.osmium_MaxY.get())).squared().count(Configuration.COMMON.osmium_SpawnCount.get()));
	public static ConfiguredFeature<?, ?> NETHER_ORE_PLATINUM = newConfiguredFeature("nether_platinum_ore",Feature.ORE.configured(ORE_PLATINUM_CONFIG).rangeTriangle(VerticalAnchor.aboveBottom(Configuration.COMMON.platinum_MinY.get()), VerticalAnchor.aboveBottom(Configuration.COMMON.platinum_MaxY.get())).squared().count(Configuration.COMMON.platinum_SpawnCount.get()));
	public static ConfiguredFeature<?, ?> NETHER_ORE_SILVER = newConfiguredFeature("nether_silver_ore",Feature.ORE.configured(ORE_SILVER_CONFIG).rangeTriangle(VerticalAnchor.aboveBottom(Configuration.COMMON.silver_MinY.get()), VerticalAnchor.aboveBottom(Configuration.COMMON.silver_MaxY.get())).squared().count(Configuration.COMMON.silver_SpawnCount.get()));
	public static ConfiguredFeature<?, ?> NETHER_ORE_TIN = newConfiguredFeature("nether_tin_ore",Feature.ORE.configured(ORE_TIN_CONFIG).rangeTriangle(VerticalAnchor.aboveBottom(Configuration.COMMON.tin_MinY.get()), VerticalAnchor.aboveBottom(Configuration.COMMON.tin_MaxY.get())).squared().count(Configuration.COMMON.tin_SpawnCount.get()));
	public static ConfiguredFeature<?, ?> NETHER_ORE_URANIUM = newConfiguredFeature("nether_uranium_ore",Feature.ORE.configured(ORE_URANIUM_CONFIG).rangeTriangle(VerticalAnchor.aboveBottom(Configuration.COMMON.uranium_MinY.get()), VerticalAnchor.aboveBottom(Configuration.COMMON.uranium_MaxY.get())).squared().count(Configuration.COMMON.uranium_SpawnCount.get()));
	public static ConfiguredFeature<?, ?> NETHER_ORE_ZINC = newConfiguredFeature("nether_zinc_ore",Feature.ORE.configured(ORE_ZINC_CONFIG).rangeTriangle(VerticalAnchor.aboveBottom(Configuration.COMMON.zinc_MinY.get()), VerticalAnchor.aboveBottom(Configuration.COMMON.zinc_MaxY.get())).squared().count(Configuration.COMMON.zinc_SpawnCount.get()));

	public static ConfiguredFeature<?, ?> END_ORE_ALUMINUM = newConfiguredFeature("end_aluminum_ore",Feature.ORE.configured(ORE_ALUMINUM_CONFIG).rangeTriangle(VerticalAnchor.aboveBottom(Configuration.COMMON.aluminum_MinY.get()), VerticalAnchor.aboveBottom(Configuration.COMMON.aluminum_MaxY.get())).squared().count(Configuration.COMMON.aluminum_SpawnCount.get()));
	public static ConfiguredFeature<?, ?> END_ORE_LEAD = newConfiguredFeature("end_lead_ore",Feature.ORE.configured(ORE_LEAD_CONFIG).rangeTriangle(VerticalAnchor.aboveBottom(Configuration.COMMON.lead_MinY.get()), VerticalAnchor.aboveBottom(Configuration.COMMON.lead_MaxY.get())).squared().count(Configuration.COMMON.lead_SpawnCount.get()));
	public static ConfiguredFeature<?, ?> END_ORE_NICKEL = newConfiguredFeature("end_nickel_ore",Feature.ORE.configured(ORE_NICKEL_CONFIG).rangeTriangle(VerticalAnchor.aboveBottom(Configuration.COMMON.nickel_MinY.get()), VerticalAnchor.aboveBottom(Configuration.COMMON.nickel_MaxY.get())).squared().count(Configuration.COMMON.nickel_SpawnCount.get()));
	public static ConfiguredFeature<?, ?> END_ORE_OSMIUM = newConfiguredFeature("end_osmium_ore",Feature.ORE.configured(ORE_OSMIUM_CONFIG).rangeTriangle(VerticalAnchor.aboveBottom(Configuration.COMMON.osmium_MinY.get()), VerticalAnchor.aboveBottom(Configuration.COMMON.osmium_MaxY.get())).squared().count(Configuration.COMMON.osmium_SpawnCount.get()));
	public static ConfiguredFeature<?, ?> END_ORE_PLATINUM = newConfiguredFeature("end_platinum_ore",Feature.ORE.configured(ORE_PLATINUM_CONFIG).rangeTriangle(VerticalAnchor.aboveBottom(Configuration.COMMON.platinum_MinY.get()), VerticalAnchor.aboveBottom(Configuration.COMMON.platinum_MaxY.get())).squared().count(Configuration.COMMON.platinum_SpawnCount.get()));
	public static ConfiguredFeature<?, ?> END_ORE_SILVER = newConfiguredFeature("end_silver_ore",Feature.ORE.configured(ORE_SILVER_CONFIG).rangeTriangle(VerticalAnchor.aboveBottom(Configuration.COMMON.silver_MinY.get()), VerticalAnchor.aboveBottom(Configuration.COMMON.silver_MaxY.get())).squared().count(Configuration.COMMON.silver_SpawnCount.get()));
	public static ConfiguredFeature<?, ?> END_ORE_TIN = newConfiguredFeature("end_tin_ore",Feature.ORE.configured(ORE_TIN_CONFIG).rangeTriangle(VerticalAnchor.aboveBottom(Configuration.COMMON.tin_MinY.get()), VerticalAnchor.aboveBottom(Configuration.COMMON.tin_MaxY.get())).squared().count(Configuration.COMMON.tin_SpawnCount.get()));
	public static ConfiguredFeature<?, ?> END_ORE_URANIUM = newConfiguredFeature("end_uranium_ore",Feature.ORE.configured(ORE_URANIUM_CONFIG).rangeTriangle(VerticalAnchor.aboveBottom(Configuration.COMMON.uranium_MinY.get()), VerticalAnchor.aboveBottom(Configuration.COMMON.uranium_MaxY.get())).squared().count(Configuration.COMMON.uranium_SpawnCount.get()));
	public static ConfiguredFeature<?, ?> END_ORE_ZINC = newConfiguredFeature("end_zinc_ore",Feature.ORE.configured(ORE_ZINC_CONFIG).rangeTriangle(VerticalAnchor.aboveBottom(Configuration.COMMON.zinc_MinY.get()), VerticalAnchor.aboveBottom(Configuration.COMMON.zinc_MaxY.get())).squared().count(Configuration.COMMON.zinc_SpawnCount.get()));

	public static ConfiguredFeature<?, ?> RAW_ALUMINUM = newConfiguredFeature("raw_aluminum_ore",Feature.ORE.configured(RAW_ALUMINUM_CONFIG).rangeTriangle(VerticalAnchor.aboveBottom(Configuration.COMMON.aluminum_MinY.get()), VerticalAnchor.aboveBottom(Configuration.COMMON.aluminum_MaxY.get())).rarity(100).squared().count(1));
	public static ConfiguredFeature<?, ?> RAW_LEAD = newConfiguredFeature("raw_lead_ore",Feature.ORE.configured(RAW_LEAD_CONFIG).rangeTriangle(VerticalAnchor.aboveBottom(Configuration.COMMON.lead_MinY.get()), VerticalAnchor.aboveBottom(Configuration.COMMON.lead_MaxY.get())).rarity(100).squared().count(1));
	public static ConfiguredFeature<?, ?> RAW_NICKEL = newConfiguredFeature("raw_nickel_ore",Feature.ORE.configured(RAW_NICKEL_CONFIG).rangeTriangle(VerticalAnchor.aboveBottom(Configuration.COMMON.nickel_MinY.get()), VerticalAnchor.aboveBottom(Configuration.COMMON.nickel_MaxY.get())).rarity(100).squared().count(1));
	public static ConfiguredFeature<?, ?> RAW_OSMIUM = newConfiguredFeature("raw_osmium_ore",Feature.ORE.configured(RAW_OSMIUM_CONFIG).rangeTriangle(VerticalAnchor.aboveBottom(Configuration.COMMON.osmium_MinY.get()), VerticalAnchor.aboveBottom(Configuration.COMMON.osmium_MaxY.get())).rarity(100).squared().count(1));
	public static ConfiguredFeature<?, ?> RAW_PLATINUM = newConfiguredFeature("raw_platinum_ore",Feature.ORE.configured(RAW_PLATINUM_CONFIG).rangeTriangle(VerticalAnchor.aboveBottom(Configuration.COMMON.platinum_MinY.get()), VerticalAnchor.aboveBottom(Configuration.COMMON.platinum_MaxY.get())).rarity(100).squared().count(1));
	public static ConfiguredFeature<?, ?> RAW_SILVER = newConfiguredFeature("raw_silver_ore",Feature.ORE.configured(RAW_SILVER_CONFIG).rangeTriangle(VerticalAnchor.aboveBottom(Configuration.COMMON.silver_MinY.get()), VerticalAnchor.aboveBottom(Configuration.COMMON.silver_MaxY.get())).rarity(100).squared().count(1));
	public static ConfiguredFeature<?, ?> RAW_TIN = newConfiguredFeature("raw_tin_ore",Feature.ORE.configured(RAW_TIN_CONFIG).rangeTriangle(VerticalAnchor.aboveBottom(Configuration.COMMON.tin_MinY.get()), VerticalAnchor.aboveBottom(Configuration.COMMON.tin_MaxY.get())).rarity(100).squared().count(1));
	public static ConfiguredFeature<?, ?> RAW_URANIUM = newConfiguredFeature("raw_uranium_ore",Feature.ORE.configured(RAW_URANIUM_CONFIG).rangeTriangle(VerticalAnchor.aboveBottom(Configuration.COMMON.uranium_MinY.get()), VerticalAnchor.aboveBottom(Configuration.COMMON.uranium_MaxY.get())).rarity(100).squared().count(1));
	public static ConfiguredFeature<?, ?> RAW_ZINC = newConfiguredFeature("raw_zinc_ore",Feature.ORE.configured(RAW_ZINC_CONFIG).rangeTriangle(VerticalAnchor.aboveBottom(Configuration.COMMON.zinc_MinY.get()), VerticalAnchor.aboveBottom(Configuration.COMMON.zinc_MaxY.get())).rarity(100).squared().count(1));

	public static ConfiguredFeature<?, ?> newConfiguredFeature(String registryName,
			ConfiguredFeature<?, ?> configuredFeature) {
				Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(Reference.MOD_ID, registryName),
				configuredFeature);

		return configuredFeature;
	}

}

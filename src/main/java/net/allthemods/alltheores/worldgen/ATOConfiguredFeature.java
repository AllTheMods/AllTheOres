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
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryManager;

import java.io.ObjectInputFilter;

public class ATOConfiguredFeature {

	public static final ImmutableList<OreConfiguration.TargetBlockState> ORE_ALUMINUM_TARGET_LIST = ImmutableList.of(OreConfiguration.target(OreConfiguration.Predicates.STONE_ORE_REPLACEABLES, BlockList.ALUMINUM_ORE.get().defaultBlockState()), OreConfiguration.target(OreConfiguration.Predicates.DEEPSLATE_ORE_REPLACEABLES, BlockList.ALUMINUM_SLATE_ORE.get().defaultBlockState()));
	public static final ImmutableList<OreConfiguration.TargetBlockState> ORE_LEAD_TARGET_LIST = ImmutableList.of(OreConfiguration.target(OreConfiguration.Predicates.STONE_ORE_REPLACEABLES, BlockList.LEAD_ORE.get().defaultBlockState()), OreConfiguration.target(OreConfiguration.Predicates.DEEPSLATE_ORE_REPLACEABLES, BlockList.LEAD_SLATE_ORE.get().defaultBlockState()));
	public static final ImmutableList<OreConfiguration.TargetBlockState> ORE_NICKEL_TARGET_LIST = ImmutableList.of(OreConfiguration.target(OreConfiguration.Predicates.STONE_ORE_REPLACEABLES, BlockList.NICKEL_ORE.get().defaultBlockState()), OreConfiguration.target(OreConfiguration.Predicates.DEEPSLATE_ORE_REPLACEABLES, BlockList.NICKEL_SLATE_ORE.get().defaultBlockState()));
	public static final ImmutableList<OreConfiguration.TargetBlockState> ORE_OSMIUM_TARGET_LIST = ImmutableList.of(OreConfiguration.target(OreConfiguration.Predicates.STONE_ORE_REPLACEABLES, BlockList.OSMIUM_ORE.get().defaultBlockState()), OreConfiguration.target(OreConfiguration.Predicates.DEEPSLATE_ORE_REPLACEABLES, BlockList.OSMIUM_SLATE_ORE.get().defaultBlockState()));
	public static final ImmutableList<OreConfiguration.TargetBlockState> ORE_PLATINUM_TARGET_LIST = ImmutableList.of(OreConfiguration.target(OreConfiguration.Predicates.STONE_ORE_REPLACEABLES, BlockList.PLATINUM_ORE.get().defaultBlockState()), OreConfiguration.target(OreConfiguration.Predicates.DEEPSLATE_ORE_REPLACEABLES, BlockList.PLATINUM_SLATE_ORE.get().defaultBlockState()));
	public static final ImmutableList<OreConfiguration.TargetBlockState> ORE_SILVER_TARGET_LIST = ImmutableList.of(OreConfiguration.target(OreConfiguration.Predicates.STONE_ORE_REPLACEABLES, BlockList.SILVER_ORE.get().defaultBlockState()), OreConfiguration.target(OreConfiguration.Predicates.DEEPSLATE_ORE_REPLACEABLES, BlockList.SILVER_SLATE_ORE.get().defaultBlockState()));
	public static final ImmutableList<OreConfiguration.TargetBlockState> ORE_TIN_TARGET_LIST = ImmutableList.of(OreConfiguration.target(OreConfiguration.Predicates.STONE_ORE_REPLACEABLES, BlockList.TIN_ORE.get().defaultBlockState()), OreConfiguration.target(OreConfiguration.Predicates.DEEPSLATE_ORE_REPLACEABLES, BlockList.TIN_SLATE_ORE.get().defaultBlockState()));
	public static final ImmutableList<OreConfiguration.TargetBlockState> ORE_URANIUM_TARGET_LIST = ImmutableList.of(OreConfiguration.target(OreConfiguration.Predicates.STONE_ORE_REPLACEABLES, BlockList.URANIUM_ORE.get().defaultBlockState()), OreConfiguration.target(OreConfiguration.Predicates.DEEPSLATE_ORE_REPLACEABLES, BlockList.URANIUM_SLATE_ORE.get().defaultBlockState()));
	public static final ImmutableList<OreConfiguration.TargetBlockState> ORE_ZINC_TARGET_LIST = ImmutableList.of(OreConfiguration.target(OreConfiguration.Predicates.STONE_ORE_REPLACEABLES, BlockList.ZINC_ORE.get().defaultBlockState()), OreConfiguration.target(OreConfiguration.Predicates.DEEPSLATE_ORE_REPLACEABLES, BlockList.ZINC_SLATE_ORE.get().defaultBlockState()));

	public static final OreConfiguration ORE_ALUMINUM_CONFIG = new OreConfiguration(ORE_ALUMINUM_TARGET_LIST, Configuration.COMMON.aluminum_SpawnSize.get());
	public static final OreConfiguration ORE_LEAD_CONFIG = new OreConfiguration(ORE_LEAD_TARGET_LIST, Configuration.COMMON.lead_SpawnSize.get());
	public static final OreConfiguration ORE_NICKEL_CONFIG = new OreConfiguration(ORE_NICKEL_TARGET_LIST, Configuration.COMMON.nickel_SpawnSize.get());
	public static final OreConfiguration ORE_OSMIUM_CONFIG = new OreConfiguration(ORE_OSMIUM_TARGET_LIST, Configuration.COMMON.osmium_SpawnSize.get());
	public static final OreConfiguration ORE_PLATINUM_CONFIG = new OreConfiguration(ORE_PLATINUM_TARGET_LIST, Configuration.COMMON.platinum_SpawnSize.get());
	public static final OreConfiguration ORE_SILVER_CONFIG = new OreConfiguration(ORE_SILVER_TARGET_LIST, Configuration.COMMON.silver_SpawnSize.get());
	public static final OreConfiguration ORE_TIN_CONFIG = new OreConfiguration(ORE_TIN_TARGET_LIST, Configuration.COMMON.tin_SpawnSize.get());
	public static final OreConfiguration ORE_URANIUM_CONFIG = new OreConfiguration(ORE_URANIUM_TARGET_LIST, Configuration.COMMON.uranium_SpawnSize.get());
	public static final OreConfiguration ORE_ZINC_CONFIG = new OreConfiguration(ORE_ZINC_TARGET_LIST, Configuration.COMMON.zinc_SpawnSize.get());


	// TO-DO possibly look at adding .count(20) as a configurable option
	
	public static ConfiguredFeature<?, ?> ORE_ALUMINUM = newConfiguredFeature("aluminum_ore",Feature.ORE.configured(ORE_ALUMINUM_CONFIG).rangeTriangle(VerticalAnchor.aboveBottom(Configuration.COMMON.aluminum_MinY.get()), VerticalAnchor.aboveBottom(Configuration.COMMON.aluminum_MaxY.get())).squared().count(20));
	public static ConfiguredFeature<?, ?> ORE_LEAD = newConfiguredFeature("lead_ore",Feature.ORE.configured(ORE_LEAD_CONFIG).rangeTriangle(VerticalAnchor.aboveBottom(Configuration.COMMON.lead_MinY.get()), VerticalAnchor.aboveBottom(Configuration.COMMON.lead_MaxY.get())).squared().count(20));
	public static ConfiguredFeature<?, ?> ORE_NICKEL = newConfiguredFeature("nickel_ore",Feature.ORE.configured(ORE_NICKEL_CONFIG).rangeTriangle(VerticalAnchor.aboveBottom(Configuration.COMMON.nickel_MinY.get()), VerticalAnchor.aboveBottom(Configuration.COMMON.silver_MaxY.get())).squared().count(20));
	public static ConfiguredFeature<?, ?> ORE_OSMIUM = newConfiguredFeature("osmium_ore",Feature.ORE.configured(ORE_OSMIUM_CONFIG).rangeTriangle(VerticalAnchor.aboveBottom(Configuration.COMMON.osmium_MinY.get()), VerticalAnchor.aboveBottom(Configuration.COMMON.osmium_MaxY.get())).squared().count(20));
	public static ConfiguredFeature<?, ?> ORE_PLATINUM = newConfiguredFeature("platinum_ore",Feature.ORE.configured(ORE_PLATINUM_CONFIG).rangeTriangle(VerticalAnchor.aboveBottom(Configuration.COMMON.platinum_MinY.get()), VerticalAnchor.aboveBottom(Configuration.COMMON.platinum_MaxY.get())).squared().count(20));
	public static ConfiguredFeature<?, ?> ORE_SILVER = newConfiguredFeature("silver_ore",Feature.ORE.configured(ORE_SILVER_CONFIG).rangeTriangle(VerticalAnchor.aboveBottom(Configuration.COMMON.silver_MinY.get()), VerticalAnchor.aboveBottom(Configuration.COMMON.silver_MaxY.get())).squared().count(20));
	public static ConfiguredFeature<?, ?> ORE_TIN = newConfiguredFeature("tin_ore",Feature.ORE.configured(ORE_TIN_CONFIG).rangeTriangle(VerticalAnchor.aboveBottom(Configuration.COMMON.tin_MinY.get()), VerticalAnchor.aboveBottom(Configuration.COMMON.tin_MaxY.get())).squared().count(20));
	public static ConfiguredFeature<?, ?> ORE_URANIUM = newConfiguredFeature("uranium_ore",Feature.ORE.configured(ORE_URANIUM_CONFIG).rangeTriangle(VerticalAnchor.aboveBottom(Configuration.COMMON.uranium_MinY.get()), VerticalAnchor.aboveBottom(Configuration.COMMON.uranium_MaxY.get())).squared().count(20));
	public static ConfiguredFeature<?, ?> ORE_ZINC = newConfiguredFeature("zinc_ore",Feature.ORE.configured(ORE_ZINC_CONFIG).rangeTriangle(VerticalAnchor.aboveBottom(Configuration.COMMON.zinc_MinY.get()), VerticalAnchor.aboveBottom(Configuration.COMMON.zinc_MaxY.get())).squared().count(20));

	public static ConfiguredFeature<?, ?> newConfiguredFeature(String registryName,
			ConfiguredFeature<?, ?> configuredFeature) {
				Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(Reference.MOD_ID, registryName),
				configuredFeature);

		return configuredFeature;
	}

}

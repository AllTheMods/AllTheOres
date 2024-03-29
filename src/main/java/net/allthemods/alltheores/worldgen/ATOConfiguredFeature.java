package net.allthemods.alltheores.worldgen;

import net.allthemods.alltheores.blocks.BlockList;
import net.allthemods.alltheores.infos.Configuration;
import net.allthemods.alltheores.infos.Reference;
import net.minecraft.block.Blocks;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.Features;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.DepthAverageConfig;
import net.minecraft.world.gen.placement.Placement;

public class ATOConfiguredFeature {

	public static ConfiguredFeature<?, ?> ORE_ALUMINUM = newConfiguredFeature("ore_aluminum",
			Feature.ORE
					.configured(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
							BlockList.ALUMINUM_ORE.get().defaultBlockState(), Configuration.aluminum_SpawnSize))
					.decorated(Placement.DEPTH_AVERAGE.configured(
							new DepthAverageConfig((Configuration.aluminum_MaxY + Configuration.aluminum_MinY) / 2,
									(Configuration.aluminum_MaxY - Configuration.aluminum_MinY) / 2))).squared().range(10).count(Configuration.aluminum_VeinCount));

	public static ConfiguredFeature<?, ?> ORE_URANIUM = newConfiguredFeature("ore_uranium",
			Feature.ORE
					.configured(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
							BlockList.URANIUM_ORE.get().defaultBlockState(), Configuration.uranium_SpawnSize))
					.decorated(Placement.DEPTH_AVERAGE.configured(
							new DepthAverageConfig((Configuration.uranium_MaxY + Configuration.uranium_MinY) / 2,
									(Configuration.uranium_MaxY - Configuration.uranium_MinY) / 2))).squared().range(10).count(Configuration.uranium_VeinCount));

	public static ConfiguredFeature<?, ?> ORE_COPPER = newConfiguredFeature("ore_copper",
			Feature.ORE
					.configured(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
							BlockList.COPPER_ORE.get().defaultBlockState(), Configuration.copper_SpawnSize))
					.decorated(Placement.DEPTH_AVERAGE.configured(
							new DepthAverageConfig((Configuration.copper_MaxY + Configuration.copper_MinY) / 2,
									(Configuration.copper_MaxY - Configuration.copper_MinY) / 2))).squared().range(10).count(Configuration.copper_VeinCount));

	public static ConfiguredFeature<?, ?> ORE_TIN = newConfiguredFeature("ore_tin",
			Feature.ORE
					.configured(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
							BlockList.TIN_ORE.get().defaultBlockState(), Configuration.tin_SpawnSize))
					.decorated(Placement.DEPTH_AVERAGE.configured(
							new DepthAverageConfig((Configuration.tin_MaxY + Configuration.tin_MinY) / 2,
									(Configuration.tin_MaxY - Configuration.tin_MinY) / 2))).squared().range(10).count(Configuration.tin_VeinCount));

	public static ConfiguredFeature<?, ?> ORE_SILVER = newConfiguredFeature("ore_silver",
			Feature.ORE
					.configured(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
							BlockList.SILVER_ORE.get().defaultBlockState(), Configuration.silver_SpawnSize))
					.decorated(Placement.DEPTH_AVERAGE.configured(
							new DepthAverageConfig((Configuration.silver_MaxY + Configuration.silver_MinY) / 2,
									(Configuration.silver_MaxY - Configuration.silver_MinY) / 2))).squared().range(10).count(Configuration.silver_VeinCount));

	public static ConfiguredFeature<?, ?> ORE_LEAD = newConfiguredFeature("ore_lead",
			Feature.ORE
					.configured(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
							BlockList.LEAD_ORE.get().defaultBlockState(), Configuration.lead_SpawnSize))
					.decorated(Placement.DEPTH_AVERAGE.configured(
							new DepthAverageConfig((Configuration.lead_MaxY + Configuration.lead_MinY) / 2,
									(Configuration.lead_MaxY - Configuration.lead_MinY) / 2))).squared().range(10).count(Configuration.lead_VeinCount));

	public static ConfiguredFeature<?, ?> ORE_ZINC = newConfiguredFeature("ore_zinc",
			Feature.ORE
					.configured(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
							BlockList.ZINC_ORE.get().defaultBlockState(), Configuration.zinc_SpawnSize))
					.decorated(Placement.DEPTH_AVERAGE.configured(
							new DepthAverageConfig((Configuration.zinc_MaxY + Configuration.zinc_MinY) / 2,
									(Configuration.zinc_MaxY - Configuration.zinc_MinY) / 2))).squared().range(10).count(Configuration.zinc_VeinCount));

	public static ConfiguredFeature<?, ?> ORE_NICKEL = newConfiguredFeature("ore_nickel",
			Feature.ORE
					.configured(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
							BlockList.NICKEL_ORE.get().defaultBlockState(), Configuration.nickel_SpawnSize))
					.decorated(Placement.DEPTH_AVERAGE.configured(
							new DepthAverageConfig((Configuration.nickel_MaxY + Configuration.nickel_MinY) / 2,
									(Configuration.nickel_MaxY - Configuration.nickel_MinY) / 2))).squared().range(10).count(Configuration.nickel_VeinCount));

	public static ConfiguredFeature<?, ?> ORE_PLATINUM = newConfiguredFeature("ore_platinum",
			Feature.ORE
					.configured(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
							BlockList.PLATINUM_ORE.get().defaultBlockState(), Configuration.platinum_SpawnSize))
					.decorated(Placement.DEPTH_AVERAGE.configured(
							new DepthAverageConfig((Configuration.platinum_MaxY + Configuration.platinum_MinY) / 2,
									(Configuration.platinum_MaxY - Configuration.platinum_MinY) / 2))).squared().range(10).count(Configuration.platinum_VeinCount));

	public static ConfiguredFeature<?, ?> ORE_OSMIUM = newConfiguredFeature("ore_osmium",
			Feature.ORE
					.configured(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
							BlockList.OSMIUM_ORE.get().defaultBlockState(), Configuration.osmium_SpawnSize))
					.decorated(Placement.DEPTH_AVERAGE.configured(
							new DepthAverageConfig((Configuration.osmium_MaxY + Configuration.osmium_MinY) / 2,
									(Configuration.osmium_MaxY - Configuration.osmium_MinY) / 2))).squared().range(10).count(Configuration.osmium_VeinCount));

	
	
	
	public static ConfiguredFeature<?, ?> ORE_OTHER_ALUMINUM = newConfiguredFeature("ore_other_aluminum",
			Feature.ORE
					.configured(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHER_ORE_REPLACEABLES,
							BlockList.OTHER_ALUMINUM_ORE.get().defaultBlockState(), Configuration.aluminum_SpawnSize * 2))
					.decorated(Placement.DEPTH_AVERAGE.configured(
							new DepthAverageConfig((Configuration.aluminum_MaxY * 2 + Configuration.aluminum_MinY) / 2,
									(Configuration.aluminum_MaxY - Configuration.aluminum_MinY) / 2))).squared().range(10));

	public static ConfiguredFeature<?, ?> ORE_OTHER_URANIUM = newConfiguredFeature("ore_other_uranium",
			Feature.ORE
					.configured(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHER_ORE_REPLACEABLES,
							BlockList.OTHER_URANIUM_ORE.get().defaultBlockState(), Configuration.uranium_SpawnSize * 2))
					.decorated(Placement.DEPTH_AVERAGE.configured(
							new DepthAverageConfig((Configuration.uranium_MaxY * 2 + Configuration.uranium_MinY) / 2,
									(Configuration.uranium_MaxY - Configuration.uranium_MinY) / 2))).squared().range(10));

	public static ConfiguredFeature<?, ?> ORE_OTHER_COPPER = newConfiguredFeature("ore_other_copper",
			Feature.ORE
					.configured(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHER_ORE_REPLACEABLES,
							BlockList.OTHER_COPPER_ORE.get().defaultBlockState(), Configuration.copper_SpawnSize * 2))
					.decorated(Placement.DEPTH_AVERAGE.configured(
							new DepthAverageConfig((Configuration.copper_MaxY * 2 + Configuration.copper_MinY) / 2,
									(Configuration.copper_MaxY - Configuration.copper_MinY) / 2))).squared().range(10));

	public static ConfiguredFeature<?, ?> ORE_OTHER_TIN = newConfiguredFeature("ore_other_tin",
			Feature.ORE
					.configured(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHER_ORE_REPLACEABLES,
							BlockList.OTHER_TIN_ORE.get().defaultBlockState(), Configuration.tin_SpawnSize * 2))
					.decorated(Placement.DEPTH_AVERAGE.configured(
							new DepthAverageConfig((Configuration.tin_MaxY * 2 + Configuration.tin_MinY) / 2,
									(Configuration.tin_MaxY - Configuration.tin_MinY) / 2))).squared().range(10));

	public static ConfiguredFeature<?, ?> ORE_OTHER_SILVER = newConfiguredFeature("ore_other_silver",
			Feature.ORE
					.configured(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHER_ORE_REPLACEABLES,
							BlockList.OTHER_SILVER_ORE.get().defaultBlockState(), Configuration.silver_SpawnSize * 2))
					.decorated(Placement.DEPTH_AVERAGE.configured(
							new DepthAverageConfig((Configuration.silver_MaxY * 2 + Configuration.silver_MinY) / 2,
									(Configuration.silver_MaxY - Configuration.silver_MinY) / 2))).squared().range(10));

	public static ConfiguredFeature<?, ?> ORE_OTHER_LEAD = newConfiguredFeature("ore_other_lead",
			Feature.ORE
					.configured(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHER_ORE_REPLACEABLES,
							BlockList.OTHER_LEAD_ORE.get().defaultBlockState(), Configuration.lead_SpawnSize * 2))
					.decorated(Placement.DEPTH_AVERAGE.configured(
							new DepthAverageConfig((Configuration.lead_MaxY * 2 + Configuration.lead_MinY) / 2,
									(Configuration.lead_MaxY - Configuration.lead_MinY) / 2))).squared().range(10));

	public static ConfiguredFeature<?, ?> ORE_OTHER_ZINC = newConfiguredFeature("ore_other_zinc",
			Feature.ORE
					.configured(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHER_ORE_REPLACEABLES,
							BlockList.OTHER_ZINC_ORE.get().defaultBlockState(), Configuration.zinc_SpawnSize * 2))
					.decorated(Placement.DEPTH_AVERAGE.configured(
							new DepthAverageConfig((Configuration.zinc_MaxY * 2 + Configuration.zinc_MinY) / 2,
									(Configuration.zinc_MaxY - Configuration.zinc_MinY) / 2))).squared().range(10));

	public static ConfiguredFeature<?, ?> ORE_OTHER_NICKEL = newConfiguredFeature("ore_other_nickel",
			Feature.ORE
					.configured(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHER_ORE_REPLACEABLES,
							BlockList.OTHER_NICKEL_ORE.get().defaultBlockState(), Configuration.nickel_SpawnSize * 2))
					.decorated(Placement.DEPTH_AVERAGE.configured(
							new DepthAverageConfig((Configuration.nickel_MaxY * 2 + Configuration.nickel_MinY) / 2,
									(Configuration.nickel_MaxY - Configuration.nickel_MinY) / 2))).squared().range(10));

	public static ConfiguredFeature<?, ?> ORE_OTHER_PLATINUM = newConfiguredFeature("ore_other_platinum",
			Feature.ORE
					.configured(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHER_ORE_REPLACEABLES,
							BlockList.OTHER_PLATINUM_ORE.get().defaultBlockState(), Configuration.platinum_SpawnSize * 2))
					.decorated(Placement.DEPTH_AVERAGE.configured(
							new DepthAverageConfig((Configuration.platinum_MaxY * 2 + Configuration.platinum_MinY) / 2,
									(Configuration.platinum_MaxY - Configuration.platinum_MinY) / 2))).squared().range(10));

	public static ConfiguredFeature<?, ?> ORE_OTHER_OSMIUM = newConfiguredFeature("ore_other_osmium",
			Feature.ORE
					.configured(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHER_ORE_REPLACEABLES,
							BlockList.OTHER_OSMIUM_ORE.get().defaultBlockState(), Configuration.osmium_SpawnSize * 2))
					.decorated(Placement.DEPTH_AVERAGE.configured(
							new DepthAverageConfig((Configuration.osmium_MaxY * 2 + Configuration.osmium_MinY) / 2,
									(Configuration.osmium_MaxY - Configuration.osmium_MinY) / 2))).squared().range(10));
	
	

	public static ConfiguredFeature<?, ?> ORE_OTHER_IRON = newConfiguredFeature("ore_other_iron",
			Feature.ORE
					.configured(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHER_ORE_REPLACEABLES,
							BlockList.OTHER_IRON_ORE.get().defaultBlockState(), 17))
					.decorated(Placement.DEPTH_AVERAGE.configured(
							new DepthAverageConfig(90,50))).squared().range(10));

	public static ConfiguredFeature<?, ?> ORE_OTHER_COAL = newConfiguredFeature("ore_other_coal",
			Feature.ORE
					.configured(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHER_ORE_REPLACEABLES,
							BlockList.OTHER_COAL_ORE.get().defaultBlockState(), 16))
					.decorated(Placement.DEPTH_AVERAGE.configured(
							new DepthAverageConfig(37, 75))).squared().range(10));

	public static ConfiguredFeature<?, ?> ORE_OTHER_LAPIS = newConfiguredFeature("ore_other_lapis",
			Feature.ORE
					.configured(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHER_ORE_REPLACEABLES,
							BlockList.OTHER_LAPIS_ORE.get().defaultBlockState(), 12))
					.decorated(Placement.DEPTH_AVERAGE.configured(
							new DepthAverageConfig(65,145))).squared().range(10));

	public static ConfiguredFeature<?, ?> ORE_OTHER_DIAMOND = newConfiguredFeature("ore_other_diamond",
			Feature.ORE
					.configured(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHER_ORE_REPLACEABLES,
							BlockList.OTHER_DIAMOND_ORE.get().defaultBlockState(), 8))
					.decorated(Placement.DEPTH_AVERAGE.configured(
							new DepthAverageConfig(100,140))).squared().range(10));

	public static ConfiguredFeature<?, ?> ORE_OTHER_REDSTONE = newConfiguredFeature("ore_other_redstone",
			Feature.ORE
					.configured(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHER_ORE_REPLACEABLES,
							BlockList.OTHER_REDSTONE_ORE.get().defaultBlockState(), 16))
					.decorated(Placement.DEPTH_AVERAGE.configured(
							new DepthAverageConfig(50,129))).squared().range(10));
	
	
	
	
	public static ConfiguredFeature<?, ?> newConfiguredFeature(String registryName,
			ConfiguredFeature<?, ?> configuredFeature) {

		Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, new ResourceLocation(Reference.MOD_ID, registryName),
				configuredFeature);

		return configuredFeature;
	}

}

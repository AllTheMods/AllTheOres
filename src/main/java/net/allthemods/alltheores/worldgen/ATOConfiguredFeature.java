package net.allthemods.alltheores.worldgen;

import net.allthemods.alltheores.blocks.BlockList;
import net.allthemods.alltheores.infos.Configuration;
import net.allthemods.alltheores.infos.Reference;
import net.allthemods.alltheores.worldgen.features.OreVein;
import net.minecraft.block.Blocks;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placement.DepthAverageConfig;
import net.minecraft.world.gen.placement.Placement;

public class ATOConfiguredFeature {
	//Orevein(codec, regular, deepslate)
	public static Feature<NoFeatureConfig> ALUMINUM = registerFeature("aluminum_ore",new OreVein(NoFeatureConfig.CODEC,BlockList.ALUMINUM_ORE.get(),BlockList.ALUMINUM_ORE.get()));
	public static ConfiguredFeature<?,?> ORE_ALUMINUM = newConfiguredFeature("aluminum_ore", ALUMINUM.configured(IFeatureConfig.NONE));

	//to-do remove :D
	public static ConfiguredFeature<?,?> ORE_COPPER = newConfiguredFeature("copper_ore", ALUMINUM.configured(IFeatureConfig.NONE));

	public static Feature<NoFeatureConfig> URANIUM = registerFeature("uranium_ore", new OreVein(NoFeatureConfig.CODEC,BlockList.URANIUM_ORE.get(),BlockList.URANIUM_ORE.get()));
	public static ConfiguredFeature<?, ?> ORE_URANIUM = newConfiguredFeature("uranium_ore", URANIUM.configured(IFeatureConfig.NONE));
	public static Feature<NoFeatureConfig> TIN = registerFeature("tin_ore", new OreVein(NoFeatureConfig.CODEC,BlockList.TIN_ORE.get(),BlockList.TIN_ORE.get()));
	public static ConfiguredFeature<?, ?> ORE_TIN = newConfiguredFeature("tin_ore", TIN.configured(IFeatureConfig.NONE));
	public static Feature<NoFeatureConfig> SILVER = registerFeature("silver_ore", new OreVein(NoFeatureConfig.CODEC,BlockList.SILVER_ORE.get(),BlockList.SILVER_ORE.get()));
	public static ConfiguredFeature<?, ?> ORE_SILVER = newConfiguredFeature("silver_ore", SILVER.configured(IFeatureConfig.NONE));
	public static Feature<NoFeatureConfig> LEAD = registerFeature("lead_ore", new OreVein(NoFeatureConfig.CODEC,BlockList.LEAD_ORE.get(),BlockList.LEAD_ORE.get()));
	public static ConfiguredFeature<?, ?> ORE_LEAD = newConfiguredFeature("lead_ore", LEAD.configured(IFeatureConfig.NONE));
	public static Feature<NoFeatureConfig> ZINC = registerFeature("zinc_ore", new OreVein(NoFeatureConfig.CODEC,BlockList.ZINC_ORE.get(),BlockList.ZINC_ORE.get()));
	public static ConfiguredFeature<?, ?> ORE_ZINC = newConfiguredFeature("zinc_ore", ZINC.configured(IFeatureConfig.NONE));
	public static Feature<NoFeatureConfig> NICKEL = registerFeature("nickel_ore", new OreVein(NoFeatureConfig.CODEC,BlockList.NICKEL_ORE.get(),BlockList.NICKEL_ORE.get()));
	public static ConfiguredFeature<?, ?> ORE_NICKEL = newConfiguredFeature("nickel_ore", NICKEL.configured(IFeatureConfig.NONE));
	public static Feature<NoFeatureConfig> PLATINUM = registerFeature("platinum_ore", new OreVein(NoFeatureConfig.CODEC,BlockList.PLATINUM_ORE.get(),BlockList.PLATINUM_ORE.get()));
	public static ConfiguredFeature<?, ?> ORE_PLATINUM = newConfiguredFeature("platinum_ore", PLATINUM.configured(IFeatureConfig.NONE));
	public static Feature<NoFeatureConfig> OSMIUM = registerFeature("osmium_ore", new OreVein(NoFeatureConfig.CODEC,BlockList.OSMIUM_ORE.get(),BlockList.OSMIUM_ORE.get()));
	public static ConfiguredFeature<?, ?> ORE_OSMIUM = newConfiguredFeature("osmium_ore", OSMIUM.configured(IFeatureConfig.NONE));
	
	
	
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


	private static Feature<NoFeatureConfig> registerFeature(String registryName, Feature<NoFeatureConfig> feature) {
		feature.setRegistryName(registryName);
		return feature;
	}
	
	public static ConfiguredFeature<?, ?> newConfiguredFeature(String registryName,
			ConfiguredFeature<?, ?> configuredFeature) {

		Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, new ResourceLocation(Reference.MOD_ID, registryName),
				configuredFeature);

		return configuredFeature;
	}

}

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
					.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,
							BlockList.ALUMINUM_ORE.get().getDefaultState(), Configuration.aluminum_SpawnSize))
					.withPlacement(Placement.DEPTH_AVERAGE.configure(
							new DepthAverageConfig((Configuration.aluminum_MaxY + Configuration.aluminum_MinY) / 2,
									(Configuration.aluminum_MaxY - Configuration.aluminum_MinY) / 2))).square().func_242731_b(10));

	public static ConfiguredFeature<?, ?> ORE_URANIUM = newConfiguredFeature("ore_uranium",
			Feature.ORE
					.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,
							BlockList.URANIUM_ORE.get().getDefaultState(), Configuration.uranium_SpawnSize))
					.withPlacement(Placement.DEPTH_AVERAGE.configure(
							new DepthAverageConfig((Configuration.uranium_MaxY + Configuration.uranium_MinY) / 2,
									(Configuration.uranium_MaxY - Configuration.uranium_MinY) / 2))).square().func_242731_b(10));

	public static ConfiguredFeature<?, ?> ORE_COPPER = newConfiguredFeature("ore_copper",
			Feature.ORE
					.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,
							BlockList.COPPER_ORE.get().getDefaultState(), Configuration.copper_SpawnSize))
					.withPlacement(Placement.DEPTH_AVERAGE.configure(
							new DepthAverageConfig((Configuration.copper_MaxY + Configuration.copper_MinY) / 2,
									(Configuration.copper_MaxY - Configuration.copper_MinY) / 2))).square().func_242731_b(10));

	public static ConfiguredFeature<?, ?> ORE_TIN = newConfiguredFeature("ore_tin",
			Feature.ORE
					.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,
							BlockList.TIN_ORE.get().getDefaultState(), Configuration.tin_SpawnSize))
					.withPlacement(Placement.DEPTH_AVERAGE.configure(
							new DepthAverageConfig((Configuration.tin_MaxY + Configuration.tin_MinY) / 2,
									(Configuration.tin_MaxY - Configuration.tin_MinY) / 2))).square().func_242731_b(10));

	public static ConfiguredFeature<?, ?> ORE_SILVER = newConfiguredFeature("ore_silver",
			Feature.ORE
					.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,
							BlockList.SILVER_ORE.get().getDefaultState(), Configuration.silver_SpawnSize))
					.withPlacement(Placement.DEPTH_AVERAGE.configure(
							new DepthAverageConfig((Configuration.silver_MaxY + Configuration.silver_MinY) / 2,
									(Configuration.silver_MaxY - Configuration.silver_MinY) / 2))).square().func_242731_b(10));

	public static ConfiguredFeature<?, ?> ORE_LEAD = newConfiguredFeature("ore_lead",
			Feature.ORE
					.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,
							BlockList.LEAD_ORE.get().getDefaultState(), Configuration.lead_SpawnSize))
					.withPlacement(Placement.DEPTH_AVERAGE.configure(
							new DepthAverageConfig((Configuration.lead_MaxY + Configuration.lead_MinY) / 2,
									(Configuration.lead_MaxY - Configuration.lead_MinY) / 2))).square().func_242731_b(10));

	public static ConfiguredFeature<?, ?> ORE_ZINC = newConfiguredFeature("ore_zinc",
			Feature.ORE
					.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,
							BlockList.ZINC_ORE.get().getDefaultState(), Configuration.zinc_SpawnSize))
					.withPlacement(Placement.DEPTH_AVERAGE.configure(
							new DepthAverageConfig((Configuration.zinc_MaxY + Configuration.zinc_MinY) / 2,
									(Configuration.zinc_MaxY - Configuration.zinc_MinY) / 2))).square().func_242731_b(10));

	public static ConfiguredFeature<?, ?> ORE_NICKEL = newConfiguredFeature("ore_nickel",
			Feature.ORE
					.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,
							BlockList.NICKEL_ORE.get().getDefaultState(), Configuration.nickel_SpawnSize))
					.withPlacement(Placement.DEPTH_AVERAGE.configure(
							new DepthAverageConfig((Configuration.nickel_MaxY + Configuration.nickel_MinY) / 2,
									(Configuration.nickel_MaxY - Configuration.nickel_MinY) / 2))).square().func_242731_b(10));

	public static ConfiguredFeature<?, ?> ORE_PLATINUM = newConfiguredFeature("ore_platinum",
			Feature.ORE
					.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,
							BlockList.PLATINUM_ORE.get().getDefaultState(), Configuration.platinum_SpawnSize))
					.withPlacement(Placement.DEPTH_AVERAGE.configure(
							new DepthAverageConfig((Configuration.platinum_MaxY + Configuration.platinum_MinY) / 2,
									(Configuration.platinum_MaxY - Configuration.platinum_MinY) / 2))).square().func_242731_b(10));

	public static ConfiguredFeature<?, ?> ORE_OSMIUM = newConfiguredFeature("ore_osmium",
			Feature.ORE
					.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,
							BlockList.OSMIUM_ORE.get().getDefaultState(), Configuration.osmium_SpawnSize))
					.withPlacement(Placement.DEPTH_AVERAGE.configure(
							new DepthAverageConfig((Configuration.osmium_MaxY + Configuration.osmium_MinY) / 2,
									(Configuration.osmium_MaxY - Configuration.osmium_MinY) / 2))).square().func_242731_b(10));

	
	
	
	public static ConfiguredFeature<?, ?> ORE_OTHER_ALUMINUM = newConfiguredFeature("ore_other_aluminum",
			Feature.ORE
					.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_NETHER,
							BlockList.OTHER_ALUMINUM_ORE.get().getDefaultState(), Configuration.aluminum_SpawnSize * 2))
					.withPlacement(Placement.DEPTH_AVERAGE.configure(
							new DepthAverageConfig((Configuration.aluminum_MaxY * 2 + Configuration.aluminum_MinY) / 2,
									(Configuration.aluminum_MaxY - Configuration.aluminum_MinY) / 2))).square().func_242731_b(10));

	public static ConfiguredFeature<?, ?> ORE_OTHER_URANIUM = newConfiguredFeature("ore_other_uranium",
			Feature.ORE
					.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_NETHER,
							BlockList.OTHER_URANIUM_ORE.get().getDefaultState(), Configuration.uranium_SpawnSize * 2))
					.withPlacement(Placement.DEPTH_AVERAGE.configure(
							new DepthAverageConfig((Configuration.uranium_MaxY * 2 + Configuration.uranium_MinY) / 2,
									(Configuration.uranium_MaxY - Configuration.uranium_MinY) / 2))).square().func_242731_b(10));

	public static ConfiguredFeature<?, ?> ORE_OTHER_COPPER = newConfiguredFeature("ore_other_copper",
			Feature.ORE
					.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_NETHER,
							BlockList.OTHER_COPPER_ORE.get().getDefaultState(), Configuration.copper_SpawnSize * 2))
					.withPlacement(Placement.DEPTH_AVERAGE.configure(
							new DepthAverageConfig((Configuration.copper_MaxY * 2 + Configuration.copper_MinY) / 2,
									(Configuration.copper_MaxY - Configuration.copper_MinY) / 2))).square().func_242731_b(10));

	public static ConfiguredFeature<?, ?> ORE_OTHER_TIN = newConfiguredFeature("ore_other_tin",
			Feature.ORE
					.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_NETHER,
							BlockList.OTHER_TIN_ORE.get().getDefaultState(), Configuration.tin_SpawnSize * 2))
					.withPlacement(Placement.DEPTH_AVERAGE.configure(
							new DepthAverageConfig((Configuration.tin_MaxY * 2 + Configuration.tin_MinY) / 2,
									(Configuration.tin_MaxY - Configuration.tin_MinY) / 2))).square().func_242731_b(10));

	public static ConfiguredFeature<?, ?> ORE_OTHER_SILVER = newConfiguredFeature("ore_other_silver",
			Feature.ORE
					.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_NETHER,
							BlockList.OTHER_SILVER_ORE.get().getDefaultState(), Configuration.silver_SpawnSize * 2))
					.withPlacement(Placement.DEPTH_AVERAGE.configure(
							new DepthAverageConfig((Configuration.silver_MaxY * 2 + Configuration.silver_MinY) / 2,
									(Configuration.silver_MaxY - Configuration.silver_MinY) / 2))).square().func_242731_b(10));

	public static ConfiguredFeature<?, ?> ORE_OTHER_LEAD = newConfiguredFeature("ore_other_lead",
			Feature.ORE
					.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_NETHER,
							BlockList.OTHER_LEAD_ORE.get().getDefaultState(), Configuration.lead_SpawnSize * 2))
					.withPlacement(Placement.DEPTH_AVERAGE.configure(
							new DepthAverageConfig((Configuration.lead_MaxY * 2 + Configuration.lead_MinY) / 2,
									(Configuration.lead_MaxY - Configuration.lead_MinY) / 2))).square().func_242731_b(10));

	public static ConfiguredFeature<?, ?> ORE_OTHER_ZINC = newConfiguredFeature("ore_other_zinc",
			Feature.ORE
					.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_NETHER,
							BlockList.OTHER_ZINC_ORE.get().getDefaultState(), Configuration.zinc_SpawnSize * 2))
					.withPlacement(Placement.DEPTH_AVERAGE.configure(
							new DepthAverageConfig((Configuration.zinc_MaxY * 2 + Configuration.zinc_MinY) / 2,
									(Configuration.zinc_MaxY - Configuration.zinc_MinY) / 2))).square().func_242731_b(10));

	public static ConfiguredFeature<?, ?> ORE_OTHER_NICKEL = newConfiguredFeature("ore_other_nickel",
			Feature.ORE
					.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_NETHER,
							BlockList.OTHER_NICKEL_ORE.get().getDefaultState(), Configuration.nickel_SpawnSize * 2))
					.withPlacement(Placement.DEPTH_AVERAGE.configure(
							new DepthAverageConfig((Configuration.nickel_MaxY * 2 + Configuration.nickel_MinY) / 2,
									(Configuration.nickel_MaxY - Configuration.nickel_MinY) / 2))).square().func_242731_b(10));

	public static ConfiguredFeature<?, ?> ORE_OTHER_PLATINUM = newConfiguredFeature("ore_other_platinum",
			Feature.ORE
					.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_NETHER,
							BlockList.OTHER_PLATINUM_ORE.get().getDefaultState(), Configuration.platinum_SpawnSize * 2))
					.withPlacement(Placement.DEPTH_AVERAGE.configure(
							new DepthAverageConfig((Configuration.platinum_MaxY * 2 + Configuration.platinum_MinY) / 2,
									(Configuration.platinum_MaxY - Configuration.platinum_MinY) / 2))).square().func_242731_b(10));

	public static ConfiguredFeature<?, ?> ORE_OTHER_OSMIUM = newConfiguredFeature("ore_other_osmium",
			Feature.ORE
					.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_NETHER,
							BlockList.OTHER_OSMIUM_ORE.get().getDefaultState(), Configuration.osmium_SpawnSize * 2))
					.withPlacement(Placement.DEPTH_AVERAGE.configure(
							new DepthAverageConfig((Configuration.osmium_MaxY * 2 + Configuration.osmium_MinY) / 2,
									(Configuration.osmium_MaxY - Configuration.osmium_MinY) / 2))).square().func_242731_b(10));
	
	

	public static ConfiguredFeature<?, ?> ORE_OTHER_IRON = newConfiguredFeature("ore_other_iron",
			Feature.ORE
					.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_NETHER,
							BlockList.OTHER_IRON_ORE.get().getDefaultState(), 17))
					.withPlacement(Placement.DEPTH_AVERAGE.configure(
							new DepthAverageConfig(90,50))).square().func_242731_b(10));

	public static ConfiguredFeature<?, ?> ORE_OTHER_COAL = newConfiguredFeature("ore_other_coal",
			Feature.ORE
					.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_NETHER,
							BlockList.OTHER_COAL_ORE.get().getDefaultState(), 16))
					.withPlacement(Placement.DEPTH_AVERAGE.configure(
							new DepthAverageConfig(37, 75))).square().func_242731_b(10));

	public static ConfiguredFeature<?, ?> ORE_OTHER_LAPIS = newConfiguredFeature("ore_other_lapis",
			Feature.ORE
					.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_NETHER,
							BlockList.OTHER_LAPIS_ORE.get().getDefaultState(), 12))
					.withPlacement(Placement.DEPTH_AVERAGE.configure(
							new DepthAverageConfig(65,145))).square().func_242731_b(10));

	public static ConfiguredFeature<?, ?> ORE_OTHER_DIAMOND = newConfiguredFeature("ore_other_diamond",
			Feature.ORE
					.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_NETHER,
							BlockList.OTHER_DIAMOND_ORE.get().getDefaultState(), 8))
					.withPlacement(Placement.DEPTH_AVERAGE.configure(
							new DepthAverageConfig(100,140))).square().func_242731_b(10));

	public static ConfiguredFeature<?, ?> ORE_OTHER_REDSTONE = newConfiguredFeature("ore_other_redstone",
			Feature.ORE
					.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_NETHER,
							BlockList.OTHER_REDSTONE_ORE.get().getDefaultState(), 16))
					.withPlacement(Placement.DEPTH_AVERAGE.configure(
							new DepthAverageConfig(50,129))).square().func_242731_b(10));
	
	
	
	
	public static ConfiguredFeature<?, ?> newConfiguredFeature(String registryName,
			ConfiguredFeature<?, ?> configuredFeature) {

		Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, new ResourceLocation(Reference.MOD_ID, registryName),
				configuredFeature);

		return configuredFeature;
	}

}

package net.allthemods.alltheores.worldgen;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;

import net.allthemods.alltheores.infos.Configuration;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.ConfiguredFeature;

public class Worldgen {

	@SuppressWarnings("deprecation")
	public static void addFeatures() {

		for (Biome biome : WorldGenRegistries.BIOME) {
			
			if ((biome.getCategory() != Biome.Category.NETHER) && (biome.getCategory() != Biome.Category.THEEND)
					&& (biome.getCategory() != Biome.Category.NONE) && !(biome == null)) {
				if (Configuration.aluminumGen) {
					addFeatureToBiome(biome, GenerationStage.Decoration.UNDERGROUND_ORES,
							ATOConfiguredFeature.ORE_ALUMINUM);
				}
				if (Configuration.copperGen) {
					addFeatureToBiome(biome, GenerationStage.Decoration.UNDERGROUND_ORES,
							ATOConfiguredFeature.ORE_COPPER);
				}
				if (Configuration.leadGen) {
					addFeatureToBiome(biome, GenerationStage.Decoration.UNDERGROUND_ORES,
							ATOConfiguredFeature.ORE_LEAD);
				}
				if (Configuration.nickelGen) {
					addFeatureToBiome(biome, GenerationStage.Decoration.UNDERGROUND_ORES,
							ATOConfiguredFeature.ORE_NICKEL);
				}
				if (Configuration.osmiumGen) {
					addFeatureToBiome(biome, GenerationStage.Decoration.UNDERGROUND_ORES,
							ATOConfiguredFeature.ORE_OSMIUM);
				}
				if (Configuration.platinumGen) {
					addFeatureToBiome(biome, GenerationStage.Decoration.UNDERGROUND_ORES,
							ATOConfiguredFeature.ORE_PLATINUM);
				}
				if (Configuration.silverGen) {
					
					addFeatureToBiome(biome, GenerationStage.Decoration.UNDERGROUND_ORES,
							ATOConfiguredFeature.ORE_SILVER);
				}
				if (Configuration.tinGen) {
					addFeatureToBiome(biome, GenerationStage.Decoration.UNDERGROUND_ORES, ATOConfiguredFeature.ORE_TIN);
				}
				if (Configuration.uraniumGen) {
					addFeatureToBiome(biome, GenerationStage.Decoration.UNDERGROUND_ORES,
							ATOConfiguredFeature.ORE_URANIUM);
				}
				if (Configuration.zincGen) {
					addFeatureToBiome(biome, GenerationStage.Decoration.UNDERGROUND_ORES,
							ATOConfiguredFeature.ORE_ZINC);
				}
			}

		}

	}

	// Use these to add our features to vanilla's biomes.
	public static void addFeatureToBiome(Biome biome, GenerationStage.Decoration feature,
			ConfiguredFeature<?, ?> configuredFeature) {

		ConvertImmutableFeatures(biome);
		List<List<Supplier<ConfiguredFeature<?, ?>>>> biomeFeatures = biome.getGenerationSettings().features;
		while (biomeFeatures.size() <= feature.ordinal()) {
			biomeFeatures.add(Lists.newArrayList());
		}
		biomeFeatures.get(feature.ordinal()).add(() -> configuredFeature);

	}

	private static void ConvertImmutableFeatures(Biome biome) {

		if (biome.getGenerationSettings().features instanceof ImmutableList) {
			biome.getGenerationSettings().features = biome.getGenerationSettings().features.stream()
					.map(Lists::newArrayList).collect(Collectors.toList());
		}

	}
}

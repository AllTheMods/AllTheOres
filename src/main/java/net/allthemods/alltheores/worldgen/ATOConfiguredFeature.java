package net.allthemods.alltheores.worldgen;

import net.allthemods.alltheores.blocks.BlockList;
import net.allthemods.alltheores.infos.Configuration;
import net.allthemods.alltheores.infos.Reference;
import net.allthemods.alltheores.worldgen.features.OreVein;
import net.minecraft.core.MappedRegistry;
import net.minecraft.core.Registry;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.levelgen.OreVeinifier;
import net.minecraft.world.level.levelgen.WorldGenSettings;
import net.minecraft.world.level.levelgen.WorldGenerationContext;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.NoOpFeature;
import net.minecraft.world.level.levelgen.feature.OreFeature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraftforge.registries.RegistryManager;

public class ATOConfiguredFeature {
	//Orevein(codec, regular, deepslate)
	public static Feature<NoneFeatureConfiguration> ALUMINUM = registerFeature("aluminum_ore",new OreVein(NoneFeatureConfiguration.CODEC,BlockList.ALUMINUM_ORE.get(),BlockList.ALUMINUM_SLATE_ORE.get()));
	public static ConfiguredFeature<?,?> ORE_ALUMINUM = newConfiguredFeature("aluminum_ore", ALUMINUM.configured(FeatureConfiguration.NONE));


	public static Feature<NoneFeatureConfiguration> URANIUM = registerFeature("uranium_ore", new OreVein(NoneFeatureConfiguration.CODEC,BlockList.URANIUM_ORE.get(),BlockList.URANIUM_SLATE_ORE.get()));
	public static ConfiguredFeature<?, ?> ORE_URANIUM = newConfiguredFeature("uranium_ore", URANIUM.configured(FeatureConfiguration.NONE));
	public static Feature<NoneFeatureConfiguration> TIN = registerFeature("tin_ore", new OreVein(NoneFeatureConfiguration.CODEC,BlockList.TIN_ORE.get(),BlockList.TIN_SLATE_ORE.get()));
	public static ConfiguredFeature<?, ?> ORE_TIN = newConfiguredFeature("tin_ore", TIN.configured(FeatureConfiguration.NONE));
	public static Feature<NoneFeatureConfiguration> SILVER = registerFeature("silver_ore", new OreVein(NoneFeatureConfiguration.CODEC,BlockList.SILVER_ORE.get(),BlockList.SILVER_SLATE_ORE.get()));
	public static ConfiguredFeature<?, ?> ORE_SILVER = newConfiguredFeature("silver_ore", SILVER.configured(FeatureConfiguration.NONE));
	public static Feature<NoneFeatureConfiguration> LEAD = registerFeature("lead_ore", new OreVein(NoneFeatureConfiguration.CODEC,BlockList.LEAD_ORE.get(),BlockList.LEAD_SLATE_ORE.get()));
	public static ConfiguredFeature<?, ?> ORE_LEAD = newConfiguredFeature("lead_ore", LEAD.configured(FeatureConfiguration.NONE));
	public static Feature<NoneFeatureConfiguration> ZINC = registerFeature("zinc_ore", new OreVein(NoneFeatureConfiguration.CODEC,BlockList.ZINC_ORE.get(),BlockList.ZINC_SLATE_ORE.get()));
	public static ConfiguredFeature<?, ?> ORE_ZINC = newConfiguredFeature("zinc_ore", ZINC.configured(FeatureConfiguration.NONE));
	public static Feature<NoneFeatureConfiguration> NICKEL = registerFeature("nickel_ore", new OreVein(NoneFeatureConfiguration.CODEC,BlockList.NICKEL_ORE.get(),BlockList.NICKEL_SLATE_ORE.get()));
	public static ConfiguredFeature<?, ?> ORE_NICKEL = newConfiguredFeature("nickel_ore", NICKEL.configured(FeatureConfiguration.NONE));
	public static Feature<NoneFeatureConfiguration> PLATINUM = registerFeature("platinum_ore", new OreVein(NoneFeatureConfiguration.CODEC,BlockList.PLATINUM_ORE.get(),BlockList.PLATINUM_SLATE_ORE.get()));
	public static ConfiguredFeature<?, ?> ORE_PLATINUM = newConfiguredFeature("platinum_ore", PLATINUM.configured(FeatureConfiguration.NONE));
	public static Feature<NoneFeatureConfiguration> OSMIUM = registerFeature("osmium_ore", new OreVein(NoneFeatureConfiguration.CODEC,BlockList.OSMIUM_ORE.get(),BlockList.OSMIUM_SLATE_ORE.get()));
	public static ConfiguredFeature<?, ?> ORE_OSMIUM = newConfiguredFeature("osmium_ore", OSMIUM.configured(FeatureConfiguration.NONE));
	
	
	

	private static Feature<NoneFeatureConfiguration> registerFeature(String registryName, Feature<NoneFeatureConfiguration> feature) {
		feature.setRegistryName(registryName);
		return feature;
	}
	
	public static ConfiguredFeature<?, ?> newConfiguredFeature(String registryName,
			ConfiguredFeature<?, ?> configuredFeature) {

		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(Reference.MOD_ID, registryName),
				configuredFeature);

		return configuredFeature;
	}

}

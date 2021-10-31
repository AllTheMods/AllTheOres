package net.allthemods.alltheores.worldgen;

import net.allthemods.alltheores.AllTheOres;
import net.allthemods.alltheores.infos.Configuration;
import net.allthemods.alltheores.infos.Reference;
import net.minecraft.data.worldgen.Features;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraftforge.common.ForgeHooks;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;


public class EventWorldgen {

    public static void biomeLoadingEvent(BiomeLoadingEvent event) {
        if (event.getCategory() != Biome.BiomeCategory.NONE) {
            if (event.getCategory() == Biome.BiomeCategory.NETHER) {
                if (Configuration.COMMON.aluminumNetherGen.get()) {
                    event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> ATOConfiguredFeature.ORE_ALUMINUM);

                }
                if (Configuration.COMMON.leadNetherGen.get()) {
                    event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> ATOConfiguredFeature.ORE_LEAD);

                }
                if (Configuration.COMMON.nickelNetherGen.get()) {
                    event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> ATOConfiguredFeature.ORE_NICKEL);

                }
                if (Configuration.COMMON.osmiumNetherGen.get()) {
                    event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> ATOConfiguredFeature.ORE_OSMIUM);

                }
                if (Configuration.COMMON.platinumNetherGen.get()) {
                    event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> ATOConfiguredFeature.ORE_PLATINUM);

                }
                if (Configuration.COMMON.silverNetherGen.get()) {
                    event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> ATOConfiguredFeature.ORE_SILVER);

                }
                if (Configuration.COMMON.tinNetherGen.get()) {
                    event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> ATOConfiguredFeature.ORE_TIN);

                }
                if (Configuration.COMMON.uraniumNetherGen.get()) {
                    event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> ATOConfiguredFeature.ORE_URANIUM);

                }
                if (Configuration.COMMON.zincNetherGen.get()) {
                    event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> ATOConfiguredFeature.ORE_ZINC);

                }
            }
            if (event.getCategory() == Biome.BiomeCategory.THEEND) {
                if (Configuration.COMMON.aluminumEndGen.get()) {
                    event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> ATOConfiguredFeature.ORE_ALUMINUM);

                }
                if (Configuration.COMMON.leadEndGen.get()) {
                    event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> ATOConfiguredFeature.ORE_LEAD);

                }
                if (Configuration.COMMON.nickelEndGen.get()) {
                    event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> ATOConfiguredFeature.ORE_NICKEL);

                }
                if (Configuration.COMMON.osmiumEndGen.get()) {
                    event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> ATOConfiguredFeature.ORE_OSMIUM);

                }
                if (Configuration.COMMON.platinumEndGen.get()) {
                    event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> ATOConfiguredFeature.ORE_PLATINUM);

                }
                if (Configuration.COMMON.silverEndGen.get()) {
                    event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> ATOConfiguredFeature.ORE_SILVER);

                }
                if (Configuration.COMMON.tinEndGen.get()) {
                    event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> ATOConfiguredFeature.ORE_TIN);

                }
                if (Configuration.COMMON.uraniumEndGen.get()) {
                    event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> ATOConfiguredFeature.ORE_URANIUM);

                }
                if (Configuration.COMMON.zincEndGen.get()) {
                    event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> ATOConfiguredFeature.ORE_ZINC);

                }
            }
            if ((event.getCategory() != Biome.BiomeCategory.THEEND) && (event.getCategory() != Biome.BiomeCategory.NETHER) && (event.getCategory() != Biome.BiomeCategory.NONE)) {
                if (Configuration.COMMON.aluminumGen.get()) {
                    event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> ATOConfiguredFeature.ORE_ALUMINUM);
                    event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> ATOConfiguredFeature.RAW_ALUMINUM);
                }
                if (Configuration.COMMON.leadGen.get()) {
                    event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> ATOConfiguredFeature.ORE_LEAD);
                    event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> ATOConfiguredFeature.RAW_LEAD);
                }
                if (Configuration.COMMON.nickelGen.get()) {
                    event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> ATOConfiguredFeature.ORE_NICKEL);
                    event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> ATOConfiguredFeature.RAW_NICKEL);
                }
                if (Configuration.COMMON.osmiumGen.get()) {
                    event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> ATOConfiguredFeature.ORE_OSMIUM);
                    event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> ATOConfiguredFeature.RAW_OSMIUM);
                }
                if (Configuration.COMMON.platinumGen.get()) {
                    event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> ATOConfiguredFeature.ORE_PLATINUM);
                    event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> ATOConfiguredFeature.RAW_PLATINUM);
                }
                if (Configuration.COMMON.silverGen.get()) {
                    event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> ATOConfiguredFeature.ORE_SILVER);
                    event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> ATOConfiguredFeature.RAW_SILVER);
                }
                if (Configuration.COMMON.tinGen.get()) {
                    event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> ATOConfiguredFeature.ORE_TIN);
                    event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> ATOConfiguredFeature.RAW_TIN);
                }
                if (Configuration.COMMON.uraniumGen.get()) {
                    event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> ATOConfiguredFeature.ORE_URANIUM);
                    event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> ATOConfiguredFeature.RAW_URANIUM);
                }
                if (Configuration.COMMON.zincGen.get()) {
                    event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> ATOConfiguredFeature.ORE_ZINC);
                    event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> ATOConfiguredFeature.RAW_ZINC);
                }
            }


            //VANILLA+ Featureset

            if(event.getCategory() == Biome.BiomeCategory.JUNGLE) { addLushCaves(event); }
            if(event.getCategory() == Biome.BiomeCategory.DESERT) { addDripStoneCaverns(event); }
        }
    }
    private static void addDripStoneCaverns(BiomeLoadingEvent event) {
        event.getGeneration().getFeatures(GenerationStep.Decoration.LOCAL_MODIFICATIONS).add(() -> Features.LARGE_DRIPSTONE_FEATURE);
        event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION).add(() -> Features.DRIPSTONE_CLUSTER_FEATURE);
        event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION).add(() -> Features.RARE_DRIPSTONE_CLUSTER_FEATURE);
        event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION).add(() -> Features.RARE_DRIPSTONE_CLUSTER_FEATURE);
        event.getGeneration().getFeatures(GenerationStep.Decoration.TOP_LAYER_MODIFICATION).add(() -> Features.PATCH_TALL_GRASS_2);
        event.getGeneration().getFeatures(GenerationStep.Decoration.TOP_LAYER_MODIFICATION).add(() -> Features.PROTOTYPE_GLOW_LICHEN);


    }
    private static void addLushCaves(BiomeLoadingEvent event) {
        event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION).add(() -> Features.RARE_DRIPSTONE_CLUSTER_FEATURE);
        event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION).add(() -> Features.RARE_DRIPSTONE_CLUSTER_FEATURE);
        event.getGeneration().getFeatures(GenerationStep.Decoration.TOP_LAYER_MODIFICATION).add(() -> Features.PATCH_TALL_GRASS_2);
        event.getGeneration().getFeatures(GenerationStep.Decoration.TOP_LAYER_MODIFICATION).add(() -> Features.PROTOTYPE_GLOW_LICHEN);
        event.getGeneration().getFeatures(GenerationStep.Decoration.TOP_LAYER_MODIFICATION).add(() -> Features.LUSH_CAVES_CEILING_VEGETATION);
        event.getGeneration().getFeatures(GenerationStep.Decoration.TOP_LAYER_MODIFICATION).add(() -> Features.CAVE_VINES);
        event.getGeneration().getFeatures(GenerationStep.Decoration.TOP_LAYER_MODIFICATION).add(() -> Features.LUSH_CAVES_CLAY);
        event.getGeneration().getFeatures(GenerationStep.Decoration.TOP_LAYER_MODIFICATION).add(() -> Features.LUSH_CAVES_VEGETATION);
        event.getGeneration().getFeatures(GenerationStep.Decoration.TOP_LAYER_MODIFICATION).add(() -> Features.ROOTED_AZALEA_TREES);
        event.getGeneration().getFeatures(GenerationStep.Decoration.TOP_LAYER_MODIFICATION).add(() -> Features.SPORE_BLOSSOM_FEATURE);
        event.getGeneration().getFeatures(GenerationStep.Decoration.TOP_LAYER_MODIFICATION).add(() -> Features.CLASSIC_VINES_CAVE_FEATURE);

    }
}

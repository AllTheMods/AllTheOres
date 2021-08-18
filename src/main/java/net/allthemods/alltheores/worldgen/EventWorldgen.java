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
        if ((event.getCategory() != Biome.BiomeCategory.NETHER) && (event.getCategory() != Biome.BiomeCategory.THEEND)
                && (event.getCategory() != Biome.BiomeCategory.NONE)) {
            if (Configuration.COMMON.aluminumGen.get()) {
                AllTheOres.LOGGER.info("Aluminum feature added to: " + event.getName());
                event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> ATOConfiguredFeature.ORE_ALUMINUM);

            }
            if (Configuration.COMMON.leadGen.get()) {
                AllTheOres.LOGGER.info("Lead feature added to: " + event.getName());
                event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> ATOConfiguredFeature.ORE_LEAD);

            }
            if (Configuration.COMMON.nickelGen.get()) {
                AllTheOres.LOGGER.info("Nickel feature added to: " + event.getName());
                event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> ATOConfiguredFeature.ORE_NICKEL);

            }
            if (Configuration.COMMON.osmiumGen.get()) {
                AllTheOres.LOGGER.info("Osmium feature added to: " + event.getName());
                event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> ATOConfiguredFeature.ORE_OSMIUM);

            }
            if (Configuration.COMMON.platinumGen.get()) {
                AllTheOres.LOGGER.info("Platinum feature added to: " + event.getName());
                event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> ATOConfiguredFeature.ORE_PLATINUM);

            }
            if (Configuration.COMMON.silverGen.get()) {
                AllTheOres.LOGGER.info("Silver feature added to: " + event.getName());
                event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> ATOConfiguredFeature.ORE_SILVER);

            }
            if (Configuration.COMMON.tinGen.get()) {
                AllTheOres.LOGGER.info("Tin feature added to: " + event.getName());
                event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> ATOConfiguredFeature.ORE_TIN);

            }
            if (Configuration.COMMON.uraniumGen.get()) {
                AllTheOres.LOGGER.info("Uranium feature added to: " + event.getName());
                event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> ATOConfiguredFeature.ORE_URANIUM);

            }
            if (Configuration.COMMON.zincGen.get()) {
                AllTheOres.LOGGER.info("Zinc feature added to: " + event.getName());
                event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> ATOConfiguredFeature.ORE_ZINC);

            }
            //VANILLA+ Featureset
            ResourceLocation biome = event.getName();
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

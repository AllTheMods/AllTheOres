package net.allthemods.alltheores.worldgen;

import net.allthemods.alltheores.infos.Configuration;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraftforge.event.world.BiomeLoadingEvent;


public class EventWorldgen {

    public static void biomeLoadingEvent(BiomeLoadingEvent event) {
        if (event.getCategory() != Biome.BiomeCategory.NONE) {
            if (event.getCategory() == Biome.BiomeCategory.NETHER) {
                if (Configuration.COMMON.aluminumNetherGen.get()) {
                    event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(ATOPlacedFeatures.ORE_ALUMINIUM);

                }
                if (Configuration.COMMON.iridiumNetherGen.get()) {
                    event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(ATOPlacedFeatures.ORE_IRIDIUM);

                }
                if (Configuration.COMMON.leadNetherGen.get()) {
                    event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(ATOPlacedFeatures.ORE_LEAD);

                }
                if (Configuration.COMMON.nickelNetherGen.get()) {
                    event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(ATOPlacedFeatures.ORE_NICKEL);

                }
                if (Configuration.COMMON.osmiumNetherGen.get()) {
                    event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(ATOPlacedFeatures.ORE_OSMIUM);

                }
                if (Configuration.COMMON.platinumNetherGen.get()) {
                    event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(ATOPlacedFeatures.ORE_PLATINUM);

                }
                if (Configuration.COMMON.silverNetherGen.get()) {
                    event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(ATOPlacedFeatures.ORE_SILVER);

                }
                if (Configuration.COMMON.tinNetherGen.get()) {
                    event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(ATOPlacedFeatures.ORE_TIN);

                }
                if (Configuration.COMMON.uraniumNetherGen.get()) {
                    event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(ATOPlacedFeatures.ORE_URANIUM);

                }
                if (Configuration.COMMON.zincNetherGen.get()) {
                    event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(ATOPlacedFeatures.ORE_ZINC);

                }
            }
            if (event.getCategory() == Biome.BiomeCategory.THEEND) {
                if (Configuration.COMMON.aluminumEndGen.get()) {
                    event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(ATOPlacedFeatures.ORE_ALUMINIUM);

                }
                if (Configuration.COMMON.iridiumEndGen.get()) {
                    event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(ATOPlacedFeatures.ORE_IRIDIUM);

                }
                if (Configuration.COMMON.leadEndGen.get()) {
                    event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(ATOPlacedFeatures.ORE_LEAD);

                }
                if (Configuration.COMMON.nickelEndGen.get()) {
                    event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(ATOPlacedFeatures.ORE_NICKEL);

                }
                if (Configuration.COMMON.osmiumEndGen.get()) {
                    event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(ATOPlacedFeatures.ORE_OSMIUM);

                }
                if (Configuration.COMMON.platinumEndGen.get()) {
                    event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(ATOPlacedFeatures.ORE_PLATINUM);

                }
                if (Configuration.COMMON.silverEndGen.get()) {
                    event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(ATOPlacedFeatures.ORE_SILVER);

                }
                if (Configuration.COMMON.tinEndGen.get()) {
                    event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(ATOPlacedFeatures.ORE_TIN);

                }
                if (Configuration.COMMON.uraniumEndGen.get()) {
                    event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(ATOPlacedFeatures.ORE_URANIUM);

                }
                if (Configuration.COMMON.zincEndGen.get()) {
                    event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(ATOPlacedFeatures.ORE_ZINC);

                }
            }
            if ((event.getCategory() != Biome.BiomeCategory.THEEND) && (event.getCategory() != Biome.BiomeCategory.NETHER) && (event.getCategory() != Biome.BiomeCategory.NONE)) {
                if (Configuration.COMMON.aluminumGen.get()) {
                    event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(ATOPlacedFeatures.ORE_ALUMINIUM);
                    event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(ATOPlacedFeatures.RAW_ALUMINIUM);
                }
                if (Configuration.COMMON.iridiumGen.get()) {
                    event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(ATOPlacedFeatures.ORE_IRIDIUM);
                }
                if (Configuration.COMMON.leadGen.get()) {
                    event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(ATOPlacedFeatures.ORE_LEAD);
                    event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(ATOPlacedFeatures.RAW_LEAD);
                }
                if (Configuration.COMMON.nickelGen.get()) {
                    event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(ATOPlacedFeatures.ORE_NICKEL);
                    event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(ATOPlacedFeatures.RAW_NICKEL);
                }
                if (Configuration.COMMON.osmiumGen.get()) {
                    event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(ATOPlacedFeatures.ORE_OSMIUM);
                    event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(ATOPlacedFeatures.RAW_OSMIUM);
                }
                if (Configuration.COMMON.platinumGen.get()) {
                    event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(ATOPlacedFeatures.ORE_PLATINUM);
                    event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(ATOPlacedFeatures.RAW_PLATINUM);
                }
                if (Configuration.COMMON.silverGen.get()) {
                    event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(ATOPlacedFeatures.ORE_SILVER);
                    event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(ATOPlacedFeatures.RAW_SILVER);
                }
                if (Configuration.COMMON.tinGen.get()) {
                    event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(ATOPlacedFeatures.ORE_TIN);
                    event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(ATOPlacedFeatures.RAW_TIN);
                }
                if (Configuration.COMMON.uraniumGen.get()) {
                    event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(ATOPlacedFeatures.ORE_URANIUM);
                    event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(ATOPlacedFeatures.RAW_URANIUM);
                }
                if (Configuration.COMMON.zincGen.get()) {
                    event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(ATOPlacedFeatures.ORE_ZINC);
                    event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(ATOPlacedFeatures.RAW_ZINC);
                }

            }
            if((event.getCategory() == Biome.BiomeCategory.PLAINS) && (Configuration.COMMON.rubyGen.get())) {
                event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(ATOPlacedFeatures.ORE_RUBY);

            }
            if((event.getCategory() == Biome.BiomeCategory.OCEAN) && (Configuration.COMMON.sapphireGen.get())) {
                event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(ATOPlacedFeatures.ORE_SAPPHIRE);

            }
            if((event.getCategory() == Biome.BiomeCategory.DESERT) && (Configuration.COMMON.peridotGen.get())) {
                event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(ATOPlacedFeatures.ORE_PERIDOT);

            }



        }
    }

}

package net.allthemods.alltheores.worldgen;

import net.allthemods.alltheores.infos.Configuration;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.FORGE)
public class EventWorldgen {
    @SubscribeEvent
    public static void biomeLoadingEvent(final BiomeLoadingEvent event) {
        if ((event.getCategory() != Biome.BiomeCategory.NETHER) && (event.getCategory() != Biome.BiomeCategory.THEEND)
                && (event.getCategory() != Biome.BiomeCategory.NONE)) {
            if (Configuration.aluminumGen) {
                event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> ATOConfiguredFeature.ORE_ALUMINUM);
            }
            if (Configuration.leadGen) {
                event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> ATOConfiguredFeature.ORE_LEAD);
            }
            if (Configuration.nickelGen) {
                event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> ATOConfiguredFeature.ORE_NICKEL);
            }
            if (Configuration.osmiumGen) {
                event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> ATOConfiguredFeature.ORE_OSMIUM);
            }
            if (Configuration.platinumGen) {
                event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> ATOConfiguredFeature.ORE_PLATINUM);
            }
            if (Configuration.silverGen) {
                event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> ATOConfiguredFeature.ORE_SILVER);
            }
            if (Configuration.tinGen) {
                event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> ATOConfiguredFeature.ORE_TIN);
            }
            if (Configuration.uraniumGen) {
                event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> ATOConfiguredFeature.ORE_URANIUM);
            }
            if (Configuration.zincGen) {
                event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> ATOConfiguredFeature.ORE_ZINC);
            }
        }
    }
}

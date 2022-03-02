package net.allthemods.alltheores.worldgen;

import net.allthemods.alltheores.infos.Configuration;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;

public class ATOPlacedFeatures {

    public static final PlacedFeature ORE_ALUMINIUM = PlacementUtils.register("ore_aluminum", ATOConfiguredFeature.ORE_ALUMINUM.placed(commonOrePlacement(Configuration.COMMON.aluminum_SpawnCount.get(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(Configuration.COMMON.aluminum_MinY.get()), VerticalAnchor.aboveBottom(Configuration.COMMON.aluminum_MaxY.get())))));
    public static final PlacedFeature ORE_LEAD = PlacementUtils.register("ore_lead", ATOConfiguredFeature.ORE_LEAD.placed(commonOrePlacement(Configuration.COMMON.lead_SpawnCount.get(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(Configuration.COMMON.lead_MinY.get()), VerticalAnchor.aboveBottom(Configuration.COMMON.lead_MaxY.get())))));
    public static final PlacedFeature ORE_NICKEL = PlacementUtils.register("ore_nickel", ATOConfiguredFeature.ORE_NICKEL.placed(commonOrePlacement(Configuration.COMMON.nickel_SpawnCount.get(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(Configuration.COMMON.nickel_MinY.get()), VerticalAnchor.aboveBottom(Configuration.COMMON.nickel_MaxY.get())))));
    public static final PlacedFeature ORE_OSMIUM = PlacementUtils.register("ore_osmium", ATOConfiguredFeature.ORE_OSMIUM.placed(commonOrePlacement(Configuration.COMMON.osmium_SpawnCount.get(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(Configuration.COMMON.osmium_MinY.get()), VerticalAnchor.aboveBottom(Configuration.COMMON.osmium_MaxY.get())))));
    public static final PlacedFeature ORE_PLATINUM = PlacementUtils.register("ore_platinum", ATOConfiguredFeature.ORE_PLATINUM.placed(commonOrePlacement(Configuration.COMMON.platinum_SpawnCount.get(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(Configuration.COMMON.platinum_MinY.get()), VerticalAnchor.aboveBottom(Configuration.COMMON.platinum_MaxY.get())))));
    public static final PlacedFeature ORE_SILVER = PlacementUtils.register("ore_silver", ATOConfiguredFeature.ORE_SILVER.placed(commonOrePlacement(Configuration.COMMON.silver_SpawnCount.get(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(Configuration.COMMON.silver_MinY.get()), VerticalAnchor.aboveBottom(Configuration.COMMON.silver_MaxY.get())))));
    public static final PlacedFeature ORE_TIN = PlacementUtils.register("ore_tin", ATOConfiguredFeature.ORE_TIN.placed(commonOrePlacement(Configuration.COMMON.tin_SpawnCount.get(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(Configuration.COMMON.tin_MinY.get()), VerticalAnchor.aboveBottom(Configuration.COMMON.tin_MaxY.get())))));
    public static final PlacedFeature ORE_URANIUM = PlacementUtils.register("ore_uranium", ATOConfiguredFeature.ORE_URANIUM.placed(commonOrePlacement(Configuration.COMMON.uranium_SpawnCount.get(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(Configuration.COMMON.uranium_MinY.get()), VerticalAnchor.aboveBottom(Configuration.COMMON.uranium_MaxY.get())))));
    public static final PlacedFeature ORE_ZINC = PlacementUtils.register("ore_zinc", ATOConfiguredFeature.ORE_ZINC.placed(commonOrePlacement(Configuration.COMMON.zinc_SpawnCount.get(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(Configuration.COMMON.zinc_MinY.get()), VerticalAnchor.aboveBottom(Configuration.COMMON.zinc_MaxY.get())))));

    public static final PlacedFeature RAW_ALUMINIUM = PlacementUtils.register("ore_aluminum_raw", ATOConfiguredFeature.RAW_ALUMINUM.placed(commonOrePlacement(Configuration.COMMON.aluminum_SpawnCount.get(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(Configuration.COMMON.aluminum_MinY.get()), VerticalAnchor.aboveBottom(Configuration.COMMON.aluminum_MaxY.get())))));
    public static final PlacedFeature RAW_LEAD = PlacementUtils.register("ore_lead_raw", ATOConfiguredFeature.RAW_LEAD.placed(commonOrePlacement(Configuration.COMMON.lead_SpawnCount.get(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(Configuration.COMMON.lead_MinY.get()), VerticalAnchor.aboveBottom(Configuration.COMMON.lead_MaxY.get())))));
    public static final PlacedFeature RAW_NICKEL = PlacementUtils.register("ore_nickel_raw", ATOConfiguredFeature.RAW_NICKEL.placed(commonOrePlacement(Configuration.COMMON.nickel_SpawnCount.get(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(Configuration.COMMON.nickel_MinY.get()), VerticalAnchor.aboveBottom(Configuration.COMMON.nickel_MaxY.get())))));
    public static final PlacedFeature RAW_OSMIUM = PlacementUtils.register("ore_osmium_raw", ATOConfiguredFeature.RAW_OSMIUM.placed(commonOrePlacement(Configuration.COMMON.osmium_SpawnCount.get(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(Configuration.COMMON.osmium_MinY.get()), VerticalAnchor.aboveBottom(Configuration.COMMON.osmium_MaxY.get())))));
    public static final PlacedFeature RAW_PLATINUM = PlacementUtils.register("ore_platinum_raw", ATOConfiguredFeature.RAW_PLATINUM.placed(commonOrePlacement(Configuration.COMMON.platinum_SpawnCount.get(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(Configuration.COMMON.platinum_MinY.get()), VerticalAnchor.aboveBottom(Configuration.COMMON.platinum_MaxY.get())))));
    public static final PlacedFeature RAW_SILVER = PlacementUtils.register("ore_silver_raw", ATOConfiguredFeature.RAW_SILVER.placed(commonOrePlacement(Configuration.COMMON.silver_SpawnCount.get(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(Configuration.COMMON.silver_MinY.get()), VerticalAnchor.aboveBottom(Configuration.COMMON.silver_MaxY.get())))));
    public static final PlacedFeature RAW_TIN = PlacementUtils.register("ore_tin_raw", ATOConfiguredFeature.RAW_TIN.placed(commonOrePlacement(Configuration.COMMON.tin_SpawnCount.get(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(Configuration.COMMON.tin_MinY.get()), VerticalAnchor.aboveBottom(Configuration.COMMON.tin_MaxY.get())))));
    public static final PlacedFeature RAW_URANIUM = PlacementUtils.register("ore_uranium_raw", ATOConfiguredFeature.RAW_URANIUM.placed(commonOrePlacement(Configuration.COMMON.uranium_SpawnCount.get(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(Configuration.COMMON.uranium_MinY.get()), VerticalAnchor.aboveBottom(Configuration.COMMON.uranium_MaxY.get())))));
    public static final PlacedFeature RAW_ZINC = PlacementUtils.register("ore_zinc_raw", ATOConfiguredFeature.RAW_ZINC.placed(commonOrePlacement(Configuration.COMMON.zinc_SpawnCount.get(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(Configuration.COMMON.zinc_MinY.get()), VerticalAnchor.aboveBottom(Configuration.COMMON.zinc_MaxY.get())))));


    private static List<PlacementModifier> orePlacement(PlacementModifier placement, PlacementModifier placement2) {
        return List.of(placement, InSquarePlacement.spread(), placement2, BiomeFilter.biome());
    }

    private static List<PlacementModifier> commonOrePlacement(int count, PlacementModifier pm) {
        return orePlacement(CountPlacement.of(count), pm);
    }

    private static List<PlacementModifier> rareOrePlacement(int rarity, PlacementModifier pm) {
        return orePlacement(RarityFilter.onAverageOnceEvery(rarity), pm);
    }
}

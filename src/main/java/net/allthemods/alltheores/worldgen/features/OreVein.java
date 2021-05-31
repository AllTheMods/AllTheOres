package net.allthemods.alltheores.worldgen.features;

import com.mojang.serialization.Codec;
import net.allthemods.alltheores.infos.Configuration;
import net.minecraft.block.Block;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceContext;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.math.vector.Vector3i;
import net.minecraft.util.math.vector.Vector4f;
import net.minecraft.world.ISeedReader;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.NoFeatureConfig;

import java.util.Random;
import java.util.UUID;

public class OreVein extends Feature<NoFeatureConfig> {
private Block oreType;

    public OreVein(Codec<NoFeatureConfig> p_i231953_1_, Block oretype) {
        super(p_i231953_1_);
        this.oreType = oretype;
    }

    @Override
    public boolean place(ISeedReader world, ChunkGenerator chunkgen, Random rand, BlockPos pos, NoFeatureConfig config) {
        int minY,maxY,veinSize,veinCount,curY;
        curY = pos.getY();
        switch(this.oreType.getRegistryName().toString()) {
            case "alltheores:aluminum_ore":
                minY = Configuration.COMMON.aluminum_MinY.get();
                maxY = Configuration.COMMON.aluminum_MaxY.get();
                veinSize = Configuration.COMMON.aluminum_SpawnSize.get();
                veinCount = Configuration.COMMON.aluminum_VeinCount.get();
            case "alltheores:lead_ore":
                minY = Configuration.COMMON.lead_MinY.get();
                maxY = Configuration.COMMON.lead_MaxY.get();
                veinSize = Configuration.COMMON.lead_SpawnSize.get();
                veinCount = Configuration.COMMON.lead_VeinCount.get();
            case "alltheores:nickel_ore":
                minY = Configuration.COMMON.nickel_MinY.get();
                maxY = Configuration.COMMON.nickel_MaxY.get();
                veinSize = Configuration.COMMON.nickel_SpawnSize.get();
                veinCount = Configuration.COMMON.nickel_VeinCount.get();
            case "alltheores:osmium_ore":
                minY = Configuration.COMMON.osmium_MinY.get();
                maxY = Configuration.COMMON.osmium_MaxY.get();
                veinSize = Configuration.COMMON.osmium_SpawnSize.get();
                veinCount = Configuration.COMMON.osmium_VeinCount.get();
            case "alltheores:platinum_ore":
                minY = Configuration.COMMON.platinum_MinY.get();
                maxY = Configuration.COMMON.platinum_MaxY.get();
                veinSize = Configuration.COMMON.platinum_SpawnSize.get();
                veinCount = Configuration.COMMON.platinum_VeinCount.get();
            case "alltheores:silver_ore":
                minY = Configuration.COMMON.silver_MinY.get();
                maxY = Configuration.COMMON.silver_MaxY.get();
                veinSize = Configuration.COMMON.silver_SpawnSize.get();
                veinCount = Configuration.COMMON.silver_VeinCount.get();
            case "alltheores:tin_ore":
                minY = Configuration.COMMON.tin_MinY.get();
                maxY = Configuration.COMMON.tin_MaxY.get();
                veinSize = Configuration.COMMON.tin_SpawnSize.get();
                veinCount = Configuration.COMMON.tin_VeinCount.get();
            case "alltheores:uranium_ore":
                minY = Configuration.COMMON.uranium_MinY.get();
                maxY = Configuration.COMMON.uranium_MaxY.get();
                veinSize = Configuration.COMMON.uranium_SpawnSize.get();
                veinCount = Configuration.COMMON.uranium_VeinCount.get();
            case "alltheores:zinc_ore":
                minY = Configuration.COMMON.zinc_MinY.get();
                maxY = Configuration.COMMON.zinc_MaxY.get();
                veinSize = Configuration.COMMON.zinc_SpawnSize.get();
                veinCount = Configuration.COMMON.zinc_VeinCount.get();
        }
        

        return false;
    }
}

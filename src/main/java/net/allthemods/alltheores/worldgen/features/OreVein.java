package net.allthemods.alltheores.worldgen.features;

import com.mojang.serialization.Codec;
import net.allthemods.alltheores.infos.Configuration;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.Direction;
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
private Block deepSlate_oreType;
private BlockPos genLocation;
private Direction[] directions = { Direction.UP,Direction.DOWN,Direction.NORTH,Direction.EAST,Direction.SOUTH,Direction.WEST};

    public OreVein(Codec<NoFeatureConfig> p_i231953_1_, Block oretype, Block deepSlate_oretype) {
        super(p_i231953_1_);
        this.oreType = oretype;
        this.deepSlate_oreType = deepSlate_oretype;
    }
    private BlockPos getPreviousLocation() {
        return this.genLocation;
    }
    @Override
    public boolean place(ISeedReader world, ChunkGenerator chunkgen, Random rand, BlockPos pos, NoFeatureConfig config) {
        BlockPos prev;
        if(this.getPreviousLocation() != null) { prev = this.getPreviousLocation();}
        else { prev = new BlockPos(0,65,0); }
        BlockState state = world.getBlockState(pos);
        int minY = -64,maxY = -64,veinSize = -64,veinCount = -64,curY = -64, curX,curZ;
        curY = pos.getY();
        int direction = rand.nextInt(5);

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
        if((minY > pos.getY()) || (maxY < pos.getY())) { return false; }

        int distance_away = ((prev.getX() - pos.getX())^2 + (prev.getZ() - pos.getZ()));
        int processed = 0;
        if(distance_away >= veinCount) {
            if ((veinSize <= 0) || (state.getBlock() == Blocks.VOID_AIR) || (state.getBlock() == Blocks.BEDROCK) || (state.getBlock() == Blocks.AIR) || (state.getBlock() == Blocks.CAVE_AIR)) {
                return false;
            }
            int step = (veinSize - 1) / 3;
            world.setBlock(pos, pos.getY() > 0 ? this.oreType.defaultBlockState() : this.deepSlate_oreType.defaultBlockState() , 1, 512);
            processed++;
            int new_direction = 0;
            for (int i = 0; i <= step; i++) {
                //direction { Direction.UP,Direction.DOWN,Direction.NORTH,Direction.EAST,Direction.SOUTH,Direction.WEST};
                if (processed == veinSize) {
                    break;
                }
                switch (direction) {
                    case 0:
                        for (int up = 1; up <= 3; up++) {
                            state = world.getBlockState(pos.above());
                            if ((state.getBlock() == Blocks.VOID_AIR) ||
                                    (state.getBlock() == Blocks.BEDROCK) ||
                                    (state.getBlock() == Blocks.AIR) ||
                                    (state.getBlock() == Blocks.CAVE_AIR) ||
                                    (state.getBlock() == this.oreType) ||
                                    (state.getBlock() == this.deepSlate_oreType)) {
                                break;
                            }
                            world.setBlock(pos.above(), pos.above().getY() > 0 ? this.oreType.defaultBlockState() : this.deepSlate_oreType.defaultBlockState() , 1, 512);
                            processed++;
                            if (processed == veinSize) {
                                break;
                            }
                            pos = pos.above();

                        }
                        new_direction = rand.nextInt(5);
                        if (new_direction == direction) {
                            direction = direction + 2;
                            break;
                        } else { direction = new_direction; }
                    case 1:
                        for (int down = 1; down <= 3; down++) {
                            state = world.getBlockState(pos.below());
                            if ((state.getBlock() == Blocks.VOID_AIR) ||
                                    (state.getBlock() == Blocks.BEDROCK) ||
                                    (state.getBlock() == Blocks.AIR) ||
                                    (state.getBlock() == Blocks.CAVE_AIR) ||
                                    (state.getBlock() == this.oreType) ||
                                    (state.getBlock() == this.deepSlate_oreType)) {
                                break;
                            }
                            world.setBlock(pos.below(),pos.below().getY() > 0 ? this.oreType.defaultBlockState() : this.deepSlate_oreType.defaultBlockState() , 1, 512);
                            processed++;
                            if (processed == veinSize) {
                                break;
                            }
                            pos = pos.below();
                        }
                        new_direction = rand.nextInt(5);
                        if (new_direction == direction) {
                            direction = direction + 2;
                            break;
                        }else { direction = new_direction; }
                    case 2:
                        for (int north = 1; north <= 3; north++) {
                            state = world.getBlockState(pos.north());
                            if ((state.getBlock() == Blocks.VOID_AIR) ||
                                    (state.getBlock() == Blocks.BEDROCK) ||
                                    (state.getBlock() == Blocks.AIR) ||
                                    (state.getBlock() == Blocks.CAVE_AIR) ||
                                    (state.getBlock() == this.oreType) ||
                                    (state.getBlock() == this.deepSlate_oreType)) {
                                break;
                            }
                            world.setBlock(pos.north(), pos.north().getY() > 0 ? this.oreType.defaultBlockState() : this.deepSlate_oreType.defaultBlockState() , 1, 512);
                            processed++;
                            if (processed == veinSize) {
                                break;
                            }
                            pos = pos.north();
                        }
                        new_direction = rand.nextInt(5);
                        if (new_direction == direction) {
                            direction = direction + 1;
                            break;
                        } else { direction = new_direction; }
                    case 3:
                        for (int east = 1; east <= 3; east++) {
                            state = world.getBlockState(pos.east());
                            if ((state.getBlock() == Blocks.VOID_AIR) ||
                                    (state.getBlock() == Blocks.BEDROCK) ||
                                    (state.getBlock() == Blocks.AIR) ||
                                    (state.getBlock() == Blocks.CAVE_AIR) ||
                                    (state.getBlock() == this.oreType) ||
                                    (state.getBlock() == this.deepSlate_oreType)) {
                                break;
                            }
                            world.setBlock(pos.east(), pos.east().getY() > 0 ? this.oreType.defaultBlockState() : this.deepSlate_oreType.defaultBlockState() , 1, 512);
                            processed++;
                            if (processed == veinSize) {
                                break;
                            }
                            pos = pos.east();
                        }
                        new_direction = rand.nextInt(5);
                        if (new_direction == direction) {
                            direction = direction + 1;
                            break;
                        } else { direction = new_direction; }
                    case 4:
                        for (int south = 1; south <= 3; south++) {
                            state = world.getBlockState(pos.south());
                            if ((state.getBlock() == Blocks.VOID_AIR) ||
                                    (state.getBlock() == Blocks.BEDROCK) ||
                                    (state.getBlock() == Blocks.AIR) ||
                                    (state.getBlock() == Blocks.CAVE_AIR) ||
                                    (state.getBlock() == this.oreType) ||
                                    (state.getBlock() == this.deepSlate_oreType)) {
                                break;
                            }
                            world.setBlock(pos.south(), pos.south().getY() > 0 ? this.oreType.defaultBlockState() : this.deepSlate_oreType.defaultBlockState() , 1, 512);
                            processed++;
                            if (processed == veinSize) {
                                break;
                            }
                            pos = pos.south();
                        }
                        new_direction = rand.nextInt(5);
                        if (new_direction == direction) {
                            direction = direction + 1;
                            break;
                        } else { direction = new_direction; }
                    case 5:
                        for (int west = 1; west <= 3; west++) {
                            state = world.getBlockState(pos.west());
                            if ((state.getBlock() == Blocks.VOID_AIR) ||
                                    (state.getBlock() == Blocks.BEDROCK) ||
                                    (state.getBlock() == Blocks.AIR) ||
                                    (state.getBlock() == Blocks.CAVE_AIR) ||
                                    (state.getBlock() == this.oreType) ||
                                    (state.getBlock() == this.deepSlate_oreType)) {
                                break;
                            }
                            world.setBlock(pos.west(), pos.west().getY() > 0 ? this.oreType.defaultBlockState() : this.deepSlate_oreType.defaultBlockState() , 1, 512);
                            processed++;
                            if (processed == veinSize) {
                                break;
                            }
                            pos = pos.west();
                        }
                        new_direction = rand.nextInt(5);
                        if (new_direction == direction) {
                            direction = direction - 3;
                            break;
                        } else { direction = new_direction; }
                }

            }
        }
        if((this.genLocation == null) && (processed>0) ) { this.genLocation = pos; return true; }
        return false;
    }
}

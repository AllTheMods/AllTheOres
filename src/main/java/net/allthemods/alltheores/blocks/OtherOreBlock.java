package net.allthemods.alltheores.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Position;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.PushReaction;

import net.minecraftforge.common.util.FakePlayer;

public class OtherOreBlock extends DropExperienceBlock {

    public OtherOreBlock() {
        super(Properties.of(Material.HEAVY_METAL).requiresCorrectToolForDrops().sound(SoundType.STONE)
                .strength(-1.0f));
    }


    @Override
    @SuppressWarnings("java:S1874") // deprecated method from super class
    public float getDestroyProgress(BlockState state, Player player, BlockGetter getter, BlockPos blockPos) {
        BlockEntity blockEntity = getter.getBlockEntity(blockPos);
        if (canEntityDestroy(state,getter,blockPos, player)) {
            int i = net.minecraftforge.common.ForgeHooks.isCorrectToolForDrops(state, player) ? 25 : 100;
            return player.getDigSpeed(state, blockPos) / 2.0F / i;
        }
        return 0.0F;
    }
    @Override
    public boolean canHarvestBlock(BlockState state, BlockGetter world, BlockPos pos, Player player) {
        if ((player instanceof FakePlayer) && (state.getBlock() instanceof OtherOreBlock)) {
            return false;
        }
        return super.canHarvestBlock(state, world, pos, player);
    }

    @Override
    public PushReaction getPistonPushReaction(BlockState state) {

        return PushReaction.BLOCK;
    }

}



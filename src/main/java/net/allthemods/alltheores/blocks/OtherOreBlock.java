package net.allthemods.alltheores.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Position;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.PushReaction;

import net.minecraftforge.common.util.FakePlayer;
import net.minecraftforge.common.util.FakePlayerFactory;
import net.minecraftforge.server.permission.context.PlayerContext;
import net.minecraftforge.server.permission.context.WorldContext;

public class OtherOreBlock extends Block {

    public OtherOreBlock() {
        super(Properties.of(Material.HEAVY_METAL).requiresCorrectToolForDrops().sound(SoundType.STONE)
                .strength(113.0f));
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

/*
    @Deprecated
    @Override
    @MethodsReturnNonnullByDefault
    public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
        List<ItemStack> list = new ArrayList<ItemStack>();

        if (state.getBlock() == BlockList.OTHER_DIAMOND_ORE.get()) {
            list.add(new ItemStack(Items.DIAMOND, RANDOM.nextInt(12)+3));
        }
        if (state.getBlock() == BlockList.OTHER_COAL_ORE.get()) {
            list.add(new ItemStack(Items.COAL_BLOCK, RANDOM.nextInt(3)+3));
        }
        if (state.getBlock() == BlockList.OTHER_REDSTONE_ORE.get()) {
            list.add(new ItemStack(Items.REDSTONE, RANDOM.nextInt(20)+6));
        }
        if (state.getBlock() == BlockList.OTHER_LAPIS_ORE.get()) {
            list.add(new ItemStack(Items.LAPIS_LAZULI, RANDOM.nextInt(20)+6));
        }

        if (state.getBlock() == BlockList.OTHER_IRON_ORE.get()) {
            list.add(new ItemStack(Blocks.IRON_ORE.asItem(), RANDOM.nextInt(5)+3));
        }
        if (state.getBlock() == BlockList.OTHER_PLATINUM_ORE.get()) {
            list.add(new ItemStack(BlockList.PLATINUM_ORE_ITEM.get(), RANDOM.nextInt(10)+6));
        }
        if (state.getBlock() == BlockList.OTHER_ALUMINUM_ORE.get()) {
            list.add(new ItemStack(BlockList.ALUMINUM_ORE_ITEM.get(), RANDOM.nextInt(5)+3));
        }
        if (state.getBlock() == BlockList.OTHER_COPPER_ORE.get()) {
            //list.add(new ItemStack(BlockList.COPPER_ORE_ITEM.get(), RANDOM.nextInt(5)+3));
        }
        if (state.getBlock() == BlockList.OTHER_LEAD_ORE.get()) {
            list.add(new ItemStack(BlockList.LEAD_ORE_ITEM.get(), RANDOM.nextInt(5)+3));
        }
        if (state.getBlock() == BlockList.OTHER_OSMIUM_ORE.get()) {
            list.add(new ItemStack(BlockList.OSMIUM_ORE_ITEM.get(), RANDOM.nextInt(5)+3));
        }
        if (state.getBlock() == BlockList.OTHER_NICKEL_ORE.get()) {
            list.add(new ItemStack(BlockList.NICKEL_ORE_ITEM.get(), RANDOM.nextInt(5)+3));
        }
        if (state.getBlock() == BlockList.OTHER_SILVER_ORE.get()) {
            list.add(new ItemStack(BlockList.SILVER_ORE_ITEM.get(), RANDOM.nextInt(5)+3));
        }
        if (state.getBlock() == BlockList.OTHER_URANIUM_ORE.get()) {
            list.add(new ItemStack(BlockList.URANIUM_ORE_ITEM.get(), RANDOM.nextInt(10)+6));
        }
        if (state.getBlock() == BlockList.OTHER_TIN_ORE.get()) {
            list.add(new ItemStack(BlockList.TIN_ORE_ITEM.get(), RANDOM.nextInt(5)+3));
        }
        if (state.getBlock() == BlockList.OTHER_ZINC_ORE.get()) {
            list.add(new ItemStack(BlockList.ZINC_ORE_ITEM.get(), RANDOM.nextInt(5)+3));
        }

        return list;
    }*/
}



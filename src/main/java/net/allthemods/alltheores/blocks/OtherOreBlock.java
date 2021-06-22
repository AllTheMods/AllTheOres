package net.allthemods.alltheores.blocks;

import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.PushReaction;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.loot.LootContext;
import net.minecraft.loot.conditions.RandomChanceWithLooting;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.Explosion;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.common.util.FakePlayer;

import java.util.ArrayList;
import java.util.List;

public class OtherOreBlock extends Block {

    public OtherOreBlock() {
        super(Properties.of(Material.HEAVY_METAL).requiresCorrectToolForDrops().sound(SoundType.STONE)
                .strength(113.0f));
    }


    @Override
    public boolean canHarvestBlock(BlockState state, IBlockReader world, BlockPos pos, PlayerEntity player) {
        if ((player instanceof FakePlayer) && (state.getBlock() instanceof OtherOreBlock)) {
            return false;
        }
        return super.canHarvestBlock(state, world, pos, player);
    }

    @Override
    public ToolType getHarvestTool(BlockState state) {
        return ToolType.PICKAXE;
    }

    @Override
    public PushReaction getPistonPushReaction(BlockState state) {

        return PushReaction.BLOCK;
    }

    @Override
    public int getHarvestLevel(BlockState state) {
        if (state.getBlock() == BlockList.PLATINUM.OTHER_ORE.get()) {
            return 7;
        }
        if (state.getBlock() == BlockList.URANIUM.OTHER_ORE.get()) {
            return 7;
        }
        if (state.getBlock() == BlockList.OTHER_REDSTONE_ORE.get()) {
            return 7;
        }
        if (state.getBlock() == BlockList.OTHER_LAPIS_ORE.get()) {
            return 7;
        }
        if (state.getBlock() == BlockList.OTHER_DIAMOND_ORE.get()) {
            return 7;
        }
        return 6;
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



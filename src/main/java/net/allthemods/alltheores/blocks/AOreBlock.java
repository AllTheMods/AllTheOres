package net.allthemods.alltheores.blocks;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.loot.LootContext;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.common.loot.LootModifier;

public class AOreBlock extends Block {

	public AOreBlock() {
		super(Block.Properties.create(Material.IRON).setRequiresTool().sound(SoundType.STONE)
				.hardnessAndResistance(3.0f));
	}

	@Override
	public ToolType getHarvestTool(BlockState state) {
		return ToolType.PICKAXE;
	}

	@Override
	public int getHarvestLevel(BlockState state) {
		if(state.getBlock() == BlockList.PLATINUM_ORE.get()) { return 2; }
		if(state.getBlock() == BlockList.URANIUM_ORE.get()) { return 2; }
		return 1;
	}

/*
	@Deprecated
	@Override
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
		List<ItemStack> list = new ArrayList<ItemStack>();
		list.add(new ItemStack(state.getBlock().asItem()));
		return list;
	}*/
}

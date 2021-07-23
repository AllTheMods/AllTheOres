package net.allthemods.alltheores.blocks;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.common.ToolType;

import javax.annotation.Nullable;

public class AOreBlock extends Block {

	public AOreBlock(float strength1, float strength2) {
		super(Block.Properties.of(Material.METAL).requiresCorrectToolForDrops().sound(SoundType.STONE)
				.strength(strength1,strength2));

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

}

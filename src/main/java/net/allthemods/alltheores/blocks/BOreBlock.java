package net.allthemods.alltheores.blocks;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TieredItem;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.OreBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.WeatheringCopper;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.common.ToolAction;
import net.minecraftforge.common.ToolActions;

public class BOreBlock extends OreBlock {

	public BOreBlock(float strength1, float strength2) {
		super(Block.Properties.of(Material.METAL).requiresCorrectToolForDrops().sound((strength1 == 0.85f) ? SoundType.NETHER_ORE : SoundType.ANCIENT_DEBRIS)
				.strength(strength1,strength2));

	}


}

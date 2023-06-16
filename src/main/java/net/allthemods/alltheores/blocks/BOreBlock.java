package net.allthemods.alltheores.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
public class BOreBlock extends DropExperienceBlock {

	public BOreBlock(float strength1, float strength2) {
		super(Block.Properties.of().requiresCorrectToolForDrops().sound((strength1 == 4.0f) ? SoundType.NETHER_ORE : SoundType.ANCIENT_DEBRIS)
				.strength(strength1,strength2));

	}


}

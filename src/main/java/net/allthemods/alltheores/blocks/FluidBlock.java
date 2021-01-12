package net.allthemods.alltheores.blocks;

import java.util.function.Supplier;

import net.minecraft.block.FlowingFluidBlock;
import net.minecraft.block.AbstractBlock.Properties;
import net.minecraft.fluid.FlowingFluid;

public class FluidBlock extends FlowingFluidBlock {

	public FluidBlock(Supplier<? extends FlowingFluid> supplier, Properties p_i48368_1_) {
		super(supplier, p_i48368_1_);
	}
}
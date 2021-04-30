package net.allthemods.alltheores.blocks;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.ITickable;
import net.minecraft.state.IntegerProperty;
import net.minecraft.util.Direction;

public class AgingBlock extends Block implements ITickable {
    public int blockAge;
    public IntegerProperty tarnishLevel;
    public AgingBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.stateDefinition.any().setValue(tarnishLevel, 0));
    }

    @Override
    public void tick() {
        this.blockAge++;

    }



}

package net.allthemods.alltheores.datagen.client;

import net.allthemods.alltheores.blocks.BlockList;
import net.allthemods.alltheores.infos.Reference;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockModelBuilder;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class BlockStates extends BlockStateProvider {
    public BlockStates(DataGenerator generator, ExistingFileHelper fileHelper) {
        super(generator, Reference.MOD_ID, fileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        List<Block> entries = BlockList.BLOCKS.getEntries()
            .stream().map(RegistryObject::get)
            .collect(Collectors.toList());

        entries.forEach(this::simpleBlockAndItem);
    }

    /**
     * Generates an item model and block model/blockstate for a simple block
     * @param block the block
     */
    private void simpleBlockAndItem(Block block) {
        simpleBlock(block);

        String blockName = Objects.requireNonNull(block.getName()).toString();
        BlockModelBuilder builder = models().getBuilder(blockName);
        simpleBlockItem(block, builder);
    }
}

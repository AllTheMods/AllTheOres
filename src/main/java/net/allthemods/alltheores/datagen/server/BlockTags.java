package net.allthemods.alltheores.datagen.server;

import net.allthemods.alltheores.blocks.BlockList;
import net.allthemods.alltheores.infos.ItemTagRegistry;
import net.allthemods.alltheores.infos.Reference;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;

public class BlockTags extends BlockTagsProvider {

    public BlockTags(DataGenerator generator, @Nullable ExistingFileHelper existingFileHelper) {
        super(generator, Reference.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags() {
        tag(ItemTagRegistry.ALUMINUM_BLOCK).add(BlockList.ALUMINUM_BLOCK.get());
        tag(ItemTagRegistry.LEAD_BLOCK).add(BlockList.LEAD_BLOCK.get());
        tag(ItemTagRegistry.OSMIUM_BLOCK).add(BlockList.OSMIUM_BLOCK.get());
        tag(ItemTagRegistry.NICKEL_BLOCK).add(BlockList.NICKEL_BLOCK.get());
        tag(ItemTagRegistry.PLATINUM_BLOCK).add(BlockList.PLATINUM_BLOCK.get());
        tag(ItemTagRegistry.SILVER_BLOCK).add(BlockList.SILVER_BLOCK.get());
        tag(ItemTagRegistry.TIN_BLOCK).add(BlockList.TIN_BLOCK.get());
        tag(ItemTagRegistry.URANIUM_BLOCK).add(BlockList.URANIUM_BLOCK.get());
        tag(ItemTagRegistry.ZINC_BLOCK).add(BlockList.ZINC_BLOCK.get());
        tag(ItemTagRegistry.BRONZE_BLOCK).add(BlockList.BRONZE_BLOCK.get());
        tag(ItemTagRegistry.CONSTANTAN_BLOCK).add(BlockList.CONSTANTAN_BLOCK.get());
        tag(ItemTagRegistry.ELECTRUM_BLOCK).add(BlockList.ELECTRUM_BLOCK.get());
        tag(ItemTagRegistry.ENDERIUM_BLOCK).add(BlockList.ENDERIUM_BLOCK.get());
        tag(ItemTagRegistry.INVAR_BLOCK).add(BlockList.INVAR_BLOCK.get());
        tag(ItemTagRegistry.LUMIUM_BLOCK).add(BlockList.LUMIUM_BLOCK.get());
        tag(ItemTagRegistry.SIGNALUM_BLOCK).add(BlockList.SIGNALUM_BLOCK.get());
        tag(ItemTagRegistry.STEEL_BLOCK).add(BlockList.STEEL_BLOCK.get());


        tag(ItemTagRegistry.ALUMINUM_ORE).add(BlockList.ALUMINUM_ORE.get());
        tag(ItemTagRegistry.LEAD_ORE).add(BlockList.LEAD_ORE.get());
        tag(ItemTagRegistry.OSMIUM_ORE).add(BlockList.OSMIUM_ORE.get());
        tag(ItemTagRegistry.NICKEL_ORE).add(BlockList.NICKEL_ORE.get());
        tag(ItemTagRegistry.PLATINUM_ORE).add(BlockList.PLATINUM_ORE.get());
        tag(ItemTagRegistry.SILVER_ORE).add(BlockList.SILVER_ORE.get());
        tag(ItemTagRegistry.TIN_ORE).add(BlockList.TIN_ORE.get());
        tag(ItemTagRegistry.URANIUM_ORE).add(BlockList.URANIUM_ORE.get());
        tag(ItemTagRegistry.ZINC_ORE).add(BlockList.ZINC_ORE.get());
    }
}

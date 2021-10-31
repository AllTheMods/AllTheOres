package net.allthemods.alltheores.datagen.server;

import net.allthemods.alltheores.blocks.BlockList;
import net.allthemods.alltheores.infos.ItemTagRegistry;
import net.allthemods.alltheores.infos.Reference;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;

public class BlockTags extends BlockTagsProvider {

    public BlockTags(DataGenerator generator, @Nullable ExistingFileHelper existingFileHelper) {
        super(generator, Reference.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags() {
        tag(ItemTagRegistry.RAW_ALUMINUM_BLOCK).add(BlockList.RAW_ALUMINUM_BLOCK.get());
        tag(ItemTagRegistry.RAW_LEAD_BLOCK).add(BlockList.RAW_LEAD_BLOCK.get());
        tag(ItemTagRegistry.RAW_OSMIUM_BLOCK).add(BlockList.RAW_OSMIUM_BLOCK.get());
        tag(ItemTagRegistry.RAW_NICKEL_BLOCK).add(BlockList.RAW_NICKEL_BLOCK.get());
        tag(ItemTagRegistry.RAW_PLATINUM_BLOCK).add(BlockList.RAW_PLATINUM_BLOCK.get());
        tag(ItemTagRegistry.RAW_SILVER_BLOCK).add(BlockList.RAW_SILVER_BLOCK.get());
        tag(ItemTagRegistry.RAW_TIN_BLOCK).add(BlockList.RAW_TIN_BLOCK.get());
        tag(ItemTagRegistry.RAW_URANIUM_BLOCK).add(BlockList.RAW_URANIUM_BLOCK.get());
        tag(ItemTagRegistry.RAW_ZINC_BLOCK).add(BlockList.RAW_ZINC_BLOCK.get());

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

        tag(ItemTagRegistry.ALUMINUM_ORE).add(BlockList.ALUMINUM_SLATE_ORE.get());
        tag(ItemTagRegistry.LEAD_ORE).add(BlockList.LEAD_SLATE_ORE.get());
        tag(ItemTagRegistry.OSMIUM_ORE).add(BlockList.OSMIUM_SLATE_ORE.get());
        tag(ItemTagRegistry.NICKEL_ORE).add(BlockList.NICKEL_SLATE_ORE.get());
        tag(ItemTagRegistry.PLATINUM_ORE).add(BlockList.PLATINUM_SLATE_ORE.get());
        tag(ItemTagRegistry.SILVER_ORE).add(BlockList.SILVER_SLATE_ORE.get());
        tag(ItemTagRegistry.TIN_ORE).add(BlockList.TIN_SLATE_ORE.get());
        tag(ItemTagRegistry.URANIUM_ORE).add(BlockList.URANIUM_SLATE_ORE.get());
        tag(ItemTagRegistry.ZINC_ORE).add(BlockList.ZINC_SLATE_ORE.get());

        tag(ItemTagRegistry.ALUMINUM_ORE).add(BlockList.ALUMINUM_NETHER_ORE.get());
        tag(ItemTagRegistry.LEAD_ORE).add(BlockList.LEAD_NETHER_ORE.get());
        tag(ItemTagRegistry.OSMIUM_ORE).add(BlockList.OSMIUM_NETHER_ORE.get());
        tag(ItemTagRegistry.NICKEL_ORE).add(BlockList.NICKEL_NETHER_ORE.get());
        tag(ItemTagRegistry.PLATINUM_ORE).add(BlockList.PLATINUM_NETHER_ORE.get());
        tag(ItemTagRegistry.SILVER_ORE).add(BlockList.SILVER_NETHER_ORE.get());
        tag(ItemTagRegistry.TIN_ORE).add(BlockList.TIN_NETHER_ORE.get());
        tag(ItemTagRegistry.URANIUM_ORE).add(BlockList.URANIUM_NETHER_ORE.get());
        tag(ItemTagRegistry.ZINC_ORE).add(BlockList.ZINC_NETHER_ORE.get());

        tag(ItemTagRegistry.ALUMINUM_ORE).add(BlockList.ALUMINUM_END_ORE.get());
        tag(ItemTagRegistry.LEAD_ORE).add(BlockList.LEAD_END_ORE.get());
        tag(ItemTagRegistry.OSMIUM_ORE).add(BlockList.OSMIUM_END_ORE.get());
        tag(ItemTagRegistry.NICKEL_ORE).add(BlockList.NICKEL_END_ORE.get());
        tag(ItemTagRegistry.PLATINUM_ORE).add(BlockList.PLATINUM_END_ORE.get());
        tag(ItemTagRegistry.SILVER_ORE).add(BlockList.SILVER_END_ORE.get());
        tag(ItemTagRegistry.TIN_ORE).add(BlockList.TIN_END_ORE.get());
        tag(ItemTagRegistry.URANIUM_ORE).add(BlockList.URANIUM_END_ORE.get());
        tag(ItemTagRegistry.ZINC_ORE).add(BlockList.ZINC_END_ORE.get());
    }
}

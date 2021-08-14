package net.allthemods.alltheores.datagen.server;

import net.allthemods.alltheores.blocks.BlockList;
import net.allthemods.alltheores.infos.ItemTagRegistry;
import net.allthemods.alltheores.infos.Reference;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ItemTags extends ItemTagsProvider {
    public ItemTags(DataGenerator generator, BlockTagsProvider blockTagsProvider, ExistingFileHelper existingFileHelper) {
        super(generator, blockTagsProvider, Reference.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags() {
        tag(ItemTagRegistry.ALUMINUM_INGOT).add(BlockList.ALUMINUM_INGOT.get());
        tag(ItemTagRegistry.LEAD_INGOT).add(BlockList.LEAD_INGOT.get());
        tag(ItemTagRegistry.OSMIUM_INGOT).add(BlockList.OSMIUM_INGOT.get());
        tag(ItemTagRegistry.NICKEL_INGOT).add(BlockList.NICKEL_INGOT.get());
        tag(ItemTagRegistry.PLATINUM_INGOT).add(BlockList.PLATINUM_INGOT.get());
        tag(ItemTagRegistry.SILVER_INGOT).add(BlockList.SILVER_INGOT.get());
        tag(ItemTagRegistry.TIN_INGOT).add(BlockList.TIN_INGOT.get());
        tag(ItemTagRegistry.URANIUM_INGOT).add(BlockList.URANIUM_INGOT.get());
        tag(ItemTagRegistry.ZINC_INGOT).add(BlockList.ZINC_INGOT.get());
        tag(ItemTagRegistry.BRONZE_INGOT).add(BlockList.BRONZE_INGOT.get());
        tag(ItemTagRegistry.CONSTANTAN_INGOT).add(BlockList.CONSTANTAN_INGOT.get());
        tag(ItemTagRegistry.ELECTRUM_INGOT).add(BlockList.ELECTRUM_INGOT.get());
        tag(ItemTagRegistry.ENDERIUM_INGOT).add(BlockList.ENDERIUM_INGOT.get());
        tag(ItemTagRegistry.INVAR_INGOT).add(BlockList.INVAR_INGOT.get());
        tag(ItemTagRegistry.LUMIUM_INGOT).add(BlockList.LUMIUM_INGOT.get());
        tag(ItemTagRegistry.SIGNALUM_INGOT).add(BlockList.SIGNALUM_INGOT.get());
        tag(ItemTagRegistry.STEEL_INGOT).add(BlockList.STEEL_INGOT.get());

        tag(ItemTagRegistry.ALUMINUM_NUGGET).add(BlockList.ALUMINUM_NUGGET.get());
        tag(ItemTagRegistry.LEAD_NUGGET).add(BlockList.LEAD_NUGGET.get());
        tag(ItemTagRegistry.OSMIUM_NUGGET).add(BlockList.OSMIUM_NUGGET.get());
        tag(ItemTagRegistry.NICKEL_NUGGET).add(BlockList.NICKEL_NUGGET.get());
        tag(ItemTagRegistry.PLATINUM_NUGGET).add(BlockList.PLATINUM_NUGGET.get());
        tag(ItemTagRegistry.SILVER_NUGGET).add(BlockList.SILVER_NUGGET.get());
        tag(ItemTagRegistry.TIN_NUGGET).add(BlockList.TIN_NUGGET.get());
        tag(ItemTagRegistry.URANIUM_NUGGET).add(BlockList.URANIUM_NUGGET.get());
        tag(ItemTagRegistry.ZINC_NUGGET).add(BlockList.ZINC_NUGGET.get());
        tag(ItemTagRegistry.BRONZE_NUGGET).add(BlockList.BRONZE_NUGGET.get());
        tag(ItemTagRegistry.CONSTANTAN_NUGGET).add(BlockList.CONSTANTAN_NUGGET.get());
        tag(ItemTagRegistry.ELECTRUM_NUGGET).add(BlockList.ELECTRUM_NUGGET.get());
        tag(ItemTagRegistry.ENDERIUM_NUGGET).add(BlockList.ENDERIUM_NUGGET.get());
        tag(ItemTagRegistry.INVAR_NUGGET).add(BlockList.INVAR_NUGGET.get());
        tag(ItemTagRegistry.LUMIUM_NUGGET).add(BlockList.LUMIUM_NUGGET.get());
        tag(ItemTagRegistry.SIGNALUM_NUGGET).add(BlockList.SIGNALUM_NUGGET.get());
        tag(ItemTagRegistry.STEEL_NUGGET).add(BlockList.STEEL_NUGGET.get());

        tag(ItemTagRegistry.RAW_ALUMINUM_BLOCK_ITEM).add(BlockList.RAW_ALUMINUM_BLOCK_ITEM.get());
        tag(ItemTagRegistry.RAW_LEAD_BLOCK_ITEM).add(BlockList.RAW_LEAD_BLOCK_ITEM.get());
        tag(ItemTagRegistry.RAW_OSMIUM_BLOCK_ITEM).add(BlockList.RAW_OSMIUM_BLOCK_ITEM.get());
        tag(ItemTagRegistry.RAW_NICKEL_BLOCK_ITEM).add(BlockList.RAW_NICKEL_BLOCK_ITEM.get());
        tag(ItemTagRegistry.RAW_PLATINUM_BLOCK_ITEM).add(BlockList.RAW_PLATINUM_BLOCK_ITEM.get());
        tag(ItemTagRegistry.RAW_SILVER_BLOCK_ITEM).add(BlockList.RAW_SILVER_BLOCK_ITEM.get());
        tag(ItemTagRegistry.RAW_TIN_BLOCK_ITEM).add(BlockList.RAW_TIN_BLOCK_ITEM.get());
        tag(ItemTagRegistry.RAW_URANIUM_BLOCK_ITEM).add(BlockList.RAW_URANIUM_BLOCK_ITEM.get());
        tag(ItemTagRegistry.RAW_ZINC_BLOCK_ITEM).add(BlockList.RAW_ZINC_BLOCK_ITEM.get());

        tag(ItemTagRegistry.ALUMINUM_BLOCK_ITEM).add(BlockList.ALUMINUM_BLOCK_ITEM.get());
        tag(ItemTagRegistry.LEAD_BLOCK_ITEM).add(BlockList.LEAD_BLOCK_ITEM.get());
        tag(ItemTagRegistry.OSMIUM_BLOCK_ITEM).add(BlockList.OSMIUM_BLOCK_ITEM.get());
        tag(ItemTagRegistry.NICKEL_BLOCK_ITEM).add(BlockList.NICKEL_BLOCK_ITEM.get());
        tag(ItemTagRegistry.PLATINUM_BLOCK_ITEM).add(BlockList.PLATINUM_BLOCK_ITEM.get());
        tag(ItemTagRegistry.SILVER_BLOCK_ITEM).add(BlockList.SILVER_BLOCK_ITEM.get());
        tag(ItemTagRegistry.TIN_BLOCK_ITEM).add(BlockList.TIN_BLOCK_ITEM.get());
        tag(ItemTagRegistry.URANIUM_BLOCK_ITEM).add(BlockList.URANIUM_BLOCK_ITEM.get());
        tag(ItemTagRegistry.ZINC_BLOCK_ITEM).add(BlockList.ZINC_BLOCK_ITEM.get());
        tag(ItemTagRegistry.BRONZE_BLOCK_ITEM).add(BlockList.BRONZE_BLOCK_ITEM.get());
        tag(ItemTagRegistry.CONSTANTAN_BLOCK_ITEM).add(BlockList.CONSTANTAN_BLOCK_ITEM.get());
        tag(ItemTagRegistry.ELECTRUM_BLOCK_ITEM).add(BlockList.ELECTRUM_BLOCK_ITEM.get());
        tag(ItemTagRegistry.ENDERIUM_BLOCK_ITEM).add(BlockList.ENDERIUM_BLOCK_ITEM.get());
        tag(ItemTagRegistry.INVAR_BLOCK_ITEM).add(BlockList.INVAR_BLOCK_ITEM.get());
        tag(ItemTagRegistry.LUMIUM_BLOCK_ITEM).add(BlockList.LUMIUM_BLOCK_ITEM.get());
        tag(ItemTagRegistry.SIGNALUM_BLOCK_ITEM).add(BlockList.SIGNALUM_BLOCK_ITEM.get());
        tag(ItemTagRegistry.STEEL_BLOCK_ITEM).add(BlockList.STEEL_BLOCK_ITEM.get());

        tag(ItemTagRegistry.PLATINUM_DUST).add(BlockList.PLATINUM_DUST.get());
        tag(ItemTagRegistry.ALUMINUM_DUST).add(BlockList.ALUMINUM_DUST.get());
        tag(ItemTagRegistry.URANIUM_DUST).add(BlockList.URANIUM_DUST.get());
        tag(ItemTagRegistry.NICKEL_DUST).add(BlockList.NICKEL_DUST.get());
        tag(ItemTagRegistry.SILVER_DUST).add(BlockList.SILVER_DUST.get());
        tag(ItemTagRegistry.OSMIUM_DUST).add(BlockList.OSMIUM_DUST.get());
        tag(ItemTagRegistry.ZINC_DUST).add(BlockList.ZINC_DUST.get());
        tag(ItemTagRegistry.LEAD_DUST).add(BlockList.LEAD_DUST.get());
        tag(ItemTagRegistry.TIN_DUST).add(BlockList.TIN_DUST.get());

        tag(ItemTagRegistry.ALUMINUM_ORE_ITEM).add(BlockList.ALUMINUM_ORE_ITEM.get());
        tag(ItemTagRegistry.LEAD_ORE_ITEM).add(BlockList.LEAD_ORE_ITEM.get());
        tag(ItemTagRegistry.OSMIUM_ORE_ITEM).add(BlockList.OSMIUM_ORE_ITEM.get());
        tag(ItemTagRegistry.NICKEL_ORE_ITEM).add(BlockList.NICKEL_ORE_ITEM.get());
        tag(ItemTagRegistry.PLATINUM_ORE_ITEM).add(BlockList.PLATINUM_ORE_ITEM.get());
        tag(ItemTagRegistry.SILVER_ORE_ITEM).add(BlockList.SILVER_ORE_ITEM.get());
        tag(ItemTagRegistry.TIN_ORE_ITEM).add(BlockList.TIN_ORE_ITEM.get());
        tag(ItemTagRegistry.URANIUM_ORE_ITEM).add(BlockList.URANIUM_ORE_ITEM.get());
        tag(ItemTagRegistry.ZINC_ORE_ITEM).add(BlockList.ZINC_ORE_ITEM.get());

        tag(ItemTagRegistry.RAW_ALUMINUM).add(BlockList.ALUMINUM_RAW.get());
        tag(ItemTagRegistry.RAW_LEAD).add(BlockList.LEAD_RAW.get());
        tag(ItemTagRegistry.RAW_NICKEL).add(BlockList.NICKEL_RAW.get());
        tag(ItemTagRegistry.RAW_OSMIUM).add(BlockList.OSMIUM_RAW.get());
        tag(ItemTagRegistry.RAW_PLATINUM).add(BlockList.PLATINUM_RAW.get());
        tag(ItemTagRegistry.RAW_SILVER).add(BlockList.SILVER_RAW.get());
        tag(ItemTagRegistry.RAW_TIN).add(BlockList.TIN_RAW.get());
        tag(ItemTagRegistry.RAW_URANIUM).add(BlockList.URANIUM_RAW.get());
        tag(ItemTagRegistry.RAW_ZINC).add(BlockList.ZINC_RAW.get());
    }
}

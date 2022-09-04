package net.allthemods.alltheores.datagen.server;

import net.allthemods.alltheores.blocks.BlockList;
import net.allthemods.alltheores.infos.ItemTagRegistry;
import net.allthemods.alltheores.infos.Reference;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ItemTags extends ItemTagsProvider {
    public ItemTags(DataGenerator generator, BlockTagsProvider blockTagsProvider, ExistingFileHelper existingFileHelper) {
        super(generator, blockTagsProvider, Reference.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags() {

        //Mek Compat
        tag(ItemTagRegistry.CLUMPS_MEK).add(BlockList.ALUM_CLUMP.get());
        tag(ItemTagRegistry.CLUMPS_MEK).add(BlockList.NICK_CLUMP.get());
        tag(ItemTagRegistry.CLUMPS_MEK).add(BlockList.PLAT_CLUMP.get());
        tag(ItemTagRegistry.CLUMPS_MEK).add(BlockList.SILV_CLUMP.get());
        tag(ItemTagRegistry.CLUMPS_MEK).add(BlockList.ZINC_CLUMP.get());

        tag(ItemTagRegistry.CLUMPS_MEK_ALU).add(BlockList.ALUM_CLUMP.get());
        tag(ItemTagRegistry.CLUMPS_MEK_NIC).add(BlockList.NICK_CLUMP.get());
        tag(ItemTagRegistry.CLUMPS_MEK_PLA).add(BlockList.PLAT_CLUMP.get());
        tag(ItemTagRegistry.CLUMPS_MEK_SIL).add(BlockList.SILV_CLUMP.get());
        tag(ItemTagRegistry.CLUMPS_MEK_ZIN).add(BlockList.ZINC_CLUMP.get());

        //


        tag(ItemTagRegistry.CRYSTAL_MEK).add(BlockList.ALUM_CRYSTAL.get());
        tag(ItemTagRegistry.CRYSTAL_MEK).add(BlockList.NICK_CRYSTAL.get());
        tag(ItemTagRegistry.CRYSTAL_MEK).add(BlockList.PLAT_CRYSTAL.get());
        tag(ItemTagRegistry.CRYSTAL_MEK).add(BlockList.SILV_CRYSTAL.get());
        tag(ItemTagRegistry.CRYSTAL_MEK).add(BlockList.ZINC_CRYSTAL.get());

        tag(ItemTagRegistry.CRYSTAL_MEK_ALU).add(BlockList.ALUM_CRYSTAL.get());
        tag(ItemTagRegistry.CRYSTAL_MEK_NIC).add(BlockList.NICK_CRYSTAL.get());
        tag(ItemTagRegistry.CRYSTAL_MEK_PLA).add(BlockList.PLAT_CRYSTAL.get());
        tag(ItemTagRegistry.CRYSTAL_MEK_SIL).add(BlockList.SILV_CRYSTAL.get());
        tag(ItemTagRegistry.CRYSTAL_MEK_ZIN).add(BlockList.ZINC_CRYSTAL.get());
        //

        tag(ItemTagRegistry.DIRTY_MEK).add(BlockList.ALUM_DIRTY.get());
        tag(ItemTagRegistry.DIRTY_MEK).add(BlockList.NICK_DIRTY.get());
        tag(ItemTagRegistry.DIRTY_MEK).add(BlockList.PLAT_DIRTY.get());
        tag(ItemTagRegistry.DIRTY_MEK).add(BlockList.SILV_DIRTY.get());
        tag(ItemTagRegistry.DIRTY_MEK).add(BlockList.ZINC_DIRTY.get());

        tag(ItemTagRegistry.DIRTY_MEK_ALU).add(BlockList.ALUM_DIRTY.get());
        tag(ItemTagRegistry.DIRTY_MEK_NIC).add(BlockList.NICK_DIRTY.get());
        tag(ItemTagRegistry.DIRTY_MEK_PLA).add(BlockList.PLAT_DIRTY.get());
        tag(ItemTagRegistry.DIRTY_MEK_SIL).add(BlockList.SILV_DIRTY.get());
        tag(ItemTagRegistry.DIRTY_MEK_ZIN).add(BlockList.ZINC_DIRTY.get());

        //

        tag(ItemTagRegistry.SHARD_MEK).add(BlockList.ALUM_SHARD.get());
        tag(ItemTagRegistry.SHARD_MEK).add(BlockList.NICK_SHARD.get());
        tag(ItemTagRegistry.SHARD_MEK).add(BlockList.PLAT_SHARD.get());
        tag(ItemTagRegistry.SHARD_MEK).add(BlockList.SILV_SHARD.get());
        tag(ItemTagRegistry.SHARD_MEK).add(BlockList.ZINC_SHARD.get());

        tag(ItemTagRegistry.SHARD_MEK_ALU).add(BlockList.ALUM_SHARD.get());
        tag(ItemTagRegistry.SHARD_MEK_NIC).add(BlockList.NICK_SHARD.get());
        tag(ItemTagRegistry.SHARD_MEK_PLA).add(BlockList.PLAT_SHARD.get());
        tag(ItemTagRegistry.SHARD_MEK_SIL).add(BlockList.SILV_SHARD.get());
        tag(ItemTagRegistry.SHARD_MEK_ZIN).add(BlockList.ZINC_SHARD.get());

        //
        tag(ItemTagRegistry.ALUMINUM_INGOT).add(BlockList.ALUMINUM_INGOT.get());
        tag(ItemTagRegistry.IRIDIUM_INGOT).add(BlockList.IRIDIUM_INGOT.get());
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
        tag(ItemTagRegistry.BRASS_INGOT).add(BlockList.BRASS_INGOT.get());

        tag(ItemTagRegistry.RUBY).add(BlockList.RUBY.get());
        tag(ItemTagRegistry.SAPPHIRE).add(BlockList.SAPPHIRE.get());
        tag(ItemTagRegistry.PERIDOT).add(BlockList.PERIDOT.get());

        tag(ItemTagRegistry.INGOTS).add(BlockList.ALUMINUM_INGOT.get());
        tag(ItemTagRegistry.INGOTS).add(BlockList.IRIDIUM_INGOT.get());
        tag(ItemTagRegistry.INGOTS).add(BlockList.LEAD_INGOT.get());
        tag(ItemTagRegistry.INGOTS).add(BlockList.OSMIUM_INGOT.get());
        tag(ItemTagRegistry.INGOTS).add(BlockList.NICKEL_INGOT.get());
        tag(ItemTagRegistry.INGOTS).add(BlockList.PLATINUM_INGOT.get());
        tag(ItemTagRegistry.INGOTS).add(BlockList.SILVER_INGOT.get());
        tag(ItemTagRegistry.INGOTS).add(BlockList.TIN_INGOT.get());
        tag(ItemTagRegistry.INGOTS).add(BlockList.URANIUM_INGOT.get());
        tag(ItemTagRegistry.INGOTS).add(BlockList.ZINC_INGOT.get());
        tag(ItemTagRegistry.INGOTS).add(BlockList.BRONZE_INGOT.get());
        tag(ItemTagRegistry.INGOTS).add(BlockList.CONSTANTAN_INGOT.get());
        tag(ItemTagRegistry.INGOTS).add(BlockList.ELECTRUM_INGOT.get());
        tag(ItemTagRegistry.INGOTS).add(BlockList.ENDERIUM_INGOT.get());
        tag(ItemTagRegistry.INGOTS).add(BlockList.INVAR_INGOT.get());
        tag(ItemTagRegistry.INGOTS).add(BlockList.LUMIUM_INGOT.get());
        tag(ItemTagRegistry.INGOTS).add(BlockList.SIGNALUM_INGOT.get());
        tag(ItemTagRegistry.INGOTS).add(BlockList.STEEL_INGOT.get());
        tag(ItemTagRegistry.INGOTS).add(BlockList.BRASS_INGOT.get());
        tag(ItemTagRegistry.GEMS).add(BlockList.RUBY.get());
        tag(ItemTagRegistry.GEMS).add(BlockList.SAPPHIRE.get());
        tag(ItemTagRegistry.GEMS).add(BlockList.PERIDOT.get());


        tag(ItemTagRegistry.ALUMINUM_NUGGET).add(BlockList.ALUMINUM_NUGGET.get());
        tag(ItemTagRegistry.COPPER_NUGGET).add(BlockList.COPPER_NUGGET.get());
        tag(ItemTagRegistry.IRIDIUM_NUGGET).add(BlockList.IRIDIUM_NUGGET.get());
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
        tag(ItemTagRegistry.BRASS_NUGGET).add(BlockList.BRASS_NUGGET.get());

        tag(ItemTagRegistry.NUGGETS).add(BlockList.ALUMINUM_NUGGET.get());
        tag(ItemTagRegistry.NUGGETS).add(BlockList.COPPER_NUGGET.get());
        tag(ItemTagRegistry.NUGGETS).add(BlockList.IRIDIUM_NUGGET.get());
        tag(ItemTagRegistry.NUGGETS).add(BlockList.LEAD_NUGGET.get());
        tag(ItemTagRegistry.NUGGETS).add(BlockList.OSMIUM_NUGGET.get());
        tag(ItemTagRegistry.NUGGETS).add(BlockList.NICKEL_NUGGET.get());
        tag(ItemTagRegistry.NUGGETS).add(BlockList.PLATINUM_NUGGET.get());
        tag(ItemTagRegistry.NUGGETS).add(BlockList.SILVER_NUGGET.get());
        tag(ItemTagRegistry.NUGGETS).add(BlockList.TIN_NUGGET.get());
        tag(ItemTagRegistry.NUGGETS).add(BlockList.URANIUM_NUGGET.get());
        tag(ItemTagRegistry.NUGGETS).add(BlockList.ZINC_NUGGET.get());
        tag(ItemTagRegistry.NUGGETS).add(BlockList.BRONZE_NUGGET.get());
        tag(ItemTagRegistry.NUGGETS).add(BlockList.CONSTANTAN_NUGGET.get());
        tag(ItemTagRegistry.NUGGETS).add(BlockList.ELECTRUM_NUGGET.get());
        tag(ItemTagRegistry.NUGGETS).add(BlockList.ENDERIUM_NUGGET.get());
        tag(ItemTagRegistry.NUGGETS).add(BlockList.INVAR_NUGGET.get());
        tag(ItemTagRegistry.NUGGETS).add(BlockList.LUMIUM_NUGGET.get());
        tag(ItemTagRegistry.NUGGETS).add(BlockList.SIGNALUM_NUGGET.get());
        tag(ItemTagRegistry.NUGGETS).add(BlockList.STEEL_NUGGET.get());
        tag(ItemTagRegistry.NUGGETS).add(BlockList.BRASS_NUGGET.get());

        tag(ItemTagRegistry.RAW_ALUMINUM_BLOCK_ITEM).add(BlockList.RAW_ALUMINUM_BLOCK_ITEM.get());
        tag(ItemTagRegistry.RAW_IRIDIUM_BLOCK_ITEM).add(BlockList.RAW_IRIDIUM_BLOCK_ITEM.get());
        tag(ItemTagRegistry.RAW_LEAD_BLOCK_ITEM).add(BlockList.RAW_LEAD_BLOCK_ITEM.get());
        tag(ItemTagRegistry.RAW_OSMIUM_BLOCK_ITEM).add(BlockList.RAW_OSMIUM_BLOCK_ITEM.get());
        tag(ItemTagRegistry.RAW_NICKEL_BLOCK_ITEM).add(BlockList.RAW_NICKEL_BLOCK_ITEM.get());
        tag(ItemTagRegistry.RAW_PLATINUM_BLOCK_ITEM).add(BlockList.RAW_PLATINUM_BLOCK_ITEM.get());
        tag(ItemTagRegistry.RAW_SILVER_BLOCK_ITEM).add(BlockList.RAW_SILVER_BLOCK_ITEM.get());
        tag(ItemTagRegistry.RAW_TIN_BLOCK_ITEM).add(BlockList.RAW_TIN_BLOCK_ITEM.get());
        tag(ItemTagRegistry.RAW_URANIUM_BLOCK_ITEM).add(BlockList.RAW_URANIUM_BLOCK_ITEM.get());
        tag(ItemTagRegistry.RAW_ZINC_BLOCK_ITEM).add(BlockList.RAW_ZINC_BLOCK_ITEM.get());

        tag(ItemTagRegistry.STORAGE_BLOCKS).add(BlockList.RAW_ALUMINUM_BLOCK_ITEM.get());
        tag(ItemTagRegistry.STORAGE_BLOCKS).add(BlockList.RAW_IRIDIUM_BLOCK_ITEM.get());
        tag(ItemTagRegistry.STORAGE_BLOCKS).add(BlockList.RAW_LEAD_BLOCK_ITEM.get());
        tag(ItemTagRegistry.STORAGE_BLOCKS).add(BlockList.RAW_OSMIUM_BLOCK_ITEM.get());
        tag(ItemTagRegistry.STORAGE_BLOCKS).add(BlockList.RAW_NICKEL_BLOCK_ITEM.get());
        tag(ItemTagRegistry.STORAGE_BLOCKS).add(BlockList.RAW_PLATINUM_BLOCK_ITEM.get());
        tag(ItemTagRegistry.STORAGE_BLOCKS).add(BlockList.RAW_SILVER_BLOCK_ITEM.get());
        tag(ItemTagRegistry.STORAGE_BLOCKS).add(BlockList.RAW_TIN_BLOCK_ITEM.get());
        tag(ItemTagRegistry.STORAGE_BLOCKS).add(BlockList.RAW_URANIUM_BLOCK_ITEM.get());
        tag(ItemTagRegistry.STORAGE_BLOCKS).add(BlockList.RAW_ZINC_BLOCK_ITEM.get());

        tag(ItemTagRegistry.COPPER_BLOCK_ITEM).add(Blocks.COPPER_BLOCK.asItem());

        tag(ItemTagRegistry.ALUMINUM_BLOCK_ITEM).add(BlockList.ALUMINUM_BLOCK_ITEM.get());
        tag(ItemTagRegistry.IRIDIUM_BLOCK_ITEM).add(BlockList.IRIDIUM_BLOCK_ITEM.get());
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
        tag(ItemTagRegistry.BRASS_BLOCK_ITEM).add(BlockList.BRASS_BLOCK_ITEM.get());
        tag(ItemTagRegistry.RUBY_BLOCK_ITEM).add(BlockList.RUBY_BLOCK_ITEM.get());
        tag(ItemTagRegistry.SAPPHIRE_BLOCK_ITEM).add(BlockList.SAPPHIRE_BLOCK_ITEM.get());
        tag(ItemTagRegistry.PERIDOT_BLOCK_ITEM).add(BlockList.PERIDOT_BLOCK_ITEM.get());

        tag(ItemTagRegistry.STORAGE_BLOCKS).add(BlockList.ALUMINUM_BLOCK_ITEM.get());
        tag(ItemTagRegistry.STORAGE_BLOCKS).add(BlockList.IRIDIUM_BLOCK_ITEM.get());
        tag(ItemTagRegistry.STORAGE_BLOCKS).add(BlockList.LEAD_BLOCK_ITEM.get());
        tag(ItemTagRegistry.STORAGE_BLOCKS).add(BlockList.OSMIUM_BLOCK_ITEM.get());
        tag(ItemTagRegistry.STORAGE_BLOCKS).add(BlockList.NICKEL_BLOCK_ITEM.get());
        tag(ItemTagRegistry.STORAGE_BLOCKS).add(BlockList.PLATINUM_BLOCK_ITEM.get());
        tag(ItemTagRegistry.STORAGE_BLOCKS).add(BlockList.SILVER_BLOCK_ITEM.get());
        tag(ItemTagRegistry.STORAGE_BLOCKS).add(BlockList.TIN_BLOCK_ITEM.get());
        tag(ItemTagRegistry.STORAGE_BLOCKS).add(BlockList.URANIUM_BLOCK_ITEM.get());
        tag(ItemTagRegistry.STORAGE_BLOCKS).add(BlockList.ZINC_BLOCK_ITEM.get());
        tag(ItemTagRegistry.STORAGE_BLOCKS).add(BlockList.BRONZE_BLOCK_ITEM.get());
        tag(ItemTagRegistry.STORAGE_BLOCKS).add(BlockList.CONSTANTAN_BLOCK_ITEM.get());
        tag(ItemTagRegistry.STORAGE_BLOCKS).add(BlockList.ELECTRUM_BLOCK_ITEM.get());
        tag(ItemTagRegistry.STORAGE_BLOCKS).add(BlockList.ENDERIUM_BLOCK_ITEM.get());
        tag(ItemTagRegistry.STORAGE_BLOCKS).add(BlockList.INVAR_BLOCK_ITEM.get());
        tag(ItemTagRegistry.STORAGE_BLOCKS).add(BlockList.LUMIUM_BLOCK_ITEM.get());
        tag(ItemTagRegistry.STORAGE_BLOCKS).add(BlockList.SIGNALUM_BLOCK_ITEM.get());
        tag(ItemTagRegistry.STORAGE_BLOCKS).add(BlockList.STEEL_BLOCK_ITEM.get());
        tag(ItemTagRegistry.STORAGE_BLOCKS).add(BlockList.BRASS_BLOCK_ITEM.get());
        tag(ItemTagRegistry.STORAGE_BLOCKS).add(BlockList.RUBY_BLOCK_ITEM.get());
        tag(ItemTagRegistry.STORAGE_BLOCKS).add(BlockList.SAPPHIRE_BLOCK_ITEM.get());
        tag(ItemTagRegistry.STORAGE_BLOCKS).add(BlockList.PERIDOT_BLOCK_ITEM.get());

        tag(ItemTagRegistry.PLATINUM_DUST).add(BlockList.PLATINUM_DUST.get());
        tag(ItemTagRegistry.IRIDIUM_DUST).add(BlockList.IRIDIUM_DUST.get());
        tag(ItemTagRegistry.COPPER_DUST).add(BlockList.COPPER_DUST.get());
        tag(ItemTagRegistry.ALUMINUM_DUST).add(BlockList.ALUMINUM_DUST.get());
        tag(ItemTagRegistry.URANIUM_DUST).add(BlockList.URANIUM_DUST.get());
        tag(ItemTagRegistry.NICKEL_DUST).add(BlockList.NICKEL_DUST.get());
        tag(ItemTagRegistry.SILVER_DUST).add(BlockList.SILVER_DUST.get());
        tag(ItemTagRegistry.OSMIUM_DUST).add(BlockList.OSMIUM_DUST.get());
        tag(ItemTagRegistry.ZINC_DUST).add(BlockList.ZINC_DUST.get());
        tag(ItemTagRegistry.LEAD_DUST).add(BlockList.LEAD_DUST.get());
        tag(ItemTagRegistry.TIN_DUST).add(BlockList.TIN_DUST.get());
        tag(ItemTagRegistry.BRONZE_DUST).add(BlockList.BRONZE_DUST.get());
        tag(ItemTagRegistry.CONSTANTAN_DUST).add(BlockList.CONSTANTAN_DUST.get());
        tag(ItemTagRegistry.ELECTRUM_DUST).add(BlockList.ELECTRUM_DUST.get());
        tag(ItemTagRegistry.ENDERIUM_DUST).add(BlockList.ENDERIUM_DUST.get());
        tag(ItemTagRegistry.INVAR_DUST).add(BlockList.INVAR_DUST.get());
        tag(ItemTagRegistry.LUMIUM_DUST).add(BlockList.LUMIUM_DUST.get());
        tag(ItemTagRegistry.SIGNALUM_DUST).add(BlockList.SIGNALUM_DUST.get());
        tag(ItemTagRegistry.STEEL_DUST).add(BlockList.STEEL_DUST.get());
        tag(ItemTagRegistry.IRON_DUST).add(BlockList.IRON_DUST.get());
        tag(ItemTagRegistry.GOLD_DUST).add(BlockList.GOLD_DUST.get());
        tag(ItemTagRegistry.DIAMOND_DUST).add(BlockList.DIAMOND_DUST.get());
        tag(ItemTagRegistry.BRASS_DUST).add(BlockList.BRASS_DUST.get());
        tag(ItemTagRegistry.RUBY_DUST).add(BlockList.RUBY_DUST.get());
        tag(ItemTagRegistry.SAPPHIRE_DUST).add(BlockList.SAPPHIRE_DUST.get());
        tag(ItemTagRegistry.PERIDOT_DUST).add(BlockList.PERIDOT_DUST.get());

        tag(ItemTagRegistry.DUSTS).add(BlockList.PLATINUM_DUST.get());
        tag(ItemTagRegistry.DUSTS).add(BlockList.IRIDIUM_DUST.get());
        tag(ItemTagRegistry.DUSTS).add(BlockList.COPPER_DUST.get());
        tag(ItemTagRegistry.DUSTS).add(BlockList.ALUMINUM_DUST.get());
        tag(ItemTagRegistry.DUSTS).add(BlockList.URANIUM_DUST.get());
        tag(ItemTagRegistry.DUSTS).add(BlockList.NICKEL_DUST.get());
        tag(ItemTagRegistry.DUSTS).add(BlockList.SILVER_DUST.get());
        tag(ItemTagRegistry.DUSTS).add(BlockList.OSMIUM_DUST.get());
        tag(ItemTagRegistry.DUSTS).add(BlockList.ZINC_DUST.get());
        tag(ItemTagRegistry.DUSTS).add(BlockList.LEAD_DUST.get());
        tag(ItemTagRegistry.DUSTS).add(BlockList.TIN_DUST.get());
        tag(ItemTagRegistry.DUSTS).add(BlockList.BRONZE_DUST.get());
        tag(ItemTagRegistry.DUSTS).add(BlockList.CONSTANTAN_DUST.get());
        tag(ItemTagRegistry.DUSTS).add(BlockList.ELECTRUM_DUST.get());
        tag(ItemTagRegistry.DUSTS).add(BlockList.ENDERIUM_DUST.get());
        tag(ItemTagRegistry.DUSTS).add(BlockList.INVAR_DUST.get());
        tag(ItemTagRegistry.DUSTS).add(BlockList.LUMIUM_DUST.get());
        tag(ItemTagRegistry.DUSTS).add(BlockList.SIGNALUM_DUST.get());
        tag(ItemTagRegistry.DUSTS).add(BlockList.STEEL_DUST.get());
        tag(ItemTagRegistry.DUSTS).add(BlockList.IRON_DUST.get());
        tag(ItemTagRegistry.DUSTS).add(BlockList.GOLD_DUST.get());
        tag(ItemTagRegistry.DUSTS).add(BlockList.DIAMOND_DUST.get());
        tag(ItemTagRegistry.DUSTS).add(BlockList.BRASS_DUST.get());
        tag(ItemTagRegistry.DUSTS).add(BlockList.RUBY_DUST.get());
        tag(ItemTagRegistry.DUSTS).add(BlockList.SAPPHIRE_DUST.get());
        tag(ItemTagRegistry.DUSTS).add(BlockList.PERIDOT_DUST.get());

        tag(ItemTagRegistry.PLATINUM_ROD).add(BlockList.PLATINUM_ROD.get());
        tag(ItemTagRegistry.IRIDIUM_ROD).add(BlockList.IRIDIUM_ROD.get());
        tag(ItemTagRegistry.COPPER_ROD).add(BlockList.COPPER_ROD.get());
        tag(ItemTagRegistry.ALUMINUM_ROD).add(BlockList.ALUMINUM_ROD.get());
        tag(ItemTagRegistry.URANIUM_ROD).add(BlockList.URANIUM_ROD.get());
        tag(ItemTagRegistry.NICKEL_ROD).add(BlockList.NICKEL_ROD.get());
        tag(ItemTagRegistry.SILVER_ROD).add(BlockList.SILVER_ROD.get());
        tag(ItemTagRegistry.OSMIUM_ROD).add(BlockList.OSMIUM_ROD.get());
        tag(ItemTagRegistry.ZINC_ROD).add(BlockList.ZINC_ROD.get());
        tag(ItemTagRegistry.LEAD_ROD).add(BlockList.LEAD_ROD.get());
        tag(ItemTagRegistry.TIN_ROD).add(BlockList.TIN_ROD.get());
        tag(ItemTagRegistry.BRONZE_ROD).add(BlockList.BRONZE_ROD.get());
        tag(ItemTagRegistry.CONSTANTAN_ROD).add(BlockList.CONSTANTAN_ROD.get());
        tag(ItemTagRegistry.ELECTRUM_ROD).add(BlockList.ELECTRUM_ROD.get());
        tag(ItemTagRegistry.ENDERIUM_ROD).add(BlockList.ENDERIUM_ROD.get());
        tag(ItemTagRegistry.INVAR_ROD).add(BlockList.INVAR_ROD.get());
        tag(ItemTagRegistry.LUMIUM_ROD).add(BlockList.LUMIUM_ROD.get());
        tag(ItemTagRegistry.SIGNALUM_ROD).add(BlockList.SIGNALUM_ROD.get());
        tag(ItemTagRegistry.STEEL_ROD).add(BlockList.STEEL_ROD.get());
        tag(ItemTagRegistry.IRON_ROD).add(BlockList.IRON_ROD.get());
        tag(ItemTagRegistry.GOLD_ROD).add(BlockList.GOLD_ROD.get());
        tag(ItemTagRegistry.DIAMOND_ROD).add(BlockList.DIAMOND_ROD.get());
        tag(ItemTagRegistry.BRASS_ROD).add(BlockList.BRASS_ROD.get());

        tag(ItemTagRegistry.RODS).add(BlockList.PLATINUM_ROD.get());
        tag(ItemTagRegistry.RODS).add(BlockList.IRIDIUM_ROD.get());
        tag(ItemTagRegistry.RODS).add(BlockList.COPPER_ROD.get());
        tag(ItemTagRegistry.RODS).add(BlockList.ALUMINUM_ROD.get());
        tag(ItemTagRegistry.RODS).add(BlockList.URANIUM_ROD.get());
        tag(ItemTagRegistry.RODS).add(BlockList.NICKEL_ROD.get());
        tag(ItemTagRegistry.RODS).add(BlockList.SILVER_ROD.get());
        tag(ItemTagRegistry.RODS).add(BlockList.OSMIUM_ROD.get());
        tag(ItemTagRegistry.RODS).add(BlockList.ZINC_ROD.get());
        tag(ItemTagRegistry.RODS).add(BlockList.LEAD_ROD.get());
        tag(ItemTagRegistry.RODS).add(BlockList.TIN_ROD.get());
        tag(ItemTagRegistry.RODS).add(BlockList.BRONZE_ROD.get());
        tag(ItemTagRegistry.RODS).add(BlockList.CONSTANTAN_ROD.get());
        tag(ItemTagRegistry.RODS).add(BlockList.ELECTRUM_ROD.get());
        tag(ItemTagRegistry.RODS).add(BlockList.ENDERIUM_ROD.get());
        tag(ItemTagRegistry.RODS).add(BlockList.INVAR_ROD.get());
        tag(ItemTagRegistry.RODS).add(BlockList.LUMIUM_ROD.get());
        tag(ItemTagRegistry.RODS).add(BlockList.SIGNALUM_ROD.get());
        tag(ItemTagRegistry.RODS).add(BlockList.STEEL_ROD.get());
        tag(ItemTagRegistry.RODS).add(BlockList.IRON_ROD.get());
        tag(ItemTagRegistry.RODS).add(BlockList.GOLD_ROD.get());
        tag(ItemTagRegistry.RODS).add(BlockList.DIAMOND_ROD.get());
        tag(ItemTagRegistry.RODS).add(BlockList.BRASS_ROD.get());

        tag(ItemTagRegistry.RODS_METAL).add(BlockList.PLATINUM_ROD.get());
        tag(ItemTagRegistry.RODS_METAL).add(BlockList.IRIDIUM_ROD.get());
        tag(ItemTagRegistry.RODS_METAL).add(BlockList.COPPER_ROD.get());
        tag(ItemTagRegistry.RODS_METAL).add(BlockList.ALUMINUM_ROD.get());
        tag(ItemTagRegistry.RODS_METAL).add(BlockList.URANIUM_ROD.get());
        tag(ItemTagRegistry.RODS_METAL).add(BlockList.NICKEL_ROD.get());
        tag(ItemTagRegistry.RODS_METAL).add(BlockList.SILVER_ROD.get());
        tag(ItemTagRegistry.RODS_METAL).add(BlockList.OSMIUM_ROD.get());
        tag(ItemTagRegistry.RODS_METAL).add(BlockList.ZINC_ROD.get());
        tag(ItemTagRegistry.RODS_METAL).add(BlockList.LEAD_ROD.get());
        tag(ItemTagRegistry.RODS_METAL).add(BlockList.TIN_ROD.get());
        tag(ItemTagRegistry.RODS_METAL).add(BlockList.BRONZE_ROD.get());
        tag(ItemTagRegistry.RODS_METAL).add(BlockList.CONSTANTAN_ROD.get());
        tag(ItemTagRegistry.RODS_METAL).add(BlockList.ELECTRUM_ROD.get());
        tag(ItemTagRegistry.RODS_METAL).add(BlockList.ENDERIUM_ROD.get());
        tag(ItemTagRegistry.RODS_METAL).add(BlockList.INVAR_ROD.get());
        tag(ItemTagRegistry.RODS_METAL).add(BlockList.LUMIUM_ROD.get());
        tag(ItemTagRegistry.RODS_METAL).add(BlockList.SIGNALUM_ROD.get());
        tag(ItemTagRegistry.RODS_METAL).add(BlockList.STEEL_ROD.get());
        tag(ItemTagRegistry.RODS_METAL).add(BlockList.IRON_ROD.get());
        tag(ItemTagRegistry.RODS_METAL).add(BlockList.GOLD_ROD.get());
        tag(ItemTagRegistry.RODS_METAL).add(BlockList.BRASS_ROD.get());

        tag(ItemTagRegistry.PLATINUM_GEAR).add(BlockList.PLATINUM_GEAR.get());
        tag(ItemTagRegistry.IRIDIUM_GEAR).add(BlockList.IRIDIUM_GEAR.get());
        tag(ItemTagRegistry.COPPER_GEAR).add(BlockList.COPPER_GEAR.get());
        tag(ItemTagRegistry.ALUMINUM_GEAR).add(BlockList.ALUMINUM_GEAR.get());
        tag(ItemTagRegistry.URANIUM_GEAR).add(BlockList.URANIUM_GEAR.get());
        tag(ItemTagRegistry.NICKEL_GEAR).add(BlockList.NICKEL_GEAR.get());
        tag(ItemTagRegistry.SILVER_GEAR).add(BlockList.SILVER_GEAR.get());
        tag(ItemTagRegistry.OSMIUM_GEAR).add(BlockList.OSMIUM_GEAR.get());
        tag(ItemTagRegistry.ZINC_GEAR).add(BlockList.ZINC_GEAR.get());
        tag(ItemTagRegistry.LEAD_GEAR).add(BlockList.LEAD_GEAR.get());
        tag(ItemTagRegistry.TIN_GEAR).add(BlockList.TIN_GEAR.get());
        tag(ItemTagRegistry.BRONZE_GEAR).add(BlockList.BRONZE_GEAR.get());
        tag(ItemTagRegistry.CONSTANTAN_GEAR).add(BlockList.CONSTANTAN_GEAR.get());
        tag(ItemTagRegistry.ELECTRUM_GEAR).add(BlockList.ELECTRUM_GEAR.get());
        tag(ItemTagRegistry.ENDERIUM_GEAR).add(BlockList.ENDERIUM_GEAR.get());
        tag(ItemTagRegistry.INVAR_GEAR).add(BlockList.INVAR_GEAR.get());
        tag(ItemTagRegistry.LUMIUM_GEAR).add(BlockList.LUMIUM_GEAR.get());
        tag(ItemTagRegistry.SIGNALUM_GEAR).add(BlockList.SIGNALUM_GEAR.get());
        tag(ItemTagRegistry.STEEL_GEAR).add(BlockList.STEEL_GEAR.get());
        tag(ItemTagRegistry.IRON_GEAR).add(BlockList.IRON_GEAR.get());
        tag(ItemTagRegistry.GOLD_GEAR).add(BlockList.GOLD_GEAR.get());
        tag(ItemTagRegistry.DIAMOND_GEAR).add(BlockList.DIAMOND_GEAR.get());
        tag(ItemTagRegistry.BRASS_GEAR).add(BlockList.BRASS_GEAR.get());

        tag(ItemTagRegistry.GEARS).add(BlockList.PLATINUM_GEAR.get());
        tag(ItemTagRegistry.GEARS).add(BlockList.IRIDIUM_GEAR.get());
        tag(ItemTagRegistry.GEARS).add(BlockList.COPPER_GEAR.get());
        tag(ItemTagRegistry.GEARS).add(BlockList.ALUMINUM_GEAR.get());
        tag(ItemTagRegistry.GEARS).add(BlockList.URANIUM_GEAR.get());
        tag(ItemTagRegistry.GEARS).add(BlockList.NICKEL_GEAR.get());
        tag(ItemTagRegistry.GEARS).add(BlockList.SILVER_GEAR.get());
        tag(ItemTagRegistry.GEARS).add(BlockList.OSMIUM_GEAR.get());
        tag(ItemTagRegistry.GEARS).add(BlockList.ZINC_GEAR.get());
        tag(ItemTagRegistry.GEARS).add(BlockList.LEAD_GEAR.get());
        tag(ItemTagRegistry.GEARS).add(BlockList.TIN_GEAR.get());
        tag(ItemTagRegistry.GEARS).add(BlockList.BRONZE_GEAR.get());
        tag(ItemTagRegistry.GEARS).add(BlockList.CONSTANTAN_GEAR.get());
        tag(ItemTagRegistry.GEARS).add(BlockList.ELECTRUM_GEAR.get());
        tag(ItemTagRegistry.GEARS).add(BlockList.ENDERIUM_GEAR.get());
        tag(ItemTagRegistry.GEARS).add(BlockList.INVAR_GEAR.get());
        tag(ItemTagRegistry.GEARS).add(BlockList.LUMIUM_GEAR.get());
        tag(ItemTagRegistry.GEARS).add(BlockList.SIGNALUM_GEAR.get());
        tag(ItemTagRegistry.GEARS).add(BlockList.STEEL_GEAR.get());
        tag(ItemTagRegistry.GEARS).add(BlockList.IRON_GEAR.get());
        tag(ItemTagRegistry.GEARS).add(BlockList.GOLD_GEAR.get());
        tag(ItemTagRegistry.GEARS).add(BlockList.DIAMOND_GEAR.get());
        tag(ItemTagRegistry.GEARS).add(BlockList.BRASS_GEAR.get());

        tag(ItemTagRegistry.PLATINUM_PLATE).add(BlockList.PLATINUM_PLATE.get());
        tag(ItemTagRegistry.IRIDIUM_PLATE).add(BlockList.IRIDIUM_PLATE.get());
        tag(ItemTagRegistry.COPPER_PLATE).add(BlockList.COPPER_PLATE.get());
        tag(ItemTagRegistry.ALUMINUM_PLATE).add(BlockList.ALUMINUM_PLATE.get());
        tag(ItemTagRegistry.URANIUM_PLATE).add(BlockList.URANIUM_PLATE.get());
        tag(ItemTagRegistry.NICKEL_PLATE).add(BlockList.NICKEL_PLATE.get());
        tag(ItemTagRegistry.SILVER_PLATE).add(BlockList.SILVER_PLATE.get());
        tag(ItemTagRegistry.OSMIUM_PLATE).add(BlockList.OSMIUM_PLATE.get());
        tag(ItemTagRegistry.ZINC_PLATE).add(BlockList.ZINC_PLATE.get());
        tag(ItemTagRegistry.LEAD_PLATE).add(BlockList.LEAD_PLATE.get());
        tag(ItemTagRegistry.TIN_PLATE).add(BlockList.TIN_PLATE.get());
        tag(ItemTagRegistry.BRONZE_PLATE).add(BlockList.BRONZE_PLATE.get());
        tag(ItemTagRegistry.CONSTANTAN_PLATE).add(BlockList.CONSTANTAN_PLATE.get());
        tag(ItemTagRegistry.ELECTRUM_PLATE).add(BlockList.ELECTRUM_PLATE.get());
        tag(ItemTagRegistry.ENDERIUM_PLATE).add(BlockList.ENDERIUM_PLATE.get());
        tag(ItemTagRegistry.INVAR_PLATE).add(BlockList.INVAR_PLATE.get());
        tag(ItemTagRegistry.LUMIUM_PLATE).add(BlockList.LUMIUM_PLATE.get());
        tag(ItemTagRegistry.SIGNALUM_PLATE).add(BlockList.SIGNALUM_PLATE.get());
        tag(ItemTagRegistry.STEEL_PLATE).add(BlockList.STEEL_PLATE.get());
        tag(ItemTagRegistry.IRON_PLATE).add(BlockList.IRON_PLATE.get());
        tag(ItemTagRegistry.GOLD_PLATE).add(BlockList.GOLD_PLATE.get());
        tag(ItemTagRegistry.DIAMOND_PLATE).add(BlockList.DIAMOND_PLATE.get());
        tag(ItemTagRegistry.BRASS_PLATE).add(BlockList.BRASS_PLATE.get());

        tag(ItemTagRegistry.PLATES).add(BlockList.PLATINUM_PLATE.get());
        tag(ItemTagRegistry.PLATES).add(BlockList.IRIDIUM_PLATE.get());
        tag(ItemTagRegistry.PLATES).add(BlockList.COPPER_PLATE.get());
        tag(ItemTagRegistry.PLATES).add(BlockList.ALUMINUM_PLATE.get());
        tag(ItemTagRegistry.PLATES).add(BlockList.URANIUM_PLATE.get());
        tag(ItemTagRegistry.PLATES).add(BlockList.NICKEL_PLATE.get());
        tag(ItemTagRegistry.PLATES).add(BlockList.SILVER_PLATE.get());
        tag(ItemTagRegistry.PLATES).add(BlockList.OSMIUM_PLATE.get());
        tag(ItemTagRegistry.PLATES).add(BlockList.ZINC_PLATE.get());
        tag(ItemTagRegistry.PLATES).add(BlockList.LEAD_PLATE.get());
        tag(ItemTagRegistry.PLATES).add(BlockList.TIN_PLATE.get());
        tag(ItemTagRegistry.PLATES).add(BlockList.BRONZE_PLATE.get());
        tag(ItemTagRegistry.PLATES).add(BlockList.CONSTANTAN_PLATE.get());
        tag(ItemTagRegistry.PLATES).add(BlockList.ELECTRUM_PLATE.get());
        tag(ItemTagRegistry.PLATES).add(BlockList.ENDERIUM_PLATE.get());
        tag(ItemTagRegistry.PLATES).add(BlockList.INVAR_PLATE.get());
        tag(ItemTagRegistry.PLATES).add(BlockList.LUMIUM_PLATE.get());
        tag(ItemTagRegistry.PLATES).add(BlockList.SIGNALUM_PLATE.get());
        tag(ItemTagRegistry.PLATES).add(BlockList.STEEL_PLATE.get());
        tag(ItemTagRegistry.PLATES).add(BlockList.IRON_PLATE.get());
        tag(ItemTagRegistry.PLATES).add(BlockList.GOLD_PLATE.get());
        tag(ItemTagRegistry.PLATES).add(BlockList.DIAMOND_PLATE.get());
        tag(ItemTagRegistry.PLATES).add(BlockList.BRASS_PLATE.get());

        tag(ItemTagRegistry.ALUMINUM_ORE_ITEM).add(BlockList.ALUMINUM_ORE_ITEM.get());
        tag(ItemTagRegistry.IRIDIUM_ORE_ITEM).add(BlockList.IRIDIUM_ORE_ITEM.get());
        tag(ItemTagRegistry.LEAD_ORE_ITEM).add(BlockList.LEAD_ORE_ITEM.get());
        tag(ItemTagRegistry.OSMIUM_ORE_ITEM).add(BlockList.OSMIUM_ORE_ITEM.get());
        tag(ItemTagRegistry.NICKEL_ORE_ITEM).add(BlockList.NICKEL_ORE_ITEM.get());
        tag(ItemTagRegistry.PLATINUM_ORE_ITEM).add(BlockList.PLATINUM_ORE_ITEM.get());
        tag(ItemTagRegistry.SILVER_ORE_ITEM).add(BlockList.SILVER_ORE_ITEM.get());
        tag(ItemTagRegistry.TIN_ORE_ITEM).add(BlockList.TIN_ORE_ITEM.get());
        tag(ItemTagRegistry.URANIUM_ORE_ITEM).add(BlockList.URANIUM_ORE_ITEM.get());
        tag(ItemTagRegistry.ZINC_ORE_ITEM).add(BlockList.ZINC_ORE_ITEM.get());
        tag(ItemTagRegistry.RUBY_ORE_ITEM).add(BlockList.RUBY_ORE_ITEM.get());
        tag(ItemTagRegistry.SAPPHIRE_ORE_ITEM).add(BlockList.SAPPHIRE_ORE_ITEM.get());
        tag(ItemTagRegistry.PERIDOT_ORE_ITEM).add(BlockList.PERIDOT_ORE_ITEM.get());

        tag(ItemTagRegistry.ALUMINUM_ORE_ITEM).add(BlockList.ALUMINUM_SLATE_ORE_ITEM.get());
        tag(ItemTagRegistry.IRIDIUM_ORE_ITEM).add(BlockList.IRIDIUM_SLATE_ORE_ITEM.get());
        tag(ItemTagRegistry.LEAD_ORE_ITEM).add(BlockList.LEAD_SLATE_ORE_ITEM.get());
        tag(ItemTagRegistry.OSMIUM_ORE_ITEM).add(BlockList.OSMIUM_SLATE_ORE_ITEM.get());
        tag(ItemTagRegistry.NICKEL_ORE_ITEM).add(BlockList.NICKEL_SLATE_ORE_ITEM.get());
        tag(ItemTagRegistry.PLATINUM_ORE_ITEM).add(BlockList.PLATINUM_SLATE_ORE_ITEM.get());
        tag(ItemTagRegistry.SILVER_ORE_ITEM).add(BlockList.SILVER_SLATE_ORE_ITEM.get());
        tag(ItemTagRegistry.TIN_ORE_ITEM).add(BlockList.TIN_SLATE_ORE_ITEM.get());
        tag(ItemTagRegistry.URANIUM_ORE_ITEM).add(BlockList.URANIUM_SLATE_ORE_ITEM.get());
        tag(ItemTagRegistry.ZINC_ORE_ITEM).add(BlockList.ZINC_SLATE_ORE_ITEM.get());
        tag(ItemTagRegistry.RUBY_ORE_ITEM).add(BlockList.RUBY_SLATE_ORE_ITEM.get());
        tag(ItemTagRegistry.SAPPHIRE_ORE_ITEM).add(BlockList.SAPPHIRE_SLATE_ORE_ITEM.get());
        tag(ItemTagRegistry.PERIDOT_ORE_ITEM).add(BlockList.PERIDOT_SLATE_ORE_ITEM.get());

        tag(ItemTagRegistry.ALUMINUM_ORE_ITEM).add(BlockList.ALUMINUM_NETHER_ORE_ITEM.get());
        tag(ItemTagRegistry.IRIDIUM_ORE_ITEM).add(BlockList.IRIDIUM_NETHER_ORE_ITEM.get());
        tag(ItemTagRegistry.LEAD_ORE_ITEM).add(BlockList.LEAD_NETHER_ORE_ITEM.get());
        tag(ItemTagRegistry.OSMIUM_ORE_ITEM).add(BlockList.OSMIUM_NETHER_ORE_ITEM.get());
        tag(ItemTagRegistry.NICKEL_ORE_ITEM).add(BlockList.NICKEL_NETHER_ORE_ITEM.get());
        tag(ItemTagRegistry.PLATINUM_ORE_ITEM).add(BlockList.PLATINUM_NETHER_ORE_ITEM.get());
        tag(ItemTagRegistry.SILVER_ORE_ITEM).add(BlockList.SILVER_NETHER_ORE_ITEM.get());
        tag(ItemTagRegistry.TIN_ORE_ITEM).add(BlockList.TIN_NETHER_ORE_ITEM.get());
        tag(ItemTagRegistry.URANIUM_ORE_ITEM).add(BlockList.URANIUM_NETHER_ORE_ITEM.get());
        tag(ItemTagRegistry.ZINC_ORE_ITEM).add(BlockList.ZINC_NETHER_ORE_ITEM.get());


        tag(ItemTagRegistry.ALUMINUM_ORE_ITEM).add(BlockList.ALUMINUM_END_ORE_ITEM.get());
        tag(ItemTagRegistry.IRIDIUM_ORE_ITEM).add(BlockList.IRIDIUM_END_ORE_ITEM.get());
        tag(ItemTagRegistry.LEAD_ORE_ITEM).add(BlockList.LEAD_END_ORE_ITEM.get());
        tag(ItemTagRegistry.OSMIUM_ORE_ITEM).add(BlockList.OSMIUM_END_ORE_ITEM.get());
        tag(ItemTagRegistry.NICKEL_ORE_ITEM).add(BlockList.NICKEL_END_ORE_ITEM.get());
        tag(ItemTagRegistry.PLATINUM_ORE_ITEM).add(BlockList.PLATINUM_END_ORE_ITEM.get());
        tag(ItemTagRegistry.SILVER_ORE_ITEM).add(BlockList.SILVER_END_ORE_ITEM.get());
        tag(ItemTagRegistry.TIN_ORE_ITEM).add(BlockList.TIN_END_ORE_ITEM.get());
        tag(ItemTagRegistry.URANIUM_ORE_ITEM).add(BlockList.URANIUM_END_ORE_ITEM.get());
        tag(ItemTagRegistry.ZINC_ORE_ITEM).add(BlockList.ZINC_END_ORE_ITEM.get());

        tag(ItemTagRegistry.ALUMINUM_ORE_ITEM).add(BlockList.OTHER_ALUMINUM_ORE_ITEM.get());
        tag(ItemTagRegistry.IRIDIUM_ORE_ITEM).add(BlockList.OTHER_IRIDIUM_ORE_ITEM.get());
        tag(ItemTagRegistry.LEAD_ORE_ITEM).add(BlockList.OTHER_LEAD_ORE_ITEM.get());
        tag(ItemTagRegistry.OSMIUM_ORE_ITEM).add(BlockList.OTHER_OSMIUM_ORE_ITEM.get());
        tag(ItemTagRegistry.NICKEL_ORE_ITEM).add(BlockList.OTHER_NICKEL_ORE_ITEM.get());
        tag(ItemTagRegistry.PLATINUM_ORE_ITEM).add(BlockList.OTHER_PLATINUM_ORE_ITEM.get());
        tag(ItemTagRegistry.SILVER_ORE_ITEM).add(BlockList.OTHER_SILVER_ORE_ITEM.get());
        tag(ItemTagRegistry.TIN_ORE_ITEM).add(BlockList.OTHER_TIN_ORE_ITEM.get());
        tag(ItemTagRegistry.URANIUM_ORE_ITEM).add(BlockList.OTHER_URANIUM_ORE_ITEM.get());
        tag(ItemTagRegistry.ZINC_ORE_ITEM).add(BlockList.OTHER_ZINC_ORE_ITEM.get());

        tag(ItemTagRegistry.COAL_ORE_ITEM).add(BlockList.OTHER_COAL_ORE_ITEM.get());
        tag(ItemTagRegistry.COPPER_ORE_ITEM).add(BlockList.OTHER_COPPER_ORE_ITEM.get());
        tag(ItemTagRegistry.DIAMOND_ORE_ITEM).add(BlockList.OTHER_DIAMOND_ORE_ITEM.get());
        tag(ItemTagRegistry.EMERALD_ORE_ITEM).add(BlockList.OTHER_EMERALD_ORE_ITEM.get());
        tag(ItemTagRegistry.GOLD_ORE_ITEM).add(BlockList.OTHER_GOLD_ORE_ITEM.get());
        tag(ItemTagRegistry.IRON_ORE_ITEM).add(BlockList.OTHER_IRON_ORE_ITEM.get());
        tag(ItemTagRegistry.LAPIS_ORE_ITEM).add(BlockList.OTHER_LAPIS_ORE_ITEM.get());
        tag(ItemTagRegistry.QUARTZ_ORE_ITEM).add(BlockList.OTHER_QUARTZ_ORE_ITEM.get());
        tag(ItemTagRegistry.REDSTONE_ORE_ITEM).add(BlockList.OTHER_REDSTONE_ORE_ITEM.get());

        tag(net.minecraft.tags.ItemTags.COAL_ORES).add(BlockList.OTHER_COAL_ORE_ITEM.get());
        tag(net.minecraft.tags.ItemTags.COPPER_ORES).add(BlockList.OTHER_COPPER_ORE_ITEM.get());
        tag(net.minecraft.tags.ItemTags.DIAMOND_ORES).add(BlockList.OTHER_DIAMOND_ORE_ITEM.get());
        tag(net.minecraft.tags.ItemTags.EMERALD_ORES).add(BlockList.OTHER_EMERALD_ORE_ITEM.get());
        tag(net.minecraft.tags.ItemTags.GOLD_ORES).add(BlockList.OTHER_GOLD_ORE_ITEM.get());
        tag(net.minecraft.tags.ItemTags.IRON_ORES).add(BlockList.OTHER_IRON_ORE_ITEM.get());
        tag(net.minecraft.tags.ItemTags.LAPIS_ORES).add(BlockList.OTHER_LAPIS_ORE_ITEM.get());
        tag(net.minecraft.tags.ItemTags.REDSTONE_ORES).add(BlockList.OTHER_REDSTONE_ORE_ITEM.get());

        ////
        tag(ItemTagRegistry.ORES).add(BlockList.ALUMINUM_ORE_ITEM.get());
        tag(ItemTagRegistry.ORES).add(BlockList.IRIDIUM_ORE_ITEM.get());
        tag(ItemTagRegistry.ORES).add(BlockList.LEAD_ORE_ITEM.get());
        tag(ItemTagRegistry.ORES).add(BlockList.OSMIUM_ORE_ITEM.get());
        tag(ItemTagRegistry.ORES).add(BlockList.NICKEL_ORE_ITEM.get());
        tag(ItemTagRegistry.ORES).add(BlockList.PLATINUM_ORE_ITEM.get());
        tag(ItemTagRegistry.ORES).add(BlockList.SILVER_ORE_ITEM.get());
        tag(ItemTagRegistry.ORES).add(BlockList.TIN_ORE_ITEM.get());
        tag(ItemTagRegistry.ORES).add(BlockList.URANIUM_ORE_ITEM.get());
        tag(ItemTagRegistry.ORES).add(BlockList.ZINC_ORE_ITEM.get());

        tag(ItemTagRegistry.ORES).add(BlockList.RUBY_ORE_ITEM.get());
        tag(ItemTagRegistry.ORES).add(BlockList.SAPPHIRE_ORE_ITEM.get());
        tag(ItemTagRegistry.ORES).add(BlockList.PERIDOT_ORE_ITEM.get());


        tag(ItemTagRegistry.ORES).add(BlockList.ALUMINUM_SLATE_ORE_ITEM.get());
        tag(ItemTagRegistry.ORES).add(BlockList.IRIDIUM_SLATE_ORE_ITEM.get());
        tag(ItemTagRegistry.ORES).add(BlockList.LEAD_SLATE_ORE_ITEM.get());
        tag(ItemTagRegistry.ORES).add(BlockList.OSMIUM_SLATE_ORE_ITEM.get());
        tag(ItemTagRegistry.ORES).add(BlockList.NICKEL_SLATE_ORE_ITEM.get());
        tag(ItemTagRegistry.ORES).add(BlockList.PLATINUM_SLATE_ORE_ITEM.get());
        tag(ItemTagRegistry.ORES).add(BlockList.SILVER_SLATE_ORE_ITEM.get());
        tag(ItemTagRegistry.ORES).add(BlockList.TIN_SLATE_ORE_ITEM.get());
        tag(ItemTagRegistry.ORES).add(BlockList.URANIUM_SLATE_ORE_ITEM.get());
        tag(ItemTagRegistry.ORES).add(BlockList.ZINC_SLATE_ORE_ITEM.get());

        tag(ItemTagRegistry.ORES).add(BlockList.RUBY_SLATE_ORE_ITEM.get());
        tag(ItemTagRegistry.ORES).add(BlockList.SAPPHIRE_SLATE_ORE_ITEM.get());
        tag(ItemTagRegistry.ORES).add(BlockList.PERIDOT_SLATE_ORE_ITEM.get());


        tag(ItemTagRegistry.ORES).add(BlockList.ALUMINUM_NETHER_ORE_ITEM.get());
        tag(ItemTagRegistry.ORES).add(BlockList.IRIDIUM_NETHER_ORE_ITEM.get());
        tag(ItemTagRegistry.ORES).add(BlockList.LEAD_NETHER_ORE_ITEM.get());
        tag(ItemTagRegistry.ORES).add(BlockList.OSMIUM_NETHER_ORE_ITEM.get());
        tag(ItemTagRegistry.ORES).add(BlockList.NICKEL_NETHER_ORE_ITEM.get());
        tag(ItemTagRegistry.ORES).add(BlockList.PLATINUM_NETHER_ORE_ITEM.get());
        tag(ItemTagRegistry.ORES).add(BlockList.SILVER_NETHER_ORE_ITEM.get());
        tag(ItemTagRegistry.ORES).add(BlockList.TIN_NETHER_ORE_ITEM.get());
        tag(ItemTagRegistry.ORES).add(BlockList.URANIUM_NETHER_ORE_ITEM.get());
        tag(ItemTagRegistry.ORES).add(BlockList.ZINC_NETHER_ORE_ITEM.get());


        tag(ItemTagRegistry.ORES).add(BlockList.ALUMINUM_END_ORE_ITEM.get());
        tag(ItemTagRegistry.ORES).add(BlockList.IRIDIUM_END_ORE_ITEM.get());
        tag(ItemTagRegistry.ORES).add(BlockList.LEAD_END_ORE_ITEM.get());
        tag(ItemTagRegistry.ORES).add(BlockList.OSMIUM_END_ORE_ITEM.get());
        tag(ItemTagRegistry.ORES).add(BlockList.NICKEL_END_ORE_ITEM.get());
        tag(ItemTagRegistry.ORES).add(BlockList.PLATINUM_END_ORE_ITEM.get());
        tag(ItemTagRegistry.ORES).add(BlockList.SILVER_END_ORE_ITEM.get());
        tag(ItemTagRegistry.ORES).add(BlockList.TIN_END_ORE_ITEM.get());
        tag(ItemTagRegistry.ORES).add(BlockList.URANIUM_END_ORE_ITEM.get());
        tag(ItemTagRegistry.ORES).add(BlockList.ZINC_END_ORE_ITEM.get());


        tag(ItemTagRegistry.ORES).add(BlockList.OTHER_ALUMINUM_ORE_ITEM.get());
        tag(ItemTagRegistry.ORES).add(BlockList.OTHER_IRIDIUM_ORE_ITEM.get());
        tag(ItemTagRegistry.ORES).add(BlockList.OTHER_LEAD_ORE_ITEM.get());
        tag(ItemTagRegistry.ORES).add(BlockList.OTHER_OSMIUM_ORE_ITEM.get());
        tag(ItemTagRegistry.ORES).add(BlockList.OTHER_NICKEL_ORE_ITEM.get());
        tag(ItemTagRegistry.ORES).add(BlockList.OTHER_PLATINUM_ORE_ITEM.get());
        tag(ItemTagRegistry.ORES).add(BlockList.OTHER_SILVER_ORE_ITEM.get());
        tag(ItemTagRegistry.ORES).add(BlockList.OTHER_TIN_ORE_ITEM.get());
        tag(ItemTagRegistry.ORES).add(BlockList.OTHER_URANIUM_ORE_ITEM.get());
        tag(ItemTagRegistry.ORES).add(BlockList.OTHER_ZINC_ORE_ITEM.get());

        tag(ItemTagRegistry.ORES).add(BlockList.OTHER_COAL_ORE_ITEM.get());
        tag(ItemTagRegistry.ORES).add(BlockList.OTHER_COPPER_ORE_ITEM.get());
        tag(ItemTagRegistry.ORES).add(BlockList.OTHER_DIAMOND_ORE_ITEM.get());
        tag(ItemTagRegistry.ORES).add(BlockList.OTHER_EMERALD_ORE_ITEM.get());
        tag(ItemTagRegistry.ORES).add(BlockList.OTHER_GOLD_ORE_ITEM.get());
        tag(ItemTagRegistry.ORES).add(BlockList.OTHER_IRON_ORE_ITEM.get());
        tag(ItemTagRegistry.ORES).add(BlockList.OTHER_LAPIS_ORE_ITEM.get());
        tag(ItemTagRegistry.ORES).add(BlockList.OTHER_QUARTZ_ORE_ITEM.get());
        tag(ItemTagRegistry.ORES).add(BlockList.OTHER_REDSTONE_ORE_ITEM.get());



        ////
        tag(ItemTagRegistry.IN_STONE_ITEM).add(BlockList.ALUMINUM_ORE_ITEM.get());
        tag(ItemTagRegistry.IN_STONE_ITEM).add(BlockList.IRIDIUM_ORE_ITEM.get());
        tag(ItemTagRegistry.IN_STONE_ITEM).add(BlockList.LEAD_ORE_ITEM.get());
        tag(ItemTagRegistry.IN_STONE_ITEM).add(BlockList.OSMIUM_ORE_ITEM.get());
        tag(ItemTagRegistry.IN_STONE_ITEM).add(BlockList.NICKEL_ORE_ITEM.get());
        tag(ItemTagRegistry.IN_STONE_ITEM).add(BlockList.PLATINUM_ORE_ITEM.get());
        tag(ItemTagRegistry.IN_STONE_ITEM).add(BlockList.SILVER_ORE_ITEM.get());
        tag(ItemTagRegistry.IN_STONE_ITEM).add(BlockList.TIN_ORE_ITEM.get());
        tag(ItemTagRegistry.IN_STONE_ITEM).add(BlockList.URANIUM_ORE_ITEM.get());
        tag(ItemTagRegistry.IN_STONE_ITEM).add(BlockList.ZINC_ORE_ITEM.get());
        tag(ItemTagRegistry.IN_STONE_ITEM).add(BlockList.RUBY_ORE_ITEM.get());
        tag(ItemTagRegistry.IN_STONE_ITEM).add(BlockList.SAPPHIRE_ORE_ITEM.get());
        tag(ItemTagRegistry.IN_STONE_ITEM).add(BlockList.PERIDOT_ORE_ITEM.get());


        tag(ItemTagRegistry.IN_DEEPSLATE_ITEM).add(BlockList.ALUMINUM_SLATE_ORE_ITEM.get());
        tag(ItemTagRegistry.IN_DEEPSLATE_ITEM).add(BlockList.IRIDIUM_SLATE_ORE_ITEM.get());
        tag(ItemTagRegistry.IN_DEEPSLATE_ITEM).add(BlockList.LEAD_SLATE_ORE_ITEM.get());
        tag(ItemTagRegistry.IN_DEEPSLATE_ITEM).add(BlockList.OSMIUM_SLATE_ORE_ITEM.get());
        tag(ItemTagRegistry.IN_DEEPSLATE_ITEM).add(BlockList.NICKEL_SLATE_ORE_ITEM.get());
        tag(ItemTagRegistry.IN_DEEPSLATE_ITEM).add(BlockList.PLATINUM_SLATE_ORE_ITEM.get());
        tag(ItemTagRegistry.IN_DEEPSLATE_ITEM).add(BlockList.SILVER_SLATE_ORE_ITEM.get());
        tag(ItemTagRegistry.IN_DEEPSLATE_ITEM).add(BlockList.TIN_SLATE_ORE_ITEM.get());
        tag(ItemTagRegistry.IN_DEEPSLATE_ITEM).add(BlockList.URANIUM_SLATE_ORE_ITEM.get());
        tag(ItemTagRegistry.IN_DEEPSLATE_ITEM).add(BlockList.ZINC_SLATE_ORE_ITEM.get());
        tag(ItemTagRegistry.IN_DEEPSLATE_ITEM).add(BlockList.RUBY_SLATE_ORE_ITEM.get());
        tag(ItemTagRegistry.IN_DEEPSLATE_ITEM).add(BlockList.SAPPHIRE_SLATE_ORE_ITEM.get());
        tag(ItemTagRegistry.IN_DEEPSLATE_ITEM).add(BlockList.PERIDOT_SLATE_ORE_ITEM.get());


        tag(ItemTagRegistry.IN_NETHERRACK_ITEM).add(BlockList.ALUMINUM_NETHER_ORE_ITEM.get());
        tag(ItemTagRegistry.IN_NETHERRACK_ITEM).add(BlockList.IRIDIUM_NETHER_ORE_ITEM.get());
        tag(ItemTagRegistry.IN_NETHERRACK_ITEM).add(BlockList.LEAD_NETHER_ORE_ITEM.get());
        tag(ItemTagRegistry.IN_NETHERRACK_ITEM).add(BlockList.OSMIUM_NETHER_ORE_ITEM.get());
        tag(ItemTagRegistry.IN_NETHERRACK_ITEM).add(BlockList.NICKEL_NETHER_ORE_ITEM.get());
        tag(ItemTagRegistry.IN_NETHERRACK_ITEM).add(BlockList.PLATINUM_NETHER_ORE_ITEM.get());
        tag(ItemTagRegistry.IN_NETHERRACK_ITEM).add(BlockList.SILVER_NETHER_ORE_ITEM.get());
        tag(ItemTagRegistry.IN_NETHERRACK_ITEM).add(BlockList.TIN_NETHER_ORE_ITEM.get());
        tag(ItemTagRegistry.IN_NETHERRACK_ITEM).add(BlockList.URANIUM_NETHER_ORE_ITEM.get());
        tag(ItemTagRegistry.IN_NETHERRACK_ITEM).add(BlockList.ZINC_NETHER_ORE_ITEM.get());


        tag(ItemTagRegistry.IN_END_STONE_ITEM).add(BlockList.ALUMINUM_END_ORE_ITEM.get());
        tag(ItemTagRegistry.IN_END_STONE_ITEM).add(BlockList.IRIDIUM_END_ORE_ITEM.get());
        tag(ItemTagRegistry.IN_END_STONE_ITEM).add(BlockList.LEAD_END_ORE_ITEM.get());
        tag(ItemTagRegistry.IN_END_STONE_ITEM).add(BlockList.OSMIUM_END_ORE_ITEM.get());
        tag(ItemTagRegistry.IN_END_STONE_ITEM).add(BlockList.NICKEL_END_ORE_ITEM.get());
        tag(ItemTagRegistry.IN_END_STONE_ITEM).add(BlockList.PLATINUM_END_ORE_ITEM.get());
        tag(ItemTagRegistry.IN_END_STONE_ITEM).add(BlockList.SILVER_END_ORE_ITEM.get());
        tag(ItemTagRegistry.IN_END_STONE_ITEM).add(BlockList.TIN_END_ORE_ITEM.get());
        tag(ItemTagRegistry.IN_END_STONE_ITEM).add(BlockList.URANIUM_END_ORE_ITEM.get());
        tag(ItemTagRegistry.IN_END_STONE_ITEM).add(BlockList.ZINC_END_ORE_ITEM.get());


        tag(ItemTagRegistry.IN_ANCIENT_STONE_ITEM).add(BlockList.OTHER_ALUMINUM_ORE_ITEM.get());
        tag(ItemTagRegistry.IN_ANCIENT_STONE_ITEM).add(BlockList.OTHER_IRIDIUM_ORE_ITEM.get());
        tag(ItemTagRegistry.IN_ANCIENT_STONE_ITEM).add(BlockList.OTHER_LEAD_ORE_ITEM.get());
        tag(ItemTagRegistry.IN_ANCIENT_STONE_ITEM).add(BlockList.OTHER_OSMIUM_ORE_ITEM.get());
        tag(ItemTagRegistry.IN_ANCIENT_STONE_ITEM).add(BlockList.OTHER_NICKEL_ORE_ITEM.get());
        tag(ItemTagRegistry.IN_ANCIENT_STONE_ITEM).add(BlockList.OTHER_PLATINUM_ORE_ITEM.get());
        tag(ItemTagRegistry.IN_ANCIENT_STONE_ITEM).add(BlockList.OTHER_SILVER_ORE_ITEM.get());
        tag(ItemTagRegistry.IN_ANCIENT_STONE_ITEM).add(BlockList.OTHER_TIN_ORE_ITEM.get());
        tag(ItemTagRegistry.IN_ANCIENT_STONE_ITEM).add(BlockList.OTHER_URANIUM_ORE_ITEM.get());
        tag(ItemTagRegistry.IN_ANCIENT_STONE_ITEM).add(BlockList.OTHER_ZINC_ORE_ITEM.get());

        tag(ItemTagRegistry.IN_ANCIENT_STONE_ITEM).add(BlockList.OTHER_COAL_ORE_ITEM.get());
        tag(ItemTagRegistry.IN_ANCIENT_STONE_ITEM).add(BlockList.OTHER_COPPER_ORE_ITEM.get());
        tag(ItemTagRegistry.IN_ANCIENT_STONE_ITEM).add(BlockList.OTHER_DIAMOND_ORE_ITEM.get());
        tag(ItemTagRegistry.IN_ANCIENT_STONE_ITEM).add(BlockList.OTHER_EMERALD_ORE_ITEM.get());
        tag(ItemTagRegistry.IN_ANCIENT_STONE_ITEM).add(BlockList.OTHER_GOLD_ORE_ITEM.get());
        tag(ItemTagRegistry.IN_ANCIENT_STONE_ITEM).add(BlockList.OTHER_IRON_ORE_ITEM.get());
        tag(ItemTagRegistry.IN_ANCIENT_STONE_ITEM).add(BlockList.OTHER_LAPIS_ORE_ITEM.get());
        tag(ItemTagRegistry.IN_ANCIENT_STONE_ITEM).add(BlockList.OTHER_QUARTZ_ORE_ITEM.get());
        tag(ItemTagRegistry.IN_ANCIENT_STONE_ITEM).add(BlockList.OTHER_REDSTONE_ORE_ITEM.get());

        ////

        tag(ItemTagRegistry.RAW_ALUMINUM).add(BlockList.ALUMINUM_RAW.get());
        tag(ItemTagRegistry.RAW_IRIDIUM).add(BlockList.IRIDIUM_RAW.get());
        tag(ItemTagRegistry.RAW_LEAD).add(BlockList.LEAD_RAW.get());
        tag(ItemTagRegistry.RAW_NICKEL).add(BlockList.NICKEL_RAW.get());
        tag(ItemTagRegistry.RAW_OSMIUM).add(BlockList.OSMIUM_RAW.get());
        tag(ItemTagRegistry.RAW_PLATINUM).add(BlockList.PLATINUM_RAW.get());
        tag(ItemTagRegistry.RAW_SILVER).add(BlockList.SILVER_RAW.get());
        tag(ItemTagRegistry.RAW_TIN).add(BlockList.TIN_RAW.get());
        tag(ItemTagRegistry.RAW_URANIUM).add(BlockList.URANIUM_RAW.get());
        tag(ItemTagRegistry.RAW_ZINC).add(BlockList.ZINC_RAW.get());

        tag(ItemTagRegistry.RAWORES).add(BlockList.ALUMINUM_RAW.get());
        tag(ItemTagRegistry.RAWORES).add(BlockList.IRIDIUM_RAW.get());
        tag(ItemTagRegistry.RAWORES).add(BlockList.LEAD_RAW.get());
        tag(ItemTagRegistry.RAWORES).add(BlockList.NICKEL_RAW.get());
        tag(ItemTagRegistry.RAWORES).add(BlockList.OSMIUM_RAW.get());
        tag(ItemTagRegistry.RAWORES).add(BlockList.PLATINUM_RAW.get());
        tag(ItemTagRegistry.RAWORES).add(BlockList.SILVER_RAW.get());
        tag(ItemTagRegistry.RAWORES).add(BlockList.TIN_RAW.get());
        tag(ItemTagRegistry.RAWORES).add(BlockList.URANIUM_RAW.get());
        tag(ItemTagRegistry.RAWORES).add(BlockList.ZINC_RAW.get());


        tag(ItemTagRegistry.ORE_HAMMERS).add(BlockList.COPPER_ORE_HAMMER.get());
        tag(ItemTagRegistry.ORE_HAMMERS).add(BlockList.BRONZE_ORE_HAMMER.get());
        tag(ItemTagRegistry.ORE_HAMMERS).add(BlockList.IRON_ORE_HAMMER.get());
        tag(ItemTagRegistry.ORE_HAMMERS).add(BlockList.INVAR_ORE_HAMMER.get());
        tag(ItemTagRegistry.ORE_HAMMERS).add(BlockList.PLATINUM_ORE_HAMMER.get());

    }
}

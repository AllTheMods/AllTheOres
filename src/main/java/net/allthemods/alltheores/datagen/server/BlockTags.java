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
        tag(ItemTagRegistry.RAW_IRIDIUM_BLOCK).add(BlockList.RAW_IRIDIUM_BLOCK.get());
        tag(ItemTagRegistry.RAW_LEAD_BLOCK).add(BlockList.RAW_LEAD_BLOCK.get());
        tag(ItemTagRegistry.RAW_OSMIUM_BLOCK).add(BlockList.RAW_OSMIUM_BLOCK.get());
        tag(ItemTagRegistry.RAW_NICKEL_BLOCK).add(BlockList.RAW_NICKEL_BLOCK.get());
        tag(ItemTagRegistry.RAW_PLATINUM_BLOCK).add(BlockList.RAW_PLATINUM_BLOCK.get());
        tag(ItemTagRegistry.RAW_SILVER_BLOCK).add(BlockList.RAW_SILVER_BLOCK.get());
        tag(ItemTagRegistry.RAW_TIN_BLOCK).add(BlockList.RAW_TIN_BLOCK.get());
        tag(ItemTagRegistry.RAW_URANIUM_BLOCK).add(BlockList.RAW_URANIUM_BLOCK.get());
        tag(ItemTagRegistry.RAW_ZINC_BLOCK).add(BlockList.RAW_ZINC_BLOCK.get());

        tag(ItemTagRegistry.ALUMINUM_BLOCK).add(BlockList.ALUMINUM_BLOCK.get());
        tag(ItemTagRegistry.IRIDIUM_BLOCK).add(BlockList.IRIDIUM_BLOCK.get());
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
        tag(ItemTagRegistry.BRASS_BLOCK).add(BlockList.BRASS_BLOCK.get());
        tag(ItemTagRegistry.RUBY_BLOCK).add(BlockList.RUBY_BLOCK.get());
        tag(ItemTagRegistry.SAPPHIRE_BLOCK).add(BlockList.SAPPHIRE_BLOCK.get());
        tag(ItemTagRegistry.PERIDOT_BLOCK).add(BlockList.PERIDOT_BLOCK.get());

        tag(ItemTagRegistry.ALUMINUM_ORE).add(BlockList.ALUMINUM_ORE.get());
        tag(ItemTagRegistry.IRIDIUM_ORE).add(BlockList.IRIDIUM_ORE.get());
        tag(ItemTagRegistry.LEAD_ORE).add(BlockList.LEAD_ORE.get());
        tag(ItemTagRegistry.OSMIUM_ORE).add(BlockList.OSMIUM_ORE.get());
        tag(ItemTagRegistry.NICKEL_ORE).add(BlockList.NICKEL_ORE.get());
        tag(ItemTagRegistry.PLATINUM_ORE).add(BlockList.PLATINUM_ORE.get());
        tag(ItemTagRegistry.SILVER_ORE).add(BlockList.SILVER_ORE.get());
        tag(ItemTagRegistry.TIN_ORE).add(BlockList.TIN_ORE.get());
        tag(ItemTagRegistry.URANIUM_ORE).add(BlockList.URANIUM_ORE.get());
        tag(ItemTagRegistry.ZINC_ORE).add(BlockList.ZINC_ORE.get());
        tag(ItemTagRegistry.RUBY_ORE).add(BlockList.RUBY_ORE.get());
        tag(ItemTagRegistry.SAPPHIRE_ORE).add(BlockList.SAPPHIRE_ORE.get());
        tag(ItemTagRegistry.PERIDOT_ORE).add(BlockList.PERIDOT_ORE.get());

        tag(ItemTagRegistry.ALUMINUM_ORE).add(BlockList.ALUMINUM_SLATE_ORE.get());
        tag(ItemTagRegistry.IRIDIUM_ORE).add(BlockList.IRIDIUM_SLATE_ORE.get());
        tag(ItemTagRegistry.LEAD_ORE).add(BlockList.LEAD_SLATE_ORE.get());
        tag(ItemTagRegistry.OSMIUM_ORE).add(BlockList.OSMIUM_SLATE_ORE.get());
        tag(ItemTagRegistry.NICKEL_ORE).add(BlockList.NICKEL_SLATE_ORE.get());
        tag(ItemTagRegistry.PLATINUM_ORE).add(BlockList.PLATINUM_SLATE_ORE.get());
        tag(ItemTagRegistry.SILVER_ORE).add(BlockList.SILVER_SLATE_ORE.get());
        tag(ItemTagRegistry.TIN_ORE).add(BlockList.TIN_SLATE_ORE.get());
        tag(ItemTagRegistry.URANIUM_ORE).add(BlockList.URANIUM_SLATE_ORE.get());
        tag(ItemTagRegistry.ZINC_ORE).add(BlockList.ZINC_SLATE_ORE.get());
        tag(ItemTagRegistry.RUBY_ORE).add(BlockList.RUBY_SLATE_ORE.get());
        tag(ItemTagRegistry.SAPPHIRE_ORE).add(BlockList.SAPPHIRE_SLATE_ORE.get());
        tag(ItemTagRegistry.PERIDOT_ORE).add(BlockList.PERIDOT_SLATE_ORE.get());

        tag(ItemTagRegistry.ALUMINUM_ORE).add(BlockList.ALUMINUM_NETHER_ORE.get());
        tag(ItemTagRegistry.IRIDIUM_ORE).add(BlockList.IRIDIUM_NETHER_ORE.get());
        tag(ItemTagRegistry.LEAD_ORE).add(BlockList.LEAD_NETHER_ORE.get());
        tag(ItemTagRegistry.OSMIUM_ORE).add(BlockList.OSMIUM_NETHER_ORE.get());
        tag(ItemTagRegistry.NICKEL_ORE).add(BlockList.NICKEL_NETHER_ORE.get());
        tag(ItemTagRegistry.PLATINUM_ORE).add(BlockList.PLATINUM_NETHER_ORE.get());
        tag(ItemTagRegistry.SILVER_ORE).add(BlockList.SILVER_NETHER_ORE.get());
        tag(ItemTagRegistry.TIN_ORE).add(BlockList.TIN_NETHER_ORE.get());
        tag(ItemTagRegistry.URANIUM_ORE).add(BlockList.URANIUM_NETHER_ORE.get());
        tag(ItemTagRegistry.ZINC_ORE).add(BlockList.ZINC_NETHER_ORE.get());

        tag(ItemTagRegistry.ALUMINUM_ORE).add(BlockList.ALUMINUM_END_ORE.get());
        tag(ItemTagRegistry.IRIDIUM_ORE).add(BlockList.IRIDIUM_END_ORE.get());
        tag(ItemTagRegistry.LEAD_ORE).add(BlockList.LEAD_END_ORE.get());
        tag(ItemTagRegistry.OSMIUM_ORE).add(BlockList.OSMIUM_END_ORE.get());
        tag(ItemTagRegistry.NICKEL_ORE).add(BlockList.NICKEL_END_ORE.get());
        tag(ItemTagRegistry.PLATINUM_ORE).add(BlockList.PLATINUM_END_ORE.get());
        tag(ItemTagRegistry.SILVER_ORE).add(BlockList.SILVER_END_ORE.get());
        tag(ItemTagRegistry.TIN_ORE).add(BlockList.TIN_END_ORE.get());
        tag(ItemTagRegistry.URANIUM_ORE).add(BlockList.URANIUM_END_ORE.get());
        tag(ItemTagRegistry.ZINC_ORE).add(BlockList.ZINC_END_ORE.get());

        tag(ItemTagRegistry.ALUMINUM_ORE).add(BlockList.OTHER_ALUMINUM_ORE.get());
        tag(ItemTagRegistry.IRIDIUM_ORE).add(BlockList.OTHER_IRIDIUM_ORE.get());
        tag(ItemTagRegistry.LEAD_ORE).add(BlockList.OTHER_LEAD_ORE.get());
        tag(ItemTagRegistry.OSMIUM_ORE).add(BlockList.OTHER_OSMIUM_ORE.get());
        tag(ItemTagRegistry.NICKEL_ORE).add(BlockList.OTHER_NICKEL_ORE.get());
        tag(ItemTagRegistry.PLATINUM_ORE).add(BlockList.OTHER_PLATINUM_ORE.get());
        tag(ItemTagRegistry.SILVER_ORE).add(BlockList.OTHER_SILVER_ORE.get());
        tag(ItemTagRegistry.TIN_ORE).add(BlockList.OTHER_TIN_ORE.get());
        tag(ItemTagRegistry.URANIUM_ORE).add(BlockList.OTHER_URANIUM_ORE.get());
        tag(ItemTagRegistry.ZINC_ORE).add(BlockList.OTHER_ZINC_ORE.get());

       ////

        tag(ItemTagRegistry.FORES).add(BlockList.ALUMINUM_ORE.get());
        tag(ItemTagRegistry.FORES).add(BlockList.IRIDIUM_ORE.get());
        tag(ItemTagRegistry.FORES).add(BlockList.LEAD_ORE.get());
        tag(ItemTagRegistry.FORES).add(BlockList.OSMIUM_ORE.get());
        tag(ItemTagRegistry.FORES).add(BlockList.NICKEL_ORE.get());
        tag(ItemTagRegistry.FORES).add(BlockList.PLATINUM_ORE.get());
        tag(ItemTagRegistry.FORES).add(BlockList.SILVER_ORE.get());
        tag(ItemTagRegistry.FORES).add(BlockList.TIN_ORE.get());
        tag(ItemTagRegistry.FORES).add(BlockList.URANIUM_ORE.get());
        tag(ItemTagRegistry.FORES).add(BlockList.ZINC_ORE.get());
        tag(ItemTagRegistry.FORES).add(BlockList.RUBY_ORE.get());
        tag(ItemTagRegistry.FORES).add(BlockList.SAPPHIRE_ORE.get());
        tag(ItemTagRegistry.FORES).add(BlockList.PERIDOT_ORE.get());

        tag(ItemTagRegistry.FORES).add(BlockList.ALUMINUM_SLATE_ORE.get());
        tag(ItemTagRegistry.FORES).add(BlockList.IRIDIUM_SLATE_ORE.get());
        tag(ItemTagRegistry.FORES).add(BlockList.LEAD_SLATE_ORE.get());
        tag(ItemTagRegistry.FORES).add(BlockList.OSMIUM_SLATE_ORE.get());
        tag(ItemTagRegistry.FORES).add(BlockList.NICKEL_SLATE_ORE.get());
        tag(ItemTagRegistry.FORES).add(BlockList.PLATINUM_SLATE_ORE.get());
        tag(ItemTagRegistry.FORES).add(BlockList.SILVER_SLATE_ORE.get());
        tag(ItemTagRegistry.FORES).add(BlockList.TIN_SLATE_ORE.get());
        tag(ItemTagRegistry.FORES).add(BlockList.URANIUM_SLATE_ORE.get());
        tag(ItemTagRegistry.FORES).add(BlockList.ZINC_SLATE_ORE.get());
        tag(ItemTagRegistry.FORES).add(BlockList.RUBY_SLATE_ORE.get());
        tag(ItemTagRegistry.FORES).add(BlockList.SAPPHIRE_SLATE_ORE.get());
        tag(ItemTagRegistry.FORES).add(BlockList.PERIDOT_SLATE_ORE.get());

        tag(ItemTagRegistry.FORES).add(BlockList.ALUMINUM_NETHER_ORE.get());
        tag(ItemTagRegistry.FORES).add(BlockList.IRIDIUM_NETHER_ORE.get());
        tag(ItemTagRegistry.FORES).add(BlockList.LEAD_NETHER_ORE.get());
        tag(ItemTagRegistry.FORES).add(BlockList.OSMIUM_NETHER_ORE.get());
        tag(ItemTagRegistry.FORES).add(BlockList.NICKEL_NETHER_ORE.get());
        tag(ItemTagRegistry.FORES).add(BlockList.PLATINUM_NETHER_ORE.get());
        tag(ItemTagRegistry.FORES).add(BlockList.SILVER_NETHER_ORE.get());
        tag(ItemTagRegistry.FORES).add(BlockList.TIN_NETHER_ORE.get());
        tag(ItemTagRegistry.FORES).add(BlockList.URANIUM_NETHER_ORE.get());
        tag(ItemTagRegistry.FORES).add(BlockList.ZINC_NETHER_ORE.get());

        tag(ItemTagRegistry.FORES).add(BlockList.ALUMINUM_END_ORE.get());
        tag(ItemTagRegistry.FORES).add(BlockList.IRIDIUM_END_ORE.get());
        tag(ItemTagRegistry.FORES).add(BlockList.LEAD_END_ORE.get());
        tag(ItemTagRegistry.FORES).add(BlockList.OSMIUM_END_ORE.get());
        tag(ItemTagRegistry.FORES).add(BlockList.NICKEL_END_ORE.get());
        tag(ItemTagRegistry.FORES).add(BlockList.PLATINUM_END_ORE.get());
        tag(ItemTagRegistry.FORES).add(BlockList.SILVER_END_ORE.get());
        tag(ItemTagRegistry.FORES).add(BlockList.TIN_END_ORE.get());
        tag(ItemTagRegistry.FORES).add(BlockList.URANIUM_END_ORE.get());
        tag(ItemTagRegistry.FORES).add(BlockList.ZINC_END_ORE.get());

        tag(ItemTagRegistry.FORES).add(BlockList.OTHER_ALUMINUM_ORE.get());
        tag(ItemTagRegistry.FORES).add(BlockList.OTHER_IRIDIUM_ORE.get());
        tag(ItemTagRegistry.FORES).add(BlockList.OTHER_LEAD_ORE.get());
        tag(ItemTagRegistry.FORES).add(BlockList.OTHER_OSMIUM_ORE.get());
        tag(ItemTagRegistry.FORES).add(BlockList.OTHER_NICKEL_ORE.get());
        tag(ItemTagRegistry.FORES).add(BlockList.OTHER_PLATINUM_ORE.get());
        tag(ItemTagRegistry.FORES).add(BlockList.OTHER_SILVER_ORE.get());
        tag(ItemTagRegistry.FORES).add(BlockList.OTHER_TIN_ORE.get());
        tag(ItemTagRegistry.FORES).add(BlockList.OTHER_URANIUM_ORE.get());
        tag(ItemTagRegistry.FORES).add(BlockList.OTHER_QUARTZ_ORE.get());
        tag(ItemTagRegistry.FORES).add(BlockList.OTHER_ZINC_ORE.get());


        ////
        tag(net.minecraft.tags.BlockTags.MINEABLE_WITH_PICKAXE).add(BlockList.ALUMINUM_BLOCK.get());
        tag(net.minecraft.tags.BlockTags.MINEABLE_WITH_PICKAXE).add(BlockList.IRIDIUM_BLOCK.get());
        tag(net.minecraft.tags.BlockTags.MINEABLE_WITH_PICKAXE).add(BlockList.LEAD_BLOCK.get());
        tag(net.minecraft.tags.BlockTags.MINEABLE_WITH_PICKAXE).add(BlockList.OSMIUM_BLOCK.get());
        tag(net.minecraft.tags.BlockTags.MINEABLE_WITH_PICKAXE).add(BlockList.NICKEL_BLOCK.get());
        tag(net.minecraft.tags.BlockTags.MINEABLE_WITH_PICKAXE).add(BlockList.PLATINUM_BLOCK.get());
        tag(net.minecraft.tags.BlockTags.MINEABLE_WITH_PICKAXE).add(BlockList.SILVER_BLOCK.get());
        tag(net.minecraft.tags.BlockTags.MINEABLE_WITH_PICKAXE).add(BlockList.TIN_BLOCK.get());
        tag(net.minecraft.tags.BlockTags.MINEABLE_WITH_PICKAXE).add(BlockList.URANIUM_BLOCK.get());
        tag(net.minecraft.tags.BlockTags.MINEABLE_WITH_PICKAXE).add(BlockList.ZINC_BLOCK.get());
        tag(net.minecraft.tags.BlockTags.MINEABLE_WITH_PICKAXE).add(BlockList.BRONZE_BLOCK.get());
        tag(net.minecraft.tags.BlockTags.MINEABLE_WITH_PICKAXE).add(BlockList.CONSTANTAN_BLOCK.get());
        tag(net.minecraft.tags.BlockTags.MINEABLE_WITH_PICKAXE).add(BlockList.ELECTRUM_BLOCK.get());
        tag(net.minecraft.tags.BlockTags.MINEABLE_WITH_PICKAXE).add(BlockList.ENDERIUM_BLOCK.get());
        tag(net.minecraft.tags.BlockTags.MINEABLE_WITH_PICKAXE).add(BlockList.INVAR_BLOCK.get());
        tag(net.minecraft.tags.BlockTags.MINEABLE_WITH_PICKAXE).add(BlockList.LUMIUM_BLOCK.get());
        tag(net.minecraft.tags.BlockTags.MINEABLE_WITH_PICKAXE).add(BlockList.SIGNALUM_BLOCK.get());
        tag(net.minecraft.tags.BlockTags.MINEABLE_WITH_PICKAXE).add(BlockList.STEEL_BLOCK.get());
        tag(net.minecraft.tags.BlockTags.MINEABLE_WITH_PICKAXE).add(BlockList.BRASS_BLOCK.get());


        tag(net.minecraft.tags.BlockTags.MINEABLE_WITH_PICKAXE).add(BlockList.ALUMINUM_ORE.get());
        tag(net.minecraft.tags.BlockTags.MINEABLE_WITH_PICKAXE).add(BlockList.IRIDIUM_ORE.get());
        tag(net.minecraft.tags.BlockTags.MINEABLE_WITH_PICKAXE).add(BlockList.LEAD_ORE.get());
        tag(net.minecraft.tags.BlockTags.MINEABLE_WITH_PICKAXE).add(BlockList.OSMIUM_ORE.get());
        tag(net.minecraft.tags.BlockTags.MINEABLE_WITH_PICKAXE).add(BlockList.NICKEL_ORE.get());
        tag(net.minecraft.tags.BlockTags.MINEABLE_WITH_PICKAXE).add(BlockList.PLATINUM_ORE.get());
        tag(net.minecraft.tags.BlockTags.MINEABLE_WITH_PICKAXE).add(BlockList.SILVER_ORE.get());
        tag(net.minecraft.tags.BlockTags.MINEABLE_WITH_PICKAXE).add(BlockList.TIN_ORE.get());
        tag(net.minecraft.tags.BlockTags.MINEABLE_WITH_PICKAXE).add(BlockList.URANIUM_ORE.get());
        tag(net.minecraft.tags.BlockTags.MINEABLE_WITH_PICKAXE).add(BlockList.ZINC_ORE.get());
        tag(net.minecraft.tags.BlockTags.MINEABLE_WITH_PICKAXE).add(BlockList.RUBY_ORE.get());
        tag(net.minecraft.tags.BlockTags.MINEABLE_WITH_PICKAXE).add(BlockList.PERIDOT_ORE.get());
        tag(net.minecraft.tags.BlockTags.MINEABLE_WITH_PICKAXE).add(BlockList.SAPPHIRE_ORE.get());

        tag(net.minecraft.tags.BlockTags.MINEABLE_WITH_PICKAXE).add(BlockList.ALUMINUM_SLATE_ORE.get());
        tag(net.minecraft.tags.BlockTags.MINEABLE_WITH_PICKAXE).add(BlockList.IRIDIUM_SLATE_ORE.get());
        tag(net.minecraft.tags.BlockTags.MINEABLE_WITH_PICKAXE).add(BlockList.LEAD_SLATE_ORE.get());
        tag(net.minecraft.tags.BlockTags.MINEABLE_WITH_PICKAXE).add(BlockList.OSMIUM_SLATE_ORE.get());
        tag(net.minecraft.tags.BlockTags.MINEABLE_WITH_PICKAXE).add(BlockList.NICKEL_SLATE_ORE.get());
        tag(net.minecraft.tags.BlockTags.MINEABLE_WITH_PICKAXE).add(BlockList.PLATINUM_SLATE_ORE.get());
        tag(net.minecraft.tags.BlockTags.MINEABLE_WITH_PICKAXE).add(BlockList.SILVER_SLATE_ORE.get());
        tag(net.minecraft.tags.BlockTags.MINEABLE_WITH_PICKAXE).add(BlockList.TIN_SLATE_ORE.get());
        tag(net.minecraft.tags.BlockTags.MINEABLE_WITH_PICKAXE).add(BlockList.URANIUM_SLATE_ORE.get());
        tag(net.minecraft.tags.BlockTags.MINEABLE_WITH_PICKAXE).add(BlockList.ZINC_SLATE_ORE.get());
        tag(net.minecraft.tags.BlockTags.MINEABLE_WITH_PICKAXE).add(BlockList.RUBY_SLATE_ORE.get());
        tag(net.minecraft.tags.BlockTags.MINEABLE_WITH_PICKAXE).add(BlockList.PERIDOT_SLATE_ORE.get());
        tag(net.minecraft.tags.BlockTags.MINEABLE_WITH_PICKAXE).add(BlockList.SAPPHIRE_SLATE_ORE.get());

        tag(net.minecraft.tags.BlockTags.MINEABLE_WITH_PICKAXE).add(BlockList.ALUMINUM_NETHER_ORE.get());
        tag(net.minecraft.tags.BlockTags.MINEABLE_WITH_PICKAXE).add(BlockList.IRIDIUM_NETHER_ORE.get());
        tag(net.minecraft.tags.BlockTags.MINEABLE_WITH_PICKAXE).add(BlockList.LEAD_NETHER_ORE.get());
        tag(net.minecraft.tags.BlockTags.MINEABLE_WITH_PICKAXE).add(BlockList.OSMIUM_NETHER_ORE.get());
        tag(net.minecraft.tags.BlockTags.MINEABLE_WITH_PICKAXE).add(BlockList.NICKEL_NETHER_ORE.get());
        tag(net.minecraft.tags.BlockTags.MINEABLE_WITH_PICKAXE).add(BlockList.PLATINUM_NETHER_ORE.get());
        tag(net.minecraft.tags.BlockTags.MINEABLE_WITH_PICKAXE).add(BlockList.SILVER_NETHER_ORE.get());
        tag(net.minecraft.tags.BlockTags.MINEABLE_WITH_PICKAXE).add(BlockList.TIN_NETHER_ORE.get());
        tag(net.minecraft.tags.BlockTags.MINEABLE_WITH_PICKAXE).add(BlockList.URANIUM_NETHER_ORE.get());
        tag(net.minecraft.tags.BlockTags.MINEABLE_WITH_PICKAXE).add(BlockList.ZINC_NETHER_ORE.get());

        tag(net.minecraft.tags.BlockTags.MINEABLE_WITH_PICKAXE).add(BlockList.ALUMINUM_END_ORE.get());
        tag(net.minecraft.tags.BlockTags.MINEABLE_WITH_PICKAXE).add(BlockList.IRIDIUM_END_ORE.get());
        tag(net.minecraft.tags.BlockTags.MINEABLE_WITH_PICKAXE).add(BlockList.LEAD_END_ORE.get());
        tag(net.minecraft.tags.BlockTags.MINEABLE_WITH_PICKAXE).add(BlockList.OSMIUM_END_ORE.get());
        tag(net.minecraft.tags.BlockTags.MINEABLE_WITH_PICKAXE).add(BlockList.NICKEL_END_ORE.get());
        tag(net.minecraft.tags.BlockTags.MINEABLE_WITH_PICKAXE).add(BlockList.PLATINUM_END_ORE.get());
        tag(net.minecraft.tags.BlockTags.MINEABLE_WITH_PICKAXE).add(BlockList.SILVER_END_ORE.get());
        tag(net.minecraft.tags.BlockTags.MINEABLE_WITH_PICKAXE).add(BlockList.TIN_END_ORE.get());
        tag(net.minecraft.tags.BlockTags.MINEABLE_WITH_PICKAXE).add(BlockList.URANIUM_END_ORE.get());
        tag(net.minecraft.tags.BlockTags.MINEABLE_WITH_PICKAXE).add(BlockList.ZINC_END_ORE.get());

        tag(net.minecraft.tags.BlockTags.MINEABLE_WITH_PICKAXE).add(BlockList.OTHER_ALUMINUM_ORE.get());
        tag(net.minecraft.tags.BlockTags.MINEABLE_WITH_PICKAXE).add(BlockList.OTHER_IRIDIUM_ORE.get());
        tag(net.minecraft.tags.BlockTags.MINEABLE_WITH_PICKAXE).add(BlockList.OTHER_LEAD_ORE.get());
        tag(net.minecraft.tags.BlockTags.MINEABLE_WITH_PICKAXE).add(BlockList.OTHER_OSMIUM_ORE.get());
        tag(net.minecraft.tags.BlockTags.MINEABLE_WITH_PICKAXE).add(BlockList.OTHER_NICKEL_ORE.get());
        tag(net.minecraft.tags.BlockTags.MINEABLE_WITH_PICKAXE).add(BlockList.OTHER_PLATINUM_ORE.get());
        tag(net.minecraft.tags.BlockTags.MINEABLE_WITH_PICKAXE).add(BlockList.OTHER_SILVER_ORE.get());
        tag(net.minecraft.tags.BlockTags.MINEABLE_WITH_PICKAXE).add(BlockList.OTHER_TIN_ORE.get());
        tag(net.minecraft.tags.BlockTags.MINEABLE_WITH_PICKAXE).add(BlockList.OTHER_URANIUM_ORE.get());
        tag(net.minecraft.tags.BlockTags.MINEABLE_WITH_PICKAXE).add(BlockList.OTHER_ZINC_ORE.get());

        ////

        tag(ItemTagRegistry.IN_STONE).add(BlockList.ALUMINUM_ORE.get());
        tag(ItemTagRegistry.IN_STONE).add(BlockList.IRIDIUM_ORE.get());
        tag(ItemTagRegistry.IN_STONE).add(BlockList.LEAD_ORE.get());
        tag(ItemTagRegistry.IN_STONE).add(BlockList.OSMIUM_ORE.get());
        tag(ItemTagRegistry.IN_STONE).add(BlockList.NICKEL_ORE.get());
        tag(ItemTagRegistry.IN_STONE).add(BlockList.PLATINUM_ORE.get());
        tag(ItemTagRegistry.IN_STONE).add(BlockList.SILVER_ORE.get());
        tag(ItemTagRegistry.IN_STONE).add(BlockList.TIN_ORE.get());
        tag(ItemTagRegistry.IN_STONE).add(BlockList.URANIUM_ORE.get());
        tag(ItemTagRegistry.IN_STONE).add(BlockList.ZINC_ORE.get());

        tag(ItemTagRegistry.IN_DEEPSLATE).add(BlockList.ALUMINUM_SLATE_ORE.get());
        tag(ItemTagRegistry.IN_DEEPSLATE).add(BlockList.IRIDIUM_SLATE_ORE.get());
        tag(ItemTagRegistry.IN_DEEPSLATE).add(BlockList.LEAD_SLATE_ORE.get());
        tag(ItemTagRegistry.IN_DEEPSLATE).add(BlockList.OSMIUM_SLATE_ORE.get());
        tag(ItemTagRegistry.IN_DEEPSLATE).add(BlockList.NICKEL_SLATE_ORE.get());
        tag(ItemTagRegistry.IN_DEEPSLATE).add(BlockList.PLATINUM_SLATE_ORE.get());
        tag(ItemTagRegistry.IN_DEEPSLATE).add(BlockList.SILVER_SLATE_ORE.get());
        tag(ItemTagRegistry.IN_DEEPSLATE).add(BlockList.TIN_SLATE_ORE.get());
        tag(ItemTagRegistry.IN_DEEPSLATE).add(BlockList.URANIUM_SLATE_ORE.get());
        tag(ItemTagRegistry.IN_DEEPSLATE).add(BlockList.ZINC_SLATE_ORE.get());

        tag(ItemTagRegistry.IN_NETHERRACK).add(BlockList.ALUMINUM_NETHER_ORE.get());
        tag(ItemTagRegistry.IN_NETHERRACK).add(BlockList.IRIDIUM_NETHER_ORE.get());
        tag(ItemTagRegistry.IN_NETHERRACK).add(BlockList.LEAD_NETHER_ORE.get());
        tag(ItemTagRegistry.IN_NETHERRACK).add(BlockList.OSMIUM_NETHER_ORE.get());
        tag(ItemTagRegistry.IN_NETHERRACK).add(BlockList.NICKEL_NETHER_ORE.get());
        tag(ItemTagRegistry.IN_NETHERRACK).add(BlockList.PLATINUM_NETHER_ORE.get());
        tag(ItemTagRegistry.IN_NETHERRACK).add(BlockList.SILVER_NETHER_ORE.get());
        tag(ItemTagRegistry.IN_NETHERRACK).add(BlockList.TIN_NETHER_ORE.get());
        tag(ItemTagRegistry.IN_NETHERRACK).add(BlockList.URANIUM_NETHER_ORE.get());
        tag(ItemTagRegistry.IN_NETHERRACK).add(BlockList.ZINC_NETHER_ORE.get());

        tag(ItemTagRegistry.IN_END_STONE).add(BlockList.ALUMINUM_END_ORE.get());
        tag(ItemTagRegistry.IN_END_STONE).add(BlockList.IRIDIUM_END_ORE.get());
        tag(ItemTagRegistry.IN_END_STONE).add(BlockList.LEAD_END_ORE.get());
        tag(ItemTagRegistry.IN_END_STONE).add(BlockList.OSMIUM_END_ORE.get());
        tag(ItemTagRegistry.IN_END_STONE).add(BlockList.NICKEL_END_ORE.get());
        tag(ItemTagRegistry.IN_END_STONE).add(BlockList.PLATINUM_END_ORE.get());
        tag(ItemTagRegistry.IN_END_STONE).add(BlockList.SILVER_END_ORE.get());
        tag(ItemTagRegistry.IN_END_STONE).add(BlockList.TIN_END_ORE.get());
        tag(ItemTagRegistry.IN_END_STONE).add(BlockList.URANIUM_END_ORE.get());
        tag(ItemTagRegistry.IN_END_STONE).add(BlockList.ZINC_END_ORE.get());

        tag(ItemTagRegistry.IN_ANCIENT_STONE).add(BlockList.OTHER_ALUMINUM_ORE.get());
        tag(ItemTagRegistry.IN_ANCIENT_STONE).add(BlockList.OTHER_IRIDIUM_ORE.get());
        tag(ItemTagRegistry.IN_ANCIENT_STONE).add(BlockList.OTHER_LEAD_ORE.get());
        tag(ItemTagRegistry.IN_ANCIENT_STONE).add(BlockList.OTHER_OSMIUM_ORE.get());
        tag(ItemTagRegistry.IN_ANCIENT_STONE).add(BlockList.OTHER_NICKEL_ORE.get());
        tag(ItemTagRegistry.IN_ANCIENT_STONE).add(BlockList.OTHER_PLATINUM_ORE.get());
        tag(ItemTagRegistry.IN_ANCIENT_STONE).add(BlockList.OTHER_SILVER_ORE.get());
        tag(ItemTagRegistry.IN_ANCIENT_STONE).add(BlockList.OTHER_TIN_ORE.get());
        tag(ItemTagRegistry.IN_ANCIENT_STONE).add(BlockList.OTHER_URANIUM_ORE.get());
        tag(ItemTagRegistry.IN_ANCIENT_STONE).add(BlockList.OTHER_ZINC_ORE.get());

        ////

        tag(net.minecraft.tags.BlockTags.NEEDS_STONE_TOOL).add(BlockList.ALUMINUM_ORE.get());
        tag(net.minecraft.tags.BlockTags.NEEDS_IRON_TOOL).add(BlockList.LEAD_ORE.get());
        tag(net.minecraft.tags.BlockTags.NEEDS_IRON_TOOL).add(BlockList.OSMIUM_ORE.get());
        tag(net.minecraft.tags.BlockTags.NEEDS_STONE_TOOL).add(BlockList.NICKEL_ORE.get());
        tag(net.minecraft.tags.BlockTags.NEEDS_DIAMOND_TOOL).add(BlockList.PLATINUM_ORE.get());
        tag(net.minecraft.tags.BlockTags.NEEDS_DIAMOND_TOOL).add(BlockList.IRIDIUM_ORE.get());
        tag(net.minecraft.tags.BlockTags.NEEDS_IRON_TOOL).add(BlockList.SILVER_ORE.get());
        tag(net.minecraft.tags.BlockTags.NEEDS_STONE_TOOL).add(BlockList.TIN_ORE.get());
        tag(net.minecraft.tags.BlockTags.NEEDS_DIAMOND_TOOL).add(BlockList.URANIUM_ORE.get());
        tag(net.minecraft.tags.BlockTags.NEEDS_STONE_TOOL).add(BlockList.ZINC_ORE.get());

        tag(net.minecraft.tags.BlockTags.NEEDS_STONE_TOOL).add(BlockList.ALUMINUM_SLATE_ORE.get());
        tag(net.minecraft.tags.BlockTags.NEEDS_IRON_TOOL).add(BlockList.LEAD_SLATE_ORE.get());
        tag(net.minecraft.tags.BlockTags.NEEDS_IRON_TOOL).add(BlockList.OSMIUM_SLATE_ORE.get());
        tag(net.minecraft.tags.BlockTags.NEEDS_STONE_TOOL).add(BlockList.NICKEL_SLATE_ORE.get());
        tag(net.minecraft.tags.BlockTags.NEEDS_DIAMOND_TOOL).add(BlockList.PLATINUM_SLATE_ORE.get());
        tag(net.minecraft.tags.BlockTags.NEEDS_DIAMOND_TOOL).add(BlockList.IRIDIUM_SLATE_ORE.get());
        tag(net.minecraft.tags.BlockTags.NEEDS_IRON_TOOL).add(BlockList.SILVER_SLATE_ORE.get());
        tag(net.minecraft.tags.BlockTags.NEEDS_STONE_TOOL).add(BlockList.TIN_SLATE_ORE.get());
        tag(net.minecraft.tags.BlockTags.NEEDS_DIAMOND_TOOL).add(BlockList.URANIUM_SLATE_ORE.get());
        tag(net.minecraft.tags.BlockTags.NEEDS_STONE_TOOL).add(BlockList.ZINC_SLATE_ORE.get());

        tag(net.minecraft.tags.BlockTags.NEEDS_STONE_TOOL).add(BlockList.ALUMINUM_NETHER_ORE.get());
        tag(net.minecraft.tags.BlockTags.NEEDS_IRON_TOOL).add(BlockList.LEAD_NETHER_ORE.get());
        tag(net.minecraft.tags.BlockTags.NEEDS_IRON_TOOL).add(BlockList.OSMIUM_NETHER_ORE.get());
        tag(net.minecraft.tags.BlockTags.NEEDS_STONE_TOOL).add(BlockList.NICKEL_NETHER_ORE.get());
        tag(net.minecraft.tags.BlockTags.NEEDS_DIAMOND_TOOL).add(BlockList.PLATINUM_NETHER_ORE.get());
        tag(net.minecraft.tags.BlockTags.NEEDS_DIAMOND_TOOL).add(BlockList.IRIDIUM_NETHER_ORE.get());
        tag(net.minecraft.tags.BlockTags.NEEDS_IRON_TOOL).add(BlockList.SILVER_NETHER_ORE.get());
        tag(net.minecraft.tags.BlockTags.NEEDS_STONE_TOOL).add(BlockList.TIN_NETHER_ORE.get());
        tag(net.minecraft.tags.BlockTags.NEEDS_DIAMOND_TOOL).add(BlockList.URANIUM_NETHER_ORE.get());
        tag(net.minecraft.tags.BlockTags.NEEDS_STONE_TOOL).add(BlockList.ZINC_NETHER_ORE.get());

        tag(net.minecraft.tags.BlockTags.NEEDS_STONE_TOOL).add(BlockList.ALUMINUM_END_ORE.get());
        tag(net.minecraft.tags.BlockTags.NEEDS_IRON_TOOL).add(BlockList.LEAD_END_ORE.get());
        tag(net.minecraft.tags.BlockTags.NEEDS_IRON_TOOL).add(BlockList.OSMIUM_END_ORE.get());
        tag(net.minecraft.tags.BlockTags.NEEDS_STONE_TOOL).add(BlockList.NICKEL_END_ORE.get());
        tag(net.minecraft.tags.BlockTags.NEEDS_DIAMOND_TOOL).add(BlockList.PLATINUM_END_ORE.get());
        tag(net.minecraft.tags.BlockTags.NEEDS_DIAMOND_TOOL).add(BlockList.IRIDIUM_END_ORE.get());
        tag(net.minecraft.tags.BlockTags.NEEDS_IRON_TOOL).add(BlockList.SILVER_END_ORE.get());
        tag(net.minecraft.tags.BlockTags.NEEDS_STONE_TOOL).add(BlockList.TIN_END_ORE.get());
        tag(net.minecraft.tags.BlockTags.NEEDS_DIAMOND_TOOL).add(BlockList.URANIUM_END_ORE.get());
        tag(net.minecraft.tags.BlockTags.NEEDS_STONE_TOOL).add(BlockList.ZINC_END_ORE.get());

        tag(net.minecraft.tags.BlockTags.NEEDS_STONE_TOOL).add(BlockList.OTHER_ALUMINUM_ORE.get());
        tag(net.minecraft.tags.BlockTags.NEEDS_IRON_TOOL).add(BlockList.OTHER_LEAD_ORE.get());
        tag(net.minecraft.tags.BlockTags.NEEDS_IRON_TOOL).add(BlockList.OTHER_OSMIUM_ORE.get());
        tag(net.minecraft.tags.BlockTags.NEEDS_STONE_TOOL).add(BlockList.OTHER_NICKEL_ORE.get());
        tag(net.minecraft.tags.BlockTags.NEEDS_DIAMOND_TOOL).add(BlockList.OTHER_PLATINUM_ORE.get());
        tag(net.minecraft.tags.BlockTags.NEEDS_DIAMOND_TOOL).add(BlockList.OTHER_IRIDIUM_ORE.get());
        tag(net.minecraft.tags.BlockTags.NEEDS_IRON_TOOL).add(BlockList.OTHER_SILVER_ORE.get());
        tag(net.minecraft.tags.BlockTags.NEEDS_STONE_TOOL).add(BlockList.OTHER_TIN_ORE.get());
        tag(net.minecraft.tags.BlockTags.NEEDS_DIAMOND_TOOL).add(BlockList.OTHER_URANIUM_ORE.get());
        tag(net.minecraft.tags.BlockTags.NEEDS_STONE_TOOL).add(BlockList.OTHER_ZINC_ORE.get());

        tag(net.minecraft.tags.BlockTags.MINEABLE_WITH_PICKAXE).add(BlockList.RAW_ALUMINUM_BLOCK.get());
        tag(net.minecraft.tags.BlockTags.MINEABLE_WITH_PICKAXE).add(BlockList.RAW_LEAD_BLOCK.get());
        tag(net.minecraft.tags.BlockTags.MINEABLE_WITH_PICKAXE).add(BlockList.RAW_OSMIUM_BLOCK.get());
        tag(net.minecraft.tags.BlockTags.MINEABLE_WITH_PICKAXE).add(BlockList.RAW_NICKEL_BLOCK.get());
        tag(net.minecraft.tags.BlockTags.MINEABLE_WITH_PICKAXE).add(BlockList.RAW_PLATINUM_BLOCK.get());
        tag(net.minecraft.tags.BlockTags.MINEABLE_WITH_PICKAXE).add(BlockList.RAW_IRIDIUM_BLOCK.get());
        tag(net.minecraft.tags.BlockTags.MINEABLE_WITH_PICKAXE).add(BlockList.RAW_SILVER_BLOCK.get());
        tag(net.minecraft.tags.BlockTags.MINEABLE_WITH_PICKAXE).add(BlockList.RAW_TIN_BLOCK.get());
        tag(net.minecraft.tags.BlockTags.MINEABLE_WITH_PICKAXE).add(BlockList.RAW_URANIUM_BLOCK.get());
        tag(net.minecraft.tags.BlockTags.MINEABLE_WITH_PICKAXE).add(BlockList.RAW_ZINC_BLOCK.get());

        tag(net.minecraft.tags.BlockTags.NEEDS_STONE_TOOL).add(BlockList.RAW_ALUMINUM_BLOCK.get());
        tag(net.minecraft.tags.BlockTags.NEEDS_IRON_TOOL).add(BlockList.RAW_LEAD_BLOCK.get());
        tag(net.minecraft.tags.BlockTags.NEEDS_IRON_TOOL).add(BlockList.RAW_OSMIUM_BLOCK.get());
        tag(net.minecraft.tags.BlockTags.NEEDS_STONE_TOOL).add(BlockList.RAW_NICKEL_BLOCK.get());
        tag(net.minecraft.tags.BlockTags.NEEDS_DIAMOND_TOOL).add(BlockList.RAW_PLATINUM_BLOCK.get());
        tag(net.minecraft.tags.BlockTags.NEEDS_DIAMOND_TOOL).add(BlockList.RAW_IRIDIUM_BLOCK.get());
        tag(net.minecraft.tags.BlockTags.NEEDS_IRON_TOOL).add(BlockList.RAW_SILVER_BLOCK.get());
        tag(net.minecraft.tags.BlockTags.NEEDS_STONE_TOOL).add(BlockList.RAW_TIN_BLOCK.get());
        tag(net.minecraft.tags.BlockTags.NEEDS_DIAMOND_TOOL).add(BlockList.RAW_URANIUM_BLOCK.get());
        tag(net.minecraft.tags.BlockTags.NEEDS_STONE_TOOL).add(BlockList.RAW_ZINC_BLOCK.get());

        tag(net.minecraft.tags.BlockTags.COAL_ORES).add(BlockList.OTHER_COAL_ORE.get());
        tag(net.minecraft.tags.BlockTags.COPPER_ORES).add(BlockList.OTHER_COPPER_ORE.get());
        tag(net.minecraft.tags.BlockTags.DIAMOND_ORES).add(BlockList.OTHER_DIAMOND_ORE.get());
        tag(net.minecraft.tags.BlockTags.EMERALD_ORES).add(BlockList.OTHER_EMERALD_ORE.get());
        tag(net.minecraft.tags.BlockTags.GOLD_ORES).add(BlockList.OTHER_GOLD_ORE.get());
        tag(net.minecraft.tags.BlockTags.IRON_ORES).add(BlockList.OTHER_IRON_ORE.get());
        tag(net.minecraft.tags.BlockTags.LAPIS_ORES).add(BlockList.OTHER_LAPIS_ORE.get());
        tag(ItemTagRegistry.QUARTZ_ORE).add(BlockList.OTHER_QUARTZ_ORE.get());
        tag(net.minecraft.tags.BlockTags.REDSTONE_ORES).add(BlockList.OTHER_REDSTONE_ORE.get());

        tag(net.minecraft.tags.BlockTags.MINEABLE_WITH_PICKAXE).add(BlockList.OTHER_COAL_ORE.get());
        tag(net.minecraft.tags.BlockTags.MINEABLE_WITH_PICKAXE).add(BlockList.OTHER_COPPER_ORE.get());
        tag(net.minecraft.tags.BlockTags.MINEABLE_WITH_PICKAXE).add(BlockList.OTHER_DIAMOND_ORE.get());
        tag(net.minecraft.tags.BlockTags.MINEABLE_WITH_PICKAXE).add(BlockList.OTHER_EMERALD_ORE.get());
        tag(net.minecraft.tags.BlockTags.MINEABLE_WITH_PICKAXE).add(BlockList.OTHER_GOLD_ORE.get());
        tag(net.minecraft.tags.BlockTags.MINEABLE_WITH_PICKAXE).add(BlockList.OTHER_IRON_ORE.get());
        tag(net.minecraft.tags.BlockTags.MINEABLE_WITH_PICKAXE).add(BlockList.OTHER_LAPIS_ORE.get());
        tag(net.minecraft.tags.BlockTags.MINEABLE_WITH_PICKAXE).add(BlockList.OTHER_QUARTZ_ORE.get());
        tag(net.minecraft.tags.BlockTags.MINEABLE_WITH_PICKAXE).add(BlockList.OTHER_REDSTONE_ORE.get());

        tag(ItemTagRegistry.IN_ANCIENT_STONE).add(BlockList.OTHER_COAL_ORE.get());
        tag(ItemTagRegistry.IN_ANCIENT_STONE).add(BlockList.OTHER_COPPER_ORE.get());
        tag(ItemTagRegistry.IN_ANCIENT_STONE).add(BlockList.OTHER_DIAMOND_ORE.get());
        tag(ItemTagRegistry.IN_ANCIENT_STONE).add(BlockList.OTHER_EMERALD_ORE.get());
        tag(ItemTagRegistry.IN_ANCIENT_STONE).add(BlockList.OTHER_GOLD_ORE.get());
        tag(ItemTagRegistry.IN_ANCIENT_STONE).add(BlockList.OTHER_IRON_ORE.get());
        tag(ItemTagRegistry.IN_ANCIENT_STONE).add(BlockList.OTHER_LAPIS_ORE.get());
        tag(ItemTagRegistry.IN_ANCIENT_STONE).add(BlockList.OTHER_QUARTZ_ORE.get());
        tag(ItemTagRegistry.IN_ANCIENT_STONE).add(BlockList.OTHER_REDSTONE_ORE.get());

        tag(net.minecraft.tags.BlockTags.NEEDS_STONE_TOOL).add(BlockList.OTHER_COAL_ORE.get());
        tag(net.minecraft.tags.BlockTags.NEEDS_STONE_TOOL).add(BlockList.OTHER_COPPER_ORE.get());
        tag(net.minecraft.tags.BlockTags.NEEDS_IRON_TOOL).add(BlockList.OTHER_DIAMOND_ORE.get());
        tag(net.minecraft.tags.BlockTags.NEEDS_IRON_TOOL).add(BlockList.OTHER_EMERALD_ORE.get());
        tag(net.minecraft.tags.BlockTags.NEEDS_STONE_TOOL).add(BlockList.OTHER_GOLD_ORE.get());
        tag(net.minecraft.tags.BlockTags.NEEDS_STONE_TOOL).add(BlockList.OTHER_IRON_ORE.get());
        tag(net.minecraft.tags.BlockTags.NEEDS_IRON_TOOL).add(BlockList.OTHER_LAPIS_ORE.get());
        tag(net.minecraft.tags.BlockTags.NEEDS_IRON_TOOL).add(BlockList.OTHER_QUARTZ_ORE.get());
        tag(net.minecraft.tags.BlockTags.NEEDS_IRON_TOOL).add(BlockList.OTHER_REDSTONE_ORE.get());
    }
}

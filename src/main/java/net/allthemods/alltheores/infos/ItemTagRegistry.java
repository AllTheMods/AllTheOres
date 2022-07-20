package net.allthemods.alltheores.infos;


import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags;

public class ItemTagRegistry {
    private ItemTagRegistry() {
    }

    //ATM Compat
    public static final TagKey<Block> ANCIENT_STONE = BlockTags.create(Reference.location("allthemodium:ancient_stone"));
    //

    public static final TagKey<Item> ORE_HAMMERS = ItemTags.create(Reference.ato("ore_hammers"));
    public static final TagKey<Item> INGOTS = ItemTags.create(Reference.forge("ingots"));
    public static final TagKey<Item> NUGGETS = ItemTags.create(Reference.forge("nuggets"));
    public static final TagKey<Item> STORAGE_BLOCKS = ItemTags.create(Reference.forge("storage_blocks"));
    public static final TagKey<Item> DUSTS = ItemTags.create(Reference.forge("dusts"));
    public static final TagKey<Item> GEARS = ItemTags.create(Reference.forge("gears"));
    public static final TagKey<Item> PLATES = ItemTags.create(Reference.forge("plates"));
    public static final TagKey<Item> RODS = ItemTags.create(Reference.forge("rods"));
    public static final TagKey<Item> RODS_METAL = ItemTags.create(Reference.forge("rods/metal"));

    public static final TagKey<Item> ORES = ItemTags.create(Reference.forge("ores"));
    public static final TagKey<Item> GEMS = ItemTags.create(Reference.forge("gems"));

    public static final TagKey<Item> LEAD_INGOT = ItemTags.create(Reference.ingot("lead"));
    public static final TagKey<Item> IRIDIUM_INGOT = ItemTags.create(Reference.ingot("iridium"));
    public static final TagKey<Item> COPPER_INGOT = ItemTags.create(Reference.ingot("copper"));
    public static final TagKey<Item> SILVER_INGOT = ItemTags.create(Reference.ingot("silver"));
    public static final TagKey<Item> PLATINUM_INGOT = ItemTags.create(Reference.ingot("platinum"));
    public static final TagKey<Item> ALUMINUM_INGOT = ItemTags.create(Reference.ingot("aluminum"));
    public static final TagKey<Item> NICKEL_INGOT = ItemTags.create(Reference.ingot("nickel"));
    public static final TagKey<Item> URANIUM_INGOT = ItemTags.create(Reference.ingot("uranium"));
    public static final TagKey<Item> OSMIUM_INGOT = ItemTags.create(Reference.ingot("osmium"));
    public static final TagKey<Item> ZINC_INGOT = ItemTags.create(Reference.ingot("zinc"));
    public static final TagKey<Item> TIN_INGOT = ItemTags.create(Reference.ingot("tin"));
    public static final TagKey<Item> BRONZE_INGOT = ItemTags.create(Reference.ingot("bronze"));
    public static final TagKey<Item> CONSTANTAN_INGOT = ItemTags.create(Reference.ingot("constantan"));
    public static final TagKey<Item> ELECTRUM_INGOT = ItemTags.create(Reference.ingot("electrum"));
    public static final TagKey<Item> ENDERIUM_INGOT = ItemTags.create(Reference.ingot("enderium"));
    public static final TagKey<Item> INVAR_INGOT = ItemTags.create(Reference.ingot("invar"));
    public static final TagKey<Item> LUMIUM_INGOT = ItemTags.create(Reference.ingot("lumium"));
    public static final TagKey<Item> SIGNALUM_INGOT = ItemTags.create(Reference.ingot("signalum"));
    public static final TagKey<Item> STEEL_INGOT = ItemTags.create(Reference.ingot("steel"));
    public static final TagKey<Item> BRASS_INGOT = ItemTags.create(Reference.ingot("brass"));

    public static final TagKey<Item> LEAD_NUGGET = ItemTags.create(Reference.nugget("lead"));
    public static final TagKey<Item> IRIDIUM_NUGGET = ItemTags.create(Reference.nugget("iridium"));
    public static final TagKey<Item> COPPER_NUGGET = ItemTags.create(Reference.nugget("copper"));
    public static final TagKey<Item> SILVER_NUGGET = ItemTags.create(Reference.nugget("silver"));
    public static final TagKey<Item> PLATINUM_NUGGET = ItemTags.create(Reference.nugget("platinum"));
    public static final TagKey<Item> ALUMINUM_NUGGET = ItemTags.create(Reference.nugget("aluminum"));
    public static final TagKey<Item> NICKEL_NUGGET = ItemTags.create(Reference.nugget("nickel"));
    public static final TagKey<Item> URANIUM_NUGGET = ItemTags.create(Reference.nugget("uranium"));
    public static final TagKey<Item> OSMIUM_NUGGET = ItemTags.create(Reference.nugget("osmium"));
    public static final TagKey<Item> ZINC_NUGGET = ItemTags.create(Reference.nugget("zinc"));
    public static final TagKey<Item> TIN_NUGGET = ItemTags.create(Reference.nugget("tin"));
    public static final TagKey<Item> BRONZE_NUGGET = ItemTags.create(Reference.nugget("bronze"));
    public static final TagKey<Item> CONSTANTAN_NUGGET = ItemTags.create(Reference.nugget("constantan"));
    public static final TagKey<Item> ELECTRUM_NUGGET = ItemTags.create(Reference.nugget("electrum"));
    public static final TagKey<Item> ENDERIUM_NUGGET = ItemTags.create(Reference.nugget("enderium"));
    public static final TagKey<Item> INVAR_NUGGET = ItemTags.create(Reference.nugget("invar"));
    public static final TagKey<Item> LUMIUM_NUGGET = ItemTags.create(Reference.nugget("lumium"));
    public static final TagKey<Item> SIGNALUM_NUGGET = ItemTags.create(Reference.nugget("signalum"));
    public static final TagKey<Item> STEEL_NUGGET = ItemTags.create(Reference.nugget("steel"));
    public static final TagKey<Item> BRASS_NUGGET = ItemTags.create(Reference.nugget("brass"));

    public static final TagKey<Block> LEAD_BLOCK = BlockTags.create(Reference.block("lead"));
    public static final TagKey<Block> IRIDIUM_BLOCK = BlockTags.create(Reference.block("iridium"));
    public static final TagKey<Block> COPPER_BLOCK = BlockTags.create(Reference.block("copper"));
    public static final TagKey<Block> SILVER_BLOCK = BlockTags.create(Reference.block("silver"));
    public static final TagKey<Block> PLATINUM_BLOCK = BlockTags.create(Reference.block("platinum"));
    public static final TagKey<Block> ALUMINUM_BLOCK = BlockTags.create(Reference.block("aluminum"));
    public static final TagKey<Block> NICKEL_BLOCK = BlockTags.create(Reference.block("nickel"));
    public static final TagKey<Block> URANIUM_BLOCK = BlockTags.create(Reference.block("uranium"));
    public static final TagKey<Block> OSMIUM_BLOCK = BlockTags.create(Reference.block("osmium"));
    public static final TagKey<Block> ZINC_BLOCK = BlockTags.create(Reference.block("zinc"));
    public static final TagKey<Block> TIN_BLOCK = BlockTags.create(Reference.block("tin"));
    public static final TagKey<Block> BRONZE_BLOCK = BlockTags.create(Reference.block("bronze"));
    public static final TagKey<Block> CONSTANTAN_BLOCK = BlockTags.create(Reference.block("constantan"));
    public static final TagKey<Block> ELECTRUM_BLOCK = BlockTags.create(Reference.block("electrum"));
    public static final TagKey<Block> ENDERIUM_BLOCK = BlockTags.create(Reference.block("enderium"));
    public static final TagKey<Block> INVAR_BLOCK = BlockTags.create(Reference.block("invar"));
    public static final TagKey<Block> LUMIUM_BLOCK = BlockTags.create(Reference.block("lumium"));
    public static final TagKey<Block> SIGNALUM_BLOCK = BlockTags.create(Reference.block("signalum"));
    public static final TagKey<Block> STEEL_BLOCK = BlockTags.create(Reference.block("steel"));
    public static final TagKey<Block> BRASS_BLOCK = BlockTags.create(Reference.block("brass"));
    public static final TagKey<Block> PERIDOT_BLOCK = BlockTags.create(Reference.block("peridot"));
    public static final TagKey<Block> RUBY_BLOCK = BlockTags.create(Reference.block("ruby"));
    public static final TagKey<Block> SAPPHIRE_BLOCK = BlockTags.create(Reference.block("sapphire"));


    public static final TagKey<Block> RAW_IRIDIUM_BLOCK = BlockTags.create(Reference.block("raw_iridium"));
    public static final TagKey<Block> RAW_LEAD_BLOCK = BlockTags.create(Reference.block("raw_lead"));
    public static final TagKey<Block> RAW_SILVER_BLOCK = BlockTags.create(Reference.block("raw_silver"));
    public static final TagKey<Block> RAW_PLATINUM_BLOCK = BlockTags.create(Reference.block("raw_platinum"));
    public static final TagKey<Block> RAW_ALUMINUM_BLOCK = BlockTags.create(Reference.block("raw_aluminum"));
    public static final TagKey<Block> RAW_NICKEL_BLOCK = BlockTags.create(Reference.block("raw_nickel"));
    public static final TagKey<Block> RAW_URANIUM_BLOCK = BlockTags.create(Reference.block("raw_uranium"));
    public static final TagKey<Block> RAW_OSMIUM_BLOCK = BlockTags.create(Reference.block("raw_osmium"));
    public static final TagKey<Block> RAW_ZINC_BLOCK = BlockTags.create(Reference.block("raw_zinc"));
    public static final TagKey<Block> RAW_TIN_BLOCK = BlockTags.create(Reference.block("raw_tin"));

    public static final TagKey<Item> RAW_IRIDIUM_BLOCK_ITEM = ItemTags.create(Reference.block("raw_iridium"));
    public static final TagKey<Item> RAW_LEAD_BLOCK_ITEM = ItemTags.create(Reference.block("raw_lead"));
    public static final TagKey<Item> RAW_SILVER_BLOCK_ITEM = ItemTags.create(Reference.block("raw_silver"));
    public static final TagKey<Item> RAW_PLATINUM_BLOCK_ITEM = ItemTags.create(Reference.block("raw_platinum"));
    public static final TagKey<Item> RAW_ALUMINUM_BLOCK_ITEM = ItemTags.create(Reference.block("raw_aluminum"));
    public static final TagKey<Item> RAW_NICKEL_BLOCK_ITEM = ItemTags.create(Reference.block("raw_nickel"));
    public static final TagKey<Item> RAW_URANIUM_BLOCK_ITEM = ItemTags.create(Reference.block("raw_uranium"));
    public static final TagKey<Item> RAW_OSMIUM_BLOCK_ITEM = ItemTags.create(Reference.block("raw_osmium"));
    public static final TagKey<Item> RAW_ZINC_BLOCK_ITEM = ItemTags.create(Reference.block("raw_zinc"));
    public static final TagKey<Item> RAW_TIN_BLOCK_ITEM = ItemTags.create(Reference.block("raw_tin"));

    public static final TagKey<Item> IRIDIUM_BLOCK_ITEM = ItemTags.create(Reference.block("iridium"));
    public static final TagKey<Item> LEAD_BLOCK_ITEM = ItemTags.create(Reference.block("lead"));
    public static final TagKey<Item> COPPER_BLOCK_ITEM = ItemTags.create(Reference.block("copper"));
    public static final TagKey<Item> SILVER_BLOCK_ITEM = ItemTags.create(Reference.block("silver"));
    public static final TagKey<Item> PLATINUM_BLOCK_ITEM = ItemTags.create(Reference.block("platinum"));
    public static final TagKey<Item> ALUMINUM_BLOCK_ITEM = ItemTags.create(Reference.block("aluminum"));
    public static final TagKey<Item> NICKEL_BLOCK_ITEM = ItemTags.create(Reference.block("nickel"));
    public static final TagKey<Item> URANIUM_BLOCK_ITEM = ItemTags.create(Reference.block("uranium"));
    public static final TagKey<Item> OSMIUM_BLOCK_ITEM = ItemTags.create(Reference.block("osmium"));
    public static final TagKey<Item> ZINC_BLOCK_ITEM = ItemTags.create(Reference.block("zinc"));
    public static final TagKey<Item> TIN_BLOCK_ITEM = ItemTags.create(Reference.block("tin"));
    public static final TagKey<Item> BRONZE_BLOCK_ITEM = ItemTags.create(Reference.block("bronze"));
    public static final TagKey<Item> CONSTANTAN_BLOCK_ITEM = ItemTags.create(Reference.block("constantan"));
    public static final TagKey<Item> ELECTRUM_BLOCK_ITEM = ItemTags.create(Reference.block("electrum"));
    public static final TagKey<Item> ENDERIUM_BLOCK_ITEM = ItemTags.create(Reference.block("enderium"));
    public static final TagKey<Item> INVAR_BLOCK_ITEM = ItemTags.create(Reference.block("invar"));
    public static final TagKey<Item> LUMIUM_BLOCK_ITEM = ItemTags.create(Reference.block("lumium"));
    public static final TagKey<Item> SIGNALUM_BLOCK_ITEM = ItemTags.create(Reference.block("signalum"));
    public static final TagKey<Item> STEEL_BLOCK_ITEM = ItemTags.create(Reference.block("steel"));
    public static final TagKey<Item> BRASS_BLOCK_ITEM = ItemTags.create(Reference.block("brass"));
    public static final TagKey<Item> PERIDOT_BLOCK_ITEM = ItemTags.create(Reference.block("peridot"));
    public static final TagKey<Item> RUBY_BLOCK_ITEM = ItemTags.create(Reference.block("ruby"));
    public static final TagKey<Item> SAPPHIRE_BLOCK_ITEM = ItemTags.create(Reference.block("sapphire"));

    // RODS

    public static final TagKey<Item> ALUMINUM_ROD = forge("rods/aluminum");
    public static final TagKey<Item> COPPER_ROD = forge("rods/copper");
    public static final TagKey<Item> IRIDIUM_ROD = forge("rods/iridium");
    public static final TagKey<Item> LEAD_ROD = forge("rods/lead");
    public static final TagKey<Item> NICKEL_ROD = forge("rods/nickel");
    public static final TagKey<Item> OSMIUM_ROD = forge("rods/osmium");
    public static final TagKey<Item> PLATINUM_ROD = forge("rods/platinum");
    public static final TagKey<Item> SILVER_ROD = forge("rods/silver");
    public static final TagKey<Item> TIN_ROD = forge("rods/tin");
    public static final TagKey<Item> URANIUM_ROD = forge("rods/uranium");
    public static final TagKey<Item> ZINC_ROD = forge("rods/zinc");
    public static final TagKey<Item> BRONZE_ROD = forge("rods/bronze");
    public static final TagKey<Item> CONSTANTAN_ROD = forge("rods/constantan");
    public static final TagKey<Item> ELECTRUM_ROD = forge("rods/electrum");
    public static final TagKey<Item> ENDERIUM_ROD = forge("rods/enderium");
    public static final TagKey<Item> INVAR_ROD = forge("rods/invar");
    public static final TagKey<Item> LUMIUM_ROD = forge("rods/lumium");
    public static final TagKey<Item> SIGNALUM_ROD = forge("rods/signalum");
    public static final TagKey<Item> STEEL_ROD = forge("rods/steel");
    public static final TagKey<Item> IRON_ROD = forge("rods/iron");
    public static final TagKey<Item> GOLD_ROD = forge("rods/gold");
    public static final TagKey<Item> DIAMOND_ROD = forge("rods/diamond");
    public static final TagKey<Item> BRASS_ROD = forge("rods/brass");
    // GEARS

    public static final TagKey<Item> ALUMINUM_GEAR = forge("gears/aluminum");
    public static final TagKey<Item> COPPER_GEAR = forge("gears/copper");
    public static final TagKey<Item> IRIDIUM_GEAR = forge("gears/iridium");
    public static final TagKey<Item> LEAD_GEAR = forge("gears/lead");
    public static final TagKey<Item> NICKEL_GEAR = forge("gears/nickel");
    public static final TagKey<Item> OSMIUM_GEAR = forge("gears/osmium");
    public static final TagKey<Item> PLATINUM_GEAR = forge("gears/platinum");
    public static final TagKey<Item> SILVER_GEAR = forge("gears/silver");
    public static final TagKey<Item> TIN_GEAR = forge("gears/tin");
    public static final TagKey<Item> URANIUM_GEAR = forge("gears/uranium");
    public static final TagKey<Item> ZINC_GEAR = forge("gears/zinc");
    public static final TagKey<Item> BRONZE_GEAR = forge("gears/bronze");
    public static final TagKey<Item> CONSTANTAN_GEAR = forge("gears/constantan");
    public static final TagKey<Item> ELECTRUM_GEAR = forge("gears/electrum");
    public static final TagKey<Item> ENDERIUM_GEAR = forge("gears/enderium");
    public static final TagKey<Item> INVAR_GEAR = forge("gears/invar");
    public static final TagKey<Item> LUMIUM_GEAR = forge("gears/lumium");
    public static final TagKey<Item> SIGNALUM_GEAR = forge("gears/signalum");
    public static final TagKey<Item> STEEL_GEAR = forge("gears/steel");
    public static final TagKey<Item> IRON_GEAR = forge("gears/iron");
    public static final TagKey<Item> GOLD_GEAR = forge("gears/gold");
    public static final TagKey<Item> DIAMOND_GEAR = forge("gears/diamond");
    public static final TagKey<Item> BRASS_GEAR = forge("gears/brass");
    // PLATES

    public static final TagKey<Item> ALUMINUM_PLATE = forge("plates/aluminum");
    public static final TagKey<Item> COPPER_PLATE = forge("plates/copper");
    public static final TagKey<Item> IRIDIUM_PLATE = forge("plates/iridium");
    public static final TagKey<Item> LEAD_PLATE = forge("plates/lead");
    public static final TagKey<Item> NICKEL_PLATE = forge("plates/nickel");
    public static final TagKey<Item> OSMIUM_PLATE = forge("plates/osmium");
    public static final TagKey<Item> PLATINUM_PLATE = forge("plates/platinum");
    public static final TagKey<Item> SILVER_PLATE = forge("plates/silver");
    public static final TagKey<Item> TIN_PLATE = forge("plates/tin");
    public static final TagKey<Item> URANIUM_PLATE = forge("plates/uranium");
    public static final TagKey<Item> ZINC_PLATE = forge("plates/zinc");
    public static final TagKey<Item> BRONZE_PLATE = forge("plates/bronze");
    public static final TagKey<Item> CONSTANTAN_PLATE = forge("plates/constantan");
    public static final TagKey<Item> ELECTRUM_PLATE = forge("plates/electrum");
    public static final TagKey<Item> ENDERIUM_PLATE = forge("plates/enderium");
    public static final TagKey<Item> INVAR_PLATE = forge("plates/invar");
    public static final TagKey<Item> LUMIUM_PLATE = forge("plates/lumium");
    public static final TagKey<Item> SIGNALUM_PLATE = forge("plates/signalum");
    public static final TagKey<Item> STEEL_PLATE = forge("plates/steel");
    public static final TagKey<Item> IRON_PLATE = forge("plates/iron");
    public static final TagKey<Item> GOLD_PLATE = forge("plates/gold");
    public static final TagKey<Item> DIAMOND_PLATE = forge("plates/diamond");
    public static final TagKey<Item> BRASS_PLATE = forge("plates/brass");
    // DUST
    public static final TagKey<Item> PLATINUM_DUST = forge("dusts/platinum");
    public static final TagKey<Item> IRIDIUM_DUST = forge("dusts/iridium");
    public static final TagKey<Item> COPPER_DUST = forge("dusts/copper");
    public static final TagKey<Item> ALUMINUM_DUST = forge("dusts/aluminum");
    public static final TagKey<Item> URANIUM_DUST = forge("dusts/uranium");
    public static final TagKey<Item> NICKEL_DUST = forge("dusts/nickel");
    public static final TagKey<Item> SILVER_DUST = forge("dusts/silver");
    public static final TagKey<Item> OSMIUM_DUST = forge("dusts/osmium");
    public static final TagKey<Item> ZINC_DUST = forge("dusts/zinc");
    public static final TagKey<Item> LEAD_DUST = forge("dusts/lead");
    public static final TagKey<Item> TIN_DUST = forge("dusts/tin");
    public static final TagKey<Item> BRONZE_DUST = forge("dusts/bronze");
    public static final TagKey<Item> CONSTANTAN_DUST = forge("dusts/constantan");
    public static final TagKey<Item> ELECTRUM_DUST = forge("dusts/electrum");
    public static final TagKey<Item> ENDERIUM_DUST = forge("dusts/enderium");
    public static final TagKey<Item> INVAR_DUST = forge("dusts/invar");
    public static final TagKey<Item> LUMIUM_DUST = forge("dusts/lumium");
    public static final TagKey<Item> SIGNALUM_DUST = forge("dusts/signalum");
    public static final TagKey<Item> STEEL_DUST = forge("dusts/steel");
    public static final TagKey<Item> IRON_DUST = forge("dusts/iron");
    public static final TagKey<Item> GOLD_DUST = forge("dusts/gold");
    public static final TagKey<Item> DIAMOND_DUST = forge("dusts/diamond");
    public static final TagKey<Item> BRASS_DUST = forge("dusts/brass");
    public static final TagKey<Item> RUBY_DUST = forge("dusts/ruby");
    public static final TagKey<Item> SAPPHIRE_DUST = forge("dusts/sapphire");
    public static final TagKey<Item> PERIDOT_DUST = forge("dusts/peridot");
    //ORE


    public static final TagKey<Block> LEAD_ORE = BlockTags.create(Reference.ore("lead"));
    public static final TagKey<Block> IRIDIUM_ORE = BlockTags.create(Reference.ore("iridium"));
    public static final TagKey<Block> SILVER_ORE = BlockTags.create(Reference.ore("silver"));
    public static final TagKey<Block> PLATINUM_ORE = BlockTags.create(Reference.ore("platinum"));
    public static final TagKey<Block> ALUMINUM_ORE = BlockTags.create(Reference.ore("aluminum"));
    public static final TagKey<Block> NICKEL_ORE = BlockTags.create(Reference.ore("nickel"));
    public static final TagKey<Block> URANIUM_ORE = BlockTags.create(Reference.ore("uranium"));
    public static final TagKey<Block> OSMIUM_ORE = BlockTags.create(Reference.ore("osmium"));
    public static final TagKey<Block> ZINC_ORE = BlockTags.create(Reference.ore("zinc"));
    public static final TagKey<Block> TIN_ORE = BlockTags.create(Reference.ore("tin"));
    public static final TagKey<Block> PERIDOT_ORE = BlockTags.create(Reference.ore("peridot"));
    public static final TagKey<Block> RUBY_ORE = BlockTags.create(Reference.ore("ruby"));
    public static final TagKey<Block> SAPPHIRE_ORE = BlockTags.create(Reference.ore("sapphire"));
    public static final TagKey<Block> QUARTZ_ORE = BlockTags.create(Reference.ore("quartz"));

    public static final TagKey<Item> IRIDIUM_ORE_ITEM = ItemTags.create(Reference.ore("iridium"));
    public static final TagKey<Item> LEAD_ORE_ITEM = ItemTags.create(Reference.ore("lead"));
    public static final TagKey<Item> SILVER_ORE_ITEM = ItemTags.create(Reference.ore("silver"));
    public static final TagKey<Item> PLATINUM_ORE_ITEM = ItemTags.create(Reference.ore("platinum"));
    public static final TagKey<Item> ALUMINUM_ORE_ITEM = ItemTags.create(Reference.ore("aluminum"));
    public static final TagKey<Item> NICKEL_ORE_ITEM = ItemTags.create(Reference.ore("nickel"));
    public static final TagKey<Item> URANIUM_ORE_ITEM = ItemTags.create(Reference.ore("uranium"));
    public static final TagKey<Item> OSMIUM_ORE_ITEM = ItemTags.create(Reference.ore("osmium"));
    public static final TagKey<Item> ZINC_ORE_ITEM = ItemTags.create(Reference.ore("zinc"));
    public static final TagKey<Item> TIN_ORE_ITEM = ItemTags.create(Reference.ore("tin"));
    public static final TagKey<Item> PERIDOT_ORE_ITEM = ItemTags.create(Reference.ore("peridot"));
    public static final TagKey<Item> RUBY_ORE_ITEM = ItemTags.create(Reference.ore("ruby"));
    public static final TagKey<Item> SAPPHIRE_ORE_ITEM = ItemTags.create(Reference.ore("sapphire"));
    public static final TagKey<Item> COAL_ORE_ITEM = ItemTags.create(Reference.ore("coal"));
    public static final TagKey<Item> COPPER_ORE_ITEM = ItemTags.create(Reference.ore("copper"));
    public static final TagKey<Item> DIAMOND_ORE_ITEM = ItemTags.create(Reference.ore("diamond"));
    public static final TagKey<Item> EMERALD_ORE_ITEM = ItemTags.create(Reference.ore("emerald"));
    public static final TagKey<Item> GOLD_ORE_ITEM = ItemTags.create(Reference.ore("gold"));
    public static final TagKey<Item> IRON_ORE_ITEM = ItemTags.create(Reference.ore("iron"));
    public static final TagKey<Item> LAPIS_ORE_ITEM = ItemTags.create(Reference.ore("lapis"));
    public static final TagKey<Item> QUARTZ_ORE_ITEM = ItemTags.create(Reference.ore("quartz"));
    public static final TagKey<Item> REDSTONE_ORE_ITEM = ItemTags.create(Reference.ore("redstone"));

    // ORE BLOCK BASE
    public static final TagKey<Block> IN_STONE = BlockTags.create(Reference.ores_in_ground("stone"));
    public static final TagKey<Block> IN_DEEPSLATE = BlockTags.create(Reference.ores_in_ground("deepslate"));
    public static final TagKey<Block> IN_NETHERRACK = BlockTags.create(Reference.ores_in_ground("netherrack"));
    public static final TagKey<Block> IN_END_STONE = BlockTags.create(Reference.ores_in_ground("end_stone"));
    public static final TagKey<Block> IN_ANCIENT_STONE = BlockTags.create(Reference.ores_in_ground("ancient_stone"));

    public static final TagKey<Item> IN_STONE_ITEM = ItemTags.create(Reference.ores_in_ground("stone"));
    public static final TagKey<Item> IN_DEEPSLATE_ITEM = ItemTags.create(Reference.ores_in_ground("deepslate"));
    public static final TagKey<Item> IN_NETHERRACK_ITEM = ItemTags.create(Reference.ores_in_ground("netherrack"));
    public static final TagKey<Item> IN_END_STONE_ITEM = ItemTags.create(Reference.ores_in_ground("end_stone"));
    public static final TagKey<Item> IN_ANCIENT_STONE_ITEM = ItemTags.create(Reference.ores_in_ground("ancient_stone"));


    public static final TagKey<Item> RAW_IRIDIUM = ItemTags.create(Reference.raw_ores("iridium"));
    public static final TagKey<Item> RAW_LEAD = ItemTags.create(Reference.raw_ores("lead"));
    public static final TagKey<Item> RAW_SILVER = ItemTags.create(Reference.raw_ores("silver"));
    public static final TagKey<Item> RAW_PLATINUM = ItemTags.create(Reference.raw_ores("platinum"));
    public static final TagKey<Item> RAW_ALUMINUM = ItemTags.create(Reference.raw_ores("aluminum"));
    public static final TagKey<Item> RAW_NICKEL = ItemTags.create(Reference.raw_ores("nickel"));
    public static final TagKey<Item> RAW_URANIUM = ItemTags.create(Reference.raw_ores("uranium"));
    public static final TagKey<Item> RAW_OSMIUM = ItemTags.create(Reference.raw_ores("osmium"));
    public static final TagKey<Item> RAW_ZINC = ItemTags.create(Reference.raw_ores("zinc"));
    public static final TagKey<Item> RAW_TIN = ItemTags.create(Reference.raw_ores("tin"));
    public static final TagKey<Item> PERIDOT = ItemTags.create(Reference.gem("peridot"));
    public static final TagKey<Item> RUBY = ItemTags.create(Reference.gem("ruby"));
    public static final TagKey<Item> SAPPHIRE = ItemTags.create(Reference.gem("sapphire"));

    public static final TagKey<Item> RAW_IRIDIUM_MATERIAL = ItemTags.create(Reference.raw_materials("iridium"));
    public static final TagKey<Item> RAW_LEAD_MATERIAL = ItemTags.create(Reference.raw_materials("lead"));
    public static final TagKey<Item> RAW_SILVER_MATERIAL = ItemTags.create(Reference.raw_materials("silver"));
    public static final TagKey<Item> RAW_PLATINUM_MATERIAL = ItemTags.create(Reference.raw_materials("platinum"));
    public static final TagKey<Item> RAW_ALUMINUM_MATERIAL = ItemTags.create(Reference.raw_materials("aluminum"));
    public static final TagKey<Item> RAW_NICKEL_MATERIAL = ItemTags.create(Reference.raw_materials("nickel"));
    public static final TagKey<Item> RAW_URANIUM_MATERIAL = ItemTags.create(Reference.raw_materials("uranium"));
    public static final TagKey<Item> RAW_OSMIUM_MATERIAL = ItemTags.create(Reference.raw_materials("osmium"));
    public static final TagKey<Item> RAW_ZINC_MATERIAL = ItemTags.create(Reference.raw_materials("zinc"));
    public static final TagKey<Item> RAW_TIN_MATERIAL = ItemTags.create(Reference.raw_materials("tin"));

    //MEK COMPAT

    public static final TagKey<Item> CLUMPS_MEK = ItemTags.create(Reference.mek("clumps"));
    public static final TagKey<Item> CLUMPS_MEK_ALU = ItemTags.create(Reference.mek("clumps/aluminum"));
    public static final TagKey<Item> CLUMPS_MEK_NIC = ItemTags.create(Reference.mek("clumps/nickel"));
    public static final TagKey<Item> CLUMPS_MEK_PLA = ItemTags.create(Reference.mek("clumps/platinum"));
    public static final TagKey<Item> CLUMPS_MEK_SIL = ItemTags.create(Reference.mek("clumps/silver"));
    public static final TagKey<Item> CLUMPS_MEK_ZIN = ItemTags.create(Reference.mek("clumps/zinc"));

    public static final TagKey<Item> CRYSTAL_MEK = ItemTags.create(Reference.mek("crystals"));
    public static final TagKey<Item> CRYSTAL_MEK_ALU = ItemTags.create(Reference.mek("crystals/aluminum"));
    public static final TagKey<Item> CRYSTAL_MEK_NIC = ItemTags.create(Reference.mek("crystals/nickel"));
    public static final TagKey<Item> CRYSTAL_MEK_PLA = ItemTags.create(Reference.mek("crystals/platinum"));
    public static final TagKey<Item> CRYSTAL_MEK_SIL = ItemTags.create(Reference.mek("crystals/silver"));
    public static final TagKey<Item> CRYSTAL_MEK_ZIN = ItemTags.create(Reference.mek("crystals/zinc"));

    public static final TagKey<Item> DIRTY_MEK = ItemTags.create(Reference.mek("dirty_dusts"));
    public static final TagKey<Item> DIRTY_MEK_ALU = ItemTags.create(Reference.mek("dirty_dusts/aluminum"));
    public static final TagKey<Item> DIRTY_MEK_NIC = ItemTags.create(Reference.mek("dirty_dusts/nickel"));
    public static final TagKey<Item> DIRTY_MEK_PLA = ItemTags.create(Reference.mek("dirty_dusts/platinum"));
    public static final TagKey<Item> DIRTY_MEK_SIL = ItemTags.create(Reference.mek("dirty_dusts/silver"));
    public static final TagKey<Item> DIRTY_MEK_ZIN = ItemTags.create(Reference.mek("dirty_dusts/zinc"));

    public static final TagKey<Item> SHARD_MEK = ItemTags.create(Reference.mek("shards"));
    public static final TagKey<Item> SHARD_MEK_ALU = ItemTags.create(Reference.mek("shards/aluminum"));
    public static final TagKey<Item> SHARD_MEK_NIC = ItemTags.create(Reference.mek("shards/nickel"));
    public static final TagKey<Item> SHARD_MEK_PLA = ItemTags.create(Reference.mek("shards/platinum"));
    public static final TagKey<Item> SHARD_MEK_SIL = ItemTags.create(Reference.mek("shards/silver"));
    public static final TagKey<Item> SHARD_MEK_ZIN = ItemTags.create(Reference.mek("shards/zinc"));


    private static TagKey<Item> forge(String name)
    {
        return net.minecraft.tags.ItemTags.create(new ResourceLocation("forge", name));
    }
}
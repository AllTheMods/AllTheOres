package net.allthemods.alltheores.infos;


import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.Tag;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags;

public class ItemTagRegistry {
    private ItemTagRegistry() {
    }

    //ATM Compat
    public static final Tag.Named<Block> ANCIENT_STONE = BlockTags.createOptional(Reference.location("allthemodium:ancient_stone"));
    //
    public static final Tag.Named<Item> ORE_HAMMERS = ItemTags.createOptional(Reference.ato("ore_hammers"));
    public static final Tag.Named<Item> INGOTS = ItemTags.createOptional(Reference.forge("ingots"));
    public static final Tag.Named<Item> NUGGETS = ItemTags.createOptional(Reference.forge("nuggets"));
    public static final Tag.Named<Item> STORAGE_BLOCKS = ItemTags.createOptional(Reference.forge("storage_blocks"));
    public static final Tag.Named<Item> DUSTS = ItemTags.createOptional(Reference.forge("dusts"));
    public static final Tag.Named<Item> GEARS = ItemTags.createOptional(Reference.forge("gears"));
    public static final Tag.Named<Item> PLATES = ItemTags.createOptional(Reference.forge("plates"));
    public static final Tag.Named<Item> RODS = ItemTags.createOptional(Reference.forge("rods"));

    public static final Tag.Named<Item> ORES = ItemTags.createOptional(Reference.forge("ores"));

    public static final Tag.Named<Item> LEAD_INGOT = ItemTags.createOptional(Reference.ingot("lead"));
    public static final Tag.Named<Item> COPPER_INGOT = ItemTags.createOptional(Reference.ingot("copper"));
    public static final Tag.Named<Item> SILVER_INGOT = ItemTags.createOptional(Reference.ingot("silver"));
    public static final Tag.Named<Item> PLATINUM_INGOT = ItemTags.createOptional(Reference.ingot("platinum"));
    public static final Tag.Named<Item> ALUMINUM_INGOT = ItemTags.createOptional(Reference.ingot("aluminum"));
    public static final Tag.Named<Item> NICKEL_INGOT = ItemTags.createOptional(Reference.ingot("nickel"));
    public static final Tag.Named<Item> URANIUM_INGOT = ItemTags.createOptional(Reference.ingot("uranium"));
    public static final Tag.Named<Item> OSMIUM_INGOT = ItemTags.createOptional(Reference.ingot("osmium"));
    public static final Tag.Named<Item> ZINC_INGOT = ItemTags.createOptional(Reference.ingot("zinc"));
    public static final Tag.Named<Item> TIN_INGOT = ItemTags.createOptional(Reference.ingot("tin"));
    public static final Tag.Named<Item> BRONZE_INGOT = ItemTags.createOptional(Reference.ingot("bronze"));
    public static final Tag.Named<Item> CONSTANTAN_INGOT = ItemTags.createOptional(Reference.ingot("constantan"));
    public static final Tag.Named<Item> ELECTRUM_INGOT = ItemTags.createOptional(Reference.ingot("electrum"));
    public static final Tag.Named<Item> ENDERIUM_INGOT = ItemTags.createOptional(Reference.ingot("enderium"));
    public static final Tag.Named<Item> INVAR_INGOT = ItemTags.createOptional(Reference.ingot("invar"));
    public static final Tag.Named<Item> LUMIUM_INGOT = ItemTags.createOptional(Reference.ingot("lumium"));
    public static final Tag.Named<Item> SIGNALUM_INGOT = ItemTags.createOptional(Reference.ingot("signalum"));
    public static final Tag.Named<Item> STEEL_INGOT = ItemTags.createOptional(Reference.ingot("steel"));
    public static final Tag.Named<Item> BRASS_INGOT = ItemTags.createOptional(Reference.ingot("brass"));

    public static final Tag.Named<Item> LEAD_NUGGET = ItemTags.createOptional(Reference.nugget("lead"));
    public static final Tag.Named<Item> COPPER_NUGGET = ItemTags.createOptional(Reference.nugget("copper"));
    public static final Tag.Named<Item> SILVER_NUGGET = ItemTags.createOptional(Reference.nugget("silver"));
    public static final Tag.Named<Item> PLATINUM_NUGGET = ItemTags.createOptional(Reference.nugget("platinum"));
    public static final Tag.Named<Item> ALUMINUM_NUGGET = ItemTags.createOptional(Reference.nugget("aluminum"));
    public static final Tag.Named<Item> NICKEL_NUGGET = ItemTags.createOptional(Reference.nugget("nickel"));
    public static final Tag.Named<Item> URANIUM_NUGGET = ItemTags.createOptional(Reference.nugget("uranium"));
    public static final Tag.Named<Item> OSMIUM_NUGGET = ItemTags.createOptional(Reference.nugget("osmium"));
    public static final Tag.Named<Item> ZINC_NUGGET = ItemTags.createOptional(Reference.nugget("zinc"));
    public static final Tag.Named<Item> TIN_NUGGET = ItemTags.createOptional(Reference.nugget("tin"));
    public static final Tag.Named<Item> BRONZE_NUGGET = ItemTags.createOptional(Reference.nugget("bronze"));
    public static final Tag.Named<Item> CONSTANTAN_NUGGET = ItemTags.createOptional(Reference.nugget("constantan"));
    public static final Tag.Named<Item> ELECTRUM_NUGGET = ItemTags.createOptional(Reference.nugget("electrum"));
    public static final Tag.Named<Item> ENDERIUM_NUGGET = ItemTags.createOptional(Reference.nugget("enderium"));
    public static final Tag.Named<Item> INVAR_NUGGET = ItemTags.createOptional(Reference.nugget("invar"));
    public static final Tag.Named<Item> LUMIUM_NUGGET = ItemTags.createOptional(Reference.nugget("lumium"));
    public static final Tag.Named<Item> SIGNALUM_NUGGET = ItemTags.createOptional(Reference.nugget("signalum"));
    public static final Tag.Named<Item> STEEL_NUGGET = ItemTags.createOptional(Reference.nugget("steel"));
    public static final Tag.Named<Item> BRASS_NUGGET = ItemTags.createOptional(Reference.nugget("brass"));

    public static final Tag.Named<Block> LEAD_BLOCK = BlockTags.createOptional(Reference.block("lead"));
    public static final Tag.Named<Block> COPPER_BLOCK = BlockTags.createOptional(Reference.block("copper"));
    public static final Tag.Named<Block> SILVER_BLOCK = BlockTags.createOptional(Reference.block("silver"));
    public static final Tag.Named<Block> PLATINUM_BLOCK = BlockTags.createOptional(Reference.block("platinum"));
    public static final Tag.Named<Block> ALUMINUM_BLOCK = BlockTags.createOptional(Reference.block("aluminum"));
    public static final Tag.Named<Block> NICKEL_BLOCK = BlockTags.createOptional(Reference.block("nickel"));
    public static final Tag.Named<Block> URANIUM_BLOCK = BlockTags.createOptional(Reference.block("uranium"));
    public static final Tag.Named<Block> OSMIUM_BLOCK = BlockTags.createOptional(Reference.block("osmium"));
    public static final Tag.Named<Block> ZINC_BLOCK = BlockTags.createOptional(Reference.block("zinc"));
    public static final Tag.Named<Block> TIN_BLOCK = BlockTags.createOptional(Reference.block("tin"));
    public static final Tag.Named<Block> BRONZE_BLOCK = BlockTags.createOptional(Reference.block("bronze"));
    public static final Tag.Named<Block> CONSTANTAN_BLOCK = BlockTags.createOptional(Reference.block("constantan"));
    public static final Tag.Named<Block> ELECTRUM_BLOCK = BlockTags.createOptional(Reference.block("electrum"));
    public static final Tag.Named<Block> ENDERIUM_BLOCK = BlockTags.createOptional(Reference.block("enderium"));
    public static final Tag.Named<Block> INVAR_BLOCK = BlockTags.createOptional(Reference.block("invar"));
    public static final Tag.Named<Block> LUMIUM_BLOCK = BlockTags.createOptional(Reference.block("lumium"));
    public static final Tag.Named<Block> SIGNALUM_BLOCK = BlockTags.createOptional(Reference.block("signalum"));
    public static final Tag.Named<Block> STEEL_BLOCK = BlockTags.createOptional(Reference.block("steel"));
    public static final Tag.Named<Block> BRASS_BLOCK = BlockTags.createOptional(Reference.block("brass"));

    public static final Tag.Named<Block> RAW_LEAD_BLOCK = BlockTags.createOptional(Reference.block("raw_lead"));
    public static final Tag.Named<Block> RAW_SILVER_BLOCK = BlockTags.createOptional(Reference.block("raw_silver"));
    public static final Tag.Named<Block> RAW_PLATINUM_BLOCK = BlockTags.createOptional(Reference.block("raw_platinum"));
    public static final Tag.Named<Block> RAW_ALUMINUM_BLOCK = BlockTags.createOptional(Reference.block("raw_aluminum"));
    public static final Tag.Named<Block> RAW_NICKEL_BLOCK = BlockTags.createOptional(Reference.block("raw_nickel"));
    public static final Tag.Named<Block> RAW_URANIUM_BLOCK = BlockTags.createOptional(Reference.block("raw_uranium"));
    public static final Tag.Named<Block> RAW_OSMIUM_BLOCK = BlockTags.createOptional(Reference.block("raw_osmium"));
    public static final Tag.Named<Block> RAW_ZINC_BLOCK = BlockTags.createOptional(Reference.block("raw_zinc"));
    public static final Tag.Named<Block> RAW_TIN_BLOCK = BlockTags.createOptional(Reference.block("raw_tin"));

    public static final Tag.Named<Item> RAW_LEAD_BLOCK_ITEM = ItemTags.createOptional(Reference.block("raw_lead"));
    public static final Tag.Named<Item> RAW_SILVER_BLOCK_ITEM = ItemTags.createOptional(Reference.block("raw_silver"));
    public static final Tag.Named<Item> RAW_PLATINUM_BLOCK_ITEM = ItemTags.createOptional(Reference.block("raw_platinum"));
    public static final Tag.Named<Item> RAW_ALUMINUM_BLOCK_ITEM = ItemTags.createOptional(Reference.block("raw_aluminum"));
    public static final Tag.Named<Item> RAW_NICKEL_BLOCK_ITEM = ItemTags.createOptional(Reference.block("raw_nickel"));
    public static final Tag.Named<Item> RAW_URANIUM_BLOCK_ITEM = ItemTags.createOptional(Reference.block("raw_uranium"));
    public static final Tag.Named<Item> RAW_OSMIUM_BLOCK_ITEM = ItemTags.createOptional(Reference.block("raw_osmium"));
    public static final Tag.Named<Item> RAW_ZINC_BLOCK_ITEM = ItemTags.createOptional(Reference.block("raw_zinc"));
    public static final Tag.Named<Item> RAW_TIN_BLOCK_ITEM = ItemTags.createOptional(Reference.block("raw_tin"));


    public static final Tag.Named<Item> LEAD_BLOCK_ITEM = ItemTags.createOptional(Reference.block("lead"));
    public static final Tag.Named<Item> COPPER_BLOCK_ITEM = ItemTags.createOptional(Reference.block("copper"));
    public static final Tag.Named<Item> SILVER_BLOCK_ITEM = ItemTags.createOptional(Reference.block("silver"));
    public static final Tag.Named<Item> PLATINUM_BLOCK_ITEM = ItemTags.createOptional(Reference.block("platinum"));
    public static final Tag.Named<Item> ALUMINUM_BLOCK_ITEM = ItemTags.createOptional(Reference.block("aluminum"));
    public static final Tag.Named<Item> NICKEL_BLOCK_ITEM = ItemTags.createOptional(Reference.block("nickel"));
    public static final Tag.Named<Item> URANIUM_BLOCK_ITEM = ItemTags.createOptional(Reference.block("uranium"));
    public static final Tag.Named<Item> OSMIUM_BLOCK_ITEM = ItemTags.createOptional(Reference.block("osmium"));
    public static final Tag.Named<Item> ZINC_BLOCK_ITEM = ItemTags.createOptional(Reference.block("zinc"));
    public static final Tag.Named<Item> TIN_BLOCK_ITEM = ItemTags.createOptional(Reference.block("tin"));
    public static final Tag.Named<Item> BRONZE_BLOCK_ITEM = ItemTags.createOptional(Reference.block("bronze"));
    public static final Tag.Named<Item> CONSTANTAN_BLOCK_ITEM = ItemTags.createOptional(Reference.block("constantan"));
    public static final Tag.Named<Item> ELECTRUM_BLOCK_ITEM = ItemTags.createOptional(Reference.block("electrum"));
    public static final Tag.Named<Item> ENDERIUM_BLOCK_ITEM = ItemTags.createOptional(Reference.block("enderium"));
    public static final Tag.Named<Item> INVAR_BLOCK_ITEM = ItemTags.createOptional(Reference.block("invar"));
    public static final Tag.Named<Item> LUMIUM_BLOCK_ITEM = ItemTags.createOptional(Reference.block("lumium"));
    public static final Tag.Named<Item> SIGNALUM_BLOCK_ITEM = ItemTags.createOptional(Reference.block("signalum"));
    public static final Tag.Named<Item> STEEL_BLOCK_ITEM = ItemTags.createOptional(Reference.block("steel"));
    public static final Tag.Named<Item> BRASS_BLOCK_ITEM = ItemTags.createOptional(Reference.block("brass"));

    // RODS

    public static final Tag.Named<Item> ALUMINUM_ROD = forge("rods/aluminum");
    public static final Tag.Named<Item> COPPER_ROD = forge("rods/copper");
    public static final Tag.Named<Item> LEAD_ROD = forge("rods/lead");
    public static final Tag.Named<Item> NICKEL_ROD = forge("rods/nickel");
    public static final Tag.Named<Item> OSMIUM_ROD = forge("rods/osmium");
    public static final Tag.Named<Item> PLATINUM_ROD = forge("rods/platinum");
    public static final Tag.Named<Item> SILVER_ROD = forge("rods/silver");
    public static final Tag.Named<Item> TIN_ROD = forge("rods/tin");
    public static final Tag.Named<Item> URANIUM_ROD = forge("rods/uranium");
    public static final Tag.Named<Item> ZINC_ROD = forge("rods/zinc");
    public static final Tag.Named<Item> BRONZE_ROD = forge("rods/bronze");
    public static final Tag.Named<Item> CONSTANTAN_ROD = forge("rods/constantan");
    public static final Tag.Named<Item> ELECTRUM_ROD = forge("rods/electrum");
    public static final Tag.Named<Item> ENDERIUM_ROD = forge("rods/enderium");
    public static final Tag.Named<Item> INVAR_ROD = forge("rods/invar");
    public static final Tag.Named<Item> LUMIUM_ROD = forge("rods/lumium");
    public static final Tag.Named<Item> SIGNALUM_ROD = forge("rods/signalum");
    public static final Tag.Named<Item> STEEL_ROD = forge("rods/steel");
    public static final Tag.Named<Item> IRON_ROD = forge("rods/iron");
    public static final Tag.Named<Item> GOLD_ROD = forge("rods/gold");
    public static final Tag.Named<Item> DIAMOND_ROD = forge("rods/diamond");
    public static final Tag.Named<Item> BRASS_ROD = forge("rods/brass");
    // GEARS

    public static final Tag.Named<Item> ALUMINUM_GEAR = forge("gears/aluminum");
    public static final Tag.Named<Item> COPPER_GEAR = forge("gears/copper");
    public static final Tag.Named<Item> LEAD_GEAR = forge("gears/lead");
    public static final Tag.Named<Item> NICKEL_GEAR = forge("gears/nickel");
    public static final Tag.Named<Item> OSMIUM_GEAR = forge("gears/osmium");
    public static final Tag.Named<Item> PLATINUM_GEAR = forge("gears/platinum");
    public static final Tag.Named<Item> SILVER_GEAR = forge("gears/silver");
    public static final Tag.Named<Item> TIN_GEAR = forge("gears/tin");
    public static final Tag.Named<Item> URANIUM_GEAR = forge("gears/uranium");
    public static final Tag.Named<Item> ZINC_GEAR = forge("gears/zinc");
    public static final Tag.Named<Item> BRONZE_GEAR = forge("gears/bronze");
    public static final Tag.Named<Item> CONSTANTAN_GEAR = forge("gears/constantan");
    public static final Tag.Named<Item> ELECTRUM_GEAR = forge("gears/electrum");
    public static final Tag.Named<Item> ENDERIUM_GEAR = forge("gears/enderium");
    public static final Tag.Named<Item> INVAR_GEAR = forge("gears/invar");
    public static final Tag.Named<Item> LUMIUM_GEAR = forge("gears/lumium");
    public static final Tag.Named<Item> SIGNALUM_GEAR = forge("gears/signalum");
    public static final Tag.Named<Item> STEEL_GEAR = forge("gears/steel");
    public static final Tag.Named<Item> IRON_GEAR = forge("gears/iron");
    public static final Tag.Named<Item> GOLD_GEAR = forge("gears/gold");
    public static final Tag.Named<Item> DIAMOND_GEAR = forge("gears/diamond");
    public static final Tag.Named<Item> BRASS_GEAR = forge("gears/brass");
    // PLATES

    public static final Tag.Named<Item> ALUMINUM_PLATE = forge("plates/aluminum");
    public static final Tag.Named<Item> COPPER_PLATE = forge("plates/copper");
    public static final Tag.Named<Item> LEAD_PLATE = forge("plates/lead");
    public static final Tag.Named<Item> NICKEL_PLATE = forge("plates/nickel");
    public static final Tag.Named<Item> OSMIUM_PLATE = forge("plates/osmium");
    public static final Tag.Named<Item> PLATINUM_PLATE = forge("plates/platinum");
    public static final Tag.Named<Item> SILVER_PLATE = forge("plates/silver");
    public static final Tag.Named<Item> TIN_PLATE = forge("plates/tin");
    public static final Tag.Named<Item> URANIUM_PLATE = forge("plates/uranium");
    public static final Tag.Named<Item> ZINC_PLATE = forge("plates/zinc");
    public static final Tag.Named<Item> BRONZE_PLATE = forge("plates/bronze");
    public static final Tag.Named<Item> CONSTANTAN_PLATE = forge("plates/constantan");
    public static final Tag.Named<Item> ELECTRUM_PLATE = forge("plates/electrum");
    public static final Tag.Named<Item> ENDERIUM_PLATE = forge("plates/enderium");
    public static final Tag.Named<Item> INVAR_PLATE = forge("plates/invar");
    public static final Tag.Named<Item> LUMIUM_PLATE = forge("plates/lumium");
    public static final Tag.Named<Item> SIGNALUM_PLATE = forge("plates/signalum");
    public static final Tag.Named<Item> STEEL_PLATE = forge("plates/steel");
    public static final Tag.Named<Item> IRON_PLATE = forge("plates/iron");
    public static final Tag.Named<Item> GOLD_PLATE = forge("plates/gold");
    public static final Tag.Named<Item> DIAMOND_PLATE = forge("plates/diamond");
    public static final Tag.Named<Item> BRASS_PLATE = forge("plates/brass");
    // DUST
    public static final Tag.Named<Item> PLATINUM_DUST = forge("dusts/platinum");
    public static final Tag.Named<Item> COPPER_DUST = forge("dusts/copper");
    public static final Tag.Named<Item> ALUMINUM_DUST = forge("dusts/aluminum");
    public static final Tag.Named<Item> URANIUM_DUST = forge("dusts/uranium");
    public static final Tag.Named<Item> NICKEL_DUST = forge("dusts/nickel");
    public static final Tag.Named<Item> SILVER_DUST = forge("dusts/silver");
    public static final Tag.Named<Item> OSMIUM_DUST = forge("dusts/osmium");
    public static final Tag.Named<Item> ZINC_DUST = forge("dusts/zinc");
    public static final Tag.Named<Item> LEAD_DUST = forge("dusts/lead");
    public static final Tag.Named<Item> TIN_DUST = forge("dusts/tin");
    public static final Tag.Named<Item> BRONZE_DUST = forge("dusts/bronze");
    public static final Tag.Named<Item> CONSTANTAN_DUST = forge("dusts/constantan");
    public static final Tag.Named<Item> ELECTRUM_DUST = forge("dusts/electrum");
    public static final Tag.Named<Item> ENDERIUM_DUST = forge("dusts/enderium");
    public static final Tag.Named<Item> INVAR_DUST = forge("dusts/invar");
    public static final Tag.Named<Item> LUMIUM_DUST = forge("dusts/lumium");
    public static final Tag.Named<Item> SIGNALUM_DUST = forge("dusts/signalum");
    public static final Tag.Named<Item> STEEL_DUST = forge("dusts/steel");
    public static final Tag.Named<Item> IRON_DUST = forge("dusts/iron");
    public static final Tag.Named<Item> GOLD_DUST = forge("dusts/gold");
    public static final Tag.Named<Item> DIAMOND_DUST = forge("dusts/diamond");
    public static final Tag.Named<Item> BRASS_DUST = forge("dusts/brass");
    //ORE


    public static final Tag.Named<Block> LEAD_ORE = BlockTags.createOptional(Reference.ore("lead"));
    public static final Tag.Named<Block> SILVER_ORE = BlockTags.createOptional(Reference.ore("silver"));
    public static final Tag.Named<Block> PLATINUM_ORE = BlockTags.createOptional(Reference.ore("platinum"));
    public static final Tag.Named<Block> ALUMINUM_ORE = BlockTags.createOptional(Reference.ore("aluminum"));
    public static final Tag.Named<Block> NICKEL_ORE = BlockTags.createOptional(Reference.ore("nickel"));
    public static final Tag.Named<Block> URANIUM_ORE = BlockTags.createOptional(Reference.ore("uranium"));
    public static final Tag.Named<Block> OSMIUM_ORE = BlockTags.createOptional(Reference.ore("osmium"));
    public static final Tag.Named<Block> ZINC_ORE = BlockTags.createOptional(Reference.ore("zinc"));
    public static final Tag.Named<Block> TIN_ORE = BlockTags.createOptional(Reference.ore("tin"));

    public static final Tag.Named<Item> LEAD_ORE_ITEM = ItemTags.createOptional(Reference.ore("lead"));
    public static final Tag.Named<Item> SILVER_ORE_ITEM = ItemTags.createOptional(Reference.ore("silver"));
    public static final Tag.Named<Item> PLATINUM_ORE_ITEM = ItemTags.createOptional(Reference.ore("platinum"));
    public static final Tag.Named<Item> ALUMINUM_ORE_ITEM = ItemTags.createOptional(Reference.ore("aluminum"));
    public static final Tag.Named<Item> NICKEL_ORE_ITEM = ItemTags.createOptional(Reference.ore("nickel"));
    public static final Tag.Named<Item> URANIUM_ORE_ITEM = ItemTags.createOptional(Reference.ore("uranium"));
    public static final Tag.Named<Item> OSMIUM_ORE_ITEM = ItemTags.createOptional(Reference.ore("osmium"));
    public static final Tag.Named<Item> ZINC_ORE_ITEM = ItemTags.createOptional(Reference.ore("zinc"));
    public static final Tag.Named<Item> TIN_ORE_ITEM = ItemTags.createOptional(Reference.ore("tin"));

    public static final Tag.Named<Item> RAW_LEAD = ItemTags.createOptional(Reference.raw_ores("lead"));
    public static final Tag.Named<Item> RAW_SILVER = ItemTags.createOptional(Reference.raw_ores("silver"));
    public static final Tag.Named<Item> RAW_PLATINUM = ItemTags.createOptional(Reference.raw_ores("platinum"));
    public static final Tag.Named<Item> RAW_ALUMINUM = ItemTags.createOptional(Reference.raw_ores("aluminum"));
    public static final Tag.Named<Item> RAW_NICKEL = ItemTags.createOptional(Reference.raw_ores("nickel"));
    public static final Tag.Named<Item> RAW_URANIUM = ItemTags.createOptional(Reference.raw_ores("uranium"));
    public static final Tag.Named<Item> RAW_OSMIUM = ItemTags.createOptional(Reference.raw_ores("osmium"));
    public static final Tag.Named<Item> RAW_ZINC = ItemTags.createOptional(Reference.raw_ores("zinc"));
    public static final Tag.Named<Item> RAW_TIN = ItemTags.createOptional(Reference.raw_ores("tin"));

    public static final Tag.Named<Item> RAW_LEAD_MATERIAL = ItemTags.createOptional(Reference.raw_materials("lead"));
    public static final Tag.Named<Item> RAW_SILVER_MATERIAL = ItemTags.createOptional(Reference.raw_materials("silver"));
    public static final Tag.Named<Item> RAW_PLATINUM_MATERIAL = ItemTags.createOptional(Reference.raw_materials("platinum"));
    public static final Tag.Named<Item> RAW_ALUMINUM_MATERIAL = ItemTags.createOptional(Reference.raw_materials("aluminum"));
    public static final Tag.Named<Item> RAW_NICKEL_MATERIAL = ItemTags.createOptional(Reference.raw_materials("nickel"));
    public static final Tag.Named<Item> RAW_URANIUM_MATERIAL = ItemTags.createOptional(Reference.raw_materials("uranium"));
    public static final Tag.Named<Item> RAW_OSMIUM_MATERIAL = ItemTags.createOptional(Reference.raw_materials("osmium"));
    public static final Tag.Named<Item> RAW_ZINC_MATERIAL = ItemTags.createOptional(Reference.raw_materials("zinc"));
    public static final Tag.Named<Item> RAW_TIN_MATERIAL = ItemTags.createOptional(Reference.raw_materials("tin"));


    private static Tags.IOptionalNamedTag<Item> forge(String name)
    {
        return net.minecraft.tags.ItemTags.createOptional(new ResourceLocation("forge", name));
    }
}
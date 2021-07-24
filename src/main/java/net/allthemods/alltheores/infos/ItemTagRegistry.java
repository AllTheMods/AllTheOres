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

    // DUST
    public static final Tag.Named<Item> PLATINUM_DUST = forge("dusts/platinum");
    public static final Tag.Named<Item> ALUMINUM_DUST = forge("dusts/aluminum");
    public static final Tag.Named<Item> URANIUM_DUST = forge("dusts/uranium");
    public static final Tag.Named<Item> NICKEL_DUST = forge("dusts/nickel");
    public static final Tag.Named<Item> SILVER_DUST = forge("dusts/silver");
    public static final Tag.Named<Item> OSMIUM_DUST = forge("dusts/osmium");
    public static final Tag.Named<Item> ZINC_DUST = forge("dusts/zinc");
    public static final Tag.Named<Item> LEAD_DUST = forge("dusts/lead");
    public static final Tag.Named<Item> TIN_DUST = forge("dusts/tin");
    //ORE


    public static final Tag.Named<Block> LEAD_ORE = BlockTags.createOptional(Reference.ore("lead"));
    public static final Tag.Named<Block> COPPER_ORE = BlockTags.createOptional(Reference.ore("copper"));
    public static final Tag.Named<Block> SILVER_ORE = BlockTags.createOptional(Reference.ore("silver"));
    public static final Tag.Named<Block> PLATINUM_ORE = BlockTags.createOptional(Reference.ore("platinum"));
    public static final Tag.Named<Block> ALUMINUM_ORE = BlockTags.createOptional(Reference.ore("aluminum"));
    public static final Tag.Named<Block> NICKEL_ORE = BlockTags.createOptional(Reference.ore("nickel"));
    public static final Tag.Named<Block> URANIUM_ORE = BlockTags.createOptional(Reference.ore("uranium"));
    public static final Tag.Named<Block> OSMIUM_ORE = BlockTags.createOptional(Reference.ore("osmium"));
    public static final Tag.Named<Block> ZINC_ORE = BlockTags.createOptional(Reference.ore("zinc"));
    public static final Tag.Named<Block> TIN_ORE = BlockTags.createOptional(Reference.ore("tin"));


    private static Tags.IOptionalNamedTag<Item> forge(String name)
    {
        return net.minecraft.tags.ItemTags.createOptional(new ResourceLocation("forge", name));
    }
}
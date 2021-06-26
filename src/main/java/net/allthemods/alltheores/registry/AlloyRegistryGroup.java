package net.allthemods.alltheores.registry;

import net.allthemods.alltheores.blocks.BlockList;
import net.allthemods.alltheores.infos.Reference;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.fml.RegistryObject;

import static net.allthemods.alltheores.blocks.BlockList.blockItem;
import static net.allthemods.alltheores.blocks.BlockList.material;


@SuppressWarnings("java:S116")
public class AlloyRegistryGroup {
    public final String name;

    // Tags
    public final Tags.IOptionalNamedTag<Block> BLOCK_TAG;
    public final Tags.IOptionalNamedTag<Item> BLOCK_ITEM_TAG;
    public final Tags.IOptionalNamedTag<Item> INGOT_TAG;
    public final Tags.IOptionalNamedTag<Item> NUGGET_TAG;
    public final Tags.IOptionalNamedTag<Item> DUST_TAG;


    // Blocks
    public final RegistryObject<Block> BLOCK;

    // BlockItems
    public final RegistryObject<BlockItem> BLOCK_ITEM;

    // Items
    public final RegistryObject<Item> DUST;
    public final RegistryObject<Item> INGOT;
    public final RegistryObject<Item> NUGGET;

    // Parts
    public final RegistryObject<Item> ROD;
    public final RegistryObject<Item> GEAR;
    public final RegistryObject<Item> PLATE;

    public AlloyRegistryGroup(String name) {
        this.name = name;

        BLOCK_TAG = BlockTags.createOptional(Reference.block(name));
        BLOCK_ITEM_TAG = ItemTags.createOptional(Reference.block(name));
        INGOT_TAG = ItemTags.createOptional(Reference.ingot(name));
        NUGGET_TAG = ItemTags.createOptional(Reference.nugget(name));
        DUST_TAG = ItemTags.createOptional(Reference.dust(name));

        BLOCK = BlockList.BLOCKS.register(String.format("%s_block", name),
                () -> new Block(AbstractBlock.Properties.of(Material.METAL).strength(5.0f, 6.0f).sound(SoundType.METAL)));

        BLOCK_ITEM = blockItem(BLOCK);

        INGOT = material(String.format("%s_ingot", name));
        NUGGET = material(String.format("%s_nugget", name));
        DUST = material(String.format("%s_dust", name));

        ROD = material(String.format("%s_rod", name));
        GEAR = material(String.format("%s_gear", name));
        PLATE = material(String.format("%s_plate", name));
    }
}

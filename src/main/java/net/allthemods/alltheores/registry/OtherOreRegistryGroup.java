package net.allthemods.alltheores.registry;

import net.allthemods.alltheores.blocks.BlockList;
import net.allthemods.alltheores.blocks.OtherOreBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;

import static net.allthemods.alltheores.blocks.BlockList.blockItem;

@SuppressWarnings("java:S116")
public class OtherOreRegistryGroup {


    // registered externally
    public final Item ORE;
    public final Item RAW;

    // custom
    public final RegistryObject<Block> OTHER_ORE;
    public final RegistryObject<BlockItem> OTHER_ORE_ITEM;

    /**
     * Add other ores for existing ore
     * @param name the registry name
     * @param ore the ore that should drop when using silk touch
     * @param raw the raw material that should drop, multiplied by fortune
     */
    public OtherOreRegistryGroup(String name, Item ore, Item raw) {
        OTHER_ORE = BlockList.ORE.register(String.format("other_%s_ore", name), OtherOreBlock::new);
        OTHER_ORE_ITEM = blockItem(OTHER_ORE);

        this.ORE = ore;
        this.RAW = raw;
    }
}

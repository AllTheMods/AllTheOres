package net.allthemods.alltheores.registry;

import net.allthemods.alltheores.infos.Reference;
import net.minecraft.item.Item;
import net.minecraft.tags.ITag;
import net.minecraft.tags.ItemTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.fml.RegistryObject;

import static net.allthemods.alltheores.blocks.BlockList.material;


@SuppressWarnings("java:S116")
public class VanillaRegistryGroup {
    public final String name;

    // Tags
    public final Tags.IOptionalNamedTag<Item> DUST_TAG;

    // Items
    public final RegistryObject<Item> DUST;

    // Parts
    public final RegistryObject<Item> ROD;
    public final RegistryObject<Item> GEAR;
    public final RegistryObject<Item> PLATE;

    public final ITag<Item> MATERIAL_TAG;

    public VanillaRegistryGroup(String name, ITag<Item> materialTag) {
        this.name = name;
        this.MATERIAL_TAG = materialTag;

        DUST_TAG = ItemTags.createOptional(Reference.dust(name));
        DUST = material(String.format("%s_dust", name));

        ROD = material(String.format("%s_rod", name));
        GEAR = material(String.format("%s_gear", name));
        PLATE = material(String.format("%s_plate", name));

    }
}

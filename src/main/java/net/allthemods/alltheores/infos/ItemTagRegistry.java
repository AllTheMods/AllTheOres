package net.allthemods.alltheores.infos;

import net.minecraft.item.Item;
import net.minecraft.tags.ItemTags;
import net.minecraftforge.common.Tags;

public class ItemTagRegistry {
    private ItemTagRegistry() {
    }

    public static final Tags.IOptionalNamedTag<Item> LEAD_INGOT = ItemTags.createOptional(Reference.ingot("lead"));
    public static final Tags.IOptionalNamedTag<Item> COPPER_INGOT = ItemTags.createOptional(Reference.ingot("copper"));
    public static final Tags.IOptionalNamedTag<Item> SILVER_INGOT = ItemTags.createOptional(Reference.ingot("silver"));
    public static final Tags.IOptionalNamedTag<Item> PLATINUM_INGOT = ItemTags.createOptional(Reference.ingot("platinum"));
    public static final Tags.IOptionalNamedTag<Item> ALUMINUM_INGOT = ItemTags.createOptional(Reference.ingot("aluminum"));
    public static final Tags.IOptionalNamedTag<Item> NICKEL_INGOT = ItemTags.createOptional(Reference.ingot("nickel"));
    public static final Tags.IOptionalNamedTag<Item> URANIUM_INGOT = ItemTags.createOptional(Reference.ingot("uranium"));
    public static final Tags.IOptionalNamedTag<Item> OSMIUM_INGOT = ItemTags.createOptional(Reference.ingot("osmium"));
    public static final Tags.IOptionalNamedTag<Item> ZINC_INGOT = ItemTags.createOptional(Reference.ingot("zinc"));
    public static final Tags.IOptionalNamedTag<Item> TIN_INGOT = ItemTags.createOptional(Reference.ingot("tin"));

}
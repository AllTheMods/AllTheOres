package net.allthemods.alltheores.blocks.mek_reg;

import mekanism.common.resource.BlockResourceInfo;
import mekanism.common.resource.IResource;
import mekanism.common.resource.ResourceType;
import net.allthemods.alltheores.infos.ItemTagRegistry;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import org.jetbrains.annotations.Nullable;

import java.util.function.Supplier;

public enum ATOResource implements IResource {
    ALUMINUM("aluminum", 14935011, ItemTagRegistry.ALUMINUM_ORE_ITEM),
    NICKEL("nickel",11118980,ItemTagRegistry.NICKEL_ORE_ITEM),
    PLATINUM("platinum",12634589,ItemTagRegistry.PLATINUM_ORE_ITEM),
    SILVER("silver",10805479,ItemTagRegistry.SILVER_ORE_ITEM),
    IRIDIUM("iridium",10282212, ItemTagRegistry.IRIDIUM_ORE_ITEM),
    ZINC("zinc",11908469,ItemTagRegistry.ZINC_ORE_ITEM);

    private final String name;
    private final int tint;
    //Note: This is a supplier because of the chicken and egg of referencing OreType and OreType referencing PrimaryResource
    private final Supplier<TagKey<Item>> oreTag;
    private final boolean isVanilla;
    private final BlockResourceInfo resourceBlockInfo;
    private final BlockResourceInfo rawResourceBlockInfo;

    ATOResource(String name, int colour, TagKey<Item> oreTag) {
        this(name, colour, () -> oreTag,true, null,null);
    }
    ATOResource(String name, int tint, Supplier<TagKey<Item>> oreTag, boolean isVanilla, BlockResourceInfo resourceBlockInfo, BlockResourceInfo rawResourceBlockInfo) {
        this.name = name;
        this.tint = tint;
        this.oreTag = oreTag;
        this.isVanilla = isVanilla;
        this.resourceBlockInfo = resourceBlockInfo;
        this.rawResourceBlockInfo = rawResourceBlockInfo;
    }

    @Override
    public String getRegistrySuffix() {
        return name;
    }

    public int getTint() {
        return tint;
    }

    public TagKey<Item> getOreTag() {
        return oreTag.get();
    }

    public boolean has(ResourceType type) {
        return type != ResourceType.ENRICHED && (!isVanilla || !type.isVanilla());
    }

    public boolean isVanilla() {
        return isVanilla;
    }

    @Nullable
    public BlockResourceInfo getResourceBlockInfo() {
        return resourceBlockInfo;
    }

    @Nullable
    public BlockResourceInfo getRawResourceBlockInfo() {
        return rawResourceBlockInfo;
    }
}

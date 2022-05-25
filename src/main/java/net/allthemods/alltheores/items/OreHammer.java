package net.allthemods.alltheores.items;

import net.allthemods.alltheores.blocks.BlockList;
import net.minecraft.client.color.item.ItemColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class OreHammer extends Item {

    public OreHammer(Item.Properties properties,int durability) {

        super(properties.defaultDurability(durability).setNoRepair());

    }

    @Override
    public boolean hasContainerItem(ItemStack stack) {
        return (stack.getItem() instanceof OreHammer);
    }

    @Override
    public ItemStack getContainerItem(ItemStack itemStack) {
        int durability = itemStack.getDamageValue();
        itemStack.setDamageValue(durability+1);
        if(itemStack.getDamageValue()==itemStack.getMaxDamage()) { return ItemStack.EMPTY; }

        return itemStack.copy();
    }

}

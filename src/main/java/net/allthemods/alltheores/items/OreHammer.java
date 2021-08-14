package net.allthemods.alltheores.items;

import net.allthemods.alltheores.blocks.BlockList;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class OreHammer extends Item {
    public OreHammer(Item.Properties properties) {

        super(properties.defaultDurability(64));

    }

    @Override
    public boolean hasContainerItem(ItemStack stack) {
        return (stack.getItem() == BlockList.ORE_HAMMER.get());
    }

    @Override
    public ItemStack getContainerItem(ItemStack itemStack) {
        int durability = itemStack.getDamageValue();
        ItemStack returnstack = new ItemStack(this);
        returnstack.setDamageValue(durability+1);
        if(returnstack.getDamageValue()==returnstack.getMaxDamage()) { return ItemStack.EMPTY; }

        return returnstack;
    }
}

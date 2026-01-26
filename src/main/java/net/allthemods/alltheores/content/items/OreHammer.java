package net.allthemods.alltheores.content.items;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class OreHammer extends Item {

    public OreHammer(Item.Properties properties, int durability) {

        super(properties.durability(durability).setNoRepair());

    }

    @Override
    public boolean hasCraftingRemainingItem(ItemStack stack) {
        return (stack.getItem() instanceof OreHammer);
    }

    @Override
    public ItemStack getCraftingRemainingItem(ItemStack itemStack) {
        int durability = itemStack.getDamageValue();
        itemStack.setDamageValue(durability + 1);

        // replace with `itemStack.isBroken()`, once that becomes available in `1.21.2`
        if (itemStack.isDamageableItem() && itemStack.getDamageValue() >= itemStack.getMaxDamage()) {
            return ItemStack.EMPTY;
        }

        return itemStack.copy();
    }

}

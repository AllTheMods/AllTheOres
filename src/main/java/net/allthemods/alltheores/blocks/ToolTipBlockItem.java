package net.allthemods.alltheores.blocks;

import net.allthemods.alltheores.infos.Configuration;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextColor;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.server.command.TextComponentHelper;

import java.util.List;

public class ToolTipBlockItem  extends BlockItem {
    public ToolTipBlockItem(Block block, Properties properties) {
        super(block, properties);

    }
    @OnlyIn(Dist.CLIENT)
    @Override
    public void appendHoverText(ItemStack stack, Level worldIn, List<Component> tooltip, TooltipFlag flagIn){
        if((stack.getItem() == BlockList.ALUMINUM_ORE_ITEM.get()) || (stack.getItem() == BlockList.ALUMINUM_SLATE_ORE_ITEM.get())) {
            tooltip.add(TextComponentHelper.createComponentTranslation(null, "Y: " + Configuration.aluminum_MinY + " to " + Configuration.aluminum_MaxY , new Object()).withStyle(ChatFormatting.YELLOW));
        }
        /*if(stack.getItem() == BlockList.COPPER_ORE_ITEM.get()) {
            tooltip.add((ITextComponent) TextComponentHelper.createComponentTranslation(null, "Y: " + Configuration.copper_MinY + " to " + Configuration.copper_MaxY , new Object()).withStyle(TextFormatting.YELLOW));
        }*/
        if((stack.getItem() == BlockList.LEAD_ORE_ITEM.get()) || (stack.getItem() == BlockList.LEAD_SLATE_ORE_ITEM.get())) {
            tooltip.add(TextComponentHelper.createComponentTranslation(null, "Y: " + Configuration.lead_MinY + " to " + Configuration.lead_MaxY , new Object()).withStyle(ChatFormatting.YELLOW));
        }
        if((stack.getItem() == BlockList.NICKEL_ORE_ITEM.get()) || (stack.getItem() == BlockList.NICKEL_SLATE_ORE_ITEM.get())) {
            tooltip.add(TextComponentHelper.createComponentTranslation(null, "Y: " + Configuration.nickel_MinY + " to " + Configuration.nickel_MaxY , new Object()).withStyle(ChatFormatting.YELLOW));
        }
        if((stack.getItem() == BlockList.OSMIUM_ORE_ITEM.get()) || (stack.getItem() == BlockList.OSMIUM_SLATE_ORE_ITEM.get())) {
            tooltip.add(TextComponentHelper.createComponentTranslation(null, "Y: " + Configuration.osmium_MinY + " to " + Configuration.osmium_MaxY , new Object()).withStyle(ChatFormatting.YELLOW));
        }
        if((stack.getItem() == BlockList.PLATINUM_ORE_ITEM.get()) || (stack.getItem() == BlockList.PLATINUM_SLATE_ORE_ITEM.get())) {
            tooltip.add(TextComponentHelper.createComponentTranslation(null, "Y: " + Configuration.platinum_MinY + " to " + Configuration.platinum_MaxY , new Object()).withStyle(ChatFormatting.YELLOW));
        }
        if((stack.getItem() == BlockList.SILVER_ORE_ITEM.get()) || (stack.getItem() == BlockList.SILVER_SLATE_ORE_ITEM.get())) {
            tooltip.add(TextComponentHelper.createComponentTranslation(null, "Y: " + Configuration.silver_MinY + " to " + Configuration.silver_MaxY , new Object()).withStyle(ChatFormatting.YELLOW));
        }
        if((stack.getItem() == BlockList.TIN_ORE_ITEM.get()) || (stack.getItem() == BlockList.TIN_SLATE_ORE_ITEM.get())) {
            tooltip.add(TextComponentHelper.createComponentTranslation(null, "Y: " + Configuration.tin_MinY + " to " + Configuration.tin_MaxY , new Object()).withStyle(ChatFormatting.YELLOW));
        }
        if((stack.getItem() == BlockList.URANIUM_ORE_ITEM.get()) || (stack.getItem() == BlockList.URANIUM_SLATE_ORE_ITEM.get())) {
            tooltip.add(TextComponentHelper.createComponentTranslation(null, "Y: " + Configuration.uranium_MinY + " to " + Configuration.uranium_MaxY , new Object()).withStyle(ChatFormatting.YELLOW));
        }
        if((stack.getItem() == BlockList.ZINC_ORE_ITEM.get())|| (stack.getItem() == BlockList.ZINC_SLATE_ORE_ITEM.get())) {
            tooltip.add(TextComponentHelper.createComponentTranslation(null, "Y: " + Configuration.zinc_MinY + " to " + Configuration.zinc_MaxY , new Object()).withStyle(ChatFormatting.YELLOW));
        }
        super.appendHoverText(stack, worldIn, tooltip, flagIn);
    }

}

package net.allthemods.alltheores.blocks;

import net.allthemods.alltheores.infos.Configuration;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.*;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.ToolType;
import org.apache.commons.lang3.StringUtils;

import javax.annotation.Nullable;
import java.util.List;

public class AOreBlock extends Block {

	public AOreBlock(float strength1, float strength2) {
		super(Block.Properties.of(Material.METAL).requiresCorrectToolForDrops().sound(SoundType.STONE)
				.strength(strength1,strength2));

	}

	@Override
	public ToolType getHarvestTool(BlockState state) {
		return ToolType.PICKAXE;
	}

	@Override
	public int getHarvestLevel(BlockState state) {
		if(state.getBlock() == BlockList.PLATINUM.ORE.get()) { return 2; }
		if(state.getBlock() == BlockList.URANIUM.ORE.get()) { return 2; }
		return 1;
	}

	@OnlyIn(Dist.CLIENT)
	@Override
	public void appendHoverText(ItemStack stack, @Nullable IBlockReader blockReader, List<ITextComponent> tooltip, ITooltipFlag flagIn){
		ResourceLocation location = stack.getItem().getRegistryName();
		if (location != null) {
			int minY = 0;
			int maxY = 0;
			String type = StringUtils.substringBefore(location.getPath(), "_");
			switch (type) {
				case "aluminum":
					minY = Configuration.aluminum_MinY;
					maxY = Configuration.aluminum_MaxY;
					break;
				case "lead":
					minY = Configuration.lead_MinY;
					maxY = Configuration.lead_MaxY;
					break;
				case "nickel":
					minY = Configuration.nickel_MinY;
					maxY = Configuration.nickel_MaxY;
					break;
				case "osmium":
					minY = Configuration.osmium_MinY;
					maxY = Configuration.osmium_MaxY;
					break;
				case "platinum":
					minY = Configuration.platinum_MinY;
					maxY = Configuration.platinum_MaxY;
					break;
				case "silver":
					minY = Configuration.silver_MinY;
					maxY = Configuration.silver_MaxY;
					break;
				case "tin":
					minY = Configuration.tin_MinY;
					maxY = Configuration.tin_MaxY;
					break;
				case "uranium":
					minY = Configuration.uranium_MinY;
					maxY = Configuration.uranium_MaxY;
					break;
				case "zinc":
					minY = Configuration.zinc_MinY;
					maxY = Configuration.zinc_MaxY;
					break;
				default:
					// nothing to do
					break;
			}
			if (minY > 0 && maxY > 0) {
				String display = String.format("Y: %s - %s", minY, maxY);
				tooltip.add(new TranslationTextComponent(display).withStyle(TextFormatting.YELLOW));
			}
		}
		super.appendHoverText(stack, blockReader, tooltip, flagIn);
	}

/*
	@Deprecated
	@Override
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
		List<ItemStack> list = new ArrayList<ItemStack>();
		list.add(new ItemStack(state.getBlock().asItem()));
		return list;
	}*/
}

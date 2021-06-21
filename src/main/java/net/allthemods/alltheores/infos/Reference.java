package net.allthemods.alltheores.infos;



import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.Tags;

import java.util.ArrayList;
import java.util.List;

public class Reference {

		public static final String MOD_ID = "alltheores";
		public static final ItemGroup GROUP = new ItemGroup(MOD_ID) {
			public ItemStack makeIcon() {
				return new ItemStack(Blocks.DIAMOND_ORE);
			}
		};
		public static List<Block> WORLDGEN_BLACKLIST = new ArrayList<>();

	public static ResourceLocation forge(String path) {
		return new ResourceLocation("forge", path);
	}
	public static ResourceLocation ingot(String path) {
		return forge("ingots/" + path);
	}
	public static ResourceLocation nugget(String path) {
		return forge("nuggets/" + path);
	}
	public static ResourceLocation block(String path) {
		return forge("storage_blocks/" + path);
	}
}

package net.allthemods.alltheores.infos;



import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

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
}

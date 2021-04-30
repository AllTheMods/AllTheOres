package net.allthemods.alltheores.infos;



import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class Reference {

		public static final String MOD_ID = "alltheores";
		public static final ItemGroup GROUP = new ItemGroup(MOD_ID) {
			public ItemStack makeIcon() {
				return new ItemStack(Blocks.DIAMOND_ORE);
			}
		};
}

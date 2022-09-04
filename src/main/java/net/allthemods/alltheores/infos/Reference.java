package net.allthemods.alltheores.infos;



import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

import java.util.ArrayList;
import java.util.List;


public class Reference {

		public static final String MOD_ID = "alltheores";
		public static final CreativeModeTab GROUP = new CreativeModeTab(MOD_ID) {
			public ItemStack makeIcon() {
				return new ItemStack(Blocks.DIAMOND_ORE);
			}
		};
		public static List<Block> WORLDGEN_BLACKLIST = new ArrayList<Block>();
	public static ResourceLocation location(String pathIn) {
		return new ResourceLocation(pathIn);
	}
	public static ResourceLocation ato (String path) { return new ResourceLocation("alltheores",path); }
	public static ResourceLocation mek (String path) { return new ResourceLocation("mekanism",path); }
	public static ResourceLocation vanilla(String path) { return new ResourceLocation("minecraft",path); }
	public static ResourceLocation forge(String path) {
		return new ResourceLocation("forge", path);
	}
	public static ResourceLocation ingot(String path) {	return forge("ingots/" + path); }
	public static ResourceLocation vanillaIngot(String path) {	return vanilla("ingots/" + path); }
	public static ResourceLocation nugget(String path) {
		return forge("nuggets/" + path);
	}
	public static ResourceLocation ore(String path) {
		return forge("ores/" + path);
	}
	public static ResourceLocation gem(String path) {
		return forge("gems/" + path);
	}

	public static ResourceLocation block(String path) {
		return forge("storage_blocks/" + path);
	}

	public static ResourceLocation raw_materials(String path) {
		return forge("raw_materials/" + path);
	}
	public static ResourceLocation ores_in_ground(String path) {
		return forge("ores_in_ground/" + path);
	}
}

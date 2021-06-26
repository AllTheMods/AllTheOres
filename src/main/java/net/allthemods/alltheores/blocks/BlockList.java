package net.allthemods.alltheores.blocks;

import net.allthemods.alltheores.infos.ItemTagRegistry;
import net.allthemods.alltheores.infos.Reference;
import net.allthemods.alltheores.registry.AlloyRegistryGroup;
import net.allthemods.alltheores.registry.OreRegistryGroup;
import net.allthemods.alltheores.registry.OtherOreRegistryGroup;
import net.allthemods.alltheores.registry.VanillaRegistryGroup;
import net.minecraft.block.Block;
import net.minecraft.fluid.Fluid;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraftforge.common.Tags;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockList {

	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Reference.MOD_ID);
	public static final DeferredRegister<Block> ORE = DeferredRegister.create(ForgeRegistries.BLOCKS, Reference.MOD_ID);
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Reference.MOD_ID);
	public static final DeferredRegister<Fluid> FLUIDS = DeferredRegister.create(ForgeRegistries.FLUIDS, Reference.MOD_ID);

	public static final OreRegistryGroup ALUMINUM = new OreRegistryGroup("aluminum", 0xFFE3E3E3);
	public static final OreRegistryGroup LEAD = new OreRegistryGroup("lead", 0xFF7C8CC6);
	public static final OreRegistryGroup NICKEL = new OreRegistryGroup("nickel", 0xFFA9A984);
	public static final OreRegistryGroup OSMIUM = new OreRegistryGroup("osmium", 0xFFC0C9DD);
	public static final OreRegistryGroup PLATINUM = new OreRegistryGroup("platinum", 0xFFB5B5FF);
	public static final OreRegistryGroup SILVER = new OreRegistryGroup("silver", 0xFFA4E0E7);
	public static final OreRegistryGroup TIN = new OreRegistryGroup("tin", 0xFF787878);
	public static final OreRegistryGroup URANIUM = new OreRegistryGroup("uranium", 0xFF7EE778);
	public static final OreRegistryGroup ZINC = new OreRegistryGroup("zinc", 0xFFB5B5B5);

	public static final AlloyRegistryGroup STEEL = new AlloyRegistryGroup("steel");
	public static final AlloyRegistryGroup INVAR = new AlloyRegistryGroup("invar");
	public static final AlloyRegistryGroup ELECTRUM = new AlloyRegistryGroup("electrum");
	public static final AlloyRegistryGroup BRONZE = new AlloyRegistryGroup("bronze");
	public static final AlloyRegistryGroup ENDERIUM = new AlloyRegistryGroup("enderium");
	public static final AlloyRegistryGroup LUMIUM = new AlloyRegistryGroup("lumium");
	public static final AlloyRegistryGroup SIGNALUM = new AlloyRegistryGroup("signalum");
	public static final AlloyRegistryGroup CONSTANTAN = new AlloyRegistryGroup("constantan");

	public static final VanillaRegistryGroup DIAMOND = new VanillaRegistryGroup("diamond", Tags.Items.GEMS_DIAMOND);
	public static final VanillaRegistryGroup IRON = new VanillaRegistryGroup("iron", Tags.Items.INGOTS_IRON);
	public static final VanillaRegistryGroup GOLD = new VanillaRegistryGroup("gold", Tags.Items.INGOTS_GOLD);
	public static final VanillaRegistryGroup COPPER = new VanillaRegistryGroup("copper", ItemTagRegistry.COPPER_INGOT);

	public static final RegistryObject<Item> COPPER_NUGGET = material("copper_nugget");

	// Temporary
	public static final RegistryObject<Item> COPPER_INGOT = material("copper_ingot");

//TO-DO ORES from BLOCKS for other vanilla ores
	public static final OtherOreRegistryGroup OTHER_COAL = new OtherOreRegistryGroup("coal", Items.COAL_ORE, Items.COAL);
	public static final OtherOreRegistryGroup OTHER_IRON = new OtherOreRegistryGroup("iron", Items.IRON_ORE, Items.IRON_INGOT);
	public static final OtherOreRegistryGroup OTHER_REDSTONE = new OtherOreRegistryGroup("redstone", Items.REDSTONE_ORE, Items.REDSTONE);
	public static final OtherOreRegistryGroup OTHER_DIAMOND = new OtherOreRegistryGroup("diamond", Items.DIAMOND_ORE, Items.DIAMOND);
	public static final OtherOreRegistryGroup OTHER_LAPIS = new OtherOreRegistryGroup("lapis", Items.LAPIS_ORE, Items.LAPIS_LAZULI);

	/**
	 * Register a BlockItem for a Block
	 *
	 * @param registryObject the Block
	 * @return the new registry object
	 */
	public static RegistryObject<BlockItem> blockItem(RegistryObject<Block> registryObject) {
		return BlockList.ITEMS.register(registryObject.getId().getPath(),
				() -> new BlockItem(registryObject.get(), new Item.Properties().tab(Reference.GROUP)));
	}

	/**
	 * Register simple materials with no extra properties
	 *
	 * @param path registry location
	 * @return the new registry object
	 */
	public static RegistryObject<Item> material(String path) {
		return BlockList.ITEMS.register(path, () -> new Item(new Item.Properties().tab(Reference.GROUP)));
	}
}

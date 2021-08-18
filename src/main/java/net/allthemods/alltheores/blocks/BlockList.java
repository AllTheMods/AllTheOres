package net.allthemods.alltheores.blocks;

import net.allthemods.alltheores.infos.Reference;
import net.allthemods.alltheores.items.OreHammer;
import net.allthemods.alltheores.meka.Clump;
import net.allthemods.alltheores.meka.Crystal;
import net.allthemods.alltheores.meka.DirtyDust;
import net.allthemods.alltheores.meka.Shard;
import net.allthemods.alltheores.worldgen.features.OreVein;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.fluids.FluidAttributes;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fluids.ForgeFlowingFluid.Flowing;
import net.minecraftforge.fluids.ForgeFlowingFluid.Source;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockList {

	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
			Reference.MOD_ID);

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Reference.MOD_ID);
	public static final DeferredRegister<Fluid> FLUIDS = DeferredRegister.create(ForgeRegistries.FLUIDS,
			Reference.MOD_ID);
	public static final DeferredRegister<Feature<?>> FEATURES = DeferredRegister.create(ForgeRegistries.FEATURES,
			Reference.MOD_ID);


	public static final ResourceLocation MOLTEN_STILL = new ResourceLocation(Reference.MOD_ID,
			"block/fluid/molten_metal");
	public static final ResourceLocation MOLTEN_FLOW = new ResourceLocation(Reference.MOD_ID,
			"block/fluid/molten_metal_flow");



	public static final RegistryObject<Block> ALUMINUM_SLATE_ORE = BLOCKS.register("aluminum_slate_ore",() -> new AOreBlock(1.0f,1.0f));
	public static final RegistryObject<Block> ALUMINUM_ORE = BLOCKS.register("aluminum_ore",() -> new AOreBlock( 0.75f,0.75f));
	public static final RegistryObject<Block> OTHER_ALUMINUM_ORE = BLOCKS.register("other_aluminum_ore", OtherOreBlock::new);
	public static final RegistryObject<Block> ALUMINUM_BLOCK = BLOCKS.register("aluminum_block",() -> new Block(Block.Properties.of(Material.METAL).strength(0.85f,1.0f).sound(SoundType.METAL)));
	public static final RegistryObject<Block> RAW_ALUMINUM_BLOCK = BLOCKS.register("raw_aluminum_block",() -> new Block(Block.Properties.of(Material.STONE).strength(0.75f,0.75f)));
	public static final RegistryObject<Item> RAW_ALUMINUM_BLOCK_ITEM = ITEMS.register("raw_aluminum_block",
			() -> new BlockItem(RAW_ALUMINUM_BLOCK.get(), new Item.Properties().tab(Reference.GROUP)));

	public static final RegistryObject<Item> ALUMINUM_SLATE_ORE_ITEM = ITEMS.register("aluminum_slate_ore",
			() -> new ToolTipBlockItem(ALUMINUM_SLATE_ORE.get(), new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> ALUMINUM_ORE_ITEM = ITEMS.register("aluminum_ore",
			() -> new ToolTipBlockItem(ALUMINUM_ORE.get(), new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> OTHER_ALUMINUM_ORE_ITEM = ITEMS.register("other_aluminum_ore",
			() -> new BlockItem(OTHER_ALUMINUM_ORE.get(), new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> ALUMINUM_BLOCK_ITEM = ITEMS.register("aluminum_block",
			() -> new BlockItem(ALUMINUM_BLOCK.get(), new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> ALUMINUM_INGOT = ITEMS.register("aluminum_ingot",
			() -> new Item(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> ALUMINUM_NUGGET = ITEMS.register("aluminum_nugget",
			() -> new Item(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> ALUMINUM_DUST = ITEMS.register("aluminum_dust",
			() -> new Item(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> ALUMINUM_RAW = ITEMS.register("raw_aluminum",
			() -> new Item(new Item.Properties().tab(Reference.GROUP)));

	public static final RegistryObject<Item> COPPER_NUGGET = ITEMS.register("copper_nugget",
			() -> new Item(new Item.Properties().tab(Reference.GROUP)));


	public static final RegistryObject<Block> LEAD_SLATE_ORE = BLOCKS.register("lead_slate_ore", () -> new AOreBlock(1.0f,1.0f));
	public static final RegistryObject<Block> LEAD_ORE = BLOCKS.register("lead_ore",() -> new AOreBlock(0.75f,0.75f));
	public static final RegistryObject<Block> OTHER_LEAD_ORE = BLOCKS.register("other_lead_ore", OtherOreBlock::new);
	public static final RegistryObject<Block> LEAD_BLOCK = BLOCKS.register("lead_block",() -> new Block(Block.Properties.of(Material.METAL).strength(0.85f,1.0f).sound(SoundType.METAL)));
	public static final RegistryObject<Block> RAW_LEAD_BLOCK = BLOCKS.register("raw_lead_block",() -> new Block(Block.Properties.of(Material.STONE).strength(0.75f,0.75f)));
	public static final RegistryObject<Item> RAW_LEAD_BLOCK_ITEM = ITEMS.register("raw_lead_block",
			() -> new BlockItem(RAW_LEAD_BLOCK.get(), new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> LEAD_SLATE_ORE_ITEM = ITEMS.register("lead_slate_ore",
			() -> new ToolTipBlockItem(LEAD_SLATE_ORE.get(), new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> LEAD_ORE_ITEM = ITEMS.register("lead_ore",
			() -> new ToolTipBlockItem(LEAD_ORE.get(), new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> OTHER_LEAD_ORE_ITEM = ITEMS.register("other_lead_ore",
			() -> new BlockItem(OTHER_LEAD_ORE.get(), new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> LEAD_BLOCK_ITEM = ITEMS.register("lead_block",
			() -> new BlockItem(LEAD_BLOCK.get(), new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> LEAD_INGOT = ITEMS.register("lead_ingot",
			() -> new Item(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> LEAD_NUGGET = ITEMS.register("lead_nugget",
			() -> new Item(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> LEAD_DUST = ITEMS.register("lead_dust",
			() -> new Item(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> LEAD_RAW = ITEMS.register("raw_lead",
			() -> new Item(new Item.Properties().tab(Reference.GROUP)));

	public static final RegistryObject<Block> NICKEL_SLATE_ORE = BLOCKS.register("nickel_slate_ore", () -> new AOreBlock(1.0f,1.0f));
	public static final RegistryObject<Block> NICKEL_ORE = BLOCKS.register("nickel_ore", () -> new AOreBlock(0.75f,0.75f));
	public static final RegistryObject<Block> OTHER_NICKEL_ORE = BLOCKS.register("other_nickel_ore", OtherOreBlock::new);
	public static final RegistryObject<Block> NICKEL_BLOCK = BLOCKS.register("nickel_block", () -> new Block(Block.Properties.of(Material.METAL).strength(0.85f,1.0f).sound(SoundType.METAL)));
	public static final RegistryObject<Block> RAW_NICKEL_BLOCK = BLOCKS.register("raw_nickel_block",() -> new Block(Block.Properties.of(Material.STONE).strength(0.75f,0.75f)));
	public static final RegistryObject<Item> RAW_NICKEL_BLOCK_ITEM = ITEMS.register("raw_nickel_block",
			() -> new BlockItem(RAW_NICKEL_BLOCK.get(), new Item.Properties().tab(Reference.GROUP)));

	public static final RegistryObject<Item> NICKEL_SLATE_ORE_ITEM = ITEMS.register("nickel_slate_ore",
			() -> new ToolTipBlockItem(NICKEL_SLATE_ORE.get(), new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> NICKEL_ORE_ITEM = ITEMS.register("nickel_ore",
			() -> new ToolTipBlockItem(NICKEL_ORE.get(), new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> OTHER_NICKEL_ORE_ITEM = ITEMS.register("other_nickel_ore",
			() -> new BlockItem(OTHER_NICKEL_ORE.get(), new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> NICKEL_BLOCK_ITEM = ITEMS.register("nickel_block",
			() -> new BlockItem(NICKEL_BLOCK.get(), new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> NICKEL_INGOT = ITEMS.register("nickel_ingot",
			() -> new Item(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> NICKEL_NUGGET = ITEMS.register("nickel_nugget",
			() -> new Item(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> NICKEL_DUST = ITEMS.register("nickel_dust",
			() -> new Item(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> NICKEL_RAW = ITEMS.register("raw_nickel",
			() -> new Item(new Item.Properties().tab(Reference.GROUP)));
public static final RegistryObject<Block> OSMIUM_SLATE_ORE = BLOCKS.register("osmium_slate_ore",() -> new AOreBlock(1.0f,1.0f));
	public static final RegistryObject<Block> OSMIUM_ORE = BLOCKS.register("osmium_ore", () -> new AOreBlock(0.75f,0.75f));
	public static final RegistryObject<Block> OTHER_OSMIUM_ORE = BLOCKS.register("other_osmium_ore", OtherOreBlock::new);
	public static final RegistryObject<Block> OSMIUM_BLOCK = BLOCKS.register("osmium_block", () -> new Block(Block.Properties.of(Material.METAL).strength(0.85f,1.0f).sound(SoundType.METAL)));
	public static final RegistryObject<Block> RAW_OSMIUM_BLOCK = BLOCKS.register("raw_osmium_block",() -> new Block(Block.Properties.of(Material.STONE).strength(0.75f,0.75f)));
	public static final RegistryObject<Item> RAW_OSMIUM_BLOCK_ITEM = ITEMS.register("raw_osmium_block",
			() -> new BlockItem(RAW_OSMIUM_BLOCK.get(), new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> OSMIUM_ORE_ITEM = ITEMS.register("osmium_ore",
			() -> new ToolTipBlockItem(OSMIUM_ORE.get(), new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> OSMIUM_SLATE_ORE_ITEM = ITEMS.register("osmium_slate_ore",
			() -> new ToolTipBlockItem(OSMIUM_SLATE_ORE.get(), new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> OTHER_OSMIUM_ORE_ITEM = ITEMS.register("other_osmium_ore",
			() -> new BlockItem(OTHER_OSMIUM_ORE.get(), new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> OSMIUM_BLOCK_ITEM = ITEMS.register("osmium_block",
			() -> new BlockItem(OSMIUM_BLOCK.get(), new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> OSMIUM_INGOT = ITEMS.register("osmium_ingot",
			() -> new Item(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> OSMIUM_NUGGET = ITEMS.register("osmium_nugget",
			() -> new Item(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> OSMIUM_DUST = ITEMS.register("osmium_dust",
			() -> new Item(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> OSMIUM_RAW = ITEMS.register("raw_osmium",
			() -> new Item(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Block> PLATINUM_SLATE_ORE = BLOCKS.register("platinum_slate_ore", () -> new AOreBlock(1.0f,1.0f));
	public static final RegistryObject<Block> PLATINUM_ORE = BLOCKS.register("platinum_ore", () -> new AOreBlock(0.75f,0.75f));
	public static final RegistryObject<Block> OTHER_PLATINUM_ORE = BLOCKS.register("other_platinum_ore", OtherOreBlock::new);
	public static final RegistryObject<Block> PLATINUM_BLOCK = BLOCKS.register("platinum_block", () -> new Block(Block.Properties.of(Material.METAL).strength(0.85f,1.0f).sound(SoundType.METAL)));
	public static final RegistryObject<Block> RAW_PLATINUM_BLOCK = BLOCKS.register("raw_platinum_block",() -> new Block(Block.Properties.of(Material.STONE).strength(0.75f,0.75f)));
	public static final RegistryObject<Item> RAW_PLATINUM_BLOCK_ITEM = ITEMS.register("raw_platinum_block",
			() -> new BlockItem(RAW_PLATINUM_BLOCK.get(), new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> PLATINUM_SLATE_ORE_ITEM = ITEMS.register("platinum_slate_ore",
			() -> new ToolTipBlockItem(PLATINUM_SLATE_ORE.get(), new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> PLATINUM_ORE_ITEM = ITEMS.register("platinum_ore",
			() -> new ToolTipBlockItem(PLATINUM_ORE.get(), new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> OTHER_PLATINUM_ORE_ITEM = ITEMS.register("other_platinum_ore",
			() -> new BlockItem(OTHER_PLATINUM_ORE.get(), new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> PLATINUM_BLOCK_ITEM = ITEMS.register("platinum_block",
			() -> new BlockItem(PLATINUM_BLOCK.get(), new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> PLATINUM_INGOT = ITEMS.register("platinum_ingot",
			() -> new Item(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> PLATINUM_NUGGET = ITEMS.register("platinum_nugget",
			() -> new Item(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> PLATINUM_DUST = ITEMS.register("platinum_dust",
			() -> new Item(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> PLATINUM_RAW = ITEMS.register("raw_platinum",
			() -> new Item(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Block> SILVER_SLATE_ORE = BLOCKS.register("silver_slate_ore", () -> new AOreBlock(1.0f,1.0f));
	public static final RegistryObject<Block> SILVER_ORE = BLOCKS.register("silver_ore", () -> new AOreBlock(0.75f,0.75f));
	public static final RegistryObject<Block> OTHER_SILVER_ORE = BLOCKS.register("other_silver_ore", OtherOreBlock::new);
	public static final RegistryObject<Block> SILVER_BLOCK = BLOCKS.register("silver_block", () -> new Block(Block.Properties.of(Material.METAL).strength(0.85f,1.0f).sound(SoundType.METAL)));
	public static final RegistryObject<Block> RAW_SILVER_BLOCK = BLOCKS.register("raw_silver_block",() -> new Block(Block.Properties.of(Material.STONE).strength(0.75f,0.75f)));
	public static final RegistryObject<Item> RAW_SILVER_BLOCK_ITEM = ITEMS.register("raw_silver_block",
			() -> new BlockItem(RAW_SILVER_BLOCK.get(), new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> SILVER_SLATE_ORE_ITEM = ITEMS.register("silver_slate_ore",
			() -> new ToolTipBlockItem(SILVER_SLATE_ORE.get(), new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> SILVER_ORE_ITEM = ITEMS.register("silver_ore",
			() -> new ToolTipBlockItem(SILVER_ORE.get(), new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> OTHER_SILVER_ORE_ITEM = ITEMS.register("other_silver_ore",
			() -> new BlockItem(OTHER_SILVER_ORE.get(), new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> SILVER_BLOCK_ITEM = ITEMS.register("silver_block",
			() -> new BlockItem(SILVER_BLOCK.get(), new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> SILVER_INGOT = ITEMS.register("silver_ingot",
			() -> new Item(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> SILVER_NUGGET = ITEMS.register("silver_nugget",
			() -> new Item(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> SILVER_DUST = ITEMS.register("silver_dust",
			() -> new Item(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> SILVER_RAW = ITEMS.register("raw_silver",
			() -> new Item(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Block> TIN_SLATE_ORE = BLOCKS.register("tin_slate_ore", () -> new AOreBlock(1.0f,1.0f));
	public static final RegistryObject<Block> TIN_ORE = BLOCKS.register("tin_ore", () -> new AOreBlock(0.75f,0.75f));
	public static final RegistryObject<Block> OTHER_TIN_ORE = BLOCKS.register("other_tin_ore", OtherOreBlock::new);
	public static final RegistryObject<Block> TIN_BLOCK = BLOCKS.register("tin_block", () -> new Block(Block.Properties.of(Material.METAL).strength(0.85f,1.0f).sound(SoundType.METAL)));
	public static final RegistryObject<Block> RAW_TIN_BLOCK = BLOCKS.register("raw_tin_block",() -> new Block(Block.Properties.of(Material.STONE).strength(0.75f,0.75f)));
	public static final RegistryObject<Item> RAW_TIN_BLOCK_ITEM = ITEMS.register("raw_tin_block",
			() -> new BlockItem(RAW_TIN_BLOCK.get(), new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> TIN_ORE_ITEM = ITEMS.register("tin_ore",
			() -> new ToolTipBlockItem(TIN_ORE.get(), new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> TIN_SLATE_ORE_ITEM = ITEMS.register("tin_slate_ore",
			() -> new ToolTipBlockItem(TIN_SLATE_ORE.get(), new Item.Properties().tab(Reference.GROUP)));

	public static final RegistryObject<Item> OTHER_TIN_ORE_ITEM = ITEMS.register("other_tin_ore",
			() -> new BlockItem(OTHER_TIN_ORE.get(), new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> TIN_BLOCK_ITEM = ITEMS.register("tin_block",
			() -> new BlockItem(TIN_BLOCK.get(), new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> TIN_INGOT = ITEMS.register("tin_ingot",
			() -> new Item(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> TIN_NUGGET = ITEMS.register("tin_nugget",
			() -> new Item(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> TIN_DUST = ITEMS.register("tin_dust",
			() -> new Item(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> TIN_RAW = ITEMS.register("raw_tin",
			() -> new Item(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Block> URANIUM_SLATE_ORE = BLOCKS.register("uranium_slate_ore", () -> new AOreBlock(1.0f,1.0f));
	public static final RegistryObject<Block> URANIUM_ORE = BLOCKS.register("uranium_ore", () -> new AOreBlock(0.75f,0.75f));
	public static final RegistryObject<Block> OTHER_URANIUM_ORE = BLOCKS.register("other_uranium_ore", OtherOreBlock::new);
	public static final RegistryObject<Block> URANIUM_BLOCK = BLOCKS.register("uranium_block", () -> new Block(Block.Properties.of(Material.METAL).strength(0.85f,1.0f).sound(SoundType.METAL)));
	public static final RegistryObject<Block> RAW_URANIUM_BLOCK = BLOCKS.register("raw_uranium_block",() -> new Block(Block.Properties.of(Material.STONE).strength(0.75f,0.75f)));
	public static final RegistryObject<Item> RAW_URANIUM_BLOCK_ITEM = ITEMS.register("raw_uranium_block",
			() -> new BlockItem(RAW_URANIUM_BLOCK.get(), new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> URANIUM_ORE_ITEM = ITEMS.register("uranium_ore",
			() -> new ToolTipBlockItem(URANIUM_ORE.get(), new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> URANIUM_SLATE_ORE_ITEM = ITEMS.register("uranium_slate_ore",
			() -> new ToolTipBlockItem(URANIUM_SLATE_ORE.get(), new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> OTHER_URANIUM_ORE_ITEM = ITEMS.register("other_uranium_ore",
			() -> new BlockItem(OTHER_URANIUM_ORE.get(), new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> URANIUM_BLOCK_ITEM = ITEMS.register("uranium_block",
			() -> new BlockItem(URANIUM_BLOCK.get(), new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> URANIUM_INGOT = ITEMS.register("uranium_ingot",
			() -> new Item(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> URANIUM_NUGGET = ITEMS.register("uranium_nugget",
			() -> new Item(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> URANIUM_DUST = ITEMS.register("uranium_dust",
			() -> new Item(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> URANIUM_RAW = ITEMS.register("raw_uranium",
			() -> new Item(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Block> ZINC_SLATE_ORE = BLOCKS.register("zinc_slate_ore", () -> new AOreBlock(0.75f,0.75f));
	public static final RegistryObject<Block> ZINC_ORE = BLOCKS.register("zinc_ore", () -> new AOreBlock(0.75f,0.75f));
	public static final RegistryObject<Block> OTHER_ZINC_ORE = BLOCKS.register("other_zinc_ore", OtherOreBlock::new);
	public static final RegistryObject<Block> ZINC_BLOCK = BLOCKS.register("zinc_block", () -> new Block(Block.Properties.of(Material.METAL).strength(0.85f,1.0f).sound(SoundType.METAL)));
	public static final RegistryObject<Block> RAW_ZINC_BLOCK = BLOCKS.register("raw_zinc_block",() -> new Block(Block.Properties.of(Material.STONE).strength(0.75f,0.75f)));
	public static final RegistryObject<Item> RAW_ZINC_BLOCK_ITEM = ITEMS.register("raw_zinc_block",
			() -> new BlockItem(RAW_ZINC_BLOCK.get(), new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> ZINC_ORE_ITEM = ITEMS.register("zinc_ore",
			() -> new ToolTipBlockItem(ZINC_ORE.get(), new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> ZINC_SLATE_ORE_ITEM = ITEMS.register("zinc_slate_ore",
			() -> new ToolTipBlockItem(ZINC_SLATE_ORE.get(), new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> OTHER_ZINC_ORE_ITEM = ITEMS.register("other_zinc_ore",
			() -> new BlockItem(OTHER_ZINC_ORE.get(), new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> ZINC_BLOCK_ITEM = ITEMS.register("zinc_block",
			() -> new BlockItem(ZINC_BLOCK.get(), new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> ZINC_INGOT = ITEMS.register("zinc_ingot",
			() -> new Item(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> ZINC_NUGGET = ITEMS.register("zinc_nugget",
			() -> new Item(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> ZINC_DUST = ITEMS.register("zinc_dust",
			() -> new Item(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> ZINC_RAW = ITEMS.register("raw_zinc",
			() -> new Item(new Item.Properties().tab(Reference.GROUP)));


//TO-DO ORES from BLOCKS for other vanilla ores
	public static final RegistryObject<Block> OTHER_COAL_ORE = BLOCKS.register("other_coal_ore", OtherOreBlock::new);
	public static final RegistryObject<Block> OTHER_IRON_ORE = BLOCKS.register("other_iron_ore", OtherOreBlock::new);
	public static final RegistryObject<Block> OTHER_REDSTONE_ORE = BLOCKS.register("other_redstone_ore", OtherOreBlock::new);
	public static final RegistryObject<Block> OTHER_DIAMOND_ORE = BLOCKS.register("other_diamond_ore", OtherOreBlock::new);
	public static final RegistryObject<Block> OTHER_LAPIS_ORE = BLOCKS.register("other_lapis_ore", OtherOreBlock::new);
	
	public static final RegistryObject<Item> OTHER_COAL_ORE_ITEM = ITEMS.register("other_coal_ore",
			() -> new BlockItem(OTHER_COAL_ORE.get(), new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> OTHER_IRON_ORE_ITEM = ITEMS.register("other_iron_ore",
			() -> new BlockItem(OTHER_IRON_ORE.get(), new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> OTHER_REDSTONE_ORE_ITEM = ITEMS.register("other_redstone_ore",
			() -> new BlockItem(OTHER_REDSTONE_ORE.get(), new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> OTHER_DIAMOND_ORE_ITEM = ITEMS.register("other_diamond_ore",
			() -> new BlockItem(OTHER_DIAMOND_ORE.get(), new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> OTHER_LAPIS_ORE_ITEM = ITEMS.register("other_lapis_ore",
			() -> new BlockItem(OTHER_LAPIS_ORE.get(), new Item.Properties().tab(Reference.GROUP)));




	// ********************* MISC STUFF

	public static final RegistryObject<Item> ORE_HAMMER = ITEMS.register("ore_hammer", () -> new OreHammer(new Item.Properties().tab(Reference.GROUP)));


	// ********************** MEK PROCESSING

	// *********************** Misc Dusts

	public static final RegistryObject<Item> IRON_DUST = ITEMS.register("iron_dust",() -> new Item(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> COPPER_DUST = ITEMS.register("copper_dust",() -> new Item(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> GOLD_DUST = ITEMS.register("gold_dust",() -> new Item(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> DIAMOND_DUST = ITEMS.register("diamond_dust",() -> new Item(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> NETHERITE_DUST = ITEMS.register("netherite_dust",() -> new Item(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> BRONZE_DUST = ITEMS.register("bronze_dust",() -> new Item(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> CONSTANTAN_DUST = ITEMS.register("constantan_dust",() -> new Item(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> ELECTRUM_DUST = ITEMS.register("electrum_dust",() -> new Item(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> ENDERIUM_DUST = ITEMS.register("enderium_dust",() -> new Item(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> LUMIUM_DUST = ITEMS.register("lumium_dust",() -> new Item(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> SIGNALUM_DUST = ITEMS.register("signalum_dust",() -> new Item(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> STEEL_DUST = ITEMS.register("steel_dust",() -> new Item(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> INVAR_DUST = ITEMS.register("invar_dust",() -> new Item(new Item.Properties().tab(Reference.GROUP)));

	//  ***********************DIRTY DUSTS
	public static final RegistryObject<Item> ALUM_DIRTY = ITEMS.register("dirty_aluminum_dust", () -> new DirtyDust(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> COPP_DIRTY = ITEMS.register("dirty_copper_dust", () -> new DirtyDust(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> LEAD_DIRTY = ITEMS.register("dirty_lead_dust", () -> new DirtyDust(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> NICK_DIRTY = ITEMS.register("dirty_nickel_dust", () -> new DirtyDust(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> OSMI_DIRTY = ITEMS.register("dirty_osmium_dust", () -> new DirtyDust(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> PLAT_DIRTY = ITEMS.register("dirty_platinum_dust", () -> new DirtyDust(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> SILV_DIRTY = ITEMS.register("dirty_silver_dust", () -> new DirtyDust(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> TIN_DIRTY = ITEMS.register("dirty_tin_dust", () -> new DirtyDust(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> URAN_DIRTY = ITEMS.register("dirty_uranium_dust", () -> new DirtyDust(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> ZINC_DIRTY = ITEMS.register("dirty_zinc_dust", () -> new DirtyDust(new Item.Properties().tab(Reference.GROUP)));

	//  ***********************SHARDS
	public static final RegistryObject<Item> ALUM_SHARD = ITEMS.register("aluminum_shard", () -> new Shard(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> COPP_SHARD = ITEMS.register("copper_shard", () -> new Shard(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> LEAD_SHARD = ITEMS.register("lead_shard", () -> new Shard(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> NICK_SHARD = ITEMS.register("nickel_shard", () -> new Shard(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> OSMI_SHARD = ITEMS.register("osmium_shard", () -> new Shard(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> PLAT_SHARD = ITEMS.register("platinum_shard", () -> new Shard(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> SILV_SHARD = ITEMS.register("silver_shard", () -> new Shard(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> TIN_SHARD = ITEMS.register("tin_shard", () -> new Shard(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> URAN_SHARD = ITEMS.register("uranium_shard", () -> new Shard(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> ZINC_SHARD = ITEMS.register("zinc_shard", () -> new Shard(new Item.Properties().tab(Reference.GROUP)));

	//  ************************CRYSTALS
	public static final RegistryObject<Item> ALUM_CRYSTAL = ITEMS.register("aluminum_crystal", () -> new Crystal(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> COPP_CRYSTAL = ITEMS.register("copper_crystal", () -> new Crystal(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> LEAD_CRYSTAL = ITEMS.register("lead_crystal", () -> new Crystal(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> NICK_CRYSTAL = ITEMS.register("nickel_crystal", () -> new Crystal(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> OSMI_CRYSTAL = ITEMS.register("osmium_crystal", () -> new Crystal(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> PLAT_CRYSTAL = ITEMS.register("platinum_crystal", () -> new Crystal(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> SILV_CRYSTAL = ITEMS.register("silver_crystal", () -> new Crystal(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> TIN_CRYSTAL = ITEMS.register("tin_crystal", () -> new Crystal(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> URAN_CRYSTAL = ITEMS.register("uranium_crystal", () -> new Crystal(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> ZINC_CRYSTAL = ITEMS.register("zinc_crystal", () -> new Crystal(new Item.Properties().tab(Reference.GROUP)));

	//  ************************CLUMPS
	public static final RegistryObject<Item> ALUM_CLUMP = ITEMS.register("aluminum_clump", () -> new Clump(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> COPP_CLUMP = ITEMS.register("copper_clump", () -> new Clump(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> LEAD_CLUMP = ITEMS.register("lead_clump", () -> new Clump(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> NICK_CLUMP = ITEMS.register("nickel_clump", () -> new Clump(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> OSMI_CLUMP = ITEMS.register("osmium_clump", () -> new Clump(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> PLAT_CLUMP = ITEMS.register("platinum_clump", () -> new Clump(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> SILV_CLUMP = ITEMS.register("silver_clump", () -> new Clump(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> TIN_CLUMP = ITEMS.register("tin_clump", () -> new Clump(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> URAN_CLUMP = ITEMS.register("uranium_clump", () -> new Clump(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> ZINC_CLUMP = ITEMS.register("zinc_clump", () -> new Clump(new Item.Properties().tab(Reference.GROUP)));


	// ALLTHERODS, ALLTHEGEARS, ALLTHEPLATES

	public static final RegistryObject<Item> ALUMINUM_ROD = ITEMS.register("aluminum_rod", () -> new Item(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> LEAD_ROD = ITEMS.register("lead_rod", () -> new Item(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> NICKEL_ROD = ITEMS.register("nickel_rod", () -> new Item(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> OSMIUM_ROD = ITEMS.register("osmium_rod", () -> new Item(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> PLATINUM_ROD = ITEMS.register("platinum_rod", () -> new Item(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> SILVER_ROD = ITEMS.register("silver_rod", () -> new Item(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> TIN_ROD = ITEMS.register("tin_rod", () -> new Item(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> URANIUM_ROD = ITEMS.register("uranium_rod", () -> new Item(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> ZINC_ROD = ITEMS.register("zinc_rod", () -> new Item(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> STEEL_ROD = ITEMS.register("steel_rod", () -> new Item(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> INVAR_ROD = ITEMS.register("invar_rod", () -> new Item(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> ELECTRUM_ROD = ITEMS.register("electrum_rod", () -> new Item(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> BRONZE_ROD = ITEMS.register("bronze_rod", () -> new Item(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> IRON_ROD = ITEMS.register("iron_rod", () -> new Item(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> GOLD_ROD = ITEMS.register("gold_rod", () -> new Item(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> DIAMOND_ROD = ITEMS.register("diamond_rod", () -> new Item(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> COPPER_ROD = ITEMS.register("copper_rod", () -> new Item(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> ENDERIUM_ROD = ITEMS.register("enderium_rod", () -> new Item(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> LUMIUM_ROD = ITEMS.register("lumium_rod", () -> new Item(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> SIGNALUM_ROD = ITEMS.register("signalum_rod", () -> new Item(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> CONSTANTAN_ROD = ITEMS.register("constantan_rod", () -> new Item(new Item.Properties().tab(Reference.GROUP)));


	public static final RegistryObject<Item> ALUMINUM_GEAR = ITEMS.register("aluminum_gear", () -> new Item(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> LEAD_GEAR = ITEMS.register("lead_gear", () -> new Item(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> NICKEL_GEAR = ITEMS.register("nickel_gear", () -> new Item(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> OSMIUM_GEAR = ITEMS.register("osmium_gear", () -> new Item(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> PLATINUM_GEAR = ITEMS.register("platinum_gear", () -> new Item(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> SILVER_GEAR = ITEMS.register("silver_gear", () -> new Item(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> TIN_GEAR = ITEMS.register("tin_gear", () -> new Item(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> URANIUM_GEAR = ITEMS.register("uranium_gear", () -> new Item(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> ZINC_GEAR = ITEMS.register("zinc_gear", () -> new Item(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> STEEL_GEAR = ITEMS.register("steel_gear", () -> new Item(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> INVAR_GEAR = ITEMS.register("invar_gear", () -> new Item(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> ELECTRUM_GEAR = ITEMS.register("electrum_gear", () -> new Item(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> BRONZE_GEAR = ITEMS.register("bronze_gear", () -> new Item(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> IRON_GEAR = ITEMS.register("iron_gear", () -> new Item(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> GOLD_GEAR = ITEMS.register("gold_gear", () -> new Item(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> DIAMOND_GEAR = ITEMS.register("diamond_gear", () -> new Item(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> COPPER_GEAR = ITEMS.register("copper_gear", () -> new Item(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> ENDERIUM_GEAR = ITEMS.register("enderium_gear", () -> new Item(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> LUMIUM_GEAR = ITEMS.register("lumium_gear", () -> new Item(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> SIGNALUM_GEAR = ITEMS.register("signalum_gear", () -> new Item(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> CONSTANTAN_GEAR = ITEMS.register("constantan_gear", () -> new Item(new Item.Properties().tab(Reference.GROUP)));


	public static final RegistryObject<Item> ALUMINUM_PLATE = ITEMS.register("aluminum_plate", () -> new Item(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> LEAD_PLATE = ITEMS.register("lead_plate", () -> new Item(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> NICKEL_PLATE = ITEMS.register("nickel_plate", () -> new Item(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> OSMIUM_PLATE = ITEMS.register("osmium_plate", () -> new Item(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> PLATINUM_PLATE = ITEMS.register("platinum_plate", () -> new Item(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> SILVER_PLATE = ITEMS.register("silver_plate", () -> new Item(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> TIN_PLATE = ITEMS.register("tin_plate", () -> new Item(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> URANIUM_PLATE = ITEMS.register("uranium_plate", () -> new Item(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> ZINC_PLATE = ITEMS.register("zinc_plate", () -> new Item(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> STEEL_PLATE = ITEMS.register("steel_plate", () -> new Item(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> INVAR_PLATE = ITEMS.register("invar_plate", () -> new Item(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> ELECTRUM_PLATE = ITEMS.register("electrum_plate", () -> new Item(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> BRONZE_PLATE = ITEMS.register("bronze_plate", () -> new Item(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> IRON_PLATE = ITEMS.register("iron_plate", () -> new Item(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> GOLD_PLATE = ITEMS.register("gold_plate", () -> new Item(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> DIAMOND_PLATE = ITEMS.register("diamond_plate", () -> new Item(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> COPPER_PLATE = ITEMS.register("copper_plate", () -> new Item(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> ENDERIUM_PLATE = ITEMS.register("enderium_plate", () -> new Item(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> LUMIUM_PLATE = ITEMS.register("lumium_plate", () -> new Item(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> SIGNALUM_PLATE = ITEMS.register("signalum_plate", () -> new Item(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> CONSTANTAN_PLATE = ITEMS.register("constantan_plate", () -> new Item(new Item.Properties().tab(Reference.GROUP)));

	public static final RegistryObject<Item> STEEL_NUGGET = ITEMS.register("steel_nugget", () -> new Item(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> INVAR_NUGGET = ITEMS.register("invar_nugget", () -> new Item(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> ELECTRUM_NUGGET = ITEMS.register("electrum_nugget", () -> new Item(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> BRONZE_NUGGET = ITEMS.register("bronze_nugget", () -> new Item(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> ENDERIUM_NUGGET = ITEMS.register("enderium_nugget", () -> new Item(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> LUMIUM_NUGGET = ITEMS.register("lumium_nugget", () -> new Item(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> SIGNALUM_NUGGET = ITEMS.register("signalum_nugget", () -> new Item(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> CONSTANTAN_NUGGET = ITEMS.register("constantan_nugget", () -> new Item(new Item.Properties().tab(Reference.GROUP)));

	public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register("steel_ingot", () -> new Item(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> INVAR_INGOT = ITEMS.register("invar_ingot", () -> new Item(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> ELECTRUM_INGOT = ITEMS.register("electrum_ingot", () -> new Item(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> BRONZE_INGOT = ITEMS.register("bronze_ingot", () -> new Item(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> ENDERIUM_INGOT = ITEMS.register("enderium_ingot", () -> new Item(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> LUMIUM_INGOT = ITEMS.register("lumium_ingot", () -> new Item(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> SIGNALUM_INGOT = ITEMS.register("signalum_ingot", () -> new Item(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> CONSTANTAN_INGOT = ITEMS.register("constantan_ingot", () -> new Item(new Item.Properties().tab(Reference.GROUP)));

	public static final RegistryObject<Block> STEEL_BLOCK = BLOCKS.register("steel_block", () -> new Block(Block.Properties.of(Material.METAL).strength(1.0f,1.0f).requiresCorrectToolForDrops().sound(SoundType.METAL)));
	public static final RegistryObject<Block> INVAR_BLOCK = BLOCKS.register("invar_block", () -> new Block(Block.Properties.of(Material.METAL).strength(1.0f,1.0f).requiresCorrectToolForDrops().sound(SoundType.METAL)));
	public static final RegistryObject<Block> ELECTRUM_BLOCK = BLOCKS.register("electrum_block", () -> new Block(Block.Properties.of(Material.METAL).strength(1.0f,1.0f).requiresCorrectToolForDrops().sound(SoundType.METAL)));
	public static final RegistryObject<Block> BRONZE_BLOCK = BLOCKS.register("bronze_block", () -> new Block(Block.Properties.of(Material.METAL).strength(1.0f,1.0f).requiresCorrectToolForDrops().sound(SoundType.METAL)));
	public static final RegistryObject<Block> ENDERIUM_BLOCK = BLOCKS.register("enderium_block", () -> new Block(Block.Properties.of(Material.METAL).strength(1.0f,1.0f).requiresCorrectToolForDrops().sound(SoundType.METAL)));
	public static final RegistryObject<Block> LUMIUM_BLOCK = BLOCKS.register("lumium_block", () -> new Block(Block.Properties.of(Material.METAL).strength(1.0f,1.0f).requiresCorrectToolForDrops().sound(SoundType.METAL)));
	public static final RegistryObject<Block> SIGNALUM_BLOCK = BLOCKS.register("signalum_block", () -> new Block(Block.Properties.of(Material.METAL).strength(1.0f,1.0f).requiresCorrectToolForDrops().sound(SoundType.METAL)));
	public static final RegistryObject<Block> CONSTANTAN_BLOCK = BLOCKS.register("constantan_block", () -> new Block(Block.Properties.of(Material.METAL).strength(1.0f,1.0f).requiresCorrectToolForDrops().sound(SoundType.METAL)));

	public static final RegistryObject<Item> STEEL_BLOCK_ITEM = ITEMS.register("steel_block", () -> new BlockItem(STEEL_BLOCK.get(), new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> INVAR_BLOCK_ITEM = ITEMS.register("invar_block", () -> new BlockItem(INVAR_BLOCK.get(), new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> ELECTRUM_BLOCK_ITEM = ITEMS.register("electrum_block", () -> new BlockItem(ELECTRUM_BLOCK.get(),new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> BRONZE_BLOCK_ITEM = ITEMS.register("bronze_block", () -> new BlockItem(BRONZE_BLOCK.get(),new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> ENDERIUM_BLOCK_ITEM = ITEMS.register("enderium_block", () -> new BlockItem(ENDERIUM_BLOCK.get(), new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> LUMIUM_BLOCK_ITEM = ITEMS.register("lumium_block", () -> new BlockItem(LUMIUM_BLOCK.get() ,new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> SIGNALUM_BLOCK_ITEM = ITEMS.register("signalum_block", () -> new BlockItem(SIGNALUM_BLOCK.get() ,new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> CONSTANTAN_BLOCK_ITEM = ITEMS.register("constantan_block", () -> new BlockItem(CONSTANTAN_BLOCK.get(),new Item.Properties().tab(Reference.GROUP)));

	// *************** FEATURES
	public static final RegistryObject<Feature<?>> ALUMINUM = FEATURES.register("aluminum_ore",() -> new OreVein(NoneFeatureConfiguration.CODEC,BlockList.ALUMINUM_ORE.get(),BlockList.ALUMINUM_SLATE_ORE.get(),BlockList.RAW_ALUMINUM_BLOCK.get()));
	public static final RegistryObject<Feature<?>> LEAD = FEATURES.register("lead_ore",() -> new OreVein(NoneFeatureConfiguration.CODEC,BlockList.LEAD_ORE.get(),BlockList.LEAD_SLATE_ORE.get(),BlockList.RAW_LEAD_BLOCK.get()));
	public static final RegistryObject<Feature<?>> NICKEL = FEATURES.register("nickel_ore",() -> new OreVein(NoneFeatureConfiguration.CODEC,BlockList.NICKEL_ORE.get(),BlockList.NICKEL_SLATE_ORE.get(),BlockList.RAW_NICKEL_BLOCK.get()));
	public static final RegistryObject<Feature<?>> OSMIUM = FEATURES.register("osmium_ore", () -> new OreVein(NoneFeatureConfiguration.CODEC,BlockList.OSMIUM_ORE.get(),BlockList.OSMIUM_SLATE_ORE.get(),BlockList.RAW_OSMIUM_BLOCK.get()));
	public static final RegistryObject<Feature<?>> PLATINUM = FEATURES.register("platinum_ore",() -> new OreVein(NoneFeatureConfiguration.CODEC,BlockList.PLATINUM_ORE.get(),BlockList.PLATINUM_SLATE_ORE.get(),BlockList.RAW_PLATINUM_BLOCK.get()));
	public static final RegistryObject<Feature<?>> SILVER = FEATURES.register("silver_ore",() -> new OreVein(NoneFeatureConfiguration.CODEC,BlockList.SILVER_ORE.get(),BlockList.SILVER_SLATE_ORE.get(),BlockList.RAW_SILVER_BLOCK.get()));
	public static final RegistryObject<Feature<?>> TIN = FEATURES.register("tin_ore",() -> new OreVein(NoneFeatureConfiguration.CODEC,BlockList.TIN_ORE.get(),BlockList.TIN_SLATE_ORE.get(),BlockList.RAW_TIN_BLOCK.get()));
	public static final RegistryObject<Feature<?>> URANIUM = FEATURES.register("uranium_ore",() -> new OreVein(NoneFeatureConfiguration.CODEC,BlockList.URANIUM_ORE.get(),BlockList.URANIUM_SLATE_ORE.get(),BlockList.RAW_URANIUM_BLOCK.get()));
	public static final RegistryObject<Feature<?>> ZINC = FEATURES.register("zinc_ore",() -> new OreVein(NoneFeatureConfiguration.CODEC,BlockList.ZINC_ORE.get(),BlockList.ZINC_SLATE_ORE.get(),BlockList.RAW_ZINC_BLOCK.get()));

}

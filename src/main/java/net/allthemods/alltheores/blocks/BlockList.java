package net.allthemods.alltheores.blocks;

import net.allthemods.alltheores.infos.Reference;
import net.allthemods.alltheores.meka.Clump;
import net.allthemods.alltheores.meka.Crystal;
import net.allthemods.alltheores.meka.DirtyDust;
import net.allthemods.alltheores.meka.Shard;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.FlowingFluidBlock;
import net.minecraft.block.material.Material;
import net.minecraft.fluid.Fluid;
import net.minecraft.item.BlockItem;
import net.minecraft.item.BucketItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.FluidAttributes;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fluids.ForgeFlowingFluid.Flowing;
import net.minecraftforge.fluids.ForgeFlowingFluid.Source;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockList {

	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
			Reference.MOD_ID);

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Reference.MOD_ID);
	public static final DeferredRegister<Fluid> FLUIDS = DeferredRegister.create(ForgeRegistries.FLUIDS,
			Reference.MOD_ID);

	public static final ResourceLocation MOLTEN_STILL = new ResourceLocation(Reference.MOD_ID,
			"block/fluid/molten_metal");
	public static final ResourceLocation MOLTEN_FLOW = new ResourceLocation(Reference.MOD_ID,
			"block/fluid/molten_metal_flow");

	public static final RegistryObject<Source> MOLTEN_ALUMINUM = FLUIDS.register("molten_aluminum",
			() -> new ForgeFlowingFluid.Source(makeMoltenAluminumProperties()));
	public static final RegistryObject<Flowing> FLOWING_MOLTEN_ALUMINUM = FLUIDS.register("flowing_molten_aluminum",
			() -> new ForgeFlowingFluid.Flowing(makeMoltenAluminumProperties()));
	public static final RegistryObject<FlowingFluidBlock> molten_Aluminum_block = BLOCKS
			.register("molten_aluminum_block", () -> new FluidBlock(MOLTEN_ALUMINUM,
					Block.Properties.of(Material.LAVA).randomTicks().lightLevel((state) -> {
						return 15;
					}).noOcclusion().strength(100.0F).jumpFactor(0.1F).speedFactor(0.01F).noDrops()));
	public static final RegistryObject<Item> moltenAluminum_bucket = ITEMS.register("molten_aluminum_bucket",
			() -> new BucketItem(MOLTEN_ALUMINUM,
					new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).tab(Reference.GROUP)));

	private static ForgeFlowingFluid.Properties makeMoltenAluminumProperties() {
		return new ForgeFlowingFluid.Properties(MOLTEN_ALUMINUM, FLOWING_MOLTEN_ALUMINUM,
				FluidAttributes.builder(MOLTEN_STILL, MOLTEN_FLOW).overlay(MOLTEN_STILL).color(0xFFE3E3E3).density(300)
						.viscosity(300).temperature(400)).bucket(moltenAluminum_bucket).block(molten_Aluminum_block);
	}
	public static final RegistryObject<Block> ALUMINUM_SLATE_ORE = BLOCKS.register("aluminum_slate_ore",() -> new AOreBlock(6.0f,6.0f));
	public static final RegistryObject<Block> ALUMINUM_ORE = BLOCKS.register("aluminum_ore",() -> new AOreBlock( 3.0f,3.0f));
	public static final RegistryObject<Block> OTHER_ALUMINUM_ORE = BLOCKS.register("other_aluminum_ore", OtherOreBlock::new);
	public static final RegistryObject<Block> ALUMINUM_BLOCK = BLOCKS.register("aluminum_block",() -> new Block(Block.Properties.of(Material.METAL).strength(5.0f,6.0f)));
	public static final RegistryObject<Block> RAW_ALUMINUM_BLOCK = BLOCKS.register("raw_aluminum_block",() -> new Block(Block.Properties.of(Material.STONE).strength(3.0f,3.0f)));
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

	public static final RegistryObject<Source> MOLTEN_COPPER = FLUIDS.register("molten_copper",
			() -> new ForgeFlowingFluid.Source(makeMoltenCopperProperties()));
	public static final RegistryObject<Flowing> FLOWING_MOLTEN_COPPER = FLUIDS.register("flowing_molten_copper",
			() -> new ForgeFlowingFluid.Flowing(makeMoltenCopperProperties()));
	public static final RegistryObject<FlowingFluidBlock> molten_Copper_block = BLOCKS.register("molten_copper_block",
			() -> new FluidBlock(MOLTEN_COPPER,
					Block.Properties.of(Material.LAVA).randomTicks().lightLevel((state) -> {
						return 15;
					}).noOcclusion().strength(100.0F).jumpFactor(0.1F).speedFactor(0.01F).noDrops()));
	public static final RegistryObject<Item> moltenCopper_bucket = ITEMS.register("molten_copper_bucket",
			() -> new BucketItem(MOLTEN_COPPER,
					new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).tab(Reference.GROUP)));

	private static ForgeFlowingFluid.Properties makeMoltenCopperProperties() {
		return new ForgeFlowingFluid.Properties(MOLTEN_COPPER, FLOWING_MOLTEN_COPPER,
				FluidAttributes.builder(MOLTEN_STILL, MOLTEN_FLOW).overlay(MOLTEN_STILL).color(0xFFB7703A).density(300)
						.viscosity(300).temperature(400)).bucket(moltenCopper_bucket).block(molten_Copper_block);
	}

	//public static final RegistryObject<Block> COPPER_ORE = BLOCKS.register("copper_ore", AOreBlock::new);
	//public static final RegistryObject<Block> OTHER_COPPER_ORE = BLOCKS.register("other_copper_ore", OtherOreBlock::new);
	//public static final RegistryObject<Block> COPPER_BLOCK = BLOCKS.register("copper_block", AOreBlock::new);
	//public static final RegistryObject<Item> COPPER_ORE_ITEM = ITEMS.register("copper_ore",
	//		() -> new ToolTipBlockItem(COPPER_ORE.get(), new Item.Properties().tab(Reference.GROUP)));
	//public static final RegistryObject<Item> OTHER_COPPER_ORE_ITEM = ITEMS.register("other_copper_ore",
	//		() -> new BlockItem(OTHER_COPPER_ORE.get(), new Item.Properties().tab(Reference.GROUP)));

	//public static final RegistryObject<Item> COPPER_BLOCK_ITEM = ITEMS.register("copper_block",
	//		() -> new BlockItem(COPPER_BLOCK.get(), new Item.Properties().tab(Reference.GROUP)));
	//public static final RegistryObject<Item> COPPER_INGOT = ITEMS.register("copper_ingot",
	//		() -> new Item(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> COPPER_NUGGET = ITEMS.register("copper_nugget",
			() -> new Item(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> COPPER_DUST = ITEMS.register("copper_dust",
			() -> new Item(new Item.Properties().tab(Reference.GROUP)));

	public static final RegistryObject<Source> MOLTEN_LEAD = FLUIDS.register("molten_lead",
			() -> new ForgeFlowingFluid.Source(makeMoltenLeadProperties()));
	public static final RegistryObject<Flowing> FLOWING_MOLTEN_LEAD = FLUIDS.register("flowing_molten_lead",
			() -> new ForgeFlowingFluid.Flowing(makeMoltenLeadProperties()));
	public static final RegistryObject<FlowingFluidBlock> molten_Lead_block = BLOCKS.register("molten_lead_block",
			() -> new FluidBlock(MOLTEN_LEAD,
					Block.Properties.of(Material.LAVA).randomTicks().lightLevel((state) -> {
						return 15;
					}).noOcclusion().strength(100.0F).jumpFactor(0.1F).speedFactor(0.01F).noDrops()));
	public static final RegistryObject<Item> moltenLead_bucket = ITEMS.register("molten_lead_bucket",
			() -> new BucketItem(MOLTEN_LEAD,
					new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).tab(Reference.GROUP)));

	private static ForgeFlowingFluid.Properties makeMoltenLeadProperties() {
		return new ForgeFlowingFluid.Properties(MOLTEN_LEAD, FLOWING_MOLTEN_LEAD,
				FluidAttributes.builder(MOLTEN_STILL, MOLTEN_FLOW).overlay(MOLTEN_STILL).color(0xFF7C8CC6).density(300)
						.viscosity(300).temperature(400)).bucket(moltenLead_bucket).block(molten_Lead_block);
	}
	public static final RegistryObject<Block> LEAD_SLATE_ORE = BLOCKS.register("lead_slate_ore", () -> new AOreBlock(6.0f,6.0f));
	public static final RegistryObject<Block> LEAD_ORE = BLOCKS.register("lead_ore",() -> new AOreBlock(3.0f,3.0f));
	public static final RegistryObject<Block> OTHER_LEAD_ORE = BLOCKS.register("other_lead_ore", OtherOreBlock::new);
	public static final RegistryObject<Block> LEAD_BLOCK = BLOCKS.register("lead_block",() -> new Block(Block.Properties.of(Material.METAL).strength(5.0f,6.0f)));
	public static final RegistryObject<Block> RAW_LEAD_BLOCK = BLOCKS.register("raw_lead_block",() -> new Block(Block.Properties.of(Material.STONE).strength(3.0f,3.0f)));
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

	public static final RegistryObject<Source> MOLTEN_NICKEL = FLUIDS.register("molten_nickel",
			() -> new ForgeFlowingFluid.Source(makeMoltenNickelProperties()));
	public static final RegistryObject<Flowing> FLOWING_MOLTEN_NICKEL = FLUIDS.register("flowing_molten_nickel",
			() -> new ForgeFlowingFluid.Flowing(makeMoltenNickelProperties()));
	public static final RegistryObject<FlowingFluidBlock> molten_Nickel_block = BLOCKS.register("molten_nickel_block",
			() -> new FluidBlock(MOLTEN_NICKEL,
					Block.Properties.of(Material.LAVA).randomTicks().lightLevel((state) -> {
						return 15;
					}).noOcclusion().strength(100.0F).jumpFactor(0.1F).speedFactor(0.01F).noDrops()));
	public static final RegistryObject<Item> moltenNickel_bucket = ITEMS.register("molten_nickel_bucket",
			() -> new BucketItem(MOLTEN_NICKEL,
					new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).tab(Reference.GROUP)));

	private static ForgeFlowingFluid.Properties makeMoltenNickelProperties() {
		return new ForgeFlowingFluid.Properties(MOLTEN_NICKEL, FLOWING_MOLTEN_NICKEL,
				FluidAttributes.builder(MOLTEN_STILL, MOLTEN_FLOW).overlay(MOLTEN_STILL).color(0xFFA9A984).density(300)
						.viscosity(300).temperature(400)).bucket(moltenNickel_bucket).block(molten_Nickel_block);
	}
	public static final RegistryObject<Block> NICKEL_SLATE_ORE = BLOCKS.register("nickel_slate_ore", () -> new AOreBlock(6.0f,6.0f));
	public static final RegistryObject<Block> NICKEL_ORE = BLOCKS.register("nickel_ore", () -> new AOreBlock(3.0f,3.0f));
	public static final RegistryObject<Block> OTHER_NICKEL_ORE = BLOCKS.register("other_nickel_ore", OtherOreBlock::new);
	public static final RegistryObject<Block> NICKEL_BLOCK = BLOCKS.register("nickel_block", () -> new Block(Block.Properties.of(Material.METAL).strength(5.0f,6.0f)));
	public static final RegistryObject<Block> RAW_NICKEL_BLOCK = BLOCKS.register("raw_nickel_block",() -> new Block(Block.Properties.of(Material.STONE).strength(3.0f,3.0f)));
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

	public static final RegistryObject<Source> MOLTEN_OSMIUM = FLUIDS.register("molten_osmium",
			() -> new ForgeFlowingFluid.Source(makeMoltenOsmiumProperties()));
	public static final RegistryObject<Flowing> FLOWING_MOLTEN_OSMIUM = FLUIDS.register("flowing_molten_osmium",
			() -> new ForgeFlowingFluid.Flowing(makeMoltenOsmiumProperties()));
	public static final RegistryObject<FlowingFluidBlock> molten_Osmium_block = BLOCKS.register("molten_osmium_block",
			() -> new FluidBlock(MOLTEN_OSMIUM,
					Block.Properties.of(Material.LAVA).randomTicks().lightLevel((state) -> {
						return 15;
					}).noOcclusion().strength(100.0F).jumpFactor(0.1F).speedFactor(0.01F).noDrops()));
	public static final RegistryObject<Item> moltenOsmium_bucket = ITEMS.register("molten_osmium_bucket",
			() -> new BucketItem(MOLTEN_OSMIUM,
					new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).tab(Reference.GROUP)));

	private static ForgeFlowingFluid.Properties makeMoltenOsmiumProperties() {
		return new ForgeFlowingFluid.Properties(MOLTEN_OSMIUM, FLOWING_MOLTEN_OSMIUM,
				FluidAttributes.builder(MOLTEN_STILL, MOLTEN_FLOW).overlay(MOLTEN_STILL).color(0xFFC0C9DD).density(300)
						.viscosity(300).temperature(400)).bucket(moltenOsmium_bucket).block(molten_Osmium_block);
	}
	public static final RegistryObject<Block> OSMIUM_SLATE_ORE = BLOCKS.register("osmium_slate_ore",() -> new AOreBlock(6.0f,6.0f));
	public static final RegistryObject<Block> OSMIUM_ORE = BLOCKS.register("osmium_ore", () -> new AOreBlock(3.0f,3.0f));
	public static final RegistryObject<Block> OTHER_OSMIUM_ORE = BLOCKS.register("other_osmium_ore", OtherOreBlock::new);
	public static final RegistryObject<Block> OSMIUM_BLOCK = BLOCKS.register("osmium_block", () -> new Block(Block.Properties.of(Material.METAL).strength(5.0f,6.0f)));
	public static final RegistryObject<Block> RAW_OSMIUM_BLOCK = BLOCKS.register("raw_osmium_block",() -> new Block(Block.Properties.of(Material.STONE).strength(3.0f,3.0f)));
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

	public static final RegistryObject<Source> MOLTEN_PLATINUM = FLUIDS.register("molten_platinum",
			() -> new ForgeFlowingFluid.Source(makeMoltenPlatinumProperties()));
	public static final RegistryObject<Flowing> FLOWING_MOLTEN_PLATINUM = FLUIDS.register("flowing_molten_platinum",
			() -> new ForgeFlowingFluid.Flowing(makeMoltenPlatinumProperties()));
	public static final RegistryObject<FlowingFluidBlock> molten_Platinum_block = BLOCKS
			.register("molten_platinum_block", () -> new FluidBlock(MOLTEN_PLATINUM,
					Block.Properties.of(Material.LAVA).randomTicks().lightLevel((state) -> {
						return 15;
					}).noOcclusion().strength(100.0F).jumpFactor(0.1F).speedFactor(0.01F).noDrops()));
	public static final RegistryObject<Item> moltenPlatinum_bucket = ITEMS.register("molten_platinum_bucket",
			() -> new BucketItem(MOLTEN_PLATINUM,
					new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).tab(Reference.GROUP)));

	private static ForgeFlowingFluid.Properties makeMoltenPlatinumProperties() {
		return new ForgeFlowingFluid.Properties(MOLTEN_PLATINUM, FLOWING_MOLTEN_PLATINUM,
				FluidAttributes.builder(MOLTEN_STILL, MOLTEN_FLOW).overlay(MOLTEN_STILL).color(0xFFB5B5FF).density(300)
						.viscosity(300).temperature(400)).bucket(moltenPlatinum_bucket).block(molten_Platinum_block);
	}
	public static final RegistryObject<Block> PLATINUM_SLATE_ORE = BLOCKS.register("platinum_slate_ore", () -> new AOreBlock(6.0f,6.0f));
	public static final RegistryObject<Block> PLATINUM_ORE = BLOCKS.register("platinum_ore", () -> new AOreBlock(3.0f,3.0f));
	public static final RegistryObject<Block> OTHER_PLATINUM_ORE = BLOCKS.register("other_platinum_ore", OtherOreBlock::new);
	public static final RegistryObject<Block> PLATINUM_BLOCK = BLOCKS.register("platinum_block", () -> new Block(Block.Properties.of(Material.METAL).strength(5.0f,6.0f)));
	public static final RegistryObject<Block> RAW_PLATINUM_BLOCK = BLOCKS.register("raw_platinum_block",() -> new Block(Block.Properties.of(Material.STONE).strength(3.0f,3.0f)));
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

	public static final RegistryObject<Source> MOLTEN_SILVER = FLUIDS.register("molten_silver",
			() -> new ForgeFlowingFluid.Source(makeMoltenSilverProperties()));
	public static final RegistryObject<Flowing> FLOWING_MOLTEN_SILVER = FLUIDS.register("flowing_molten_silver",
			() -> new ForgeFlowingFluid.Flowing(makeMoltenSilverProperties()));
	public static final RegistryObject<FlowingFluidBlock> molten_Silver_block = BLOCKS.register("molten_silver_block",
			() -> new FluidBlock(MOLTEN_SILVER,
					Block.Properties.of(Material.LAVA).randomTicks().lightLevel((state) -> {
						return 15;
					}).noOcclusion().strength(100.0F).jumpFactor(0.1F).speedFactor(0.01F).noDrops()));
	public static final RegistryObject<Item> moltenSilver_bucket = ITEMS.register("molten_silver_bucket",
			() -> new BucketItem(MOLTEN_SILVER,
					new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).tab(Reference.GROUP)));

	private static ForgeFlowingFluid.Properties makeMoltenSilverProperties() {
		return new ForgeFlowingFluid.Properties(MOLTEN_SILVER, FLOWING_MOLTEN_SILVER,
				FluidAttributes.builder(MOLTEN_STILL, MOLTEN_FLOW).overlay(MOLTEN_STILL).color(0xFFA4E0E7).density(300)
						.viscosity(300).temperature(400)).bucket(moltenSilver_bucket).block(molten_Silver_block);
	}
	public static final RegistryObject<Block> SILVER_SLATE_ORE = BLOCKS.register("silver_slate_ore", () -> new AOreBlock(6.0f,6.0f));
	public static final RegistryObject<Block> SILVER_ORE = BLOCKS.register("silver_ore", () -> new AOreBlock(3.0f,3.0f));
	public static final RegistryObject<Block> OTHER_SILVER_ORE = BLOCKS.register("other_silver_ore", OtherOreBlock::new);
	public static final RegistryObject<Block> SILVER_BLOCK = BLOCKS.register("silver_block", () -> new Block(Block.Properties.of(Material.METAL).strength(5.0f,6.0f)));
	public static final RegistryObject<Block> RAW_SILVER_BLOCK = BLOCKS.register("raw_silver_block",() -> new Block(Block.Properties.of(Material.STONE).strength(3.0f,3.0f)));
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

	public static final RegistryObject<Source> MOLTEN_TIN = FLUIDS.register("molten_tin",
			() -> new ForgeFlowingFluid.Source(makeMoltenTinProperties()));
	public static final RegistryObject<Flowing> FLOWING_MOLTEN_TIN = FLUIDS.register("flowing_molten_tin",
			() -> new ForgeFlowingFluid.Flowing(makeMoltenTinProperties()));
	public static final RegistryObject<FlowingFluidBlock> molten_Tin_block = BLOCKS.register("molten_tin_block",
			() -> new FluidBlock(MOLTEN_TIN,
					Block.Properties.of(Material.LAVA).randomTicks().lightLevel((state) -> {
						return 15;
					}).noOcclusion().strength(100.0F).jumpFactor(0.1F).speedFactor(0.01F).noDrops()));
	public static final RegistryObject<Item> moltenTin_bucket = ITEMS.register("molten_tin_bucket",
			() -> new BucketItem(MOLTEN_TIN,
					new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).tab(Reference.GROUP)));

	private static ForgeFlowingFluid.Properties makeMoltenTinProperties() {
		return new ForgeFlowingFluid.Properties(MOLTEN_TIN, FLOWING_MOLTEN_TIN,
				FluidAttributes.builder(MOLTEN_STILL, MOLTEN_FLOW).overlay(MOLTEN_STILL).color(0xFF787878).density(300)
						.viscosity(300).temperature(400)).bucket(moltenTin_bucket).block(molten_Tin_block);
	}
	public static final RegistryObject<Block> TIN_SLATE_ORE = BLOCKS.register("tin_slate_ore", () -> new AOreBlock(6.0f,6.0f));
	public static final RegistryObject<Block> TIN_ORE = BLOCKS.register("tin_ore", () -> new AOreBlock(3.0f,3.0f));
	public static final RegistryObject<Block> OTHER_TIN_ORE = BLOCKS.register("other_tin_ore", OtherOreBlock::new);
	public static final RegistryObject<Block> TIN_BLOCK = BLOCKS.register("tin_block", () -> new Block(Block.Properties.of(Material.METAL).strength(5.0f,6.0f)));
	public static final RegistryObject<Block> RAW_TIN_BLOCK = BLOCKS.register("raw_tin_block",() -> new Block(Block.Properties.of(Material.STONE).strength(3.0f,3.0f)));
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

	public static final RegistryObject<Source> MOLTEN_URANIUM = FLUIDS.register("molten_uranium",
			() -> new ForgeFlowingFluid.Source(makeMoltenUraniumProperties()));
	public static final RegistryObject<Flowing> FLOWING_MOLTEN_URANIUM = FLUIDS.register("flowing_molten_uranium",
			() -> new ForgeFlowingFluid.Flowing(makeMoltenUraniumProperties()));
	public static final RegistryObject<FlowingFluidBlock> molten_Uranium_block = BLOCKS.register("molten_uranium_block",
			() -> new FluidBlock(MOLTEN_URANIUM,
					Block.Properties.of(Material.LAVA).randomTicks().lightLevel((state) -> {
						return 15;
					}).noOcclusion().strength(100.0F).jumpFactor(0.1F).speedFactor(0.01F).noDrops()));
	public static final RegistryObject<Item> moltenUranium_bucket = ITEMS.register("molten_uranium_bucket",
			() -> new BucketItem(MOLTEN_URANIUM,
					new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).tab(Reference.GROUP)));

	private static ForgeFlowingFluid.Properties makeMoltenUraniumProperties() {
		return new ForgeFlowingFluid.Properties(MOLTEN_URANIUM, FLOWING_MOLTEN_URANIUM,
				FluidAttributes.builder(MOLTEN_STILL, MOLTEN_FLOW).overlay(MOLTEN_STILL).color(0xFF7EE778).density(300)
						.viscosity(300).temperature(400)).bucket(moltenUranium_bucket).block(molten_Uranium_block);
	}
	public static final RegistryObject<Block> URANIUM_SLATE_ORE = BLOCKS.register("uranium_slate_ore", () -> new AOreBlock(6.0f,6.0f));
	public static final RegistryObject<Block> URANIUM_ORE = BLOCKS.register("uranium_ore", () -> new AOreBlock(3.0f,3.0f));
	public static final RegistryObject<Block> OTHER_URANIUM_ORE = BLOCKS.register("other_uranium_ore", OtherOreBlock::new);
	public static final RegistryObject<Block> URANIUM_BLOCK = BLOCKS.register("uranium_block", () -> new Block(Block.Properties.of(Material.METAL).strength(5.0f,6.0f)));
	public static final RegistryObject<Block> RAW_URANIUM_BLOCK = BLOCKS.register("raw_uranium_block",() -> new Block(Block.Properties.of(Material.STONE).strength(3.0f,3.0f)));
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

	public static final RegistryObject<Source> MOLTEN_ZINC = FLUIDS.register("molten_zinc",
			() -> new ForgeFlowingFluid.Source(makeMoltenZincProperties()));
	public static final RegistryObject<Flowing> FLOWING_MOLTEN_ZINC = FLUIDS.register("flowing_molten_zinc",
			() -> new ForgeFlowingFluid.Flowing(makeMoltenZincProperties()));
	public static final RegistryObject<FlowingFluidBlock> molten_Zinc_block = BLOCKS.register("molten_zinc_block",
			() -> new FluidBlock(MOLTEN_ZINC,
					Block.Properties.of(Material.LAVA).randomTicks().lightLevel((state) -> {
						return 15;
					}).noOcclusion().strength(100.0F).jumpFactor(0.1F).speedFactor(0.01F).noDrops()));
	public static final RegistryObject<Item> moltenZinc_bucket = ITEMS.register("molten_zinc_bucket",
			() -> new BucketItem(MOLTEN_ZINC,
					new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).tab(Reference.GROUP)));

	private static ForgeFlowingFluid.Properties makeMoltenZincProperties() {
		return new ForgeFlowingFluid.Properties(MOLTEN_ZINC, FLOWING_MOLTEN_ZINC,
				FluidAttributes.builder(MOLTEN_STILL, MOLTEN_FLOW).overlay(MOLTEN_STILL).color(0xFFB5B5B5).density(300)
						.viscosity(300).temperature(400)).bucket(moltenZinc_bucket).block(molten_Zinc_block);
	}
	public static final RegistryObject<Block> ZINC_SLATE_ORE = BLOCKS.register("zinc_slate_ore", () -> new AOreBlock(6.0f,6.0f));
	public static final RegistryObject<Block> ZINC_ORE = BLOCKS.register("zinc_ore", () -> new AOreBlock(3.0f,3.0f));
	public static final RegistryObject<Block> OTHER_ZINC_ORE = BLOCKS.register("other_zinc_ore", OtherOreBlock::new);
	public static final RegistryObject<Block> ZINC_BLOCK = BLOCKS.register("zinc_block", () -> new Block(Block.Properties.of(Material.METAL).strength(5.0f,6.0f)));
	public static final RegistryObject<Block> RAW_ZINC_BLOCK = BLOCKS.register("raw_zinc_block",() -> new Block(Block.Properties.of(Material.STONE).strength(3.0f,3.0f)));
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

	public static final RegistryObject<Item> IRON_DUST = ITEMS.register("iron_dust",
			() -> new Item(new Item.Properties().tab(Reference.GROUP)));
	public static final RegistryObject<Item> GOLD_DUST = ITEMS.register("gold_dust",
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







	// ********************** MEK PROCESSING


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



}

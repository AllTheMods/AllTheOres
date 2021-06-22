package net.allthemods.alltheores.registry;

import net.allthemods.alltheores.blocks.AOreBlock;
import net.allthemods.alltheores.blocks.BlockList;
import net.allthemods.alltheores.blocks.FluidBlock;
import net.allthemods.alltheores.blocks.OtherOreBlock;
import net.allthemods.alltheores.infos.Reference;
import net.allthemods.alltheores.meka.Clump;
import net.allthemods.alltheores.meka.Crystal;
import net.allthemods.alltheores.meka.DirtyDust;
import net.allthemods.alltheores.meka.Shard;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.FlowingFluidBlock;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.BucketItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.Tags;
import net.minecraftforge.fluids.FluidAttributes;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fml.RegistryObject;

import static net.allthemods.alltheores.blocks.BlockList.blockItem;
import static net.allthemods.alltheores.blocks.BlockList.material;


@SuppressWarnings("java:S116")
public class OreRegistryGroup extends AlloyRegistryGroup {
    public static final ResourceLocation MOLTEN_STILL = new ResourceLocation(Reference.MOD_ID, "block/fluid/molten_metal");
    public static final ResourceLocation MOLTEN_FLOW = new ResourceLocation(Reference.MOD_ID, "block/fluid/molten_metal_flow");

    public final int fluidColor;

    // Tags
    public final Tags.IOptionalNamedTag<Block> ORE_TAG;
    public final Tags.IOptionalNamedTag<Item> ORE_ITEM_TAG;
    public final Tags.IOptionalNamedTag<Item> DUST_TAG;


    // Blocks
    public final RegistryObject<Block> ORE;
    public final RegistryObject<Block> SLATE_ORE;
    public final RegistryObject<Block> OTHER_ORE;
    public final RegistryObject<Block> RAW_BLOCK;

    // BlockItems
    public final RegistryObject<BlockItem> ORE_ITEM;
    public final RegistryObject<BlockItem> SLATE_ORE_ITEM;
    public final RegistryObject<BlockItem> OTHER_ORE_ITEM;
    public final RegistryObject<BlockItem> RAW_BLOCK_ITEM;

    // Items
    public final RegistryObject<Item> RAW;
    public final RegistryObject<Item> DUST;

    // Fluid Registry
    public final RegistryObject<ForgeFlowingFluid.Source> MOLTEN;
    public final RegistryObject<ForgeFlowingFluid.Flowing> MOLTEN_FLOWING;
    public final RegistryObject<FlowingFluidBlock> MOLTEN_FLOWING_BLOCK;
    public final RegistryObject<Item> MOLTEN_BUCKET;

    // Mekanism Ore Processing
    public final RegistryObject<Item> MEK_DIRTY;
    public final RegistryObject<Item> MEK_SHARD;
    public final RegistryObject<Item> MEK_CRYSTAL;
    public final RegistryObject<Item> MEK_CLUMP;

    public OreRegistryGroup(String name, int fluidColor) {
        super(name);
        this.fluidColor = fluidColor;

        ORE_TAG = BlockTags.createOptional(Reference.ore(name));
        ORE_ITEM_TAG = ItemTags.createOptional(Reference.ore(name));
        DUST_TAG = ItemTags.createOptional(Reference.dust(name));

        MOLTEN = BlockList.FLUIDS.register(String.format("molten_%s", name),
                () -> new ForgeFlowingFluid.Source(makeMoltenProperties()));
        MOLTEN_FLOWING = BlockList.FLUIDS.register(String.format("flowing_molten_%s", name),
                () -> new ForgeFlowingFluid.Flowing(makeMoltenProperties()));
        MOLTEN_FLOWING_BLOCK = BlockList.BLOCKS.register(String.format("molten_%s_block", name),
                () -> new FluidBlock(MOLTEN, AbstractBlock.Properties.of(Material.LAVA)
                        .randomTicks()
                        .lightLevel(state -> 15)
                        .noOcclusion()
                        .strength(100.0F)
                        .jumpFactor(0.1F)
                        .speedFactor(0.01F)
                        .noDrops()));
        MOLTEN_BUCKET = BlockList.ITEMS.register(String.format("molten_%s_bucket", name),
                () -> new BucketItem(MOLTEN, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).tab(Reference.GROUP)));


        ORE = BlockList.ORE.register(String.format("%s_ore", name), () -> new AOreBlock(3.0f, 3.0f));
        SLATE_ORE = BlockList.ORE.register(String.format("%s_slate_ore", name), () -> new AOreBlock(6.0f, 6.0f));
        OTHER_ORE = BlockList.BLOCKS.register(String.format("other_%s_ore", name), OtherOreBlock::new);
        RAW_BLOCK = BlockList.BLOCKS.register(String.format("raw_%s_block", name),
                () -> new Block(AbstractBlock.Properties.of(Material.STONE).strength(3.0f, 3.0f)));


        ORE_ITEM = blockItem(ORE);
        SLATE_ORE_ITEM = blockItem(SLATE_ORE);
        OTHER_ORE_ITEM = blockItem(OTHER_ORE);
        RAW_BLOCK_ITEM = blockItem(RAW_BLOCK);

        DUST = material(String.format("%s_dust", name));
        RAW = material(String.format("raw_%s", name));

        MEK_DIRTY = BlockList.ITEMS.register(String.format("dirty_%s_dust", name), () -> new DirtyDust(new Item.Properties().tab(Reference.GROUP)));
        MEK_SHARD = BlockList.ITEMS.register(String.format("%s_shard", name), () -> new Shard(new Item.Properties().tab(Reference.GROUP)));
        MEK_CRYSTAL = BlockList.ITEMS.register(String.format("%s_crystal", name), () -> new Crystal(new Item.Properties().tab(Reference.GROUP)));
        MEK_CLUMP = BlockList.ITEMS.register(String.format("%s_clump", name), () -> new Clump(new Item.Properties().tab(Reference.GROUP)));
    }

    private ForgeFlowingFluid.Properties makeMoltenProperties() {
        return new ForgeFlowingFluid.Properties(MOLTEN, MOLTEN_FLOWING,
                FluidAttributes.builder(MOLTEN_STILL, MOLTEN_FLOW).overlay(MOLTEN_STILL).color(fluidColor).density(300)
                        .viscosity(300).temperature(400)).bucket(MOLTEN_BUCKET).block(MOLTEN_FLOWING_BLOCK);
    }
}

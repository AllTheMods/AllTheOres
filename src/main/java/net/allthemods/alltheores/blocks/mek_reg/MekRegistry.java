package net.allthemods.alltheores.blocks.mek_reg;

import net.allthemods.alltheores.infos.Reference;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class MekRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Reference.MOD_ID);
    //  ***********************DIRTY DUSTS

    public static final RegistryObject<Item> ALUM_DIRTY = ITEMS.register("dirty_aluminum_dust", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COPP_DIRTY = ITEMS.register("dirty_copper_dust", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LEAD_DIRTY = ITEMS.register("dirty_lead_dust", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NICK_DIRTY = ITEMS.register("dirty_nickel_dust", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> OSMI_DIRTY = ITEMS.register("dirty_osmium_dust", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PLAT_DIRTY = ITEMS.register("dirty_platinum_dust", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SILV_DIRTY = ITEMS.register("dirty_silver_dust", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TIN_DIRTY = ITEMS.register("dirty_tin_dust", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> URAN_DIRTY = ITEMS.register("dirty_uranium_dust", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ZINC_DIRTY = ITEMS.register("dirty_zinc_dust", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> IRIDIUM_DIRTY = ITEMS.register("dirty_iridium_dust", () -> new Item(new Item.Properties()));
    //  ***********************SHARDS
    public static final RegistryObject<Item> ALUM_SHARD = ITEMS.register("aluminum_shard", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COPP_SHARD = ITEMS.register("copper_shard", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LEAD_SHARD = ITEMS.register("lead_shard", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NICK_SHARD = ITEMS.register("nickel_shard", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> OSMI_SHARD = ITEMS.register("osmium_shard", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PLAT_SHARD = ITEMS.register("platinum_shard", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SILV_SHARD = ITEMS.register("silver_shard", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TIN_SHARD = ITEMS.register("tin_shard", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> URAN_SHARD = ITEMS.register("uranium_shard", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ZINC_SHARD = ITEMS.register("zinc_shard", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> IRIDIUM_SHARD = ITEMS.register("iridium_shard", () -> new Item(new Item.Properties()));
    //  ************************CRYSTALS
    public static final RegistryObject<Item> ALUM_CRYSTAL = ITEMS.register("aluminum_crystal", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COPP_CRYSTAL = ITEMS.register("copper_crystal", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LEAD_CRYSTAL = ITEMS.register("lead_crystal", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NICK_CRYSTAL = ITEMS.register("nickel_crystal", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> OSMI_CRYSTAL = ITEMS.register("osmium_crystal", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PLAT_CRYSTAL = ITEMS.register("platinum_crystal", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SILV_CRYSTAL = ITEMS.register("silver_crystal", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TIN_CRYSTAL = ITEMS.register("tin_crystal", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> URAN_CRYSTAL = ITEMS.register("uranium_crystal", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ZINC_CRYSTAL = ITEMS.register("zinc_crystal", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> IRIDIUM_CRYSTAL = ITEMS.register("iridium_crystal", () -> new Item(new Item.Properties()));
    //  ************************CLUMPS
    public static final RegistryObject<Item> ALUM_CLUMP = ITEMS.register("aluminum_clump", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COPP_CLUMP = ITEMS.register("copper_clump", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LEAD_CLUMP = ITEMS.register("lead_clump", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NICK_CLUMP = ITEMS.register("nickel_clump", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> OSMI_CLUMP = ITEMS.register("osmium_clump", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PLAT_CLUMP = ITEMS.register("platinum_clump", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SILV_CLUMP = ITEMS.register("silver_clump", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TIN_CLUMP = ITEMS.register("tin_clump", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> URAN_CLUMP = ITEMS.register("uranium_clump", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ZINC_CLUMP = ITEMS.register("zinc_clump", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> IRIDIUM_CLUMP = ITEMS.register("iridium_clump", () -> new Item(new Item.Properties()));

}

package net.allthemods.alltheores.slurries;

import mekanism.api.chemical.slurry.Slurry;
import mekanism.api.chemical.slurry.SlurryBuilder;
import net.allthemods.alltheores.infos.Reference;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.ForgeMod;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.IForgeRegistry;

public class SlurryRegistry {

    //  ************************SLURRIES

    public static final ResourceLocation SLURRY_STILL = new ResourceLocation("minecraft","block/water_still");

    public static final Slurry Dirty_Aluminum = new Slurry(SlurryBuilder.builder(SLURRY_STILL).ore(new ResourceLocation("forge","ores/aluminum")).color(0xFFE3E3E3)).getChemical().setRegistryName(new ResourceLocation(Reference.MOD_ID,"dirty_aluminum"));
    public static final Slurry Dirty_Copper = new Slurry(SlurryBuilder.builder(SLURRY_STILL).ore(new ResourceLocation("forge","ores/copper")).color(0xFFB7703A)).getChemical().setRegistryName(new ResourceLocation(Reference.MOD_ID,"dirty_copper"));
    public static final Slurry Dirty_Lead = new Slurry(SlurryBuilder.builder(SLURRY_STILL).ore(new ResourceLocation("forge","ores/lead")).color(0xFF7C8CC6)).getChemical().setRegistryName(new ResourceLocation(Reference.MOD_ID,"dirty_lead"));
    public static final Slurry Dirty_Nickel = new Slurry(SlurryBuilder.builder(SLURRY_STILL).ore(new ResourceLocation("forge","ores/nickel")).color(0xFFA9A984)).getChemical().setRegistryName(new ResourceLocation(Reference.MOD_ID,"dirty_nickel"));
    public static final Slurry Dirty_Osmium = new Slurry(SlurryBuilder.builder(SLURRY_STILL).ore(new ResourceLocation("forge","ores/osmium")).color(0x80C0C9DD)).getChemical().setRegistryName(new ResourceLocation(Reference.MOD_ID,"dirty_osmium"));
    public static final Slurry Dirty_Platinum = new Slurry(SlurryBuilder.builder(SLURRY_STILL).ore(new ResourceLocation("forge","ores/platinum")).color(0xFFB5B5FF)).getChemical().setRegistryName(new ResourceLocation(Reference.MOD_ID,"dirty_platinum"));
    public static final Slurry Dirty_Silver = new Slurry(SlurryBuilder.builder(SLURRY_STILL).ore(new ResourceLocation("forge","ores/silver")).color(0xFFA4E0E7)).getChemical().setRegistryName(new ResourceLocation(Reference.MOD_ID,"dirty_silver"));
    public static final Slurry Dirty_Tin = new Slurry(SlurryBuilder.builder(SLURRY_STILL).ore(new ResourceLocation("forge","ores/tin")).color(0xFF787878)).getChemical().setRegistryName(new ResourceLocation(Reference.MOD_ID,"dirty_tin"));
    public static final Slurry Dirty_Uranium = new Slurry(SlurryBuilder.builder(SLURRY_STILL).ore(new ResourceLocation("forge","ores/uranium")).color(0xFF7EE778)).getChemical().setRegistryName(new ResourceLocation(Reference.MOD_ID,"dirty_uranium"));
    public static final Slurry Dirty_Zinc = new Slurry(SlurryBuilder.builder(SLURRY_STILL).ore(new ResourceLocation("forge","ores/zinc")).color(0xFFB5B5B5)).getChemical().setRegistryName(new ResourceLocation(Reference.MOD_ID,"dirty_zinc"));

    public static final Slurry Clean_Aluminum = new Slurry(SlurryBuilder.builder(SLURRY_STILL).ore(new ResourceLocation("forge","ores/aluminum")).color(0xFFE3E3E3)).getChemical().setRegistryName(new ResourceLocation(Reference.MOD_ID,"clean_aluminum"));
    public static final Slurry Clean_Copper = new Slurry(SlurryBuilder.builder(SLURRY_STILL).ore(new ResourceLocation("forge","ores/copper")).color(0xFFB7703A)).getChemical().setRegistryName(new ResourceLocation(Reference.MOD_ID,"clean_copper"));
    public static final Slurry Clean_Lead = new Slurry(SlurryBuilder.builder(SLURRY_STILL).ore(new ResourceLocation("forge","ores/lead")).color(0xFF7C8CC6)).getChemical().setRegistryName(new ResourceLocation(Reference.MOD_ID,"clean_lead"));
    public static final Slurry Clean_Nickel = new Slurry(SlurryBuilder.builder(SLURRY_STILL).ore(new ResourceLocation("forge","ores/nickel")).color(0xFFA9A984)).getChemical().setRegistryName(new ResourceLocation(Reference.MOD_ID,"clean_nickel"));
    public static final Slurry Clean_Osmium = new Slurry(SlurryBuilder.builder(SLURRY_STILL).ore(new ResourceLocation("forge","ores/osmium")).color(0xFFC0C9DD)).getChemical().setRegistryName(new ResourceLocation(Reference.MOD_ID,"clean_osmium"));
    public static final Slurry Clean_Platinum = new Slurry(SlurryBuilder.builder(SLURRY_STILL).ore(new ResourceLocation("forge","ores/platinum")).color(0xFFB5B5FF)).getChemical().setRegistryName(new ResourceLocation(Reference.MOD_ID,"clean_platinum"));
    public static final Slurry Clean_Silver = new Slurry(SlurryBuilder.builder(SLURRY_STILL).ore(new ResourceLocation("forge","ores/silver")).color(0xFFA4E0E7)).getChemical().setRegistryName(new ResourceLocation(Reference.MOD_ID,"clean_silver"));
    public static final Slurry Clean_Tin = new Slurry(SlurryBuilder.builder(SLURRY_STILL).ore(new ResourceLocation("forge","ores/tin")).color(0xFF787878)).getChemical().setRegistryName(new ResourceLocation(Reference.MOD_ID,"clean_tin"));
    public static final Slurry Clean_Uranium = new Slurry(SlurryBuilder.builder(SLURRY_STILL).ore(new ResourceLocation("forge","ores/uranium")).color(0xFF7EE778)).getChemical().setRegistryName(new ResourceLocation(Reference.MOD_ID,"clean_uranium"));
    public static final Slurry Clean_Zinc = new Slurry(SlurryBuilder.builder(SLURRY_STILL).ore(new ResourceLocation("forge","ores/zinc")).color(0xFFB5B5B5)).getChemical().setRegistryName(new ResourceLocation(Reference.MOD_ID,"clean_zinc"));




    public static ItemGroup group = Reference.GROUP;
    public static void init(RegistryEvent.Register<Slurry> event) {
        IForgeRegistry<Slurry> registry = event.getRegistry();


        registry.registerAll(
                Dirty_Aluminum,Dirty_Copper,Dirty_Lead,Dirty_Nickel,Dirty_Osmium,
                Dirty_Platinum,Dirty_Silver,Dirty_Tin,Dirty_Uranium,Dirty_Zinc,
                Clean_Aluminum,Clean_Copper,Clean_Lead,Clean_Nickel,Clean_Osmium,
                Clean_Platinum,Clean_Silver,Clean_Tin,Clean_Uranium,Clean_Zinc
        );

    }
}

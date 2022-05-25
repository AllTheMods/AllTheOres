package net.allthemods.alltheores.meka;

import mekanism.api.chemical.slurry.Slurry;
import mekanism.api.chemical.slurry.SlurryBuilder;
import net.allthemods.alltheores.infos.ItemTagRegistry;
import net.allthemods.alltheores.infos.Reference;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.IForgeRegistry;


public class Slurries {


    public static final ResourceLocation SLURRY_STILL = new ResourceLocation("minecraft","block/water_still");

    public static final Slurry Dirty_Aluminum = new Slurry(SlurryBuilder.builder(SLURRY_STILL).ore(new ResourceLocation("forge","ores/aluminum")).color(0xFFE3E3E3)).getChemical().setRegistryName(new ResourceLocation(Reference.MOD_ID,"dirty_aluminum"));
    public static final Slurry Dirty_Nickel = new Slurry(SlurryBuilder.builder(SLURRY_STILL).ore(new ResourceLocation("forge","ores/nickel")).color(0xFFA9A984)).getChemical().setRegistryName(new ResourceLocation(Reference.MOD_ID,"dirty_nickel"));
    public static final Slurry Dirty_Platinum = new Slurry(SlurryBuilder.builder(SLURRY_STILL).ore(new ResourceLocation("forge","ores/platinum")).color(0xFFB5B5FF)).getChemical().setRegistryName(new ResourceLocation(Reference.MOD_ID,"dirty_platinum"));
    public static final Slurry Dirty_Silver = new Slurry(SlurryBuilder.builder(SLURRY_STILL).ore(new ResourceLocation("forge","ores/silver")).color(0xFFA4E0E7)).getChemical().setRegistryName(new ResourceLocation(Reference.MOD_ID,"dirty_silver"));
    public static final Slurry Dirty_Tin = new Slurry(SlurryBuilder.builder(SLURRY_STILL).ore(new ResourceLocation("forge","ores/tin")).color(0xFF787878)).getChemical().setRegistryName(new ResourceLocation(Reference.MOD_ID,"dirty_tin"));
    public static final Slurry Dirty_Zinc = new Slurry(SlurryBuilder.builder(SLURRY_STILL).ore(new ResourceLocation("forge","ores/zinc")).color(0xFFB5B5B5)).getChemical().setRegistryName(new ResourceLocation(Reference.MOD_ID,"dirty_zinc"));

    public static final Slurry Clean_Aluminum = new Slurry(SlurryBuilder.builder(SLURRY_STILL).ore(new ResourceLocation("forge","ores/aluminum")).color(0xFFE3E3E3)).getChemical().setRegistryName(new ResourceLocation(Reference.MOD_ID,"clean_aluminum"));
    public static final Slurry Clean_Nickel = new Slurry(SlurryBuilder.builder(SLURRY_STILL).ore(new ResourceLocation("forge","ores/nickel")).color(0xFFA9A984)).getChemical().setRegistryName(new ResourceLocation(Reference.MOD_ID,"clean_nickel"));
    public static final Slurry Clean_Platinum = new Slurry(SlurryBuilder.builder(SLURRY_STILL).ore(new ResourceLocation("forge","ores/platinum")).color(0xFFB5B5FF)).getChemical().setRegistryName(new ResourceLocation(Reference.MOD_ID,"clean_platinum"));
    public static final Slurry Clean_Silver = new Slurry(SlurryBuilder.builder(SLURRY_STILL).ore(new ResourceLocation("forge","ores/silver")).color(0xFFA4E0E7)).getChemical().setRegistryName(new ResourceLocation(Reference.MOD_ID,"clean_silver"));
    public static final Slurry Clean_Tin = new Slurry(SlurryBuilder.builder(SLURRY_STILL).ore(new ResourceLocation("forge","ores/tin")).color(0xFF787878)).getChemical().setRegistryName(new ResourceLocation(Reference.MOD_ID,"clean_tin"));
    public static final Slurry Clean_Zinc = new Slurry(SlurryBuilder.builder(SLURRY_STILL).ore(new ResourceLocation("forge","ores/zinc")).color(0xFFB5B5B5)).getChemical().setRegistryName(new ResourceLocation(Reference.MOD_ID,"clean_zinc"));



    @SubscribeEvent
    public static void init(RegistryEvent.Register<Slurry> event) {
        IForgeRegistry<Slurry> registry = event.getRegistry();


        registry.registerAll(
                Dirty_Aluminum,Dirty_Nickel,
                Dirty_Platinum,Dirty_Silver,Dirty_Tin,Dirty_Zinc,
                Clean_Aluminum,Clean_Nickel,
                Clean_Platinum,Clean_Silver,Clean_Tin,Clean_Zinc
        );

    }
}

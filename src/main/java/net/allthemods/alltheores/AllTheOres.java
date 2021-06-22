package net.allthemods.alltheores;

import mekanism.api.chemical.slurry.Slurry;
import net.allthemods.alltheores.events.BlockBreak;
import net.allthemods.alltheores.slurries.SlurryRegistry;
import net.allthemods.alltheores.worldgen.EventWorldgen;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.allthemods.alltheores.blocks.BlockList;
import net.allthemods.alltheores.infos.Configuration;
import net.allthemods.alltheores.infos.Reference;

@Mod(Reference.MOD_ID)
@Mod.EventBusSubscriber(modid = Reference.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class AllTheOres {
	public static final Logger LOGGER = LogManager.getLogger(Reference.MOD_ID);

	public AllTheOres() {
		setupBlackList();
		IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
		ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Configuration.COMMON_SPEC);
		MinecraftForge.EVENT_BUS.register(Configuration.class);
		BlockList.FLUIDS.register(modEventBus);
		BlockList.BLOCKS.register(modEventBus);
		BlockList.ORE.register(modEventBus);
		BlockList.ITEMS.register(modEventBus);
		MinecraftForge.EVENT_BUS.register(this);
		MinecraftForge.EVENT_BUS.register(EventWorldgen.class);
		MinecraftForge.EVENT_BUS.register(BlockBreak.class);
		if(ModList.get().isLoaded("mekanism")) {
			modEventBus.register(MekRegistry.class);
		}
	}
	private void setupBlackList() {
		Reference.WORLDGEN_BLACKLIST.add(Blocks.VOID_AIR);
		Reference.WORLDGEN_BLACKLIST.add(Blocks.WATER);
		Reference.WORLDGEN_BLACKLIST.add(Blocks.BEDROCK);
		Reference.WORLDGEN_BLACKLIST.add(Blocks.AIR);
		Reference.WORLDGEN_BLACKLIST.add(Blocks.CAVE_AIR);
	}
	@SubscribeEvent
	public static void onConfigLoad(ModConfig.ModConfigEvent configEvent) {
	}

	@SubscribeEvent
	public static void commonSetupEvent(FMLCommonSetupEvent event) {

	}

	@SubscribeEvent
	public static void loadCompleteEvent(FMLLoadCompleteEvent event) {

	}

	@SubscribeEvent
	public void onServerStarting(FMLServerStartingEvent event) {

	}
	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, modid = Reference.MOD_ID)
	public static class RegistryEvents {
		@SubscribeEvent
		public static void onBlocksRegistry(final RegistryEvent.Register<Block> event) {		}

		@SubscribeEvent
		public static void onItemsRegistry(final RegistryEvent.Register<Item> event) {		}
		@SubscribeEvent
		public static void onTERegistry(final RegistryEvent.Register<TileEntityType<?>> event) {		}
	}

	public static class MekRegistry {
		@SubscribeEvent
		public static void onSlurryRegistry(final RegistryEvent.Register<Slurry> event) {	if(ModList.get().isLoaded("mekanism")) { SlurryRegistry.init(event);		} }
	}
}

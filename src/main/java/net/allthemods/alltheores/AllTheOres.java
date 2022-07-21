package net.allthemods.alltheores;

import mekanism.api.chemical.slurry.Slurry;
import net.allthemods.alltheores.events.BlockBreak;
import net.allthemods.alltheores.worldgen.EventWorldgen;

import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
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
		IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
		ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Configuration.COMMON_SPEC);
		BlockList.FLUIDS.register(modEventBus);
		BlockList.BLOCKS.register(modEventBus);
		BlockList.ITEMS.register(modEventBus);
		//BlockList.FEATURES.register(modEventBus);
		MinecraftForge.EVENT_BUS.register(this);
		modEventBus.register(Configuration.class);
		//MinecraftForge.EVENT_BUS.addListener(EventWorldgen::biomeLoadingEvent);
		MinecraftForge.EVENT_BUS.addListener(BlockBreak::BreakEvent);
		if(ModList.get().isLoaded("mekanism")) {
			//modEventBus.register(Slurries.class);
		}
		setupLogFilter();
	}


	private static void setupLogFilter() {
		var rootLogger = LogManager.getRootLogger();
		if (rootLogger instanceof org.apache.logging.log4j.core.Logger logger) {
			logger.addFilter(new SetBlockMessageFilter());
		} else {
			LOGGER.error("Registration failed with unexpected class: {}", rootLogger.getClass());
		}
	}

}

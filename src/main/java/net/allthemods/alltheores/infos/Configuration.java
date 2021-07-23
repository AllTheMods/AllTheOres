package net.allthemods.alltheores.infos;

import com.electronwill.nightconfig.core.Config;
import net.allthemods.alltheores.AllTheOres;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.fml.config.ConfigTracker;
import net.minecraftforge.fml.config.IConfigEvent;
import org.apache.commons.lang3.tuple.Pair;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.config.ModConfig;

@EventBusSubscriber(modid = Reference.MOD_ID, bus = EventBusSubscriber.Bus.MOD)
public class Configuration {
	public static boolean aluminumGen;
	public static boolean copperGen;
	public static boolean leadGen;
	public static boolean nickelGen;
	public static boolean osmiumGen;
	public static boolean platinumGen;
	public static boolean silverGen;
	public static boolean tinGen;
	public static boolean uraniumGen;
	public static boolean zincGen;

	public static int aluminum_MinY;
	public static int aluminum_MaxY;
	public static int aluminum_SpawnSize;
	public static int aluminum_VeinCount;

	public static int copper_MinY;
	public static int copper_MaxY;
	public static int copper_SpawnSize;
	public static int copper_VeinCount;

	public static int lead_MinY;
	public static int lead_MaxY;
	public static int lead_SpawnSize;
	public static int lead_VeinCount;

	public static int nickel_MinY;
	public static int nickel_MaxY;
	public static int nickel_SpawnSize;
	public static int nickel_VeinCount;

	public static int osmium_MinY;
	public static int osmium_MaxY;
	public static int osmium_SpawnSize;
	public static int osmium_VeinCount;

	public static int platinum_MinY;
	public static int platinum_MaxY;
	public static int platinum_SpawnSize;
	public static int platinum_VeinCount;

	public static int silver_MinY;
	public static int silver_MaxY;
	public static int silver_SpawnSize;
	public static int silver_VeinCount;

	public static int tin_MinY;
	public static int tin_MaxY;
	public static int tin_SpawnSize;
	public static int tin_VeinCount;

	public static int zinc_MinY;
	public static int zinc_MaxY;
	public static int zinc_SpawnSize;
	public static int zinc_VeinCount;

	public static int uranium_MinY;
	public static int uranium_MaxY;
	public static int uranium_SpawnSize;
	public static int uranium_VeinCount;

	public static final ForgeConfigSpec COMMON_SPEC;
	public static final Common COMMON;
	static {
		final Pair<Common, ForgeConfigSpec> specPair = new ForgeConfigSpec.Builder().configure(Common::new);
		COMMON_SPEC = specPair.getRight();
		COMMON = specPair.getLeft();
	}


	public static void onModConfigEvent(final IConfigEvent.ConfigConfig configEvent) {
		bakeConfigs();
	}

	private static void bakeConfigs() {
		AllTheOres.LOGGER.debug("Loading Configs....");
		aluminumGen = Configuration.COMMON.aluminumGen.get();
		copperGen = Configuration.COMMON.aluminumGen.get();
		leadGen = Configuration.COMMON.aluminumGen.get();
		nickelGen = Configuration.COMMON.aluminumGen.get();
		osmiumGen = Configuration.COMMON.aluminumGen.get();
		platinumGen = Configuration.COMMON.aluminumGen.get();
		silverGen = Configuration.COMMON.aluminumGen.get();
		tinGen = Configuration.COMMON.aluminumGen.get();
		uraniumGen = Configuration.COMMON.aluminumGen.get();
		zincGen = Configuration.COMMON.aluminumGen.get();

		aluminum_MinY = Configuration.COMMON.aluminum_MinY.get();
		aluminum_MaxY = Configuration.COMMON.aluminum_MaxY.get();
		aluminum_SpawnSize = Configuration.COMMON.aluminum_SpawnSize.get();
		aluminum_VeinCount = Configuration.COMMON.aluminum_VeinCount.get();

		lead_MinY = Configuration.COMMON.lead_MinY.get();
		lead_MaxY = Configuration.COMMON.lead_MaxY.get();
		lead_SpawnSize = Configuration.COMMON.lead_SpawnSize.get();
		lead_VeinCount = Configuration.COMMON.lead_VeinCount.get();

		nickel_MinY = Configuration.COMMON.nickel_MinY.get();
		nickel_MaxY = Configuration.COMMON.nickel_MaxY.get();
		nickel_SpawnSize = Configuration.COMMON.nickel_SpawnSize.get();
		nickel_VeinCount = Configuration.COMMON.nickel_VeinCount.get();

		osmium_MinY = Configuration.COMMON.osmium_MinY.get();
		osmium_MaxY = Configuration.COMMON.osmium_MaxY.get();
		osmium_SpawnSize = Configuration.COMMON.osmium_SpawnSize.get();
		osmium_VeinCount = Configuration.COMMON.osmium_VeinCount.get();

		platinum_MinY = Configuration.COMMON.platinum_MinY.get();
		platinum_MaxY = Configuration.COMMON.platinum_MaxY.get();
		platinum_SpawnSize = Configuration.COMMON.platinum_SpawnSize.get();
		platinum_VeinCount = Configuration.COMMON.platinum_VeinCount.get();

		silver_MinY = Configuration.COMMON.silver_MinY.get();
		silver_MaxY = Configuration.COMMON.silver_MaxY.get();
		silver_SpawnSize = Configuration.COMMON.silver_SpawnSize.get();
		silver_VeinCount = Configuration.COMMON.silver_VeinCount.get();

		tin_MinY = Configuration.COMMON.tin_MinY.get();
		tin_MaxY = Configuration.COMMON.tin_MaxY.get();
		tin_SpawnSize = Configuration.COMMON.tin_SpawnSize.get();
		tin_VeinCount = Configuration.COMMON.tin_VeinCount.get();

		zinc_MinY = Configuration.COMMON.zinc_MinY.get();
		zinc_MaxY = Configuration.COMMON.zinc_MaxY.get();
		zinc_SpawnSize = Configuration.COMMON.zinc_SpawnSize.get();
		zinc_VeinCount = Configuration.COMMON.zinc_VeinCount.get();

		uranium_MinY = Configuration.COMMON.uranium_MinY.get();
		uranium_MaxY = Configuration.COMMON.uranium_MaxY.get();
		uranium_SpawnSize = Configuration.COMMON.uranium_SpawnSize.get();
		uranium_VeinCount = Configuration.COMMON.uranium_VeinCount.get();
	}

	public static class Common {
		public final ForgeConfigSpec.BooleanValue aluminumGen;
		public final ForgeConfigSpec.BooleanValue leadGen;
		public final ForgeConfigSpec.BooleanValue nickelGen;
		public final ForgeConfigSpec.BooleanValue osmiumGen;
		public final ForgeConfigSpec.BooleanValue platinumGen;
		public final ForgeConfigSpec.BooleanValue silverGen;
		public final ForgeConfigSpec.BooleanValue tinGen;
		public final ForgeConfigSpec.BooleanValue uraniumGen;
		public final ForgeConfigSpec.BooleanValue zincGen;

		public final ForgeConfigSpec.IntValue aluminum_MinY;
		public final ForgeConfigSpec.IntValue aluminum_MaxY;
		public final ForgeConfigSpec.IntValue aluminum_SpawnSize;
		public final ForgeConfigSpec.IntValue aluminum_VeinCount;

		public final ForgeConfigSpec.IntValue lead_MinY;
		public final ForgeConfigSpec.IntValue lead_MaxY;
		public final ForgeConfigSpec.IntValue lead_SpawnSize;
		public final ForgeConfigSpec.IntValue lead_VeinCount;

		public final ForgeConfigSpec.IntValue nickel_MinY;
		public final ForgeConfigSpec.IntValue nickel_MaxY;
		public final ForgeConfigSpec.IntValue nickel_SpawnSize;
		public final ForgeConfigSpec.IntValue nickel_VeinCount;

		public final ForgeConfigSpec.IntValue osmium_MinY;
		public final ForgeConfigSpec.IntValue osmium_MaxY;
		public final ForgeConfigSpec.IntValue osmium_SpawnSize;
		public final ForgeConfigSpec.IntValue osmium_VeinCount;

		public final ForgeConfigSpec.IntValue platinum_MinY;
		public final ForgeConfigSpec.IntValue platinum_MaxY;
		public final ForgeConfigSpec.IntValue platinum_SpawnSize;
		public final ForgeConfigSpec.IntValue platinum_VeinCount;

		public final ForgeConfigSpec.IntValue silver_MinY;
		public final ForgeConfigSpec.IntValue silver_MaxY;
		public final ForgeConfigSpec.IntValue silver_SpawnSize;
		public final ForgeConfigSpec.IntValue silver_VeinCount;

		public final ForgeConfigSpec.IntValue tin_MinY;
		public final ForgeConfigSpec.IntValue tin_MaxY;
		public final ForgeConfigSpec.IntValue tin_SpawnSize;
		public final ForgeConfigSpec.IntValue tin_VeinCount;

		public final ForgeConfigSpec.IntValue zinc_MinY;
		public final ForgeConfigSpec.IntValue zinc_MaxY;
		public final ForgeConfigSpec.IntValue zinc_SpawnSize;
		public final ForgeConfigSpec.IntValue zinc_VeinCount;

		public final ForgeConfigSpec.IntValue uranium_MinY;
		public final ForgeConfigSpec.IntValue uranium_MaxY;
		public final ForgeConfigSpec.IntValue uranium_SpawnSize;
		public final ForgeConfigSpec.IntValue uranium_VeinCount;

		public Common(ForgeConfigSpec.Builder BUILDER) {

			BUILDER.push("spawncontrol");
			aluminumGen = BUILDER.comment("Enable Aluminum Worldgen").define("aluminum", true);
			leadGen = BUILDER.comment("Enable Lead Worldgen").define("lead", true);
			nickelGen = BUILDER.comment("Enable Nickel Worldgen").define("nickel", true);
			osmiumGen = BUILDER.comment("Enable Osmium Worldgen").define("osmium", true);
			platinumGen = BUILDER.comment("Enable Platinum Worldgen").define("platinum", true);
			silverGen = BUILDER.comment("Enable Silver Worldgen").define("silver", true);
			tinGen = BUILDER.comment("Enable Tin Worldgen").define("tin", true);
			uraniumGen = BUILDER.comment("Enable Uranium Worldgen").define("uranium", true);
			zincGen = BUILDER.comment("Enable Zinc Worldgen").define("zinc", true);
			BUILDER.pop();
			BUILDER.push("spawntuning");

			BUILDER.push("aluminum");
			aluminum_MinY = BUILDER.comment("Aluminum bottom Y level for spawn").defineInRange("aluminum_min_y",
					60, 1, 254);
			aluminum_MaxY = BUILDER.comment("Aluminum top Y level for spawn").defineInRange("aluminum_max_y", 80,
					1, 254);
			aluminum_SpawnSize = BUILDER.comment("Aluminum deposit size(number of ores)").defineInRange("aluminum_deposit_size",
					7, 1, 64);
			aluminum_VeinCount = BUILDER.comment("Aluminum : Distance between veins").defineInRange("aluminum_vein_count",
					10, 1, 64);
			BUILDER.pop();

			BUILDER.push("zinc");

			zinc_MinY = BUILDER.comment("Zinc bottom Y level for spawn").defineInRange("zinc_min_y", 1, 1, 254);
			zinc_MaxY = BUILDER.comment("Zinc top Y level for spawn").defineInRange("zinc_max_y", 60, 1, 254);
			zinc_SpawnSize = BUILDER.comment("Zinc deposit size(number of ores)").defineInRange("zinc_deposit_size", 7, 1, 64);
			zinc_VeinCount = BUILDER.comment("Zinc : Distance between veins").defineInRange("zinc_vein_count",
					10, 1, 64);
			BUILDER.pop();

			BUILDER.push("lead");
			lead_MinY = BUILDER.comment("Lead bottom Y level for spawn").defineInRange("lead_min_y", 10, 1, 254);
			lead_MaxY = BUILDER.comment("Lead top Y level for spawn").defineInRange("lead_max_y", 40, 1, 254);
			lead_SpawnSize = BUILDER.comment("Lead deposit size(number of ores)").defineInRange("lead_deposit_size", 7, 1, 64);
			lead_VeinCount = BUILDER.comment("Lead : Distance between veins").defineInRange("lead_vein_count",
					8, 1, 64);
			BUILDER.pop();

			BUILDER.push("nickel");
			nickel_MinY = BUILDER.comment("Nickel bottom Y level for spawn").defineInRange("nickel_min_y", 1, 1,
					254);
			nickel_MaxY = BUILDER.comment("Nickel top Y level for spawn").defineInRange("nickel_max_y", 25, 1,
					254);
			nickel_SpawnSize = BUILDER.comment("Nickel deposit size(number of ores)").defineInRange("nickel_deposit_size", 7, 1,
					64);
			nickel_VeinCount = BUILDER.comment("Nickel : Distance between veins").defineInRange("nickel_vein_count",
					8, 1, 64);
			BUILDER.pop();

			BUILDER.push("osmium");
			osmium_MinY = BUILDER.comment("Osmium bottom Y level for spawn").defineInRange("osmium_min_y", 5, 1,
					254);
			osmium_MaxY = BUILDER.comment("Osmium top Y level for spawn").defineInRange("osmium_max_y", 40, 1,
					254);
			osmium_SpawnSize = BUILDER.comment("Osmium deposit size(number of ores)").defineInRange("osmium_deposit_size", 7, 1,
					64);
			osmium_VeinCount = BUILDER.comment("Osmium : Distance between veins").defineInRange("osmium_vein_count",
					8, 1, 64);
			BUILDER.pop();

			BUILDER.push("platinum");
			platinum_MinY = BUILDER.comment("Platinum bottom Y level for spawn").defineInRange("platinum_min_y",
					1, 1, 254);
			platinum_MaxY = BUILDER.comment("Platinum top Y level for spawn").defineInRange("platinum_max_y", 25,
					1, 254);
			platinum_SpawnSize = BUILDER.comment("Platinum deposit size(number of ores)").defineInRange("platinum_deposit_size",
					3, 1, 64);
			platinum_VeinCount = BUILDER.comment("Platinum : Distance between veins").defineInRange("platinum_vein_count",
					6, 1, 64);
			BUILDER.pop();

			BUILDER.push("silver");
			silver_MinY = BUILDER.comment("Silver bottom Y level for spawn").defineInRange("silver_min_y", 1, 1,
					254);
			silver_MaxY = BUILDER.comment("Silver top Y level for spawn").defineInRange("silver_max_y", 25, 1,
					254);
			silver_SpawnSize = BUILDER.comment("Silver deposit size(number of ores)").defineInRange("silver_deposit_size", 5, 1,
					64);
			silver_VeinCount = BUILDER.comment("Silver : Distance between veins").defineInRange("silver_vein_count",
					8, 1, 64);
			BUILDER.pop();

			BUILDER.push("tin");
			tin_MinY = BUILDER.comment("Tin bottom Y level for spawn").defineInRange("tin_min_y", 30, 1, 254);
			tin_MaxY = BUILDER.comment("Tin top Y level for spawn").defineInRange("tin_max_y", 60, 1, 254);
			tin_SpawnSize = BUILDER.comment("Tin deposit size(number of ores)").defineInRange("tin_deposit_size", 7, 1, 64);
			tin_VeinCount = BUILDER.comment("Tin : Distance between veins").defineInRange("tin_vein_count",
					10, 1, 64);
			BUILDER.pop();

			BUILDER.push("uranium");
			uranium_MinY = BUILDER.comment("Uranium bottom Y level for spawn").defineInRange("uranium_min_y", 1,
					1, 254);
			uranium_MaxY = BUILDER.comment("Uranium top Y level for spawn").defineInRange("uranium_max_y", 25, 1,
					254);
			uranium_SpawnSize = BUILDER.comment("Uranium deposit size(number of ores)").defineInRange("uranium_deposit_size", 4,
					1, 64);
			uranium_VeinCount = BUILDER.comment("Uranium : Distance between veins").defineInRange("uranium_vein_count",
					6, 1, 64);
			BUILDER.pop(2);

		}
	}

}

package net.allthemods.alltheores.infos;

import com.electronwill.nightconfig.core.Config;
import net.allthemods.alltheores.AllTheOres;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.fml.config.ConfigTracker;
import net.minecraftforge.fml.config.IConfigEvent;
import net.minecraftforge.fml.event.config.ModConfigEvent;

import org.apache.commons.lang3.tuple.Pair;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.config.ModConfig;

@EventBusSubscriber(modid = Reference.MOD_ID, bus = EventBusSubscriber.Bus.MOD)
public class Configuration {
	public static boolean aluminumGen;
	public static boolean iridiumGen;
	public static boolean leadGen;
	public static boolean nickelGen;
	public static boolean osmiumGen;
	public static boolean platinumGen;
	public static boolean silverGen;
	public static boolean tinGen;
	public static boolean uraniumGen;
	public static boolean zincGen;

	public static boolean rubyGen;
	public static boolean peridotGen;
	public static boolean sapphireGen;

	public static boolean aluminumNetherGen;
	public static boolean iridiumNetherGen;
	public static boolean leadNetherGen;
	public static boolean nickelNetherGen;
	public static boolean osmiumNetherGen;
	public static boolean platinumNetherGen;
	public static boolean silverNetherGen;
	public static boolean tinNetherGen;
	public static boolean uraniumNetherGen;
	public static boolean zincNetherGen;

	public static boolean aluminumEndGen;
	public static boolean iridiumEndGen;
	public static boolean leadEndGen;
	public static boolean nickelEndGen;
	public static boolean osmiumEndGen;
	public static boolean platinumEndGen;
	public static boolean silverEndGen;
	public static boolean tinEndGen;
	public static boolean uraniumEndGen;
	public static boolean zincEndGen;


	public static int ruby_MinY;
	public static int ruby_MaxY;
	public static int ruby_SpawnSize;
	public static int ruby_SpawnCount;

	public static int peridot_MinY;
	public static int peridot_MaxY;
	public static int peridot_SpawnSize;
	public static int peridot_SpawnCount;

	public static int sapphire_MinY;
	public static int sapphire_MaxY;
	public static int sapphire_SpawnSize;
	public static int sapphire_SpawnCount;


	public static int aluminum_MinY;
	public static int aluminum_MaxY;
	public static int aluminum_SpawnSize;
	public static int aluminum_SpawnCount;


	public static int iridium_MinY;
	public static int iridium_MaxY;
	public static int iridium_SpawnSize;
	public static int iridium_SpawnCount;

	public static int lead_MinY;
	public static int lead_MaxY;
	public static int lead_SpawnSize;
	public static int lead_SpawnCount;

	public static int nickel_MinY;
	public static int nickel_MaxY;
	public static int nickel_SpawnSize;
	public static int nickel_SpawnCount;

	public static int osmium_MinY;
	public static int osmium_MaxY;
	public static int osmium_SpawnSize;
	public static int osmium_SpawnCount;

	public static int platinum_MinY;
	public static int platinum_MaxY;
	public static int platinum_SpawnSize;
	public static int platinum_SpawnCount;

	public static int silver_MinY;
	public static int silver_MaxY;
	public static int silver_SpawnSize;
	public static int silver_SpawnCount;

	public static int tin_MinY;
	public static int tin_MaxY;
	public static int tin_SpawnSize;
	public static int tin_SpawnCount;

	public static int zinc_MinY;
	public static int zinc_MaxY;
	public static int zinc_SpawnSize;
	public static int zinc_SpawnCount;

	public static int uranium_MinY;
	public static int uranium_MaxY;
	public static int uranium_SpawnSize;
	public static int uranium_SpawnCount;

	public static final ForgeConfigSpec COMMON_SPEC;
	public static final Common COMMON;
	static {
		final Pair<Common, ForgeConfigSpec> specPair = new ForgeConfigSpec.Builder().configure(Common::new);
		COMMON_SPEC = specPair.getRight();
		COMMON = specPair.getLeft();
	}

	@SubscribeEvent
	public static void onModConfigEvent(final ModConfigEvent configEvent) {
		AllTheOres.LOGGER.info("AllTheOres: loading config");
		bakeConfigs();
	}

	private static void bakeConfigs() {

		aluminumGen = Configuration.COMMON.aluminumGen.get();
		iridiumGen = Configuration.COMMON.iridiumGen.get();
		leadGen = Configuration.COMMON.leadGen.get();
		nickelGen = Configuration.COMMON.nickelGen.get();
		osmiumGen = Configuration.COMMON.osmiumGen.get();
		platinumGen = Configuration.COMMON.platinumGen.get();
		silverGen = Configuration.COMMON.silverGen.get();
		tinGen = Configuration.COMMON.tinGen.get();
		uraniumGen = Configuration.COMMON.uraniumGen.get();
		zincGen = Configuration.COMMON.zincGen.get();

		rubyGen = Configuration.COMMON.rubyGen.get();
		sapphireGen = Configuration.COMMON.sapphireGen.get();
		peridotGen =  Configuration.COMMON.peridotGen.get();

		aluminumNetherGen = Configuration.COMMON.aluminumNetherGen.get();
		iridiumNetherGen = Configuration.COMMON.iridiumNetherGen.get();
		leadNetherGen = Configuration.COMMON.leadNetherGen.get();
		nickelNetherGen = Configuration.COMMON.nickelNetherGen.get();
		osmiumNetherGen = Configuration.COMMON.osmiumNetherGen.get();
		platinumNetherGen = Configuration.COMMON.platinumNetherGen.get();
		silverNetherGen = Configuration.COMMON.silverNetherGen.get();
		tinNetherGen = Configuration.COMMON.tinNetherGen.get();
		uraniumNetherGen = Configuration.COMMON.uraniumNetherGen.get();
		zincNetherGen = Configuration.COMMON.zincNetherGen.get();

		aluminumEndGen = Configuration.COMMON.aluminumEndGen.get();
		iridiumEndGen = Configuration.COMMON.iridiumEndGen.get();
		leadEndGen = Configuration.COMMON.leadEndGen.get();
		nickelEndGen = Configuration.COMMON.nickelEndGen.get();
		osmiumEndGen = Configuration.COMMON.osmiumEndGen.get();
		platinumEndGen = Configuration.COMMON.platinumEndGen.get();
		silverEndGen = Configuration.COMMON.silverEndGen.get();
		tinEndGen = Configuration.COMMON.tinEndGen.get();
		uraniumEndGen = Configuration.COMMON.uraniumEndGen.get();
		zincEndGen = Configuration.COMMON.zincEndGen.get();

		aluminum_MinY = Configuration.COMMON.aluminum_MinY.get();
		aluminum_MaxY = Configuration.COMMON.aluminum_MaxY.get();
		aluminum_SpawnSize = Configuration.COMMON.aluminum_SpawnSize.get();
		aluminum_SpawnCount = Configuration.COMMON.aluminum_SpawnCount.get();

		iridium_MinY = Configuration.COMMON.iridium_MinY.get();
		iridium_MaxY = Configuration.COMMON.iridium_MaxY.get();
		iridium_SpawnSize = Configuration.COMMON.iridium_SpawnSize.get();
		iridium_SpawnCount = Configuration.COMMON.iridium_SpawnCount.get();

		lead_MinY = Configuration.COMMON.lead_MinY.get();
		lead_MaxY = Configuration.COMMON.lead_MaxY.get();
		lead_SpawnSize = Configuration.COMMON.lead_SpawnSize.get();
		lead_SpawnCount = Configuration.COMMON.lead_SpawnCount.get();

		nickel_MinY = Configuration.COMMON.nickel_MinY.get();
		nickel_MaxY = Configuration.COMMON.nickel_MaxY.get();
		nickel_SpawnSize = Configuration.COMMON.nickel_SpawnSize.get();
		nickel_SpawnCount = Configuration.COMMON.nickel_SpawnCount.get();

		osmium_MinY = Configuration.COMMON.osmium_MinY.get();
		osmium_MaxY = Configuration.COMMON.osmium_MaxY.get();
		osmium_SpawnSize = Configuration.COMMON.osmium_SpawnSize.get();
		osmium_SpawnCount = Configuration.COMMON.osmium_SpawnCount.get();

		platinum_MinY = Configuration.COMMON.platinum_MinY.get();
		platinum_MaxY = Configuration.COMMON.platinum_MaxY.get();
		platinum_SpawnSize = Configuration.COMMON.platinum_SpawnSize.get();
		platinum_SpawnCount = Configuration.COMMON.platinum_SpawnCount.get();

		silver_MinY = Configuration.COMMON.silver_MinY.get();
		silver_MaxY = Configuration.COMMON.silver_MaxY.get();
		silver_SpawnSize = Configuration.COMMON.silver_SpawnSize.get();
		silver_SpawnCount = Configuration.COMMON.silver_SpawnCount.get();

		tin_MinY = Configuration.COMMON.tin_MinY.get();
		tin_MaxY = Configuration.COMMON.tin_MaxY.get();
		tin_SpawnSize = Configuration.COMMON.tin_SpawnSize.get();
		tin_SpawnCount = Configuration.COMMON.tin_SpawnCount.get();

		zinc_MinY = Configuration.COMMON.zinc_MinY.get();
		zinc_MaxY = Configuration.COMMON.zinc_MaxY.get();
		zinc_SpawnSize = Configuration.COMMON.zinc_SpawnSize.get();
		zinc_SpawnCount = Configuration.COMMON.zinc_SpawnCount.get();

		uranium_MinY = Configuration.COMMON.uranium_MinY.get();
		uranium_MaxY = Configuration.COMMON.uranium_MaxY.get();
		uranium_SpawnSize = Configuration.COMMON.uranium_SpawnSize.get();
		uranium_SpawnCount = Configuration.COMMON.uranium_SpawnCount.get();

		ruby_MinY = Configuration.COMMON.ruby_MinY.get();
		ruby_MaxY = Configuration.COMMON.ruby_MaxY.get();
		ruby_SpawnSize = Configuration.COMMON.ruby_SpawnSize.get();
		ruby_SpawnCount = Configuration.COMMON.ruby_SpawnCount.get();

		sapphire_MinY = Configuration.COMMON.sapphire_MinY.get();
		sapphire_MaxY = Configuration.COMMON.sapphire_MaxY.get();
		sapphire_SpawnSize = Configuration.COMMON.sapphire_SpawnSize.get();
		sapphire_SpawnCount = Configuration.COMMON.sapphire_SpawnCount.get();

		peridot_MinY = Configuration.COMMON.peridot_MinY.get();
		peridot_MaxY = Configuration.COMMON.peridot_MaxY.get();
		peridot_SpawnSize = Configuration.COMMON.peridot_SpawnSize.get();
		peridot_SpawnCount = Configuration.COMMON.peridot_SpawnCount.get();

	}

	public static class Common {
		public final ForgeConfigSpec.BooleanValue aluminumGen;
		public final ForgeConfigSpec.BooleanValue iridiumGen;
		public final ForgeConfigSpec.BooleanValue leadGen;
		public final ForgeConfigSpec.BooleanValue nickelGen;
		public final ForgeConfigSpec.BooleanValue osmiumGen;
		public final ForgeConfigSpec.BooleanValue platinumGen;
		public final ForgeConfigSpec.BooleanValue silverGen;
		public final ForgeConfigSpec.BooleanValue tinGen;
		public final ForgeConfigSpec.BooleanValue uraniumGen;
		public final ForgeConfigSpec.BooleanValue zincGen;

		public final ForgeConfigSpec.BooleanValue rubyGen;
		public final ForgeConfigSpec.BooleanValue sapphireGen;
		public final ForgeConfigSpec.BooleanValue peridotGen;

		public final ForgeConfigSpec.BooleanValue aluminumNetherGen;
		public final ForgeConfigSpec.BooleanValue iridiumNetherGen;
		public final ForgeConfigSpec.BooleanValue leadNetherGen;
		public final ForgeConfigSpec.BooleanValue nickelNetherGen;
		public final ForgeConfigSpec.BooleanValue osmiumNetherGen;
		public final ForgeConfigSpec.BooleanValue platinumNetherGen;
		public final ForgeConfigSpec.BooleanValue silverNetherGen;
		public final ForgeConfigSpec.BooleanValue tinNetherGen;
		public final ForgeConfigSpec.BooleanValue uraniumNetherGen;
		public final ForgeConfigSpec.BooleanValue zincNetherGen;

		public final ForgeConfigSpec.BooleanValue aluminumEndGen;
		public final ForgeConfigSpec.BooleanValue iridiumEndGen;
		public final ForgeConfigSpec.BooleanValue leadEndGen;
		public final ForgeConfigSpec.BooleanValue nickelEndGen;
		public final ForgeConfigSpec.BooleanValue osmiumEndGen;
		public final ForgeConfigSpec.BooleanValue platinumEndGen;
		public final ForgeConfigSpec.BooleanValue silverEndGen;
		public final ForgeConfigSpec.BooleanValue tinEndGen;
		public final ForgeConfigSpec.BooleanValue uraniumEndGen;
		public final ForgeConfigSpec.BooleanValue zincEndGen;

		public final ForgeConfigSpec.IntValue aluminum_MinY;
		public final ForgeConfigSpec.IntValue aluminum_MaxY;
		public final ForgeConfigSpec.IntValue aluminum_SpawnSize;
		public final ForgeConfigSpec.IntValue aluminum_SpawnCount;

		public final ForgeConfigSpec.IntValue iridium_MinY;
		public final ForgeConfigSpec.IntValue iridium_MaxY;
		public final ForgeConfigSpec.IntValue iridium_SpawnSize;
		public final ForgeConfigSpec.IntValue iridium_SpawnCount;

		public final ForgeConfigSpec.IntValue lead_MinY;
		public final ForgeConfigSpec.IntValue lead_MaxY;
		public final ForgeConfigSpec.IntValue lead_SpawnSize;
		public final ForgeConfigSpec.IntValue lead_SpawnCount;

		public final ForgeConfigSpec.IntValue nickel_MinY;
		public final ForgeConfigSpec.IntValue nickel_MaxY;
		public final ForgeConfigSpec.IntValue nickel_SpawnSize;
		public final ForgeConfigSpec.IntValue nickel_SpawnCount;

		public final ForgeConfigSpec.IntValue osmium_MinY;
		public final ForgeConfigSpec.IntValue osmium_MaxY;
		public final ForgeConfigSpec.IntValue osmium_SpawnSize;
		public final ForgeConfigSpec.IntValue osmium_SpawnCount;

		public final ForgeConfigSpec.IntValue platinum_MinY;
		public final ForgeConfigSpec.IntValue platinum_MaxY;
		public final ForgeConfigSpec.IntValue platinum_SpawnSize;
		public final ForgeConfigSpec.IntValue platinum_SpawnCount;

		public final ForgeConfigSpec.IntValue silver_MinY;
		public final ForgeConfigSpec.IntValue silver_MaxY;
		public final ForgeConfigSpec.IntValue silver_SpawnSize;
		public final ForgeConfigSpec.IntValue silver_SpawnCount;

		public final ForgeConfigSpec.IntValue tin_MinY;
		public final ForgeConfigSpec.IntValue tin_MaxY;
		public final ForgeConfigSpec.IntValue tin_SpawnSize;
		public final ForgeConfigSpec.IntValue tin_SpawnCount;

		public final ForgeConfigSpec.IntValue zinc_MinY;
		public final ForgeConfigSpec.IntValue zinc_MaxY;
		public final ForgeConfigSpec.IntValue zinc_SpawnSize;
		public final ForgeConfigSpec.IntValue zinc_SpawnCount;

		public final ForgeConfigSpec.IntValue uranium_MinY;
		public final ForgeConfigSpec.IntValue uranium_MaxY;
		public final ForgeConfigSpec.IntValue uranium_SpawnSize;
		public final ForgeConfigSpec.IntValue uranium_SpawnCount;

		public final ForgeConfigSpec.IntValue ruby_MinY;
		public final ForgeConfigSpec.IntValue ruby_MaxY;
		public final ForgeConfigSpec.IntValue ruby_SpawnSize;
		public final ForgeConfigSpec.IntValue ruby_SpawnCount;

		public final ForgeConfigSpec.IntValue sapphire_MinY;
		public final ForgeConfigSpec.IntValue sapphire_MaxY;
		public final ForgeConfigSpec.IntValue sapphire_SpawnSize;
		public final ForgeConfigSpec.IntValue sapphire_SpawnCount;

		public final ForgeConfigSpec.IntValue peridot_MinY;
		public final ForgeConfigSpec.IntValue peridot_MaxY;
		public final ForgeConfigSpec.IntValue peridot_SpawnSize;
		public final ForgeConfigSpec.IntValue peridot_SpawnCount;

		public Common(ForgeConfigSpec.Builder BUILDER) {

			BUILDER.push("spawncontrol");
			BUILDER.push("overworld");
			aluminumGen = BUILDER.comment("Enable Aluminum Worldgen(Overworld)").define("aluminum", true);
			iridiumGen = BUILDER.comment("Enable Iridium Worldgen(Overworld)").define("iridium", true);
			leadGen = BUILDER.comment("Enable Lead Worldgen(Overworld)").define("lead", true);
			nickelGen = BUILDER.comment("Enable Nickel Worldgen(Overworld)").define("nickel", true);
			osmiumGen = BUILDER.comment("Enable Osmium Worldgen(Overworld)").define("osmium", true);
			platinumGen = BUILDER.comment("Enable Platinum Worldgen(Overworld)").define("platinum", true);
			silverGen = BUILDER.comment("Enable Silver Worldgen(Overworld)").define("silver", true);
			tinGen = BUILDER.comment("Enable Tin Worldgen(Overworld)").define("tin", true);
			uraniumGen = BUILDER.comment("Enable Uranium Worldgen(Overworld)").define("uranium", true);
			zincGen = BUILDER.comment("Enable Zinc Worldgen(Overworld)").define("zinc", true);

			rubyGen = BUILDER.comment("Enable Ruby Worldgen(Overworld-Plains)").define("ruby", true);
			sapphireGen = BUILDER.comment("Enable Sapphire Worldgen(Overworld-Ocean)").define("sapphire", true);
			peridotGen = BUILDER.comment("Enable Peridot Worldgen(Overworld-Desert)").define("peridot", true);

			BUILDER.pop();
			BUILDER.push("nether");
			aluminumNetherGen = BUILDER.comment("Enable Aluminum Worldgen(Nether)").define("aluminum_nether", true);
			iridiumNetherGen = BUILDER.comment("Enable Iridium Worldgen(Nether)").define("iridium_nether", true);
			leadNetherGen = BUILDER.comment("Enable Lead Worldgen(Nether)").define("lead_nether", true);
			nickelNetherGen = BUILDER.comment("Enable Nickel Worldgen(Nether)").define("nickel_nether", true);
			osmiumNetherGen = BUILDER.comment("Enable Osmium Worldgen(Nether)").define("osmium_nether", true);
			platinumNetherGen = BUILDER.comment("Enable Platinum Worldgen(Nether)").define("platinum_nether", true);
			silverNetherGen = BUILDER.comment("Enable Silver Worldgen(Nether)").define("silver_nether", true);
			tinNetherGen = BUILDER.comment("Enable Tin Worldgen(Nether)").define("tin_nether", true);
			uraniumNetherGen = BUILDER.comment("Enable Uranium Worldgen(Nether)").define("uranium_nether", true);
			zincNetherGen = BUILDER.comment("Enable Zinc Worldgen(Nether)").define("zinc_nether", true);
			BUILDER.pop();
			BUILDER.push("end");
			aluminumEndGen = BUILDER.comment("Enable Aluminum Worldgen(The End)").define("aluminum_end", true);
			iridiumEndGen = BUILDER.comment("Enable Iridium Worldgen(The End)").define("iridium_end", true);
			leadEndGen = BUILDER.comment("Enable Lead Worldgen(The End)").define("lead_end", true);
			nickelEndGen = BUILDER.comment("Enable Nickel Worldgen(The End)").define("nickel_end", true);
			osmiumEndGen = BUILDER.comment("Enable Osmium Worldgen(The End)").define("osmium_end", true);
			platinumEndGen = BUILDER.comment("Enable Platinum Worldgen(The End)").define("platinum_end", true);
			silverEndGen = BUILDER.comment("Enable Silver Worldgen(The End)").define("silver_end", true);
			tinEndGen = BUILDER.comment("Enable Tin Worldgen(The End)").define("tin_end", true);
			uraniumEndGen = BUILDER.comment("Enable Uranium Worldgen(The End)").define("uranium_end", true);
			zincEndGen = BUILDER.comment("Enable Zinc Worldgen(The End)").define("zinc_end", true);
			BUILDER.pop(2);
			BUILDER.push("spawntuning");

			BUILDER.push("aluminum");
			aluminum_MinY = BUILDER.comment("Aluminum generates no lower than X blocks above world BOTTOM").defineInRange("aluminum_min_y",
					50, -64, 320);
			aluminum_MaxY = BUILDER.comment("Aluminum generates no higher than X blocks above world BOTTOM").defineInRange("aluminum_max_y", 120,
					0, 320);
			aluminum_SpawnSize = BUILDER.comment("Aluminum deposit size(number of ores)").defineInRange("aluminum_deposit_size",
					7, 1, 64);
			aluminum_SpawnCount = BUILDER.comment("Aluminum deposit count(number of veins)").defineInRange("aluminum_deposit_count",
					20, 1, 64);

			BUILDER.pop();

			BUILDER.push("iridium");
			iridium_MinY = BUILDER.comment("Iridium generates no lower than X blocks above world BOTTOM").defineInRange("iridium_min_y",
					5, -64, 320);
			iridium_MaxY = BUILDER.comment("Iridium generates no higher than X blocks above world BOTTOM").defineInRange("iridium_max_y", 69,
					0, 320);
			iridium_SpawnSize = BUILDER.comment("Iridium deposit size(number of ores)").defineInRange("iridium_deposit_size",
					2, 1, 64);
			iridium_SpawnCount = BUILDER.comment("Iridium rarity, lower = more common").defineInRange("iridium_deposit_count",
					1, 1, 64);

			BUILDER.pop();

			BUILDER.push("zinc");

			zinc_MinY = BUILDER.comment("Zinc generates no lower than X blocks above world BOTTOM").defineInRange("zinc_min_y", 5, -64, 320);
			zinc_MaxY = BUILDER.comment("Zinc generates no higher than X blocks above world BOTTOM").defineInRange("zinc_max_y", 100, 0, 320);
			zinc_SpawnSize = BUILDER.comment("Zinc deposit size(number of ores)").defineInRange("zinc_deposit_size", 7, 1, 64);
			zinc_SpawnCount = BUILDER.comment("Zinc deposit count(number of veins)").defineInRange("zinc_deposit_count",
					20, 1, 64);
			BUILDER.pop();

			BUILDER.push("lead");
			lead_MinY = BUILDER.comment("Lead generates no lower than X blocks above world BOTTOM").defineInRange("lead_min_y", 5, -64, 320);
			lead_MaxY = BUILDER.comment("Lead generates no higher than X blocks above world BOTTOM").defineInRange("lead_max_y", 95, 0, 320);
			lead_SpawnSize = BUILDER.comment("Lead deposit size(number of ores)").defineInRange("lead_deposit_size", 7, 1, 64);
			lead_SpawnCount = BUILDER.comment("Lead deposit count(number of veins)").defineInRange("lead_deposit_count",
					20, 1, 64);
			BUILDER.pop();

			BUILDER.push("nickel");
			nickel_MinY = BUILDER.comment("Nickel generates no lower than X blocks above world BOTTOM").defineInRange("nickel_min_y", 1, -64,
					320);
			nickel_MaxY = BUILDER.comment("Nickel generates no higher than X blocks above world BOTTOM").defineInRange("nickel_max_y", 85, 0,
					320);
			nickel_SpawnSize = BUILDER.comment("Nickel deposit size(number of ores)").defineInRange("nickel_deposit_size", 7, 1,
					64);
			nickel_SpawnCount = BUILDER.comment("Nickel deposit count(number of veins)").defineInRange("nickel_deposit_count",
					20, 1, 64);
			BUILDER.pop();

			BUILDER.push("osmium");
			osmium_MinY = BUILDER.comment("Osmium generates no lower than X blocks above world BOTTOM").defineInRange("osmium_min_y", 10, -64,
					320);
			osmium_MaxY = BUILDER.comment("Osmium generates no higher than X blocks above world BOTTOM").defineInRange("osmium_max_y", 100, 0,
					320);
			osmium_SpawnSize = BUILDER.comment("Osmium deposit size(number of ores)").defineInRange("osmium_deposit_size", 7, 1,
					64);
			osmium_SpawnCount = BUILDER.comment("Osmium deposit count(number of veins)").defineInRange("osmium_deposit_count",
					20, 1, 64);
			BUILDER.pop();

			BUILDER.push("platinum");
			platinum_MinY = BUILDER.comment("Platinum generates no lower than X blocks above world BOTTOM").defineInRange("platinum_min_y",
					1, -64, 320);
			platinum_MaxY = BUILDER.comment("Platinum generates no higher than X blocks above world BOTTOM").defineInRange("platinum_max_y", 70,
					0, 320);
			platinum_SpawnSize = BUILDER.comment("Platinum deposit size(number of ores)").defineInRange("platinum_deposit_size",
					3, 1, 64);
			platinum_SpawnCount = BUILDER.comment("Platinum deposit count(number of veins)").defineInRange("platinum_deposit_count",
					20, 1, 64);
			BUILDER.pop();

			BUILDER.push("silver");
			silver_MinY = BUILDER.comment("Silver generates no lower than X blocks above world BOTTOM").defineInRange("silver_min_y", 50, -64,
					320);
			silver_MaxY = BUILDER.comment("Silver generates no higher than X blocks above world BOTTOM").defineInRange("silver_max_y", 120, 0,
					320);
			silver_SpawnSize = BUILDER.comment("Silver deposit size(number of ores)").defineInRange("silver_deposit_size", 5, 1,
					64);
			silver_SpawnCount = BUILDER.comment("Silver deposit count(number of veins)").defineInRange("silver_deposit_count",
					20, 1, 64);
			BUILDER.pop();

			BUILDER.push("tin");
			tin_MinY = BUILDER.comment("Tin generates no lower than X blocks above world BOTTOM").defineInRange("tin_min_y", 55, -64, 320);
			tin_MaxY = BUILDER.comment("Tin generates no higher than X blocks above world BOTTOM").defineInRange("tin_max_y", 180, 0, 320);
			tin_SpawnSize = BUILDER.comment("Tin deposit size(number of ores)").defineInRange("tin_deposit_size", 7, 1, 64);
			tin_SpawnCount = BUILDER.comment("Tin deposit count(number of veins)").defineInRange("tin_deposit_count",
					20, 1, 64);
			BUILDER.pop();

			BUILDER.push("ruby");
			ruby_MinY = BUILDER.comment("Ruby generates no lower than").defineInRange("ruby_min_y", -62, -64, 320);
			ruby_MaxY = BUILDER.comment("Ruby generates no higher than").defineInRange("ruby_max_y", 16, -64, 320);
			ruby_SpawnSize = BUILDER.comment("Ruby deposit size(number of ores)").defineInRange("ruby_deposit_size", 2, 1, 64);
			ruby_SpawnCount = BUILDER.comment("Ruby deposit count(number of veins)").defineInRange("ruby_deposit_count",
					3, 1, 64);
			BUILDER.pop();

			BUILDER.push("sapphire");
			sapphire_MinY = BUILDER.comment("Sapphire generates no lower than").defineInRange("sapphire_min_y", -62, -64, 320);
			sapphire_MaxY = BUILDER.comment("Sapphire generates no higher than").defineInRange("sapphire_max_y", 16, -64, 320);
			sapphire_SpawnSize = BUILDER.comment("Sapphire deposit size(number of ores)").defineInRange("sapphire_deposit_size", 2, 1, 64);
			sapphire_SpawnCount = BUILDER.comment("Sapphire deposit count(number of veins)").defineInRange("sapphire_deposit_count",
					3, 1, 64);
			BUILDER.pop();

			BUILDER.push("peridot");
			peridot_MinY = BUILDER.comment("Peridot generates no lower than").defineInRange("peridot_min_y", -62, -64, 320);
			peridot_MaxY = BUILDER.comment("Peridot generates no higher than").defineInRange("peridot_max_y", 16, -64, 320);
			peridot_SpawnSize = BUILDER.comment("Peridot deposit size(number of ores)").defineInRange("peridot_deposit_size", 2, 1, 64);
			peridot_SpawnCount = BUILDER.comment("Peridot deposit count(number of veins)").defineInRange("peridot_deposit_count",
					3, 1, 64);
			BUILDER.pop();

			BUILDER.push("uranium");
			uranium_MinY = BUILDER.comment("Uranium generates no lower than X blocks above world BOTTOM").defineInRange("uranium_min_y", 1,
					-64, 320);
			uranium_MaxY = BUILDER.comment("Uranium generates no higher than X blocks above world BOTTOM").defineInRange("uranium_max_y", 70, 0,
					320);
			uranium_SpawnSize = BUILDER.comment("Uranium deposit size(number of ores)").defineInRange("uranium_deposit_size", 4,
					1, 64);
			uranium_SpawnCount = BUILDER.comment("Uranium deposit count(number of veins)").defineInRange("uranium_deposit_count",
					20, 1, 64);
			BUILDER.pop(2);

		}
	}

}

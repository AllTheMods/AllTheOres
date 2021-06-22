package net.allthemods.alltheores.datagen.server;

import net.allthemods.alltheores.blocks.BlockList;
import net.allthemods.alltheores.registry.AlloyRegistryGroup;
import net.allthemods.alltheores.registry.OreRegistryGroup;
import net.allthemods.alltheores.registry.VanillaRegistryGroup;

import java.util.function.Consumer;

public class GroupHelper {
    private GroupHelper() {
        // nothing to do
    }

    public static void applyToOre(Consumer<OreRegistryGroup> consumer) {
        consumer.accept(BlockList.ALUMINUM);
        consumer.accept(BlockList.LEAD);
        consumer.accept(BlockList.NICKEL);
        consumer.accept(BlockList.OSMIUM);
        consumer.accept(BlockList.PLATINUM);
        consumer.accept(BlockList.SILVER);
        consumer.accept(BlockList.TIN);
        consumer.accept(BlockList.URANIUM);
        consumer.accept(BlockList.ZINC);
    }

    public static void applyToAlloy(Consumer<AlloyRegistryGroup> consumer) {
        consumer.accept(BlockList.BRONZE);
        consumer.accept(BlockList.CONSTANTAN);
        consumer.accept(BlockList.ELECTRUM);
        consumer.accept(BlockList.ENDERIUM);
        consumer.accept(BlockList.INVAR);
        consumer.accept(BlockList.LUMIUM);
        consumer.accept(BlockList.SIGNALUM);
        consumer.accept(BlockList.STEEL);
    }

    public static void applyToVanilla(Consumer<VanillaRegistryGroup> consumer) {
        consumer.accept(BlockList.IRON);
        consumer.accept(BlockList.GOLD);
        consumer.accept(BlockList.COPPER);
        consumer.accept(BlockList.DIAMOND);
    }
}

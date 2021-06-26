package net.allthemods.alltheores.datagen.server;

import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import net.allthemods.alltheores.blocks.BlockList;
import net.allthemods.alltheores.registry.OreRegistryGroup;
import net.allthemods.alltheores.registry.OtherOreRegistryGroup;
import net.minecraft.advancements.criterion.EnchantmentPredicate;
import net.minecraft.advancements.criterion.ItemPredicate;
import net.minecraft.advancements.criterion.MinMaxBounds;
import net.minecraft.block.Block;
import net.minecraft.block.FlowingFluidBlock;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.LootTableProvider;
import net.minecraft.data.loot.BlockLootTables;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.loot.*;
import net.minecraft.loot.conditions.ILootCondition;
import net.minecraft.loot.conditions.MatchTool;
import net.minecraft.loot.functions.ApplyBonus;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;

import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class LootTables extends LootTableProvider {

    public LootTables(DataGenerator generator) {
        super(generator);
    }

    @Override
    protected List<Pair<Supplier<Consumer<BiConsumer<ResourceLocation, LootTable.Builder>>>, LootParameterSet>> getTables()
    {
        return ImmutableList.of(
                Pair.of(Blocks::new, LootParameterSets.BLOCK),
                Pair.of(Ore::new, LootParameterSets.BLOCK)
        );
    }

    private static class Blocks extends BlockLootTables
    {
        @Override
        protected void addTables()
        {
            getKnownBlocks().forEach(this::dropSelf);

        }

        @Override
        protected Iterable<Block> getKnownBlocks()
        {
            return BlockList.BLOCKS.getEntries()
                .stream().map(RegistryObject::get)
                .filter(block -> !(block instanceof FlowingFluidBlock))
                .collect(Collectors.toList());
        }
    }

    private static class Ore extends BlockLootTables
    {
        private static final ILootCondition.IBuilder HAS_SILK_TOUCH = MatchTool.toolMatches(ItemPredicate.Builder.item()
                .hasEnchantment(new EnchantmentPredicate(Enchantments.SILK_TOUCH, MinMaxBounds.IntBound.atLeast(1))));

        @Override
        protected void addTables()
        {
            GroupHelper.applyToOre(this::addGroup);
            GroupHelper.applyToOtherOre(this::addOtherGroup);
        }

        /**
         * Register loot tables for a MetalRegistryGroup
         * @param group the registry group
         */
        private void addGroup(OreRegistryGroup group) {
            this.add(group.ORE.get(), block -> createOreDrop(block, group.RAW.get()));
            this.add(group.SLATE_ORE.get(), block -> createOreDrop(block, group.RAW.get()));
            this.add(group.OTHER_ORE.get(), block -> createOtherOreDrop(group.ORE_ITEM.get(), group.RAW.get()));
        }

        /**
         * Register loot tables for OtherOreRegistryGroup
         * @param group the registry group
         */
        private void addOtherGroup(OtherOreRegistryGroup group) {
            this.add(group.OTHER_ORE.get(), block -> createOtherOreDrop(group.ORE, group.RAW));
        }

        private LootTable.Builder createOtherOreDrop(Item ore, Item raw) {
            LootEntry.Builder<?> itemEntry = ItemLootEntry.lootTableItem(raw)
                    .apply(ApplyBonus.addOreBonusCount(Enchantments.BLOCK_FORTUNE));

            LootEntry.Builder<?> lootEntry = ItemLootEntry.lootTableItem(ore)
                    .when(HAS_SILK_TOUCH).otherwise(itemEntry);

            LootPool.Builder lootPool = LootPool.lootPool()
                    .setRolls(ConstantRange.exactly(4))
                    .add(lootEntry);

            return LootTable.lootTable()
                    .withPool(lootPool);
        }

        @Override
        protected Iterable<Block> getKnownBlocks()
        {
            return BlockList.ORE.getEntries()
                    .stream().map(RegistryObject::get)
                    .collect(Collectors.toList());
        }
    }

    @Override
    protected void validate(Map<ResourceLocation, LootTable> map, ValidationTracker validationtracker)
    {
        map.forEach((name, table) -> LootTableManager.validate(validationtracker, name, table));
    }

}

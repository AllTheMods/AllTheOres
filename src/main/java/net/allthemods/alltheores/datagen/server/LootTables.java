package net.allthemods.alltheores.datagen.server;

import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import net.allthemods.alltheores.blocks.AOreBlock;
import net.allthemods.alltheores.blocks.BlockList;
import net.allthemods.alltheores.blocks.OtherOreBlock;
import net.minecraft.block.Block;
import net.minecraft.block.FlowingFluidBlock;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.LootTableProvider;
import net.minecraft.data.loot.BlockLootTables;
import net.minecraft.loot.*;
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
        return ImmutableList.of(Pair.of(Blocks::new, LootParameterSets.BLOCK));
    }

    private static class Blocks extends BlockLootTables
    {
        @Override
        protected void addTables()
        {
            getKnownBlocks().forEach(this::dropRaw);

        }

        private void dropRaw(Block block) {
            if(block instanceof AOreBlock) {
                String oretype = block.getRegistryName().getPath().toString();
                if(oretype.contains("aluminum")) { this.add(block, (block1) -> {
                    return createOreDrop(block1, BlockList.ALUMINUM_RAW.get());
                }); }
                if(oretype.contains("lead")) { this.add(block, (block1) -> {
                    return createOreDrop(block1, BlockList.LEAD_RAW.get());
                }); }
                if(oretype.contains("nickel")) { this.add(block, (block1) -> {
                    return createOreDrop(block1, BlockList.NICKEL_RAW.get());
                }); }
                if(oretype.contains("osmium")) { this.add(block, (block1) -> {
                    return createOreDrop(block1, BlockList.OSMIUM_RAW.get());
                }); }
                if(oretype.contains("platinum")) { this.add(block, (block1) -> {
                    return createOreDrop(block1, BlockList.PLATINUM_RAW.get());
                }); }
                if(oretype.contains("silver")) { this.add(block, (block1) -> {
                    return createOreDrop(block1, BlockList.SILVER_RAW.get());
                }); }
                if(oretype.contains("tin_")) { this.add(block, (block1) -> {
                    return createOreDrop(block1, BlockList.TIN_RAW.get());
                }); }
                if(oretype.contains("uranium")) { this.add(block, (block1) -> {
                    return createOreDrop(block1, BlockList.URANIUM_RAW.get());
                }); }
                if(oretype.contains("zinc")) { this.add(block, (block1) -> {
                    return createOreDrop(block1, BlockList.ZINC_RAW.get());
                }); }
            } else {
                this.dropSelf(block);
            }
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

    @Override
    protected void validate(Map<ResourceLocation, LootTable> map, ValidationTracker validationtracker)
    {
        map.forEach((name, table) -> LootTableManager.validate(validationtracker, name, table));
    }

}

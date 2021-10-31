package net.allthemods.alltheores.datagen.server;

import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import net.allthemods.alltheores.blocks.AOreBlock;
import net.allthemods.alltheores.blocks.BOreBlock;
import net.allthemods.alltheores.blocks.BlockList;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.loot.BlockLoot;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.ValidationContext;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSet;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.minecraftforge.fmllegacy.RegistryObject;

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
    protected List<Pair<Supplier<Consumer<BiConsumer<ResourceLocation, LootTable.Builder>>>, LootContextParamSet>> getTables()
    {
        return ImmutableList.of(Pair.of(Blocks::new, LootContextParamSets.BLOCK));
    }

    public static class Blocks extends BlockLoot
    {
        @Override
        public void addTables()
        {
            getKnownBlocks().forEach(this::dropRaw);

        }

        private void dropRaw(Block block) {
            if((block instanceof AOreBlock) || (block instanceof BOreBlock)) {
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
                .filter(block -> !(block instanceof LiquidBlock))
                .collect(Collectors.toList());

        }


    }

    @Override
    protected void validate(Map<ResourceLocation, LootTable> map, ValidationContext validationtracker)
    {
        map.forEach((name, table) -> net.minecraft.world.level.storage.loot.LootTables.validate(validationtracker, name, table));
    }

}

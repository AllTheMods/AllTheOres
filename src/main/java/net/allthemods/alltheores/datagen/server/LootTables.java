package net.allthemods.alltheores.datagen.server;

import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import net.allthemods.alltheores.blocks.AOreBlock;
import net.allthemods.alltheores.blocks.BOreBlock;
import net.allthemods.alltheores.blocks.BlockList;
import net.allthemods.alltheores.blocks.OtherOreBlock;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.loot.BlockLoot;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.ValidationContext;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSet;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.minecraftforge.registries.RegistryObject;

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
            if((block instanceof AOreBlock) || (block instanceof BOreBlock) || (block instanceof OtherOreBlock)) {
                String oretype = block.getName().toString();
                if(oretype.contains("aluminum")) { this.add(block, (block1) -> {
                    return createOreDrop(block1, BlockList.ALUMINUM_RAW.get());
                }); }
                if(oretype.contains("lead")) { this.add(block, (block1) -> {
                    return createOreDrop(block1, BlockList.LEAD_RAW.get());
                }); }
                if(oretype.contains("iridium")) { this.add(block, (block1) -> {
                    return createOreDrop(block1, BlockList.IRIDIUM_RAW.get());
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
                //
                if(oretype.contains("coal")) { this.add(block, (block1) -> {
                    return createOreDrop(block1, Items.COAL);
                }); }
                if(oretype.contains("copper")) { this.add(block, (block1) -> {
                    return createOreDrop(block1, Items.RAW_COPPER);
                }); }
                if(oretype.contains("diamond")) { this.add(block, (block1) -> {
                    return createOreDrop(block1, Items.DIAMOND);
                }); }
                if(oretype.contains("emerald")) { this.add(block, (block1) -> {
                    return createOreDrop(block1, Items.EMERALD);
                }); }
                if(oretype.contains("gold")) { this.add(block, (block1) -> {
                    return createOreDrop(block1, Items.RAW_GOLD);
                }); }
                if(oretype.contains("iron")) { this.add(block, (block1) -> {
                    return createOreDrop(block1, Items.RAW_IRON);
                }); }
                if(oretype.contains("lapis")) { this.add(block, (block1) -> {
                    return createOreDrop(block1, Items.LAPIS_LAZULI);
                }); }
                if(oretype.contains("quartz")) { this.add(block, (block1) -> {
                    return createOreDrop(block1, Items.QUARTZ);
                }); }
                if(oretype.contains("redstone")) { this.add(block, (block1) -> {
                    return createOreDrop(block1, Items.REDSTONE);
                }); }
                if(oretype.contains("ruby")) { this.add(block, (block1) -> {
                    return createOreDrop(block1, BlockList.RUBY.get());
                }); }
                if(oretype.contains("sapphire")) { this.add(block, (block1) -> {
                    return createOreDrop(block1, BlockList.SAPPHIRE.get());
                }); }
                if(oretype.contains("peridot")) { this.add(block, (block1) -> {
                    return createOreDrop(block1, BlockList.PERIDOT.get());
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

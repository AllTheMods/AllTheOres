package net.allthemods.alltheores.datagen;

import net.allthemods.alltheores.datagen.client.BlockStates;
import net.allthemods.alltheores.datagen.client.ItemModels;
import net.allthemods.alltheores.datagen.server.*;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;

import java.io.IOException;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public final class DataGenerators {
    private DataGenerators() {
    }

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) throws IOException {
        DataGenerator generator = event.getGenerator();
        ExistingFileHelper fileHelper = event.getExistingFileHelper();

        if (event.includeServer()) {
            BlockTagsProvider blockTagsProvider = new BlockTags(generator, fileHelper);
            generator.addProvider(new ItemTags(generator, blockTagsProvider, fileHelper));
            generator.addProvider(blockTagsProvider);
            generator.addProvider(new CraftingRecipes(generator));
            generator.addProvider(new BlastingRecipes(generator));
            generator.addProvider(new SmeltingRecipes(generator));
            generator.addProvider(new LootTables(generator));
        }
        if (event.includeClient()) {
            generator.addProvider(new BlockStates(generator, fileHelper));
            generator.addProvider(new ItemModels(generator, fileHelper));
        }
    }
}

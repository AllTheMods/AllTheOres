package net.allthemods.alltheores.datagen;

import net.allthemods.alltheores.datagen.client.BlockStates;
import net.allthemods.alltheores.datagen.client.ItemModels;
import net.allthemods.alltheores.datagen.server.*;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.io.IOException;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public final class DataGenerators {
    private DataGenerators() {}

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) throws IOException {
        DataGenerator generator = event.getGenerator();
        ExistingFileHelper fileHelper = event.getExistingFileHelper();

        if (event.includeServer()) {
            BlockTagsProvider blockTagsProvider = new BlockTags(generator, fileHelper);
            generator.addProvider(true,new ItemTags(generator, blockTagsProvider, fileHelper));
            generator.addProvider(true,blockTagsProvider);
            generator.addProvider(true,new CraftingRecipes(generator));
            generator.addProvider(true,new ShapelessCrafting(generator));
            generator.addProvider(true,new BlastingRecipes(generator));
            generator.addProvider(true,new SmeltingRecipes(generator));
            generator.addProvider(true,new LootTables(generator));
        }
        if (event.includeClient()) {
            generator.addProvider(true,new BlockStates(generator, fileHelper));
            generator.addProvider(true,new ItemModels(generator, fileHelper));
        }
    }
}

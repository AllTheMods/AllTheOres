package net.allthemods.alltheores.datagen.server;

import net.allthemods.alltheores.infos.Reference;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.ItemTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ItemTags extends ItemTagsProvider {
    public ItemTags(DataGenerator generator, BlockTagsProvider blockTagsProvider, ExistingFileHelper existingFileHelper) {
        super(generator, blockTagsProvider, Reference.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags() {
        // nothing to do
    }
}

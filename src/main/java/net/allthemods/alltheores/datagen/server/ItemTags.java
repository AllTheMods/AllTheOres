package net.allthemods.alltheores.datagen.server;

import net.allthemods.alltheores.blocks.BlockList;
import net.allthemods.alltheores.infos.ItemTagRegistry;
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
        GroupHelper.applyToOre(group -> {
            tag(group.INGOT_TAG).add(group.INGOT.get());
            tag(group.NUGGET_TAG).add(group.NUGGET.get());
            tag(group.BLOCK_ITEM_TAG).add(group.BLOCK_ITEM.get());
            tag(group.ORE_ITEM_TAG).add(group.ORE_ITEM.get());
            tag(group.ORE_ITEM_TAG).add(group.SLATE_ORE_ITEM.get());
            tag(group.DUST_TAG).add(group.DUST.get());
        });

        GroupHelper.applyToAlloy(group -> {
            tag(group.INGOT_TAG).add(group.INGOT.get());
            tag(group.NUGGET_TAG).add(group.NUGGET.get());
            tag(group.BLOCK_ITEM_TAG).add(group.BLOCK_ITEM.get());
        });

        // temp
        tag(ItemTagRegistry.COPPER_INGOT).add(BlockList.COPPER_INGOT.get());
        tag(ItemTagRegistry.COPPER_NUGGET).add(BlockList.COPPER_NUGGET.get());
    }
}

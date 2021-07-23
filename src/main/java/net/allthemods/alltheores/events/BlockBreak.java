package net.allthemods.alltheores.events;

import net.allthemods.alltheores.AllTheOres;
import net.allthemods.alltheores.blocks.OtherOreBlock;
import net.minecraftforge.common.util.FakePlayer;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.FORGE)
public class BlockBreak {

    @SubscribeEvent
    public static void BreakEvent(BlockEvent.BreakEvent event) {
        AllTheOres.LOGGER.debug("BlockBreak!!!");
        if(event.getPlayer().isCreative()) { return; }
        if((event.getState().getBlock() instanceof OtherOreBlock) && ((event.getPlayer() instanceof FakePlayer) || (event.getPlayer() == null) || (event.getPlayer().getMainHandItem().isEmpty()))) {
            event.setCanceled(true);
            return;
        }
    }
}

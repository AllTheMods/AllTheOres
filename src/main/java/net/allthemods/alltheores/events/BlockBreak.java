package net.allthemods.alltheores.events;

import net.allthemods.alltheores.blocks.OtherOreBlock;
import net.minecraftforge.common.util.FakePlayer;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.FORGE)
public class BlockBreak {

    @SubscribeEvent
    public static void on(BlockEvent.BreakEvent event) {
        if(event.getPlayer().isCreative() == true) { return; }
        if((event.getState().getBlock() instanceof OtherOreBlock) && ((event.getPlayer() instanceof FakePlayer) || (event.getPlayer() == null) || (event.getPlayer().getHeldItemMainhand().isEmpty() == true))) {
            event.setCanceled(true);
            return;
        }
    }
}

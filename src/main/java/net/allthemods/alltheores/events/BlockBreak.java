package net.allthemods.alltheores.events;

import net.allthemods.alltheores.AllTheOres;
import net.allthemods.alltheores.blocks.OtherOreBlock;
import net.allthemods.alltheores.infos.Reference;
import net.minecraftforge.common.util.FakePlayer;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid= Reference.MOD_ID, bus= Mod.EventBusSubscriber.Bus.FORGE)
public class BlockBreak {
    @SubscribeEvent
    public static void BreakEvent(BlockEvent.BreakEvent event) {
        if(event.getPlayer().isCreative()) { return; }
        if((event.getState().getBlock() instanceof OtherOreBlock) && ((event.getPlayer() instanceof FakePlayer) || (event.getPlayer() == null) || (event.getPlayer().getMainHandItem().isEmpty()))) {
            event.setCanceled(true);
            return;
        }
    }
}

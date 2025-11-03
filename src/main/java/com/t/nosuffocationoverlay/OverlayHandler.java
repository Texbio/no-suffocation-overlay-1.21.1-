package com.t.nosuffocationoverlay;

import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.client.event.RenderBlockScreenEffectEvent;

public class OverlayHandler {

    @SubscribeEvent
    public void onRenderBlockOverlay(RenderBlockScreenEffectEvent event) {
        // Cancel the suffocation overlay that appears when the player's head is inside a block
        if (event.getOverlayType() == RenderBlockScreenEffectEvent.OverlayType.BLOCK) {
            event.setCanceled(true);
        }
    }
}
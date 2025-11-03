package com.t.nosuffocationoverlay;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.loading.FMLEnvironment;
import net.neoforged.neoforge.common.NeoForge;

@Mod(NoSuffocationOverlay.MOD_ID)
public class NoSuffocationOverlay {
    public static final String MOD_ID = "nosuffocationoverlay";

    public NoSuffocationOverlay(IEventBus modEventBus) {
        // Only register on client side
        if (FMLEnvironment.dist == Dist.CLIENT) {
            NeoForge.EVENT_BUS.register(new OverlayHandler());
        }
    }
}
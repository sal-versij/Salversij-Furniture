package org.salversij.forge;

import dev.architectury.platform.forge.EventBuses;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import org.salversij.ModCore;

@Mod(ModCore.MOD_ID)
public final class ForgeInitializer {
    public ForgeInitializer() {
        // Submit our event bus to let Architectury API register our content on the right time.
        EventBuses.registerModEventBus(ModCore.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());

        // Run our common setup.
        ModCore.init();
    }
}

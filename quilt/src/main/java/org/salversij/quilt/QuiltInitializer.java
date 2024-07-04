package org.salversij.quilt;

import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.salversij.fabriclike.FabricLikeInitializer;

public final class QuiltInitializer implements ModInitializer {
    @Override
    public void onInitialize(ModContainer mod) {
        // Run the Fabric-like setup.
        FabricLikeInitializer.init();
    }
}

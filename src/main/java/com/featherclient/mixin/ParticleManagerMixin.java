package com.featherclient.mixin;

import net.minecraft.client.particle.ParticleManager;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

/**
 * Reduces particle rendering for performance
 */
@Mixin(ParticleManager.class)
public class ParticleManagerMixin {
    
    @Inject(method = "addParticle", at = @At("HEAD"), cancellable = true)
    private void reduceParticles(CallbackInfo ci) {
        // Randomly skip particle spawning (10% spawn rate)
        if (Math.random() > 0.1) {
            ci.cancel();
        }
    }
}
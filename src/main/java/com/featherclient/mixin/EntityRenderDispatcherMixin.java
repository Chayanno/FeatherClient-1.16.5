package com.featherclient.mixin;

import net.minecraft.client.render.entity.EntityRenderDispatcher;
import org.spongepowered.asm.mixin.Mixin;

/**
 * Optimizes entity rendering for low-end PCs
 */
@Mixin(EntityRenderDispatcher.class)
public class EntityRenderDispatcherMixin {
    // Reduce entity shadow rendering
    // Simplify entity models
}
package com.featherclient.hud.modules;

import com.featherclient.hud.HUDModule;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;

public class PotionModule extends HUDModule {
    
    public PotionModule() {
        super("Potions", 5, 50);
    }
    
    @Override
    public void render(MatrixStack matrixStack) {
        MinecraftClient client = MinecraftClient.getInstance();
        
        if (client.player == null) return;
        
        int y = getY();
        int lineHeight = 12;
        
        for (StatusEffectInstance effect : client.player.getActiveStatusEffects().values()) {
            String effectName = effect.getEffectType().getName().getString();
            int amplifier = effect.getAmplifier() + 1;
            int duration = effect.getDuration() / 20; // Convert ticks to seconds
            
            String text = effectName + " " + amplifier + " - " + duration + "s";
            drawString(matrixStack, text, getX(), y, 0xFFFFFF);
            y += lineHeight;
        }
    }
}
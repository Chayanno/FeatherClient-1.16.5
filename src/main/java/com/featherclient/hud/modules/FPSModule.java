package com.featherclient.hud.modules;

import com.featherclient.hud.HUDModule;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.client.MinecraftClient;

public class FPSModule extends HUDModule {
    private int fps;
    private long lastUpdateTime;
    private int frameCount;
    
    public FPSModule() {
        super("FPS", 5, 5);
    }
    
    @Override
    public void render(MatrixStack matrixStack) {
        long currentTime = System.currentTimeMillis();
        frameCount++;
        
        if (currentTime - lastUpdateTime >= 1000) {
            fps = frameCount;
            frameCount = 0;
            lastUpdateTime = currentTime;
        }
        
        int color = fps >= 60 ? 0x00FF00 : (fps >= 30 ? 0xFFFF00 : 0xFF0000);
        drawString(matrixStack, "FPS: " + fps, getX(), getY(), color);
    }
}
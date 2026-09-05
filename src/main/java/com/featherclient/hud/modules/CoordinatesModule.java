package com.featherclient.hud.modules;

import com.featherclient.hud.HUDModule;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.client.MinecraftClient;

public class CoordinatesModule extends HUDModule {
    
    public CoordinatesModule() {
        super("Coordinates", 5, 130);
    }
    
    @Override
    public void render(MatrixStack matrixStack) {
        MinecraftClient client = MinecraftClient.getInstance();
        
        if (client.player == null) return;
        
        double x = client.player.getX();
        double y = client.player.getY();
        double z = client.player.getZ();
        
        String coords = "X: " + String.format("%.1f", x) + " Y: " + String.format("%.1f", y) + " Z: " + String.format("%.1f", z);
        drawString(matrixStack, coords, getX(), getY(), 0x00FF00);
    }
}
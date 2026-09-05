package com.featherclient.hud.modules;

import com.featherclient.hud.HUDModule;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ServerInfo;

public class PingModule extends HUDModule {
    
    public PingModule() {
        super("Ping", 5, 160);
    }
    
    @Override
    public void render(MatrixStack matrixStack) {
        MinecraftClient client = MinecraftClient.getInstance();
        
        if (client.player == null || client.getNetworkHandler() == null) return;
        
        int ping = client.getNetworkHandler().getPlayerListEntry(client.player.getUuid()).getLatency();
        int color = ping < 100 ? 0x00FF00 : (ping < 200 ? 0xFFFF00 : 0xFF0000);
        
        drawString(matrixStack, "Ping: " + ping + "ms", getX(), getY(), color);
    }
}
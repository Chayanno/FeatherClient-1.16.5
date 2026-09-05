package com.featherclient;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import com.featherclient.hud.HUDManager;
import com.featherclient.config.ConfigManager;

@Environment(EnvType.CLIENT)
public class FeatherClientMain implements ClientModInitializer {

    public static final String MOD_ID = "featherclient";
    public static final String MOD_NAME = "FeatherClient";
    public static final String MOD_VERSION = "1.0.0";
    
    private static HUDManager hudManager;
    private static ConfigManager configManager;

    @Override
    public void onInitializeClient() {
        System.out.println("[" + MOD_NAME + "] Initializing FeatherClient v" + MOD_VERSION);
        System.out.println("[" + MOD_NAME + "] Performance optimizations enabled");
        System.out.println("[" + MOD_NAME + "] HUD modules loaded");
        
        configManager = new ConfigManager();
        hudManager = new HUDManager();
    }
    
    public static HUDManager getHUDManager() {
        return hudManager;
    }
    
    public static ConfigManager getConfigManager() {
        return configManager;
    }
}
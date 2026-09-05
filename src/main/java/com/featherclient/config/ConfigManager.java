package com.featherclient.config;

import java.util.HashMap;
import java.util.Map;

public class ConfigManager {
    private Map<String, Boolean> moduleStates = new HashMap<>();
    private Map<String, Map<String, Object>> moduleSettings = new HashMap<>();
    
    public ConfigManager() {
        initializeDefaults();
    }
    
    private void initializeDefaults() {
        // HUD Module defaults
        moduleStates.put("fps", true);
        moduleStates.put("keystrokes", true);
        moduleStates.put("potions", true);
        moduleStates.put("armor", true);
        moduleStates.put("coordinates", true);
        moduleStates.put("time", true);
        moduleStates.put("ping", true);
    }
    
    public boolean isModuleEnabled(String moduleName) {
        return moduleStates.getOrDefault(moduleName, false);
    }
    
    public void setModuleEnabled(String moduleName, boolean enabled) {
        moduleStates.put(moduleName, enabled);
    }
    
    public void setSetting(String module, String key, Object value) {
        moduleSettings.computeIfAbsent(module, k -> new HashMap<>()).put(key, value);
    }
    
    public Object getSetting(String module, String key, Object defaultValue) {
        return moduleSettings.getOrDefault(module, new HashMap<>()).getOrDefault(key, defaultValue);
    }
}
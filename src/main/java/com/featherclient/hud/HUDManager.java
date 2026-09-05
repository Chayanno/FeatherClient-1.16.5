package com.featherclient.hud;

import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
import net.minecraft.client.util.math.MatrixStack;
import com.featherclient.hud.modules.*;
import java.util.ArrayList;
import java.util.List;

public class HUDManager {
    private List<HUDModule> modules = new ArrayList<>();
    
    public HUDManager() {
        registerModules();
        HudRenderCallback.EVENT.register(this::onHudRender);
    }
    
    private void registerModules() {
        modules.add(new FPSModule());
        modules.add(new KeystrokesModule());
        modules.add(new PotionModule());
        modules.add(new ArmorModule());
        modules.add(new CoordinatesModule());
        modules.add(new TimeModule());
        modules.add(new PingModule());
    }
    
    private void onHudRender(MatrixStack matrixStack, float tickDelta) {
        for (HUDModule module : modules) {
            if (module.isEnabled()) {
                module.render(matrixStack);
            }
        }
    }
    
    public HUDModule getModule(String name) {
        return modules.stream().filter(m -> m.getName().equals(name)).findFirst().orElse(null);
    }
}
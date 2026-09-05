package com.featherclient.hud.modules;

import com.featherclient.hud.HUDModule;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.client.MinecraftClient;
import java.util.Calendar;

public class TimeModule extends HUDModule {
    
    public TimeModule() {
        super("Time", 5, 145);
    }
    
    @Override
    public void render(MatrixStack matrixStack) {
        Calendar calendar = Calendar.getInstance();
        String time = String.format("%02d:%02d:%02d", calendar.get(Calendar.HOUR_OF_DAY), calendar.get(Calendar.MINUTE), calendar.get(Calendar.SECOND));
        drawString(matrixStack, "Time: " + time, getX(), getY(), 0xFFFFFF);
    }
}
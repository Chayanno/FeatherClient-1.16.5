package com.featherclient.hud;

import net.minecraft.client.util.math.MatrixStack;

public abstract class HUDModule {
    private String name;
    private boolean enabled;
    private int x;
    private int y;
    
    public HUDModule(String name, int defaultX, int defaultY) {
        this.name = name;
        this.enabled = true;
        this.x = defaultX;
        this.y = defaultY;
    }
    
    public abstract void render(MatrixStack matrixStack);
    
    public String getName() {
        return name;
    }
    
    public boolean isEnabled() {
        return enabled;
    }
    
    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
    
    public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }
    
    public void setX(int x) {
        this.x = x;
    }
    
    public void setY(int y) {
        this.y = y;
    }
    
    protected void drawString(MatrixStack matrixStack, String text, int x, int y, int color) {
        net.minecraft.client.MinecraftClient.getInstance().textRenderer.draw(matrixStack, text, x, y, color);
    }
}
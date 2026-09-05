package com.featherclient.hud.modules;

import com.featherclient.hud.HUDModule;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.client.MinecraftClient;
import org.lwjgl.glfw.GLFW;

public class KeystrokesModule extends HUDModule {
    private static final int BOX_SIZE = 16;
    private static final int SPACING = 2;
    private static final int BACKGROUND_COLOR = 0x44000000;
    private static final int PRESSED_COLOR = 0xFF6B5B95;
    private static final int RELEASED_COLOR = 0x44333333;
    
    public KeystrokesModule() {
        super("Keystrokes", 5, 25);
    }
    
    @Override
    public void render(MatrixStack matrixStack) {
        MinecraftClient client = MinecraftClient.getInstance();
        long window = client.getWindow().getHandle();
        
        int x = getX();
        int y = getY();
        
        // W
        drawBox(matrixStack, x + BOX_SIZE + SPACING, y, isKeyPressed(window, GLFW.GLFW_KEY_W));
        drawString(matrixStack, "W", x + BOX_SIZE + SPACING + 6, y + 4, 0xFFFFFF);
        
        // A
        drawBox(matrixStack, x, y + BOX_SIZE + SPACING, isKeyPressed(window, GLFW.GLFW_KEY_A));
        drawString(matrixStack, "A", x + 6, y + BOX_SIZE + SPACING + 4, 0xFFFFFF);
        
        // S
        drawBox(matrixStack, x + BOX_SIZE + SPACING, y + BOX_SIZE + SPACING, isKeyPressed(window, GLFW.GLFW_KEY_S));
        drawString(matrixStack, "S", x + BOX_SIZE + SPACING + 6, y + BOX_SIZE + SPACING + 4, 0xFFFFFF);
        
        // D
        drawBox(matrixStack, x + (BOX_SIZE + SPACING) * 2, y + BOX_SIZE + SPACING, isKeyPressed(window, GLFW.GLFW_KEY_D));
        drawString(matrixStack, "D", x + (BOX_SIZE + SPACING) * 2 + 6, y + BOX_SIZE + SPACING + 4, 0xFFFFFF);
        
        // Space
        drawSpaceBar(matrixStack, x, y + (BOX_SIZE + SPACING) * 2, isKeyPressed(window, GLFW.GLFW_KEY_SPACE));
    }
    
    private void drawBox(MatrixStack matrixStack, int x, int y, boolean pressed) {
        int color = pressed ? PRESSED_COLOR : RELEASED_COLOR;
        fill(matrixStack, x, y, x + BOX_SIZE, y + BOX_SIZE, color);
        fill(matrixStack, x + 1, y + 1, x + BOX_SIZE - 1, y + BOX_SIZE - 1, BACKGROUND_COLOR);
    }
    
    private void drawSpaceBar(MatrixStack matrixStack, int x, int y, boolean pressed) {
        int color = pressed ? PRESSED_COLOR : RELEASED_COLOR;
        int width = (BOX_SIZE + SPACING) * 2;
        fill(matrixStack, x, y, x + width, y + BOX_SIZE, color);
        fill(matrixStack, x + 1, y + 1, x + width - 1, y + BOX_SIZE - 1, BACKGROUND_COLOR);
        drawString(matrixStack, "SPACE", x + 20, y + 4, 0xFFFFFF);
    }
    
    private boolean isKeyPressed(long window, int key) {
        return GLFW.glfwGetKey(window, key) == GLFW.GLFW_PRESS;
    }
    
    private void fill(MatrixStack matrixStack, int x1, int y1, int x2, int y2, int color) {
        if (x1 < x2) {
            int i = x1;
            x1 = x2;
            x2 = i;
        }
        if (y1 < y2) {
            int i = y1;
            y1 = y2;
            y2 = i;
        }
        
        net.minecraft.client.gui.DrawableHelper.fill(matrixStack, x2, y2, x1, y1, color);
    }
}
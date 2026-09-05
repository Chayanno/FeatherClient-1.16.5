package com.featherclient.hud.modules;

import com.featherclient.hud.HUDModule;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ItemStack;

public class ArmorModule extends HUDModule {
    
    public ArmorModule() {
        super("Armor", 5, 100);
    }
    
    @Override
    public void render(MatrixStack matrixStack) {
        MinecraftClient client = MinecraftClient.getInstance();
        
        if (client.player == null) return;
        
        int y = getY();
        
        EquipmentSlot[] slots = {EquipmentSlot.HEAD, EquipmentSlot.CHEST, EquipmentSlot.LEGS, EquipmentSlot.FEET};
        String[] names = {"Head", "Chest", "Legs", "Feet"};
        
        for (int i = 0; i < slots.length; i++) {
            ItemStack armorPiece = client.player.getEquippedStack(slots[i]);
            if (!armorPiece.isEmpty()) {
                String durability = armorPiece.getDamage() + "/" + armorPiece.getMaxDamage();
                drawString(matrixStack, names[i] + ": " + durability, getX(), y, 0xFFFFFF);
                y += 12;
            }
        }
    }
}
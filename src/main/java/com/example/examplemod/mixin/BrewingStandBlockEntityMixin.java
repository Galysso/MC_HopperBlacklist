package com.example.examplemod.mixin;

import net.minecraft.core.Direction;
import net.minecraft.world.Container;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.entity.BrewingStandBlockEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(BrewingStandBlockEntity.class)
public abstract class BrewingStandBlockEntityMixin {
    @Overwrite
    public boolean canPlaceItem(int slot, ItemStack stack) {
        return false;
    }

    @Overwrite
    public boolean canTakeItemThroughFace(int p_18952_, ItemStack p_18953_, Direction direction) {
        return false;
    }
}
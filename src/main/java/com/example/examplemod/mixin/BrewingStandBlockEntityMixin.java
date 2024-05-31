package com.example.examplemod.mixin;

import net.minecraft.core.Direction;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.entity.BrewingStandBlockEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

import javax.annotation.Nullable;

@Mixin(value = BrewingStandBlockEntity.class)
public abstract class BrewingStandBlockEntityMixin {
    private int[] noSlotsForHopper = new int[0];

    @Overwrite
    public int[] getSlotsForFace(Direction p_59010_) {
        return this.noSlotsForHopper;
    }

    @Overwrite
    public boolean canPlaceItemThroughFace(int var1, ItemStack var2, @Nullable Direction var3) {
        return false;
    }

    @Overwrite
    public boolean canTakeItemThroughFace(int var1, ItemStack var2, Direction var3) {
        return false;
    }
}
package com.example.examplemod.mixin;

import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import net.minecraft.core.Direction;
import tfar.davespotioneering.inv.BrewingHandler;

import javax.annotation.Nullable;

@Mixin(value = BrewingHandler.class, remap = false)
public abstract class DavesPotioneering_BrewingHandlerMixin {
    private int[] noSlotsForHopper = new int[0];

    @Overwrite
    public int[] getSlotsForFace(Direction side) {
        return new int[0];
    }
}

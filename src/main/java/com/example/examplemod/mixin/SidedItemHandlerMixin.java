package com.example.examplemod.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import tfar.davespotioneering.inv.SidedItemHandler;

@Mixin(value = SidedItemHandler.class, remap = false)
public abstract class SidedItemHandlerMixin {
    /*@Overwrite
    public int[] getSlotsForFace(Direction side) {
        return new int[0];
    }*/
    @Overwrite
    public int mapSlot(int slot) {
        return -1;
    }
}

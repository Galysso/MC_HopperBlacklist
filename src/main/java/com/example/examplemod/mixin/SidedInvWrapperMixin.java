package com.example.examplemod.mixin;

import net.minecraft.core.Direction;
import net.minecraft.world.WorldlyContainer;
import net.minecraftforge.items.wrapper.SidedInvWrapper;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(value = SidedInvWrapper.class, remap = false)
public class SidedInvWrapperMixin {
    @Overwrite
    public static int getSlot(WorldlyContainer inv, int slot, @Nullable Direction side) {
        /*int[] slots = inv.getSlotsForFace(side);
        return slot < slots.length ? slots[slot] : -1;*/
        return -1;
    }

    @Overwrite
    public int getSlots() {
        /*return this.inv.getSlotsForFace(this.side).length;*/
        return 0;
    }
}

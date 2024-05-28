package com.example.examplemod.mixin;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BrewingStandBlock;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(BrewingStandBlock.class)
public class TestMixin {
    @Overwrite
    public boolean hasAnalogOutputSignal(BlockState state) {
        return false;
    }

    @Overwrite
    public int getAnalogOutputSignal(BlockState state, Level level, BlockPos pos) {
        return 0;
    }
}
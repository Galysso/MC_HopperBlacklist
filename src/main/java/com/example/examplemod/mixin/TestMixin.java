package com.example.examplemod.mixin;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BrewingStandBlock;
import net.minecraft.world.level.block.state.BlockState;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(BrewingStandBlock.class)
public class TestMixin {
    private static final Logger LOGGER = LogManager.getLogger();

    static {
        LOGGER.info("TestMixin class is being loaded");
    }

    @Overwrite
    public boolean hasAnalogOutputSignal(BlockState state) {
        LOGGER.info("Entering hasAnalogOutputSignal method");
        return false;
    }

    @Overwrite
    public int getAnalogOutputSignal(BlockState state, Level level, BlockPos pos) {
        LOGGER.info("Entering getAnalogOutputSignal method");
        return 0;
    }
}
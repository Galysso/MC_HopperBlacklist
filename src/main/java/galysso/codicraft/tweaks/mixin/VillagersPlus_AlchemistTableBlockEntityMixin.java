package galysso.codicraft.tweaks.mixin;

import com.lion.villagersplus.blockentities.AlchemistTableBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.entity.BaseContainerBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(AlchemistTableBlockEntity.class)
public abstract class VillagersPlus_AlchemistTableBlockEntityMixin extends BaseContainerBlockEntity {
    private int[] noSlotsForHopper = new int[0];

    protected VillagersPlus_AlchemistTableBlockEntityMixin(BlockEntityType<?> p_155076_, BlockPos p_155077_, BlockState p_155078_) {
        super(p_155076_, p_155077_, p_155078_);
    }

    @Overwrite
    public int[] getSlotsForFace(Direction p_59010_) {return this.noSlotsForHopper;}

    @Overwrite
    public boolean canPlaceItemThroughFace(int var1, ItemStack var2, @javax.annotation.Nullable Direction var3) {return false;}

    @Overwrite
    public boolean canTakeItemThroughFace(int var1, ItemStack var2, Direction var3) {return false;}

    @Overwrite
    public boolean stillValid(Player player) {return false;}

    @Overwrite
    public boolean canPlaceItem(int slot, ItemStack stack) {return false;}

    @Overwrite
    protected AbstractContainerMenu createMenu(int syncId, Inventory playerInventory) {return null;}

    /*
    @Overwrite
    private static boolean canCraft(NonNullList<ItemStack> slots) {return false;}

    @Overwrite
    private static void craft(Level world, BlockPos pos, NonNullList<ItemStack> slots) {}*/

    /*
    @Override
    public boolean canOpen(Player p_58645_) {return false;}*/
}

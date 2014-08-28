package matgm50.twarden.inventory;

import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import thaumcraft.api.aspects.IEssentiaContainerItem;

/**
 * Created by MasterAbdoTGM50 on 8/27/2014.
 */

public class SlotEssentia extends Slot {

    public SlotEssentia(IInventory inv, int id, int x, int y) {super(inv, id, x, y);}

    @Override
    public boolean isItemValid(ItemStack stack) {if(stack.getItem() instanceof IEssentiaContainerItem) {return true;} else {return false;}}

}

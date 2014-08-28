package matgm50.twarden.inventory;

import matgm50.twarden.item.ItemWardenArmor;
import matgm50.twarden.item.ItemWardenSword;
import matgm50.twarden.util.WardenicHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.*;
import net.minecraft.item.ItemStack;
import thaumcraft.api.aspects.IEssentiaContainerItem;

/**
 * Created by MasterAbdoTGM50 on 8/27/2014.
 */

public class ContainerHammer extends Container {

    InventoryPlayer pInv;
    InventoryCrafting cInv;
    IInventory rInv;
    EntityPlayer player;

    public ContainerHammer(EntityPlayer player) {

        pInv = player.inventory;
        cInv = new InventoryCrafting(this, 2, 1);
        rInv = new InventoryCraftResult();

        this.player = player;

        for(int hotbar = 0; hotbar < 9; hotbar++) {

            addSlotToContainer(new Slot(pInv, hotbar, 8 + 18 * hotbar, 142));

        }

        for(int row = 0; row < 3; row++) {

            for(int collumn = 0; collumn < 9; collumn++) {

                addSlotToContainer(new Slot(pInv, 9 + row * 9  + collumn, 8 + 18 * collumn, 84 + row * 18));

            }

        }

        addSlotToContainer(new SlotEssentia(cInv, 0, 80, 54));
        addSlotToContainer(new Slot(cInv, 1, 80, 33));
        addSlotToContainer(new SlotCrafting(player, cInv, rInv, 0, 80, 12));

        onCraftMatrixChanged(cInv);

    }

    @Override
    public void onCraftMatrixChanged(IInventory matrix) {

        ItemStack essentia = matrix.getStackInSlot(0);
        ItemStack item = matrix.getStackInSlot(1);

        if(item != null) {

            if(!(item.getItem() instanceof ItemWardenArmor || item.getItem() instanceof ItemWardenSword)) {

                ItemStack repairedItem = new ItemStack(item.getItem());

                if(item.getItemDamage() != 0 && item.getItem().isRepairable()) {

                    repairedItem.setItemDamage(0);
                    rInv.setInventorySlotContents(0, repairedItem);

                }

            } else if(essentia != null) {

                ItemStack infusedArmor = new ItemStack(item.getItem());
                String aspectKey = ((IEssentiaContainerItem)essentia.getItem()).getAspects(essentia).getAspects()[0].getName();

                if(WardenicHelper.upgrades.containsKey(aspectKey)) {

                    WardenicHelper.setUpgradeOnStack(infusedArmor, aspectKey);

                }

                rInv.setInventorySlotContents(0, infusedArmor);

            } else {rInv.setInventorySlotContents(0, null);}

        } else {rInv.setInventorySlotContents(0, null);}

    }

    @Override
    public void onContainerClosed(EntityPlayer player) {

        super.onContainerClosed(player);

        ItemStack essentia = this.cInv.getStackInSlotOnClosing(0);
        if(essentia != null) {player.dropPlayerItemWithRandomChoice(essentia, false);}

        ItemStack item = this.cInv.getStackInSlotOnClosing(1);
        if(item != null) {player.dropPlayerItemWithRandomChoice(item, false);}

    }

    @Override
    public boolean canInteractWith(EntityPlayer player) {return true;}

    @Override
    public ItemStack transferStackInSlot(EntityPlayer player, int slot) {return null;}

    @Override
    public ItemStack slotClick(int slot, int button, int flag, EntityPlayer player) {

        if (slot >= 0 && getSlot(slot) != null && getSlot(slot).getStack() == player.getHeldItem()) {return null;}
        return super.slotClick(slot, button, flag, player);

    }

}

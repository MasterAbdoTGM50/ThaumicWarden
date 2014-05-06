package matgm50.twarden.blocks.tiles;

import matgm50.twarden.config.TWBlockConfig;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;

public class TWLizTableTile extends TileEntity implements IInventory {
	
	private ItemStack[] inv;
	
	public TWLizTableTile() {
		
		inv = new ItemStack[1];
		
	}
	
	@Override
	public int getSizeInventory() {return inv.length;}

	@Override
	public ItemStack getStackInSlot(int slot) {return inv[slot];}

	@Override
	public ItemStack decrStackSize(int slot, int decrease) {
		
		ItemStack split = getStackInSlot(slot);
		
		if(split != null) {
			
			if(split.stackSize <= decrease) {
				
				setInventorySlotContents(slot, null);
				
			} else {
				
				split = split.splitStack(decrease);
				
			}
			
		}
		
		return split;
		
	}

	@Override
	public ItemStack getStackInSlotOnClosing(int slot) {
		
		ItemStack get = getStackInSlot(slot);
		setInventorySlotContents(slot, null);
		
		return get;
		
	}
	
	@Override
	public void markDirty() {
		
		super.markDirty();
        worldObj.markBlockForUpdate(xCoord,yCoord,zCoord);
        
	}


	@Override
	public void setInventorySlotContents(int slot, ItemStack stack) {
		
		inv[slot] = stack;
		markDirty();
		
	}
	
	@Override
	public String getInventoryName() {return TWBlockConfig.TWLIZTABLE_CONT_NAME;}

	@Override
	public boolean hasCustomInventoryName() {return true;}

	@Override
	public int getInventoryStackLimit() {return inv.length;}

	@Override
	public boolean isUseableByPlayer(EntityPlayer player) {return true;}

	@Override
	public void openInventory() {}

	@Override
	public void closeInventory() {}
	
	@Override
	public boolean isItemValidForSlot(int slot, ItemStack stack) {
		
		if(!stack.isStackable() && stack.isItemStackDamageable() && stack.getItem().isRepairable()) {
			return true;
		} else {
			return false;
		}
		
	}
	
	public void Repair(int slot) {
		
		ItemStack toRepair = inv[slot];
		
		if(toRepair != null) {
			
			if(toRepair.getItemDamage() != 0) {
				
				toRepair.setItemDamage(0);
				
				worldObj.playSoundEffect(xCoord + 0.5D, yCoord + 0.5D, zCoord + 0.5D, "random.anvil_use", 1.0F, worldObj.rand.nextFloat() * 0.1F + 0.9F);
				
				markDirty();
				
			}
			
		}
		
	}
	
	@Override
	public void writeToNBT(NBTTagCompound tag) {
		
		super.writeToNBT(tag);
		
		writeCustomNBT(tag);
		
	}
	
	@Override
	public void readFromNBT(NBTTagCompound tag) {
		
		super.readFromNBT(tag);
		
		readCustomNBT(tag);
		
	}
	
	public void writeCustomNBT(NBTTagCompound tag) {
		
		NBTTagList invList = new NBTTagList();
		
		for(int s = 0; s < getSizeInventory(); s++) {
			
			ItemStack toSave = getStackInSlot(s);
			
			if(toSave != null) {
				
				NBTTagCompound invComp = new NBTTagCompound();
				invComp.setByte("Slot", (byte)s);
				toSave.writeToNBT(invComp);
				invList.appendTag(invComp);
				
			}
			
		}
		
		tag.setTag("Inventory", invList);
		
	}
	
	public void readCustomNBT(NBTTagCompound tag) {
		
		NBTTagList invList = tag.getTagList("Inventory", tag.getId());
		
		for(int s = 0; s < invList.tagCount(); s++) {
			
			NBTTagCompound invComp = invList.getCompoundTagAt(s);
			
			int slot = invComp.getByte("Slot");
			
			if(slot >= 0 && slot < getSizeInventory()) {
				
				setInventorySlotContents(slot, ItemStack.loadItemStackFromNBT(invComp));
				
			}
			
		}
		
	}
	
	@Override
	public void onDataPacket(NetworkManager manager, S35PacketUpdateTileEntity packet) {

		super.onDataPacket(manager, packet);
		readCustomNBT(packet.func_148857_g());
		
	}

	@Override
	public S35PacketUpdateTileEntity getDescriptionPacket() {

		NBTTagCompound tag = new NBTTagCompound();
		writeCustomNBT(tag);
        return new S35PacketUpdateTileEntity(xCoord, yCoord, zCoord, 0, tag);

	}

}

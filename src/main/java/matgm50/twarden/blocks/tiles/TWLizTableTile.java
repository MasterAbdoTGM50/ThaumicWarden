package matgm50.twarden.blocks.tiles;

import cpw.mods.fml.common.network.PacketDispatcher;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import matgm50.twarden.config.TWBlockConfig;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.network.INetworkManager;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.Packet132TileEntityData;
import net.minecraft.tileentity.TileEntity;

public class TWLizTableTile extends TileEntity implements IInventory {
	
	private ItemStack[] Inv;
	
	public TWLizTableTile() {
		
		Inv = new ItemStack[1];
		
	}
	
	@Override
	public int getSizeInventory() {return Inv.length;}

	@Override
	public ItemStack getStackInSlot(int Slot) {return Inv[Slot];}

	@Override
	public ItemStack decrStackSize(int Slot, int Decrease) {
		
		ItemStack Split = getStackInSlot(Slot);
		
		if(Split != null) {
			
			if(Split.stackSize <= Decrease) {
				
				setInventorySlotContents(Slot, null);
				
			} else {
				
				Split = Split.splitStack(Decrease);
				onInventoryChanged();
				
			}
			
		}
		
		return Split;
		
	}

	@Override
	public ItemStack getStackInSlotOnClosing(int Slot) {
		
		ItemStack Get = getStackInSlot(Slot);
		setInventorySlotContents(Slot, null);
		
		return Get;
		
	}

	@Override
	public void setInventorySlotContents(int Slot, ItemStack Itemstack) {
		
		Inv[Slot] = Itemstack;
		
		if(Itemstack != null && Itemstack.stackSize > getInventoryStackLimit()) {
			
			Itemstack.stackSize = getInventoryStackLimit();
			
		}
		
		onInventoryChanged();
		
	}
	
	@Override
	public String getInvName() {return TWBlockConfig.TWLIZTABLE_CONT_NAME;}

	@Override
	public boolean isInvNameLocalized() {return true;}

	@Override
	public int getInventoryStackLimit() {return Inv.length;}

	@Override
	public boolean isUseableByPlayer(EntityPlayer Player) {return true;}

	@Override
	public void openChest() {}

	@Override
	public void closeChest() {}
	
	@Override
	public boolean isItemValidForSlot(int Slot, ItemStack Itemstack) {
		
		if(!Itemstack.isStackable() && Itemstack.isItemStackDamageable() && Itemstack.getItem().isRepairable()) {
			return true;
		} else {
			return false;
		}
		
	}
	
	public void Repair(int Slot) {
		
		ItemStack ToRepair = Inv[Slot];
		
		if(ToRepair != null) {
			
			if(ToRepair.getItemDamage() != 0) {
				
				ToRepair.setItemDamage(0);
				
				worldObj.playSoundEffect(xCoord + 0.5D, yCoord + 0.5D, zCoord + 0.5D, "random.anvil_use", 1.0F, worldObj.rand.nextFloat() * 0.1F + 0.9F);
				
			}
			
		}
		
	}
	
	@Override
	public void writeToNBT(NBTTagCompound Tag) {
		
		super.writeToNBT(Tag);
		
		NBTTagList InvList = new NBTTagList();
		
		for(int S = 0; S < getSizeInventory(); S++) {
			
			ItemStack ToSave = getStackInSlot(S);
			
			if(ToSave != null) {
				
				NBTTagCompound InvComp = new NBTTagCompound();
				InvComp.setByte("Slot", (byte)S);
				ToSave.writeToNBT(InvComp);
				InvList.appendTag(InvComp);
				
			}
			
		}
		
		Tag.setTag("Inventory", InvList);
		
	}
	
	@Override
	public void readFromNBT(NBTTagCompound Tag) {
		
		super.readFromNBT(Tag);
		
		NBTTagList InvList = Tag.getTagList("Inventory");
		
		for(int S = 0; S < InvList.tagCount(); S++) {
			
			NBTTagCompound InvComp = (NBTTagCompound)InvList.tagAt(S);
			
			int Slot = InvComp.getByte("Slot");
			
			if(Slot >= 0 && Slot < getSizeInventory()) {
				
				setInventorySlotContents(Slot, ItemStack.loadItemStackFromNBT(InvComp));
				
			}
			
		}
		
	}
	
	@Override
	public Packet getDescriptionPacket() {
		
		NBTTagCompound Tag = new NBTTagCompound();
		writeToNBT(Tag);
        return new Packet132TileEntityData(xCoord, yCoord, zCoord, 1, Tag);
		
	}

	@Override
	public void onDataPacket(INetworkManager Manager, Packet132TileEntityData Packet) {
		
		super.onDataPacket(Manager, Packet);
		readFromNBT(Packet.data);
		
	}
	
}

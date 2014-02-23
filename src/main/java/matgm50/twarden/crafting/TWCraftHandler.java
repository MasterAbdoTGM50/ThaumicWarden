package matgm50.twarden.crafting;

import matgm50.twarden.items.TWItems;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.ICraftingHandler;
import cpw.mods.fml.common.registry.GameRegistry;

public class TWCraftHandler implements ICraftingHandler {
	
	public static void Init() {
		
		GameRegistry.registerCraftingHandler(new TWCraftHandler());
		
	}

	@Override
	public void onCrafting(EntityPlayer Player, ItemStack Itemstack, IInventory CraftMatrix) {
		
		for(int I=0; I < CraftMatrix.getSizeInventory(); I++) {  
			
	    	if(CraftMatrix.getStackInSlot(I) != null) {
	    		
	    		ItemStack J = CraftMatrix.getStackInSlot(I);
	    		
	    		if(J.getItem() != null && J.getItem() == TWItems.TWAmulet) {
	    			
	    			ItemStack K = new ItemStack(TWItems.TWAmulet, 2);
	    			CraftMatrix.setInventorySlotContents(I, K);
	    			
	    		}
	    		
	    	}
	    	
		}
		
	}

	@Override
	public void onSmelting(EntityPlayer player, ItemStack item) {
		
		
		
	}

}

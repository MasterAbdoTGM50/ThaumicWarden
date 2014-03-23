package matgm50.twarden.util;

import matgm50.twarden.items.TWItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TWTab extends CreativeTabs {
	
	public TWTab(String label) {
		
		super(label);
		
	}
	
	@Override
	public Item getTabIconItem() {
		
		return TWItems.TWCross;
		
	}
	
}
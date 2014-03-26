package matgm50.twarden.util;

import matgm50.twarden.items.TWItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class TWTab extends CreativeTabs {
	
	public TWTab(String label) {
		
		super(label);
		
	}
	
	@Override
	public Item getTabIconItem() {
		
		return TWItems.twCross;
		
	}
	
}
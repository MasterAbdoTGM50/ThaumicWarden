package matgm50.twarden.research;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.api.research.ResearchItem;
import thaumcraft.api.research.ResearchPage;
import thaumcraft.api.research.ResearchPage.PageType;

public class TWResearchItem extends ResearchItem {

	public TWResearchItem(String Key, String Category, AspectList Tags, int Column, int Row, int Complexity, ItemStack Icon) {
		
		super(Key, Category, Tags, Column, Row, Complexity, Icon);
		
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public String getName() {
		
		return StatCollector.translateToLocal("twresearch.name." + key);
		
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public String getText() {
		
		return StatCollector.translateToLocal("twresearch.text." + key);
		
	}
	
	@Override
	public ResearchItem setPages(ResearchPage... Par) {
		
		for(ResearchPage Page : Par) {
			
			if(Page.type == PageType.TEXT)
				
				Page.text = "twresearch.page." + key + "." + Page.text;
			
		}


		return super.setPages(Par);
		
	}
	
}
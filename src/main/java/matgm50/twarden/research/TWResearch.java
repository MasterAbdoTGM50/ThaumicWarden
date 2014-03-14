package matgm50.twarden.research;

import matgm50.twarden.aspects.TWAspects;
import matgm50.twarden.blocks.TWBlocks;
import matgm50.twarden.config.TWResearchConfig;
import matgm50.twarden.crafting.TWRecipes;
import matgm50.twarden.items.TWItems;
import net.minecraft.item.ItemStack;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.api.research.ResearchCategories;
import thaumcraft.api.research.ResearchItem;
import thaumcraft.api.research.ResearchPage;
import thaumcraft.common.config.ConfigItems;

public class TWResearch {
	
	public static ResearchItem TWardens;
	public static ResearchItem TWQuartz;
	public static ResearchItem TWFabric;
	public static ResearchItem TWSigil;
	public static ResearchItem TWArmor;
	public static ResearchItem TWWeapon;
	public static ResearchItem TWStone;
	public static ResearchItem TWAmulet;
	public static ResearchItem TWFlower;
	
	public static void Init() {
		
		InitCategory();
		InitEntry();
		
	}
	
	public static void InitCategory() {
		
		ResearchCategories.registerCategory(TWResearchConfig.TWCATEGORY, TWResearchConfig.TWCATEGORY_ICON, TWResearchConfig.TWCATEGORY_BACK);
		
	}
	
	public static void InitEntry() {
		
		TWardens = new TWResearchItem(TWResearchConfig.TWARDENS_KEY, TWResearchConfig.TWCATEGORY, new AspectList(), 0, 0, 0, new ItemStack(TWItems.TWSigil, 1)).setRound().setAutoUnlock().registerResearchItem();
		TWardens.setPages(new ResearchPage("0"));
		TWFlower = new TWResearchItem(TWResearchConfig.TWFLOWER_KEY, TWResearchConfig.TWCATEGORY, new AspectList(), 0, -2, 0, new ItemStack(TWBlocks.TWFlower, 1)).setRound().setParents(TWResearchConfig.TWARDENS_KEY).setAutoUnlock().registerResearchItem();
		TWFlower.setPages(new ResearchPage("0"));
		TWQuartz = new TWResearchItem(TWResearchConfig.TWQUARTZ_KEY, TWResearchConfig.TWCATEGORY, new AspectList().add(TWAspects.TWAspect, 3).add(Aspect.CRYSTAL, 3), 2, -1, 2, new ItemStack(TWItems.TWResource, 1, 0)).setStub().setParents(TWResearchConfig.TWARDENS_KEY).registerResearchItem();
		TWQuartz.setPages(new ResearchPage("0"), new ResearchPage(TWRecipes.TWQuartz));
		TWFabric = new TWResearchItem(TWResearchConfig.TWFABRIC_KEY, TWResearchConfig.TWCATEGORY, new AspectList().add(TWAspects.TWAspect, 3).add(Aspect.CLOTH, 3), 2, 1, 2, new ItemStack(TWItems.TWResource, 1, 1)).setStub().setParents(TWResearchConfig.TWARDENS_KEY, "ENCHFABRIC").registerResearchItem();
		TWFabric.setPages(new ResearchPage("0"), new ResearchPage(TWRecipes.TWFabric));
		TWSigil = new TWResearchItem(TWResearchConfig.TWSIGIL_KEY, TWResearchConfig.TWCATEGORY, new AspectList().add(TWAspects.TWAspect, 3).add(Aspect.MAGIC, 3), 4, 0, 2, new ItemStack(TWItems.TWSigil)).setStub().setParents(TWResearchConfig.TWQUARTZ_KEY, TWResearchConfig.TWFABRIC_KEY).registerResearchItem();
		TWSigil.setPages(new ResearchPage("0"),new ResearchPage(TWRecipes.TWFrame), new ResearchPage(TWRecipes.TWSigil));
		TWArmor = new TWResearchItem(TWResearchConfig.TWARMOR_KEY, TWResearchConfig.TWCATEGORY, new AspectList().add(TWAspects.TWAspect, 3).add(Aspect.MAGIC, 3).add(Aspect.ARMOR, 3), 6, -1, 5, new ItemStack(TWItems.TWChest)).setStub().setSpecial().setParents(TWResearchConfig.TWSIGIL_KEY).registerResearchItem();
		TWArmor.setPages(new ResearchPage("0"), new ResearchPage(TWRecipes.TWHelm), new ResearchPage(TWRecipes.TWChest), new ResearchPage(TWRecipes.TWLegs), new ResearchPage(TWRecipes.TWBoots));
		TWWeapon = new TWResearchItem(TWResearchConfig.TWWEAPON_KEY, TWResearchConfig.TWCATEGORY, new AspectList().add(TWAspects.TWAspect, 3).add(Aspect.MAGIC, 3).add(Aspect.WEAPON, 3), 6, 1, 5, new ItemStack(TWItems.TWCross)).setStub().setSpecial().setParents(TWResearchConfig.TWSIGIL_KEY).registerResearchItem();
		TWWeapon.setPages(new ResearchPage("0"), new ResearchPage(TWRecipes.TWCross));
		
	}
	
}
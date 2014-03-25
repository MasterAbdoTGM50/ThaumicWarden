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
	
	public static ResearchItem TWARDEN;
	public static ResearchItem TWQUARTZ;
	public static ResearchItem TWFABRIC;
	public static ResearchItem TWSIGIL;
	public static ResearchItem TWARMOR;
	public static ResearchItem TWCROSS;
	public static ResearchItem TWSTONE;
	public static ResearchItem TWAMULET;
	public static ResearchItem TWFLOWER;
	
	public static void init() {
		
		initCategory();
		initEntry();
		
	}
	
	public static void initCategory() {
		
		ResearchCategories.registerCategory(TWResearchConfig.TWCATEGORY, TWResearchConfig.TWCATEGORY_ICON, TWResearchConfig.TWCATEGORY_BACK);
		
	}
	
	public static void initEntry() {
		
		TWARDEN = new TWResearchItem(TWResearchConfig.TWARDENS_KEY, TWResearchConfig.TWCATEGORY, new AspectList(), 0, 0, 0, new ItemStack(TWItems.twSigil, 1)).setRound().setAutoUnlock().registerResearchItem();
		TWARDEN.setPages(new ResearchPage("0"));
		TWFLOWER = new TWResearchItem(TWResearchConfig.TWFLOWER_KEY, TWResearchConfig.TWCATEGORY, new AspectList(), 0, -2, 0, new ItemStack(TWBlocks.twFlower, 1)).setRound().setParents(TWResearchConfig.TWARDENS_KEY).setAutoUnlock().registerResearchItem();
		TWFLOWER.setPages(new ResearchPage("0"));
		TWQUARTZ = new TWResearchItem(TWResearchConfig.TWQUARTZ_KEY, TWResearchConfig.TWCATEGORY, new AspectList().add(TWAspects.WARDEN, 3).add(Aspect.CRYSTAL, 3), 2, -1, 2, new ItemStack(TWItems.twResource, 1, 0)).setStub().setParents(TWResearchConfig.TWARDENS_KEY).registerResearchItem();
		TWQUARTZ.setPages(new ResearchPage("0"), new ResearchPage(TWRecipes.twQuartz));
		TWFABRIC = new TWResearchItem(TWResearchConfig.TWFABRIC_KEY, TWResearchConfig.TWCATEGORY, new AspectList().add(TWAspects.WARDEN, 3).add(Aspect.CLOTH, 3), 2, 1, 2, new ItemStack(TWItems.twResource, 1, 1)).setStub().setParents(TWResearchConfig.TWARDENS_KEY, "ENCHFABRIC").registerResearchItem();
		TWFABRIC.setPages(new ResearchPage("0"), new ResearchPage(TWRecipes.twFabric));
		TWSIGIL = new TWResearchItem(TWResearchConfig.TWSIGIL_KEY, TWResearchConfig.TWCATEGORY, new AspectList().add(TWAspects.WARDEN, 3).add(Aspect.MAGIC, 3), 4, 0, 2, new ItemStack(TWItems.twSigil)).setStub().setParents(TWResearchConfig.TWQUARTZ_KEY, TWResearchConfig.TWFABRIC_KEY).registerResearchItem();
		TWSIGIL.setPages(new ResearchPage("0"),new ResearchPage(TWRecipes.twFrame), new ResearchPage(TWRecipes.twSigil));
		TWARMOR = new TWResearchItem(TWResearchConfig.TWARMOR_KEY, TWResearchConfig.TWCATEGORY, new AspectList().add(TWAspects.WARDEN, 3).add(Aspect.MAGIC, 3).add(Aspect.ARMOR, 3), 6, -1, 5, new ItemStack(TWItems.twChest)).setStub().setSpecial().setParents(TWResearchConfig.TWSIGIL_KEY).registerResearchItem();
		TWARMOR.setPages(new ResearchPage("0"), new ResearchPage(TWRecipes.twHelm), new ResearchPage(TWRecipes.twChest), new ResearchPage(TWRecipes.twLegs), new ResearchPage(TWRecipes.twBoots));
		TWCROSS = new TWResearchItem(TWResearchConfig.TWWEAPON_KEY, TWResearchConfig.TWCATEGORY, new AspectList().add(TWAspects.WARDEN, 3).add(Aspect.MAGIC, 3).add(Aspect.WEAPON, 3), 6, 1, 5, new ItemStack(TWItems.twCross)).setStub().setSpecial().setParents(TWResearchConfig.TWSIGIL_KEY).registerResearchItem();
		TWCROSS.setPages(new ResearchPage("0"), new ResearchPage(TWRecipes.twCross));
		
	}
	
}
package matgm50.twarden.research;

import matgm50.twarden.aspects.TWAspects;
import matgm50.twarden.blocks.TWBlocks;
import matgm50.twarden.config.TWResearchConfig;
import matgm50.twarden.crafting.TWRecipes;
import matgm50.twarden.items.TWItems;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.api.research.ResearchCategories;
import thaumcraft.api.research.ResearchItem;
import thaumcraft.api.research.ResearchPage;
import thaumcraft.common.config.ConfigItems;

public class TWResearch {
	
	public static ResearchItem TWardens;
	public static ResearchItem Memories;
	public static ResearchItem TWQuartz;
	public static ResearchItem TWSigil;
	public static ResearchItem TWArmor;
	public static ResearchItem TWWeapon;
	public static ResearchItem TWStone;
	public static ResearchItem TWAmulet;
	public static ResearchItem TWFlower;
	public static ResearchItem History1;
	public static ResearchItem History2;
	public static ResearchItem History3;
	public static ResearchItem History4;
	public static ResearchItem History5;
	public static ResearchItem History6;
	public static ResearchItem History7;
	
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
		Memories = new TWResearchItem(TWResearchConfig.MEMORIES_KEY, TWResearchConfig.TWCATEGORY, new AspectList().add(Aspect.MIND, 3), 0, 2, 3, new ItemStack(ConfigItems.itemResource, 0, 9)).setRound().setSpecial().setParents(TWResearchConfig.TWARDENS_KEY).registerResearchItem();
		Memories.setPages(new ResearchPage("0"));
		TWQuartz = new TWResearchItem(TWResearchConfig.TWQUARTZ_KEY, TWResearchConfig.TWCATEGORY, new AspectList().add(TWAspects.TWAspect, 3).add(Aspect.MAGIC, 3).add(Aspect.CRYSTAL, 3), 2, 0, 3, new ItemStack(TWItems.TWResource, 1, 0)).setStub().setParents(TWResearchConfig.TWARDENS_KEY).registerResearchItem();
		TWQuartz.setPages(new ResearchPage("0"), new ResearchPage(TWRecipes.TWQuartz));
		TWSigil = new TWResearchItem(TWResearchConfig.TWSIGIL_KEY, TWResearchConfig.TWCATEGORY, new AspectList().add(TWAspects.TWAspect, 3).add(Aspect.MAGIC, 3), 4, 0, 3, new ItemStack(TWItems.TWSigil)).setStub().setParents(TWResearchConfig.TWQUARTZ_KEY).registerResearchItem();
		TWSigil.setPages(new ResearchPage("0"),new ResearchPage(TWRecipes.TWFrame), new ResearchPage(TWRecipes.TWSigil));
		TWArmor = new TWResearchItem(TWResearchConfig.TWARMOR_KEY, TWResearchConfig.TWCATEGORY, new AspectList().add(TWAspects.TWAspect, 3).add(Aspect.MAGIC, 3).add(Aspect.ARMOR, 3), 6, -1, 5, new ItemStack(TWItems.TWChest)).setStub().setSpecial().setParents(TWResearchConfig.TWSIGIL_KEY, "THAUMIUM", "ENCHFABRIC", "GOGGLES").registerResearchItem();
		TWArmor.setPages(new ResearchPage("0"), new ResearchPage(TWRecipes.TWHelm), new ResearchPage(TWRecipes.TWChest), new ResearchPage(TWRecipes.TWLegs), new ResearchPage(TWRecipes.TWBoots));
		TWWeapon = new TWResearchItem(TWResearchConfig.TWWEAPON_KEY, TWResearchConfig.TWCATEGORY, new AspectList().add(TWAspects.TWAspect, 3).add(Aspect.MAGIC, 3).add(Aspect.WEAPON, 3), 6, 1, 5, new ItemStack(TWItems.TWSword)).setStub().setSpecial().setParents(TWResearchConfig.TWSIGIL_KEY, "THAUMIUM", "ENCHFABRIC").registerResearchItem();
		TWWeapon.setPages(new ResearchPage("0"), new ResearchPage(TWRecipes.TWSword), new ResearchPage(TWRecipes.TWBow));
		TWStone = new TWResearchItem(TWResearchConfig.TWSTONE_KEY, TWResearchConfig.TWCATEGORY, new AspectList().add(Aspect.MAGIC, 3).add(Aspect.STONE, 3), -2, 0, 3, new ItemStack(TWItems.TWResource, 1, 3)).setStub().setParents(TWResearchConfig.TWARDENS_KEY).setHidden().registerResearchItem();
		TWStone.setPages(new ResearchPage("0"), new ResearchPage(TWRecipes.TWStone));
		TWAmulet = new TWResearchItem(TWResearchConfig.TWAMULET_KEY, TWResearchConfig.TWCATEGORY, new AspectList().add(Aspect.MAGIC, 3).add(Aspect.EXCHANGE, 3), -4, 0, 3, new ItemStack(TWItems.TWAmulet)).setStub().setSpecial().setParents(TWResearchConfig.TWSTONE_KEY, "ENCHFABRIC").registerResearchItem();
		TWAmulet.setPages(new ResearchPage("0"), new ResearchPage(TWRecipes.TWAmulet));
		
		History1 = new TWResearchItem(TWResearchConfig.HISTORY1_KEY, TWResearchConfig.TWCATEGORY, new AspectList(), -4, 4, 0,new ItemStack(ConfigItems.itemResource, 0, 9)).setRound().setParents(TWResearchConfig.MEMORIES_KEY).setAutoUnlock().registerResearchItem();
		History1.setPages(new ResearchPage("0"), new ResearchPage("1"));
		History2 = new TWResearchItem(TWResearchConfig.HISTORY2_KEY, TWResearchConfig.TWCATEGORY, new AspectList(), -2, 4, 0, new ItemStack(ConfigItems.itemResource, 0, 9)).setRound().setParents(TWResearchConfig.HISTORY1_KEY).setAutoUnlock().registerResearchItem();
		History2.setPages(new ResearchPage("0"), new ResearchPage("1"), new ResearchPage("2"));
		History3 = new TWResearchItem(TWResearchConfig.HISTORY3_KEY, TWResearchConfig.TWCATEGORY, new AspectList(), 0, 4, 0, new ItemStack(ConfigItems.itemResource, 0, 9)).setRound().setParents(TWResearchConfig.HISTORY2_KEY).setAutoUnlock().registerResearchItem();
		History3.setPages(new ResearchPage("0"), new ResearchPage("1"), new ResearchPage("2"));
		History4 = new TWResearchItem(TWResearchConfig.HISTORY4_KEY, TWResearchConfig.TWCATEGORY, new AspectList(), 2, 4, 0, new ItemStack(ConfigItems.itemResource, 0, 9)).setRound().setParents(TWResearchConfig.HISTORY3_KEY).setAutoUnlock().registerResearchItem();
		History4.setPages(new ResearchPage("0"), new ResearchPage("1"), new ResearchPage("2"));
		History5 = new TWResearchItem(TWResearchConfig.HISTORY5_KEY, TWResearchConfig.TWCATEGORY, new AspectList(), 4, 4, 0, new ItemStack(ConfigItems.itemResource, 0, 9)).setRound().setParents(TWResearchConfig.HISTORY4_KEY).setAutoUnlock().registerResearchItem();
		History5.setPages(new ResearchPage("0"), new ResearchPage("1"), new ResearchPage("2"));
		History6 = new TWResearchItem(TWResearchConfig.HISTORY6_KEY, TWResearchConfig.TWCATEGORY, new AspectList(), -4, 6, 0, new ItemStack(ConfigItems.itemResource, 0, 9)).setRound().setParents(TWResearchConfig.HISTORY5_KEY).setAutoUnlock().registerResearchItem();
		History6.setPages(new ResearchPage("0"), new ResearchPage("1"), new ResearchPage("2"));
		History7 = new TWResearchItem(TWResearchConfig.HISTORY7_KEY, TWResearchConfig.TWCATEGORY, new AspectList(), -2, 6, 0, new ItemStack(ConfigItems.itemResource, 0, 9)).setRound().setParents(TWResearchConfig.HISTORY6_KEY).setAutoUnlock().registerResearchItem();
		History7.setPages(new ResearchPage("0"), new ResearchPage("1"));
		
	}
	
}
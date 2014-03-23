package matgm50.twarden.crafting;

import matgm50.twarden.aspects.TWAspects;
import matgm50.twarden.blocks.TWBlocks;
import matgm50.twarden.config.TWResearchConfig;
import matgm50.twarden.items.TWItems;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import thaumcraft.api.ThaumcraftApi;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.api.crafting.CrucibleRecipe;
import thaumcraft.api.crafting.InfusionRecipe;
import thaumcraft.api.crafting.ShapedArcaneRecipe;
import thaumcraft.common.config.ConfigBlocks;
import thaumcraft.common.config.ConfigItems;

public class TWRecipes {
	
	public static CrucibleRecipe TWQuartz;
	public static CrucibleRecipe TWFabric;
	public static ShapedArcaneRecipe TWHelm;
	public static ShapedArcaneRecipe TWChest;
	public static ShapedArcaneRecipe TWLegs;
	public static ShapedArcaneRecipe TWBoots;
	public static ShapedArcaneRecipe TWCross;
	public static ShapedArcaneRecipe TWStone;
	public static ShapedArcaneRecipe TWFrame;
	public static InfusionRecipe TWSigil;
	public static InfusionRecipe TWFlower;
	
	public static void Init() {
		
		InitCrucible();
		InitArcane();
		InitInfusion();
		
	}
	
	public static void InitCrucible() {
		
		TWQuartz = ThaumcraftApi.addCrucibleRecipe(TWResearchConfig.TWQUARTZ_KEY, new ItemStack(TWItems.TWResource, 1, 0), new ItemStack(Blocks.quartz_block), new AspectList().add(Aspect.ELDRITCH, 8).add(Aspect.MAGIC, 8).add(Aspect.CRYSTAL, 16));
		TWFabric = ThaumcraftApi.addCrucibleRecipe(TWResearchConfig.TWFABRIC_KEY, new ItemStack(TWItems.TWResource, 1, 1), new ItemStack(ConfigItems.itemResource, 1, 7), new AspectList().add(Aspect.ELDRITCH, 4).add(Aspect.MAGIC, 4).add(Aspect.CLOTH, 8).add(Aspect.METAL, 8));
		
	}
	
	public static void InitArcane() {
		
		TWHelm = ThaumcraftApi.addArcaneCraftingRecipe(TWResearchConfig.TWARMOR_KEY, new ItemStack(TWItems.TWHelm, 1), new AspectList().add(Aspect.ORDER, 125).add(Aspect.ENTROPY, 125).add(Aspect.AIR, 125).add(Aspect.EARTH, 125).add(Aspect.FIRE, 125).add(Aspect.WATER, 125),
				"XXX", "XOX", "   ", 'X', new ItemStack(TWItems.TWResource, 1, 1), 'O', new ItemStack(TWItems.TWSigil, 1));
		TWChest = ThaumcraftApi.addArcaneCraftingRecipe(TWResearchConfig.TWSIGIL_KEY, new ItemStack(TWItems.TWChest, 1), new AspectList().add(Aspect.ORDER, 125).add(Aspect.ENTROPY, 125).add(Aspect.AIR, 125).add(Aspect.EARTH, 125).add(Aspect.FIRE, 125).add(Aspect.WATER, 125),
				"X X", "XOX", "XXX", 'X', new ItemStack(TWItems.TWResource, 1, 1), 'O', new ItemStack(TWItems.TWSigil, 1));
		TWLegs = ThaumcraftApi.addArcaneCraftingRecipe(TWResearchConfig.TWARMOR_KEY, new ItemStack(TWItems.TWLegs, 1), new AspectList().add(Aspect.ORDER, 125).add(Aspect.ENTROPY, 125).add(Aspect.AIR, 125).add(Aspect.EARTH, 125).add(Aspect.FIRE, 125).add(Aspect.WATER, 125),
				"XXX", "XOX", "X X", 'X', new ItemStack(TWItems.TWResource, 1, 1), 'O', new ItemStack(TWItems.TWSigil, 1));
		TWBoots = ThaumcraftApi.addArcaneCraftingRecipe(TWResearchConfig.TWARMOR_KEY, new ItemStack(TWItems.TWBoots, 1), new AspectList().add(Aspect.ORDER, 125).add(Aspect.ENTROPY, 125).add(Aspect.AIR, 125).add(Aspect.EARTH, 125).add(Aspect.FIRE, 125).add(Aspect.WATER, 125),
				"   ", "XOX", "X X", 'X', new ItemStack(TWItems.TWResource, 1, 1), 'O', new ItemStack(TWItems.TWSigil, 1));
		TWCross = ThaumcraftApi.addArcaneCraftingRecipe(TWResearchConfig.TWARMOR_KEY, new ItemStack(TWItems.TWCross, 1), new AspectList().add(Aspect.ORDER, 125).add(Aspect.ENTROPY, 125).add(Aspect.AIR, 125).add(Aspect.EARTH, 125).add(Aspect.FIRE, 125).add(Aspect.WATER, 125),
				" X ", "XOX", " X ", 'X', new ItemStack(TWItems.TWResource, 1, 0), 'O', new ItemStack(TWItems.TWSigil, 1));
		TWFrame = ThaumcraftApi.addArcaneCraftingRecipe(TWResearchConfig.TWSIGIL_KEY, new ItemStack(TWItems.TWResource, 1, 2), new AspectList().add(Aspect.ORDER, 60).add(Aspect.ENTROPY, 60).add(Aspect.AIR, 60).add(Aspect.EARTH, 60).add(Aspect.FIRE, 60).add(Aspect.WATER, 60),
				" X ", "XOX", " X ", 'X', new ItemStack(ConfigBlocks.blockCosmeticSolid, 1, 1), 'O', new ItemStack(TWItems.TWResource, 1, 0));
		
	}
	
	public static void InitInfusion() {
		
		TWSigil = ThaumcraftApi.addInfusionCraftingRecipe(TWResearchConfig.TWSIGIL_KEY, new ItemStack(TWItems.TWSigil, 1), 25, new AspectList().add(TWAspects.TWAspect, 32).add(Aspect.MAGIC, 32), new ItemStack(TWItems.TWResource, 1, 2),
				new ItemStack [] {new ItemStack(TWItems.TWResource, 1, 3), new ItemStack(TWItems.TWResource, 1, 3), new ItemStack(TWItems.TWResource, 1, 3), new ItemStack(TWItems.TWResource, 1, 3)});
		TWFlower = ThaumcraftApi.addInfusionCraftingRecipe(TWResearchConfig.TWFLOWER_KEY, new ItemStack(TWBlocks.TWFlower, 1), 25, new AspectList().add(TWAspects.TWAspect, 32).add(Aspect.MAGIC, 32), new ItemStack(ConfigBlocks.blockCustomPlant, 1, 3),
				new ItemStack [] {new ItemStack(TWItems.TWResource, 1, 0), new ItemStack(TWItems.TWResource, 1, 0)});
		
	}
	
}

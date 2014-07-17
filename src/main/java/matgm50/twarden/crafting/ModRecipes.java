package matgm50.twarden.crafting;

import cpw.mods.fml.common.registry.GameRegistry;
import matgm50.twarden.block.ModBlocks;
import matgm50.twarden.item.ModItems;
import matgm50.twarden.lib.ResearchLib;
import matgm50.twarden.research.ModResearch;
import matgm50.twarden.util.WardenicHelper;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import thaumcraft.api.ThaumcraftApi;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.api.crafting.CrucibleRecipe;
import thaumcraft.api.crafting.InfusionRecipe;
import thaumcraft.api.crafting.ShapedArcaneRecipe;
import thaumcraft.common.config.ConfigBlocks;
import thaumcraft.common.config.ConfigItems;

/**
 * Created by MasterAbdoTGM50 on 5/22/2014.
 */

public class ModRecipes {

    public static CrucibleRecipe recipeQuartz;
    public static CrucibleRecipe recipeCrystal;
    public static ShapedArcaneRecipe recipeWardenHelm;
    public static ShapedArcaneRecipe recipeWardenChest;
    public static ShapedArcaneRecipe recipeWardenLegs;
    public static ShapedArcaneRecipe recipeWardenBoots;
    public static ShapedArcaneRecipe recipeWardenSword;
    public static InfusionRecipe recipeLizTable;
    public static ShapedArcaneRecipe recipeLizHammer;

    public static void init() {

        initMundane();
        initThaumic();

    }

    public static void initMundane() {

        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.blockInfusedQuartzNormal), "XX", "XX", 'X', new ItemStack(ModItems.itemResource, 1, 2));
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.blockInfusedQuartzChiseled), "X", "X", 'X', new ItemStack(ModBlocks.blockInfusedQuartzSlab));
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.blockInfusedQuartzPillar, 2), "X", "X", 'X', new ItemStack(ModBlocks.blockInfusedQuartzNormal));
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.blockInfusedQuartzSlab, 6), "XXX", 'X', new ItemStack(ModBlocks.blockInfusedQuartzNormal));
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.blockInfusedQuartzStair, 4), "X  ", "XX ", "XXX", 'X', new ItemStack(ModBlocks.blockInfusedQuartzNormal));

    }

    public static void initThaumic() {

        recipeQuartz = ThaumcraftApi.addCrucibleRecipe(ResearchLib.QUARTZ_KEY, new ItemStack(ModItems.itemResource, 1, 2), new ItemStack(Items.quartz), new AspectList().add(Aspect.MAGIC, 4).add(Aspect.ELDRITCH, 4));
        recipeCrystal = ThaumcraftApi.addCrucibleRecipe(ResearchLib.CRYSTAL_KEY, new ItemStack(ModItems.itemResource, 1, 1), new ItemStack(ModItems.itemResource, 1, 0), new AspectList().add(Aspect.MAGIC, 32).add(Aspect.CRYSTAL, 32));

        recipeWardenHelm = ThaumcraftApi.addArcaneCraftingRecipe(ResearchLib.WARDEN_ARMOR_KEY, new ItemStack(ModItems.itemWardenHelm, 1), new AspectList().add(Aspect.ORDER, 125).add(Aspect.ENTROPY, 125).add(Aspect.AIR, 125).add(Aspect.EARTH, 125).add(Aspect.FIRE, 125).add(Aspect.WATER, 125),
                "XXX", "XOX", "   ", 'X', new ItemStack(ModItems.itemResource, 1, 2), 'O', new ItemStack(ModItems.itemResource, 1, 1));
        recipeWardenChest = ThaumcraftApi.addArcaneCraftingRecipe(ResearchLib.WARDEN_ARMOR_KEY, new ItemStack(ModItems.itemWardenChest, 1), new AspectList().add(Aspect.ORDER, 125).add(Aspect.ENTROPY, 125).add(Aspect.AIR, 125).add(Aspect.EARTH, 125).add(Aspect.FIRE, 125).add(Aspect.WATER, 125),
                "X X", "XOX", "XXX", 'X', new ItemStack(ModItems.itemResource, 1, 2), 'O', new ItemStack(ModItems.itemResource, 1, 1));
        recipeWardenLegs = ThaumcraftApi.addArcaneCraftingRecipe(ResearchLib.WARDEN_ARMOR_KEY, new ItemStack(ModItems.itemWardenLegs, 1), new AspectList().add(Aspect.ORDER, 125).add(Aspect.ENTROPY, 125).add(Aspect.AIR, 125).add(Aspect.EARTH, 125).add(Aspect.FIRE, 125).add(Aspect.WATER, 125),
                "XXX", "XOX", "X X", 'X', new ItemStack(ModItems.itemResource, 1, 2), 'O', new ItemStack(ModItems.itemResource, 1, 1));
        recipeWardenBoots = ThaumcraftApi.addArcaneCraftingRecipe(ResearchLib.WARDEN_ARMOR_KEY, new ItemStack(ModItems.itemWardenBoots, 1), new AspectList().add(Aspect.ORDER, 125).add(Aspect.ENTROPY, 125).add(Aspect.AIR, 125).add(Aspect.EARTH, 125).add(Aspect.FIRE, 125).add(Aspect.WATER, 125),
                "   ", "XOX", "X X", 'X', new ItemStack(ModItems.itemResource, 1, 2), 'O', new ItemStack(ModItems.itemResource, 1, 1));
        recipeWardenSword = ThaumcraftApi.addArcaneCraftingRecipe(ResearchLib.WARDEN_SWORD_KEY, new ItemStack(ModItems.itemWardenSword, 1), new AspectList().add(Aspect.ORDER, 125).add(Aspect.ENTROPY, 125).add(Aspect.AIR, 125).add(Aspect.EARTH, 125).add(Aspect.FIRE, 125).add(Aspect.WATER, 125),
                " X ", " X ", " O ", 'X', new ItemStack(ModItems.itemResource, 1, 2), 'O', new ItemStack(ModItems.itemResource, 1, 1));

        recipeLizTable = ThaumcraftApi.addInfusionCraftingRecipe(ResearchLib.LIZ_KIT_KEY, new ItemStack(ModBlocks.blockLizTable), 5, new AspectList().add(ModResearch.EXUBITOR, 64).add(Aspect.MAGIC, 32), new ItemStack(ConfigBlocks.blockMagicalLog), new ItemStack[]{new ItemStack(ModItems.itemResource,0, 1)});
        recipeLizHammer = ThaumcraftApi.addArcaneCraftingRecipe(ResearchLib.LIZ_KIT_KEY, new ItemStack(ModItems.itemLizHammer, 1), new AspectList().add(Aspect.ORDER, 125).add(Aspect.ENTROPY, 125).add(Aspect.AIR, 125).add(Aspect.EARTH, 125).add(Aspect.FIRE, 125).add(Aspect.WATER, 125),
                "XXX", "XOX", " I ", 'X', new ItemStack(ModItems.itemResource, 1, 2), 'O', new ItemStack(ModItems.itemResource, 1, 1), 'I', new ItemStack(ConfigBlocks.blockMagicalLog));

    }

}

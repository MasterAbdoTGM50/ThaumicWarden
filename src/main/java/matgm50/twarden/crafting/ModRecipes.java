package matgm50.twarden.crafting;

import cpw.mods.fml.common.registry.GameRegistry;
import matgm50.twarden.block.ModBlocks;
import matgm50.twarden.item.ModItems;
import matgm50.twarden.lib.ResearchLib;
import matgm50.twarden.research.ModResearch;
import matgm50.twarden.util.WardenHelper;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import thaumcraft.api.ThaumcraftApi;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.api.crafting.CrucibleRecipe;
import thaumcraft.api.crafting.InfusionRecipe;
import thaumcraft.api.crafting.ShapedArcaneRecipe;
import thaumcraft.common.config.ConfigItems;

/**
 * Created by MasterAbdoTGM50 on 5/22/2014.
 */

public class ModRecipes {

    public static CrucibleRecipe recipeQuartz;
    public static CrucibleRecipe recipeCrystal;
    public static ShapedArcaneRecipe recipeWardenAmulet;
    public static ShapedArcaneRecipe recipeWardenHelm;
    public static ShapedArcaneRecipe recipeWardenChest;
    public static ShapedArcaneRecipe recipeWardenLegs;
    public static ShapedArcaneRecipe recipeWardenBoots;
    public static ShapedArcaneRecipe recipeWardenSword;
    public static InfusionRecipe recipeSwordInfusion[] = new InfusionRecipe[5];
    public static ShapedArcaneRecipe recipeLoveRing;

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
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.itemResource, 1, 3), "XXX", "XOX", "XXX", 'X', new ItemStack(Items.nether_star), 'O',  new ItemStack(Blocks.dragon_egg));

    }

    public static void initThaumic() {

        recipeQuartz = ThaumcraftApi.addCrucibleRecipe(ResearchLib.QUARTZ_KEY, new ItemStack(ModItems.itemResource, 1, 2), new ItemStack(Items.quartz), new AspectList().add(Aspect.MAGIC, 4).add(Aspect.ELDRITCH, 4));
        recipeCrystal = ThaumcraftApi.addCrucibleRecipe(ResearchLib.CRYSTAL_KEY, new ItemStack(ModItems.itemResource, 1, 1), new ItemStack(ModItems.itemResource, 1, 0), new AspectList().add(Aspect.MAGIC, 32).add(Aspect.CRYSTAL, 32));

        recipeWardenAmulet = ThaumcraftApi.addArcaneCraftingRecipe(ResearchLib.WARDEN_AMULET_KEY, new ItemStack(ModItems.itemWardenAmulet), new AspectList().add(Aspect.AIR, 50).add(Aspect.EARTH, 50).add(Aspect.FIRE, 50)
                .add(Aspect.WATER, 50).add(Aspect.ORDER, 50).add(Aspect.ENTROPY, 50), "XXX", "X X", "XOX", 'O', new ItemStack(ModItems.itemResource, 1, 1), 'X', new ItemStack(ConfigItems.itemResource , 1, 7));

        recipeLoveRing = ThaumcraftApi.addArcaneCraftingRecipe(ResearchLib.LOVE_RING_KEY, new ItemStack(ModItems.itemLoveRing), new AspectList().add(Aspect.AIR, 125).add(Aspect.EARTH, 125).add(Aspect.FIRE, 125)
                .add(Aspect.WATER, 125).add(Aspect.ORDER, 125).add(Aspect.ENTROPY, 125), "   ", "XYZ", "   ", 'X', new ItemStack(ModItems.itemResource, 1, 3), 'Y', new ItemStack(ConfigItems.itemBaubleBlanks , 1, 1), 'Z', new ItemStack(Items.nether_star));

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

        ItemStack swordWarden = WardenHelper.createSword(new ItemStack(ModItems.itemWardenSword, 1), WardenHelper.WARDEN);
        ItemStack swordFire = WardenHelper.createSword(new ItemStack(ModItems.itemWardenSword, 1), WardenHelper.FIRE);
        ItemStack swordHeal = WardenHelper.createSword(new ItemStack(ModItems.itemWardenSword, 1), WardenHelper.HEAL);
        ItemStack swordChaos = WardenHelper.createSword(new ItemStack(ModItems.itemWardenSword, 1), WardenHelper.CHAOS);
        ItemStack swordLight = WardenHelper.createSword(new ItemStack(ModItems.itemWardenSword, 1), WardenHelper.LIGHT);

        recipeSwordInfusion[0] = swordInfusion(swordWarden, ModResearch.EXUBITOR);
        recipeSwordInfusion[1] = swordInfusion(swordFire, Aspect.FIRE);
        recipeSwordInfusion[2] = swordInfusion(swordHeal, Aspect.HEAL);
        recipeSwordInfusion[3] = swordInfusion(swordChaos, Aspect.ENTROPY);
        recipeSwordInfusion[4] = swordInfusion(swordLight, Aspect.LIGHT);

    }

    public static InfusionRecipe swordInfusion(ItemStack output, Aspect tag) {

        return ThaumcraftApi.addInfusionCraftingRecipe(ResearchLib.WARDEN_SWORD_KEY, output, 5, new AspectList().add(tag, 32), new ItemStack(ModItems.itemWardenSword), new ItemStack [] {new ItemStack(ModItems.itemResource, 1, 0)});

    }

}

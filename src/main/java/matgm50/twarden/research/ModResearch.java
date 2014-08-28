package matgm50.twarden.research;

import matgm50.twarden.block.ModBlocks;
import matgm50.twarden.crafting.ModRecipes;
import matgm50.twarden.item.ModItems;
import matgm50.twarden.lib.ResearchLib;
import net.minecraft.item.ItemStack;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.api.research.ResearchCategories;
import thaumcraft.api.research.ResearchItem;
import thaumcraft.api.research.ResearchPage;

/**
 * Created by MasterAbdoTGM50 on 5/22/2014.
 */

public class ModResearch {

    public static final Aspect EXUBITOR = new Aspect(ResearchLib.EXUBITOR_NAME, 0x3cd4fc, new Aspect[] {Aspect.ELDRITCH, Aspect.DEATH}, ResearchLib.EXUBITOR_ICON, 771);

    public static ResearchItem researchTWarden;
    public static ResearchItem researchExubitura;
    public static ResearchItem researchQuartz;
    public static ResearchItem researchCrystal;
    public static ResearchItem researchWardenArmor;
    public static ResearchItem researchWardenSword;
    public static ResearchItem researchWaslieHammer;

    public static void init() {

        initCategory();
        initResearch();

    }

    public static void initCategory() {

        ResearchCategories.registerCategory(ResearchLib.CATEGORY_KEY, ResearchLib.CATEGORY_ICON, ResearchLib.CATEGORY_BACK);

    }

    public static void initResearch() {

        researchTWarden = new ModResearchItem(ResearchLib.TWARDEN_KEY, ResearchLib.CATEGORY_KEY, new AspectList(), 0, 0, 0, new ItemStack(ModItems.itemWardenAmulet)).setRound().setSpecial().setAutoUnlock().registerResearchItem();
        researchTWarden.setPages(new ResearchPage("0"));
        researchExubitura = new ModResearchItem(ResearchLib.EXUBITURA_KEY, ResearchLib.CATEGORY_KEY, new AspectList(), 0, -2, 0, new ItemStack(ModBlocks.blockExubitura)).setParents(ResearchLib.TWARDEN_KEY).setAutoUnlock().registerResearchItem();
        researchExubitura.setPages(new ResearchPage("0"));
        researchQuartz = new ModResearchItem(ResearchLib.QUARTZ_KEY, ResearchLib.CATEGORY_KEY, new AspectList().add(EXUBITOR, 4).add(Aspect.CRYSTAL, 4), 2, 0, 2, new ItemStack(ModItems.itemResource, 0, 2)).setParents(ResearchLib.TWARDEN_KEY).setRound().registerResearchItem();
        researchQuartz.setPages(new ResearchPage("0"), new ResearchPage(ModRecipes.recipeQuartz));
        researchCrystal = new ModResearchItem(ResearchLib.CRYSTAL_KEY, ResearchLib.CATEGORY_KEY, new AspectList().add(EXUBITOR, 4).add(Aspect.CRYSTAL, 4), -2, 0, 2, new ItemStack(ModItems.itemResource, 0, 1)).setParents(ResearchLib.TWARDEN_KEY).setSecondary().registerResearchItem();
        researchCrystal.setPages(new ResearchPage("0"), new ResearchPage(ModRecipes.recipeCrystal));
        researchWardenArmor = new ModResearchItem(ResearchLib.WARDEN_ARMOR_KEY, ResearchLib.CATEGORY_KEY, new AspectList().add(EXUBITOR, 4).add(Aspect.CRYSTAL, 4).add(Aspect.ARMOR, 4), 1, 2, 3, new ItemStack(ModItems.itemWardenChest)).setParents(ResearchLib.CRYSTAL_KEY, ResearchLib.QUARTZ_KEY).setRound().setSpecial().registerResearchItem();
        researchWardenArmor.setPages(new ResearchPage("0"), new ResearchPage(ModRecipes.recipeWardenHelm), new ResearchPage(ModRecipes.recipeWardenChest), new ResearchPage(ModRecipes.recipeWardenLegs), new ResearchPage(ModRecipes.recipeWardenBoots));
        researchWardenSword = new ModResearchItem(ResearchLib.WARDEN_SWORD_KEY, ResearchLib.CATEGORY_KEY, new AspectList().add(EXUBITOR, 4).add(Aspect.CRYSTAL, 4).add(Aspect.WEAPON, 4), -1, 2, 3, new ItemStack(ModItems.itemWardenSword)).setParents(ResearchLib.CRYSTAL_KEY, ResearchLib.QUARTZ_KEY).setRound().setSpecial().registerResearchItem();
        researchWardenSword.setPages(new ResearchPage("0"), new ResearchPage(ModRecipes.recipeWardenSword));
        researchWaslieHammer = new ModResearchItem(ResearchLib.WASLIE_HAMMER_KEY, ResearchLib.CATEGORY_KEY, new AspectList().add(EXUBITOR, 4).add(Aspect.CRYSTAL, 4), 0, 4, 3, new ItemStack(ModItems.itemWaslieHammer)).setParents(ResearchLib.CRYSTAL_KEY, ResearchLib.QUARTZ_KEY).setRound().setSpecial().registerResearchItem();
        researchWaslieHammer.setPages(new ResearchPage("0"), new ResearchPage(ModRecipes.recipeWaslieHammer));

    }

}

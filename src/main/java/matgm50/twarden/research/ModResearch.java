package matgm50.twarden.research;

import matgm50.twarden.block.ModBlocks;
import matgm50.twarden.crafting.ModRecipes;
import matgm50.twarden.item.ModItems;
import matgm50.twarden.lib.ResearchLib;
import net.minecraft.item.ItemStack;
import thaumcraft.api.ThaumcraftApi;
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
    public static ResearchItem researchWardenWeapon;
    public static ResearchItem researchWaslieHammer;
    public static ResearchItem researchLore1;
    public static ResearchItem researchLore2;
    public static ResearchItem researchLore3;
    public static ResearchItem researchLore4;
    public static ResearchItem researchIllumination;

    public static void init() {

        initCategory();
        initResearch();
        initTags();

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
        researchWardenArmor = new ModResearchItem(ResearchLib.WARDEN_ARMOR_KEY, ResearchLib.CATEGORY_KEY, new AspectList().add(EXUBITOR, 4).add(Aspect.CRYSTAL, 4).add(Aspect.ARMOR, 4), 6, 2, 3, new ItemStack(ModItems.itemWardenChest)).setParents(ResearchLib.WASLIE_HAMMER_KEY).setRound().setSpecial().registerResearchItem();
        researchWardenArmor.setPages(new ResearchPage("0"), new ResearchPage(ModRecipes.recipeWardenHelm), new ResearchPage(ModRecipes.recipeWardenChest), new ResearchPage(ModRecipes.recipeWardenLegs), new ResearchPage(ModRecipes.recipeWardenBoots));
        researchWardenWeapon = new ModResearchItem(ResearchLib.WARDEN_WEAPON_KEY, ResearchLib.CATEGORY_KEY, new AspectList().add(EXUBITOR, 4).add(Aspect.CRYSTAL, 4).add(Aspect.WEAPON, 4), 6, 6, 3, new ItemStack(ModItems.itemWardenSword)).setParents(ResearchLib.WASLIE_HAMMER_KEY).setRound().setSpecial().registerResearchItem();
        researchWardenWeapon.setPages(new ResearchPage("0"), new ResearchPage(ModRecipes.recipeWardenSword));
        researchWaslieHammer = new ModResearchItem(ResearchLib.WASLIE_HAMMER_KEY, ResearchLib.CATEGORY_KEY, new AspectList().add(EXUBITOR, 4).add(Aspect.CRYSTAL, 4), 4, 4, 3, new ItemStack(ModItems.itemWaslieHammer)).setParentsHidden(ResearchLib.CRYSTAL_KEY, ResearchLib.QUARTZ_KEY).setParents(ResearchLib.LORE4_KEY).setRound().setSpecial().registerResearchItem();
        researchWaslieHammer.setPages(new ResearchPage("0"), new ResearchPage(ModRecipes.recipeWaslieHammer));

        researchIllumination = new ModResearchItem(ResearchLib.FOCUS_ILLUMINATION_KEY, ResearchLib.CATEGORY_KEY, new AspectList().add(Aspect.AIR, 2).add(Aspect.FIRE, 2), 0, 4, 1, new ItemStack(ModItems.itemFocusIllumination)).setRound().setParentsHidden("FOCUSFIRE").registerResearchItem();
        researchIllumination.setPages(new ResearchPage("0"), new ResearchPage(ModRecipes.recipeFocusIllumination));

        researchLore1 = new ModResearchItem(ResearchLib.LORE1_KEY, ResearchLib.CATEGORY_KEY, new AspectList().add(EXUBITOR, 4).add(Aspect.MIND, 4), 0, 2, 3, new ItemStack(ModItems.itemWardenAmulet)).setParents(ResearchLib.TWARDEN_KEY).setRound().setSpecial().registerResearchItem();
        researchLore1.setPages(new ResearchPage("0"), new ResearchPage("1"), new ResearchPage("2"));
        researchLore2 = new ModResearchItem(ResearchLib.LORE2_KEY, ResearchLib.CATEGORY_KEY, new AspectList().add(EXUBITOR, 4).add(Aspect.MIND, 4), -2, 4, 3, new ItemStack(ModItems.itemWardenAmulet)).setParents(ResearchLib.LORE1_KEY).setRound().setSpecial().registerResearchItem();
        researchLore2.setPages(new ResearchPage("0"), new ResearchPage("1"), new ResearchPage("2"), new ResearchPage("3"));
        researchLore3 = new ModResearchItem(ResearchLib.LORE3_KEY, ResearchLib.CATEGORY_KEY, new AspectList().add(EXUBITOR, 4).add(Aspect.MIND, 4), 0, 6, 3, new ItemStack(ModItems.itemWardenAmulet)).setParents(ResearchLib.LORE2_KEY).setRound().setSpecial().registerResearchItem();
        researchLore3.setPages(new ResearchPage("0"), new ResearchPage("1"), new ResearchPage("2"), new ResearchPage("3"), new ResearchPage("4"), new ResearchPage("5"));
        researchLore4 = new ModResearchItem(ResearchLib.LORE4_KEY, ResearchLib.CATEGORY_KEY, new AspectList().add(EXUBITOR, 4).add(Aspect.MIND, 4), 2, 4, 3, new ItemStack(ModItems.itemWardenAmulet)).setParents(ResearchLib.LORE3_KEY).setRound().setSpecial().registerResearchItem();
        researchLore4.setPages(new ResearchPage("0"), new ResearchPage("1"), new ResearchPage("2"), new ResearchPage("3"));

    }

    public static void initTags() {

        ThaumcraftApi.registerObjectTag(new ItemStack(ModItems.itemResource, 0, 0), new AspectList().add(ModResearch.EXUBITOR, 1));
        ThaumcraftApi.registerObjectTag(new ItemStack(ModItems.itemResource, 0, 1), new AspectList().add(Aspect.CRYSTAL, 4).add(Aspect.ELDRITCH, 4).add(ModResearch.EXUBITOR, 1));
        ThaumcraftApi.registerObjectTag(new ItemStack(ModItems.itemResource, 0, 2), new AspectList().add(Aspect.CRYSTAL, 4).add(Aspect.ELDRITCH, 4).add(ModResearch.EXUBITOR, 1));
        ThaumcraftApi.registerObjectTag(new ItemStack(ModItems.itemWardenHelm), new AspectList().add(Aspect.ARMOR, 4).add(Aspect.ELDRITCH, 4).add(ModResearch.EXUBITOR, 1));
        ThaumcraftApi.registerObjectTag(new ItemStack(ModItems.itemWardenChest), new AspectList().add(Aspect.ARMOR, 4).add(Aspect.ELDRITCH, 4).add(ModResearch.EXUBITOR, 1));
        ThaumcraftApi.registerObjectTag(new ItemStack(ModItems.itemWardenLegs), new AspectList().add(Aspect.ARMOR, 4).add(Aspect.ELDRITCH, 4).add(ModResearch.EXUBITOR, 1));
        ThaumcraftApi.registerObjectTag(new ItemStack(ModItems.itemWardenBoots), new AspectList().add(Aspect.ARMOR, 4).add(Aspect.ELDRITCH, 4).add(ModResearch.EXUBITOR, 1));
        ThaumcraftApi.registerObjectTag(new ItemStack(ModItems.itemWardenSword), new AspectList().add(Aspect.WEAPON, 4).add(Aspect.ELDRITCH, 4).add(ModResearch.EXUBITOR, 1));

    }

}

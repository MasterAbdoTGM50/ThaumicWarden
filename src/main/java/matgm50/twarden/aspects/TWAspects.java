package matgm50.twarden.aspects;

import net.minecraft.item.ItemStack;
import matgm50.twarden.blocks.TWBlocks;
import matgm50.twarden.config.TWAspectConfig;
import matgm50.twarden.items.TWItems;
import thaumcraft.api.ThaumcraftApi;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;

public class TWAspects {

	public static Aspect TWAspect;

	public static AspectList TWFlowerTag;
	public static AspectList TWHelmTag;
	public static AspectList TWChestTag;
	public static AspectList TWLegsTag;
	public static AspectList TWBootsTag;
	public static AspectList TWCrossTag;
	public static AspectList TWQuartzTag;
	public static AspectList TWFabricTag;
	public static AspectList TWFrameTag;
	public static AspectList TWShardTag;
	public static AspectList TWStoneTag;
	public static AspectList TWSigilTag;
	public static AspectList TWAmuletTag;

	public static void Init() {
		
		TWAspect = new Aspect(TWAspectConfig.TWAspect_KEY, 0x3cd4fc, new Aspect[] {Aspect.ELDRITCH, Aspect.DEATH}, TWAspectConfig.TWAspectIcon, 771);
		
		TWFlowerTag = new AspectList().add(TWAspect, 16).add(Aspect.MAGIC, 16).add(Aspect.CROP, 16).add(Aspect.EARTH, 16);
		TWHelmTag = new AspectList().add(TWAspect, 16).add(Aspect.MAGIC, 16).add(Aspect.ARMOR, 16).add(Aspect.SENSES, 16);
		TWChestTag = new AspectList().add(TWAspect, 16).add(Aspect.MAGIC, 16).add(Aspect.ARMOR, 16);
		TWLegsTag = new AspectList().add(TWAspect, 16).add(Aspect.MAGIC, 16).add(Aspect.ARMOR, 16);
		TWBootsTag = new AspectList().add(TWAspect, 16).add(Aspect.MAGIC, 16).add(Aspect.ARMOR, 16);
		TWCrossTag = new AspectList().add(TWAspect, 16).add(Aspect.MAGIC, 16).add(Aspect.WEAPON, 16);
		TWQuartzTag = new AspectList().add(TWAspect, 16).add(Aspect.MAGIC, 16).add(Aspect.CRYSTAL, 16);
		TWFabricTag = new AspectList().add(TWAspect, 16).add(Aspect.MAGIC, 16).add(Aspect.CLOTH, 16);
		TWFrameTag = new AspectList().add(TWAspect, 16).add(Aspect.MAGIC, 16).add(Aspect.VOID, 16);
		TWShardTag = new AspectList().add(TWAspect, 16).add(Aspect.MAGIC, 16).add(Aspect.CRYSTAL, 16).add(Aspect.ENTROPY, 16);
		TWStoneTag = new AspectList().add(TWAspect, 16).add(Aspect.MAGIC, 16).add(Aspect.CRYSTAL, 16).add(Aspect.ORDER, 16);
		TWSigilTag = new AspectList().add(TWAspect, 16).add(Aspect.MAGIC, 16);
		TWAmuletTag = new AspectList().add(TWAspect, 16).add(Aspect.MAGIC, 16).add(Aspect.EXCHANGE, 16);
		
		ThaumcraftApi.registerObjectTag(new ItemStack(TWBlocks.TWFlower), TWFlowerTag);
		ThaumcraftApi.registerObjectTag(new ItemStack(TWItems.TWHelm), TWHelmTag);
		ThaumcraftApi.registerObjectTag(new ItemStack(TWItems.TWChest), TWChestTag);
		ThaumcraftApi.registerObjectTag(new ItemStack(TWItems.TWLegs), TWLegsTag);
		ThaumcraftApi.registerObjectTag(new ItemStack(TWItems.TWBoots), TWBootsTag);
		ThaumcraftApi.registerObjectTag(new ItemStack(TWItems.TWCross), TWCrossTag);
		ThaumcraftApi.registerObjectTag(new ItemStack(TWItems.TWResource, 0, 0), TWQuartzTag);
		ThaumcraftApi.registerObjectTag(new ItemStack(TWItems.TWResource, 0, 1), TWFabricTag);
		ThaumcraftApi.registerObjectTag(new ItemStack(TWItems.TWResource, 0, 2), TWFrameTag);
		ThaumcraftApi.registerObjectTag(new ItemStack(TWItems.TWResource, 0, 3), TWShardTag);
		ThaumcraftApi.registerObjectTag(new ItemStack(TWItems.TWResource, 0, 4), TWStoneTag);
		ThaumcraftApi.registerObjectTag(new ItemStack(TWItems.TWSigil), TWSigilTag);
		ThaumcraftApi.registerObjectTag(new ItemStack(TWItems.TWAmulet), TWAmuletTag);
		
	}
}

package matgm50.twarden.aspects;

import net.minecraft.util.ResourceLocation;
import matgm50.twarden.blocks.TWBlocks;
import matgm50.twarden.config.TWAspectConfig;
import matgm50.twarden.config.TWModConfig;
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
	public static AspectList TWSwordTag;
	public static AspectList TWBowTag;
	public static AspectList TWQuartzTag;
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
		TWSwordTag = new AspectList().add(TWAspect, 16).add(Aspect.MAGIC, 16).add(Aspect.WEAPON, 16);
		TWBowTag = new AspectList().add(TWAspect, 16).add(Aspect.MAGIC, 16).add(Aspect.WEAPON, 16);
		TWQuartzTag = new AspectList().add(TWAspect, 16).add(Aspect.MAGIC, 16).add(Aspect.CRYSTAL, 16);
		TWFrameTag = new AspectList().add(TWAspect, 16).add(Aspect.MAGIC, 16).add(Aspect.VOID, 16);
		TWShardTag = new AspectList().add(TWAspect, 16).add(Aspect.MAGIC, 16).add(Aspect.ENTROPY, 16);
		TWStoneTag = new AspectList().add(TWAspect, 16).add(Aspect.MAGIC, 16).add(Aspect.STONE, 16);
		TWSigilTag = new AspectList().add(TWAspect, 16).add(Aspect.MAGIC, 16);
		TWAmuletTag = new AspectList().add(TWAspect, 16).add(Aspect.MAGIC, 16).add(Aspect.EXCHANGE, 16);
		
		ThaumcraftApi.registerObjectTag(TWBlocks.TWFlower.blockID, 0, TWFlowerTag);
		ThaumcraftApi.registerObjectTag(TWItems.TWHelm.itemID, 0, TWHelmTag);
		ThaumcraftApi.registerObjectTag(TWItems.TWChest.itemID, 0, TWChestTag);
		ThaumcraftApi.registerObjectTag(TWItems.TWLegs.itemID, 0, TWLegsTag);
		ThaumcraftApi.registerObjectTag(TWItems.TWBoots.itemID, 0, TWBootsTag);
		ThaumcraftApi.registerObjectTag(TWItems.TWSword.itemID, 0, TWSwordTag);
		ThaumcraftApi.registerObjectTag(TWItems.TWBow.itemID, 0, TWBowTag);
		ThaumcraftApi.registerObjectTag(TWItems.TWResource.itemID, 0, TWQuartzTag);
		ThaumcraftApi.registerObjectTag(TWItems.TWResource.itemID, 1, TWFrameTag);
		ThaumcraftApi.registerObjectTag(TWItems.TWResource.itemID, 2, TWShardTag);
		ThaumcraftApi.registerObjectTag(TWItems.TWResource.itemID, 3, TWStoneTag);
		ThaumcraftApi.registerObjectTag(TWItems.TWSigil.itemID, 0, TWSigilTag);
		ThaumcraftApi.registerObjectTag(TWItems.TWAmulet.itemID, 0, TWAmuletTag);
		
	}
	
}

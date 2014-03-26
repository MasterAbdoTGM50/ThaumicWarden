package matgm50.twarden.aspects;

import matgm50.twarden.blocks.TWBlocks;
import matgm50.twarden.config.TWAspectConfig;
import matgm50.twarden.items.TWItems;
import net.minecraft.item.ItemStack;
import thaumcraft.api.ThaumcraftApi;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;

public class TWAspects {

	public static Aspect WARDEN;

	public static AspectList twFlowerTag;
	public static AspectList twHelmTag;
	public static AspectList twChestTag;
	public static AspectList twLegsTag;
	public static AspectList twBootsTag;
	public static AspectList twCrossTag;
	public static AspectList twQuartzTag;
	public static AspectList twFabricTag;
	public static AspectList twFrameTag;
	public static AspectList twShardTag;
	public static AspectList twStoneTag;
	public static AspectList twSigilTag;
	public static AspectList twAmuletTag;

	public static void init() {
		
		WARDEN = new Aspect(TWAspectConfig.TWAspect_KEY, 0x3cd4fc, new Aspect[] {Aspect.ELDRITCH, Aspect.DEATH}, TWAspectConfig.TWAspectIcon, 771);
		
		twFlowerTag = new AspectList().add(WARDEN, 16).add(Aspect.MAGIC, 16).add(Aspect.CROP, 16).add(Aspect.EARTH, 16);
		twHelmTag = new AspectList().add(WARDEN, 16).add(Aspect.MAGIC, 16).add(Aspect.ARMOR, 16).add(Aspect.SENSES, 16);
		twChestTag = new AspectList().add(WARDEN, 16).add(Aspect.MAGIC, 16).add(Aspect.ARMOR, 16);
		twLegsTag = new AspectList().add(WARDEN, 16).add(Aspect.MAGIC, 16).add(Aspect.ARMOR, 16);
		twBootsTag = new AspectList().add(WARDEN, 16).add(Aspect.MAGIC, 16).add(Aspect.ARMOR, 16);
		twCrossTag = new AspectList().add(WARDEN, 16).add(Aspect.MAGIC, 16).add(Aspect.WEAPON, 16);
		twQuartzTag = new AspectList().add(WARDEN, 16).add(Aspect.MAGIC, 16).add(Aspect.CRYSTAL, 16);
		twFabricTag = new AspectList().add(WARDEN, 16).add(Aspect.MAGIC, 16).add(Aspect.CLOTH, 16);
		twFrameTag = new AspectList().add(WARDEN, 16).add(Aspect.MAGIC, 16).add(Aspect.VOID, 16);
		twShardTag = new AspectList().add(WARDEN, 16).add(Aspect.MAGIC, 16).add(Aspect.CRYSTAL, 16).add(Aspect.ENTROPY, 16);
		twStoneTag = new AspectList().add(WARDEN, 16).add(Aspect.MAGIC, 16).add(Aspect.CRYSTAL, 16).add(Aspect.ORDER, 16);
		twSigilTag = new AspectList().add(WARDEN, 16).add(Aspect.MAGIC, 16);
		twAmuletTag = new AspectList().add(WARDEN, 16).add(Aspect.MAGIC, 16).add(Aspect.EXCHANGE, 16);
		
		ThaumcraftApi.registerObjectTag(new ItemStack(TWBlocks.twFlower), twFlowerTag);
		ThaumcraftApi.registerObjectTag(new ItemStack(TWItems.twHelm), twHelmTag);
		ThaumcraftApi.registerObjectTag(new ItemStack(TWItems.twChest), twChestTag);
		ThaumcraftApi.registerObjectTag(new ItemStack(TWItems.twLegs), twLegsTag);
		ThaumcraftApi.registerObjectTag(new ItemStack(TWItems.twBoots), twBootsTag);
		ThaumcraftApi.registerObjectTag(new ItemStack(TWItems.twCross), twCrossTag);
		ThaumcraftApi.registerObjectTag(new ItemStack(TWItems.twResource, 0, 0), twQuartzTag);
		ThaumcraftApi.registerObjectTag(new ItemStack(TWItems.twResource, 0, 1), twFabricTag);
		ThaumcraftApi.registerObjectTag(new ItemStack(TWItems.twResource, 0, 2), twFrameTag);
		ThaumcraftApi.registerObjectTag(new ItemStack(TWItems.twResource, 0, 3), twShardTag);
		ThaumcraftApi.registerObjectTag(new ItemStack(TWItems.twResource, 0, 4), twStoneTag);
		ThaumcraftApi.registerObjectTag(new ItemStack(TWItems.twSigil), twSigilTag);
		ThaumcraftApi.registerObjectTag(new ItemStack(TWItems.twAmulet), twAmuletTag);
		
	}
}

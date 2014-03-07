package matgm50.twarden.entities;

import thaumcraft.common.lib.world.ThaumcraftWorldGenerator;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;
import matgm50.twarden.TWarden;
import cpw.mods.fml.common.registry.EntityRegistry;

public class TWEntities {
	
	public static void Init() {
		
		EntityRegistry.registerModEntity(TWTaintedHunter.class, "TaintedHunter", 0, TWarden.Instance, 80, 3, true);
		
		EntityRegistry.addSpawn(TWTaintedHunter.class, 5, 1, 2, EnumCreatureType.monster, ThaumcraftWorldGenerator.biomeTaint);
		
	}
	
}

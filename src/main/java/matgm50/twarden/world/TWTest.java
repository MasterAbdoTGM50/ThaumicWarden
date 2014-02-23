package matgm50.twarden.world;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class TWTest extends WorldGenerator {
	
	protected int[] GetValidSpawnBlocks() {return new int[] { 0 };}

	public boolean LocationIsValidSpawn(World world, int i, int j, int k) {
		int distanceToAir = 0;
		int checkID = world.getBlockId(i, j, k);

		while (checkID != 0) {
			distanceToAir++;
			checkID = world.getBlockId(i, j + distanceToAir, k);
		}

		if (distanceToAir > 3) {
			return false;
		}
		j += distanceToAir - 1;

		int blockID = world.getBlockId(i, j, k);
		int blockIDAbove = world.getBlockId(i, j + 1, k);
		int blockIDBelow = world.getBlockId(i, j - 1, k);
		for (int x : GetValidSpawnBlocks()) {
			if (blockIDAbove != 0) {
				return false;
			}
			if (blockID == x) {
				return true;
			} else if (blockID == Block.snow.blockID && blockIDBelow == x) {
				return true;
			}
		}
		return false;
	}
	
	public boolean generate(World world, Random random, int i, int j, int k) {
		// check that each corner is one of the valid spawn blocks
		if (!LocationIsValidSpawn(world, i, j, k)
				|| !LocationIsValidSpawn(world, i + 2, j, k)
				|| !LocationIsValidSpawn(world, i + 2, j, k + 2)
				|| !LocationIsValidSpawn(world, i, j, k + 2)) {
			return false;
		}

		world.setBlock(i + 0, j + 0, k + 0, Block.stone.blockID);
		world.setBlock(i + 0, j + 0, k + 1, Block.stone.blockID);
		world.setBlock(i + 0, j + 0, k + 2, Block.stone.blockID);
		world.setBlock(i + 0, j + 1, k + 0, Block.stone.blockID);
		world.setBlock(i + 0, j + 1, k + 1, Block.stone.blockID);
		world.setBlock(i + 0, j + 1, k + 2, Block.stone.blockID);
		world.setBlock(i + 0, j + 2, k + 0, Block.stone.blockID);
		world.setBlock(i + 0, j + 2, k + 1, Block.stone.blockID);
		world.setBlock(i + 0, j + 2, k + 2, Block.stone.blockID);
		world.setBlock(i + 0, j + 3, k + 0, Block.stone.blockID);
		world.setBlock(i + 0, j + 3, k + 1, Block.stone.blockID);
		world.setBlock(i + 0, j + 3, k + 2, Block.stone.blockID);
		world.setBlock(i + 0, j + 4, k + 0, Block.stone.blockID);
		world.setBlock(i + 0, j + 4, k + 1, Block.stone.blockID);
		world.setBlock(i + 0, j + 4, k + 2, Block.stone.blockID);
		world.setBlock(i + 0, j + 5, k + 0, Block.stone.blockID);
		world.setBlock(i + 0, j + 5, k + 1, Block.stone.blockID);
		world.setBlock(i + 0, j + 5, k + 2, Block.stone.blockID);
		world.setBlock(i + 0, j + 6, k + 0, Block.stone.blockID);
		world.setBlock(i + 0, j + 6, k + 1, Block.stone.blockID);
		world.setBlock(i + 0, j + 6, k + 2, Block.stone.blockID);
		world.setBlock(i + 1, j + 0, k + 0, Block.stone.blockID);
		world.setBlock(i + 1, j + 0, k + 1, Block.stone.blockID);
		world.setBlock(i + 1, j + 0, k + 2, Block.stone.blockID);
		world.setBlock(i + 1, j + 1, k + 0, Block.stone.blockID);
		world.setBlock(i + 1, j + 1, k + 1, Block.stone.blockID);
		world.setBlock(i + 1, j + 1, k + 2, Block.stone.blockID);
		world.setBlock(i + 1, j + 2, k + 0, Block.stone.blockID);
		world.setBlock(i + 1, j + 2, k + 1, Block.stone.blockID);
		world.setBlock(i + 1, j + 2, k + 2, Block.stone.blockID);
		world.setBlock(i + 1, j + 3, k + 0, Block.stone.blockID);
		world.setBlock(i + 1, j + 3, k + 1, Block.stone.blockID);
		world.setBlock(i + 1, j + 3, k + 2, Block.stone.blockID);
		world.setBlock(i + 1, j + 4, k + 0, Block.stone.blockID);
		world.setBlock(i + 1, j + 4, k + 1, Block.stone.blockID);
		world.setBlock(i + 1, j + 4, k + 2, Block.stone.blockID);
		world.setBlock(i + 1, j + 5, k + 0, Block.stone.blockID);
		world.setBlock(i + 1, j + 5, k + 1, Block.stone.blockID);
		world.setBlock(i + 1, j + 5, k + 2, Block.stone.blockID);
		world.setBlock(i + 1, j + 6, k + 0, Block.stone.blockID);
		world.setBlock(i + 1, j + 6, k + 1, Block.stone.blockID);
		world.setBlock(i + 1, j + 6, k + 2, Block.stone.blockID);
		world.setBlock(i + 2, j + 0, k + 0, Block.stone.blockID);
		world.setBlock(i + 2, j + 0, k + 1, Block.stone.blockID);
		world.setBlock(i + 2, j + 0, k + 2, Block.stone.blockID);
		world.setBlock(i + 2, j + 1, k + 0, Block.stone.blockID);
		world.setBlock(i + 2, j + 1, k + 1, Block.stone.blockID);
		world.setBlock(i + 2, j + 1, k + 2, Block.stone.blockID);
		world.setBlock(i + 2, j + 2, k + 0, Block.stone.blockID);
		world.setBlock(i + 2, j + 2, k + 1, Block.stone.blockID);
		world.setBlock(i + 2, j + 2, k + 2, Block.stone.blockID);
		world.setBlock(i + 2, j + 3, k + 0, Block.stone.blockID);
		world.setBlock(i + 2, j + 3, k + 1, Block.stone.blockID);
		world.setBlock(i + 2, j + 3, k + 2, Block.stone.blockID);
		world.setBlock(i + 2, j + 4, k + 0, Block.stone.blockID);
		world.setBlock(i + 2, j + 4, k + 1, Block.stone.blockID);
		world.setBlock(i + 2, j + 4, k + 2, Block.stone.blockID);
		world.setBlock(i + 2, j + 5, k + 0, Block.stone.blockID);
		world.setBlock(i + 2, j + 5, k + 1, Block.stone.blockID);
		world.setBlock(i + 2, j + 5, k + 2, Block.stone.blockID);
		world.setBlock(i + 2, j + 6, k + 0, Block.stone.blockID);
		world.setBlock(i + 2, j + 6, k + 1, Block.stone.blockID);
		world.setBlock(i + 2, j + 6, k + 2, Block.stone.blockID);

		return true;
	}

}
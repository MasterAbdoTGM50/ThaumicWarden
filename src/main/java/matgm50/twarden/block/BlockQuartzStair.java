package matgm50.twarden.block;

import matgm50.twarden.TWarden;
import matgm50.twarden.lib.BlockLib;
import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;

/**
 * Created by MasterAbdoTGM50 on 5/22/2014.
 */

public class BlockQuartzStair extends BlockStairs {


    protected BlockQuartzStair() {

        super(ModBlocks.blockInfusedQuartzNormal, 0);
        setBlockName(BlockLib.QUARTZ_STAIR_NAME);
        setCreativeTab(TWarden.tabTWarden);
        setLightOpacity(0);

    }
}

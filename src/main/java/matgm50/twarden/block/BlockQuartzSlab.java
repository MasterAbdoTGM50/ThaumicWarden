package matgm50.twarden.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import matgm50.twarden.TWarden;
import matgm50.twarden.lib.BlockLib;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

import java.util.Random;

/**
 * Created by MasterAbdoTGM50 on 5/22/2014.
 */

public class BlockQuartzSlab extends BlockSlab{

    public BlockQuartzSlab() {

        super(false, Material.rock);
        setBlockName(BlockLib.QUARTZ_SLAB_NAME);
        setCreativeTab(TWarden.tabTWarden);
        setStepSound(Block.soundTypeStone);
        setHardness(0.8F);
        setLightOpacity(0);

    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int par1, int par2) {

        return ModBlocks.blockInfusedQuartzNormal.getBlockTextureFromSide(par1);

    }

    @Override
    public Item getItemDropped(int par1, Random par2, int par3) {
        return Item.getItemFromBlock(ModBlocks.blockInfusedQuartzSlab);
    }

    @Override
    public ItemStack createStackedBlock(int par1) {

        return new ItemStack(ModBlocks.blockInfusedQuartzSlab);

    }

    @Override
    public String func_150002_b(int var1) {

        return "tile." + BlockLib.QUARTZ_SLAB_NAME;

    }

}

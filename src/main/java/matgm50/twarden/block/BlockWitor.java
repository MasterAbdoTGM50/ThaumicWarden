package matgm50.twarden.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import matgm50.twarden.TWarden;
import matgm50.twarden.block.tile.TileWitor;
import matgm50.twarden.lib.BlockLib;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;
import thaumcraft.common.config.Config;

import java.util.Random;

/**
 * Created by MasterAbdoTGM50 on 9/2/2014.
 */

public class BlockWitor extends BlockContainer {

    protected BlockWitor() {

        super(Config.airyMaterial);
        setBlockName(BlockLib.BLOCK_WITOR_NAME);
        setStepSound(Block.soundTypeCloth);
        setCreativeTab(TWarden.tabTWarden);
        setBlockBounds(0.3F, 0.3F, 0.3F, 0.7F, 0.7F, 0.7F);

    }

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister register) {

        blockIcon = register.registerIcon("thaumcraft:blank");

    }

    @Override
    public int getRenderType() {return -1;}

    @Override
    public int getLightValue() {return 15;}

    public boolean renderAsNormalBlock() {return false;}

    public boolean isOpaqueCube() {return false;}

    public Item getItemDropped(int par1, Random par2Random, int par3) {return null;}

    @Override
    public AxisAlignedBB getCollisionBoundingBoxFromPool(World world, int x, int y, int z) {return null;}

    public boolean isSideSolid(IBlockAccess world, int x, int y, int z, ForgeDirection side){return false;}

    @Override
    public TileEntity createNewTileEntity(World world, int meta) {return new TileWitor();}

}

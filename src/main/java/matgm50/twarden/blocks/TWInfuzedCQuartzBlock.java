package matgm50.twarden.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import matgm50.twarden.TWarden;
import matgm50.twarden.config.TWBlockConfig;
import matgm50.twarden.config.TWModConfig;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

/**
 * Created by MasterAbdoTGM50 on 5/6/2014.
 */

public class TWInfuzedCQuartzBlock extends Block {

    public IIcon topIcon;
    public IIcon botIcon;
    public IIcon sideIcon;

    public TWInfuzedCQuartzBlock(Material material) {

        super(material);
        setBlockName(TWBlockConfig.TWCQUARTZ_UN_NAME);
        setCreativeTab(TWarden.twTab);
        setStepSound(Block.soundTypeStone);
        setHardness(0.8F);

    }

    @SideOnly(Side.CLIENT)
    @Override
    public void registerBlockIcons(IIconRegister register) {

        topIcon = register.registerIcon(TWModConfig.TWMOD_ID.toLowerCase() + ":" + "cinfusedquartztop" );
        botIcon = register.registerIcon(TWModConfig.TWMOD_ID.toLowerCase() + ":" + "cinfusedquartztop" );
        sideIcon = register.registerIcon(TWModConfig.TWMOD_ID.toLowerCase() + ":" + "cinfusedquartzside" );

    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta) {

        if(side == 0) {

            return botIcon;

        } else if(side == 1) {

            return topIcon;

        } else {

            return sideIcon;

        }

    }

}

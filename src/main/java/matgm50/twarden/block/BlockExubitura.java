package matgm50.twarden.block;

import matgm50.twarden.TWarden;
import matgm50.twarden.item.ModItems;
import matgm50.twarden.lib.BlockLib;
import matgm50.twarden.lib.ModLib;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

import java.util.Random;

/**
 * Created by MasterAbdoTGM50 on 5/22/2014.
 */

public class BlockExubitura extends BlockBush{

    protected BlockExubitura() {

        super(Material.plants);
        setBlockName(BlockLib.EXUBITURA_NAME);
        setCreativeTab(TWarden.tabTWarden);
        setStepSound(Block.soundTypeGrass);

    }

    @Override
    public Item getItemDropped(int par1, Random random, int par2) {

        return ModItems.itemResource;

    }

    @Override
    public int damageDropped(int par1) {

        return 0;

    }

    @Override
    public void registerBlockIcons(IIconRegister register) {

        blockIcon = register.registerIcon(ModLib.ID.toLowerCase() + ":" + "exubitura");

    }

}

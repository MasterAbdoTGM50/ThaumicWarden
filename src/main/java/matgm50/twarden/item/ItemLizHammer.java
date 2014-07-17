package matgm50.twarden.item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import matgm50.twarden.TWarden;
import matgm50.twarden.block.tile.TileLizTable;
import matgm50.twarden.lib.ItemLib;
import matgm50.twarden.lib.ModLib;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MovingObjectPosition;

/**
 * Created by MasterAbdoTGM50 on 7/16/2014.
 */

public class ItemLizHammer extends Item {

    public ItemLizHammer() {

        super();
        setUnlocalizedName(ItemLib.LIZ_HAMMER_NAME);
        setCreativeTab(TWarden.tabTWarden);
        setMaxStackSize(1);
        canRepair = false;

    }

    @Override
    public EnumRarity getRarity(ItemStack stack) {

        return EnumRarity.rare;

    }

    @Override
    public boolean onEntitySwing(EntityLivingBase player, ItemStack stack) {

        if(!player.worldObj.isRemote) {

            MovingObjectPosition target = getMovingObjectPositionFromPlayer(player.worldObj, (EntityPlayer) player, true);

            if(target != null && target.typeOfHit == MovingObjectPosition.MovingObjectType.BLOCK) {

                if(player.worldObj.getTileEntity(target.blockX, target.blockY, target.blockZ) != null
                        && player.worldObj.getTileEntity(target.blockX, target.blockY, target.blockZ) instanceof TileLizTable) {

                    TileLizTable table = (TileLizTable)player.worldObj.getTileEntity(target.blockX, target.blockY, target.blockZ);

                    table.Repair(0);

                }

            }

        }

        return super.onEntitySwing(player, stack);

    }

    @Override
    public boolean isItemTool(ItemStack stack) {

        return true;

    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister register) {

        itemIcon = register.registerIcon(ModLib.ID.toLowerCase() + ":" + "lizhammer");

    }

}

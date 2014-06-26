package matgm50.twarden.item;

import baubles.api.BaublesApi;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import matgm50.twarden.TWarden;
import matgm50.twarden.lib.ItemLib;
import matgm50.twarden.lib.ModLib;
import matgm50.twarden.util.DamageSourceWardenSword;
import matgm50.twarden.util.PurityHelper;
import matgm50.twarden.util.WardenHelper;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

import java.util.Random;

/**
 * Created by MasterAbdoTGM50 on 6/24/2014.
 */

public class ItemWardenSword extends Item {

    public ItemWardenSword() {

        super();
        setUnlocalizedName(ItemLib.WARDEN_SWORD_NAME);
        setCreativeTab(TWarden.tabTWarden);
        setMaxDamage(3000);
        setMaxStackSize(1);

        setFull3D();

    }

    @Override
    public boolean getShareTag() {return true;}

    @Override
    public EnumRarity getRarity(ItemStack par1ItemStack) {return EnumRarity.epic;}

    @Override
    public EnumAction getItemUseAction(ItemStack par1ItemStack) {return EnumAction.block;}

    @Override
    public int getMaxItemUseDuration(ItemStack par1ItemStack) {return 72000;}

    @Override
    public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer) {

        par3EntityPlayer.setItemInUse(par1ItemStack, this.getMaxItemUseDuration(par1ItemStack));

        return super.onItemRightClick(par1ItemStack, par2World, par3EntityPlayer);

    }

    @Override
    public boolean getIsRepairable(ItemStack par1ItemStack, ItemStack par2ItemStack) {return false;}

    @Override
    public boolean onLeftClickEntity(ItemStack stack, EntityPlayer player, Entity entity) {

        DamageSource damageSource = new DamageSourceWardenSword("warden", player);

        if(PurityHelper.isTainted(entity)) {

            entity.attackEntityFrom(damageSource, 10);

        } else {

            entity.attackEntityFrom(damageSource, 5);

        }

        stack.damageItem(1, player);

        return super.onLeftClickEntity(stack, player, entity);

    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister register) {

        itemIcon = register.registerIcon(ModLib.ID.toLowerCase() + ":" + "wardensword");

    }

    @Override
    public void onUpdate(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5) {

        if(par3Entity instanceof EntityPlayer) {

            WardenHelper.rollRepair(par2World, (EntityPlayer)par3Entity, par1ItemStack);

        }

    }

}

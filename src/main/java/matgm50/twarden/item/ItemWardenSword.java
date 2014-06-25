package matgm50.twarden.item;

import baubles.api.BaublesApi;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import matgm50.twarden.TWarden;
import matgm50.twarden.lib.ItemLib;
import matgm50.twarden.lib.ModLib;
import matgm50.twarden.util.DamageSourceWardenSword;
import matgm50.twarden.util.PurityHelper;
import matgm50.twarden.util.SwordEffectHelper;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;
import thaumcraft.common.entities.ITaintedMob;

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

    public ItemStack setEffect(ItemStack stack, String effect) {

        if(stack.stackTagCompound != null) {

            stack.stackTagCompound.setString("effect", effect);

        }

        return stack;

    }

    public String getEffect(ItemStack stack) {

        if(stack.stackTagCompound != null) {

            if(stack.stackTagCompound.hasKey("effect")) {

                return stack.stackTagCompound.getString("effect");

            }

        }

        return "WARDEN";

    }

    public int getBonus(EntityPlayer player) {

        if(BaublesApi.getBaubles(player).getStackInSlot(0) != null) {

            return BaublesApi.getBaubles(player).getStackInSlot(0).getItemDamage() + 1;

        }

        return 1;

    }

    @Override
    public boolean onLeftClickEntity(ItemStack stack, EntityPlayer player, Entity entity) {

        DamageSource damageSource = new DamageSourceWardenSword("warden", player);

        if(entity instanceof ITaintedMob) {

            System.out.print("I am tainted");
            entity.attackEntityFrom(damageSource, 40);

        } else {

            entity.attackEntityFrom(damageSource, 5);

        }

        SwordEffectHelper.doEffect(getEffect(stack), getBonus(player), stack, player, entity);

        stack.damageItem(1, player);

        return super.onLeftClickEntity(stack, player, entity);

    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister register) {

        itemIcon = register.registerIcon(ModLib.ID.toLowerCase() + ":" + "wardensword");

    }

}

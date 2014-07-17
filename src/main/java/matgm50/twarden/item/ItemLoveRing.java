package matgm50.twarden.item;

import baubles.api.BaubleType;
import baubles.api.IBauble;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import matgm50.twarden.TWarden;
import matgm50.twarden.lib.ItemLib;
import matgm50.twarden.lib.ModLib;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/**
 * Created by MasterAbdoTGM50 on 6/26/2014.
 */

public class ItemLoveRing extends Item implements IBauble {

    public ItemLoveRing() {

        super();
        setUnlocalizedName(ItemLib.LOVE_RING_NAME);
        setCreativeTab(TWarden.tabTWarden);

    }

    @Override
    public EnumRarity getRarity(ItemStack par1ItemStack) {return EnumRarity.epic;}

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister register) {

        itemIcon = register.registerIcon(ModLib.ID.toLowerCase() + ":" + "lovering");

    }

    @Override
    public BaubleType getBaubleType(ItemStack itemStack) {return BaubleType.RING;}

    @Override
    public void onWornTick(ItemStack itemStack, EntityLivingBase entityLivingBase) {}

    @Override
    public void onEquipped(ItemStack itemStack, EntityLivingBase entityLivingBase) {}

    @Override
    public void onUnequipped(ItemStack itemStack, EntityLivingBase entityLivingBase) {}

    @Override
    public boolean canEquip(ItemStack itemStack, EntityLivingBase entityLivingBase) {return true;}

    @Override
    public boolean canUnequip(ItemStack itemStack, EntityLivingBase entityLivingBase) {return false;}

}

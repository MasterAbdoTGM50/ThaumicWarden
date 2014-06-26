package matgm50.twarden.item;

import baubles.api.BaublesApi;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import matgm50.twarden.TWarden;
import matgm50.twarden.lib.ItemLib;
import matgm50.twarden.lib.ModLib;
import matgm50.twarden.util.WardenHelper;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.Random;

/**
 * Created by MasterAbdoTGM50 on 6/26/2014.
 */

public class ItemWardenBoots extends ItemArmor {

    public ItemWardenBoots() {

        super(ModItems.materialWarden, 3, 3);
        setUnlocalizedName(ItemLib.WARDEN_BOOTS_NAME);
        setCreativeTab(TWarden.tabTWarden);
        setMaxDamage(3000);
        setMaxStackSize(1);

    }

    @Override
    public EnumRarity getRarity(ItemStack par1ItemStack) {return EnumRarity.epic;}

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister register) {

        itemIcon = register.registerIcon(ModLib.ID.toLowerCase() + ":" + "wardenboots");

    }

    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {

        return "twarden:textures/models/warden_1.png";

    }

    @Override
    public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {

        WardenHelper.rollRepair(world, player, itemStack);

    }

}

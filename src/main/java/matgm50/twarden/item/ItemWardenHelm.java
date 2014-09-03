package matgm50.twarden.item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import matgm50.twarden.TWarden;
import matgm50.twarden.lib.ItemLib;
import matgm50.twarden.lib.ModLib;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import thaumcraft.api.IGoggles;
import thaumcraft.api.nodes.IRevealer;

/**
 * Created by MasterAbdoTGM50 on 6/26/2014.
 */

public class ItemWardenHelm extends ItemWardenArmor implements IRevealer, IGoggles{

    public ItemWardenHelm() {

        super(0);
        setUnlocalizedName(ItemLib.WARDEN_HELM_NAME);

    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister register) {

        itemIcon = register.registerIcon(ModLib.ID.toLowerCase() + ":" + "wardenhelm");

    }

    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {

        return "twarden:textures/models/warden_1.png";

    }

    @Override
    public boolean showIngamePopups(ItemStack stack, EntityLivingBase entityLivingBase) {return true;}

    @Override
    public boolean showNodes(ItemStack stack, EntityLivingBase entityLivingBase) {return true;}

}

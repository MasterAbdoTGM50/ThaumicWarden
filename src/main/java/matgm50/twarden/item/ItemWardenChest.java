package matgm50.twarden.item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import matgm50.twarden.TWarden;
import matgm50.twarden.lib.ItemLib;
import matgm50.twarden.lib.ModLib;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;

/**
 * Created by MasterAbdoTGM50 on 6/26/2014.
 */

public class ItemWardenChest extends ItemWardenArmor {

    public ItemWardenChest() {

        super(1);
        setUnlocalizedName(ItemLib.WARDEN_CHEST_NAME);
        setCreativeTab(TWarden.tabTWarden);

    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister register) {

        itemIcon = register.registerIcon(ModLib.ID.toLowerCase() + ":" + "wardenchest");

    }

    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {

        return "twarden:textures/models/warden_1.png";

    }

}

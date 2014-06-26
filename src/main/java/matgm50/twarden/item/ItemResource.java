package matgm50.twarden.item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import matgm50.twarden.TWarden;
import matgm50.twarden.lib.ItemLib;
import matgm50.twarden.lib.ModLib;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

import java.util.List;

/**
 * Created by MasterAbdoTGM50 on 5/13/2014.
 */

public class ItemResource extends Item {

    private IIcon[] icons;

    public ItemResource() {

        super();
        setUnlocalizedName(ItemLib.RESOURCE_NAME);
        setCreativeTab(TWarden.tabTWarden);
        setHasSubtypes(true);

        icons = new IIcon[ItemLib.RESOURCE_NAME.length()];

    }

    @Override
    public String getUnlocalizedName(ItemStack par1ItemStack) {

        return super.getUnlocalizedName() + "." + par1ItemStack.getItemDamage();

    }

    @Override
    public void getSubItems(Item par1Item, CreativeTabs par2Tab, List par3List) {

        for(int i = 0; i < ItemLib.RESOURCE_ICON.length; i++) {

            par3List.add(new ItemStack(par1Item, 1, i));

        }

    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIconFromDamage(int damage) {

        return icons[damage];

    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister register) {

        for(int i = 0; i < ItemLib.RESOURCE_ICON.length; i++) {

            icons[i] = register.registerIcon(ModLib.ID.toLowerCase() + ":" + ItemLib.RESOURCE_ICON[i]);

        }

    }

}

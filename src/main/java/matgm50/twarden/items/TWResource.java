package matgm50.twarden.items;

import java.util.List;

import javax.swing.Icon;

import matgm50.twarden.TWarden;
import matgm50.twarden.config.TWItemConfig;
import matgm50.twarden.config.TWModConfig;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TWResource extends Item {

	public TWResource() {
		
		super();
		setUnlocalizedName(TWItemConfig.TWRESOURCE_UN_NAME);
		setCreativeTab(TWarden.TWTab);
		setHasSubtypes(true);
		
	}
	
	@Override
	public String getUnlocalizedName(ItemStack Itemstack) {
		
		return super.getUnlocalizedName() + "." + Itemstack.getItemDamage();
		
	}
	
	@Override
    public EnumRarity getRarity(ItemStack Itemstack) {
		
		return EnumRarity.uncommon;
		
    }
	
	@Override
	public void getSubItems(Item Item, CreativeTabs Tab, List List) {
		
		for(int D = 0; D < TWItemConfig.TWRESOURCE_ICONNAME.length; D++) {
			
			List.add(new ItemStack(Item, 1, D));
			
		}
		
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIconFromDamage(int Damage) {
		
		return TWItemConfig.TWRESOURCE_ICON[Damage];
	
	}
	
	@Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister Register) {
		
		TWItemConfig.TWRESOURCE_ICON = new IIcon[TWItemConfig.TWRESOURCE_ICONNAME.length];
		
		for(int D = 0; D < TWItemConfig.TWRESOURCE_ICON.length; D++) {
			
			TWItemConfig.TWRESOURCE_ICON[D] = Register.registerIcon(TWModConfig.TWMOD_ID.toLowerCase() + ":" + TWItemConfig.TWRESOURCE_ICONNAME[D] );
			
		}
		
    }
	
}

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
		setCreativeTab(TWarden.twTab);
		setHasSubtypes(true);
		
	}
	
	@Override
	public String getUnlocalizedName(ItemStack stack) {
		
		return super.getUnlocalizedName() + "." + stack.getItemDamage();
		
	}
	
	@Override
    public EnumRarity getRarity(ItemStack stack) {
		
		return EnumRarity.uncommon;
		
    }
	
	@Override
	public void getSubItems(Item item, CreativeTabs tab, List list) {
		
		for(int D = 0; D < TWItemConfig.TWRESOURCE_ICONNAME.length; D++) {
			
			list.add(new ItemStack(item, 1, D));
			
		}
		
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIconFromDamage(int damage) {
		
		return TWItemConfig.TWRESOURCE_ICON[damage];
	
	}
	
	@Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister register) {
		
		TWItemConfig.TWRESOURCE_ICON = new IIcon[TWItemConfig.TWRESOURCE_ICONNAME.length];
		
		for(int D = 0; D < TWItemConfig.TWRESOURCE_ICON.length; D++) {
			
			TWItemConfig.TWRESOURCE_ICON[D] = register.registerIcon(TWModConfig.TWMOD_ID.toLowerCase() + ":" + TWItemConfig.TWRESOURCE_ICONNAME[D] );
			
		}
		
    }
	
}

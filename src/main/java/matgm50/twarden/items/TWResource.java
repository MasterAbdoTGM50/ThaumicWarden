package matgm50.twarden.items;

import java.util.List;

import matgm50.twarden.TWarden;
import matgm50.twarden.config.TWItemConfig;
import matgm50.twarden.config.TWModConfig;
import matgm50.twarden.util.TWTab;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TWResource extends Item {

	public TWResource(int ID) {
		
		super(ID);
		setUnlocalizedName(TWItemConfig.TWRESOURCE_UN_NAME);
		setCreativeTab(TWarden.TWTab);
		setHasSubtypes(true);
		setMaxDamage(0);
		
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
	public void getSubItems(int ID, CreativeTabs Tab, List List) {
		
		for(int D = 0; D < TWItemConfig.TWRESOURCE_ICONNAME.length; D++) {
			
			ItemStack Itemstack = new ItemStack(ID, 1, D);
			List.add(Itemstack);
			
			}
		
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public Icon getIconFromDamage(int Damage) {
		
		return TWItemConfig.TWRESOURCE_ICON[Damage];
	
	}
	
	@Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister Register) {
		
		TWItemConfig.TWRESOURCE_ICON = new Icon[TWItemConfig.TWRESOURCE_ICONNAME.length];
		
		for(int D = 0; D < TWItemConfig.TWRESOURCE_ICON.length; D++) {
			
			TWItemConfig.TWRESOURCE_ICON[D] = Register.registerIcon(TWModConfig.TWMOD_ID.toLowerCase() + ":" + TWItemConfig.TWRESOURCE_ICONNAME[D] );
			
		}
		
    }
	
}

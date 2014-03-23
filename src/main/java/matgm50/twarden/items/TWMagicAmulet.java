package matgm50.twarden.items;

import java.util.List;

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

public class TWMagicAmulet extends Item {
	
	public IIcon[] Icon = new IIcon[2];
	
	public TWMagicAmulet() {
		
		super();
		setUnlocalizedName(TWItemConfig.TWMAGICAMULET_UN_NAME);
		setCreativeTab(TWarden.TWTab);
		setMaxStackSize(1);
		setHasSubtypes(true);
		
	}
	
	@Override
	public String getUnlocalizedName(ItemStack Itemstack) {
		
		return super.getUnlocalizedName() + "." + Itemstack.getItemDamage();
		
	}
	
	@Override
    public EnumRarity getRarity(ItemStack Itemstack) {
		
            return EnumRarity.rare;
            
    }
	
	@Override
	public void getSubItems(Item Item, CreativeTabs Tab, List List) {
		
		List.add(new ItemStack(Item, 1, 0));
		List.add(new ItemStack(Item, 1, 1));
		
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIconFromDamage(int Damage) {
		
		return Icon[Damage];
	
	}
	
	@Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister Register) {
		
            Icon[0] = Register.registerIcon(TWModConfig.TWMOD_ID.toLowerCase() + ":" + "wardenamuletl" );
            Icon[1] = Register.registerIcon(TWModConfig.TWMOD_ID.toLowerCase() + ":" + "wardenamulets" );
            
    }
	
}

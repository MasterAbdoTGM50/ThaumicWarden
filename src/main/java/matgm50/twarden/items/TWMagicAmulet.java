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
	
	public IIcon[] icon = new IIcon[2];
	
	public TWMagicAmulet() {
		
		super();
		setUnlocalizedName(TWItemConfig.TWMAGICAMULET_UN_NAME);
		setCreativeTab(TWarden.twTab);
		setMaxStackSize(1);
		setHasSubtypes(true);
		
	}
	
	@Override
	public String getUnlocalizedName(ItemStack stack) {
		
		return super.getUnlocalizedName() + "." + stack.getItemDamage();
		
	}
	
	@Override
    public EnumRarity getRarity(ItemStack stack) {
		
            return EnumRarity.rare;
            
    }
	
	@Override
	public void getSubItems(Item item, CreativeTabs tab, List list) {
		
		list.add(new ItemStack(item, 1, 0));
		list.add(new ItemStack(item, 1, 1));
		
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIconFromDamage(int damage) {
		
		return icon[damage];
	
	}
	
	@Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister Register) {
		
            icon[0] = Register.registerIcon(TWModConfig.TWMOD_ID.toLowerCase() + ":" + "wardenamuletl" );
            icon[1] = Register.registerIcon(TWModConfig.TWMOD_ID.toLowerCase() + ":" + "wardenamulets" );
            
    }
	
}

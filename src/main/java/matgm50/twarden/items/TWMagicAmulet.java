package matgm50.twarden.items;

import java.util.List;

import matgm50.twarden.TWarden;
import matgm50.twarden.config.TWItemConfig;
import matgm50.twarden.config.TWModConfig;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import thaumcraft.common.config.Config;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TWMagicAmulet extends Item {
	
	public Icon[] Icon = new Icon[2];
	
	public TWMagicAmulet(int ID) {
		
		super(ID);
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
	public void getSubItems(int ID, CreativeTabs Tab, List List) {
		
		List.add(new ItemStack(ID, 1, 0));
		List.add(new ItemStack(ID, 1, 1));
		
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public Icon getIconFromDamage(int Damage) {
		
		return Icon[Damage];
	
	}
	
	@Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister Register) {
		
            Icon[0] = Register.registerIcon(TWModConfig.TWMOD_ID.toLowerCase() + ":" + "wardenamuletl" );
            Icon[1] = Register.registerIcon(TWModConfig.TWMOD_ID.toLowerCase() + ":" + "wardenamulets" );
            
    }
	
}

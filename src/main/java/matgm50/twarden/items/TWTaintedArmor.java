package matgm50.twarden.items;

import matgm50.twarden.TWarden;
import matgm50.twarden.config.TWModConfig;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TWTaintedArmor extends ItemArmor {

	public IIcon Helm;
	public IIcon Chest;
	public IIcon Legs;
	public IIcon Boots;

	public TWTaintedArmor(ArmorMaterial Material, int Type) {

		super(Material, 3, Type);
		setCreativeTab(TWarden.TWTab);
		setMaxDamage(500);
		
	}
	
	@Override
    public EnumRarity getRarity(ItemStack Armor) {
		
            return EnumRarity.uncommon;
            
    }
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister Register) {

		Helm = Register.registerIcon(TWModConfig.TWMOD_ID.toLowerCase() + ":" + "taintedhelm");
		Chest = Register.registerIcon(TWModConfig.TWMOD_ID.toLowerCase() + ":" + "taintedchest");
		Legs = Register.registerIcon(TWModConfig.TWMOD_ID.toLowerCase() + ":" + "taintedlegs");
		Boots = Register.registerIcon(TWModConfig.TWMOD_ID.toLowerCase() + ":" + "taintedboots");

	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIconFromDamage(int Damage) {
		
		return this.armorType == 2 ? Legs : armorType == 1 ? Chest : armorType == 0 ? Helm : Boots;
		
	}
	
	@Override
    @SideOnly(Side.CLIENT)
	public String getArmorTexture(ItemStack Stack, Entity Entity, int Slot, String Type)
    {
		if ((Stack.getItem() == TWItems.TWTaintedLegs)) {
			
			return "twarden:textures/armors/tainted_2.png";
			
		} else {
			
			return "twarden:textures/armors/tainted_1.png";
			
		}
        
    }

}

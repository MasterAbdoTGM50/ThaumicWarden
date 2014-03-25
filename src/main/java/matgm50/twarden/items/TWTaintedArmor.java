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

	public TWTaintedArmor(ArmorMaterial material, int type) {

		super(material, 3, type);
		setCreativeTab(TWarden.twTab);
		setMaxDamage(500);
		
	}
	
	@Override
    public EnumRarity getRarity(ItemStack stack) {
		
            return EnumRarity.uncommon;
            
    }
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister register) {

		Helm = register.registerIcon(TWModConfig.TWMOD_ID.toLowerCase() + ":" + "taintedhelm");
		Chest = register.registerIcon(TWModConfig.TWMOD_ID.toLowerCase() + ":" + "taintedchest");
		Legs = register.registerIcon(TWModConfig.TWMOD_ID.toLowerCase() + ":" + "taintedlegs");
		Boots = register.registerIcon(TWModConfig.TWMOD_ID.toLowerCase() + ":" + "taintedboots");

	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIconFromDamage(int damage) {
		
		return this.armorType == 2 ? Legs : armorType == 1 ? Chest : armorType == 0 ? Helm : Boots;
		
	}
	
	@Override
    @SideOnly(Side.CLIENT)
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {
		if ((stack.getItem() == TWItems.twTaintedLegs)) {
			
			return "twarden:textures/armors/tainted_2.png";
			
		} else {
			
			return "twarden:textures/armors/tainted_1.png";
			
		}
        
    }

}

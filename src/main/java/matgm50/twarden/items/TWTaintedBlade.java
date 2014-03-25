package matgm50.twarden.items;

import matgm50.twarden.TWarden;
import matgm50.twarden.config.TWItemConfig;
import matgm50.twarden.config.TWModConfig;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TWTaintedBlade extends ItemSword {

	public TWTaintedBlade(ToolMaterial material) {

		super(material);
		setUnlocalizedName(TWItemConfig.TWTAINTEDBLADE_UN_NAME);
		setCreativeTab(TWarden.twTab);

	}

	@Override
	public EnumRarity getRarity(ItemStack stack) {

		return EnumRarity.uncommon;

	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister register) {

		itemIcon = register.registerIcon(TWModConfig.TWMOD_ID.toLowerCase() + ":" + "taintedblade");

	}

}
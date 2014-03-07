package matgm50.twarden.items;

import matgm50.twarden.TWarden;
import matgm50.twarden.config.TWItemConfig;
import matgm50.twarden.config.TWModConfig;
import matgm50.twarden.util.TWTab;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TWTaintedBlade extends ItemSword {

	public TWTaintedBlade(int ID, EnumToolMaterial Material) {

		super(ID, Material);
		setUnlocalizedName(TWItemConfig.TWTAINTEDBLADE_UN_NAME);
		setCreativeTab(TWarden.TWTab);

	}

	@Override
	public EnumRarity getRarity(ItemStack Sword) {

		return EnumRarity.uncommon;

	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister Register) {

		itemIcon = Register.registerIcon(TWModConfig.TWMOD_ID.toLowerCase() + ":" + "taintedblade");

	}

}
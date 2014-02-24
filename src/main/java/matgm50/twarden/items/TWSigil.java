package matgm50.twarden.items;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Random;

import matgm50.twarden.TWarden;
import matgm50.twarden.config.TWItemConfig;
import matgm50.twarden.config.TWModConfig;
import matgm50.twarden.misc.TWTab;
import matgm50.twarden.world.schematic.TWScheLoader;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TWSigil extends Item {

	public TWSigil(int ID) {

		super(ID);
		setUnlocalizedName(TWItemConfig.TWSIGIL_UN_NAME);
		setCreativeTab(TWarden.TWTab);

	}

	@Override
	public EnumRarity getRarity(ItemStack Sword) {

		return EnumRarity.rare;

	}

	@Override
	public ItemStack onItemRightClick(ItemStack Itemstack, World World, EntityPlayer Player) {

		if (!World.isRemote) {

			ClassLoader Loader = getClass().getClassLoader();

			InputStream Sche = Loader.getResourceAsStream("assets/twarden/schematics/big.schematic");

			Random Rand = null;

			try {

				Player.addChatMessage(Sche.toString());

				TWScheLoader Test = new TWScheLoader(Sche);

				Test.generate(World, Rand, (int) Player.posX,
						(int) Player.posY + 5, (int) Player.posZ);

			} catch (IOException e) {e.printStackTrace();}
			
		}
		
		return Itemstack;

	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister Register) {

		itemIcon = Register.registerIcon(TWModConfig.TWMOD_ID.toLowerCase()
				+ ":" + "wardensigil");

	}

}
package matgm50.twarden.blocks;

import java.util.List;
import java.util.Random;

import matgm50.twarden.TWarden;
import matgm50.twarden.config.TWBlockConfig;
import matgm50.twarden.config.TWModConfig;
import matgm50.twarden.items.TWItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFlower;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TWFlower extends BlockFlower {

	public TWFlower() {
		
		super(0);
		setBlockName(TWBlockConfig.TWFLOWER_UN_NAME);
		setCreativeTab(TWarden.TWTab);
		setStepSound(Block.soundTypeGrass);
		
	}
	
	@Override
	public Item getItemDropped(int Par1, Random Random, int Par2) {
		
		return TWItems.TWResource;
		
	}
	
	@Override
	public int damageDropped(int par1) {
		
		return 3;
		
	}
	
	@Override
	public void getSubBlocks(Item Item, CreativeTabs Tab, List List) {
		
		List.add(new ItemStack(Item));
		
	}
	
	@SideOnly(Side.CLIENT)
    @Override
    public void registerBlockIcons(IIconRegister Register) {
		
		blockIcon = Register.registerIcon(TWModConfig.TWMOD_ID.toLowerCase() + ":" + "wardenflower" );
		
	}
	
}

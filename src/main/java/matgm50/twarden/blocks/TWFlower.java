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
import net.minecraft.util.IIcon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TWFlower extends BlockFlower {

	public TWFlower() {
		
		super(0);
		setBlockName(TWBlockConfig.TWFLOWER_UN_NAME);
		setCreativeTab(TWarden.twTab);
		setStepSound(Block.soundTypeGrass);
		
	}
	
	@Override
	public Item getItemDropped(int par1, Random random, int par2) {
		
		return TWItems.twResource;
		
	}
	
	@Override
	public int damageDropped(int par1) {
		
		return 3;
		
	}
	
	@SideOnly(Side.CLIENT)
	@Override
    public IIcon getIcon(int par1, int par2) {
		
		return blockIcon;
		
	}
	
	@Override
	public void getSubBlocks(Item item, CreativeTabs tab, List list) {
		
		list.add(new ItemStack(item));
		
	}
	
	@SideOnly(Side.CLIENT)
    @Override
    public void registerBlockIcons(IIconRegister register) {
		
		blockIcon = register.registerIcon(TWModConfig.TWMOD_ID.toLowerCase() + ":" + "wardenflower" );
		
	}
	
}

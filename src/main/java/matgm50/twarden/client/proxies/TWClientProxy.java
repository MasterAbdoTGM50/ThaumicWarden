package matgm50.twarden.client.proxies;

import matgm50.twarden.blocks.tiles.TWLizTableTile;
import matgm50.twarden.client.renderers.TWLizTableRender;
import matgm50.twarden.util.TWTick;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.FMLCommonHandler;

public class TWClientProxy extends TWCommonProxy {
	
	@Override
	public void initRenderer() {
		
		ClientRegistry.bindTileEntitySpecialRenderer(TWLizTableTile.class, new TWLizTableRender());
		
	}
	
	@Override
	public void initTick() {
		
		FMLCommonHandler.instance().bus().register(new TWTick());
		
	}

}

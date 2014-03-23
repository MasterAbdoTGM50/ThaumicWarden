package matgm50.twarden.network.proxy;

import matgm50.twarden.blocks.tiles.TWLizTableTile;
import matgm50.twarden.client.renderers.TWLizTableRender;
import matgm50.twarden.util.TWTick;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.FMLCommonHandler;

public class TWClientProxy extends TWCommonProxy {
	
	@Override
	public void InitRenderer() {
		
		ClientRegistry.bindTileEntitySpecialRenderer(TWLizTableTile.class, new TWLizTableRender());
		
	}
	
	@Override
	public void InitTick() {
		
		FMLCommonHandler.instance().bus().register(new TWTick());
		
	}

}

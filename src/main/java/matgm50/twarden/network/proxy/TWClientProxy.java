package matgm50.twarden.network.proxy;

import matgm50.twarden.util.TWTick;
import cpw.mods.fml.common.registry.TickRegistry;
import cpw.mods.fml.relauncher.Side;

public class TWClientProxy extends TWCommonProxy {
	
	@Override
	public void InitRenderer() {
		
	}
	
	@Override
	public void InitTick() {
		
		TickRegistry.registerTickHandler(new TWTick(), Side.CLIENT);
		
	}

}

package matgm50.twarden.network.proxy;

import matgm50.twarden.util.TWTick;
import cpw.mods.fml.common.registry.TickRegistry;
import cpw.mods.fml.relauncher.Side;

public class TWCommonProxy {
	
	public void InitRenderer() {
		
	}
	
	public void InitTick() {
		
		TickRegistry.registerTickHandler(new TWTick(), Side.SERVER);
		
	}
	
}

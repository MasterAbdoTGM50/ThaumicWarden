package matgm50.twarden.network.proxy;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import matgm50.twarden.config.TWModConfig;
import matgm50.twarden.entities.TWTaintedHunter;
import matgm50.twarden.util.TWTick;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.TickRegistry;
import cpw.mods.fml.relauncher.Side;

public class TWClientProxy extends TWCommonProxy {
	
	public void InitRenderer() {
		
			RenderingRegistry.registerEntityRenderingHandler(TWTaintedHunter.class, new RenderBiped(new ModelBiped(), 0.5F) {
			
			protected ResourceLocation getEntityTexture(Entity Entity) {
				
				return new ResourceLocation(TWModConfig.TWMOD_ID.toLowerCase(), "textures/models/taintedmob.png");
				
			}
			
		});
		
	}
	
	public void InitTick() {
		
		TickRegistry.registerTickHandler(new TWTick(), Side.SERVER);
		
	}

}

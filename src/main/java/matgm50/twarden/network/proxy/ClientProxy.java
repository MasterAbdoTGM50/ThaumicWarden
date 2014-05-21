package matgm50.twarden.network.proxy;

import cpw.mods.fml.client.registry.RenderingRegistry;
import matgm50.twarden.entity.EntityPurity;
import matgm50.twarden.network.client.renderer.RendererPurity;

/**
 * Created by MasterAbdoTGM50 on 5/11/2014.
 */

public class ClientProxy extends CommonProxy {

    @Override
    public void initRenderers() {

        RenderingRegistry.registerEntityRenderingHandler(EntityPurity.class, new RendererPurity());

    }

}

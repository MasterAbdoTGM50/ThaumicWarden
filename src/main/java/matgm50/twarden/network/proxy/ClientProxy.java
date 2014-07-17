package matgm50.twarden.network.proxy;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import matgm50.twarden.block.tile.TileLizTable;
import matgm50.twarden.entity.EntityPurity;
import matgm50.twarden.network.client.renderer.RenderLizTable;
import matgm50.twarden.network.client.renderer.RendererPurity;

/**
 * Created by MasterAbdoTGM50 on 5/11/2014.
 */

public class ClientProxy extends CommonProxy {

    @Override
    public void initRenderers() {

        RenderingRegistry.registerEntityRenderingHandler(EntityPurity.class, new RendererPurity());
        ClientRegistry.bindTileEntitySpecialRenderer(TileLizTable.class, new RenderLizTable());

    }

}

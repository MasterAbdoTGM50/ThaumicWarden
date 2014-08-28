package matgm50.twarden.client.renderer;

import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

/**
 * Created by MasterAbdoTGM50 on 5/20/2014.
 */

public class RendererPurity extends Render {

    public RendererPurity() {

        this.shadowSize = 0.1F;

    }

    public void renderEntityAt(Entity entity, double x, double y, double z, float freq, float pTicks) {}

    @Override
    public void doRender(Entity entity, double d, double d1, double d2, float f, float f1) {

        renderEntityAt(entity, d, d1, d2, f, f1);

    }

    @Override
    protected ResourceLocation getEntityTexture(Entity entity) {

        return AbstractClientPlayer.locationStevePng;

    }
}

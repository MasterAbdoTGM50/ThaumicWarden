package matgm50.twarden.client.renderers;

import org.lwjgl.opengl.GL11;

import matgm50.twarden.blocks.tiles.TWLizTableTile;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemRenderer;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;

public class TWLizTableRender extends TileEntitySpecialRenderer {

	@Override
	public void renderTileEntityAt(TileEntity tile, double x, double y, double z, float partialTick) {

		TWLizTableTile table = (TWLizTableTile)tile;
		ItemStack toRender = table.getStackInSlot(0);
		
		if(toRender != null) {
			
			GL11.glPushMatrix();
			GL11.glTranslated(x + 0.5, y + 0.8, z + 0.25);
			GL11.glScalef(1.0F, 1.0F, 1.0F);
			GL11.glRotated(90, 90, 0, 0);
				
			EntityItem renderity = new EntityItem(table.getWorldObj(), 0, 0, 0, toRender);
			renderity.hoverStart = 0;
			
			RenderManager rm = RenderManager.instance;
			
			rm.renderEntityWithPosYaw(renderity, 0, 0, 0, 0, 0);
			
			GL11.glPopMatrix();
			
		}
		
	}

}
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
	public void renderTileEntityAt(TileEntity Tile, double X, double Y, double Z, float PartialTick) {

		TWLizTableTile Table = (TWLizTableTile) Tile;
		
		if(Table.getStackInSlot(0) != null) {
			
			GL11.glPushMatrix();
			GL11.glTranslated(X + 0.5, Y + 0.8, Z + 0.25);
			GL11.glScalef(1.0F, 1.0F, 1.0F);
			GL11.glRotated(90, 90, 0, 0);
			
			ItemStack ToRender = Table.getStackInSlot(0);
				
			EntityItem Renderity= new EntityItem(Tile.getWorldObj(), 0, 0, 0, ToRender);
			Renderity.age = 0;
			Renderity.hoverStart = 0;
			
			RenderManager Heck = RenderManager.instance;
			
			Heck.renderEntityWithPosYaw(Renderity, 0, 0, 0, 0, 0);
			
			GL11.glPopMatrix();
			
		}
			
	}

}
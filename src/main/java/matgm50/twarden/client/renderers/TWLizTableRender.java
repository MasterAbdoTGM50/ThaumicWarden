package matgm50.twarden.client.renderers;

import org.lwjgl.opengl.GL11;

import matgm50.twarden.blocks.tiles.TWLizTableTile;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemRenderer;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Icon;

public class TWLizTableRender extends TileEntitySpecialRenderer {

	@Override
	public void renderTileEntityAt(TileEntity Tile, double X, double Y, double Z, float PartialTick) {
		
		TWLizTableTile Table = (TWLizTableTile)Tile;
		
		ItemStack ToRender = Table.getStackInSlot(0);
		
		GL11.glPushMatrix();
		
		GL11.glTranslated(X, Y + 0.75, Z);
		
		if(ToRender != null) {
			
			GL11.glScalef(12, 12, 12);
				
			Icon WTF = ToRender.getItem().getIcon(ToRender, 0);
				
			if(WTF != null) {
					
				float S1 = WTF.getMinU();
				float S2 = WTF.getMaxU();
				float S3 = WTF.getMinV();
				float S4 = WTF.getMaxV();
					
				ItemRenderer.renderItemIn2D(Tessellator.instance, S1, S2, S3, S4, WTF.getIconWidth(), WTF.getIconHeight(), 1F / 16F);
				
			}
			
		}
		
		GL11.glPopMatrix();
		
	}

}

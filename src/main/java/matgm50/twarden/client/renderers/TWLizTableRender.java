package matgm50.twarden.client.renderers;

import java.awt.Color;

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
			
			GL11.glPushMatrix();
			GL11.glRotatef(90F, 1F, 0F, 0F);
			final float Scale = 1F;
			GL11.glScalef(Scale, Scale, Scale);
			GL11.glTranslatef(0.6F, -0.2F, 0F);
			GL11.glRotatef(30F, 0F, 0F, 1F);
			
			Minecraft.getMinecraft().renderEngine.bindTexture(TextureMap.locationItemsTexture);
			
			int RP = 0;
			
			do {
				
				Icon WTF = ToRender.getItem().getIcon(ToRender, 0);
				
				if(WTF != null) {
					
					Color Hate = new Color(ToRender.getItem().getColorFromItemStack(ToRender, RP));
					GL11.glColor3ub((byte) Hate.getRed(), (byte) Hate.getGreen(), (byte) Hate.getBlue());
					
					float S1 = WTF.getMinU();
					float S2 = WTF.getMaxU();
					float S3 = WTF.getMinV();
					float S4 = WTF.getMaxV();
					
					ItemRenderer.renderItemIn2D(Tessellator.instance, S2, S3, S1, S4, WTF.getIconWidth(), WTF.getIconHeight(), 1F / 16F);
					GL11.glColor3f(1F, 1F, 1F);
					
				}
				
				RP++;
				
			} while(RP < ToRender.getItem().getRenderPasses(ToRender.getItemDamage()));
			
			GL11.glPopMatrix();
			
		}
		
		GL11.glPopMatrix();
		
	}

}

package matgm50.twarden.util;

import java.util.EnumSet;

import matgm50.twarden.config.TWModConfig;
import matgm50.twarden.items.TWItems;
import net.minecraft.entity.player.EntityPlayer;
import thaumcraft.common.config.Config;
import cpw.mods.fml.common.ITickHandler;
import cpw.mods.fml.common.TickType;

public class TWTick implements ITickHandler {

	@Override
	public void tickStart(EnumSet<TickType> Type, Object... TickData) {
		
		if (Type.equals(EnumSet.of(TickType.PLAYER))) {
			
			EntityPlayer Player = (EntityPlayer) TickData[0];
			
			OnTick(Player);
			
		}
		
	}

	@Override
	public void tickEnd(EnumSet<TickType> Type, Object... TickData) {
		
	}

	@Override
	public EnumSet<TickType> ticks() {
		
		return EnumSet.of(TickType.PLAYER);
		
	}
	
	private void OnTick(EntityPlayer Player) {
		
		if(Player.inventory.hasItem(TWItems.TWAmulet.itemID)) {
			
			Player.removePotionEffect(Config.potionFluxTaintID);
			
		}
		
	}

	@Override
	public String getLabel() {
		
		return TWModConfig.TWMOD_NAME;
		
	}
	
	
	
}

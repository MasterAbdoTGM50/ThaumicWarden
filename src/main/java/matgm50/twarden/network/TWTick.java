package matgm50.twarden.network;

import java.util.EnumSet;

import thaumcraft.common.config.Config;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import matgm50.twarden.config.TWModConfig;
import matgm50.twarden.items.TWItems;
import cpw.mods.fml.common.ITickHandler;
import cpw.mods.fml.common.TickType;
import cpw.mods.fml.common.registry.TickRegistry;
import cpw.mods.fml.relauncher.Side;

public class TWTick implements ITickHandler {
	
	public static void Init() {
		
		TickRegistry.registerTickHandler(new TWTick(), Side.SERVER);
		
	}

	@Override
	public void tickStart(EnumSet<TickType> Type, Object... TickData) {
		
		if (Type.equals(EnumSet.of(TickType.PLAYER))) {
			
			onPlayerTick((EntityPlayer) TickData[0]);
			
		}
		
	}

	@Override
	public void tickEnd(EnumSet<TickType> Type, Object... TickData) {
		
	}

	@Override
	public EnumSet<TickType> ticks() {
		
		return EnumSet.of(TickType.PLAYER, TickType.SERVER);
		
	}
	
	private void onPlayerTick(EntityPlayer Player) {
		
		if(Player.getEntityData().getBoolean("Warden")) {
			
			Player.removePotionEffect(Config.potionFluxTaintID);
			
		}
		
	}

	@Override
	public String getLabel() {
		
		return TWModConfig.TWMOD_NAME;
		
	}
	
	
	
}

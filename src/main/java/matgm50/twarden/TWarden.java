package matgm50.twarden;

import net.minecraft.creativetab.CreativeTabs;
import matgm50.twarden.aspects.TWAspects;
import matgm50.twarden.blocks.TWBlocks;
import matgm50.twarden.config.TWConfig;
import matgm50.twarden.config.TWModConfig;
import matgm50.twarden.crafting.TWCraftHandler;
import matgm50.twarden.crafting.TWTransRecipes;
import matgm50.twarden.crafting.TWRecipes;
import matgm50.twarden.events.TWEvent;
import matgm50.twarden.items.TWItems;
import matgm50.twarden.misc.TWLang;
import matgm50.twarden.misc.TWTab;
import matgm50.twarden.network.TWTick;
import matgm50.twarden.network.packet.TWPacket;
import matgm50.twarden.network.proxy.TWCommonProxy;
import matgm50.twarden.research.TWResearch;
import matgm50.twarden.world.TWFlowerGen;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.relauncher.Side;

@Mod(modid = TWModConfig.TWMOD_ID, name = TWModConfig.TWMOD_NAME, version = TWModConfig.TWMOD_VERSION, dependencies = TWModConfig.TWMOD_DEPENDENCIES)
@NetworkMod(channels = {TWModConfig.TWMOD_CHANNEL}, clientSideRequired = true, serverSideRequired = true, packetHandler = TWPacket.class)

public class TWarden {
	
	@Instance(TWModConfig.TWMOD_ID)
    public static TWarden Instance;
	
    @SidedProxy(clientSide = TWModConfig.TWMOD_CLIENTPROXY, serverSide = TWModConfig.TWMOD_COMMONPROXY)
    public static TWCommonProxy TWProxy;
    
	public static CreativeTabs TWTab = new TWTab(TWModConfig.TWMOD_ID);
    
	@EventHandler
	public void PreInit(FMLPreInitializationEvent Event) {
		
		TWConfig.Init(Event.getSuggestedConfigurationFile());
		TWTick.Init();
		TWFlowerGen.Init();
		TWCraftHandler.Init();
		TWItems.Init();
		TWBlocks.Init();
		
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent Event) {
		
	}
	
	@EventHandler
	public void PostInit(FMLPostInitializationEvent Event) {
		
		TWRecipes.Init();
		TWTransRecipes.Init();
		TWResearch.Init();
		TWAspects.Init();
		TWLang.Init();
		
	}
	
}

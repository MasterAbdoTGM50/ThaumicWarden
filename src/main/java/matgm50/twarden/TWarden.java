package matgm50.twarden;

import matgm50.twarden.aspects.TWAspects;
import matgm50.twarden.blocks.TWBlocks;
import matgm50.twarden.config.TWConfig;
import matgm50.twarden.config.TWModConfig;
import matgm50.twarden.crafting.TWCraftHandler;
import matgm50.twarden.crafting.TWRecipes;
import matgm50.twarden.entities.TWEntities;
import matgm50.twarden.items.TWItems;
import matgm50.twarden.network.packet.TWPacket;
import matgm50.twarden.network.proxy.TWCommonProxy;
import matgm50.twarden.research.TWResearch;
import matgm50.twarden.util.TWLang;
import matgm50.twarden.util.TWTab;
import matgm50.twarden.world.TWGen;
import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid = TWModConfig.TWMOD_ID, name = TWModConfig.TWMOD_NAME, version = TWModConfig.TWMOD_VERSION, dependencies = TWModConfig.TWMOD_DEPENDENCIES)
@NetworkMod(channels = {TWModConfig.TWMOD_CHANNEL}, clientSideRequired = true, serverSideRequired = true, packetHandler = TWPacket.class)

public class TWarden {
	
	@Instance(TWModConfig.TWMOD_ID)
    public static TWarden Instance;
	
    @SidedProxy(serverSide = TWModConfig.TWMOD_COMMONPROXY, clientSide = TWModConfig.TWMOD_CLIENTPROXY)
    public static TWCommonProxy TWProxy;
    
	public static CreativeTabs TWTab = new TWTab(TWModConfig.TWMOD_ID);
    
	@EventHandler
	public void PreInit(FMLPreInitializationEvent Event) {
		
		TWConfig.Init(Event.getSuggestedConfigurationFile());
		TWProxy.InitTick();
		TWProxy.InitRenderer();
		TWGen.Init();
		TWCraftHandler.Init();
		TWItems.Init();
		TWBlocks.Init();
		TWEntities.Init();
		
		
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent Event) {
		
	}
	
	@EventHandler
	public void PostInit(FMLPostInitializationEvent Event) {
		
		TWRecipes.Init();
		TWAspects.Init();
		TWResearch.Init();
		TWLang.Init();
		
	}
	
}

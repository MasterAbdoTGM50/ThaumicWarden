package matgm50.twarden;

import matgm50.twarden.aspects.TWAspects;
import matgm50.twarden.blocks.TWBlocks;
import matgm50.twarden.client.proxies.TWCommonProxy;
import matgm50.twarden.config.TWConfig;
import matgm50.twarden.config.TWModConfig;
import matgm50.twarden.crafting.TWRecipes;
import matgm50.twarden.items.TWItems;
import matgm50.twarden.research.TWResearch;
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

@Mod(modid = TWModConfig.TWMOD_ID, name = TWModConfig.TWMOD_NAME, version = TWModConfig.TWMOD_VERSION, dependencies = TWModConfig.TWMOD_DEPENDENCIES)

public class TWarden {
	
	@Instance(TWModConfig.TWMOD_ID)
    public static TWarden instance;
	
    @SidedProxy(serverSide = TWModConfig.TWMOD_COMMONPROXY, clientSide = TWModConfig.TWMOD_CLIENTPROXY)
    public static TWCommonProxy twProxy;
    
	public static CreativeTabs twTab = new TWTab(TWModConfig.TWMOD_ID);
    
	@EventHandler
	public void preInit(FMLPreInitializationEvent Event) {
		
		TWConfig.Init(Event.getSuggestedConfigurationFile());
		twProxy.initTick();
		twProxy.initRenderer();
		TWGen.init();
		TWItems.init();
		TWBlocks.init();
		
	}
	
	@EventHandler
	public void init(FMLInitializationEvent Event) {
		
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent Event) {
		
		TWAspects.init();
		TWRecipes.init();
		TWResearch.init();
		
	}
	
}

package matgm50.twarden.config;

import java.io.File;

import net.minecraftforge.common.Configuration;

public class TWConfig extends Configuration {
	
	public static void Init (File File) {
		
		Configuration Config = new Configuration(File);
		
		Config.load();
		
		TWItemConfig.TWRESOURCE_ID = Config.getItem(TWItemConfig.TWRESOURCE_KEY, TWItemConfig.TWRESOURCE_DID).getInt() - 256;
		TWItemConfig.TWHELM_ID = Config.getItem(TWItemConfig.TWHELM_KEY, TWItemConfig.TWHELM_DID).getInt() - 256;
		TWItemConfig.TWCHEST_ID = Config.getItem(TWItemConfig.TWCHEST_KEY, TWItemConfig.TWCHEST_DID).getInt() - 256;
		TWItemConfig.TWLEGS_ID = Config.getItem(TWItemConfig.TWLEGS_KEY, TWItemConfig.TWLEGS_DID).getInt() - 256;
		TWItemConfig.TWBOOTS_ID = Config.getItem(TWItemConfig.TWBOOTS_KEY, TWItemConfig.TWBOOTS_DID).getInt() - 256;
		TWItemConfig.TWCROSS_ID = Config.getItem(TWItemConfig.TWCROSS_KEY, TWItemConfig.TWCROSS_DID).getInt() - 256;
		TWItemConfig.TWSIGIL_ID = Config.getItem(TWItemConfig.TWSIGIL_KEY, TWItemConfig.TWSIGIL_DID).getInt() - 256;
		TWItemConfig.TWAMULET_ID = Config.getItem(TWItemConfig.TWAMULET_KEY, TWItemConfig.TWAMULET_DID).getInt() - 256;
		TWItemConfig.TWTAINTEDHELM_ID = Config.getItem(TWItemConfig.TWTAINTEDHELM_KEY, TWItemConfig.TWTAINTEDHELM_DID).getInt() - 256;
		TWItemConfig.TWTAINTEDCHEST_ID = Config.getItem(TWItemConfig.TWTAINTEDCHEST_KEY, TWItemConfig.TWTAINTEDCHEST_DID).getInt() - 256;
		TWItemConfig.TWTAINTEDLEGS_ID = Config.getItem(TWItemConfig.TWTAINTEDLEGS_KEY, TWItemConfig.TWTAINTEDLEGS_DID).getInt() - 256;
		TWItemConfig.TWTAINTEDBOOTS_ID = Config.getItem(TWItemConfig.TWTAINTEDBOOTS_KEY, TWItemConfig.TWTAINTEDBOOTS_DID).getInt() - 256;
		TWItemConfig.TWTAINTEDBLADE_ID = Config.getItem(TWItemConfig.TWTAINTEDBLADE_KEY, TWItemConfig.TWTAINTEDBLADE_DID).getInt() - 256;
		TWBlockConfig.TWFLOWER_ID = Config.getBlock(TWBlockConfig.TWFLOWER_KEY, TWBlockConfig.TWFLOWER_DID).getInt();
		
		Config.save();
		
	}
	
	
}

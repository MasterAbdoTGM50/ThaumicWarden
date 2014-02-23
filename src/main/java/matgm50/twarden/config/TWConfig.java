package matgm50.twarden.config;

import java.io.File;

import matgm50.twarden.config.TWItemConfig;
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
		TWItemConfig.TWSWORD_ID = Config.getItem(TWItemConfig.TWSWORD_KEY, TWItemConfig.TWSWORD_DID).getInt() - 256;
		TWItemConfig.TWBOW_ID = Config.getItem(TWItemConfig.TWBOW_KEY, TWItemConfig.TWBOW_DID).getInt() - 256;
		TWItemConfig.TWSIGIL_ID = Config.getItem(TWItemConfig.TWSIGIL_KEY, TWItemConfig.TWSIGIL_DID).getInt() - 256;
		TWItemConfig.TWAMULET_ID = Config.getItem(TWItemConfig.TWAMULET_KEY, TWItemConfig.TWAMULET_DID).getInt() - 256;
		TWItemConfig.TWBLOOD_ID = Config.getItem(TWItemConfig.TWBLOOD_KEY, TWItemConfig.TWBLOOD_DID).getInt() - 256;
		TWBlockConfig.TWFLOWER_ID = Config.getBlock(TWBlockConfig.TWFLOWER_KEY, TWBlockConfig.TWFLOWER_DID).getInt();
		
		Config.save();
		
	}
	
	
}

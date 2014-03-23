package matgm50.twarden.config;

import java.io.File;

import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraftforge.common.config.Configuration;

public class TWConfig extends Configuration {
	
	public static void Init (File File) {
		
		Configuration Config = new Configuration(File);
		
		Config.load();
		
		Config.save();
		
	}
	
	
}

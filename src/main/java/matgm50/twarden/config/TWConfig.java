package matgm50.twarden.config;

import java.io.File;

import net.minecraftforge.common.config.Configuration;

public class TWConfig extends Configuration {
	
	public static void Init (File file) {
		
		Configuration config = new Configuration(file);
		
		config.load();
		
		config.save();
		
	}
	
	
}

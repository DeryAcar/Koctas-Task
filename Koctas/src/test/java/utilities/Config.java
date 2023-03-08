package utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class Config {

	private static Properties config;

	static {
		try {
			String filepath = "./src/test/resources/test_data/configuration.properties";
			FileInputStream input = new FileInputStream(filepath);
			config = new Properties();
			config.load(input);
			input.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static String getProperties(String key) {
		return config.getProperty(key);
	}
}

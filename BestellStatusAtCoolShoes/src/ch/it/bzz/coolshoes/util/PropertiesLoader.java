package ch.it.bzz.coolshoes.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesLoader {

  private static final String PROP_FILE = "config.properties";

  /**
   * Loads all properties defined in file config.properties.
   * 
   * @return The properties.
   * @throws IOException If file config.properties does not exist or cannot be read.
   */
  public static Properties loadProperties() throws IOException {
    Properties prop = new Properties();
    InputStream is = PropertiesLoader.class.getClassLoader().getResourceAsStream(PROP_FILE);

    if (is != null) {
      prop.load(is);
      is.close();
      return prop;
    } else {
      throw new IOException("Could not load properties from file " + PROP_FILE);
    }
  }
}

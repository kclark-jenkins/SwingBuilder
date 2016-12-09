package org.krisbox.swing.builder.utils.loader;

import org.krisbox.swing.builder.utils.config.AppConfig;

public interface PropertiesLoader {
    void    setPropertiesFile(String propertiesFile);
    String  getPropertiesFile();
    boolean reloadProperties();
    boolean reloadProperties(String propertiesFile);
    String  getProperty(String key);
    AppConfig readAppConfig(String filename);
}

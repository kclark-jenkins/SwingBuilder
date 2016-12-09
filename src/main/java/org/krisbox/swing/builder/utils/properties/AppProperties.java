package org.krisbox.swing.builder.utils.properties;

import org.krisbox.swing.builder.utils.config.AppConfig;
import org.krisbox.swing.builder.utils.loader.PropertiesLoader;

public interface AppProperties extends PropertiesLoader {
    AppConfig getAppConfig();
    void setAppConfig(AppConfig appConfig);
    void reloadAppConfig();
    void reloadAppConfig(String propertiesFile);
}

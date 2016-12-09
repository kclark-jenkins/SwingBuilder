package org.krisbox.swing.builder.utils.properties.impl;

import org.krisbox.swing.builder.utils.properties.AppProperties;
import org.krisbox.swing.builder.utils.config.AppConfig;
import org.krisbox.swing.builder.utils.config.impl.AppConfigImpl;
import org.krisbox.swing.builder.utils.loader.impl.PropertiesLoaderImpl;

public class AppPropertiesImpl extends PropertiesLoaderImpl implements AppProperties {
    private AppConfig appConfig;

    public AppPropertiesImpl(String propertiesFile) {
        super();
        appConfig = new AppConfigImpl();
        appConfig = readAppConfig(propertiesFile);
    }

    public AppConfig getAppConfig() {
        return appConfig;
    }

    public void setAppConfig(AppConfig appConfig) {
        this.appConfig = appConfig;
    }

    public void reloadAppConfig(){appConfig=readAppConfig(getPropertiesFile());}
    public void reloadAppConfig(String propertiesFile){
        setPropertiesFile(propertiesFile);
        appConfig = readAppConfig(getPropertiesFile());
    }
}

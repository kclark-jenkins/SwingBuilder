package org.krisbox.swing.builder.utils.loader.impl;

import com.google.gson.Gson;
import org.apache.log4j.Logger;
import org.krisbox.swing.builder.utils.config.AppConfig;
import org.krisbox.swing.builder.utils.config.impl.AppConfigImpl;
import org.krisbox.swing.builder.utils.loader.PropertiesLoader;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Properties;
import java.util.Scanner;

public class PropertiesLoaderImpl implements PropertiesLoader {
    private Logger LOGGER;
    private Properties  properties;
    private ClassLoader loader;
    private String      propertiesFile;

    public  PropertiesLoaderImpl() {
        super();
        LOGGER = Logger.getLogger(this.getClass());
        initPropertiesLoader(null);
    }
    public  PropertiesLoaderImpl(String propertiesFile) {
        super();
        LOGGER = Logger.getLogger(this.getClass());
        initPropertiesLoader(propertiesFile);
    }

    public  void    setPropertiesFile(String propertiesFile) {
        this.propertiesFile = propertiesFile;
    }
    public  String  getPropertiesFile() {
                return propertiesFile;
    }
    public  String  getProperty(String key){return (String)properties.get(key);}
    public  boolean reloadProperties() {
        return readProperties(this.propertiesFile);
    }
    public  boolean reloadProperties(String propertiesFile) {
        this.propertiesFile = propertiesFile;
        return readProperties(this.propertiesFile);
    }

    private void    initPropertiesLoader(String propertiesFile) {
        loader              = Thread.currentThread().getContextClassLoader();
        properties          = new Properties();

        if(propertiesFile == null) {
            this.propertiesFile = propertiesFile;
            readProperties(this.propertiesFile);
        }else{
            this.propertiesFile = new String();
        }
    }
    private boolean readProperties(String propertiesFile) {

        try {
            properties.load(getClass().getResourceAsStream("/birtSwing.properties"));
            return true;
        } catch (Exception ex) {
            LOGGER.fatal(ex);
            return false;
        }
    }

    public AppConfig readAppConfig(String filename) {
        try {
            InputStream in = getClass().getResourceAsStream(filename);
            String text = null;
            try (BufferedReader buffer = new BufferedReader(new InputStreamReader(in))) {

                try (Scanner scanner = new Scanner(in, StandardCharsets.UTF_8.name())) {
                    text = scanner.useDelimiter("\\A").next();
                }
            }

            return new Gson().fromJson(text, AppConfigImpl.class);
        } catch (final Exception ex) {
            LOGGER.fatal(ex);
        }

        return null;
    }
}

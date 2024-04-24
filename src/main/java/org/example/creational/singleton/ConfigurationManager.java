package org.example.creational.singleton;

import java.util.HashMap;
import java.util.Map;

public class ConfigurationManager {
    private static ConfigurationManager instance;
    private Map<String, String> configMap;

    private ConfigurationManager() {
        // Initialize configuration map
        configMap = new HashMap<>();
    }

    public static synchronized ConfigurationManager getInstance() {
        if (instance == null) {
            instance = new ConfigurationManager();
        }
        return instance;
    }

    public String getConfig(String key) {
        return configMap.get(key);
    }

    public void setConfig(String key, String value) {
        configMap.put(key, value);
    }
}

// Usage example


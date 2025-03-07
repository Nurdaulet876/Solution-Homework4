import java.util.HashMap;
import java.util.Map;

// Singleton class for managing configuration settings
public class ConfigurationManager {
    private static ConfigurationManager instance;
    private Map<String, String> configSettings;

    // Private constructor to prevent instantiation from outside
    private ConfigurationManager(){
        configSettings = new HashMap<>();
        configSettings.put("maxPlayers", "100");
        configSettings.put("defaultLanguage", "en");
        configSettings.put("gameDifficulty", "medium");
    }

    // Static method to provide a single instance of the class
    public static ConfigurationManager getInstance(){
        if(instance == null){
            instance = new ConfigurationManager();
        }
        return instance;
    }

    // Method to retrieve a configuration value by key
    public String getConfig(String key){
        return configSettings.get(key);
    }

    // Method to print all configuration settings
    public void printSettings(){
        System.out.println("Configuration settings: ");
        for (Map.Entry<String, String> entry: configSettings.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}

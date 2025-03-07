// Demo class to test the ConfigurationManager singleton
public class ConfigManagerDemo {
    public static void main(String[] args) {
        ConfigurationManager configurationManager = ConfigurationManager.getInstance();
        System.out.println("Max players: " + configurationManager.getConfig("maxPlayers"));
        System.out.println("Default language: " + configurationManager.getConfig("defaultLanguage"));
        System.out.println("Game difficulty: " + configurationManager.getConfig("gameDifficulty"));

        System.out.println();

        configurationManager.printSettings();
    }
}

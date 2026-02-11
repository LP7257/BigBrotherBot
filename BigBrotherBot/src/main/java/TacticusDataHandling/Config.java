package TacticusDataHandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * Configuration class to fetch *classified* data from secret.properties file, such as API key, Discord bot token, player ID:s.
 */
public class Config {
    // HashMap for converting API userId data to actual player names.
    public static final Map<String, String> userIdToName = new HashMap<>();

    // API key for https://api.tacticusgame.com/api/v1
    public static String API_KEY;

    // Discord bot token
    public static String TOKEN;

    // static is performed automatically when this class is called for in the API class
    static {
        // For loading properties from our properties file
        Properties props = new Properties();

        // loads the file with sensitive data
        try { props.load(new FileInputStream("secret.properties"));
            // Gets API key and token from the file
            API_KEY = props.getProperty("api.key");
            TOKEN = props.getProperty("token");
            // Maps every userId entries in to a player name (listed as user."ID"=player_name in the file)
            for (String key : props.stringPropertyNames()) {
                if (key.startsWith("user.")) {
                    String id = key.substring("user.".length());
                    String name = props.getProperty(key);
                    userIdToName.put(id, name);
                }
            }
        } catch (IOException e) {
            // If loading up somehow fails, throws a RuntimeException
            throw new RuntimeException("Could not load secret.properties", e);
        }
    }
}

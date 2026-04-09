package TacticusDataHandling;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import com.google.gson.Gson;
import java.util.List;

/**
 * API class gets the API data and prepares it for the bot.
 */
public class API {

    // URL where API data is fetched from
    private static final String API_URL = "https://api.tacticusgame.com/api/v1";

    // API key is set in stone on the secret.properties file
    static String apiKey = Config.API_KEY;

    //Runs the requests and responses
    public static List<Entry> fetchEntries() {
        // Creating a client which handles the connections
        try (HttpClient client = HttpClient.newHttpClient()) {
            // Configures a GET request
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(API_URL + "/guildRaid"))
                    .header("accept", "application/json")
                    .header("X-API-Key", apiKey)
                    .GET()
                    .build();

            try {

                // Sends an http-request. Wanted in String format
                HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

                // if http request fails, shows the http status code.
                if (response.statusCode() != 200) {
                    System.out.println("HTTP error: " + response.statusCode());
                    return List.of();
                }

                // For converting JSON to Java objects
                Gson gson = new Gson();

                // Converts JSON to Java objects
                GRseason season = gson.fromJson(response.body(), GRseason.class);
                // Returns a list of entries listed in a season
                return season.getEntries();

            } catch (Exception e) {
                // In case it fails, prints stack trace for further debugging
                //noinspection CallToPrintStackTrace
                e.printStackTrace();
                return List.of();
            }
        }
    }
}
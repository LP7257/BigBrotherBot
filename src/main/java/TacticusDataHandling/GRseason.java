package TacticusDataHandling;

import java.util.List;

/**
 * GRseason fetches entries from the API
 */
public class GRseason {
    // Entries come in a list
    private List<Entry> entries;
    // Returns the entry list for further use
    public List<Entry> getEntries() { return entries; }

    /*
     * Unused for now
     */
    private static int season;
    public static int getSeason() { return season; }
}
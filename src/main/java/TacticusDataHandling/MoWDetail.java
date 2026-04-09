package TacticusDataHandling;

import java.util.HashMap;
import java.util.Map;

/**
 * HeroDetail class fetches all the necessary info of the hero data and contains a hashmap of more commonly used names to replace the original data.
 */
public class MoWDetail {
    // Machine of wars own specific name in the JSON file
    private String unitId;

    // Machine of wars own power level in the JSON file - Unused for now
    private int power;

    // Returns unitId for further use
    public String getUnitId() { return unitId; }

    // Unused for now
    public int getPower() { return power; }

    // Names
    public static final Map<String, String> mowIdToName = new HashMap<>();

    static {
        mowIdToName.put("tyranBiovore", "Biovore");
        mowIdToName.put("blackForgefiend", "Forgefiend");
        mowIdToName.put("ultraDreadnought", "Galatian");
        mowIdToName.put("astraOrdnanceBattery", "MalleusRocketLauncher");
        mowIdToName.put("adeptExorcist", "Exorcist");
        mowIdToName.put("tauBroadside", "Tsonji");
        mowIdToName.put("orksRukkatrukk", "Rukkatruck");
        mowIdToName.put("thousDaemonPrince", "Z'Kar");
        mowIdToName.put("deathCrawler", "Plagueburst crawler");
        mowIdToName.put("-", "DW Storm speeder");

    }

    // Emojis
    public static final Map<String, String> mowIdToEmoji = new HashMap<>();

    static {
        mowIdToEmoji.put("tyranBiovore", "<:MOW_Biovore:1478830783215960104>");
        mowIdToEmoji.put("-", "<:MOW_DarkAngels:1478862444570087575>");
        mowIdToEmoji.put("blackForgefiend", "<:MOW_Forgefiend:1478830429703377092>");
        mowIdToEmoji.put("ultraDreadnought", "<:MOW_Galatian:1478830663351140483>");
        mowIdToEmoji.put("astraOrdnanceBattery", "<:MOW_MalleusRocketLauncher:1478862515416076460>");
        mowIdToEmoji.put("adeptExorcist", "<:MOW_Sisters:1478830724785246258>");
        mowIdToEmoji.put("tauBroadside", "<:MOW_Tsonji:1478862479722549491>");
        mowIdToEmoji.put("orksRukkatrukk", "<:MOW_ork:1478862556000161963>");
        mowIdToEmoji.put("thousDaemonPrince", "<:MoV_tsZkar:1478830381796163858>");
        mowIdToEmoji.put("deathCrawler", "<:crawler:1478830516932444261>");
    }
}

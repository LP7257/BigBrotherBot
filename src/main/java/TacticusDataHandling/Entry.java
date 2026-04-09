package TacticusDataHandling;
import java.util.List;

/**
 * Entry class fetches all the necessary info from the entry data.
 */
public class Entry {
    // userId is used to identify the player.
    private String userId;

    // type is the Boss in question
    private String type;

    // unitId differentiates the side bosses from the boss
    private String unitId;

    // rarity refers to the tier of the boss: common -> uncommon -> rare -> epic -> legendary -> mythic
    private String rarity;

    // damageDealt is the damage from that entry
    private int damageDealt;

    // DamageType is used to differentiate if the entry is a battle or a bomb. Bombs have no relevance for the project so they won't be printed out in the bots listing.
    private DamageType damageType;

    // HeroDetails contains a list off unitIds that HeroDetail class returned
    private List<HeroDetail> heroDetails;

    private MoWDetail machineOfWarDetails;

    // private BossDetail bossDetails;
    // startedOn serves a crucial identifier for the entry, it will be used to weed out already listed entries, since it is a constantly growing variable.
    public long startedOn;


    // Getters
    // public String getBossIdNormalized() { return unitId.replaceAll("\\d+", ""); } not necessary
    public MoWDetail getMachineOfWarDetails() { return machineOfWarDetails; }
    public String getUserId() { return userId; }
    public String getBossId() { return unitId; }
    public String getRarity() { return rarity; }
    public int getDamageDealt() { return damageDealt; }
    public DamageType getDamageType() { return damageType; }
    public List<HeroDetail> getHeroDetails() { return heroDetails; }

    // public String getType() { return type; } not necessary
    public long getStartedOn() { return startedOn; }
}

package TacticusDataHandling;

import java.util.HashMap;
import java.util.Map;

public class BossDetail {

    // private String unitId; not necessary

    // private String rarity; not necessary

    // public String getUnitId() { return unitId; } not necessary

    // Numbers between the bosses may differ season to season, so getUnitIdNormalized ignores them

    // public String getUnitIdNormalized() { return unitId.replaceAll("\\d+", ""); } not necessary

    // public String getRarity() { return rarity; } not necessary

    // This HashMap contains the unit rarities
    public static final Map<String, String> rarityToEmoji = new HashMap<>();

    static {
        rarityToEmoji.put("Mythic", "<:Mythic:1479453904151249066>");
        rarityToEmoji.put("Legendary", "<:Legendary:1479454527072505946>");
        rarityToEmoji.put("Epic", "<:Epic:1479454352786849802>");
        rarityToEmoji.put("Rare", "<:Rare:1479454604747083776>");
    }

    // This HashMap contains the unit boss names
    public static final Map<String, String> bossIdToName = new HashMap<>();

    static {
        bossIdToName.put("GuildBossBossEldarAvatar", "Avatar of Khaine");
        bossIdToName.put("GuildBossMiniBossAdmecManipulus", "Actus");
        bossIdToName.put("GuildBossMiniBossThousInfernalMaster", "Abraxas");
        bossIdToName.put("GuildBossMiniBossEldarAutarch", "Aethana");
        bossIdToName.put("GuildBossBossAdmecBelisarius", "Cawl");
        bossIdToName.put("GuildBossMiniBossDeathBlightbringer", "Corrodius");
        bossIdToName.put("GuildBossBossAstraRogaldorn", "Dorn");
        bossIdToName.put("GuildBossMiniBossEldarFarseer", "Eldryon");
        bossIdToName.put("GuildBossBossOrksGhazghkull", "Ghazghkull");
        bossIdToName.put("GuildBossMiniBossOrksBigMek", "Gibbascrapz");
        bossIdToName.put("GuildBossBossThousMagnus", "Magnus");
        bossIdToName.put("GuildBossBossDeathMortarion", "Mortarion");
        bossIdToName.put("GuildBossMiniBossTyranNeurothrope", "Neurothrope");
        bossIdToName.put("GuildBossMiniBossTauCrisis", "Re'Vas");
        bossIdToName.put("GuildBossBossTauRiptide", "Riptide");
        bossIdToName.put("GuildBossMiniBossDeathRotbone", "Rotbone");
        bossIdToName.put("GuildBossBossTyranScreamerKiller", "Screamer Killer");
        bossIdToName.put("GuildBossMiniBossTauMarksman", "Sho'Syl");
        bossIdToName.put("GuildBossMiniBossAstraPrimarisPsy", "Sibyll");
        bossIdToName.put("GuildBossBossNecroSilentKing", "Szarekh");
        bossIdToName.put("GuildBossMiniBossAdmecMarshall", "Tan Gida");
        bossIdToName.put("GuildBossMiniBossOrksNob", "Tanksmasha");
        bossIdToName.put("GuildBossBossTyranTervigonGorgon", "Tervigon (Gorgon)");
        bossIdToName.put("GuildBossBossTyranTervigonKronos", "Tervigon (Kronos)");
        bossIdToName.put("GuildBossBossTyranTervigonLeviathan", "Tervigon (Leviathan)");
        bossIdToName.put("GuildBossMiniBossAstraOrdnance", "Thaddeus");
        bossIdToName.put("GuildBossMiniBossThousSorcerer", "Thaumachus");
        bossIdToName.put("GuildBossMinionNecroMenhir", "Triarchal Menhir");
        bossIdToName.put("GuildBossBossTyranHiveTyrantGorgon", "Hive Tyrant (Gorgon)");
        bossIdToName.put("GuildBossMiniBossTyranWarriorGorgon", "Hive Tyrant Prime (Gorgon)");
        bossIdToName.put("GuildBossBossTyranHiveTyrantKronos", "Hive Tyrant (Kronos)");
        bossIdToName.put("GuildBossMiniBossTyranWarriorKronos", "Hive Tyrant Prime (Kronos)");
        bossIdToName.put("GuildBossBossTyranHiveTyrantLeviathan", "Hive Tyrant (Leviathan)");
        bossIdToName.put("GuildBossMiniBossTyranWarriorLeviathan", "Hive Tyrant Prime (Leviathan)");
        bossIdToName.put("GuildBossMiniBossTyranWingedPrime", "Winged Prime");
    }

    // This HashMap contains the unit boss emojis
    public static final Map<String, String> bossIdToEmoji = new HashMap<>();

    static {
        bossIdToEmoji.put("GuildBossBossEldarAvatar", "<:Avatar:1479467071455891661>");
        bossIdToEmoji.put("GuildBossMiniBossAdmecManipulus", "<:ActusGR:1479479164728905728>");
        bossIdToEmoji.put("GuildBossMiniBossThousInfernalMaster", "<:AbraxasGR:1479461449955934208>");
        bossIdToEmoji.put("GuildBossMiniBossEldarAutarch", "<:AethanaGR:1479460702854054133>");
        bossIdToEmoji.put("GuildBossBossAdmecBelisarius", "<:Cawl:1479458021032726568>");
        bossIdToEmoji.put("GuildBossMiniBossDeathBlightbringer", "<:CorrodiusGR:1479461575814414346>");
        bossIdToEmoji.put("GuildBossBossAstraRogaldorn", "<:Dorn:1479455590274306141>");
        bossIdToEmoji.put("GuildBossMiniBossEldarFarseer", "<:EldryonGR:1479460771418341468>");
        bossIdToEmoji.put("GuildBossBossOrksGhazghkull", "<:Ghazghkull:1479455496393199708>");
        bossIdToEmoji.put("GuildBossMiniBossOrksBigMek", "<:GibbascrapzGR:1479460907573575781>");
        bossIdToEmoji.put("GuildBossBossThousMagnus", "<:Magnus:1479455204049944705>");
        bossIdToEmoji.put("GuildBossBossDeathMortarion", "<:Mortarion:1479455376444489728>");
        bossIdToEmoji.put("GuildBossMiniBossTyranNeurothrope", "<:NeurothropeGR:1479461894782844989>");
        bossIdToEmoji.put("GuildBossMiniBossTauCrisis", "<:RevasGR:1479461694139793559>");
        bossIdToEmoji.put("GuildBossBossTauRiptide", "<:Riptide:1479458962029019208>");
        bossIdToEmoji.put("GuildBossMiniBossDeathRotbone", "<:RotboneGR:1479461523591004352>");
        bossIdToEmoji.put("GuildBossBossTyranScreamerKiller", "<:ScreamerKiller:1479458155468689418>");
        bossIdToEmoji.put("GuildBossMiniBossTauMarksman", "<:ShosylGR:1479461636535222465>");
        bossIdToEmoji.put("GuildBossMiniBossAstraPrimarisPsy", "<:SibyllGR:1479461784053354679>");
        bossIdToEmoji.put("GuildBossBossNecroSilentKing", "<:Szarekh:1479458115370881114>");
        bossIdToEmoji.put("GuildBossMiniBossAdmecMarshall", "<:TanGidaGR:1479460837004673105>");
        bossIdToEmoji.put("GuildBossMiniBossOrksNob", "<:TanksmashaGR:1479460948371701850>");
        bossIdToEmoji.put("GuildBossBossTyranTervigonGorgon", "<:Tervigon_Gorgon:1479459424354439260>");
        bossIdToEmoji.put("GuildBossBossTyranTervigonKronos", "<:Tervigon_Kronos:1479459542747320442>");
        bossIdToEmoji.put("GuildBossBossTyranTervigonLeviathan", "<:Tervigon_Leviathan:1479459463244025939>");
        bossIdToEmoji.put("GuildBossMiniBossAstraOrdnance", "<:ThaddeusGR:1479461840495841503>");
        bossIdToEmoji.put("GuildBossMiniBossThousSorcerer", "<:ThaumachusGR:1479461275548254228>");
        bossIdToEmoji.put("GuildBossMinionNecroMenhir", "<:Triarchal_Menhir:1479462030074318908>");
        bossIdToEmoji.put("GuildBossBossTyranHiveTyrantGorgon", "<:TyrantGorgon:1479459041272135732>");
        bossIdToEmoji.put("GuildBossMiniBossTyranWarriorGorgon", "<:Tyrant_Gorgon_Prime:1479461047864787026>");
        bossIdToEmoji.put("GuildBossBossTyranHiveTyrantKronos", "<:Tyrant_Kronos:1479459103058170049>");
        bossIdToEmoji.put("GuildBossMiniBossTyranWarriorKronos", "<:Tyrant_Kronos_Prime:1479461137933402122>");
        bossIdToEmoji.put("GuildBossBossTyranHiveTyrantLeviathan", "<:Tyrant_Leviathan:1479459215176368251>");
        bossIdToEmoji.put("GuildBossMiniBossTyranWarriorLeviathan", "<:Tyrant_Leviathan_Prime:1479461197555175547>");
        bossIdToEmoji.put("GuildBossMiniBossTyranWingedPrime", "<:WingedPrimeGR:1479461969672015902>");
    }
}

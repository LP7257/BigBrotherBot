package TacticusDataHandling;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * MetaOrNot class will distinct if an entry team uses a recognized META team or not.
 */
public class MetaOrNot {

    // Map contains the current recognized META teams
    private static final Map<Set<String>, Set<String>> META_TEAMS = new LinkedHashMap<>();

    static {
            // Original Custodes shell
            META_TEAMS.put( Set.of(
                    "worldKharn",
                    "spaceBlackmane",
                    "bloodDante",
                    "custoTrajann",
                    "custoBladeChampion",
                    "blackAbaddon",
                    "templHelbrecht",
                    "admecDominus",
                    "tauAunShi"),

                    // Must haves
                    Set.of("custoTrajann", "custoBladeChampion", "worldKharn")
            );

            // Jealous Custodes shell
            META_TEAMS.put( Set.of(
                    "worldKharn",
                    "emperExultant",
                    "orksWarboss",
                    "custoTrajann",
                    "custoBladeChampion",
                    "blackAbaddon",
                    "custoVexilusPraetor",
                    "bloodDante",
                    "admecDominus",
                    "tauAunShi",
                    "custoAtlacoya",
                    "templHelbrecht"),

                    // Must haves
                    Set.of("custoTrajann", "custoBladeChampion", "emperExultant")
            );

            // Mechs shell
            META_TEAMS.put( Set.of(
                    "admecDominus",
                    "orksWarboss",
                    "admecRuststalker",
                    "admecMarshall",
                    "admecManipulus",
                    "tauMarksman",
                    "custoTrajann",
                    "templHelbrecht",
                    "necroSpyder",
                    "tauCrisis"),

                    // Must haves
                    Set.of("admecRuststalker", "admecMarshall", "admecManipulus")
            );

            // Classic Neuro shell
            META_TEAMS.put( Set.of(
                    "bloodMephiston",
                    "thousAhriman",
                    "tyranNeurothrope",
                    "thousInfernalMaster",
                    "thousTzaangor",
                    "custoAtlacoya",
                    "genesMagus",
                    "adeptCanoness"),

                    // Must haves
                    Set.of("tyranNeurothrope", "thousAhriman", "thousInfernalMaster")
            );

            // Neuro 2.0 shell
            META_TEAMS.put( Set.of(
                    "thousAhriman",
                    "tyranNeurothrope",
                    "thousInfernalMaster",
                    "blackPossession",
                    "blackAbaddon",
                    "thousSorcerer",
                    "tyranWingedPrime"),

                    // Must haves
                    Set.of("tyranNeurothrope", "thousInfernalMaster", "blackPossession")
            );

            // Battlesuit shell
            META_TEAMS.put( Set.of(
                    "eldarFarseer",
                    "tauFarsight",
                    "tauDarkstrider",
                    "admecManipulus",
                    "tauCrisis",
                    "ultraCalgar"),

                    // Must haves
                    Set.of("tauCrisis", "admecManipulus", "tauFarsight")
            );

    }

    // isMeta compares hero details from the entry, compares the team to META_TEAMS set and either returns true -> is META, or false -> isn't META
    public static boolean isMeta(Entry entry) {
        // Makes a set for teams from entry
        Set<String> heroes = entry.getHeroDetails().stream()
                .map(HeroDetail::getUnitId)
                .collect(Collectors.toSet());

        // returns true if the heroes set contains at least 5 of the meta team in any order. Returns false if it does not match any.
        return META_TEAMS.entrySet().stream()
                .anyMatch(meta ->
                        meta.getKey().stream().filter(heroes::contains).count() >= 5
                        && heroes.containsAll(meta.getValue())
                );
    }

}
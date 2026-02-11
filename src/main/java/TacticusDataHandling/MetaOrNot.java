package TacticusDataHandling;

import java.util.Set;
import java.util.stream.Collectors;

/**
 * MetaOrNot class will distinct if an entry team uses a recognized META team or not.
 */
public class MetaOrNot {

    // Set contains the current recognized META teams
    private static final Set<Set<String>> META_TEAMS = Set.of(
            // Original Custodes shell
            Set.of(
                    "worldKharn",
                    "spaceBlackmane",
                    "bloodDante",
                    "custoTrajann",
                    "custoBladeChampion",
                    "blackAbaddon",
                    "templHelbrecht",
                    "admecDominus"
            ),
            // Jealous Custodes shell
            Set.of(
                    "worldKharn",
                    "emperExultant",
                    "orksWarboss",
                    "custoTrajann",
                    "custoBladeChampion",
                    "blackAbaddon",
                    "custoVexilusPraetor",
                    "admecDominus"
            ),
            // Mechs shell
            Set.of(
                    "admecDominus",
                    "orksWarboss",
                    "admecRuststalker",
                    "admecMarshall",
                    "admecManipulus",
                    "tauMarksman",
                    "custoTrajann",
                    "templHelbrecht",
                    "necroSpyder",
                    "tauCrisis"
            ),
            // Classic Neuro shell
            Set.of(
                    "bloodMephiston",
                    "thousAhriman",
                    "tyranNeurothrope",
                    "thousInfernalMaster",
                    "thousTzaangor",
                    "custoAtlacoya",
                    "genesMagus",
                    "adeptCanoness"
            ),
            // Neuro 2.0 Shell
            Set.of(
                    "thousInfernalMaster",
                    "thousAhriman",
                    "tyranNeurothrope",
                    "genesMagus",
                    "thousTzaangor",
                    "blackAbaddon",
                    "thousSorcerer"
            ),
            // Battlesuit shell
            Set.of(
                    "eldarFarseer",
                    "tauFarsight",
                    "tauDarkstrider",
                    "admecManipulus",
                    "tauCrisis",
                    "ultraCalgar"
            )
    );

    // isMeta compares hero details from the entry, compares the team to META_TEAMS set and either returns true -> is META, or false -> isn't META
    public static boolean isMeta(Entry entry) {
        // Makes a set for teams from entry
        Set<String> heroes = entry.getHeroDetails().stream()
                .map(HeroDetail::getUnitId)
                .collect(Collectors.toSet());

        // returns true if the heroes set contains at least 5 of the meta team in any order. Returns false if it does not match any.
        return META_TEAMS.stream()
                .anyMatch(meta -> heroes.stream().allMatch(meta::contains));
    }

}
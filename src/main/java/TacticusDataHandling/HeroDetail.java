package TacticusDataHandling;

import java.util.HashMap;
import java.util.Map;

/**
 * HeroDetail class fetches all the necessary info of the hero data and contains a hashmap of more commonly used names to replace the original data.
 */
public class HeroDetail {
    // Heroes own specific name in the JSON file
    private String unitId;

    // Heroes own power level in the JSON file - Unused for now
    private int power;

    // Returns unitId for further use
    public String getUnitId() { return unitId; }

    // Unused for now
    public int getPower() { return power; }

    // HashMap contains the unit names from the API data and sets a more used name for them.
    public static final Map<String, String> heroIdToName = new HashMap<>();

    static {
        heroIdToName.put("ultraTigurius", "Tigurius");
        heroIdToName.put("ultraInceptorSgt", "Bellator");
        heroIdToName.put("ultraEliminatorSgt", "Certus");
        heroIdToName.put("adeptRetributor", "Vindicta");
        heroIdToName.put("ultraApothecary", "Incisus");
        heroIdToName.put("necroWarden", "Makhotep");
        heroIdToName.put("deathBlightlord", "Maladus");
        heroIdToName.put("adeptHospitaller", "Isabella");
        heroIdToName.put("deathRotbone", "Rotbone");
        heroIdToName.put("orksWarboss", "Boss Gulgortz");
        heroIdToName.put("admecDominus", "Vitruvius");
        heroIdToName.put("admecRuststalker", "Exitor-Rho");
        heroIdToName.put("tauAunShi", "Aun'Shi");
        heroIdToName.put("admecMarshall", "Tan Gi'da");
        heroIdToName.put("worldKharn", "Kharn");
        heroIdToName.put("tauCrisis", "Re'vas");
        heroIdToName.put("orksRuntherd", "Snotflogga");
        heroIdToName.put("spaceBlackmane", "Ragnar");
        heroIdToName.put("spaceWolfPriest", "Baldr");
        heroIdToName.put("emperFlawlessBlade", "Hascule");
        heroIdToName.put("emperExultant", "Laviscus");
        heroIdToName.put("tauFarsight", "Farsight");
        heroIdToName.put("custoTrajann", "Trajann");
        heroIdToName.put("custoKyrus", "Tyrith");
        heroIdToName.put("bloodDante", "Dante");
        heroIdToName.put("emperKakophonist", "Adamatar");
        heroIdToName.put("genesPatriarch", "The Patermine");
        heroIdToName.put("emperNoiseMarine", "Shiron");
        heroIdToName.put("astraDreir", "Dreir");
        heroIdToName.put("custoAtlacoya", "Atlacoya");
        heroIdToName.put("adeptExorcist", "Exorcist");
        heroIdToName.put("bloodMephiston", "Mephiston");
        heroIdToName.put("custoBladeChampion", "Kariyan");
        heroIdToName.put("custoVexilusPraetor", "Aesoth");
        heroIdToName.put("darkaCompanion", "Forcas");
        heroIdToName.put("worldExecutions", "Tarvakh");
        heroIdToName.put("admecDestroyer", "Sy-gex");
        heroIdToName.put("genesKelermorph", "Judh");
        heroIdToName.put("genesPrimus", "Isaak");
        heroIdToName.put("bloodSanguinary", "Nicodemus");
        heroIdToName.put("tyranParasite", "Parasite");
        heroIdToName.put("genesBiophagus", "Hollan");
        heroIdToName.put("genesMagus", "Xybia");
        heroIdToName.put("bloodIntercessor", "Mataneo");
        heroIdToName.put("tyranBiovore", "Biovore");
        heroIdToName.put("bloodDeathCompany", "Lucien");
        heroIdToName.put("ultraTitus", "Titus");
        heroIdToName.put("darkaTerminator", "Baraqiel");
        heroIdToName.put("worldEightbound", "Azkor");
        heroIdToName.put("worldJakhal", "Macer");
        heroIdToName.put("tauShadowsun", "Shadowsun");
        heroIdToName.put("darkaAsmodai", "Asmodai");
        heroIdToName.put("adeptMorvenn", "Morvenn Vahl");
        heroIdToName.put("worldTerminator", "Wrask");
        heroIdToName.put("astraCreed", "Creed");
        heroIdToName.put("tyranDeathleaper", "Deathleaper");
        heroIdToName.put("darkaAzrael", "Azrael");
        heroIdToName.put("adeptCelestine", "Celestine");
        heroIdToName.put("spaceHound", "Tjark");
        heroIdToName.put("spaceStormcaller", "Njal");
        heroIdToName.put("templChampion", "Jaeger");
        heroIdToName.put("tyranWingedPrime", "Winged Prime");
        heroIdToName.put("adeptCanoness", "Roswitha");
        heroIdToName.put("templAncient", "Thoread");
        heroIdToName.put("darkaHellblaster", "Sarquael");
        heroIdToName.put("templSwordBrother", "Godswyl");
        heroIdToName.put("admecManipulus", "Actus");
        heroIdToName.put("templAggressor", "Burchard");
        heroIdToName.put("astraOrdnance", "Thaddeus");
        heroIdToName.put("eldarMauganRa", "Maugan Ra");
        heroIdToName.put("blackAbaddon", "Abaddon");
        heroIdToName.put("necroOverlord", "Anuphet");
        heroIdToName.put("eldarJainZar", "Jain Zar");
        heroIdToName.put("astraPrimarisPsy", "Sibyll");
        heroIdToName.put("templHelbrecht", "Helbrecht");
        heroIdToName.put("ultraCalgar", "Calgar");
        heroIdToName.put("thousTzaangor", "Yazaghor");
        heroIdToName.put("thousTerminator", "Toth");
        heroIdToName.put("thousInfernalMaster", "Abraxas");
        heroIdToName.put("thousSorcerer", "Thaumachus");
        heroIdToName.put("thousAhriman", "Ahriman");
        heroIdToName.put("deathBlightbringer", "Corrodius");
        heroIdToName.put("astraBullgryn", "Kut");
        heroIdToName.put("tyranNeurothrope", "Neurothrope");
        heroIdToName.put("deathPutrifier", "Pestillian");
        heroIdToName.put("orksNob", "Tanksmasha");
        heroIdToName.put("spaceRockfist", "Arjac");
        heroIdToName.put("spaceWulfen", "Ulf");
        heroIdToName.put("necroPlasmancer", "Thutmose");
        heroIdToName.put("blackPossession", "Archimatos");
        heroIdToName.put("blackTerminator", "Angrax");
        heroIdToName.put("tyranTyrantGuard", "Tyrant");
        heroIdToName.put("astraYarrick", "Yarrick");
        heroIdToName.put("deathTyphus", "Typhus");
        heroIdToName.put("necroSpyder", "Aleph-Null");
        heroIdToName.put("orksKillaKan", "Snappawrecka");
        heroIdToName.put("tauMarksman", "Sho'syl");
        heroIdToName.put("tauDarkstrider", "Darkstrider");
        heroIdToName.put("blackObliterator", "Volk");
        heroIdToName.put("eldarRanger", "Calandis");
        heroIdToName.put("eldarFarseer", "Eldryon");
        heroIdToName.put("orksBigMek", "Gibbascrapz");
        heroIdToName.put("eldarAutarch", "Aethana");
        heroIdToName.put("necroDestroyer", "Imospekh");
        heroIdToName.put("blackHaarken", "Haarken");
        heroIdToName.put("", "");
    }

    // On progress, unused for now.
    public static final Map<String, String> heroIdToImageUrl = new HashMap<>();

    static {
        heroIdToImageUrl.put("ultraTigurius","https://tacticus.wiki.gg/images/Varro_Tigurius_Icon_Large.png?fe76be=&format=original");
        heroIdToImageUrl.put("ultraInceptorSgt", "Bellator");
        heroIdToImageUrl.put("ultraEliminatorSgt", "Certus");
        heroIdToImageUrl.put("adeptRetributor", "Vindicta");
        heroIdToImageUrl.put("ultraApothecary", "Incisus");
        heroIdToImageUrl.put("necroWarden", "Makhotep");
        heroIdToImageUrl.put("deathBlightlord", "Maladus");
        heroIdToImageUrl.put("adeptHospitaller", "Isabella");
        heroIdToImageUrl.put("deathRotbone", "Rotbone");
        heroIdToImageUrl.put("orksWarboss", "Boss Gulgortz");
        heroIdToImageUrl.put("admecDominus", "Vitruvius");
        heroIdToImageUrl.put("admecRuststalker", "Exitor-Rho");
        heroIdToImageUrl.put("tauAunShi", "https://tacticus.wiki.gg/images/Aun%27Shi_Icon_Large.png?7fbdf6=&format=original");
        heroIdToImageUrl.put("admecMarshall", "Tan Gi'da");
        heroIdToImageUrl.put("worldKharn", "https://tacticus.wiki.gg/images/Kharn_Icon_Large.png?c055be=&format=original");
        heroIdToImageUrl.put("tauCrisis", "Re'vas");
        heroIdToImageUrl.put("orksRuntherd", "https://tacticus.wiki.gg/images/Snotflogga_Icon_Large.png?5e2e82=&format=original");
        heroIdToImageUrl.put("spaceBlackmane", "https://tacticus.wiki.gg/images/Ragnar_Icon_Large.png?1aa7e4=&format=original");
        heroIdToImageUrl.put("thousDaemonPrince", "Z'Kar");
        heroIdToImageUrl.put("spaceWolfPriest", "Baldr");
        heroIdToImageUrl.put("emperFlawlessBlade", "Hascule");
        heroIdToImageUrl.put("emperExultant", "https://tacticus.wiki.gg/images/Laviscus_Icon_Large.png?2a3bd0=&format=original");
        heroIdToImageUrl.put("tauFarsight", "Farsight");
        heroIdToImageUrl.put("custoTrajann", "Trajann");
        heroIdToImageUrl.put("custoKyrus", "Tyrith");
        heroIdToImageUrl.put("bloodDante", "https://tacticus.wiki.gg/images/Dante_Icon_Large.png?cec05d=&format=original");
        heroIdToImageUrl.put("emperKakophonist", "Adamatar");
        heroIdToImageUrl.put("genesPatriarch", "The Patermine");
        heroIdToImageUrl.put("orksRukkatrukk", "Rukkatrukk");
        heroIdToImageUrl.put("emperNoiseMarine", "Shiron");
        heroIdToImageUrl.put("astraDreir", "Dreir");
        heroIdToImageUrl.put("custoAtlacoya", "Atlacoya");
        heroIdToImageUrl.put("adeptExorcist", "Exorcist");
        heroIdToImageUrl.put("bloodMephiston", "Mephiston");
        heroIdToImageUrl.put("custoBladeChampion", "https://tacticus.wiki.gg/images/Kariyan_Icon_Large.png?dbfc24=&format=original");
        heroIdToImageUrl.put("custoVexilusPraetor", "Aesoth");
        heroIdToImageUrl.put("darkaCompanion", "Forcas");
        heroIdToImageUrl.put("worldExecutions", "Tarvakh");
        heroIdToImageUrl.put("admecDestroyer", "Sy-gex");
        heroIdToImageUrl.put("genesKelermorph", "Judh");
        heroIdToImageUrl.put("genesPrimus", "Isaak");
        heroIdToImageUrl.put("bloodSanguinary", "Nicodemus");
        heroIdToImageUrl.put("tyranParasite", "Parasite");
        heroIdToImageUrl.put("genesBiophagus", "Hollan");
        heroIdToImageUrl.put("genesMagus", "Xybia");
        heroIdToImageUrl.put("bloodIntercessor", "Mataneo");
        heroIdToImageUrl.put("tyranBiovore", "Biovore");
        heroIdToImageUrl.put("bloodDeathCompany", "Lucien");
        heroIdToImageUrl.put("ultraTitus", "Titus");
        heroIdToImageUrl.put("darkaTerminator", "Baraqiel");
        heroIdToImageUrl.put("worldEightbound", "Azkor");
        heroIdToImageUrl.put("worldJakhal", "Macer");
        heroIdToImageUrl.put("tauShadowsun", "Shadowsun");
        heroIdToImageUrl.put("darkaAsmodai", "Asmodai");
        heroIdToImageUrl.put("adeptMorvenn", "Morvenn Vahl");
        heroIdToImageUrl.put("worldTerminator", "Wrask");
        heroIdToImageUrl.put("astraCreed", "Creed");
        heroIdToImageUrl.put("tyranDeathleaper", "Deathleaper");
        heroIdToImageUrl.put("darkaAzrael", "Azrael");
        heroIdToImageUrl.put("adeptCelestine", "Celestine");
        heroIdToImageUrl.put("spaceHound", "Tjark");
        heroIdToImageUrl.put("spaceStormcaller", "Njal");
        heroIdToImageUrl.put("templChampion", "Jaeger");
        heroIdToImageUrl.put("tyranWingedPrime", "Winged Prime");
        heroIdToImageUrl.put("adeptCanoness", "Roswitha");
        heroIdToImageUrl.put("templAncient", "Thoread");
        heroIdToImageUrl.put("darkaHellblaster", "Sarquael");
        heroIdToImageUrl.put("templSwordBrother", "Godswyl");
        heroIdToImageUrl.put("admecManipulus", "Actus");
        heroIdToImageUrl.put("templAggressor", "Burchard");
        heroIdToImageUrl.put("astraOrdnance", "Thaddeus");
        heroIdToImageUrl.put("eldarMauganRa", "Maugan Ra");
        heroIdToImageUrl.put("blackAbaddon", "Abaddon");
        heroIdToImageUrl.put("necroOverlord", "Anuphet");
        heroIdToImageUrl.put("eldarJainZar", "Jain Zar");
        heroIdToImageUrl.put("astraPrimarisPsy", "Sibyll");
        heroIdToImageUrl.put("templHelbrecht", "Helbrecht");
        heroIdToImageUrl.put("ultraCalgar", "https://tacticus.wiki.gg/images/Marneus_Calgar_Icon_Large.png?a3da4f=&format=original");
        heroIdToImageUrl.put("thousTzaangor", "Yazaghor");
        heroIdToImageUrl.put("thousTerminator", "Toth");
        heroIdToImageUrl.put("thousInfernalMaster", "Abraxas");
        heroIdToImageUrl.put("thousSorcerer", "Thaumachus");
        heroIdToImageUrl.put("thousAhriman", "Ahriman");
        heroIdToImageUrl.put("deathBlightbringer", "Corrodius");
        heroIdToImageUrl.put("astraBullgryn", "Kut");
        heroIdToImageUrl.put("tyranNeurothrope", "Neurothrope");
        heroIdToImageUrl.put("deathPutrifier", "Pestillian");
        heroIdToImageUrl.put("orksNob", "Tanksmasha");
        heroIdToImageUrl.put("spaceRockfist", "Arjac");
        heroIdToImageUrl.put("spaceWulfen", "Ulf");
        heroIdToImageUrl.put("necroPlasmancer", "Thutmose");
        heroIdToImageUrl.put("blackPossession", "Archimatos");
        heroIdToImageUrl.put("blackTerminator", "Angrax");
        heroIdToImageUrl.put("tyranTyrantGuard", "Tyrant");
        heroIdToImageUrl.put("astraYarrick", "Yarrick");
        heroIdToImageUrl.put("deathTyphus", "Typhus");
        heroIdToImageUrl.put("necroSpyder", "Aleph-Null");
        heroIdToImageUrl.put("orksKillaKan", "Snappawrecka");
        heroIdToImageUrl.put("tauMarksman", "Sho'syl");
        heroIdToImageUrl.put("tauDarkstrider", "Darkstrider");
        heroIdToImageUrl.put("blackObliterator", "Volk");
        heroIdToImageUrl.put("eldarRanger", "Calandis");
        heroIdToImageUrl.put("eldarFarseer", "https://tacticus.wiki.gg/images/Eldryon_Icon_Large.png?271d3f=&format=original");
        heroIdToImageUrl.put("orksBigMek", "Gibbascrapz");
        heroIdToImageUrl.put("eldarAutarch", "Aethana");
        heroIdToImageUrl.put("necroDestroyer", "Imospekh");
        heroIdToImageUrl.put("blackHaarken", "Haarken");
        heroIdToImageUrl.put("", "");
    }
}

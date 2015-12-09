package tabeller;

import helpers.Tarningsresultat;

import java.util.ArrayList;


public class Tabeller {

    private static final String[][] zoner = new String[][]{
            new String[]{"Tät skog","Tät skog","Busklandskap","Busklandskap","Träsk","Träsk"},
            new String[]{"Död skog","Död skog","Asköken","Asköken","Enorm krater","Fält av glas"},
            new String[]{"Övervusna ruiner","Förfallna ruiner","Öde industrilandskap","Tät skog","Busklandskap","Träsk"},
            new String[]{"Död skog","Asköken","Övervuxna ruiner","Söndervittrade ruiner","Förfallna ruiner","Välbevarade ruiner"},
            new String[]{"Öde industrilandskap","Övervuxna ruiner","Övervuxna ruiner","Söndervittrade ruiner","Söndervittrade ruiner","Förfallna ruiner"},
            new String[]{"Förfallna ruiner","Välbevarade ruiner","Välbevarade ruiner","Öde industrilandskap","Öde industrilandskap","Bosättning"},

    };

    private static final String[][] ruinstandard = new String[][]{
            new String[]{"Affärsgalleria","Badhus","Bensinstation","Biograf","Bostadsområde","Busstation"},
            new String[]{"Flygplansvrak","Förvildad park","Höghusruin","Jaktaffär","Kontorskomplex","Krater"},
            new String[]{"Kråkslott","Kyrka","Lekplats","Miljonprogram","Motorväg","Museum"},
            new String[]{"Nöjesfält","Parkeringshus","Polisstation","Radiostation","Raserad bro","Skyddsrum"},
            new String[]{"Slagfält","Snabbmatsrestaurang","Sporthall","Sjukhus","Stridsvagn","Teater"},
            new String[]{"Tunnelbana","Tågstation","Snabbköp","Vägtunnel","Övergiven skola","Ödelagd marina"},

    };

    private static final String[][] ruinindustri = new String[][]{
            new String[]{"Fabrik","Fabrik","Fabrik","Fartygsvrak","Fartygsvrak","Fartygsvrak"},
            new String[]{"Kraftledning","Kraftledning","Kraftledning","Militärbas","Militärbas","Militärbas"},
            new String[]{"Pipeline","Pipeline","Pipeline","Radiomast","Radiomast","Radiomast"},
            new String[]{"Raffinaderi","Raffinaderi","Raffinaderi","Reningsverk","Reningsverk","Reningsverk"},
            new String[]{"Skjutbana","Skjutbana","Skjutbana","Soptipp","Soptipp","Soptipp"},
            new String[]{"Vindkraftverk","Vindkraftverk","Vindkraftverk","Oljecistern","Oljecistern","Oljecistern"},

    };

    private static final String[][] rotniva = new String[][]{
            new String[]{"Rötnivå 0","Rötnivå 1","Rötnivå 1","Rötnivå 1","Rötnivå 1","Rötnivå 2"},

    };

    public static String getZon(ArrayList<Tarningsresultat>kast){
        return zoner[kast.get(0).getResultat()-1][kast.get(1).getResultat()-1];
    }

    public static String getRuinstandard(ArrayList<Tarningsresultat>kast){
        return ruinstandard[kast.get(0).getResultat()-1][kast.get(1).getResultat()-1];
    }

    public static String getRuinindustri(ArrayList<Tarningsresultat>kast){
        return ruinindustri[kast.get(0).getResultat()-1][kast.get(1).getResultat()-1];
    }

    public static String getRotniva(ArrayList<Tarningsresultat>kast){
        return rotniva[kast.get(0).getResultat()-1][kast.get(1).getResultat()-1];

    }
}


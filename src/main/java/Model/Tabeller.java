package Model;

import java.util.ArrayList;

/*
Klass med tabeller. Klassen kan endast användas igenom getResult. getResult har argumenten Table(enum) och ArrayList<Integer>.
Detta returnerar en string. För exempel på använding se main metoden längst ner.
 */

public class Tabeller {

    public enum Table {
        zone,
        ruinStandard,
        ruinIndustri,
        rotniva
    }

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

    public String getResult(Table t, ArrayList<Integer> diceRolls) {
        switch(t) {
            case zone: return getZon(diceRolls);
            case ruinIndustri: return getRuinindustri(diceRolls);
            case ruinStandard: return getRuinstandard(diceRolls);
            case rotniva: return getRotniva(diceRolls);
            default: return getZon(diceRolls);
        }
    }

    private static String getZon(ArrayList<Integer>kast){
        return zoner[kast.get(0)][kast.get(1)];
    }

    private static String getRuinstandard(ArrayList<Integer>kast){
        return ruinstandard[kast.get(0)][kast.get(1)];
    }

    private static String getRuinindustri(ArrayList<Integer>kast){
        return ruinindustri[kast.get(0)][kast.get(1)];
    }

    private static String getRotniva(ArrayList<Integer>kast){
        return rotniva[0][kast.get(1)];
    }

    // Testing for Tabeller class
    public static void main(String[] args) {
        Tabeller t = new Tabeller();
        DiceRoller dr = new DiceRoller();

        ArrayList<Integer> rolls = dr.roll(2);
       /* System.out.println(rolls.get(0));
        System.out.println(rolls.get(1));*/
        System.out.println(t.getResult(Table.rotniva,rolls));
    }
}


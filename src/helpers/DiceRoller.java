package helpers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;


public class DiceRoller {

    public static ArrayList<Tarningsresultat> Roll (int antalTarningar){
        ArrayList<Tarningsresultat> resultat = new ArrayList<Tarningsresultat>();
        Random rnd = new Random();
        for (int i=0; i<antalTarningar; i++){
            int roll = rnd.nextInt(6)+1;
            resultat.add(new Tarningsresultat(roll));
        }
        return resultat;
    }
}
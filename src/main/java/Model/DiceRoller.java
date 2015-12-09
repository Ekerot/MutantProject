package Model;

import java.util.ArrayList;
import java.util.Random;


public class DiceRoller {

    public ArrayList<Integer> roll (int antalTarningar){
        ArrayList<Integer> resultat = new ArrayList<Integer>();
        Random rnd = new Random();
        for (int i=0; i<antalTarningar; i++){
            int roll = rnd.nextInt(6);
            resultat.add(roll);
        }
        return resultat;
    }
}
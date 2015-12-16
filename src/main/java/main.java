import Controller.MutantController;
import Model.DiceRoller;
import Model.Tabeller;

import java.util.ArrayList;

/**
 * Created by Ludde on 2015-12-16.
 */
public class main {


    public static void main(String[] args) {
        DiceRoller dr = new DiceRoller();
        Tabeller t = new Tabeller();
        MutantController mc = new MutantController(dr,t);

        for(int i = 0; i<10; i++) {
            System.out.println( mc.getDiceResults());
        }


    }
}

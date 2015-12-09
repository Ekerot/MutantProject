package Controller;

import Model.DiceRoller;
import Model.Tabeller;
import Model.Tabeller.Table;

import java.util.ArrayList;

/**
 * Created by Ludde on 2015-12-09.
 */
public class MutantController {

    DiceRoller dice = new DiceRoller();

    public ArrayList<Integer> getDiceResults() {
        return dice.roll(2);

    }

    public static void main(String[] args) {
        MutantController mc = new MutantController();
        Tabeller t = new Tabeller();
        DiceRoller dr = new DiceRoller();

        ArrayList<Integer> rolls = new ArrayList<Integer>();
        rolls = dr.roll(2);
        System.out.println(rolls.get(0));
        System.out.println(rolls.get(1));

        System.out.println(t.getResult(Table.ruinIndustri,rolls));
    }
}

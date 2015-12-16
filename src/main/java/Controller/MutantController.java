package Controller;

import Model.DiceRoller;
import Model.Tabeller;
import Model.Tabeller.Table;

import java.util.ArrayList;

/**
 * Created by Ludde on 2015-12-09.
 */
public class MutantController {

    DiceRoller diceRoller;
    Tabeller tables;

    public MutantController(DiceRoller dice, Tabeller tables) {
        this.diceRoller = dice;
        this.tables = tables;
    }

    public ArrayList<Integer> getDiceResults() {
        return diceRoller.roll(2);
    }

    public String getResultOfRoll(Table t) {
        return tables.getResult(t, diceRoller.roll(2));
    }




}

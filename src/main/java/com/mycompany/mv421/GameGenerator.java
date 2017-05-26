package com.mycompany.mv421;

import java.util.ArrayList;
import java.util.Random;

public class GameGenerator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        generateSoloGame().gameSequence();
    }
    
    public static Game generateSoloGame(){
        ArrayList<Turn> gameTurns = new ArrayList<Turn>();
        for (int turnId = 1; turnId <= Rules.NB_TURN; turnId++)
            gameTurns.add(generateTurn());
        return new Game(gameTurns);
    }
    
    public static Turn generateTurn(){
        Random rand = new Random();
        int[] diceValueForTurn = {
            rand.nextInt((Dice.MAX - Dice.MIN) + 1) + Dice.MIN,
            rand.nextInt((Dice.MAX - Dice.MIN) + 1) + Dice.MIN,
            rand.nextInt((Dice.MAX - Dice.MIN) + 1) + Dice.MIN
        };
        return new Turn(diceValueForTurn);
    }
}

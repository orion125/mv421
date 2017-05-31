package ch.hesge.capitao.mv421;

import java.util.ArrayList;
import java.util.Random;

public class GameGenerator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        generateSoloGame().gameSequence();
        System.out.println("----------------------------------------------------");
        ArrayList<Joueur> players = new ArrayList<>();
        players.add(new Joueur("Player1", "-"));
        players.add(new Joueur("Player2", "-"));
        players.add(new Joueur("Player3", "-"));
        generateMultiPlayerGame(players).gameSequence();
    }
    
    public static Game generateSoloGame(){
        ArrayList<Turn> gameTurns = new ArrayList<Turn>();
        for (int turnId = 1; turnId <= Rules.NB_TURN; turnId++)
            gameTurns.add(generateTurn());
        return new Game(gameTurns);
    }
    
    public static Game generateMultiPlayerGame(ArrayList<Joueur> players){
        ArrayList<Turn> gameTurns = new ArrayList<Turn>();
        for (int turnId = 1; turnId <= Rules.NB_TURN; turnId++){
            for (Joueur j : players) gameTurns.add(generateTurnForPlayer(j));
        }
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
    
      public static Turn generateTurnForPlayer(Joueur j){
        Random rand = new Random();
        int[] diceValueForTurn = {
            rand.nextInt((Dice.MAX - Dice.MIN) + 1) + Dice.MIN,
            rand.nextInt((Dice.MAX - Dice.MIN) + 1) + Dice.MIN,
            rand.nextInt((Dice.MAX - Dice.MIN) + 1) + Dice.MIN
        };
        return new Turn(diceValueForTurn, j);
    }
}

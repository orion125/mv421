package ch.hesge.capitao.mv421;

import java.util.ArrayList;

public class Game {
    ArrayList<Turn> gameTurns;

    public Game(ArrayList<Turn> gameTurns) {
        this.gameTurns = gameTurns;
    }
    
    public boolean gameSequence(){
        for (Turn t : gameTurns){
            if (t.isGameWon()){
                System.out.println("Tour gagné !! : "
                        +t.getGameDices().get(0) + " "
                        +t.getGameDices().get(1) + " "
                        +t.getGameDices().get(2));
                return true;
            }else {
                System.out.println("Tour perdu !! : "
                        +t.getGameDices().get(0) + " "
                        +t.getGameDices().get(1) + " "
                        +t.getGameDices().get(2));
            }
        }  
        System.out.println("Jeu perdu !! ");
        return false;
    }
    
}

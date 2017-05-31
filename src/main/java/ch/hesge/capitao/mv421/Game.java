package ch.hesge.capitao.mv421;

import java.util.ArrayList;

public class Game {
    private ArrayList<Turn> gameTurns;
    private boolean modeNP = false; // true si plus d'un joueur

    public Game(ArrayList<Turn> gameTurns) {
        this(gameTurns,false);
    }
    
    public Game(ArrayList<Turn> gameTurns, boolean modeNP) {
        this.gameTurns = gameTurns;
        this.modeNP = modeNP;
    }
    
    public boolean gameSequence(){
        for (Turn t : gameTurns){
            String playerTurn = "";
            if (t.getPlayerOfTurn() != null) playerTurn += "Joueur "+t.getPlayerOfTurn().toString()+" a ";
            else playerTurn += "Vous avez ";
            if (t.isGameWon()){
                System.out.println(playerTurn+"gagné à la partie!! : "
                        +t.getGameDices().get(0) + " "
                        +t.getGameDices().get(1) + " "
                        +t.getGameDices().get(2));
                return true;
            }else {
                System.out.println(playerTurn+"perdu à ce tour !! : "
                        +t.getGameDices().get(0) + " "
                        +t.getGameDices().get(1) + " "
                        +t.getGameDices().get(2));
            }
        } 
        if (modeNP) System.out.println("Exéquo !!");
        else System.out.println("Jeu perdu !! ");
        return false;
    }

    public ArrayList<Turn> getGameTurns() {
        return gameTurns;
    }

    public void setGameTurns(ArrayList<Turn> gameTurns) {
        this.gameTurns = gameTurns;
    }

    public boolean isModeNP() {
        return modeNP;
    }

    public void setModeNP(boolean modeNP) {
        this.modeNP = modeNP;
    }
    
}

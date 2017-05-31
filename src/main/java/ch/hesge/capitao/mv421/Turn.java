package ch.hesge.capitao.mv421;

import java.util.ArrayList;

public class Turn {
    private ArrayList<Dice> gameDices;
    private Joueur playerOfTurn = null;

    public Turn(ArrayList<Dice>  gameDices) {
        this(gameDices, null);
    }

    public Turn(ArrayList<Dice> gameDices, Joueur playerOfTurn) {
        this.playerOfTurn = playerOfTurn;
        this.gameDices = gameDices;
    }
    
     public Turn(int[] gameDices) {
        this(gameDices,null);
    }
    
    public Turn(int[] gameDices, Joueur playerOfTurn) {
        this.playerOfTurn = playerOfTurn;        
        this.gameDices = new ArrayList<>();
        for (int i : gameDices)
            this.gameDices.add(new Dice(i));
    }
    
    public boolean isGameWon(){
        Rules.testVictory(gameDices);
        return Rules.victory();
    }

    public Turn() {
    }

    public ArrayList<Dice> getGameDices() {
        return gameDices;
    }

    public Joueur getPlayerOfTurn() {
        return playerOfTurn;
    }

    public void setPlayerOfTurn(Joueur playerOfTurn) {
        this.playerOfTurn = playerOfTurn;
    }
    
}

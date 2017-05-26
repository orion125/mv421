package com.mycompany.mv421;

import java.util.ArrayList;

public class Turn {
    private ArrayList<Dice> gameDices;

    public Turn(ArrayList<Dice>  gameDices) {
        this.gameDices = gameDices;
    }
    
     public Turn(int[]  gameDices) {
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
    
}

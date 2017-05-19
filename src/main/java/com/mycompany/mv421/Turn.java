/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mv421;

import java.util.ArrayList;

/**
 *
 * @author JonathanCapitao
 */
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
        return (gameDices.contains(new Dice(4)) &&
            gameDices.contains(new Dice(2)) &&    
            gameDices.contains(new Dice(1)));
    }

    public Turn() {
    }

    public ArrayList<Dice> getGameDices() {
        return gameDices;
    }
    
}

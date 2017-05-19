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
public class Game {
    ArrayList<Turn> gameTurns;

    public Game(ArrayList<Turn> gameTurns) {
        this.gameTurns = gameTurns;
    }
    
    public boolean gameSequence(){
        for (Turn t : gameTurns){
            if (t.isGameWon()){
                System.out.println("Tour gagner : "
                        +t.getGameDices().get(0) + " "
                        +t.getGameDices().get(1) + " "
                        +t.getGameDices().get(2));
                return true;
            }else {
                System.out.println("Tour perdu : "
                        +t.getGameDices().get(0) + " "
                        +t.getGameDices().get(1) + " "
                        +t.getGameDices().get(2));
            }
        }    
        return false;
    }
    
}

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
    ArrayList<Des> gameDices;

    public Turn(ArrayList<Des>  gameDices) {
        this.gameDices = gameDices;
    }
    
     public Turn(int[]  gameDices) {
        this.gameDices = new ArrayList<>();
        for (int i : gameDices)
            this.gameDices.add(new Des(i));
    }
    
    public boolean isGameWon(){
        return (gameDices.contains(new Des(4)) &&
            gameDices.contains(new Des(2)) &&    
            gameDices.contains(new Des(1)));
    }
    
}

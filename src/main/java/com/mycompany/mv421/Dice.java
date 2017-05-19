/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mv421;

/**
 *
 * @author JonathanCapitao
 */
public class Dice {
    private int value;

    public int getValue() {
        return value;
    }

    public Dice() {
    }

    public Dice(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        return ((Dice)obj).getValue() == this.getValue();
    }
   
   
}

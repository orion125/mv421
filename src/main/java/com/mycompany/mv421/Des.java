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
public class Des {
   private int value;

    public int getValue() {
        return value;
    }

    public Des() {
    }

    public Des(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        return ((Des)obj).getValue() == this.getValue();
    }
   
   
}

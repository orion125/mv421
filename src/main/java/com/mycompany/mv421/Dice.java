package com.mycompany.mv421;

public class Dice {
    public final static int MAX = 6;
    public final static int MIN = 1;
    
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

    @Override
    public String toString() {
        return "Dice{" + value + '}';
    }
   
   
}

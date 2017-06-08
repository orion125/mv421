/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hesge.capitao.mv421;

import java.util.ArrayList;

/**
 *
 * @author JonathanCapitao
 */
public class Rules {
    
    
    public static ArrayList<Boolean> victoryConditions = new ArrayList<Boolean>();
    
    public static final int NB_TURN = 3;
    
    public static void createVictoryConditionForDices(ArrayList<Dice> gameDices){
        victoryConditions = new ArrayList<Boolean>();
        victoryConditions.add(
                gameDices.contains(new Dice(4)) &&
                gameDices.contains(new Dice(2)) &&
                gameDices.contains(new Dice(1))
        );
        victoryConditions.add( // rule 555
                gameDices.get(0).getValue() == 5 &&
                gameDices.get(1).getValue() == 5 &&
                gameDices.get(2).getValue() == 5 
        );
        
    }
    
    public static boolean victory (){
        for (Boolean b : victoryConditions)
            if (b) return true;
        return false;
    }
}

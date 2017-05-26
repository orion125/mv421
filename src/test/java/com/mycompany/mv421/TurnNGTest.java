package com.mycompany.mv421;

import static org.testng.Assert.*;

/**
 *
 * @author JonathanCapitao
 */
public class TurnNGTest {


    /**
     * Test of isGameWon method, of class Turn.
     */
    @org.testng.annotations.Test
    public void testIsGameWon() {
        System.out.println("isGameWon");
        int[] test = {4,2,1};
        int[] test2 = {2,4,1};
        int[] test3 = {1,2,4};
        int[] test4 = {1,4,2};
        int[] test5 = {3,3,3};
        int[] test6 = {9,7,5};
        int[] test7 = {4,4,4};
        assertTrue(new Turn(test).isGameWon());
        assertTrue(new Turn(test2).isGameWon());
        assertTrue(new Turn(test3).isGameWon());
        assertTrue(new Turn(test4).isGameWon());
        assertFalse(new Turn(test5).isGameWon());
        assertFalse(new Turn(test6).isGameWon());
        assertFalse(new Turn(test7).isGameWon());
    }
    
}

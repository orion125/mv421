/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mv421;

import java.util.ArrayList;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author JonathanCapitao
 */
public class GameNGTest {
    // variable pour les tests
        int[] test = {4,2,1};
        int[] test2 = {2,4,1};
        int[] test3 = {1,2,4};
        int[] test4 = {1,4,2};
        int[] test5 = {3,3,3};
        int[] test6 = {6,1,5};
        int[] test7 = {4,1,5};
        int[] test8 = {6,1,2};
        int[] test9 = {4,4,4};
        
        ArrayList<Turn> massTurnPourTest = new ArrayList<>();
        ArrayList<Turn> testTurns1 = new ArrayList<>();
        ArrayList<Turn> testTurns2 = new ArrayList<>();
        ArrayList<Turn> testTurns3 = new ArrayList<>();
        ArrayList<Turn> testTurns4 = new ArrayList<>();
        ArrayList<Turn> testTurns5 = new ArrayList<>();
        ArrayList<Turn> testTurns6 = new ArrayList<>();
            
    public GameNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        massTurnPourTest.add(new Turn(test));
        massTurnPourTest.add(new Turn(test2));
        massTurnPourTest.add(new Turn(test3));
        massTurnPourTest.add(new Turn(test4));
        massTurnPourTest.add(new Turn(test5));
        massTurnPourTest.add(new Turn(test6));
        massTurnPourTest.add(new Turn(test7));
        massTurnPourTest.add(new Turn(test8));
        massTurnPourTest.add(new Turn(test9));
        
        testTurns1.add(massTurnPourTest.get(0));
        
        testTurns2.add(massTurnPourTest.get(8));
        testTurns2.add(massTurnPourTest.get(7));
        testTurns2.add(massTurnPourTest.get(1));
        
        testTurns3.add(massTurnPourTest.get(6));
        testTurns3.add(massTurnPourTest.get(4));
        testTurns3.add(massTurnPourTest.get(5));
        
        testTurns4.add(massTurnPourTest.get(8));
        testTurns4.add(massTurnPourTest.get(2));
        
        testTurns5.add(massTurnPourTest.get(1));
        
        testTurns6.add(massTurnPourTest.get(3));
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of gameSequence method, of class Game.
     */
    @Test
    public void testGameSequence() {
        System.out.println("gameSequence"); 
                
        assertTrue(new Game(testTurns1).gameSequence());
        assertTrue(new Game(testTurns2).gameSequence());
        assertFalse(new Game(testTurns3).gameSequence());
        assertTrue(new Game(testTurns4).gameSequence());
        assertTrue(new Game(testTurns5).gameSequence());
        assertTrue(new Game(testTurns6).gameSequence());
    }
    
}

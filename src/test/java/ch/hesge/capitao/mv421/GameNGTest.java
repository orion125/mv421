package ch.hesge.capitao.mv421;

import java.util.ArrayList;
import java.util.Dictionary;
import org.mockito.Mockito;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GameNGTest {
    // variable pour les tests
        
        ArrayList<Turn> massTurnPourTest = new ArrayList<>();
        ArrayList<Turn> testTurns1 = new ArrayList<>();
        ArrayList<Turn> testTurns2 = new ArrayList<>();
        ArrayList<Turn> testTurns3 = new ArrayList<>();
        ArrayList<Turn> testTurns4 = new ArrayList<>();
        ArrayList<Turn> testTurns5 = new ArrayList<>();
        ArrayList<Turn> testTurns6 = new ArrayList<>();
 
    @BeforeMethod
    public void setUpMethod() throws Exception {
        ArrayList<Dice> test = new ArrayList<Dice>();
        ArrayList<Dice> test2 = new ArrayList<Dice>();
        ArrayList<Dice> test3 = new ArrayList<Dice>();
        ArrayList<Dice> test4 = new ArrayList<Dice>();
        ArrayList<Dice> test5 = new ArrayList<Dice>();
        ArrayList<Dice> test6 = new ArrayList<Dice>();
        ArrayList<Dice> test7 = new ArrayList<Dice>();
        ArrayList<Dice> test8 = new ArrayList<Dice>();
        ArrayList<Dice> test9 = new ArrayList<Dice>();
        
        Dice d1 = Mockito.mock(Dice.class);
        Dice d2 = Mockito.mock(Dice.class);
        Dice d3 = Mockito.mock(Dice.class);
        Dice d4 = Mockito.mock(Dice.class);
        Dice d5 = Mockito.mock(Dice.class);
        Dice d6 = Mockito.mock(Dice.class);
        
        
        Mockito.when(d1.getValue()).thenReturn(1);
        Mockito.when(d2.getValue()).thenReturn(2);
        Mockito.when(d3.getValue()).thenReturn(3);
        Mockito.when(d4.getValue()).thenReturn(4);
        Mockito.when(d5.getValue()).thenReturn(5);
        Mockito.when(d6.getValue()).thenReturn(6);
        
        test.add(d4);test.add(d2);test.add(d1);
        test2.add(d2);test2.add(d4);test2.add(d1);
        test3.add(d1);test3.add(d2);test3.add(d4);
        test4.add(d1);test4.add(d4);test4.add(d2);
        test5.add(d3);test5.add(d3);test5.add(d3);
        test6.add(d6);test6.add(d1);test6.add(d5);
        test7.add(d4);test7.add(d1);test7.add(d5);
        test8.add(d6);test8.add(d1);test8.add(d2);
        test9.add(d4);test9.add(d4);test9.add(d4);
        
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

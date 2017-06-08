package ch.hesge.capitao.mv421;

import java.util.ArrayList;
import org.mockito.Mockito;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RulesNGTest {
    
    ArrayList<Dice> gameDicesWin = new ArrayList<>();
    ArrayList<Dice> gameDicesWin2 = new ArrayList<>();
    ArrayList<Dice> gameDicesWin3 = new ArrayList<>();
    ArrayList<Dice> gameDicesLost = new ArrayList<>();
    ArrayList<Dice> gameDicesLost2 = new ArrayList<>();
    
    public RulesNGTest() {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
                  
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
        
        gameDicesWin.add(d4);gameDicesWin.add(d2);gameDicesWin.add(d1);
        gameDicesWin2.add(d2);gameDicesWin2.add(d4);gameDicesWin2.add(d1);
        gameDicesWin2.add(d5);gameDicesWin2.add(d5);gameDicesWin2.add(d5);
        
        gameDicesLost.add(d2);gameDicesLost.add(d4);gameDicesLost.add(d4);
        gameDicesLost2.add(d3);gameDicesLost2.add(d6);gameDicesLost2.add(d5);
    }


    /**
     * Test of victory method, of class Rules.
     */
    @Test
    public void testVictory() {
        Rules.createVictoryConditionForDices(gameDicesWin);
        assertTrue(Rules.victory());
    }
    
    /**
    * Test of victory method, of class Rules. Winning dice disordered
    */
    @Test
    public void testVictoryDisordered() {
        Rules.createVictoryConditionForDices(gameDicesWin2);
        assertTrue(Rules.victory());
    }
    
    /**
    * Test of victory method, of class Rules. Loosing dice
    */
    @Test
    public void testVictoryLostDice() {
        Rules.createVictoryConditionForDices(gameDicesLost);
        assertFalse(Rules.victory());
        Rules.createVictoryConditionForDices(gameDicesLost2);
        assertFalse(Rules.victory());
    }
    
}

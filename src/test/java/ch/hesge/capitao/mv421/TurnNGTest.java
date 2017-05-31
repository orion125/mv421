package ch.hesge.capitao.mv421;

import java.util.ArrayList;
import org.mockito.Mockito;
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
        
        ArrayList<Dice> test = new ArrayList<Dice>(); 
        ArrayList<Dice> test2 = new ArrayList<Dice>(); 
        ArrayList<Dice> test3 = new ArrayList<Dice>(); 
        ArrayList<Dice> test4 = new ArrayList<Dice>(); 
        ArrayList<Dice> test5 = new ArrayList<Dice>(); 
        ArrayList<Dice> test6 = new ArrayList<Dice>(); 
        ArrayList<Dice> test7 = new ArrayList<Dice>(); 
        
        test.add(d4);test.add(d2);test.add(d1);
        test2.add(d2);test2.add(d4);test2.add(d1);
        test3.add(d1);test3.add(d2);test3.add(d4);
        test4.add(d1);test4.add(d4);test4.add(d2);
        test5.add(d3);test5.add(d3);test5.add(d3);
        test6.add(d6);test6.add(d1);test6.add(d5);
        test7.add(d4);test7.add(d4);test7.add(d4);
        
        assertTrue(new Turn(test).isGameWon());
        assertTrue(new Turn(test2).isGameWon());
        assertTrue(new Turn(test3).isGameWon());
        assertTrue(new Turn(test4).isGameWon());
        assertFalse(new Turn(test5).isGameWon());
        assertFalse(new Turn(test6).isGameWon());
        assertFalse(new Turn(test7).isGameWon());
    }
    
}

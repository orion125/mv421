/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hesge.capitao.mv421;

import java.util.ArrayList;
import org.mockito.Mockito;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Nightwing
 */
public class GameGeneratorNGTest {
    
    public GameGeneratorNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }


    /**
     * Test of generateSoloGame method, of class GameGenerator.
     */
    @Test
    public void testGenerateSoloGame() {
        System.out.println("generateSoloGame");
        Game result = GameGenerator.generateSoloGame();
        assertNotNull(result);
    }

    /**
     * Test of generateMultiPlayerGame method, of class GameGenerator.
     */
    @Test
    public void testGenerateMultiPlayerGame() {
        System.out.println("generateMultiPlayerGame");
        ArrayList<Joueur> players = new ArrayList<>();
        
        Joueur p1 = Mockito.mock(Joueur.class);
        Joueur p2 = Mockito.mock(Joueur.class);
        
        Mockito.when(p1.toString()).thenReturn("John");
        Mockito.when(p2.toString()).thenReturn("Francis");
        
        players.add(p1);players.add(p2);
        Game result = GameGenerator.generateMultiPlayerGame(players);
        assertNotNull(result);
    }

    /**
     * Test of generateTurn method, of class GameGenerator.
     */
    @Test
    public void testGenerateTurn() {
        System.out.println("generateTurn");
        Turn result = GameGenerator.generateTurn();
        assertNotNull(result);
    }

    /**
     * Test of generateTurnForPlayer method, of class GameGenerator.
     */
    @Test
    public void testGenerateTurnForPlayer() {
        System.out.println("generateTurnForPlayer");
        
        Joueur p1 = Mockito.mock(Joueur.class);
        Mockito.when(p1.toString()).thenReturn("John");
        
        Turn result = GameGenerator.generateTurnForPlayer(p1);
        assertNotNull(result);
        assertNotNull(result.getPlayerOfTurn());
        assertNotNull(result.getGameDices());
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Joueur;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import tigre.Fermier;
import tigre.Fleuves;
import tigre.Plateau;

/**
 *
 * @author Alphonse
 */
public class TestJoueur {
    
    public TestJoueur() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void hello() {}
    
    @Test
     public void TestPlacer_chef(){
         Plateau p=new Plateau(20,10);
         Joueur j=new Joueur();
         Fermier f=new Fermier(2,"black");
          p.grille[10][9] = new Fleuves();
         j.placer_chef(f, 10, 9, p);
         
     }
     
     
}

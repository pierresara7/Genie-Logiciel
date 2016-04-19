/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Plateau;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import tigre.*;
import tigre.Plateau;
import tigre.Tuiles;

/**
 *
 * @author Alphonse
 */
public class TestGrille {
    
    public TestGrille() {
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
    // @Test
    // public void hello() {}
    
    @Test 
     public void Test_deplacer_tuile(){
                Plateau plateau = new Plateau(20, 10);
        plateau.setPlateau(new Tuiles("mich", 2,36), 0, 0);
       plateau.setPlateau(new Chefs("dfa", 4,36,"black"), 0, 1);
          plateau.deplacer_tuile(new Chefs("vv", 2,36,"black"), 2, 2);
         plateau.deplacer_tuile(new Tuiles("vv", 55,36), 5, 2);
     }
     
     @Test
     public void Test_ajouter_grille_royaume(){
                         Plateau plateau = new Plateau(20, 10);
       plateau.setPlateau(new Temple(2), 2, 0);
       plateau.setPlateau(new Chefs("dfa", 4,36,"black"), 2, 1);
       Royaume r=new Royaume();
       plateau.ajouter_grille_royaume2(2, 3, r, plateau);
       

     }
  
            
}

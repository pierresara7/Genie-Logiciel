/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import tigre.Chefs;
import tigre.Plateau;
import tigre.Tuiles;

/**
 *
 * @author Alphonse
 */
public class TestPlateau {
    
    public TestPlateau() {
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
    public void test_deplacer_tuile(){
               Plateau plateau = new Plateau(20, 10);
               assertEquals(null,plateau);
       
       
   
    }
}

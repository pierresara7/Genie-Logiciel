/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Joueur;

import JSON.GenerateurJSON;
import java.io.IOException;
import java.net.ServerSocket;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

import tigre.*;
import tigre.Joueur;
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
     public void TestPlacer_chef(){
         Plateau p = new Plateau(10,14);
         Joueur j=new Joueur("A");
         Fermier f=new Fermier(2,"black");
         // toutes les condition pour pour placer chef ne sont pas valide;
         j.placer_chef(f, 9, 9, p); 
         // toutes les condition pour pour placer chef sont valide;
         assertTrue(p.cote_temple(1,0));
         j.placer_chef(f, 1, 0, p);

         
     }
     
     @Test
     public void TestPoser_CatatropheTem(){
         Plateau p = new Plateau(10,14);
         Joueur j=new Joueur("A");
         Temple t=new Temple(5);
         p.setPlateau(t, 5, 8);
         Roi r=new Roi(1,"black");
         p.setPlateau(r, 5, 9);
        Catastrophe c=new Catastrophe(2);
        j.poser_catastrophe(5, 8, c, p);
        j.poser_catastrophe(5, 9, c, p);


     }
      @Test
     public void TestPoser_Catatrophe(){
         Plateau p = new Plateau(10,14);
         Joueur j=new Joueur("A");
        // Temple t=new Temple(5);
         //p.setPlateau(t, 5, 8);
        Catastrophe c=new Catastrophe(2);
        j.poser_catastrophe(5, 8, c, p);

     }
     @Test
     public void TestPoser_tuiles(){
          Plateau p = new Plateau(10,14);
         Joueur j=new Joueur("A");
          Temple t=new Temple(5);
          j.poser_tuile_civilisation(p, t, 5, 2);
          Ferme f=new Ferme(2);
        j.poser_tuile_civilisation(p, t, 3, 0);

     }
     
     @Test 
     public void Test_detection_Conflit(){
         
     }
     @Test
     public void TestSaveScore(){
        Server s=new Server();
         Joueur j=new Joueur("A");
         Joueur j2=new Joueur("B");
         Joueur j3=new Joueur("C");
         Joueur j4=new Joueur("D");
         s.insertCli(j);
         s.insertCli(j2);
         s.insertCli(j3);
         s.insertCli(j4);        
      GenerateurJSON g=new GenerateurJSON();
      g.Save(s);
     }
    
}

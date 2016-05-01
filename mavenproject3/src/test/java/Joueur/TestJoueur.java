/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Joueur;

<<<<<<< HEAD
=======
import JSON.GenerateurJSON;
>>>>>>> refs/remotes/origin/Alphonse
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
<<<<<<< HEAD
import tigre.Fermier;
import tigre.Fleuves;
import tigre.Plateau;

=======

import tigre.*;
import tigre.Joueur;
>>>>>>> refs/remotes/origin/Alphonse
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
<<<<<<< HEAD
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
     
=======
    
    
    @Test
     public void TestPlacer_chef(){
         Plateau p = new Plateau(10,14);
         Joueur j=new Joueur("A");
         Fermier f=new Fermier(2,"black");
         j.placer_chef(f, 9, 9, p);
         
     }
     
     @Test
     public void TestPoser_CatatropheTem(){
         Plateau p = new Plateau(10,14);
         Joueur j=new Joueur("A");
         Temple t=new Temple(5);
         p.setPlateau(t, 5, 8);
        Catastrophe c=new Catastrophe(2);
        j.poser_catastrophe(5, 8, c, p);

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
     }
     
     @Test 
     public void Test_detection_Conflit(){
         
     }
     @Test
     public void TestSaveScore(){
         Serveur s=new Serveur();
         Plateau p = new Plateau(10,14);
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
>>>>>>> refs/remotes/origin/Alphonse
     
}

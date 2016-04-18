/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tigre;
import java.util.Random ;


/**
 *
 * @author mohamad
 */
public class Tigre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
       Plateau plateau = new Plateau(11, 16);
       
       
       
       java.util.Random rand=new java.util.Random();
       
       
       
      // plateau.setPlateau(new Tuiles("mich", 2), 0, 0);
       // plateau.setPlateau(new Chefs("dfa", 4), 0, 1);
        // plateau.deplacer_tuile(new Chefs("vv", 2), 2, 2);
         //plateau.deplacer_tuile(new Tuiles("vv", 55), 5, 2);
       plateau.position_fleuve();
       plateau.position_temple();
      
       plateau.afficher();
      
        
        
        
        
        
        
        
        
        
     
             
    }
                
                
    
}

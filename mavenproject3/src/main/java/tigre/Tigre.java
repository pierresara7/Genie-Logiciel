/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tigre;


/**
 *
 * @author mohamad
 */
public class Tigre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Plateau plateau = new Plateau(20, 10);
        plateau.setPlateau(new Tuiles("mich", 2), 0, 0);
         plateau.setPlateau(new Chefs("dfa", 4), 0, 1);
       // p.afficher();
        plateau.afficher();
        
        
        
        
        
        
        
        
        
     
             
    }
                
                
    
}

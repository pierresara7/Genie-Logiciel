/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tigre;

import java.util.ArrayList;

/**
 *
 * @author matthieu
 */
public class Monument {
    
	private String Couleur1;
	private String Couleur2;

    public String getCouleur1() {
        return Couleur1;
    }

    public String getCouleur2() {
        return Couleur2;
    }
   

    public Monument(String C1,String C2) {
        
        this.Couleur1 = C1;
        this.Couleur2 = C2;
		
    }
   
   public String VerifCouleur(String c){
       
       if (c == Couleur1) {
           return ("v");
       }
       if (c == Couleur2) {
           return ("v");
       }

       return("f");
   }
   
   
}


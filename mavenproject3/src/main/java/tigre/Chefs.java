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
public class Chefs extends Pions{
    private int nb_chefs; // le nombre de chef 
    private String nom_chef; // ytpe de chef 

  
    
   

    public Chefs(String nom_chef,int nb_chef) {
        super();
        this.nb_chefs= nb_chef ;
        this.nom_chef= nom_chef;
    }
     Chefs() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String toString(){
    
     return  "   ch|" ;
    }
   

 
    
    
}
    

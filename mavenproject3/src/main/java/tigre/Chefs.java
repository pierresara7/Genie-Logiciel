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
    String Couleur;
    public Chefs(String nom, int nb_joueur, int nb_sac, String Couleur) {
        super(nom, nb_joueur, nb_sac);
        this.Couleur=Couleur;
    }
   
    
    
    public String toString(){
    
     return  "   ch|" ;
    }
   

    @Override
    public void oneparty(Plateau p, int i, int j) {
        
        
       
        
         
        
        int nb_chef =0 ;
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
    

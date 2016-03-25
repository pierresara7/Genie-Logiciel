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
    public int nb_chefs; // le nombre de chef 
    public String nom_chef; // ytpe de chef 

  
    
   

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
   

    @Override
    public void oneparty(Plateau p, int i, int j) {
        
         Chefs ch = new Chefs();
        Chefs c = new Chefs(nom_chef, nb_chefs);
         java.util.Random rand=new java.util.Random();
        int nombreAleatoire=rand.nextInt(4);
       
        
         
        
        int nb_chef =0 ;
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
    

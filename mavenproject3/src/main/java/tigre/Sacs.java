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
public  class Sacs {
    // le nombre de tuile dans le sac 
    private int nb_tuile ;
    //pour savoir les types de tuiles(civilisation,peuplement,temple 
    private String type_tuile ;

    public int getNb_tuile() {
        return nb_tuile;
    }

    public String getType_tuile() {
        return type_tuile;
    }

    public void setNb_tuile(int nb_tuile) {
        this.nb_tuile = nb_tuile;
    }

    public void setType_tuile(String type_tuile) {
        this.type_tuile = type_tuile;
    }

  
    
    public Sacs(int nbr , String type  ){
       this.nb_tuile = nbr ;
       this.type_tuile = type ;
     
        
    }
    public Sacs (){
        String type[]={"ferme", "peuplement","temple,marche","catastrphe","jonction"};
        
    }
        
    
    
    
}

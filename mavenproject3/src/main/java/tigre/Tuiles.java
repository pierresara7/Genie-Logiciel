/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tigre;

import java.util.ArrayList;

/**
 *
 * @author mohamad
 */
public class Tuiles extends Pions{
    private int  nb_tuile ;
    private String type_tuile;
    ArrayList<Ferme> Fermes=new ArrayList();
    ArrayList<Temple> Temples=new ArrayList();
    ArrayList<Peuplement> Peuplements=new ArrayList();
    ArrayList<Marche> Marches=new ArrayList();
    ArrayList<Catastrophe> Catastrophes=new ArrayList();
    ArrayList<Jonction> Jonctions=new ArrayList();

    public Tuiles(String nom, int nb_joueur, int nb_sac) {
        super(nom, nb_joueur, nb_sac);
        super.tuile_royaume=true;
    }

   
      
    public  String toString(){        
        return "   Tui|" ;
    }

    @Override
    public void oneparty(Plateau plateau, int i, int j) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
   
}
    
   /*
    @Override
    
    public void oneparty(Plateau p, int i, int j) {
      Tuiles t1 = new Tuiles();
 
       java.util.Random rand=new java.util.Random();
        int nombreAleatoire=rand.nextInt(4);
       
       int nb_tuile =0;
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    */
   
    
    
    
    
   
   
   
    


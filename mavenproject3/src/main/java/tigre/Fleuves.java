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
public class Fleuves extends Pions{
   
    public Fleuves(){
        super("Fleuve",0,0);
<<<<<<< HEAD
=======
        this.tuile_royaume=false;
>>>>>>> refs/remotes/origin/Alphonse
    }
      public  String toString(){
        
        return "   fve|" ;
    }

    @Override
    public void oneparty(Plateau plateau, int i, int j) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}

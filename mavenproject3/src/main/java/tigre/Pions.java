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
public abstract class  Pions {
    private int nb_pions ;
    
    public Pions(){
   nb_pions =0;  
    }
    
    abstract public void oneparty(Plateau plateau ,int i,int j );
}

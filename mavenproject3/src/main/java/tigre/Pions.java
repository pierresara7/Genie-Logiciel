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
    public int nb_sac,nb_joueur ;
    
    public Pions(){
    }
    
    abstract public void oneparty(Plateau plateau ,int i,int j );
      abstract  public  String toString();

}

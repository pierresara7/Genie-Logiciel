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
public abstract class  Pions {
    public int nb_sac,nb_joueur ;
    public String nom;
<<<<<<< HEAD
    boolean tuile_royaume;
=======
    public boolean tuile_royaume;
    ArrayList<Royaume> Royaume=new ArrayList();
>>>>>>> refs/remotes/origin/Alphonse

    
    public Pions(String nom,int nb_joueur, int nb_sac){
        this.nom=nom;
        this.nb_joueur=nb_joueur;
        this.nb_sac=nb_sac;
    }
    
    abstract public void oneparty(Plateau plateau ,int i,int j );
      abstract  public  String toString();

}

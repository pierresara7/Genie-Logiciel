/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tigre;

import java.util.ArrayList;

/**
 *
 * @author Alphonse
 */
public class Royaume  {
    public Pions[][] grille_royaume;
    ArrayList ListeGrille=new ArrayList();
    
    public Royaume(){
    } 
public void ajouter_grille(Plateau p){
    ListeGrille.add(p.grille);
}

public boolean Verifie_chef(){
    for (int i=0;i<=ListeGrille.size();i++){
    }
        return false;
}

        
}

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
public class Royaume   {
        public Pions[][] grille_royaume;
    ArrayList<Pions[][]> ListeGrille=new ArrayList();
    ArrayList<Pions> ListePions=new ArrayList();
    ArrayList<Royaume> joinAvec=new ArrayList();
    public Chefs[] TabChefs;

    public Royaume() {
    }

    
    
public void ajouter_grille(Plateau p){
    ListeGrille.add(p.grille);
}
public void ajouter_Pions(Pions p){
    ListePions.add(p);
    
}

public boolean Verifie_chef(Plateau P){
    for (int i=0;i<=ListePions.size();i++){
        if((ListePions.get(i).toString()=="|Che"))
            return true;
    }
        return false;
}

public boolean verifie_temple(){
     for (int i=0;i<=ListePions.size();i++){
        if((ListePions.get(i).toString()=="|Tem"))
            return true;
    }
        return false;
}

        
}

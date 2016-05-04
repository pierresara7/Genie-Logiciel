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
    ArrayList<Chefs> ListeChef=new ArrayList();
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

public boolean detection_conflit(){
         for (int i = 0; i < ListePions.size(); i++)
      {
          for (int j = 0; j < i; j++) {
              final Object o1 = ListeChef.get(i).nom;
              final Object o2 = ListeChef.get(j).nom;
              if (o1 != null && o2 != null) {
                  if (o1.equals(o2)) {
                      return true;
                  }
              }
          }
      }
      return false;
}

        
}

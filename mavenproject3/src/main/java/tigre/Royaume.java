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
<<<<<<< HEAD
public class Royaume   {
        public Pions[][] grille_royaume;
    ArrayList<Pions[][]> ListeGrille=new ArrayList();
    ArrayList<Pions> ListePions=new ArrayList();
    ArrayList<Royaume> joinAvec=new ArrayList();
<<<<<<< HEAD
=======
    ArrayList<Chefs> ListeChef=new ArrayList();
>>>>>>> refs/remotes/origin/Alphonse
    public Chefs[] TabChefs;

    public Royaume() {
    }

    
=======
public class Royaume  {
    public Pions[][] grille_royaume;
    ArrayList ListeGrille=new ArrayList();
>>>>>>> parent of 35dc84a... Test unitaire+poser_catastrophe
    
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

<<<<<<< HEAD
=======
public boolean detection_conflit(){
         for (int i = 0; i < ListePions.size(); i++)
      {
          for (int j = 0; j < i; j++) {
              final Object o1 = ListeChef.get(i).Couleur;
              final Object o2 = ListeChef.get(j).Couleur;
              if (o1 != null && o2 != null) {
                  if (o1.equals(o2)) {
                      return true;
                  }
              }
          }
      }
      return false;
}

>>>>>>> refs/remotes/origin/Alphonse
        
}

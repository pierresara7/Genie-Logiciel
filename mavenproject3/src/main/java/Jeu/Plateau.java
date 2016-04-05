/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jeu;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Alphonse
 */
public class Plateau {
    public ArrayList<Grille> listeGrille;
    public Iterator<Grille> it = listeGrille.iterator();
    public Plateau(){
        
    }

    public boolean est_vide(int x,int y){
        while(it.hasNext()){
            if((it.next().x==x) && (it.next().y==y) && (it.next().est_vide==true))
                return true;
                }
        return false;
    }
    // vérifie si la grille est à coté d'un temple
    public boolean cote_temple(int x,int y){
        while (it.hasNext()){
          if((it.next().x==x+1) && (it.next().y==y) && ("temple".equals(it.next().objet))
            || (it.next().x==x) && (it.next().y==y+1) && ("temple".equals(it.next().objet))
            ||(it.next().x==x-1) && (it.next().y==y) && ("temple".equals(it.next().objet))
            || (it.next().x==x) && (it.next().y==y-1) && ("temple".equals(it.next().objet))      
                   )
              return true;
            {
            
        }
        }
        return false;
    }
    
    public boolean sur_riviere(int x,int y){
         while (it.hasNext()){
             if((it.next().x==x) && (it.next().y==y) && (it.next().objet!="riviere"))
                 return true;
         }
         return false;
    }
    // vérifie si la case reunirait 2 royaume
    public boolean deux_royaume(int x,int y){
        return false;
    }
    
}

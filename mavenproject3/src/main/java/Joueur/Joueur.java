/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Joueur;

import tigre.Roi;
import tigre.Marchand;
import tigre.Prete;
import tigre.Fermier;
import tigre.*;
import java.util.ArrayList;

/**
 *
 * @author Alphonse
 */
public class Joueur {
    int[][] grille;
    int score;
    tigre.Plateau plateau=new tigre.Plateau(20,10);

    
public Joueur(){    
     Roi roi=new Roi();roi.nb_joueur=1;
     Marchand marchand=new Marchand(); marchand.nb_joueur=1;
     Prete prete=new Prete(); prete.nb_joueur=1;
     Fermier fermier=new Fermier();fermier.nb_joueur=1;
     Catastrophe cat=new Catastrophe(2);

}

     public void placer_chef(Pions pion,int x,int y){
        if ((plateau.est_vide(x,y)) && (plateau.cote_temple(x, y)) && (plateau.sur_riviere(x, y)) && (plateau.deux_royaume(x, y))){
            plateau.setPlateau(pion, x, y);
            pion.nb_joueur--;
        }
            }
     public void reprise_chef(Chefs c,int x,int y){
         if(!plateau.cote_temple(x, y)){
             plateau.setPlateau(null, x, y);
             c.nb_joueur++;
         }
     }
     
     public void poser_catastrophe(int x,int y,Catastrophe c){
         if((plateau.est_vide(x, y)) && (plateau.grille[x][y].toString()=="Tui|")){
             plateau.setPlateau(c, x, y);
             c.nb_joueur--;
         }
     }
}

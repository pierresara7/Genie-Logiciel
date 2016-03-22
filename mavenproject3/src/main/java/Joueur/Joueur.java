/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Joueur;

import Jeu.*;
import java.util.ArrayList;

/**
 *
 * @author Alphonse
 */
public class Joueur {
    int[][] grille;
    int score;
    ArrayList<Pion> pionJoueur;
    Plateau plateau=new Plateau();
    
public Joueur(){    
     Roi roi=new Roi();roi.nbJoueur=1;
     Marchand marchand=new Marchand(); marchand.nbJoueur=1;
     Prete prete=new Prete(); prete.nbJoueur=1;
     Fermier fermier=new Fermier();fermier.nbJoueur=1;
}

     public void placer_chef(Pion pion,int x,int y){
        if ((plateau.est_vide(x,y)) && (plateau.cote_temple(x, y)) && (plateau.sur_riviere(x, y)) && (plateau.deux_royaume(x, y)))
            for(int i=0;i<=plateau.listeGrille.size();i++){
                if((plateau.listeGrille.get(i).x==x) && (plateau.listeGrille.get(i).y==y)){
                    Grille grille=new Grille(x,y,pion.nom,false);
                    plateau.listeGrille.set(i, grille);
                    pion.nbJoueur--;
                }
            }
            }
}

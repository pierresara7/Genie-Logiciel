/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Joueur;

import java.net.Socket;
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
public class Joueur extends Thread {
    int[][] grille;
    int score;
    //tigre.Plateau plateau=new tigre.Plateau(20,10);
    public Socket s ;
    //Liste des Pions d'un joueur
    ArrayList<Pions> ListePions=new ArrayList();
    // Liste des royaume créé par un joueur
    ArrayList<Royaume> ListeRoyaume=new ArrayList();
    
    public  Joueur(Socket s) {
		this.s = s;
	}

    
public Joueur(){    
     

}
  
    public int nb_pion_joueur(Pions p){
        return p.nb_joueur;
    }
    
    public void afficher_pions(){
        for (int i=0;i<=ListePions.size();i++){
            System.out.println(ListePions.get(i).nom+" :"+ListePions.get(i).nb_joueur);
        }
    }
     public void placer_chef(Pions pion,int x,int y,Plateau plateau){
        if ((plateau.est_vide(x,y)) && (plateau.cote_temple(x, y)) && (plateau.sur_riviere(x, y)) && (plateau.deux_royaume(x, y))){
            plateau.setPlateau(pion, x, y);
            pion.nb_joueur--;
            Royaume r=new Royaume();
            plateau.ListeRoyaume.add(r);
            plateau.ajouter_grille_royaume(x, y, r, plateau);
        }
            }
     public void reprise_chef(int x,int y,Plateau plateau){
         if("che|".equals(plateau.grille[x][y].toString())){
             plateau.setPlateau(null, x, y);
             plateau.grille[x][y].nb_joueur++;
         }
     }
     
     public void creer_royaume(Plateau p){
         Royaume r=new Royaume();
         p.ListeRoyaume.add(r);
     }
     
     public void poser_catastrophe(int x,int y,Catastrophe c,Plateau plateau){
         if((plateau.est_vide(x, y)) || 
                 ("Tui|".equals(plateau.grille[x][y].toString()))){
             plateau.setPlateau(c, x, y);
             c.nb_joueur--;
             plateau.enlever_pion(x, y);
         
             if("Temple".equals(plateau.grille[x][y].nom)){
             reprise_chef(x+1,y,plateau);
             reprise_chef(x,y+1,plateau);
             reprise_chef(x-1,y,plateau);
             reprise_chef(x,y-1,plateau);

             }
         }
         }
     }


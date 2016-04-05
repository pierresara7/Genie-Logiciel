/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jeu;

/**
 *
 * @author Alphonse
 */
public class Grille {
    public int x;
    public int y;
    public Object type;
    public String objet;
    public boolean est_vide;
    
    public Grille(int x,int y,String objet, boolean est_vide){
        this.x=x;
        this.y=y;
        this.objet="";
        this.est_vide=est_vide;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graphisme;

import javax.swing.JPanel;

/**
 *
 * @author Alphonse
 */
public class Grille {
     public Carre[][] grille;
public int XJ=0;
public int YJ=0;
public int action=0;
public int dec;

public Grille(){
     grille=new Carre[20][15];
}

public void steGrille(Carre[][] g){
 this.grille=g;
 }
//public JPanel affichage() {
    
   // Platforme p=new Platforme(this);
   // return p;
   // }
 public Grille getGrille(){return this;}
 public Carre getBrique(int x,int y){return this.grille[x][y];}
 public int posX(int x,int y){return this.grille[x][y].posX;}
 public int posY(int x,int y){return this.grille[x][y].posY;}
}

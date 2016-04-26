/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graphisme;

import java.awt.*;

import javax.swing.*;
import tigre.*;

/**
 *
 * @author Alphonse
 */
public class Platforme extends JPanel {
    final public static int SIZE_BLOCK = 50;
    private Plateau grille;
 private Image photo = null; 
   public Platforme(Plateau G){
       grille=G;
      
}
    public void paintComponent(Graphics g) {
       super.paintComponent(g);
Dimension taille =new Dimension(475,475);
int im=taille.width / SIZE_BLOCK;
int jm = taille.height / SIZE_BLOCK;
for (int j = 0; j < 10; j++) {
for (int i = 0; i < 14; i++) {
        
 if ((grille.grille[j][i] instanceof Pions) &&(grille.grille[j][i].nom=="Temple")){
      photo = getToolkit().getImage("C:/Users/Alphonse/Documents/M1MIAGE/MIAGE 2015-2016/GL/Projet/image/temple.jpg") ;
 g.drawImage (photo, i*SIZE_BLOCK+6, j*SIZE_BLOCK+6,40,40, this);
 //System.out.println("ddfd");
 }
 else if ((grille.grille[j][i] instanceof Pions) &&(grille.grille[j][i].nom=="Fleuve")){
      g.setColor(Color.BLUE);
g.fillRect(SIZE_BLOCK * i + 6, SIZE_BLOCK * j +6, 40, 40);
 //System.out.println("ddfd");
 }
 else if ((grille.grille[j][i] instanceof Pions) &&(grille.grille[j][i].nom=="Ferme")){
      photo = getToolkit().getImage("C:/Users/Alphonse/Documents/M1MIAGE/MIAGE 2015-2016/GL/Projet/image/Ferme.jpg") ;
 g.drawImage (photo, i*SIZE_BLOCK+6, j*SIZE_BLOCK+6,40,40, this);
 }
  else if ((grille.grille[j][i] instanceof Pions) &&(grille.grille[j][i].nom=="Catastrophe")){
      photo = getToolkit().getImage("C:/Users/Alphonse/Documents/M1MIAGE/MIAGE 2015-2016/GL/Projet/image/catastrophe.jpg") ;
 g.drawImage (photo, i*SIZE_BLOCK+6, j*SIZE_BLOCK+6,40,40, this);
 }
   else if ((grille.grille[j][i] instanceof Pions) &&(grille.grille[j][i].nom=="Jonction")){
      photo = getToolkit().getImage("C:/Users/Alphonse/Documents/M1MIAGE/MIAGE 2015-2016/GL/Projet/image/jonction.jpg") ;
 g.drawImage (photo, i*SIZE_BLOCK+6, j*SIZE_BLOCK+6,40,40, this);
 }
    else if ((grille.grille[j][i] instanceof Pions) &&(grille.grille[j][i].nom=="Marche")){
      photo = getToolkit().getImage("C:/Users/Alphonse/Documents/M1MIAGE/MIAGE 2015-2016/GL/Projet/image/marche.jpg") ;
 g.drawImage (photo, i*SIZE_BLOCK+6, j*SIZE_BLOCK+6,40,40, this);
 }
     else if ((grille.grille[j][i] instanceof Pions) &&(grille.grille[j][i].nom=="Peuplement")){
      photo = getToolkit().getImage("C:/Users/Alphonse/Documents/M1MIAGE/MIAGE 2015-2016/GL/Projet/image/Peuplement.jpg") ;
 g.drawImage (photo, i*SIZE_BLOCK+6, j*SIZE_BLOCK+6,40,40, this);
 }
 else{
 g.setColor(Color.YELLOW);
g.fillRect(SIZE_BLOCK * i + 6, SIZE_BLOCK * j +6, 40, 40);

 }
    
    }
    }   
      }
}

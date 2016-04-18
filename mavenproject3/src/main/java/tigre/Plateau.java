/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tigre;

import javax.swing.JPanel ;
import java.util.Random ;
/**
 *
 * @author mohamad
 */

public  class Plateau {
 

    
       //création d'un tableau de joueur
    public Pions[][] grille;
    //allocation de la taille
    private int absci;
    private int ordonne;

   

    public Pions[][] getGrille() {
        return grille;
    }

    public int getAbsci() {
        return absci;
    }

    public int getOrdonne() {
        return ordonne;
    }

    public void setGrille(Pions[][] grille) {
        this.grille = grille;
    }

    public void setAbsci(int absci) {
        this.absci = absci;
    }

    public void setOrdonne(int ordonne) {
        this.ordonne = ordonne;
    }
    
    public Plateau(int abs , int ord ){
        this.absci=abs;
       this.ordonne=ord;
        this.grille=new Pions[absci][ordonne];
        
        
        
        
        
    }
    
   // cette methode permet de lire les pions dans le plateau
    public Pions lire_pion (int i, int j){
       if (i<absci && j<ordonne){
     
             return grille[i][j];
}
       else
            return null;

    }
    
    
        public void afficher(){
            
        for(int i=0;i<absci;i++){
            for(int j=0;j<ordonne;j++){
                if(grille[i][j]!=null)
                System.out.print(grille[i][j]);
                else
                        System.out.print("    |");
                }
           System.out.println();
            }
      System.out.println("--------------------------");
    }
        
        // cette méthode permet de mettre les pions dans le plateau du jeu 
        
     public void setPlateau( Pions p , int i ,int j){
         if(grille[i][j]==null ){
             grille[i][j]= p ;     
         }
         else {
             i++ ;
             
         }
     }
     // cette fonction nous permettra de déplace les pion dans les cases 
     public void deplacer_tuile(Pions p , int i, int j){
         
          java.util.Random rand =new java.util.Random();
            i=rand.nextInt(10);
            j=rand.nextInt(10);
            //int  nombreAleatoire=  t1.nextInt(3) ;
             int npions=360;
            for(int n=0;n<npions;n++){
            if(grille[i][j]== null){
            grille[i][j] = p ;
            
        }
          
        
             
          }
    }
     
     // CETTE méthode nous permet de délimiter le fleuve 
     public void position_fleuve(){
         
         grille[3][0] = new Fleuves();
         grille[3][1] = new Fleuves();
         grille[3][2] = new Fleuves();
         grille[3][3] = new Fleuves();
         grille[2][3] = new Fleuves();
         grille[2][4] = new Fleuves();
         grille[1][4] = new Fleuves();
         grille[0][4] = new Fleuves();
         grille[0][5] = new Fleuves();
         grille[0][6] = new Fleuves();
         grille[0][7] = new Fleuves();
         grille[0][8] = new Fleuves();
         grille[0][12] = new Fleuves();
         grille[1][12] = new Fleuves();
         grille[2][12] = new Fleuves();
         grille[2][13] = new Fleuves();
         grille[3][13] = new Fleuves();
         grille[3][14] = new Fleuves();
         grille[3][15] = new Fleuves();
         grille[4][15] = new Fleuves();
         grille[5][14] = new Fleuves();
         grille[6][14] = new Fleuves();
         grille[6][13] = new Fleuves();
         grille[6][12] = new Fleuves();
         grille[7][12] = new Fleuves();
         grille[8][12] = new Fleuves();
         grille[8][11] = new Fleuves();
         grille[8][10] = new Fleuves();
         grille[8][9] = new Fleuves();
         grille[8][8] = new Fleuves();
         grille[8][7] = new Fleuves();
         grille[8][6] = new Fleuves();
         grille[7][5] = new Fleuves();
         grille[7][4] = new Fleuves();
         grille[7][3] = new Fleuves();
         grille[6][3] = new Fleuves();
         grille[6][2] = new Fleuves();
         grille[6][1] = new Fleuves();
         grille[6][0] = new Fleuves();
     }
     
     // cette méthode nous permettra de positionner les temple dans notr plateau 
     public void position_temple(){
         
         grille[0][10] = new Temples();
         grille[1][1] = new Temples();
         grille[1][15]= new Temples();
         grille[2][5] = new Temples();
         grille[4][13]= new Temples();
         grille[6][8] = new Temples();
         grille[7][1] = new Temples();
         grille[8][14] = new Temples();
         grille[9][5] = new Temples();
        grille[10][10] = new Temples();
         
         
       
     
     
     }
}
    
          
         //grille[i][j]=p ;
         
     
  

     

    



    
   
   


    
    

    
    
    
    
    
    
    
    
    
    
    
    
 
    
    
    
    
    
    
    
    
    
    
    
    


    
 


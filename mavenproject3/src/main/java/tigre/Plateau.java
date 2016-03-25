/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tigre;

import java.util.ArrayList;
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
    
    ArrayList<Pions[][]> Royaume=new ArrayList();
    

   

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
     // fonction qui permet de verifier si la grille est vide

    /**
     *
     * @param p
     * @param x
     * @param y
     * @return
     */
         public boolean est_vide(int x, int y){
           
                if(grille[x][y]==null)
                    return true;
                    
             
         return false;
         
     }
         public boolean cote_temple(int x,int y){
             
                if(grille[x+1][y].toString()=="Tem|")
                    return true;
                if(grille[x][y+1].toString()=="Tem")
                    return true;
                if(grille[x-1][y].toString()=="Tem")
                    return true;
                if(grille[x][y-1].toString()=="Tem")
                    return true;
             return false;
         }
         
         public boolean sur_riviere(int x,int y){
                if(grille[x][y].toString()!="riv|")
                    return true;
                return false;
         }
         
         public void nouveau_royaume(){
             
         }

    public boolean deux_royaume(int x, int y) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
    
          
         //grille[i][j]=p ;
         
     
  

     

    



    
   
   


    
    

    
    
    
    
    
    
    
    
    
    
    
    
 
    
    
    
    
    
    
    
    
    
    
    
    


    
 


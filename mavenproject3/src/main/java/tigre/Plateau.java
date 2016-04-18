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
    public ArrayList<Royaume> ListeRoyaume=new ArrayList();
    
    

   

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
     
     public void enlever_pion(int x,int y){
         grille[x][y]=null;
         
     }
     public void verifie_royaume(){
        for(int i=0;i<=ListeRoyaume.size();i++){
            for(int j=0;j<=ListeRoyaume.get(i).ListePions.size();j++){
                //if(ListePions.get(j).toString==)
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
         
         // verifie si le grille a coté est un fermier, un marche, un peuplement ou un Temple
         public Pions[][] ajouter_grille_royaume(int x,int y,Royaume r,Plateau p){
                if(grille[x+1][y].tuile_royaume=true)
                   r.ListeGrille.add(grille);
                   ajouter_grille_royaume(x+1,y,r,p);
                    if(grille[x][y+1].tuile_royaume=true)
                    r.ListeGrille.add(grille);
                   ajouter_grille_royaume(x+1,y,r,p);                
                   if(grille[x-1][y].tuile_royaume=true)
                        r.ListeGrille.add(grille);
                   ajouter_grille_royaume(x+1,y,r,p);
                       if(grille[x][y-1].tuile_royaume=true)
                     r.ListeGrille.add(grille);
                   ajouter_grille_royaume(x+1,y,r,p);          
                   return null;         } 

    public boolean deux_royaume(int x, int y) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
         
         grille[0][10] = new Temple(1);
         grille[1][1] = new Temple(1);
         grille[1][15]= new Temple(1);
         grille[2][5] = new Temple(1);
         grille[4][13]= new Temple(1);
         grille[6][8] = new Temple(1);
         grille[7][1] = new Temple(1);
         grille[8][14] = new Temple(1);
         grille[9][5] = new Temple(1);
        grille[10][10] = new Temple(1);
         
         
       
     
     
     }

     public void verifie_chef(Royaume R){
         
     }
}
    
          
         //grille[i][j]=p ;

         
     
  

     

    



    
   
   


    
    

    
    
    
    
    
    
    
    
    
    
    
    
 
    
    
    
    
    
    
    
    
    
    
    
    


    
 


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tigre;
import Graphisme.Fenetre;
import Graphisme.Platforme;
import javax.swing.JPanel;

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
    public ArrayList<Joueur> ListeJoueur=new ArrayList();
    public String msg="";
    
    

   

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
        this.position_fleuve();
        this.position_temple();
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
        
        public void setMessage(String msg){
            
        }
        
        // cette méthode permet de mettre les pions dans le plateau du jeu 
        
     public void setPlateau( Pions p , int i ,int j){
         if(grille[i][j]==null ){
             grille[i][j]= p ;     
              msg=msg+"\nvous avez placer un pion";
         }
         else {
             i++ ;
             
         }
                    

     }
     
     //cette fonction verifie si le voisin est dans un royaume
     public ArrayList<Royaume> est_dans_royaume(int x,int y){
         if(!est_vide(x+1,y)){
         if((!grille[x+1][y].Royaume.isEmpty()) && (x+1<absci)){
             return grille[x+1][y].Royaume;}
         }
                  if(!est_vide(x,y+1)){
         if((!grille[x][y+1].Royaume.isEmpty()) && (y+1<ordonne))
             return grille[x][y+1].Royaume;
                  }
                           if(!est_vide(x-1,y)){
         if((!grille[x-1][y].Royaume.isEmpty()) && (x!=0))
             return grille[x-1][y].Royaume;
                           }
              if(!est_vide(x,y-1)){
         if((!grille[x][y-1].Royaume.isEmpty()) && (y!=0))
             return grille[x][y-1].Royaume;
                                    }
         return null;
     }
     //cette Fonction permet d'affecter des royaume a un pion
     public void affecter_royaume(int x,int y){
         if((grille[x+1][y].Royaume!=null) && (x+1<absci)){
             for (int i=0;i<=grille[x+1][y].Royaume.size();i++){
                 grille[x][y].Royaume.add(grille[x+1][y].Royaume.get(i));
             }
             }
         if((grille[x][y+1].Royaume!=null) && (y+1<ordonne)){
             for (int i=0;i<=grille[x+1][y].Royaume.size();i++){
                 grille[x][y].Royaume.add(grille[x][y+1].Royaume.get(i));
             }
             }
         if((grille[x-1][y].Royaume!=null) && (x!=0)){
             for (int i=0;i<=grille[x+1][y].Royaume.size();i++){
                 grille[x][y].Royaume.add(grille[x-1][y].Royaume.get(i));
             }
             }
         if((grille[x][y-1].Royaume!=null) && (y!=0)){
             for (int i=0;i<=grille[x+1][y].Royaume.size();i++){
                 grille[x][y].Royaume.add(grille[x][y-1].Royaume.get(i));
             }
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
             if (x+1<=absci-1){
                if((grille[x+1][y].toString()=="Tem|"))
                    return true;
             }
             if (y+1<=ordonne-1){
                if(grille[x][y+1].toString()=="Tem") 
                    return true;
             }
             if((x!=0) && (!est_vide(x-1,y))){
                if(grille[x-1][y].toString()=="Tem")
                    return true;
             }
             if ((y!=0) && (!est_vide(x,y-1))){
                if(grille[x][y-1].toString()=="Tem")
                    return true;
             }
             return false;
         }
         
         public boolean sur_riviere(int x,int y){
             if(!est_vide(x,y)){
                if(grille[x][y].toString()!="riv|")
                return true;
             }
                return false;
         }
         
         public void nouveau_royaume(){
             
         }
         
         public boolean debordement(int x,int y){
             if(x+1>absci)
                 return false;     
             if(y+1>ordonne)
                 return false;
             if(x==0)
                 return false;
             if(y==0)
                 return false;
             return true;
         }
         
         // verifie si le grille a coté est un fermier, un marche, un peuplement ou un Temple
         public void ajouter_grille_royaume(int x,int y,Royaume r,Plateau p){
                if((grille[x+1][y].tuile_royaume=true) && (debordement(x,y))){
                   r.ListeGrille.add(grille);
                   ajouter_grille_royaume2(x+1,y,r,p);
                }
                    if((grille[x][y+1].tuile_royaume=true) && (debordement(x,y))){
                    r.ListeGrille.add(grille);
                   ajouter_grille_royaume2(x+1,y,r,p);   }             
                   if((grille[x-1][y].tuile_royaume=true) && (debordement(x,y))){
                        r.ListeGrille.add(grille);
                   ajouter_grille_royaume2(x+1,y,r,p);}
                       if((grille[x][y-1].tuile_royaume=true) && (debordement(x,y))){
                     r.ListeGrille.add(grille);
                   ajouter_grille_royaume2(x+1,y,r,p);     }     
                           } 
         // verifie si le grille a coté est pas null

          public void ajouter_grille_royaume2(int x,int y,Royaume r,Plateau p){
                  if(!est_vide(x+1,y)){
                    if(x+1<absci){
                   r.ListePions.add(grille[x+1][y]);
                   ajouter_grille_royaume(x+1,y,r,p);
                  }
                  }
                   if((grille[x][y+1]!=null) && (y+1<ordonne)){
                   r.ListePions.add(grille[x][y+1]);
                   ajouter_grille_royaume(x,y+1,r,p);    
                   }
                    if((grille[x-1][y]!=null) && (x!=0)){
                   r.ListePions.add(grille[x-1][y+1]);
                   ajouter_grille_royaume(x-1,1,r,p);
                    }
                     if((grille[x][y-1]!=null) && (y!=0)){
                   r.ListePions.add(grille[x][y-1]);
                   ajouter_grille_royaume(x,y-1,r,p);        
                     }
                           } 

    public boolean deux_royaume(int x, int y) {
        return true;
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
         grille[6][13] = new Fleuves();
       
     }
     
     // cette méthode nous permettra de positionner les temple dans notr plateau 
     public void position_temple(){
         
         grille[0][10] = new Temple(1);
         grille[1][1] = new Temple(1);
         grille[2][5] = new Temple(1);
         grille[4][13]= new Temple(1);
         grille[6][8] = new Temple(1);
         grille[7][1] = new Temple(1);
         grille[9][5] = new Temple(1);
        grille[9][10] = new Temple(1);
         
         
       
     
     
     }
     public JPanel affichage() {
    
    Platforme p=new Platforme(this);
    return p;
    }

     public void verifie_chef(Royaume R){
         
     }
}
    
          
         //grille[i][j]=p ;

         
     
  

     

    



    
   
   


    
    

    
    
    
    
    
    
    
    
    
    
    
    
 
    
    
    
    
    
    
    
    
    
    
    
    


    
 


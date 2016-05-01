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
<<<<<<< HEAD
    public ArrayList<Royaume> ListeRoyaume=new ArrayList();
<<<<<<< HEAD
=======
    public ArrayList<Joueur> ListeJoueur=new ArrayList();
    public String msg="";
>>>>>>> refs/remotes/origin/Alphonse
=======
>>>>>>> parent of 35dc84a... Test unitaire+poser_catastrophe
    
    

   

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
<<<<<<< HEAD
<<<<<<< HEAD
        this.grille=new Pions[absci][ordonne];        
=======
        this.grille=new Pions[absci][ordonne];     
        this.position_fleuve();
        this.position_temple();
>>>>>>> refs/remotes/origin/Alphonse
=======
        this.grille=new Pions[absci][ordonne];
        
        
        
        
        
>>>>>>> parent of 35dc84a... Test unitaire+poser_catastrophe
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
<<<<<<< HEAD
     
<<<<<<< HEAD
=======
     
     
>>>>>>> refs/remotes/origin/Alphonse
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
=======
>>>>>>> parent of 35dc84a... Test unitaire+poser_catastrophe
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
<<<<<<< HEAD
             
                if(grille[x+1][y].toString()=="Tem|")
                    return true;
                if(grille[x][y+1].toString()=="Tem")
                    return true;
                if(grille[x-1][y].toString()=="Tem")
                    return true;
                if(grille[x][y-1].toString()=="Tem")
                    return true;
=======
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
>>>>>>> refs/remotes/origin/Alphonse
             return false;
         }
         
         public boolean sur_riviere(int x,int y){
<<<<<<< HEAD
                if(grille[x][y].toString()!="riv|")
                    return true;
=======
             if(!est_vide(x,y)){
                if(grille[x][y].toString()!="riv|")
                return true;
             }
>>>>>>> refs/remotes/origin/Alphonse
                return false;
         }
         
         public void nouveau_royaume(){
             
         }
<<<<<<< HEAD
         
<<<<<<< HEAD
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
=======
>>>>>>> parent of 35dc84a... Test unitaire+poser_catastrophe

    public boolean deux_royaume(int x, int y) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
=======
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
>>>>>>> refs/remotes/origin/Alphonse
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
<<<<<<< HEAD
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
=======
         grille[6][13] = new Fleuves();
       
>>>>>>> refs/remotes/origin/Alphonse
     }
     
     // cette méthode nous permettra de positionner les temple dans notr plateau 
     public void position_temple(){
         
         grille[0][10] = new Temple(1);
         grille[1][1] = new Temple(1);
<<<<<<< HEAD
         grille[1][15]= new Temple(1);
=======
>>>>>>> refs/remotes/origin/Alphonse
         grille[2][5] = new Temple(1);
         grille[4][13]= new Temple(1);
         grille[6][8] = new Temple(1);
         grille[7][1] = new Temple(1);
<<<<<<< HEAD
         grille[8][14] = new Temple(1);
         grille[9][5] = new Temple(1);
        grille[10][10] = new Temple(1);
=======
         grille[9][5] = new Temple(1);
        grille[9][10] = new Temple(1);
>>>>>>> refs/remotes/origin/Alphonse
         
         
       
     
     
     }
<<<<<<< HEAD
=======
     public JPanel affichage() {
    
    Platforme p=new Platforme(this);
    return p;
    }
>>>>>>> refs/remotes/origin/Alphonse

}
    
          
         //grille[i][j]=p ;

         
     
  

     

    



    
   
   


    
    

    
    
    
    
    
    
    
    
    
    
    
    
 
    
    
    
    
    
    
    
    
    
    
    
    


    
 


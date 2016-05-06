/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tigre;
import Graphisme.Platforme;
import javax.swing.JPanel;

import java.util.ArrayList;
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
    
    
   
    /**
     *cette methode permet de lire les pions dans le plateau
     * @param i
     * @param j
     * @return
     */
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
        
        
     /**
     * cette méthode permet de mettre les pions dans le plateau de jeu
     * @param i
     * @param j
     * @param p
     */
        
        
     public void setPlateau( Pions p , int i ,int j){
         if(grille[i][j]==null ){
             grille[i][j]= p ;     
         }
         else {
             i++ ;
             
         }
                    

     }
     
     /**
      * cette fonction verifie si le voisin est dans un royaume
      * @param x
      * @param y
      */
     public ArrayList<Royaume> est_dans_royaume(int x,int y){
         if(x+1<absci){
         if(!est_vide(x+1,y)){
         if(!grille[x+1][y].Royaume.isEmpty() ){
             return grille[x+1][y].Royaume;}
         }
         }
         if(y+1<ordonne){
                  if(!est_vide(x,y+1)){
         if(!grille[x][y+1].Royaume.isEmpty())
             return grille[x][y+1].Royaume;
                  }
         }
         if(x!=0){
                           if(!est_vide(x-1,y)){
         if(!grille[x-1][y].Royaume.isEmpty())
             return grille[x-1][y].Royaume;
                           }
         }
         if(y!=0){
              if(!est_vide(x,y-1)){
         if(!grille[x][y-1].Royaume.isEmpty())
             return grille[x][y-1].Royaume;
              }
         }
         return null;
     }
     /**
      * cette Fonction permet d'affecter des royaume a un pion
      * @param x
      * @param y 
      */
    
     public void affecter_royaume(int x,int y){
        if((x+1<absci) && (!est_vide(x+1,y))){
            if(!grille[x+1][y].Royaume.isEmpty()){
            for (int i=0;i<=grille[x+1][y].Royaume.size();i++){
                 grille[x][y].Royaume.add(grille[x+1][y].Royaume.get(i));
                 msg="\n"+grille[x][y].nom+" a été affecté a un royaume"+msg;
             }
             }
        }
          if((y+1<ordonne) && (!est_vide(x,y+1))){
            if(!grille[x][y+1].Royaume.isEmpty()){
             for (int i=0;i<=grille[x][y+1].Royaume.size();i++){
                 grille[x][y].Royaume.add(grille[x][y+1].Royaume.get(i));
                 msg="\n"+grille[x][y].nom+" a été affecté a un royaume"+msg;
             }
             }
          }
          if((x!=0) && (!est_vide(x-1,y))){
            if(!grille[x-1][y].Royaume.isEmpty()){
             for (int i=0;i<=grille[x-1][y].Royaume.size();i++){
                 grille[x][y].Royaume.add(grille[x-1][y].Royaume.get(i));
                 msg="\n"+grille[x][y].nom+" a été affecté a un royaume"+msg;
             }
             }
          }
          if((y!=0) && (!est_vide(x,y-1))){
            if(!grille[x][y-1].Royaume.isEmpty()){
             for (int i=0;i<=grille[x][y-1].Royaume.size();i++){
                 grille[x][y].Royaume.add(grille[x][y-1].Royaume.get(i));
                 msg="\n"+grille[x][y].nom+" a été affecté a un royaume"+msg;
             }
             }
          }
         
     }
     /**
      * cette fonction nous permettra de déplace les pion dans les cases 
      * @param p
      * @param i
      * @param j 
      */
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
     
     
     /**
      * supprime un pion
      * @param x
      * @param y 
      */
     public void enlever_pion(int x,int y){
         grille[x][y]=null;
         
     }

    /**
     *Vérifie si la grille est vide
     * @param x
     * @param y
     * @return
     */
         public boolean est_vide(int x, int y){
           
                if(grille[x][y]==null)
                    return true;
                    
             
         return false;
         
     }
         /**
          * vérifie si la grille est a coté d'un temple
          * @param x
          * @param y
          * @return 
          */
         public boolean cote_temple(int x,int y){
             if ((x+1<=absci-1)&& (!est_vide(x+1,y))){
                if((grille[x+1][y].toString()=="Temple"))
                    return true;
             }
             if ((y+1<=ordonne-1) && (!est_vide(x,y+1))){
                if(grille[x][y+1].toString()=="Temple") 
                    return true;
             }
             if((x!=0) && (!est_vide(x-1,y))){
                if(grille[x-1][y].toString()=="Temple")
                    return true;
             }
             if ((y!=0) && (!est_vide(x,y-1))){
                if(grille[x][y-1].toString()=="Temple")
                    return true;
             }
             return false;
         }
         
         public boolean sur_riviere(int x,int y){
             if(!est_vide(x,y)){
                if(grille[x][y].toString()!="Fleuve")
                return true;
             }
                return false;
         }
         
        
         
       
         
         /**
          *  verifie si le grille a coté est un fermier, un marche, un peuplement ou un Temple
          * @param x
          * @param y
          * @param r
          * @param p 
          */
         public void ajouter_grille_royaume(int x,int y,Royaume r,Plateau p){
              if(x+1<absci){
                if(grille[x+1][y].tuile_royaume=true){
                   r.ListeGrille.add(grille);
                   ajouter_grille_royaume2(x+1,y,r,p);
                }
              }
                 if(y+1<ordonne){              
                    if(grille[x][y+1].tuile_royaume=true) {
                    r.ListeGrille.add(grille);
                   ajouter_grille_royaume2(x+1,y,r,p);   }   
                 }
                 if(x!=0){
                   if(grille[x-1][y].tuile_royaume=true){
                        r.ListeGrille.add(grille);
                   ajouter_grille_royaume2(x+1,y,r,p);}
                 }
                 if(y!=0){
                       if(grille[x][y-1].tuile_royaume=true) {
                     r.ListeGrille.add(grille);
                   ajouter_grille_royaume2(x+1,y,r,p);     }     
                           } 
         }
         /**
          * verifie si le grille a coté est pas null et evite le debordement du plateau
          * @param x
          * @param y
          * @param r
          * @param p 
          */

          public void ajouter_grille_royaume2(int x,int y,Royaume r,Plateau p){
                 if(x+1<absci){
                    if(!est_vide(x+1,y)){
                   r.ListePions.add(grille[x+1][y]);
                   if(grille[x+1][y].tuile_royaume!=false) {
                    r.ListeGrille.add(grille);
                    msg="\nle pion a été ajouté au royaume"+msg;
                     }  
                    }
                  }
                 if(y+1<ordonne){
                   if(!est_vide(x,y+1)) {
                   r.ListePions.add(grille[x][y+1]);
                    if(grille[x][y+1].tuile_royaume!=false) {
                    r.ListeGrille.add(grille);
                    msg="\nle pion a été ajouté au royaume"+msg;
                     }                 
                   }
                 }
                 if(x!=0){
                    if(grille[x-1][y]!=null){
                   r.ListePions.add(grille[x-1][y+1]);
                       if(grille[x-1][y].tuile_royaume!=false) {
                    r.ListeGrille.add(grille);
                    msg="\nle pion a été ajouté au royaume"+msg;
                     }  
                    }
                 }
                  if(y!=0){
                     if(grille[x][y-1]!=null){
                   r.ListePions.add(grille[x][y-1]);
                   if(grille[x][y-1].tuile_royaume!=false) {
                    r.ListeGrille.add(grille);
                    msg="\nle pion a été ajouté au royaume"+msg;
                     }          
                     }
                  }
                           } 

    public boolean deux_royaume(int x, int y) {
        return true;
    }
    /**
     * CETTE méthode nous permet de délimiter le fleuve 
     */
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
     
     /**
      * cette méthode nous permettra de positionner les temple dans notr plateau 
      */
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

         
     
  

     

    



    
   
   


    
    

    
    
    
    
    
    
    
    
    
    
    
    
 
    
    
    
    
    
    
    
    
    
    
    
    


    
 


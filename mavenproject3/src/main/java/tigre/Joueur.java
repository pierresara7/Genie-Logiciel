/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tigre;

import Graphisme.Fenetre;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author mohamad
 */
public class Joueur extends Thread{
      // tigre.Plateau plateau=new tigre.Plateau(20,10);
    public Socket s ;
    //Liste des Pions d'un joueur
    ArrayList<Pions> ListePions=new ArrayList();
    // Liste des royaume créé par un joueur
    ArrayList<Royaume> ListeRoyaume=new ArrayList();
 
	static Scanner console;
    public static BufferedReader is ;
    public static PrintWriter os ;
    static ObjectInputStream in;
    public int score=0;
    Fenetre f=new Fenetre(Server.p,this);
    public String nom;
    public String Dynastie;
    Plateau p;
    public boolean debut=true;
    public boolean a_son_tour;
    public int a;

    	public Joueur(String nom){
    		setNom(nom);

    	}
		public String getNom() {
			return nom;
		}
		public void setNom(String nom) {
			this.nom = nom;
		}
    
    public  Joueur(Socket s) {
		this.s = s;
	}
    public void desk(String Dynastie){
        Catastrophe cat=new Catastrophe(2);
        Marchand m=new Marchand(1,Dynastie);
        Fermier f=new Fermier(1,Dynastie);
        Roi r=new Roi(1,Dynastie);
        Prete p=new Prete(1,Dynastie);        
       
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
            this.ListePions.add(pion);
            plateau.msg="\n"+nom +"a poser un chef"+plateau.msg;
            
        }
        else {
            plateau.msg="Vous n'avez pas respecter les conditions veuillez recommencer";

        }
            }
     public void reprise_chef(int x,int y,Plateau plateau){
         if("che|".equals(plateau.grille[x][y].toString())){
             plateau.setPlateau(null, x, y);
             plateau.grille[x][y].nb_joueur++;
         }
     }
      public void poser_tuile_civilisation(Plateau p,Pions t,int i,int j){
         if (t.tuile_royaume=true){
             if((t.nom=="Ferme") && (p.sur_riviere(i,j))){
                 p.enlever_pion(i, j);
                 p.setPlateau(t,i,j);
                 if(p.est_dans_royaume(i, j)!=null){
                     for(int k=0;k<=p.est_dans_royaume(i, j).size();k++){
                 p.ajouter_grille_royaume2(j, j,p.est_dans_royaume(i, j).get(k), p);
                 }
                 }
             }
             else if((t.nom!="Ferme") && (!p.sur_riviere(i,j))){
                 p.setPlateau(t, i, j);
             }
     }
                                      p.msg="\n"+nom +"a poser un tuile"+p.msg;
     }
     
     public void attribuer_point(int x,int y,Plateau p){
         for(int i=0;i<=p.grille[x][y].Royaume.size();i++){
             for(int j=0;j<=ListeRoyaume.size();j++){
             }
         }
     }
     public void creer_royaume(Plateau p){
         Royaume r=new Royaume();
         p.ListeRoyaume.add(r);
     }
     
     public void poser_catastrophe(int x,int y,Pions c,Plateau plateau){
         if((plateau.est_vide(x, y)) || 
                 ("Tui|".equals(plateau.grille[x][y].toString()))){
             plateau.setPlateau(c, x, y);
             c.nb_joueur--;
         
             if("Temple".equals(plateau.grille[x][y].nom)){
                 if(x+1<plateau.getAbsci())
             reprise_chef(x+1,y,plateau);
                 if(y+1<plateau.getOrdonne())
             reprise_chef(x,y+1,plateau);
                 if (x!=0)
             reprise_chef(x-1,y,plateau);
                 if (y!=0)
             reprise_chef(x,y-1,plateau);

             }
                          plateau.enlever_pion(x, y);
         }
         }
     
    @Override
	public void run() {
            try	{
			is = new BufferedReader(new InputStreamReader(s.getInputStream()));
			
			os = new PrintWriter(s.getOutputStream(),true);
                        			while (debut==true){
                 String name=is.readLine();
                         p=Server.p;
                        // f.tab[2].setText(nom);
                        f.repaint();
                        Server.insertName(name);
                        nom=name;    
                        f.jLabel3.setText(name);
                        f.repaint();

                      f.setVisible(true);
                       
                         break;

                                                }
                                                
            } catch (IOException ex) {
            Logger.getLogger(Joueur.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
   
    }
    


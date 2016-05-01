/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tigre;

<<<<<<< HEAD
=======
import Graphisme.Fenetre;
>>>>>>> refs/remotes/origin/Alphonse
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
<<<<<<< HEAD
=======
import java.util.ArrayList;
>>>>>>> refs/remotes/origin/Alphonse
import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author mohamad
 */
public class Joueur extends Thread{
<<<<<<< HEAD
	static Scanner console;
    public static Socket s ;
    public static BufferedReader is ;
    public static PrintWriter os ;
    static ObjectInputStream in;
=======
      // tigre.Plateau plateau=new tigre.Plateau(20,10);
    public Socket s ;
    //Liste des Pions d'un joueur
    ArrayList<Pions> ListePions=new ArrayList();
    // Liste des royaume créé par un joueur
    ArrayList<Royaume> ListeRoyaume=new ArrayList();
    public Fenetre f;
 
	static Scanner console;
    public static BufferedReader is ;
    public static PrintWriter os ;
    static ObjectInputStream in;
    public int score=0;
    private String nom;
     Plateau p;
    	public Joueur(String nom){
    		setNom(nom);
    	}
		public String getNom() {
			return nom;
		}
		public void setNom(String nom) {
			this.nom = nom;
		}
    
>>>>>>> refs/remotes/origin/Alphonse
    public  Joueur(Socket s) {
		this.s = s;
	}
  
<<<<<<< HEAD
   
=======
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
    
>>>>>>> refs/remotes/origin/Alphonse
    
    
    public static  void main(String[] args) throws Exception{
    			System.out.println("*****Menu*****");
    	    	SocketChannel sc = SocketChannel.open();
    	    	sc.configureBlocking(true);
    	    	System.out.println("Socket client :" +sc.socket().getChannel());
    	    	if (sc.connect(new InetSocketAddress("127.0.0.1", 12345))) {
    	    		ObjectOutputStream  out = new ObjectOutputStream(sc.socket().getOutputStream());
    	    		out.flush();
    	    		 in =new ObjectInputStream(sc.socket().getInputStream());
    	    		 System.out.println("creation des flux: cote client");
    	    		 console = new Scanner(System.in);
    	    		 System.out.println("Entrer les information :");
    			     System.out.println("Entrer un nom du joueur:");
    			      String name = console.nextLine();
    			      out.writeObject(new Dataserialize(name));
    			        // System.out.println("client : donnees emis");
    			         //System.out.println("client : donnees reçu" + in.readObject());
    			         out.flush();
    			         out.close();
    			         in.close();
    	    		
    	    		//sc.close();

    	    	//}
    	    	//System.out.println("fin de reception");
    		}
    		
        }

   
    }
    


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tigre;
import Joueur.Joueur;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author mohamad
 */
public class Serveur {
    
    public static String[] tab = new String[4]; // un tableau de joueurz
    public static String[] tnom = new String[4]; // pour enregistrer le nom des joueurs 
    public static int nbr = 0; 
    public static int nbrCli = 0  ;// pour savoir le nombre de client qui sont inscrit 
    public static int rang=1; // le rang de chaque joueur
    public static PrintWriter[] tos = new PrintWriter[4];
    public static String s;
    public static Joueur c1;
    public static Joueur c2;
    public static Joueur c3;
    public static Joueur c4;
    public static Joueur[] tabCli = new Joueur[4];
   
    
       // cette méthode permet d'inserer le nom des joueurs 
    public static void insertName(String s) {
        for(int a=0;a<tnom.length;a++)
        {
            
        if(tnom[a]==null)
        {
        tnom[a] = s;
        break;}
        }
    }

    public static void jeux() {
    }

    public static void insertCli(Joueur c) {
        tabCli[nbrCli] = c;
        nbrCli++;
    }

    public static void insert(String s, PrintWriter s1) {
        tab[nbr] = s;
        tos[nbr] = s1;
        nbr++;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        try {

            ServerSocket ss = new ServerSocket(12345);
           Connection conect = new Connection(ss);
            conect.start();
            
        } catch (Exception e) {
            e.printStackTrace();
        }



    }
   
    

}

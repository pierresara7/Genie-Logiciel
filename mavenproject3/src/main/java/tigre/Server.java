/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tigre;

import Graphisme.Fenetre;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static String[] tab = new String[4];
    public static String[] tnom = new String[4];
    public static int nbr = 0;
    public static int nbrCli = 0;
    public static int rang=1;
    public static String s;
    public static PrintWriter[] tos = new PrintWriter[4];
    public static Plateau p = new Plateau(10,14);
    public static Joueur c1;
    public static Joueur c2;
    public static Joueur c3;
    public static Joueur c4;
    public static Fenetre f = new Fenetre(p,c1);
    public static Joueur[] tabCli = new Joueur[4];
    public static int i;
    public static int a;
    public static int tour = 1;

    
    public static void insertName(String s) {
        for(int a=0;a<tnom.length;a++)
        {
            
        if(tnom[a]==null)
        {
        tnom[a] = s;
        break;}
        }
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
            Distribution dist = new Distribution(Server.tabCli);
            dist.start();
        } catch (Exception e) {
            e.printStackTrace();
        }



    }
}
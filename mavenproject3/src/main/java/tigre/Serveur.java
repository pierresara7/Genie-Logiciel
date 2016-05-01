/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tigre;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

/**
 *
 * @author mohamad
 */
public class Serveur {
	static ServerSocketChannel ssc = null;
	protected static ObjectInputStream is;
	protected static ObjectOutput out;
	static Dataserialize ob;
	private static int nbclientautorise=4;
    public static int nbrCli = 0  ;// pour savoir le nombre de client qui sont inscrit 
    public static int rang=1; // le rang de chaque joueur
<<<<<<< HEAD
    public static Clients[] tabCli = new Clients[4];
    public static void insertCli(Clients c) {
=======
    public static Joueur[] tabCli = new Joueur[4];
    public static void insertCli(Joueur c) {
>>>>>>> refs/remotes/origin/Alphonse
        tabCli[nbrCli] = c;
        nbrCli++;
    }


    public static void  main( String []args) {
    		System.out.println("Connexion etabli");
    		int port = 12345;
    		try {
    			ssc = ServerSocketChannel.open();
    			ssc.configureBlocking(true);
    			ssc.socket().bind(new InetSocketAddress("127.0.0.1",port));
    			System.out.println("Socket serveur: " + ssc.socket().getLocalPort());
    		} catch (IOException e) {
    			System.out.println("Erreur du connexion: " + ssc.socket().getLocalPort());
    		}
        	
        	while (true) {
        		
        		SocketChannel sChannel = null;
    			try {
    				sChannel = ssc.accept();
    			} catch (IOException e1) {
    				// TODO Auto-generated catch block
    				e1.printStackTrace();
    			}
        		
        		System.out.println("serveur accepte la connexion de : " + sChannel);
        		
        		
    			try {
    				is = new  ObjectInputStream(sChannel.socket().getInputStream());
    			} catch (IOException e1) {
    				// TODO Auto-generated catch block
    				e1.printStackTrace();
    			}
        		
        		ObjectOutput ou = null;
    			try {
    				ou = new ObjectOutputStream(sChannel.socket().getOutputStream());
    			} catch (IOException e1) {
    				// TODO Auto-generated catch block
    				e1.printStackTrace();
    			}
        		try {
    				ou.flush();
    			} catch (IOException e1) {
    				// TODO Auto-generated catch block
    				e1.printStackTrace();
    			}
        		
        		System.out.println("*********Creation des flux par le serveur**** ");
        		//serialisation des l'objet
        		
    			try {
    				 ob = (Dataserialize)is.readObject(); // ici j 'recupère la valeur saisi par le joueur
    				 //on va verifier si le nombre de client est atteind
    				 if(nbrCli <nbclientautorise){
<<<<<<< HEAD
    					 Clients client =new Clients(ob.getNom()); //créer un instance client avec le nom client
=======
    					 Joueur client =new Joueur(ob.getNom()); //créer un instance client avec le nom client
>>>>>>> refs/remotes/origin/Alphonse
        				 Serveur.insertCli(client); //
        				 System.out.println("Client numero "+ nbrCli+" est  "+ ob.getNom());
    				 }else{
    					 System.out.println("Desole, le nombre maximum de client est atteint");
    				 }
    				 
    			} catch (Exception e1) {
    				
    			} 
               
        		
    		    //System.out.println("Serveur emis des donnèes: " + ob.getNom());
    		    try {
    				ou.flush();
    			} catch (IOException e) {
    				// TODO Auto-generated catch block
    				e.printStackTrace();
    			}
    		    try {
    				ou.close();
    				is.close();
    				sChannel.close();
    		    } catch (IOException e) {
    				
    			}
        		

        		
        	}
     
    	}
   
    }

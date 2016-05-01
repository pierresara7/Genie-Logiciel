/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tigre;

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
import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author mohamad
 */
public class Joueur extends Thread{
	static Scanner console;
    public static Socket s ;
    public static BufferedReader is ;
    public static PrintWriter os ;
    static ObjectInputStream in;
    public  Joueur(Socket s) {
		this.s = s;
	}
  
   
    
    
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
    


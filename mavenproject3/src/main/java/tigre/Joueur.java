/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tigre;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.nio.ch.SocketAdaptor;

/**
 *
 * @author mohamad
 */
public class Joueur extends Thread{
    public static Socket s ;
    public static BufferedReader is ;
    public static PrintWriter os ;
    
    public  Joueur(Socket s) {
		this.s = s;
	}
    /*
    public void datagramme (BufferedReader  is , PrintWriter os  ){
        try {
            is = new BufferedReader(new InputStreamReader(s.getInputStream()));
            
            os = new PrintWriter(s.getOutputStream(),true);
        } catch (IOException ex) {
            Logger.getLogger(Joueur.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    
    }
    */
   
    
    
    public static  void main(String[] args){
        try{
            
         s = new Socket("127.0.0.1" ,24681);
         System.out.println("vous etes connecté");
        
        }
        catch(Exception e){
            System.out.println(" vous n'êtes pas connecté connection");
       // e.printStackTrace( new PrintStream(null));
        
        } 
    }
}
    


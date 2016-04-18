/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tigre;
import java.net.ServerSocket;
import java.net.Socket;
/**
 *
 * @author mohamad
 */
public class Connection extends Thread {
     ServerSocket ss;
    public Connection(ServerSocket s1){
    ss=s1;
    }
    // inwcrption des clients un par un 
    public void run() {
    try {
            
            
            while (true) {

                if(Serveur.tabCli[3]==null){
                
                Socket s1 = ss.accept();
                Serveur.c1 = new Joueur(s1);
                Serveur.c1.start();
                Serveur.tabCli[Serveur.nbrCli] = Serveur.c1;
                Serveur.nbrCli++;
                
                
                

                Socket s2 = ss.accept();

                Serveur.c2 = new Joueur(s2);
                Serveur.c2.start();
                Serveur.tabCli[Serveur.nbrCli] = Serveur.c2;
                Serveur.nbrCli++;
                      
        
                Socket s3 = ss.accept();
                Serveur.c3 = new Joueur(s3);
                Serveur.c3.start();
                Serveur.tabCli[Serveur.nbrCli] = Serveur.c3;
                Serveur.nbrCli++;
                
                Socket s4 = ss.accept();
                 Serveur.c4 = new Joueur(s4);
                Serveur.c4.start();
                Serveur.tabCli[Serveur.nbrCli] = Serveur.c4;
                Serveur.nbrCli++;
                
                }   
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

    
    
    


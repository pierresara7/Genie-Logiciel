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
 * @author Alphonse
 */
public class Connection extends Thread{
    ServerSocket ss;
    public Connection(ServerSocket s1){
    ss=s1;
    }
    public void run() {
    try {
            
            
            while (true) {

                if(Server.tabCli[3]==null){
                
                Socket s1 = ss.accept();
                Server.c1 = new Joueur(s1);
                Server.c1.Dynastie="Zeus";
                Server.c1.desk();
                Server.c1.start();
                Server.tabCli[Server.nbrCli] = Server.c1;
                Server.nbrCli++;
                
                
                

                Socket s2 = ss.accept();

                Server.c2 = new Joueur(s2);
                Server.c2.Dynastie="Hades";
                Server.c2.start();
                Server.tabCli[Server.nbrCli] = Server.c2;
                Server.nbrCli++;
                      
        
                Socket s3 = ss.accept();
                Server.c3 = new Joueur(s3);
                Server.c3.Dynastie="Athena";
                Server.c3.start();
                Server.tabCli[Server.nbrCli] = Server.c3;
                Server.nbrCli++;
                
                Socket s4 = ss.accept();
                Server.c4 = new Joueur(s4);
                Server.c1.Dynastie="Medusa";
                Server.c4.start();
                Server.tabCli[Server.nbrCli] = Server.c4;
                Server.nbrCli++;
                
                }   
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

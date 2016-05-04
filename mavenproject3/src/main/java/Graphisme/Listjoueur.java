/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Graphisme;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alphonse
 */
public class Listjoueur extends Thread {
private Client c;    
public Listjoueur(Client c1){
c=c1;
}
    public void run() {
       
    while(true)
        
    {
       
                                  
                        try {   
                            
                               
                            for(int a=0;a<c.t.length;a++){
                            String nj=c.is.readLine();
                            
                            
                                c.t[a].setText(nj);
                            System.out.println(c.t[0].getText());
                            }
                            
                            c.repaint();
                            
                        
                        
                        } catch (IOException ex) {
                            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
                        }
                                  
                                    
                                    
                                  
				}
    }
}

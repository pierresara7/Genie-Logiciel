/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tigre;

import java.awt.Color;

/**
 *
 * @author Alphonse
 */
public class Distribution extends Thread {
    private Joueur[] tabCli;
    private int t;
public static int i;
    public Distribution(Joueur[] tabCli1) {
        tabCli = tabCli1;
    }

    public void run() {
         i = 0;
        while (true) {
            tabCli = Server.tabCli;
            t = Server.tour; //recupere la valeur de tour
                        for (int k = 0; k < tabCli.length; k++) {
                            
                        }
        }
    }
}

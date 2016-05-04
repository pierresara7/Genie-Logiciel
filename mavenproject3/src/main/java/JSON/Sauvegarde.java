/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSON;

import tigre.Pions;

/**
 *
 * @author Alphonse
 */
public class Sauvegarde {
    private int x;
    private int y;
    private String Pion;
    public Sauvegarde(int x,int y,String pion){
        this.x=x;
        this.y=y;
        this.Pion=pion;
    }
    
     public int getX() {
	return x;
    }
     public int getY() {
	return y;
    } 
     public String getPion() {
	return Pion;
    } 
}

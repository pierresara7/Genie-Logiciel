/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graphisme;

import javax.swing.JPanel;

/**
 *
 * @author Alphonse
 */
public class Carre {
    public JPanel carre[];
     public int num;
     public int player;
    public int occupe;
  public int posX;
    public int posY;
    
    public Carre(){
        num=0;
        occupe=0;
      posX=0;
      posY=0;
    carre=new JPanel[1];
    carre[0]=new JPanel();
    }

}

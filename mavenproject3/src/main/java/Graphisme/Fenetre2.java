/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graphisme;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.text.NumberFormat;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import tigre.Pions;
import tigre.Plateau;

/**
 *
 * @author Alphonse
 */
public class Fenetre2 extends javax.swing.JFrame{
      private JPanel container = new JPanel();
     
       private JFormattedTextField X = new JFormattedTextField(NumberFormat.getIntegerInstance());
       private JFormattedTextField Y= new JFormattedTextField(NumberFormat.getIntegerInstance());

        private JButton b = new JButton ("OK");
      Pions res;
      Plateau plateau;

    
    public Fenetre2(ItemEvent e,Plateau p){
        res=(Pions) e.getItem();
                    this.setVisible(true);
        
        plateau=p;
            this.setSize(400, 100);
            this.setLocationRelativeTo(null);
            this.setAlwaysOnTop(true);
             container.setBackground(Color.white);
    container.setLayout(new BorderLayout());
    JPanel top = new JPanel();
    X.setPreferredSize(new Dimension(30, 30));
    X.setForeground(Color.BLUE);
     Y.setPreferredSize(new Dimension(30, 30));
    Y.setForeground(Color.BLUE);
        b.addActionListener(new BoutonListener());
        top.add(X);
    top.add(Y);
    top.add(b);
        container.add(top, BorderLayout.NORTH);
    this.setContentPane(container);
    }
   public Plateau getPlateau(Plateau p){
       return p;
   }
    class BoutonListener implements ActionListener{
    public void actionPerformed(ActionEvent e) {
        int xx=Integer.parseInt(X.getText());
        int yy=Integer.parseInt(Y.getText());
        plateau.setPlateau(res, xx,yy);
       plateau.afficher();
       System.out.print(res);
       dispose();
       
                }


  }

}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graphisme;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
 
 
public class Test extends JFrame
{
	Frame f = new Frame("jeu");
	JComboBox jcb = new JComboBox();
	JComboBox jcb2 = new JComboBox();
 
	public Test() {
		super();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jcb.addItem("Voiture");
		jcb.addItem("Moto");
		jcb.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent e) {
				Test.this.jcb2.removeAllItems();
				if (e.getItem().equals("Voiture")) {
					Test.this.jcb2.addItem("Renault");
					Test.this.jcb2.addItem("Peugeot");
					Test.this.jcb2.addItem("Citroen");
				} else {
					Test.this.jcb2.addItem("Kawasaki");
					Test.this.jcb2.addItem("Suzuki");
					Test.this.jcb2.addItem("Honda");
				}
				Test.this.jcb2.updateUI();
				Test.this.repaint();
			}
		});
		ButtonGroup bg = new ButtonGroup();
 
		getContentPane().setLayout(new GridLayout(1,2));
		getContentPane().add(jcb);
		getContentPane().add(jcb2);
		setVisible(true);
		setTitle("Jeu");
		setSize(200,50);
	}
 
 
	public static void main(String[] args) {
		Frame f = new Test();
	}
}
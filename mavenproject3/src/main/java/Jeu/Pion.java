/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jeu;

import java.util.ArrayList;

/**
 *
 * @author Alphonse
 */
public class Pion {
    public String couleur;
    public String nom;
    public int nbJoueur,nbSac;
    public ArrayList<Marchand> marchand;
    public ArrayList<Prete> prete;
    public ArrayList<Fermier> fermier;
    public ArrayList<Roi> roi;
    
    
    public String getName(){
        return nom;
    }

    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSON;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
import tigre.Chefs;
import tigre.Plateau;
import tigre.Server;
import tigre.Tuiles;

/**
 *
 * @author Alphonse
 */
public class GenererJSONSave {
    public void Save(Plateau p){
        ArrayList<Sauvegarde> Liste=new ArrayList();
        int k=0;
        for(int i=0;i<p.getAbsci();i++){
            for(int j=0;j<p.getOrdonne();j++){ 
                if(p.grille[i][j]!=null)
                Liste.add(new Sauvegarde(i,j,p.grille[i][j].nom));
                
            }           
        }
        JSONObject objet = new JSONObject();
        JSONArray jsArray = new JSONArray(Liste);
	objet.put("coordonnée", jsArray);
        // Création du fichier de sortie
	FileWriter fs = null;
	try {
	    fs = new FileWriter("C:\\Users\\Alphonse\\Desktop\\output2.txt");
	} catch(IOException e) {
	    System.err.println("Erreur lors de l'ouverture du fichier ");
	    System.err.println(e);
	    System.exit(-1);
	}
	
	// Sauvegarde dans le fichier
	try {
	    objet.write(fs);
	    fs.flush();
	} catch(IOException e) {
	    System.err.println("Erreur lors de l'écriture dans le fichier : " + e);
	    System.exit(-1);
	}
    }
    public static void main(String[] args) {
	// Vérification des arguments
	/*if(args.length != 1) {
	    System.err.println("Usage: java GenerateurJSON fichier.json");
	    System.err.println("\toù fichier.json est le nom du fichier dans lequel sauvegarder");
	    System.exit(-1);
	}*/

	// Génération du JSON depuis un tableau d'objets
Plateau plateau = new Plateau(10,14);
        plateau.setPlateau(new Tuiles("mich", 2,36), 0, 0);
       plateau.setPlateau(new Chefs("dfa", 4,36,"black"), 0, 1);        
         GenererJSONSave g=new GenererJSONSave();
         g.Save(plateau);
}
}

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
import tigre.Plateau;


/**
 *
 * @author Alphonse
 */

public class GenererJSONSave {
    /**
     * Methode pour sauvegarder le plateau d'un jeu
     * @param p 
     */
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
   
}

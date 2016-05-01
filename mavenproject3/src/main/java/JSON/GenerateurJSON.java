package JSON;

import org.json.JSONObject;
import org.json.JSONArray;
import java.io.FileWriter;
import java.io.IOException;
import tigre.Plateau;
import tigre.Serveur;

/**
 * Classe illustrant la sérialisation d'objets en JSON et générant un fichier
 * contenant le JSON obtenu. Le nom du fichier doit être passé en paramètre.
 * @author Cyril Rabat
 * @version 16/10/2015
 */
public class GenerateurJSON {
    
    public void Save(Serveur s){
        Personne p[] = { new Personne(s.tabCli[0].getNom(), s.tabCli[0].score),
			 new Personne(s.tabCli[1].getNom(), s.tabCli[1].score),
        new Personne(s.tabCli[2].getNom(), s.tabCli[2].score),
        new Personne(s.tabCli[3].getNom(), s.tabCli[3].score),};
	JSONObject objet = new JSONObject();
	objet.put("contacts", new JSONArray(p));

	// Création du fichier de sortie
	FileWriter fs = null;
	try {
	    fs = new FileWriter("C:\\Users\\Alphonse\\Desktop\\output.txt");
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
         Serveur s=new Serveur();
         tigre.Joueur j=new tigre.Joueur("A");
         tigre.Joueur j2=new tigre.Joueur("B");
         tigre.Joueur j3=new tigre.Joueur("C");
         tigre.Joueur j4=new tigre.Joueur("D");
         s.insertCli(j);
         s.insertCli(j2);
         s.insertCli(j3);
         s.insertCli(j4);
         GenerateurJSON g=new GenerateurJSON();
         g.Save(s);
}
}
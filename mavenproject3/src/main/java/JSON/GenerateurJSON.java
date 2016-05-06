package JSON;

import org.json.JSONObject;
import org.json.JSONArray;
import java.io.FileWriter;
import java.io.IOException;
import tigre.Joueur;
import tigre.Plateau;
import tigre.Server;


public class GenerateurJSON {
        public Server ser;
   /**
    * methode pour sauvegarder les joueur dans un fichier
    * @param s 
    */     
    public void Save(Server s){
        ser=s;
        Joueur j=new Joueur("Pas de Joueur");
        for(int i=0;i<ser.tabCli.length;i++){
        if(ser.tabCli[i]==null){
            ser.tabCli[i]=j;
        }
        }
        Personne p[] = { new Personne(ser.tabCli[0].getNom(), ser.tabCli[0].score),
			 new Personne(ser.tabCli[1].getNom(), ser.tabCli[1].score),
        new Personne(ser.tabCli[2].getNom(), ser.tabCli[2].score),
        new Personne(ser.tabCli[3].getNom(), ser.tabCli[3].score),};
	JSONObject objet = new JSONObject();
	objet.put("Joueur", new JSONArray(p));

	// CrÃ©ation du fichier de sortie
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
	    System.err.println("Erreur lors de l'Ã©criture dans le fichier : " + e);
	    System.exit(-1);
	}
    }
    
    
    
}
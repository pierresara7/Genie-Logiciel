package JSON;


public class Personne {

    private String nom;
    private int score;

   
    public Personne(String nom, int score) {
	this.nom = nom;
	this.score = score;
    }

   
    public String getNom() {
	return nom;
    }
   
    public int getScore() {
	return score;
    }    

}
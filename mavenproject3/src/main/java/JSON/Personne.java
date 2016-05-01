package JSON;


public class Personne {

    private String nom;
    private String prenom;
    private int age;

   
    public Personne(String nom, int age) {
	this.nom = nom;
	this.age = age;
    }

   
    public String getNom() {
	return nom;
    }

   
    public String getPrenom() {
	return prenom;
    }

   
    public int getAge() {
	return age;
    }    

}
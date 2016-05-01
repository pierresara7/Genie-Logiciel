package tigre;

import java.io.Serializable;

public class Dataserialize implements Serializable {
	private String nom;
	public Dataserialize(String nom){
		this.nom=nom;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
}

package model;

public class Panier 
{
	private String nom;
	private Ligne ligne;
	
	
	public Panier() {}
	
	public Panier(String nom, Ligne ligne)
	{
		super();
		this.nom = nom;
		this.ligne = ligne;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Ligne getLigne() {
		return ligne;
	}

	public void setLigne(Ligne ligne) {
		this.ligne = ligne;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Panier [nom=");
		builder.append(nom);
		builder.append(", ligne=");
		builder.append(ligne);
		builder.append("]");
		return builder.toString();
	}
}

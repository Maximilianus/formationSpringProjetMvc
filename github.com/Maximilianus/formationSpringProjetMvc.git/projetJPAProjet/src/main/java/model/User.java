package model;

import javax.persistence.*;

@Entity
public class User 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String nom;
	private String prenom;
	private String adresse;
	private int galop;
	private String mdp;
	
	public User( ) {}
	
	public User(String nom, String prenom)
	{
		this.nom = nom;
		this.prenom = prenom;
	}
	
	public User(String nom, String prenom, String adresse, int galop, String mdp) 
	{
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.galop = galop;
		this.mdp = mdp;
	}

	public String getNom() 
	{
		return nom;
	}

	public void setNom(String nom) 
	{
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getAdresse() 
	{
		return adresse;
	}

	public void setAdresse(String adresse) 
	{
		this.adresse = adresse;
	}

	public int getGalop() 
	{
		return galop;
	}

	public void setGalop(int galop) 
	{
		this.galop = galop;
	}

	public String getMdp() {
		return mdp;
	}

	public void setMdp(String mdp) {
		this.mdp = mdp;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("User [id=");
		builder.append(id);
		builder.append(", nom=");
		builder.append(nom);
		builder.append(", prenom=");
		builder.append(prenom);
		builder.append(", adresse=");
		builder.append(adresse);
		builder.append(", galop=");
		builder.append(galop);
		builder.append("]");
		return builder.toString();
	}
	
}

package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.*;

@Entity
public class Poney extends Article{
	
	@Version
	private int version;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String nom;
	private String race;
	private String robe;
	private int taille;
	private String description;
	private int prix;
	
	public Poney() {super();}
	
	public Poney(String nom, String race, String robe, int taille, String description, int prix) {
		super();
		this.nom = nom;
		this.race = race;
		this.robe = robe;
		this.taille = taille;
		this.description = description;
		this.prix = prix;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public String getRobe() {
		return robe;
	}

	public void setRobe(String robe) {
		this.robe = robe;
	}

	public int getTaille() {
		return taille;
	}

	public void setTaille(int taille) {
		this.taille = taille;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}

	@Override
	public String toString() {
		return "Poney [getVersion()=" + getVersion() + ", getId()=" + getId() + ", getNom()=" + getNom()
				+ ", getRace()=" + getRace() + ", getRobe()=" + getRobe() + ", getTaille()=" + getTaille()
				+ ", getDescription()=" + getDescription() + ", getPrix()=" + getPrix() + "]";
	}
	
	

}

package model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.*;
import javax.persistence.Version;

@Entity
public class Materiel extends Article{
	
	@Version
	private int version;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String designation;
	private int prix;
	
	
	public Materiel() {super();}
	
	public Materiel(String designation, int prix) {
		super();
		this.designation = designation;
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

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}

	@Override
	public String toString() {
		return "Materiel [getVersion()=" + getVersion() + ", getId()=" + getId() + ", getDesignation()="
				+ getDesignation() + ", getPrix()=" + getPrix() + "]";
	}
	
	

}

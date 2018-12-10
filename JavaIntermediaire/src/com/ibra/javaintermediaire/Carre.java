package com.ibra.javaintermediaire;

public class Carre extends Forme {	

	protected int cote = 8;
	protected String nom;
	protected String nomFemme;
	

	public Carre(String nom, int cote) {
		this.nom = nom;
		this.cote = cote;
	}
	
	
	public Carre(String nom, int cote, String nomFemme) {
		this(nom, cote);
		this.nomFemme = nomFemme;
	}
	
	public double aire() {
		return cote * cote;
	}
}

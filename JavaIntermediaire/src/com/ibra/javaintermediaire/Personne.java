package com.ibra.javaintermediaire;

public class Personne {

	private String nom;
	private String prenom;
	private int age;
	
	public static final int NOMBRE_MAX_OREILLES = 2;
	
	private static int nombreTotalPersonnes = 0;
	
	public Personne(String nom, String prenom) {
 		this.nom = nom;
 		this.prenom = prenom;
		nombreTotalPersonnes++;
	}
	
	public String fullName(String debut) {
		return String.format("%s %s %s", debut, nom, prenom);
	}
	
	public String fullName() {
		return String.format("%s %s", nom, prenom);
	}
	
	public static int getNombreTotalPersonnes() {
		return nombreTotalPersonnes;
	}
	
	public String getNom() {
		return nom;
	}



	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}



	public void setAge(int age) {
		if(age < 15) {
			throw new IllegalArgumentException("L'age doit être superieur à 15 ans.");
		} else {
			this.age = age;
		}
		
	}
	
	public int getAge() {
		return this.age * 365;
	}
}

package com.ibra.javaintermediaire;

public class HeritageTest {

	public static void main(String[] args) {
		
		/*
		Forme[] tab1 = new Forme[3];
		
		Forme forme1 = new Circle();
		Forme forme2 = new Triangle();
		Forme forme3 = new Carre();
		
		tab1[0] = forme1;
		tab1[1] = forme2;
		tab1[2] = forme3;
*/
		//ChildClass child = new ChildClass();
		/*
		Forme c = new Circle();
		Forme t = new Triangle();
		Forme sq = new Carre();
		
		System.out.println(c.aire());
		System.out.println(t.aire());
		System.out.println(sq.aire());
		*/
		/*
		for(Forme f: tab1) {
			System.out.println(f.aire());
		}
		
		Carre c = new Carre("Toto", 5, "Tatty");

		System.out.println(c.nomFemme);
		*/

		CompteBancaire cb = new CompteBancaire("Habib Traore", 2800);
		
		System.out.println(cb);
		

	}

}

package com.ibra.javaintermediaire;

public class TaskTest {

	public static void main(String[] args) {
		
		Task tache1 = new Task("Faire son tuto", " a 15h 30 mn");
		Task tache2 = new Task("Aller au ciné", " a 15h 30 mn");
		//Task tache3 = new Task("Dire c'est finié, c'est l'heure de rentrer", "a 15h 30 mn");
		tache2.complete();
		System.out.println(tache1.description + tache1.title);

	}

}

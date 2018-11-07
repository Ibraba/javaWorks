package helloJAVA;

import java.util.Scanner;

public class Calculatrice {
	
	static Scanner clavier = new Scanner(System.in);
	public static void main(String[] args) {
		
		int nb1 = 0, nb2 = 0;

		System.out.println("Entrer le nombre 1: ");
		nb1 = clavier.nextInt();
		
		System.out.println("Entrer le nombre 2: ");
		nb2 = clavier.nextInt();

		System.out.println("La somme de " + nb1 + " et de " + nb2 + " est: " + (nb1+nb2));
		System.out.println("La différence de " + nb1 + " et de " + nb2 + " est: " + (nb1-nb2));
		System.out.println("Le produit de " + nb1 + " et de " + nb2 + " est: " + (nb1*nb2));
		
	}

}

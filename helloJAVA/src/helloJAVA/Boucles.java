package helloJAVA;

import java.util.Scanner;

public class Boucles {

	public static void main(String[] args) {
		
		Scanner clavier = new Scanner(System.in);				
		
		for(int i = 0; i <= 5; i++) {
			System.out.println("La variable i = " + i);
		}		
		// Table de multiplication
		System.out.println("//// Table de multiplication de");
		final int NOMBRE = 5;
		for(int i = 1; i <= 10; i++) {
			System.out.println("9 multiplié par " + i + " est " + (NOMBRE*i));
		}
		

		// Table de multiplication
		System.out.println("// Boucle do while");
		
		int age = 0;
		
		while( age <= 0) {
			System.out.println("Entrer votre poids: ");
			age = clavier.nextInt();
			if(age <= 0) {
				System.out.println("Le poids doit être positif");	
				
			}
		} 
		
		System.out.println("Suite du programme...");
		
		
		
		

	}

}

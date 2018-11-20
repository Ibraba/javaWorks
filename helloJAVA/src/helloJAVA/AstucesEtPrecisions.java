package helloJAVA;

import java.util.Scanner;

public class AstucesEtPrecisions {

	private static Scanner clavier;

	public static void main(String[] args) {
		
		System.out.println("Les trucs et astuces");
		
		int a = 1_000_000;
		System.out.println(a + 1);
		
		System.out.println("Entrer un nombre compris entre 1 et 3");
		clavier = new Scanner(System.in);
		
		int number = clavier.nextInt();
		
		switch (number) {
			case 1:
				System.out.println("Vous avez 1");
				break;
			case 2:
				System.out.println("Vous avez 2");
				break;
			case 3:
				System.out.println("Vous avez 3");
				break;
	
			default:
				System.out.println("Entrer un nombre compris entre 1 et 3");
				break;
		}
		
	}

}

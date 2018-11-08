package helloJAVA;

import java.util.Scanner;

public class JeuPlusMoins {

	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
		
		int nbr_scret, nbr_user;
		
		nbr_scret = (int) (Math.random() * 999) + 1;
		
		do {
			System.out.println("Entrer un nombre (1 - 1000): ");
			nbr_user = clavier.nextInt();
			
			if(nbr_user == nbr_scret) {
				System.out.println("Bravooooo...! ");
			} else if(nbr_user > nbr_scret) {
				System.out.println("oooh trop grand nombre...! ");
			} else {
				System.out.println("Oops trop petit nombre...! ");
			}
			
		} while(nbr_user != nbr_scret);

	}

}

package helloJAVA;

import java.util.Scanner;

public class Fonctions {
	private static Scanner clavier = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.printf("Fonctions ");
		
		
		/*
		sayHello("Dinguiraye");
		sayHello("Kalinko");
		sayHello("Dinguiraye");
		sayHello("Sokogoly");
		*/
		int val = doubleFunc(6);
		System.out.println((val - 3) + 5);
		
		//sayHello();
		//secondMethod();
		System.out.println(factoriel(5));
		
		
		
		
	}
	/*
	static void sayHello(String userName){
		System.out.printf("Hello %s\n", userName);
	}
	*/
	
	static int doubleFunc(int nbre) {
		return nbre * 2;
	}
	
	static void sayHello() {
		
		String userName;

		System.out.println("Entrer votre nom:");
		userName = clavier.nextLine();

		System.out.printf("Hello %s\n", userName);
		
		
	}

	static void firstMethod() {

		System.out.println("I'm firstMethod ");
	}
	
	static int secondMethod() {
		firstMethod();
		return 2;
	}
	
	static double racineCarreeDouble(int nbre) {
		int nbreDouble = nbre * 2;
		return Math.sqrt(nbreDouble);
	}
	
	static int factoriel(int n) {
		if(n == 0 || n == 1) {			
			return 1;
		} else {
			return n * factoriel(n-1);
		}
	}

}

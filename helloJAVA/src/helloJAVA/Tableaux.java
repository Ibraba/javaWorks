package helloJAVA;

public class Tableaux {

	public static void main(String[] args) {
		
		System.out.println("// Les Tableaux");
/*		
		int[] tab = {415, 217, 223, 12};
		//double[] test = new double[3];

		for(int val : tab) {
			System.out.println(val);
			
		}

		for(int i = 0; i < tab.length; i+=2) {
			System.out.println(tab[i]);
			
		}
		*/
		/*
		int[] tab1 = null;
		
		try {

			for(int i = 0; i < tab1.length; i++ ) {
				
			}
		} catch(NullPointerException e) {
			System.out.println("Le tableau ne point sur rien");
		}
		*/
		
		/*

		int[] tab1 = {1, 2, 3};
		int[] tab2 = {1, 2, 3};
		
		//tab2 = tab1;
		
		if(tab1 == null || tab2 == null || tab1.length != tab2.length) {
			System.out.println("Différence");
		} else {
			int i = 0;
			while(i < tab1.length && tab1[i] == tab2[i]) {
				++i;
			}
			
			if(i >= tab1.length) {
				System.out.println("Egalité");
			} else {
				System.out.println("Différence");
			}
		}
		*/

		int[][] scores = {{5,3,5,7,50},{6,7,90},{2,70,9,79,900,15,20}};
		/*
		int[][] scores = new int[2][2];

		scores[0][0] = 5;
		scores[0][1] = 5;
		scores[1][0] = 5;
		scores[1][1] = 8;
		
		System.out.println(scores[1][1]);
		*/
		
		for(int i = 0, nbRows = scores.length;  i < nbRows; i++) {
			for(int j = 0, nbColumn =  scores[i].length; j < nbColumn; j++) {
				System.out.print(scores[i][j] + " ");
			}
			System.out.println();
		}
		
		
		
		 		
	}

}

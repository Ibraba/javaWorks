package helloJAVA;

public class Tableaux {

	public static void main(String[] args) {
		
		System.out.println("// Les Tableaux");
		
		int[] tab = {415, 217, 223, 12};
		//double[] test = new double[3];
/*
		for(int val : tab) {
			System.out.println(val);
			
		}
*/
		for(int i = 0; i < tab.length; i+=2) {
			System.out.println(tab[i]);
			
		}
		
		//System.out.println("Le nombre d'élement du tableau test est de: " + test.length + " et test[0] " + test[0]); 
		
	}

}

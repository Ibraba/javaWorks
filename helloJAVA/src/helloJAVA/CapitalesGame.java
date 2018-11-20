package helloJAVA;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class CapitalesGame {

	public static void main(String[] args) {
		
		final int NUMBER_QUESTIONS = 7;
		int index;
		String pays, capitale;
		
		ArrayList<Integer> indexesAlreadyTaken = new ArrayList<>();
		
		
		String[][] data = {
				{"Senegal", "Dakar"},
				{"France", "Paris"},
				{"Niger", "Niamey"},
				{"Nigeria", "Lagos"},
				{"Allemagne", "Berlin"},
				{"Guinée", "Conakry"},
				{"Monaco", "Monaco"},
				{"Italie", "Rome"},
				{"Perou", "Lima"}
		};
		
		System.out.println(data[8][1]);
		
		Scanner clavier = new Scanner(System.in);
		
		for (int i = 0; i < NUMBER_QUESTIONS; i++) {
			do {
				Random random = new Random();
				index = random.nextInt(data.length); 				
			} while (indexesAlreadyTaken.contains(index));
			
			indexesAlreadyTaken.add(index);
			pays = data[index][0];
			capitale = data[index][1];
			System.out.printf("Quelle est la capitale de ce pays: %s?\n", pays);
		}

	}

}

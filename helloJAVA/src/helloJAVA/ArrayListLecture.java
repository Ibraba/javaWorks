package helloJAVA;
import java.util.ArrayList;

public class ArrayListLecture {

	public static void main(String[] args) {
		
		System.out.println("// Array list Lecture ");
		
		
		ArrayList<String> array = new ArrayList<String>();

		array.add("Ronald");		
		array.add(0, "Naty");
		//array.add("Nat");
		//array.add("Roland");
		//array.add("Morlando");		
		
		
		//array.set(0, "Danold");
		System.out.println(array.get(1));
		
	/*		
		tab.add(71);
		tab.add(142);
		tab.add(2);
		tab.add(7);
		
		//tab.clear();
		//tab.remove(2);
		
		if(tab.isEmpty()) {
			System.out.println("Tab vide");
		} else {
			
			System.out.println(tab.get(2));
		}
	*/
		


	}

}

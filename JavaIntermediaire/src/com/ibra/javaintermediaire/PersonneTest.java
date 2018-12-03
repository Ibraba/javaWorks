package com.ibra.javaintermediaire;

public class PersonneTest {
	
	public static void main(String[] args) {
		Personne p1 = new Personne("Marie", " France");
		Personne p2 = new Personne("Alpha", " France");
		try {
			p1.setAge(11);			
		} catch(IllegalArgumentException e) {
			e.printStackTrace();
		}
		//System.out.println(p2.fullName());
		// https://www.youtube.com/watch?v=b__km5ZIMfk&index=16&list=PLlxQJeQRaKDTCU85T7MTT8_YVfzLMtCKH

		System.out.println("Je serai pas executé");
		//https://www.youtube.com/watch?v=fQbm0AlpX54&list=PLlxQJeQRaKDTCU85T7MTT8_YVfzLMtCKH&index=19
	}

}

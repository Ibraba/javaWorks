package com.ibra.javaintermediaire;

public class Circle extends Forme {
	
	protected int rayon = 4;

	@Override
	public double aire() {

		return Math.PI * rayon * rayon;
	}

	
}

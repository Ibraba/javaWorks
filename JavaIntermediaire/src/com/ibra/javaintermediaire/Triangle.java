package com.ibra.javaintermediaire;

public class Triangle extends Forme {
	
	protected int base = 8;
	protected int hauteur = 2;

	@Override
	public double aire() {
		return base * hauteur * 0.5;
	}
	
}

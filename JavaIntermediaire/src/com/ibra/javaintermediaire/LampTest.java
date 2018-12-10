package com.ibra.javaintermediaire;

public class LampTest {

	public static void main(String[] args) {
		Lamp lamp = new Lamp(true);
		Interruptor interruptor = new Interruptor(lamp);		

		System.out.println(lamp.isActivated());
		System.out.println(interruptor.getPosition());

		interruptor.changePosition();

		System.out.println(lamp.isActivated());
		System.out.println(interruptor.getPosition());
		
		interruptor.changePosition();		

		System.out.println(lamp.isActivated());
		System.out.println(interruptor.getPosition());

	}

}

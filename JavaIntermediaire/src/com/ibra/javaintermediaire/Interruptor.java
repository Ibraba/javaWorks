package com.ibra.javaintermediaire;

public class Interruptor {
	private boolean  position;
	private Lamp lamp;
	
	public Interruptor(Lamp lamp) {
		this.lamp = lamp;
		this.position = lamp.isActivated();
	}

	public String getPosition() {
		if(position == true) {
			return "On";
		}else {
			return "Off";
		}
	}
	
	public void changePosition() {
		lamp.modifyStatus();
		position = lamp.isActivated();
	}
	
}

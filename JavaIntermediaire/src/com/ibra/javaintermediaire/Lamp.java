package com.ibra.javaintermediaire;

public class Lamp {
	
	private boolean status;
	
	public Lamp(boolean status) {
		this.status = status;
	}
	
	public boolean isActivated() {
		return status;
	}
	
	public void modifyStatus() {		
		this.status = !this.status;		
	}
	

}

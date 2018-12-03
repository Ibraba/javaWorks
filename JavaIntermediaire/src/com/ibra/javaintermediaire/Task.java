package com.ibra.javaintermediaire;

public class Task {

	public String description;
	public String title;
	public boolean completed = false;
	
	public Task(String description, String title) {
		this.description = description;
		this.title = title;
	}
	
	public void complete() {
		completed = true;
	}

}

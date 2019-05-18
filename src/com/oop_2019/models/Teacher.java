package com.oop_2019.models;

import java.util.Date;

public class Teacher extends Person {

	
	private String title;
	
	private String position;
	
	private Subject[] subjects;
	
	
	public Teacher(String id) {
		this.id = id;
	}
	
	

	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	
	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}




	/**
	 * @return the subjects
	 */
	public Subject[] getSubjects() {
		return subjects;
	}




	/**
	 * @param subjects the subjects to set
	 */
	public void setSubjects(Subject[] subjects) {
		this.subjects = subjects;
	}

	
	
}

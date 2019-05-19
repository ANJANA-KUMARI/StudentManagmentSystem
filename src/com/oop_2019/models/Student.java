package com.oop_2019.models;

import java.util.Date;

public class Student extends Person {

	private String grade;
	private int roll;
	private Subject[] subjects;

	

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}
	
	public Subject[] getSubjects() {
		return this.subjects;
	}
	
	public void setSubjects(Subject[] subjects) {
		this.subjects = subjects;
	}

}

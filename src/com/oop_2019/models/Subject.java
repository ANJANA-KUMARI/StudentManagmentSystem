package com.oop_2019.models;

public class Subject {

	private int id;
	private String subjectName;
	private String section;
	private Teacher subjectHead;
	private String description;
	
	public Subject(int id) {
		this.id = id;
	}
	
	public int getId() {
		return this.id;
	}
	
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public Teacher getSubjectHead() {
		return subjectHead;
	}
	public void setSubjectHead(Teacher subjectHeadValue) {
		this.subjectHead = subjectHeadValue;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}

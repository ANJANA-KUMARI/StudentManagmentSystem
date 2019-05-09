package com.oop_2019.models;

public class Subject {

	private String subjectName;
	private String section;
	private Teacher subjectHead;
	private String grade;
	private String description;
	
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
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}

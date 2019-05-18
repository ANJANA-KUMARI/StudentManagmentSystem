package com.oop_2019.models;

import java.util.Date;

public class Exam {

		private int id;
		private String examName;
		private Date examDate;
		private Subject subject;
		private String grade;
		
		public int getId() {
			return this.id;
		}
		
		public void setId(int id) {
			this.id = id;
		}
		
		public String getExamName() {
			return examName;
		}
		public void setExamName(String examName) {
			this.examName = examName;
		}
		public Date getExamDate() {
			return examDate;
		}
		public void setExamDate(Date examDate) {
			this.examDate = examDate;
		}
		public Subject getSubject() {
			return subject;
		}
		public void setSubject(Subject subject) {
			this.subject = subject;
		}
		public String getGrade() {
			return grade;
		}
		public void setGrade(String grade) {
			this.grade = grade;
		}
		
		
}

package com.oop_2019.services;

import java.util.ArrayList;

import com.oop_2019.models.Student;
import com.oop_2019.models.Subject;

public interface IStudentService {

	void addStudent(Student student);
	Student getStudent(String id);
	ArrayList<Student> getAllStudents(); 
	void addSubjectToStudent(Student student, Subject subject);
	
	void updateStudent(Student student);
	void deleteStudent(String id);
	
}

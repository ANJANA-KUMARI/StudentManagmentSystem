package com.oop_2019.services;

import java.util.List;

import com.oop_2019.models.Subject;

public interface ISubjectService {

	void addSubject(Subject subject);
	void addSubjectToStudent(int subjectId, String studentId);
	void addSubjectToTeacher(int subjectId, String teacherId);
	void addSubjectToExam(int subjectId, int examId);
	List<Subject> getAllSubjects();
	Subject getSubject(int id);
	void updateSubject(Subject subject);
	void deleteSubject(int id);
	
}

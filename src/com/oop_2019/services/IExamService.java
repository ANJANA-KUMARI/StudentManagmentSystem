package com.oop_2019.services;

import java.util.List;

import com.oop_2019.models.Exam;

public interface IExamService {
	
	void addExam(Exam exam);
	void updateExam(Exam exam);
	Exam getExam(int id);
	List<Exam> getAllExams();
}

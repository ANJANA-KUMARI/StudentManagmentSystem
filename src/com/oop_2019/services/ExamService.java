package com.oop_2019.services;

import java.util.List;

import com.oop_2019.models.Exam;
import com.oop_2019.models.Subject;
import com.oop_2019.repository.ExamRepository;
import com.oop_2019.repository.IRepository;
import com.oop_2019.repository.ISubjectRepository;
import com.oop_2019.repository.SubjectRepository;

public class ExamService implements IExamService{

	private static final IRepository<Exam> examRepository = new ExamRepository();
	private static final ISubjectRepository subjectRepository = new SubjectRepository();
	
	
	public void addExam(Exam exam) {
		examRepository.create(exam);
	}

	@Override
	public void updateExam(Exam exam) {
		examRepository.update(exam);
		
	}

	@Override
	public Exam getExam(int id) {
		Exam exam = examRepository.get(id);
		Subject examSubject = subjectRepository.getSubjectOfExam(exam.getId());
		exam.setSubject(examSubject);
		return exam;
	}

	@Override
	public List<Exam> getAllExams() {
		List<Exam> exams = examRepository.getAll();
		
		for (Exam exam : exams) {
			Subject subject = subjectRepository.getSubjectOfExam(exam.getId());
			exam.setSubject(subject);
		}
		return exams;
	}

	@Override
	public void deleteExam(int examId) {
		examRepository.delete(examId);
	}
}

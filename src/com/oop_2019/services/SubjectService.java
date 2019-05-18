package com.oop_2019.services;

import java.util.ArrayList;
import java.util.List;

import com.oop_2019.models.Subject;
import com.oop_2019.models.Teacher;
import com.oop_2019.repository.IRepository;
import com.oop_2019.repository.ISubjectRepository;
import com.oop_2019.repository.SubjectRepository;
import com.oop_2019.repository.TeacherRepository;

public class SubjectService implements ISubjectService {

	private static final ISubjectRepository subjectRepository = new SubjectRepository();
	private static final IRepository<Teacher> teacherRepository = new TeacherRepository();
	
	public void addSubject(Subject subject) { 
		subjectRepository.create(subject);
	}

	@Override
	public List<Subject> getAllSubjects() {
		ArrayList<Subject> subjectList = (ArrayList<Subject>)subjectRepository.getAll();
		
		// set the teacher objects
		for (Subject subject : subjectList) {
			subject.setSubjectHead(teacherRepository.get(subject.getSubjectHead().getId()));
		}
		
		return subjectList;
	}

	@Override
	public void updateSubject(Subject subject) {
		subjectRepository.update(subject);
		
	}

	@Override
	public void deleteSubject(int id) {
		subjectRepository.delete(id);
		
	}

	@Override
	public Subject getSubject(int id) {
		Subject subject = subjectRepository.get(id);
		subject.setSubjectHead(teacherRepository.get(subject.getSubjectHead().getId()));
		return subject;
	}

	@Override
	public void addSubjectToStudent(int subjectId, String studentId) {
		
		subjectRepository.addSubjectToStudent(studentId, subjectId);
	}

	@Override
	public void addSubjectToTeacher(int subjectId, String teacherId) {
		subjectRepository.addSubjectToTeacher(teacherId, subjectId);
		
	}

	@Override
	public void addSubjectToExam(int subjectId, int examId) {
		subjectRepository.addSubjectToExam(examId, subjectId);
		
	}
}

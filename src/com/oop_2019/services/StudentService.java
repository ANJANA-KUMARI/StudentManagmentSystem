package com.oop_2019.services;

import java.util.ArrayList;

import com.oop_2019.models.Student;
import com.oop_2019.models.Subject;
import com.oop_2019.repository.IRepository;
import com.oop_2019.repository.ISubjectRepository;
import com.oop_2019.repository.StudentRepository;
import com.oop_2019.repository.SubjectRepository;

public class StudentService implements IStudentService{
	
	private static final IRepository<Student> studentRepository = new StudentRepository();
	private static final ISubjectRepository subjectRepository = new SubjectRepository();
	
	public void addStudent(Student student) {
		
	}

	@Override
	public Student getStudent(String id) {
		Student student = studentRepository.get(id);
		Subject[] subjects = subjectRepository.getSubjectsOfStudent(student.getId()).toArray(new Subject[0]);
		student.setSubjects(subjects);
		return student;
	}

	@Override
	public ArrayList<Student> getAllStudents() {
		ArrayList<Student> studentList = (ArrayList<Student>)studentRepository.getAll();
		
		for (Student student : studentList) {
			Subject[] subjects = subjectRepository.getSubjectsOfStudent(student.getId()).toArray(new Subject[0]);
			student.setSubjects(subjects);
		}
		return studentList;
	}

	@Override
	public void addSubjectToStudent(Student student, Subject subject) {
		subjectRepository.addSubjectToStudent(student.getId(), subject.getId());
	}

	@Override
	public void updateStudent(Student student) {
		studentRepository.update(student);
		
	}

	@Override
	public void deleteStudent(String id) {
		studentRepository.delete(id);
		// TODO delete StudentSubject records too
		
	}
	
	
}

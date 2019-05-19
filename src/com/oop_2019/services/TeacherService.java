package com.oop_2019.services;

import java.util.ArrayList;

import com.oop_2019.models.Subject;
import com.oop_2019.models.Teacher;
import com.oop_2019.repository.ISubjectRepository;
import com.oop_2019.repository.ITeacherRepository;
import com.oop_2019.repository.SubjectRepository;
import com.oop_2019.repository.TeacherRepository;
import com.oop_2019.util.PasswordUtil;

public class TeacherService implements ITeacherService {

	private static ITeacherRepository<Teacher> teacherRepository = new TeacherRepository();
	private static final ISubjectRepository subjectRepository = new SubjectRepository();

	
	@Override
	public void addTeacher(Teacher teacher, String password) {
		
		password = PasswordUtil.encryptPWD(password);
		
		teacherRepository.create(teacher, password);
		
	}

	@Override
	public ArrayList<Teacher> getAllTeachers() {
		
		ArrayList<Teacher> list = (ArrayList<Teacher>)teacherRepository.getAll();
		
		for (Teacher teacher : list) {
			Subject[] subjects = subjectRepository.getSubjectsOfTeacher(teacher.getId()).toArray(new Subject[0]);
			teacher.setSubjects(subjects);
		}
		return list;
	}

	@Override
	public Teacher getTeacherByID(String teacherID) {
		Teacher teacher = teacherRepository.get(teacherID);
		Subject[] subjects = subjectRepository.getSubjectsOfStudent(teacher.getId()).toArray(new Subject[0]);
		teacher.setSubjects(subjects);
		return teacher;
	}

	

	@Override
	public void updateTeacher( Teacher teacher) {
		teacherRepository.update(teacher); 
		
	}

	@Override
	public void removeTeacher(String teacherID) {
		teacherRepository.delete(teacherID);
		
	}

	@Override
	public Teacher loginTeacher(String email, String password) {
		
		String encryptedPwd = teacherRepository.getPassword(email);
		
		if(PasswordUtil.verifyPassword(password, encryptedPwd)) {
			System.out.println("Valid teacher");
			Teacher teacher = teacherRepository.get(email);
			return teacher;
		}
		return null;
	}
	

}

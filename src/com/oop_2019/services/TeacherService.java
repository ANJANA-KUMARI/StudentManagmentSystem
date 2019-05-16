package com.oop_2019.services;

import java.util.ArrayList;

import com.oop_2019.models.Teacher;
import com.oop_2019.repository.ITeacherRepository;
import com.oop_2019.repository.TeacherRepository;
import com.oop_2019.util.PasswordUtil;

public class TeacherService implements ITeacherService {

	private static ITeacherRepository<Teacher> teacherRepository = new TeacherRepository();
	
	@Override
	public void addTeacher(Teacher teacher, String password) {
		
		password = PasswordUtil.encryptPWD(password);
		
		teacherRepository.create(teacher, password);
		
	}

	@Override
	public ArrayList<Teacher> getAllTeachers() {
		
		ArrayList<Teacher> list = (ArrayList<Teacher>)teacherRepository.getAll();
		return list;
	}

	@Override
	public Teacher getTeacherByID(String teacherID) {
		Teacher teacher = teacherRepository.get(teacherID);
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
		
		Teacher teacher = teacherRepository.get(email, password);
		return teacher;
	}
	

}

package com.oop_2019.services;

import java.util.ArrayList;

import com.oop_2019.models.Teacher;
import com.oop_2019.repository.ITeacherRepository;
import com.oop_2019.repository.TeacherRepository;

public class TeacherService implements ITeacherService {

	private static ITeacherRepository teacherRepository = new TeacherRepository();
	
	@Override
	public void addTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<Teacher> getAllTeachers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Teacher getTeacherByID(String teacherID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Teacher> getTeachers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Teacher updateTeacher(String teacherID, Teacher teacher) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeTeacher(String teacherID) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean loginTeacher(String email, String password) {
		
		if(teacherRepository.get(email, password) == null) {
			return false;
		}
		return true;
	}
	

}

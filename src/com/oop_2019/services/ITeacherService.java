package com.oop_2019.services;

import java.util.ArrayList;

import com.oop_2019.models.Teacher;
import com.sun.istack.internal.logging.Logger;

public interface ITeacherService {


	

	ArrayList<Teacher> getAllTeachers();
	

	
	/**
	 * Add teachers for teacher table
	 * @param teacher
	 */
	
	public void addTeacher(Teacher teacher, String password);
	
	/**
	 * Get a particular Teacher
	 * 
	 * @param teacherID
	 * @return Teacher
	 */
	
	public Teacher getTeacherByID(String teacherID);
	
	
	
	/**
	 * Update existing teacher
	 * @param teacherID
	 * @param teacher
	 * 
	 * @return
	 */
	
	public void updateTeacher( Teacher teacher);
	
	/**
	 * Remove existing teacher
	 * 
	 * @param teacherID
	 */
	
	public void removeTeacher(String teacherID);
	
	/**
	 * @param email
	 * @param password
	 */
	
	public Teacher loginTeacher(String email, String password);
}

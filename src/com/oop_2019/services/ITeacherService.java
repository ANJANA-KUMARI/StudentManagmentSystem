package com.oop_2019.services;

import java.util.ArrayList;

import com.oop_2019.models.Teacher;
import com.sun.istack.internal.logging.Logger;

public interface ITeacherService {


	
	// me okkom teachers lav ganna method eka malu meka call kalam teacher list ekak enaw malu
	ArrayList<Teacher> getAllTeachers();
	
	public static final Logger log = Logger.getLogger(ITeacherService.class.getName(), null);
	
	/**
	 * Add teachers for teacher table
	 * @param teacher
	 */
	
	public void addTeacher(Teacher teacher);
	
	/**
	 * Get a particular Teacher
	 * 
	 * @param teacherID
	 * @return Teacher
	 */
	
	public Teacher getTeacherByID(String teacherID);
	
	/**
	 * Get all list of teachers
	 * 
	 * @return ArrayList<Teacher>
	 */
	
	public ArrayList<Teacher> getTeachers();
	
	/**
	 * Update existing teacher
	 * @param teacherID
	 * @param teacher
	 * 
	 * @return
	 */
	
	public Teacher updateTeacher(String teacherID, Teacher teacher);
	
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
	
	public boolean loginTeacher(String email, String password);
}

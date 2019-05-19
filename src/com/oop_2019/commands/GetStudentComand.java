/**
 * @author Anjana Kumari
 */
package com.oop_2019.commands;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oop_2019.models.Student;

import com.oop_2019.services.IStudentService;

import com.oop_2019.services.StudentService;


/**
 * @author Anjana
 *
 */
public class GetStudentComand implements ICommand<Student> {

	@Override
	public Student execute(HttpServletRequest request, HttpServletResponse response) {

		String studentId = request.getParameter("studentId");
		IStudentService studentService = new StudentService();
		
		Student student = studentService.getStudent(studentId);

		return student;
	}
	
	
}

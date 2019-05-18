/**
 * @author Anjana Kumari
 */
package com.oop_2019.commands;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oop_2019.services.IStudentService;
import com.oop_2019.services.StudentService;

/**
 * @author Anjana
 *
 */
public class DeleteStudentCommand implements ICommand<Boolean> {

	@Override
	public Boolean execute(HttpServletRequest request, HttpServletResponse response) {
		String id = request.getParameter("studentId");
		IStudentService studentService = new StudentService();
		studentService.deleteStudent(id);
		
		return true;
	}

}

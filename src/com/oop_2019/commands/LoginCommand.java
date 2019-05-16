/**
 * @author Anjana Kumari
 */
package com.oop_2019.commands;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oop_2019.services.ITeacherService;
import com.oop_2019.services.TeacherService;

/**
 * @author Anjana
 *
 */
public class LoginCommand implements ICommand{

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		ITeacherService teacherService = new TeacherService();
		
		if(teacherService.loginTeacher(email, password)) {
			// Goto dashboard
		} else {
			// Return to login page
		}
		return null;
	}
	
	
}

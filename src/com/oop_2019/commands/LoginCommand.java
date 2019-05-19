/**
 * @author Anjana Kumari
 */
package com.oop_2019.commands;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.oop_2019.models.Teacher;
import com.oop_2019.services.ITeacherService;
import com.oop_2019.services.TeacherService;
import com.oop_2019.util.CommonConstants;

/**
 * @author Anjana
 *
 */
public class LoginCommand implements ICommand<Boolean>{

	@Override
	public Boolean execute(HttpServletRequest request, HttpServletResponse response) {
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		ITeacherService teacherService = new TeacherService();
		
		Teacher loggedInTeacher = teacherService.loginTeacher(email, password);
		System.out.println("Got teacher => " + loggedInTeacher);
		if(loggedInTeacher != null) {
			
			// set the session
			HttpSession session = request.getSession(true);			
			session.setAttribute(CommonConstants.SESSION_ID_LOGGED_IN_TEACHER, loggedInTeacher);
			
			return true;
		} 
		
		return false;
	}
	
	
}

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
public class DeleteTeacherCommand implements ICommand<Boolean> {

	@Override
	public Boolean execute(HttpServletRequest request, HttpServletResponse response) {
		String teacherId = request.getParameter("teacherId");
		if(teacherId == null || teacherId.isEmpty()) {
			return false;
		}
		
		ITeacherService  teacherService = new TeacherService();
		
		teacherService.removeTeacher(teacherId);
		
		return true;
	}

}

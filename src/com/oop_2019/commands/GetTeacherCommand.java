/**
 * @author Anjana Kumari
 */
package com.oop_2019.commands;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oop_2019.models.Teacher;
import com.oop_2019.services.ITeacherService;
import com.oop_2019.services.TeacherService;

/**
 * @author Anjana
 *
 */
public class GetTeacherCommand implements ICommand<Teacher> {

	@Override
	public Teacher execute(HttpServletRequest request, HttpServletResponse response) {
		
		String teacherId = request.getParameter("teacherId");
		
		ITeacherService teacherService = new TeacherService();
		
		Teacher teacher = teacherService.getTeacherByID(teacherId);
		return teacher;
	}

}

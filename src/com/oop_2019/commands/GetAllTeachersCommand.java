/**
 * @author Anjana Kumari
 */
package com.oop_2019.commands;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oop_2019.models.Teacher;
import com.oop_2019.services.ITeacherService;
import com.oop_2019.services.TeacherService;

/**
 * @author Anjana
 *
 */
public class GetAllTeachersCommand implements ICommand<List<Teacher>> {

	@Override
	public List<Teacher> execute(HttpServletRequest request, HttpServletResponse response) {
		ITeacherService teacherService = new TeacherService();
		List<Teacher> teachers = teacherService.getAllTeachers();
		return teachers;
	}

}

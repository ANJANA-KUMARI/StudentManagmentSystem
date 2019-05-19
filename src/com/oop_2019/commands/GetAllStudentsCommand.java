/**
 * @author Anjana Kumari
 */
package com.oop_2019.commands;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oop_2019.models.Student;
import com.oop_2019.services.IStudentService;
import com.oop_2019.services.StudentService;

/**
 * @author Anjana
 *
 */
public class GetAllStudentsCommand implements ICommand<List<Student>> {

	@Override
	public List<Student> execute(HttpServletRequest request, HttpServletResponse response) {
		
		String grade = request.getParameter("grade");
		IStudentService studentService = new StudentService();
		
		List<Student> allStudents = studentService.getAllStudents();
		
		if(grade == "All" || grade == null || grade.length() == 0) {
			return allStudents;
		}
		
		List<Student> studentsOfGrade = new ArrayList<Student>();
		
		for (Student student : allStudents) {
			if(student.getGrade().equalsIgnoreCase(grade)) {
				studentsOfGrade.add(student);
			}
		}
		return studentsOfGrade;
	}

}

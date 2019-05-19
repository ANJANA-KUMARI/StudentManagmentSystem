/**
 * @author Anjana Kumari
 */
package com.oop_2019.commands;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oop_2019.models.Exam;
import com.oop_2019.services.ExamService;
import com.oop_2019.services.IExamService;

/**
 * @author Anjana
 *
 */
public class GetAllExamsCommand implements ICommand<List<Exam>>{

	@Override
	public List<Exam> execute(HttpServletRequest request, HttpServletResponse response) {
		
		IExamService examService = new ExamService();
		List<Exam> exams = examService.getAllExams();
		
		
		return exams;
	}

}

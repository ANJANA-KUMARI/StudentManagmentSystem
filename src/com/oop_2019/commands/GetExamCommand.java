/**
 * @author Anjana Kumari
 */
package com.oop_2019.commands;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oop_2019.models.Exam;
import com.oop_2019.services.ExamService;
import com.oop_2019.services.IExamService;

/**
 * @author Anjana
 *
 */
public class GetExamCommand implements ICommand<Exam> {

	@Override
	public Exam execute(HttpServletRequest request, HttpServletResponse response) {
		String examId = request.getParameter("examId");
		
		IExamService examService = new ExamService();
		
		Exam exam = examService.getExam(Integer.parseInt(examId));
		return exam;
	}

}

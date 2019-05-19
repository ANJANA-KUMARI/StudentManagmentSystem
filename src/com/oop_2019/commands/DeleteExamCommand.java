/**
 * @author Anjana Kumari
 */
package com.oop_2019.commands;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oop_2019.services.ExamService;
import com.oop_2019.services.IExamService;

/**
 * @author Anjana
 *
 */
public class DeleteExamCommand implements ICommand<Boolean> {

	@Override
	public Boolean execute(HttpServletRequest request, HttpServletResponse response) {
		String examId = request.getParameter("examId");
		
		IExamService examService = new ExamService();
		
		examService.deleteExam(Integer.parseInt(examId));
		return true;
	}
	
}

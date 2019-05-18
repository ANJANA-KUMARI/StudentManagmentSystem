/**
 * @author Anjana Kumari
 */
package com.oop_2019.commands;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oop_2019.models.Exam;
import com.oop_2019.services.ExamService;
import com.oop_2019.services.IExamService;
import com.oop_2019.services.ISubjectService;
import com.oop_2019.services.SubjectService;

/**
 * @author Anjana
 *
 */
public class UpdateExamCommand implements ICommand<Boolean> {

	@Override
	public Boolean execute(HttpServletRequest request, HttpServletResponse response) {

		ArrayList<String> errorList = new ArrayList<String>();
		
		String examId = request.getParameter("examId");
		
		String examNameValue = request.getParameter("examName");
		if(examNameValue.length() == 0) {
			errorList.add("Exam name is required."); 
		}
		
		String examDateValue = request.getParameter("examDate");
		Date dateExamValue = null;
		
		try {
			dateExamValue = new SimpleDateFormat("dd/MM/yyyy").parse(examDateValue);
		} catch (ParseException e) {
			errorList.add("Exam date is required.");
			e.printStackTrace();
		}

		String gradeValue = request.getParameter("grade");
		if(gradeValue.length() == 0) {
			errorList.add("Grade is required.");
		}
		
		if(errorList.size() > 0) {
			request.setAttribute("errorList", errorList);
			return false;
		}
		
		Exam newExam = new Exam();
		
		newExam.setId(Integer.parseInt(examId));
		newExam.setExamName(examNameValue);
		newExam.setExamDate(dateExamValue);
		newExam.setGrade(gradeValue);
		
		IExamService examService = new ExamService();
		
		examService.updateExam(newExam);
		
	
		return true;
	}

}

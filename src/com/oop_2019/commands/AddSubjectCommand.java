/**
 * @author Anjana Kumari
 */
package com.oop_2019.commands;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oop_2019.models.Subject;
import com.oop_2019.models.Teacher;
import com.oop_2019.services.ISubjectService;
import com.oop_2019.services.SubjectService;

/**
 * @author Anjana
 *
 */
public class AddSubjectCommand implements ICommand<Boolean> {
	
	private static Logger log = Logger.getLogger(AddSubjectCommand.class.getName(), null);

	@Override
	public Boolean execute(HttpServletRequest request, HttpServletResponse response) {

		ArrayList<String> errorList = new ArrayList<String>();
		
		String subjectNameValue = request.getParameter("subjectName");
		if(subjectNameValue.length() == 0) {
			errorList.add("Subject name is required");
		}
		
		String sectionValue = request.getParameter("section");
		if(sectionValue.length() == 0) {
			errorList.add("Section is required");
		}
		
		String subjectHeadValue = request.getParameter("subjectHeadId");
		if(subjectHeadValue.length() == 0) {
			errorList.add("Subject head is required");
		}
		
		
		String descriptionValue = request.getParameter("description");
		
		if(errorList.size() > 0) {
			request.setAttribute("errorMsgs", errorList);
			log.log(Level.WARNING, "Has errors in AddSubjectCommand => ",errorList);
			return false;
		}
		
		Subject newSubject = new Subject(0);
		
		newSubject.setSubjectName(subjectNameValue);
		newSubject.setSection(sectionValue);
		newSubject.setSubjectHead(new Teacher(subjectHeadValue));
		newSubject.setDescription(descriptionValue);
		
		ISubjectService subjectService = new SubjectService();
		subjectService.addSubject(newSubject);
		
		return true;
		
	}

}

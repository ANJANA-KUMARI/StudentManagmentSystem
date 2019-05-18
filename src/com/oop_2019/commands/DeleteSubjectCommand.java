/**
 * @author Anjana Kumari
 */
package com.oop_2019.commands;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oop_2019.services.ISubjectService;
import com.oop_2019.services.SubjectService;

/**
 * @author Anjana
 *
 */
public class DeleteSubjectCommand implements ICommand<Boolean> {

	@Override
	public Boolean execute(HttpServletRequest request, HttpServletResponse response) {
		int subjectId = Integer.parseInt(request.getParameter("subjectId"));
		
		ISubjectService subjectService = new SubjectService();
		
		subjectService.deleteSubject(subjectId);
		
		return true;
	}

}

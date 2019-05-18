/**
 * @author Anjana Kumari
 */
package com.oop_2019.commands;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oop_2019.models.Subject;
import com.oop_2019.services.ISubjectService;
import com.oop_2019.services.SubjectService;

/**
 * @author Anjana
 *
 */
public class GetSubjectAllCommand implements ICommand<List<Subject>> {

	@Override
	public List<Subject> execute(HttpServletRequest request, HttpServletResponse response) {
		ISubjectService subjectService = new SubjectService();
		List<Subject> subjectList = subjectService.getAllSubjects(); 
		return subjectList;
	}

}

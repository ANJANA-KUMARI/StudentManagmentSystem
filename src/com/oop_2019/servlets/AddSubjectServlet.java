package com.oop_2019.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oop_2019.models.Subject;
import com.oop_2019.services.ISubjectService;
import com.oop_2019.services.SubjectService;

/**
 * Servlet implementation class AddSubjectServlet
 */
// @WebServlet("/AddSubjectServlet")
public class AddSubjectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddSubjectServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String subjectNameValue = request.getParameter("subjectName");
		if(subjectNameValue.length() == 0) {
			// Error
		}
		
		String sectionValue = request.getParameter("section");
		if(sectionValue.length() == 0) {
			// Error
		}
		
//		Teacher subjectHeadValue = request.getParameter("subjectHead");
	//	if(subjectHeadValue.length() == 0) {
			// Error
		//}
		
		String gradeValue = request.getParameter("grade");
		if(gradeValue.length() == 0) {
			// Error
		}
		
		String descriptionValue = request.getParameter("description");
		
		Subject newSubject = new Subject();
		
		newSubject.setSubjectName(subjectNameValue);
		newSubject.setSection(sectionValue);
		//newSubject.setSubjectHead(subjectHeadValue);
		newSubject.setGrade(gradeValue);
		newSubject.setDescription(descriptionValue);
		
		ISubjectService subjectService = new SubjectService();
		subjectService.addSubject(newSubject);
		
		
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/views/ListEmployees.jsp");
		dispatcher.forward(request, response);
	}

}

package com.oop_2019.servlets;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oop_2019.models.Exam;
import com.oop_2019.services.ExamService;
import com.oop_2019.services.IExamService;

/**
 * Servlet implementation class AddExamServlet
 */
// @WebServlet("/AddExamServlet")
public class AddExamServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddExamServlet() {
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
		
		String examNameValue = request.getParameter("examName");
		if(examNameValue.length() == 0) {
			// Error
		}
		
		String examDateValue = request.getParameter("examDate");
		Date dateExamValue = null;
		
		try {
			dateExamValue = new SimpleDateFormat("dd/MM/yyyy").parse(examDateValue);
		} catch (ParseException e) {
			
			e.printStackTrace();
		}
//		
//		Subject subjectValue = request.getParameter("subject");
//		Subject subjectNameValue  = new 
//		
//		
		String gradeValue = request.getParameter("grade");
		if(gradeValue.length() == 0) {
			// Error
		}
		
		Exam newExam = new Exam();
		
		newExam.setExamName(examNameValue);
		newExam.setExamDate(dateExamValue);
		//newExam.setSubject(subjectValue);
		newExam.setGrade(gradeValue);
		
		IExamService examService = new ExamService();
		
		examService.addExam(newExam);
		
		
		
		// TODO Change Path
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/views/ListEmployees.jsp");
		dispatcher.forward(request, response);
	}

}

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

import com.oop_2019.models.Student;
import com.oop_2019.services.IStudentService;
import com.oop_2019.services.StudentService;

/**
 * Servlet implementation class AddStudentServlet
 */

public class AddStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddStudentServlet() {
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
		
		
		String firstNameValue = request.getParameter("firstName");
		if(firstNameValue.length() == 0) {
			// Error
		}
		
		String lastNameValue = request.getParameter("lastName");
		if(lastNameValue.length() == 0) {
			// Error
		}
		
		String sectionValue = request.getParameter("section");
		if(sectionValue.length() == 0) {
			// Error
		}
	
		String birthdayValue = request.getParameter("birthday");
		Date birthdayDateValue = null;
	
		try {
			birthdayDateValue = new SimpleDateFormat("dd/MM/yyyy").parse(birthdayValue);
		} catch (ParseException e) {
			
			e.printStackTrace();
		}
		
		String emailValue = request.getParameter("email");
		if(emailValue.length() == 0) {
			// Error
		}
	
		String phoneNumberValue = request.getParameter("phone");
		if(phoneNumberValue.length() == 0) {
			// Error
		}
		
		String cityValue = request.getParameter("city");
		if(cityValue.length() == 0) {
			// Error
		}
		
		String stateValue = request.getParameter("state");
		if(stateValue.length() == 0) {
			// Error
		}
		
		String zipValue = request.getParameter("zip");
		if(zipValue.length() == 0) {
			// Error
		}
	
		String genderValue = request.getParameter("gender");
		if(genderValue.length() == 0) {
			// Error
		}
		
		String gradeValue = request.getParameter("grade");
		if(gradeValue.length() == 0) {
			// Error
		}
		
		String rollValue = request.getParameter("roll");
		
		String imageValue = request.getParameter("image");
		
		
		Student student = new Student();

		student.setFirstName(firstNameValue);
		student.setLastName(lastNameValue);
		student.setSection(sectionValue);
		student.setBirthday(birthdayDateValue);
		student.setEmail(emailValue);
		student.setPhone(phoneNumberValue);
		student.setCity(cityValue);
		student.setState(stateValue);
		student.setZip(zipValue);
		student.setGender(genderValue);
		student.setGrade(gradeValue);
		student.setRoll(rollValue);
		student.setImage(imageValue);
		
		
		// TODO
		
		IStudentService studentService = new StudentService();
		
		studentService.addStudent(student);
		
		
		
		// TODO Change Path
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/views/ListEmployees.jsp");
		dispatcher.forward(request, response);
		
	}
	

}

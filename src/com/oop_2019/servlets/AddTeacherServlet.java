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

import com.oop_2019.models.Teacher;
import com.oop_2019.services.ITeacherService;
import com.oop_2019.services.TeacherService;

/**
 * Servlet implementation class AddTeacherServlet
 */

// @WebServlet("/AddTeacherServlet") 
public class AddTeacherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddTeacherServlet() {
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
		
		String titleValue = request.getParameter("title");
	 
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
		
		String passwordValue = request.getParameter("password");
		if(passwordValue.length() == 0) {
			// Error
		}
		
		String repeatPasswordValue = request.getParameter("repeatPassword");
		if(repeatPasswordValue.length() == 0) {
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
		
		String positionValue = request.getParameter("position");
		
		String imageValue = request.getParameter("image");
		
		Teacher newTeacher = new Teacher();
		
		newTeacher.setTitle(titleValue);
		newTeacher.setFirstName(firstNameValue);
		newTeacher.setLastName(lastNameValue);
		newTeacher.setSection(sectionValue);
		newTeacher.setBirthday(birthdayDateValue);
		newTeacher.setEmail(emailValue);
		newTeacher.setPassword(passwordValue);
		newTeacher.setRepeatPassword(repeatPasswordValue);
		newTeacher.setPhone(phoneNumberValue);
		newTeacher.setCity(cityValue);
		newTeacher.setState(stateValue);
		newTeacher.setZip(zipValue);
		newTeacher.setGender(genderValue);
		newTeacher.setPosition(positionValue);
		newTeacher.setImage(imageValue);
		
		ITeacherService teacherService = new TeacherService();
		teacherService.addTeacher(newTeacher);
		
		
		
	
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/views/ListEmployees.jsp");
		dispatcher.forward(request, response);
		
	}

}

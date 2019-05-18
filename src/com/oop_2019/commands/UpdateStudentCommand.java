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

import com.oop_2019.models.Student;
import com.oop_2019.services.IStudentService;
import com.oop_2019.services.StudentService;

/**
 * @author Anjana
 *
 */
public class UpdateStudentCommand implements ICommand<Boolean> {

	@Override
	public Boolean execute(HttpServletRequest request, HttpServletResponse response) {

		ArrayList<String> errorList = new ArrayList<String>();
		
		String studentId = request.getParameter("studentId");
		
		String firstNameValue = request.getParameter("firstName");
		if(firstNameValue.length() == 0) {
			errorList.add("First name is required");
		}
		
		String lastNameValue = request.getParameter("lastName");
		if(lastNameValue.length() == 0) {
			errorList.add("Last name is required");
		}
		
		String sectionValue = request.getParameter("section");
		if(sectionValue.length() == 0) {
			errorList.add("Section is required");
		}
	
		String birthdayValue = request.getParameter("birthday");
		Date birthdayDateValue = null;
	
		try {
			birthdayDateValue = new SimpleDateFormat("dd/MM/yyyy").parse(birthdayValue);
		} catch (ParseException e) {
			errorList.add("Birthday is required");
			e.printStackTrace();
		}
		
		String emailValue = request.getParameter("email");
		if(emailValue.length() == 0) {
			errorList.add("Email is required");
		}
	
		String phoneNumberValue = request.getParameter("phone");
		if(phoneNumberValue.length() == 0) {
			errorList.add("Phone number is required");
		}
		
		String cityValue = request.getParameter("city");
		if(cityValue.length() == 0) {
			errorList.add("City is required");
		}
		
		String stateValue = request.getParameter("state");
		if(stateValue.length() == 0) {
			errorList.add("State is required");
		}
		
		String zipValue = request.getParameter("zip");
		if(zipValue.length() == 0) {
			errorList.add("Zip is required");
		}
	
		String genderValue = request.getParameter("gender");
		if(genderValue.length() == 0) {
			errorList.add("Gender is required");
		}
		
		String gradeValue = request.getParameter("grade");
		if(gradeValue.length() == 0) {
			errorList.add("Grade is required");
		}
		
		int rollValue = Integer.parseInt( request.getParameter("roll"));
		
		String imageValue = request.getParameter("image");
		
		if(errorList.size() > 0) {
			request.setAttribute("errorMsgs", errorList);
			return false;
		}
		
		Student student = new Student(studentId);

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
		
		
		IStudentService studentService = new StudentService();
		
		studentService.updateStudent(student);
		return true;
	}

}

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

import com.oop_2019.models.Teacher;
import com.oop_2019.services.ITeacherService;
import com.oop_2019.services.TeacherService;

/**
 * @author Anjana
 *
 */
public class UpdateTeacherCommand implements ICommand<Boolean> {

	@Override
	public Boolean execute(HttpServletRequest request, HttpServletResponse response) {

		ArrayList<String> errorMsgs = new ArrayList<String>();

		String teacherId = request.getParameter("teacherId");
		
		String titleValue = request.getParameter("title");
		
		String firstNameValue = request.getParameter("firstName");
		if(firstNameValue.length() == 0) {
			errorMsgs.add("First name is required");
		}
		
		String lastNameValue = request.getParameter("lastName");
		if(lastNameValue.length() == 0) {
			errorMsgs.add("Last name is required");
		}
		
		String sectionValue = request.getParameter("section");
		if(sectionValue.length() == 0) {
			errorMsgs.add("Section is required");
		}
	
		String birthdayValue = request.getParameter("birthday");
		Date birthdayDateValue = null;
		try {
			birthdayDateValue = new SimpleDateFormat("yyyy-MM-dd").parse(birthdayValue);
		} catch (ParseException e) {
			errorMsgs.add("Birthday is required");
			e.printStackTrace();
		}
		
		String emailValue = request.getParameter("email");
		if(emailValue.length() == 0) {
			errorMsgs.add("Email is required");
		}
		
	
	
		String phoneNumberValue = request.getParameter("phone");
		if(phoneNumberValue.length() == 0) {
			errorMsgs.add("Phone number is required");
		}
		
		String cityValue = request.getParameter("city");
		if(cityValue.length() == 0) {
			errorMsgs.add("City is required");
		}
		
		String stateValue = request.getParameter("state");
		if(stateValue.length() == 0) {
			errorMsgs.add("State is required");
		}
		
		String zipValue = request.getParameter("zip");
		if(zipValue.length() == 0) {
			errorMsgs.add("Zip is required");
		}
	
		String genderValue = request.getParameter("gender");
		if(genderValue.length() == 0) {
			errorMsgs.add("Gender is required");
		}
	
		String positionValue = request.getParameter("position");
		
		
		
		Teacher teacher = new Teacher(teacherId);
		
		if(errorMsgs.size() > 0) {
			request.setAttribute("errorMsgs", errorMsgs);
			return false;
		}
		

		teacher.setTitle(titleValue);
		teacher.setFirstName(firstNameValue);
		teacher.setLastName(lastNameValue);
		teacher.setSection(sectionValue);
		teacher.setBirthday(birthdayDateValue);
		teacher.setEmail(emailValue);		
		teacher.setPhone(phoneNumberValue);
		teacher.setCity(cityValue);
		teacher.setState(stateValue);
		teacher.setZip(zipValue);
		teacher.setGender(genderValue);
		teacher.setPosition(positionValue);
		
		
		ITeacherService teacherService = new TeacherService();
		teacherService.updateTeacher( teacher);
		
		
	
		return true;
	}

}

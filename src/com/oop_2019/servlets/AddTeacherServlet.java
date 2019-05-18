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

import com.oop_2019.commands.AddTeacherCommand;
import com.oop_2019.commands.ICommand;
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

    }

	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ICommand<Boolean> command = new AddTeacherCommand();
		
		Boolean addStatus = command.execute(request, response);
		
		if(addStatus) {
			// TODO redirect to TeacherList
			response.sendRedirect("");
		}else {
			
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/AddTeacher.jsp");
			dispatcher.forward(request, response);
		}
	
		
	}

}

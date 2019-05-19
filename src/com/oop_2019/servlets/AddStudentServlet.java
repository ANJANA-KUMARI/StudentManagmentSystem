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

import com.oop_2019.commands.AddStudentCommand;
import com.oop_2019.commands.ICommand;
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

    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		ICommand<Boolean> command = new AddStudentCommand();
		
		if(command.execute(request, response)) {

			response.sendRedirect("ViewStudent.jsp");
		}else {
			
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/AddStudent.jsp");
			dispatcher.forward(request, response);
			
		}

	}
	

}

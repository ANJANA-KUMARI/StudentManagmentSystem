package com.oop_2019.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oop_2019.commands.ICommand;
import com.oop_2019.commands.UpdateStudentCommand;

/**
 * Servlet implementation class UpdateStudentServlet
 */

public class UpdateStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateStudentServlet() {
        super(); 
    }


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ICommand<Boolean> command = new UpdateStudentCommand();
		
		if(command.execute(request, response)) {

			response.sendRedirect("ViewStudent.jsp");
		}else {
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/UpdateStudent.jsp");
			dispatcher.forward(request, response);
		
		}
		
	}

}

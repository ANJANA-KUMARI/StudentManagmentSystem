package com.oop_2019.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oop_2019.commands.AddTeacherCommand;
import com.oop_2019.commands.ICommand;
import com.oop_2019.commands.UpdateTeacherCommand;

/**
 * Servlet implementation class UpdateTeacherServlet
 */
@WebServlet("/UpdateTeacherServlet")
public class UpdateTeacherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateTeacherServlet() {
        super();
        
    }

	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		ICommand<Boolean> command = new UpdateTeacherCommand();
		
		Boolean addStatus = command.execute(request, response);
		
		if(addStatus) {
			// TODO redirect to TeacherList
			response.sendRedirect("");
		}else {
			
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/UpdateTeacher.jsp");
			dispatcher.forward(request, response);
		}
	
	}

}

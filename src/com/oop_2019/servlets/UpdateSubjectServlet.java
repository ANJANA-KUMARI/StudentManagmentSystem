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
import com.oop_2019.commands.UpdateSubjectCommand;

/**
 * Servlet implementation class UpdateSubjectServlet
 */
@WebServlet("/UpdateSubjectServlet")
public class UpdateSubjectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateSubjectServlet() {
        super();

    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		ICommand<Boolean> command = new UpdateSubjectCommand();
		
		if(command.execute(request, response)) {
			// TODO 
			response.sendRedirect("");
		}else {
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/UpdateSubject.jsp");
			dispatcher.forward(request, response);
		
		}
	}

}

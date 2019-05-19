package com.oop_2019.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oop_2019.commands.AddSubjectCommand;
import com.oop_2019.commands.ICommand;
import com.oop_2019.models.Subject;
import com.oop_2019.services.ISubjectService;
import com.oop_2019.services.SubjectService;

/**
 * Servlet implementation class AddSubjectServlet
 */
// @WebServlet("/AddSubjectServlet")
public class AddSubjectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddSubjectServlet() {
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
		
		ICommand<Boolean> command = new AddSubjectCommand();
		
		if(command.execute(request, response)) {
			// TODO redirect to subject list
			response.sendRedirect("ViewSubject.jsp");
		}else {
			
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/views/AddSubject.jsp");
			dispatcher.forward(request, response);
		}
		
		
	}

}

package com.oop_2019.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oop_2019.commands.ICommand;
import com.oop_2019.commands.LogoutCommand;

/**
 * Servlet implementation class LogoutServlet
 */

public class LogoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LogoutServlet() {
        super();

    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ICommand<Boolean> command= new LogoutCommand();
		
		if(command.execute(request, response)) {
			response.sendRedirect("Login.jsp");
		}else {
			response.sendRedirect("Dashboard.jsp");
		}
	}

}

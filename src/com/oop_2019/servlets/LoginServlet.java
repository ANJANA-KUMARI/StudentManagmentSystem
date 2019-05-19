package com.oop_2019.servlets;

import java.io.IOException;
import java.util.logging.Level;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oop_2019.commands.ICommand;
import com.oop_2019.commands.LoginCommand;
import com.oop_2019.repository.SubjectRepository;
import com.sun.istack.internal.logging.Logger;

/**
 * Servlet implementation class LoginServlet
 */
//@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
//	private static final Logger log = Logger.getLogger(LoginServlet.class.getName(), null);

       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();

    }


	/**
	 * @see HttpServlet#doPost(HttpServletRequest req uest, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ICommand<Boolean> command = new LoginCommand();
		
		Boolean isLoggedIn = command.execute(request, response);
		
		if(isLoggedIn) {
			System.out.println("Logged in");
			response.sendRedirect("Dashboard.jsp");
		}else {
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Login.jsp");
			dispatcher.forward(request, response);
			
		}
	}

}

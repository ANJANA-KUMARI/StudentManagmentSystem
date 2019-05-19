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

import com.oop_2019.commands.AddExamCommand;
import com.oop_2019.commands.ICommand;
import com.oop_2019.models.Exam;
import com.oop_2019.services.ExamService;
import com.oop_2019.services.IExamService;

/**
 * Servlet implementation class AddExamServlet
 */
// @WebServlet("/AddExamServlet")
public class AddExamServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddExamServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		ICommand<Boolean> command = new AddExamCommand();

		if (command.execute(request, response)) {
			response.sendRedirect("ViewExam.jsp");
		} else {

			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/AddExam.jsp");
			dispatcher.forward(request, response);
		}
	}

}

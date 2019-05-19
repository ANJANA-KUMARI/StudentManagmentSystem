package com.oop_2019.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oop_2019.commands.ICommand;
import com.oop_2019.commands.UpdateExamCommand;
import com.oop_2019.commands.UpdateStudentCommand;

/**
 * Servlet implementation class UpdateExamServlet
 */
//@WebServlet("/UpdateExamServlet")
public class UpdateExamServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UpdateExamServlet() {
		super();

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ICommand<Boolean> command = new UpdateExamCommand();

		if (command.execute(request, response)) {

			response.sendRedirect("ViewExam.jsp");
		} else {
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/UpdateExam.jsp");
			dispatcher.forward(request, response);

		}
	}

}

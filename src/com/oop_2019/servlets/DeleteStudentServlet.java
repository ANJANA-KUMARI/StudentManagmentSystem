package com.oop_2019.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oop_2019.commands.DeleteStudentCommand;
import com.oop_2019.commands.DeleteTeacherCommand;
import com.oop_2019.commands.ICommand;

/**
 * Servlet implementation class DeleteStudentServlet
 */
@WebServlet("/DeleteStudentServlet")
public class DeleteStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DeleteStudentServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ICommand<Boolean> command = new DeleteStudentCommand();

		Boolean deleteStatus = command.execute(request, response);

		if (deleteStatus) {
			// TODO redirect to StudentList
			response.sendRedirect("");
		} else {
			request.setAttribute("error_msg", "Failed to delete the teacher!");
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/StudentList.jsp");
			dispatcher.forward(request, response);
		}
	}

}

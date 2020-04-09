package com.in28minutes.todo;

import java.io.IOException;
import java.io.PrintWriter;
import com.in28minutes.todo.TodoServices;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/add-todo.do")
public class AddToDoServelet extends HttpServlet {
	
	private TodoServices todoService = new TodoServices();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException {

		request.getRequestDispatcher("/WEB-INF/views/add-todo.jsp").forward(request, response);
	
	}
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException {
		String name = request.getParameter("name");
		todoService.addTodo(new Todo(request.getParameter("todo"),request.getParameter("category")));
		response.sendRedirect("/list-todo.do");
		
		
		
		}
	
	
	
	
}


package com.in28minutes.todo;

import java.io.IOException;
import java.io.PrintWriter;
import com.in28minutes.todo.TodoServices;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/list-todo.do")
public class ListToDoServelet extends HttpServlet {
	
	private TodoServices todoService = new TodoServices();
	
//	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException {
//		String name = request.getParameter("name");
		
		request.setAttribute("todos", todoService.retrieveTodos());
		request.getRequestDispatcher("/WEB-INF/views/list-todos.jsp").forward(request, response);
		
		}
	

	
	
	
	
}


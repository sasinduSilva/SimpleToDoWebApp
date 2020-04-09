package com.in28minutes.login;

import java.io.IOException;
import java.io.PrintWriter;
import com.in28minutes.todo.TodoServices;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/login.do")
public class LoginServelet extends HttpServlet {
	private UserValidation service1 = new UserValidation();
	private TodoServices todoService = new TodoServices();
	
//	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException {
//		String name = request.getParameter("name");
		
		
		
		request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
		
		
		
		
	}
	
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException {
		String name = request.getParameter("name");
		String pw = request.getParameter("password");
		
		boolean isUserValid = service1.isUserValid(name, pw);
		
		if(isUserValid)
		{
		request.getSession().setAttribute("name", name);	
		response.sendRedirect("/list-todo.do");
		
		}else {
			request.setAttribute("errorMessage", "Invalid Credentials");
			request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
		}
		
		
		
	}

}


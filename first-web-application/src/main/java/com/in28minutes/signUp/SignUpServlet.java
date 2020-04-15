package com.in28minutes.signUp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.in28minutes.db.*;

@WebServlet(urlPatterns = "/signUp.do")
public class SignUpServlet extends HttpServlet {
	
	Db db = new Db();
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {
		
		request.getRequestDispatcher("/WEB-INF/views/signUp.jsp").forward(request, response);
	}
	
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		
		String name = request.getParameter("userName");
		String pw = request.getParameter("password");
		String ConPw = request.getParameter("confirmPassword");
		
		
		if(name.isEmpty()||pw.isEmpty()||ConPw.isEmpty()) {
			
			request.setAttribute("pwNotMatching", "Passwords are not matching");
			request.getRequestDispatcher("/WEB-INF/views/signUp.jsp").forward(request, response);
			
			
			
			
		}else if(pw.equals(ConPw)){
				
			for (User testUser : db.users) {
				
				if(testUser.getName().equals(name)) {
					request.setAttribute("userExist", "Usernam is already taken");
					request.getRequestDispatcher("/WEB-INF/views/signUp.jsp").forward(request, response);
					return;
					
					
				}else {
					db.users.add(new User(name,ConPw));
					request.setAttribute("signedUp", "User Signed Up SuccessFully");
					request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
					System.out.println(db.users);
					
					return;
					
				}
				
			}
			
			
		}else {
			
			request.setAttribute("pwNotMatching", "Passwords are not matching");
			request.getRequestDispatcher("/WEB-INF/views/signUp.jsp").forward(request, response);
			
			
			
		}	
	}
			
			
			
			
			
			
			
//				if(testUser.getName().equals(name)) {
//					
//					request.setAttribute("userExist", "Usernam is already taken");
//					request.getRequestDispatcher("/WEB-INF/views/signUp.jsp").forward(request, response);
//					
//					
//					
//				}else if(name!=null && pw!=null && ConPw!=null) {
//					
//					db.users.add(new User(name,ConPw));
//					response.sendRedirect("/login.do");
//					request.setAttribute("signUpScxd", "User Signed-Up");
//					request.getRequestDispatcher("/WEB-INF/views/signUp.jsp").forward(request, response);
//				}else {
//						
//					request.setAttribute("pwNotMatching", "Passwords are not matching");
//					request.getRequestDispatcher("/WEB-INF/views/signUp.jsp");
//					
//					
//				}
//				
				
			
		
		
//		if(name!=null && pw!=null && ConPw!=null) {
//			db.users.add(new User(name,ConPw));
//			response.sendRedirect("/login.do");
//			request.setAttribute("signUpScxd", "User Signed-Up");
//			request.getRequestDispatcher("/WEB-INF/views/signUp.jsp").forward(request, response);
//			return;
//			
//		}else {
//			
//			request.setAttribute("pwNotMatching", "Passwords are not matching");
//			request.getRequestDispatcher("/WEB-INF/views/signUp.jsp");
//			
//			
//			
//		}
		

		
	}
	



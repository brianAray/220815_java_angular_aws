package com.revature.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RequestHelper {
	
	private static Logger fileLogger = LoggerFactory.getLogger("fileLogger");

	public static void processLogin(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		String username = request.getParameter("userName");
		String password = request.getParameter("userPass");
		
		System.out.println(username + password);

		fileLogger.debug("User attempted to login with username: " + username);
		if(username.equals("admin") && password.equals("pass")) {
			//RequestDispatcher rD = request.getRequestDispatcher("welcome");
			
			
			// Session Handling
			
			HttpSession session = request.getSession();
			session.setAttribute("user", "admin");
			
			// set max time for session
			session.setMaxInactiveInterval(30*60);
			
			Cookie userName = new Cookie("user", username);
			userName.setMaxAge(30*60);
			response.addCookie(userName);
			out.println("Successful login!");
			//rD.forward(request, response);
			
			response.setStatus(200);
			fileLogger.debug("The User: " + username + " has logged in.");
			
		}else {
			fileLogger.debug("The User: " + username + " has failed to log in.");
//			throw new IOException("This is a false error");
			out.println("<font color=red>Username or Password is incorrect</font>");
			RequestDispatcher rD = request.getRequestDispatcher("login.html");
//			rD.include(request, response);
			
			response.setStatus(203);
		}
	}

	public static void processError(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("error.html").forward(request, response);
	}

}

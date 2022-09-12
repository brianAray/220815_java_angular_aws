package com.revature.loginfeature;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/logout")
public class LogoutServlet extends HttpServlet{

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		
		Cookie[] cookies = request.getCookies();
		
		if(cookies != null) {
			for(Cookie cookie : cookies) {
				if(cookie.getName().equals("JSESSIONID")) {
					System.out.println("JSESSIONID= " + cookie.getValue());
					break;
				}
			}
		}
		
		//INvalidate session if exists
		
		HttpSession session = request.getSession(false);
		System.out.println("User=" + session.getAttribute("user"));
		if(session != null) {
			session.invalidate();
		}
		
		response.sendRedirect("login.html");
	}
}

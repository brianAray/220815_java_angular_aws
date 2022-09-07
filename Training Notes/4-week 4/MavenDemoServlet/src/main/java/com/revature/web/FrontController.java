package com.revature.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FrontController extends HttpServlet{

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		// Save the URL and rewrite it to determine what functionality the user is requesting
		final String URI = request.getRequestURI().replace("/MavenDemoServlet/", "");
		
		switch(URI) {
		case "login":
			RequestHelper.processLogin(request, response);
			break;
		case "error":
			RequestHelper.processError(request, response);
			break;
		default:
			RequestHelper.processError(request, response);
			break;
		}
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		doGet(request, response);
	}
}

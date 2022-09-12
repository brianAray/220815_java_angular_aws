package com.revature.loginfeature;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ErrorHandler extends HttpServlet{

	// Method to handle get method request
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		// Analyze the Servlet Exception
		Throwable throwable = (Throwable) request.getAttribute("javax.servlet.error.exception");
		Integer statusCode = (Integer) request.getAttribute("javax.servlet.error.status_code");
		String servletName = (String) request.getAttribute("javax.servlet.error.servlet_name");
		String requestURI = (String) request.getAttribute("javax.servlet.error.request_uri");
	
		// set response type
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
	
		out.println("The status code: " + statusCode);
		out.println("<h2>Error Information</h2>");
		out.println("Servlet Name: " + servletName + "<br>");
		out.println("Exception Type: " + throwable.getClass().getName() + "<br>");
		out.println("The request URI: " + requestURI + "<br>");
		out.println("The Exception Message: " + throwable.getMessage());
	} 
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		doGet(request, response);
	}
}

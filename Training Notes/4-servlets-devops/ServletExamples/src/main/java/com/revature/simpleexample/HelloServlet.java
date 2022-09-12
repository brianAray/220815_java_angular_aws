package com.revature.simpleexample;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/*
 * The @WebServlet annotation placed before the class declaration specifies
 * That this class is a Java Servlet which is responsible for handling requests
 * from the /helloServlet url
 */

@WebServlet("/helloServlet")
public class HelloServlet extends HttpServlet{

	public HelloServlet() {
		super();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.getWriter().append("Served at : ").append(request.getContextPath());
	}
	
	/*
	 * The doPost() method is where we put the code to process HTTP Post requests 
	 * sent to the servlet.
	 * This method accepts two params, the HttpServletRequest and HttpServletResponse
	 * 
	 * These request and Response objects are created and injected by the Servlet Container
	 * (Tomcat)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String yourName = request.getParameter("yourName");
		PrintWriter out = response.getWriter();
		out.println("<h1>Hello " + yourName + "</h1>");
		out.close();
	}
	
}

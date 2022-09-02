package com.revature.friday.basic;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.URI;

import com.sun.net.httpserver.Headers;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpPrincipal;
import com.sun.net.httpserver.HttpServer;


public class AccessingRequests {
	
	public static void main(String[] args) throws IOException{
		final int PORT = 9000;
		HttpServer server = HttpServer.create(new InetSocketAddress(PORT), 0);
		server.createContext("/example", AccessingRequests::handleRequest);
		
		server.start();
	}
	
	private static void handleRequest(HttpExchange he) throws IOException{
		URI requestURI = he.getRequestURI();
		printRequestInfo(he);
		String response = "This is the response at" + requestURI;
		
		
		he.sendResponseHeaders(200, response.getBytes().length);
		
		
		OutputStream os = he.getResponseBody();
		os.write(response.getBytes());
		os.close();
	}
	
	private static void printRequestInfo(HttpExchange he) {
		System.out.println("-- HEADERS --");
		Headers headers = he.getRequestHeaders();
		headers.entrySet().forEach(System.out::println);
		
		System.out.println("-- PRINCIPLE --");
		HttpPrincipal principal = he.getPrincipal();
		System.out.println(principal);
		
		System.out.println("-- HTTP METHOD --");
		String requestMethod = he.getRequestMethod();
		System.out.println(requestMethod);
		
		System.out.println("-- QUERY --");
		URI requestURI = he.getRequestURI();
		String query = requestURI.getQuery();
		System.out.println(query);
	}

}

package com.revature.friday.basic;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;

import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpExchange;
/*
 * The package com.sun.net.httpserver provides HTTP server API functionality
 * This is used to create an embedded http server
 * To get started, there are a few classes you want to be familiar with
 */
public class WebServerExample {
	
	public static void main(String[] args) throws IOException{
		/*
		 * HttpServer
		 * This class implements the simple HTTP server. It has factory methods like create() 
		 * that is used to make an instance of the server and bind it to an ip address and a port number
		 */
		final int PORT = 9000;
		HttpServer server = HttpServer.create(new InetSocketAddress(PORT), 0);
		
		/*
		 * HttpContext
		 * It represents the mapping between the root URI path to a HttpHandler
		 */
		
		server.createContext("/", WebServerExample::handleRequest);

		server.start();
	}
	
	private static void handleRequest(HttpExchange exchange) throws IOException{
		
		/*
		 * HttpExchange
		 * An instance of this class is passed to the HttpHandler
		 * It has methods to access http requests information, and to prepare and send the response
		 */
		
		String response = "Hello World";
		
		exchange.sendResponseHeaders(200, response.getBytes().length);
		
		OutputStream os = exchange.getResponseBody();
		
		os.write(response.getBytes());
		
		os.close();
		
	}

}

package com.revature.friday.simplewebserver;

import java.io.IOException;
import java.io.OutputStream;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

public class RootHandler implements HttpHandler {

	@Override
	public void handle(HttpExchange exchange) throws IOException {
		// TODO Auto-generated method stub
		String response = "<h1>Server start was a success if you saw this message</h1>";
		
		exchange.sendResponseHeaders(200, response.getBytes().length);
		
		OutputStream os = exchange.getResponseBody();
		
		os.write(response.getBytes());
		
		os.close();
	}

}

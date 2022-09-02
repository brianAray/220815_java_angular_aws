package com.revature.friday.simplewebserver;

import java.io.IOException;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.sun.net.httpserver.*;

public class HeaderHandler implements HttpHandler {

	@Override
	public void handle(HttpExchange exchange) throws IOException {
		// TODO Auto-generated method stub
		Headers headers = exchange.getRequestHeaders();
		
		Set<Map.Entry<String, List<String>>> entries = headers.entrySet();
		
		String response = "";
		
		for(Map.Entry<String, List<String>> entry: entries) {
			response += entry.toString() + "\n";
		}
		
		exchange.sendResponseHeaders(200, response.getBytes().length);
		
		OutputStream os = exchange.getResponseBody();
		os.write(response.toString().getBytes());
		
		os.close();
		
	}

}

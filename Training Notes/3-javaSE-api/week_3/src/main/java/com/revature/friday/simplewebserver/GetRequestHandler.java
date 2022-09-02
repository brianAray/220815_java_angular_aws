package com.revature.friday.simplewebserver;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

public class GetRequestHandler implements HttpHandler {

	@Override
	public void handle(HttpExchange exchange) throws IOException {
		// TODO Auto-generated method stub
		Map<String, Object> parameters = new HashMap<String, Object>();
		
		URI requestURI = exchange.getRequestURI();
		
		String query = requestURI.getRawQuery();
		
		parseQuery(query, parameters);
		
		// send response
		
		String response = "";
		for (String key : parameters.keySet()) {
			response += key + " = " + parameters.get(key) + "\n";
		}
		
		exchange.sendResponseHeaders(200, response.getBytes().length);
		OutputStream os = exchange.getResponseBody();
		os.write(response.toString().getBytes());
		os.close();

	}

	@SuppressWarnings("deprecation")
	public static void parseQuery(String query, Map<String, Object> parameters) throws UnsupportedEncodingException {
		
		if (query != null) {
			String[] pairs = query.split("[&]");
			
			for(String pair : pairs) {
				String[] params = pair.split("[=]");
				
				String key = null;
				String value = null;
				
				if(params.length > 0) {
					key = URLDecoder.decode(params[0], System.getProperty("file.encoding"));
				}
				
				if(params.length > 1) {
					value = URLDecoder.decode(params[1], System.getProperty("file.encoding"));
				}
				
				if(parameters.containsKey(key)) {
					Object obj = parameters.get(key);
					if (obj instanceof List<?>) {
						List<String> values = (List<String>) obj;
						values.add(value);
					}else if (obj instanceof String) {
						List<String> values = new ArrayList<String>();
						values.add((String) obj);
						values.add(value);
						parameters.put(key, values);
					}
				}else {
					parameters.put(key, value);
				}
			}
		}
	}
}











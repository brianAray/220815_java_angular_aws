package com.revature.friday.simplewebserver;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.sun.net.httpserver.*;

public class WebDriver {
	
	public static void main(String[] args) throws IOException{
		
		final int PORT = 9000;
		final int THREAD_MAX_SIZE = 4;
		
		HttpServer server = HttpServer.create(new InetSocketAddress(PORT), 0);
		
		server.createContext("/", new RootHandler());
		server.createContext("/headerData", new HeaderHandler());
		server.createContext("/getData", new GetRequestHandler());
		server.createContext("/postData", new PostRequestHandler());
		
		ExecutorService executorService = Executors.newFixedThreadPool(THREAD_MAX_SIZE);
		
		server.setExecutor(executorService);
		
		server.start();
	}

}

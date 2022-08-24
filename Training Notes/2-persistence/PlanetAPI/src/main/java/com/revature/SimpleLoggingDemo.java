package com.revature;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SimpleLoggingDemo {
	
	public static void main(String[] args) {
		
		Logger consoleLogger = LoggerFactory.getLogger("consoleLogger");
		Logger fileLogger = LoggerFactory.getLogger("fileLogger");
		
		/*
		 * The level at which you log is highly dependent on your needs and preferences
		 * We go from least severe to most severe:
		 * 
		 * TRACE
		 * DEBUG
		 * INFO
		 * WARN
		 * ERROR
		 * 
		 * If you choose to log at a particular level, you will log everything at or above
		 * that level.
		 * The logging level is currently set to debug in the logback.xml so "TRACE" debug statments
		 * will not be logged
		 */
		
		consoleLogger.debug("Debugging an issue right now in my application");
		fileLogger.error("Logging at error");
		
	}

}

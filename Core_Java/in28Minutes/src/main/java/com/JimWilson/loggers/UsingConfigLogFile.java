package com.JimWilson.loggers;

import java.util.logging.Level;
import java.util.logging.Logger;

public class UsingConfigLogFile {
	static Logger logger = Logger.getLogger("com.JimWilson.loggers");
	
	public static void main(String[] args) {		
		System.out.println("this is sysout");
		
		logger.log(Level.INFO, "this is  using config log.properties files");

	}

}

package com.JimWilson.loggers;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class FileHandlerDemo {
	static Logger logger = Logger.getLogger("com.plurasight");

	public static void main(String[] args) throws SecurityException, IOException {
		
		Handler h =  new FileHandler("C:\\PracticeJava\\in28Minutes\\Core_Java\\mapApp_%g.log",1000,3);
		h.setFormatter(new SimpleFormatter());
		logger.addHandler(h);
		logger.log(Level.INFO,"We are writing to file");
		

	}

}

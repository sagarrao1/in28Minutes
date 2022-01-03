package com.JimWilson.loggers;

import java.util.logging.ConsoleHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class LogThruConfigFile {
	static Logger logger = Logger.getLogger("com.JimWilson.loggers");

	public static void main(String[] args) {
		Handler h = new ConsoleHandler();
		h.setLevel(Level.ALL);
		h.setFormatter(new SimpleFormatter());
		logger.addHandler(h);
		logger.setLevel(Level.ALL);
		logger.log(Level.INFO, "We’re Logging!");
	}

}

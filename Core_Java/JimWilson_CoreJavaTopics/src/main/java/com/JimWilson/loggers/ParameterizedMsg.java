package com.JimWilson.loggers;

import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class ParameterizedMsg {
	static Logger logger = LogManager.getLogManager().getLogger(Logger.GLOBAL_LOGGER_NAME);

	public static void main(String[] args) {
		logger.setLevel(Level.ALL);
		logger.log(Level.INFO, "{0} is my favorite", "Java");
		logger.log(Level.INFO, "{0} is {1} days from {2}", new Object[]{"Wed", 2, "Fri"});
		doWork("Sagar", "rao");
	}

	
	public static void doWork(String left, String right) {
		logger.setLevel(Level.ALL);
		logger.entering("com.jwhh.support.Other", "doWork", new Object[]{left, right});
		String result = "<" + left + right + ">";
		logger.exiting("com.jwhh.support.Other", "doWork", result);

	}
}


package com.JimWilson.loggers;

import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class LoggerSetlevel {
	static Logger logger = Logger.getLogger("com.JimWilson.loggers.LoggerSetlevel.Main");

	public static void main(String[] args) {
		logger.setLevel(Level.ALL);
		logger.entering("entering.. ", "dowork");
		logger.severe( "Uh Oh!!");
		logger.log(Level.INFO, "Just so you know");
		logger.log(Level.FINE, "Hey developer dude");
		logger.logp(Level.WARNING, "com.JimWilson.loggers.LoggerSetlevel main", "doWork", "EmptyFuntion");
		logger.finest( "You’re special");
	}
}

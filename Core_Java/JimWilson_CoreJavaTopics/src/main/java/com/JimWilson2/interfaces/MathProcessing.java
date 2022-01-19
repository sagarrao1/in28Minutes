package com.JimWilson2.interfaces;

public interface MathProcessing {
	String SEPERATOR=" ";
	
	String getKeyword();	
	double doCalculation(double leftV, double rightV);
	
	default String formattedOutput() {
		return null;
	};
}

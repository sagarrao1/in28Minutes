package com.JimWilson2.interfaces;

import java.util.Iterator;

public class DynamicHelper {
	
//	array of MathProcessing inteface implementations
	private MathProcessing[] handlers;

//	constructor
	public DynamicHelper(MathProcessing[] handlers) { this.handlers = handlers; }
	
	public void process(String statement) {
		String[] parts = statement.split(MathProcessing.SEPERATOR);
		String keyword = parts[0];
		double leftVal = Double.parseDouble(parts[1]);
		double rightVal = Double.parseDouble(parts[2]);
		
		MathProcessing theHandler= null;
		
		for (MathProcessing handler : handlers) {
			if (keyword.equalsIgnoreCase(handler.getKeyword())) {
				theHandler = handler;
				break;
			}
		}
		
		if (theHandler != null) {
			double result = theHandler.doCalculation(leftVal, rightVal);
			System.out.println("result : "+result);
			
//			this is for default method of MathProcessing interface example
//			System.out.println("********* formattedOutput **************");
//			System.out.println(theHandler.formattedOutput());
			
		} else {
			System.out.println("No Handler for "+ keyword);
		}
	}

}

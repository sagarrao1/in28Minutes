package com.JimWilson2.interfaces;

public class PowerOf implements MathProcessing {

	String formattedOutput;
	
	@Override
	public String getKeyword() {
		return "power";
	}

	@Override
	public double doCalculation(double leftV, double rightV) {
		double value = Math.pow(leftV, rightV);
		formattedOutput = "Power of "+leftV+ " and "+ rightV+" is :"+value;
		return value;
	}

	@Override
	public String formattedOutput() {
		return formattedOutput;
	}
	
	

}

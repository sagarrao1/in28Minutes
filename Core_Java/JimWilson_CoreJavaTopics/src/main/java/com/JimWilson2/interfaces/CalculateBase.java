package com.JimWilson2.interfaces;

public abstract class  CalculateBase {
	private double leftVal;
	private double rightVal;
	private double result;
		
	public CalculateBase() {}
	
	public CalculateBase(double leftVal, double rightVal) {
		this.leftVal = leftVal;
		this.rightVal = rightVal;
	}

	public abstract void calculate();
	
	// getters and setters
	public double getLeftVal() { return leftVal;}	
	public void setLeftVal(double leftVal) { this.leftVal = leftVal;	}
	public double getRightVal() { return rightVal; }
	public void setRightVal(double rightVal) { 	this.rightVal = rightVal; }
	public double getResult() {	return result;	}
	public void setResult(double result) {	this.result = result;	}
	
}

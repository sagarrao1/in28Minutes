package com.JimWilson2.inheritence;

public class Subtract extends CalculateBase {

	public Subtract() {}
	
	public Subtract(double leftVal, double rightVal) {
		super(leftVal,rightVal);
	}
	@Override
	public void calculate() {
		 double result = getLeftVal() - getRightVal();
		 setResult(result);
	}

}
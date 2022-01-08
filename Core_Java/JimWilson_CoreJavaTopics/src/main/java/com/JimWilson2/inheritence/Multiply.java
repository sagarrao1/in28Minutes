package com.JimWilson2.inheritence;

public class Multiply extends CalculateBase {

	public Multiply() {}
	
	public Multiply(double leftVal, double rightVal) {
		super(leftVal,rightVal);
	}
	
	@Override
	public void calculate() {
		 double result = getLeftVal() * getRightVal();
		 setResult(result);
	}

}


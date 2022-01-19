package com.JimWilson2.enums;

public class Adder extends CalculateBase {
	
	public Adder() {}
	
	public Adder(double leftVal, double rightVal) {
		super(leftVal,rightVal);
	}

	@Override
	public void calculate() {
		 double value = getLeftVal() + getRightVal();
		 setResult(value);
	}

}

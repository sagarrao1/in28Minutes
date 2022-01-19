package com.JimWilson2.enums;

public class Devide extends CalculateBase {

	public Devide() {}
	
	public Devide(double leftVal, double rightVal) {
		super(leftVal,rightVal);
	}
	
	@Override
	public void calculate() {
		 double value = getLeftVal() / getRightVal();
		 setResult(value);
	}

}

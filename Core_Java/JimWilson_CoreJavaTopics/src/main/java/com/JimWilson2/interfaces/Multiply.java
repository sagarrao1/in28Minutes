package com.JimWilson2.interfaces;

public class Multiply extends CalculateBase implements MathProcessing{

	public Multiply() {}
	
	public Multiply(double leftVal, double rightVal) {
		super(leftVal,rightVal);
	}
	
	@Override
	public void calculate() {
		 double result = getLeftVal() * getRightVal();
		 setResult(result);
	}

	@Override
	public String getKeyword() {
		return "multiply";
	}

	@Override
	public double doCalculation(double leftV, double rightV) {
		setLeftVal(leftV);
		setRightVal(rightV);
		calculate();
		return getResult();
	}
}


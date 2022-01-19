package com.JimWilson2.interfaces;

public class Subtract extends CalculateBase implements MathProcessing{

	public Subtract() {}
	
	public Subtract(double leftVal, double rightVal) {
		super(leftVal,rightVal);
	}
	@Override
	public void calculate() {
		 double result = getLeftVal() - getRightVal();
		 setResult(result);
	}

	@Override
	public String getKeyword() {
		return "subtract";
	}

	@Override
	public double doCalculation(double leftV, double rightV) {
		setLeftVal(leftV);
		setRightVal(rightV);
		calculate();
		return getResult();
	}
}
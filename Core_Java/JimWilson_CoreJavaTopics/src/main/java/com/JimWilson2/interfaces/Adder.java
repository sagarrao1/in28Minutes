package com.JimWilson2.interfaces;

public class Adder extends CalculateBase implements MathProcessing{
	
	public Adder() {}
	
	public Adder(double leftVal, double rightVal) {
		super(leftVal,rightVal);
	}

	@Override
	public void calculate() {
		 double value = getLeftVal() + getRightVal();
		 setResult(value);
	}

	@Override
	public String getKeyword() {
		return "add";
	}

	@Override
	public double doCalculation(double leftV, double rightV) {
		setLeftVal(leftV);
		setRightVal(rightV);
		calculate();
		return getResult();
	}

}

package com.JimWilson2.interfaces;

public class Devide extends CalculateBase implements MathProcessing {

	public Devide() {}
	
	public Devide(double leftVal, double rightVal) {
		super(leftVal,rightVal);
	}
	
	@Override
	public void calculate() {
		 double value = getLeftVal() / getRightVal();
		 setResult(value);
	}
	
	@Override
	public String getKeyword() {
		return "devide";
	}

	@Override
	public double doCalculation(double leftV, double rightV) {
		setLeftVal(leftV);
		setRightVal(rightV);
		calculate();
		return getResult();
	}

}

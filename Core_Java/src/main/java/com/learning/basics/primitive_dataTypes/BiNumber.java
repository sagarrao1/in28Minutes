package com.learning.basics.primitive_dataTypes;

public class BiNumber {

	private int num1;
	private int num2;

	public BiNumber(int i, int j) {
		this.num1 = i;
		this.num2 = j;
	}

	public int add() {
		return num1 + num2;
	}

	public int multiply() {
		return num1 * num2;
	}

	public void doubleNumbers() {
		this.num1 *= 2;
		this.num2 *= 2;
	}

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

}

package com.in28Minutes.oops.abstractClasses;

public abstract class AbstractAlgorithm {

//  We can have member variables in abstract class like below
//	We can have non abstract methods in abstract class 
//	like implementations of method in abstract class

	// member variable
	private int stepCount;

	// non abstract method
	public int getStepCount() {
		return stepCount;
	}

	// abstract method
	abstract void process();

}

package com.in28Minutes.oops.abstractClasses;

public abstract class AbstractRecipe {
	// get things ready
	// prepare recipe
	// cleanup things

	// non abstract method
	public void execute() {
		getReady();
		doTheDish();
		cleanup();
	}

	// abstract methods
	abstract public void getReady();

	abstract public void doTheDish();

	abstract public void cleanup();

}


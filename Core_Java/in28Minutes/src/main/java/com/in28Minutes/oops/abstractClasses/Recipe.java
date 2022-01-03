package com.in28Minutes.oops.abstractClasses;

public class Recipe extends AbstractRecipe {

	@Override
	public void getReady() {
		System.out.println("Get the raw metirials");
		System.out.println("Get the utensils");
	}

	@Override
	public void doTheDish() {
		System.out.println("prepare the Dish");

	}

	@Override
	public void cleanup() {
		System.out.println("cleanup utensils");

	}

}

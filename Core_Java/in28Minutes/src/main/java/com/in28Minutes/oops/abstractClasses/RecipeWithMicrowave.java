package com.in28Minutes.oops.abstractClasses;

public class RecipeWithMicrowave extends AbstractRecipe {

	@Override
	public void getReady() {
		System.out.println("Get the raw metirials");
		System.out.println("Switch on Microwave");
	}

	@Override
	public void doTheDish() {
		System.out.println("prepare the Cake");
		System.out.println("put it in Microwave");
	}

	@Override
	public void cleanup() {
		System.out.println("cleanup utensils");
		System.out.println("switch off Microwave");

	}

}


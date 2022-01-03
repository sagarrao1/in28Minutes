package com.in28Minutes.oops.abstractClasses;

public class RecipeRunner {

	public static void main(String[] args) {
		Recipe recipe = new Recipe();
		recipe.execute();

		System.out.println("================");

		RecipeWithMicrowave recipeWithMicrowave = new RecipeWithMicrowave();
		recipeWithMicrowave.execute();

	}

}

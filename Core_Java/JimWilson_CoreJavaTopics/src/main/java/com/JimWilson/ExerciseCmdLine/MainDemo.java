package com.JimWilson.ExerciseCmdLine;

public class MainDemo {

	public static void main(String[] args) {
		if (args.length < 1) {
			System.out.println("No arguments provided");
		} else {
			for (String string : args) {
				System.out.println(string);
			}
		}

	}

}

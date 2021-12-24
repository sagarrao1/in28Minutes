package com.JimWilson.stringRegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaRegexDemo {

	// useage of replaceAll and replaceFirst for Java regex in String class 
	public static void main(String[] args) {
		String s1 = "apple, apple and orange please";
		
		
		
		System.out.println(s1.replaceAll("ple", "ricot"));
//		apricot, apricot and orange ricotase
		
//		\b =word break for not ton include ple in please
		System.out.println(s1.replaceAll("ple\\b", "ricot")); 
//		apricot, apricot and orange please
		
//		words break with space sing split
		String[] parts = s1.split("\\b");
		
		for (String thepart : parts) {
			System.out.println(thepart);
		}
		
		//match only words and print using matches Method
		System.out.println("========================");
		for (String thepart : parts) {
			if (thepart.matches("\\w+")) {
				System.out.println(thepart);
			}
		}
		
		System.out.println("***************************************");
//		Using Pattern is Dedicated reguler expression class
		Pattern pattern = Pattern.compile("\\w+");
		Matcher matcher = pattern.matcher(s1);
		
		while (matcher.find()) {
			System.out.println(matcher.group());
		}
		
		
		
		
	}

}

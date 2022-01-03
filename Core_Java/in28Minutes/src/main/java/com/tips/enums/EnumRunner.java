package com.tips.enums;

import java.util.Arrays;

//enum is class , we say enum instead of class we create enum
enum Season{
	WINTER,SPRING,SUMMER,FALL;
	// ordinal 0,1,2,3
}

public class EnumRunner {
	static Season seasonInstanceVar;

	public static void main(String[] args) {
		/*
		 * String season= "winter"; we can modify season to any values to restrict value
		 * to only some values we use enum. enum is class , we say enum instead of class
		 * we create enum
		 */		
		Season season= Season.SUMMER;
		Season season1= Season.valueOf("WINTER");
		System.out.println(season);
		System.out.println(season1);
		System.out.println(season1.name());
		
		System.out.println(season1.ordinal());
		System.out.println(season1.FALL.ordinal());
		
		seasonInstanceVar=Season.SPRING;
		System.out.println( "seasonInstanceVar :"+seasonInstanceVar);
		
		
//		 to print all enum values
//		System.out.println(season.values());  // will get array and print array adrress
		System.out.println(Arrays.toString(Season.values()));
	}

}

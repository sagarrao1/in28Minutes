package com.tips.enums;

import java.util.Arrays;

//enum is class , we say enum instead of class we create enum
enum NewSeason{
	WINTER(1),SPRING(2),SUMMER(3),FALL(4); // this is like constructor
	
	private int value;

	private NewSeason(int value){ // if we public it will be accessible to other classes
		this.value=value;		
	}

	public int getValue() {
		return value;
	}
	
	// you will create setter becasue you don't want others to modify value variable
}

public class EnumRunner2 {
	static NewSeason seasonInstanceVar;

	public static void main(String[] args) {
		/*
		 * String season= "winter"; we can modify season to any values to restrict value
		 * to only some values we use enum. enum is class , we say enum instead of class
		 * we create enum
		 */		
		NewSeason season= NewSeason.SUMMER;
		NewSeason season1= NewSeason.valueOf("WINTER");
		System.out.println(season);
		System.out.println(season1);
		System.out.println(season1.name());
		
		System.out.println(season1.ordinal());
		System.out.println(season1.FALL.ordinal());
		
		seasonInstanceVar=NewSeason.SPRING;
		System.out.println( "seasonInstanceVar :"+seasonInstanceVar);
		
		
//		 to print all enum values
//		System.out.println(season.values());  // will get array and print array adrress
		System.out.println(Arrays.toString(NewSeason.values()));
		System.out.println();
		
		System.out.println(season1.FALL.ordinal());
		System.out.println(season1.FALL.getValue());
//		value of Fall wil not change if we change the order of string season in Season class 
//		but ordinal value will change the order of seasons
	
		
		
//		 we can create enum as seperate class and use it get values of enum
//		examples of inbuild enums are DayOfWeek , Month, which we know whose values are never going to changes
		
		
	}

}

package com.learning.basics.conditionals;

public class SwitchPuzzles {

	public static void main(String[] args) { 
		System.out.println("isWeekDay :" + isWeekDay(4));
		System.out.println("determineNameOfMonth :" + determineNameOfMonth(9));
		System.out.println("determineNameOfMonth :" + determineNameOfDay(4));

	}

	public static boolean isWeekDay(int dayNumber) {
		switch (dayNumber) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			return true;
		case 6:
		case 7:
		default:
			return false;
		}
	}

	public static String determineNameOfMonth(int monthNumber) {
		switch (monthNumber) {
		case 1:
			return "January";
		case 2:
			return "feb";
		case 3:
			return "march";
		case 4:
			return "april";
		case 5: return "may";			
		case 6: return "June";
		case 7: return "July";
		case 8: return "August";
		case 9: return "sep";
		case 10: return "oct";			
		case 11: return "nov";
		case 12: return "dec";
		default: return "Wrong month";
		}
	}

	public static String determineNameOfDay(int dayNumber) {
		switch (dayNumber) {
		case 0:
			return "Sunday";
		case 1:
			return "Monday";
		case 2:
			return "Tuesday";
		case 3:
			return "Wednessday";
		case 4:
			return "Thrusday";
		case 5:
			return "Friday";
		case 6:
			return "Saturday";
		default:
			return "Wrong day Number";
		}
	}

}

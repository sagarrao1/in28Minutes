package com.in28minutes.enums;

public class CustomEnum {
	
	enum CustomizedSeason{

		WINTER(1), RAINY(2),FALL(3),SUMMER(4);
	
		private int code;

		private CustomizedSeason(int code) {
			this.code = code;
		}

		public int getCode() {
			return code;
		}

		public int getMaxTemperature() {	
			
			switch (this) {
			case WINTER:
				return 5;		
			case RAINY:
			case FALL:
				return 10;
			case SUMMER:
				return 40;			
			default:
				return -1;
			}
		}

		public static CustomizedSeason valueOf(int code) {
			
			for (CustomizedSeason season1 : CustomizedSeason.values()) {
				if (season1.code == code) {
					return season1;
				}
				
			}
			throw new RuntimeException("Invalid code");
		}	
		
		
	}
	
	
	
	public static void main(String[] args) {
		CustomizedSeason season =  CustomizedSeason.SUMMER;
		
		System.out.println(season.getCode());
		
		System.out.println(CustomizedSeason.valueOf(2));
		
		System.out.println(season.getMaxTemperature());
		
		System.out.println("CustomSeason values are ::");
		
		for (CustomizedSeason season1 : CustomizedSeason.values()) {
			 System.out.print(season1+ "  ");
			
		}
		
		
	}

}

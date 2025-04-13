package com.in28minutes.mockito;

public class SomeBusinessImpl {
	DataService dataService;
	
	//constructor
	public SomeBusinessImpl(DataService dataService) {
		super();
		this.dataService = dataService;
	}
	
	public int findGreatestOfallNums() {
		int[] retriveAlldata = dataService.retriveAlldata();
		int greatestNum = Integer.MIN_VALUE;
		
		for (int i : retriveAlldata) {
			if(i > greatestNum) {
				greatestNum=i;
			}
		}		
		return greatestNum;
	}
}

package com.in28minutes.mockito.mockito.demo;

public class SomeBusinessImpl {
	DataService dataService;
	
	//constructor
	public SomeBusinessImpl(DataService dataService) {
		super();
		this.dataService = dataService;
	}
	
	public int findGreatestOfallNums() {
		int[] alldata = dataService.retriveAlldata();
		int greatest = Integer.MIN_VALUE;

		for (int num : alldata) {
			if(num > greatest) {
				greatest=num;
			}			
		}
		return greatest;
	}
}

package com.in28minutes.collections.edurekha;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo{

	public static void main(String[] args) {
		MapDemo demo1= new MapDemo();
		Map<Integer, String> createMap = demo1.createMap();
		
		demo1.displayMap(createMap);
	}

	private Map<Integer, String> createMap() {
		Map<Integer,String> eMap= new HashMap<>();		
		eMap.put(1, "X");
		eMap.put(30, "Y");
		eMap.put(120, "Z");		
		return eMap;
	}
	
	private void displayMap(Map<Integer,String> mapsToPrint) {
//		Set<Integer> keys = mapsToPrint.keySet();
//		for (Integer integer : keys) {
//			System.out.println( integer + " : "+mapsToPrint.get(integer));
//		}
		
		System.out.println(mapsToPrint);
	}

}

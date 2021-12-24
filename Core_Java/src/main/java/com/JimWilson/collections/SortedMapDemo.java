package com.JimWilson.collections;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapDemo {

	public static void main(String[] args) {
		SortedMap<String, String> map= new TreeMap<>();	
		
		map.put("2222","ghi");
		map.put("3333","abc");
		map.put("1111","def");		
		map.put("6666","xyz");
		map.put("4444","mno");
		map.put("5555","pqr");
		
//		using lambda on map
//		here lambda express use By consumer, accepts 2 parameters
		map.forEach( (k,v) -> System.out.println(k +" | "+v));
		System.out.println("======head map is exclusive 3333======");
	
//		head map is exclusive 3333
		SortedMap<String, String> headMap = map.headMap("3333");
		headMap.forEach( (k,v) -> System.out.println(k +" | "+v));
	
		System.out.println("======tail map inlusive 3333======");
		
//		tail map is inclusive 3333
		SortedMap<String, String> tailMap = map.tailMap("3333");
		tailMap.forEach( (k,v) -> System.out.println(k +" | "+v));
	
		
	}

}

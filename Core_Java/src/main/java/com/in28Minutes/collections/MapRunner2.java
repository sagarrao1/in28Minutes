package com.in28Minutes.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapRunner2 {

	public static void main(String[] args) {
		
//		Hash Set - No inserting order
//				 - No sorting order
//				 - No duplicate key
//				 - uses hashing algorithm hence faster

//		{A=3,Z=10,B=5,F=7} order we entered
		Map<String, Integer> map = new HashMap<>();
		map.put("A", 3);
		map.put("Z", 10);
		map.put("B", 5);
		map.put("F", 7);
		map.put("B", 5); // trying duplicate entry
		System.out.println("HashMap :" + map);
		

//      LinkedHashMap -- insertion order maintained
//				        - No sorting order
//						- No duplicate keys
//		{A=3,Z=10,B=5,F=7} order we entered
		Map<String, Integer> map2 = new LinkedHashMap<>();
		map2.put("A", 3);
		map2.put("Z", 10);
		map2.put("B", 5);
		map2.put("F", 7);
		map2.put("B", 5); // trying duplicate entry
		System.out.println("LinkedHashMap :" + map2);

//		TreeMap -- No insertion order 
//				-	sorting order maintained
//				-  sorted based on keys not on values
//				-	No duplicate keys
//		{A=3,Z=10,B=5,F=7} order we entered
		Map<String, Integer> map3 = new TreeMap<>();
		map3.put("A", 3);
		map3.put("Z", 10);
		map3.put("B", 5);
		map3.put("F", 7);
		map3.put("B", 5); // trying duplicate entry
		System.out.println("TreeMap :" + map3);
		
		
		
	}

}

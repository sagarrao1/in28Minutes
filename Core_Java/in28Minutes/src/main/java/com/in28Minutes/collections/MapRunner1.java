package com.in28Minutes.collections;


import java.util.HashMap;
import java.util.Map;

public class MapRunner1 {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("A", 3);
		map.put("Z", 10);
		map.put("B", 5);
		
		System.out.println(map);
		System.out.println("A= " + map.get("A"));
		System.out.println("C= " + map.get("C"));
		System.out.println("size= " + map.size());
		System.out.println("isEmpty= " + map.isEmpty());
		System.out.println("containsKey A= " + map.containsKey("A"));
		System.out.println("containsKey C= " + map.containsKey("C"));

		System.out.println("containsvalue 3= " + map.containsValue(3));

		System.out.println("keyset= " + map.keySet());

		System.out.println("values= " + map.values());

//		will return null if previous value of F is null or doesnot exist
		System.out.println("put F = " + map.put("F", 7));

//		will return 10 previous value of Z is 10, will update z = 11
		System.out.println("put Z = " + map.put("Z", 11));

	}

}

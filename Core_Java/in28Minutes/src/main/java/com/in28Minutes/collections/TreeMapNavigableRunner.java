package com.in28Minutes.collections;

import java.util.TreeMap;

public class TreeMapNavigableRunner {

//	TreeMap implements Navigable interface
//	it more features from that

	public static void main(String[] args) {

		// in order use Navigable features you need use Treeset in refer type
		// generally we use Map = new TreeMap()
		// here we need to use TreeMap = new TreeMap()
		TreeMap<String, Integer> map3 = new TreeMap<>();
		map3.put("A", 3);
		map3.put("Z", 10);
		map3.put("B", 5);
		map3.put("F", 7);
		map3.put("B", 5); // trying duplicate entry
//		{A=3,Z=10,B=5,F=7} order we entered
		System.out.println("TreeMap :" + map3);
//		TreeMap :{A=3, B=5, F=7, Z=10}		

		System.out.println(map3.floorKey("F")); // <=F
		System.out.println(map3.lowerKey("F")); // <F
//
		System.out.println("ceilingKey :" + map3.ceilingKey("F")); // >=F
		System.out.println("higherKey :" + map3.higherKey("F")); // >F

		System.out.println(map3.firstKey());
		System.out.println(map3.firstEntry());

		System.out.println("lastKey: " + map3.lastKey());
		System.out.println("lastEntry :" + map3.lastEntry());

		System.out.println(map3.subMap("B", "Z"));
		System.out.println(map3.subMap("B", true, "Z", true));

		System.out.println("headMap: " + map3.headMap("F")); // all lower than key F
		System.out.println("headMap: " + map3.headMap("F", true));
		System.out.println("tailMap: " + map3.tailMap("F")); // all grater than key F

	}

}

package com.in28minutes.collections.edurekha;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayListDemo demo1= new ArrayListDemo();
		ArrayListDemo demo2= new ArrayListDemo();
		List<String> crList = demo1.createList();
		
		demo2.displayList(crList);
		System.out.println("+++++++++++++++Displya list new way+++++++++++++++++++++++++++++");
		System.out.println();
		demo1.diplayListNewWay(crList);
	}

	private List<String> createList() {
		List<String> cars = new ArrayList<String>();
		cars.add("XUV300");
		cars.add("Sonet");
		cars.add("Brezza");
		return cars;
	}
	
	private void displayList(List carlist) {
		Iterator<String> iterator= carlist.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
//			iterator.remove();
		}
		
	}
	
	private void diplayListNewWay(List<String> ls) {
		for (String string : ls) {
			System.out.println(string);
		}
	}

}

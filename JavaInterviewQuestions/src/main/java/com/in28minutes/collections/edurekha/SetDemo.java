package com.in28minutes.collections.edurekha;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo<T>{

	public static void main(String[] args) {
		SetDemo demo1= new SetDemo();		
		Set hashSet = demo1.createHashSet();
		demo1.displaySet(hashSet);
		System.out.println();
		System.out.println("Linked hash set**********");
		hashSet = demo1.createLinkedHashSet();
		demo1.displaySet(hashSet);
		
		System.out.println("Tree hash set**********");
		hashSet = demo1.createTreeSet();
		demo1.displaySet(hashSet);

		
	} 

	private Set<T> createHashSet() {
		Set<Integer> hSet=  new HashSet<Integer>();
		hSet.add(100);
		hSet.add(30);
		hSet.add(10);
		hSet.add(100);
		hSet.add(200);
		hSet.add(150);
		hSet.add(10);
		return (Set<T>) hSet;
	}
	
	private Set<T> createLinkedHashSet() {
		Set<Integer> hSet=  new LinkedHashSet<>();
		hSet.add(100);
		hSet.add(30);
		hSet.add(10);
		hSet.add(100);
		hSet.add(200);
		hSet.add(150);
		hSet.add(10);
		return (Set<T>) hSet;
	}

	private Set<T> createTreeSet() {
		Set<Integer> hSet=  new TreeSet<>();
		hSet.add(100);
		hSet.add(30);
		hSet.add(10);
		hSet.add(100);
		hSet.add(200);
		hSet.add(150);
		hSet.add(10);
		return (Set<T>) hSet;
	}

	private void displaySet(Set<T> set) {
		Iterator itr= set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}

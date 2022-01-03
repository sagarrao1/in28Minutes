package com.in28Minutes.concurrency;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.LongAdder;

// we are doing same in 3 ways
public class ConcurrentMapRunner {

	public static void main(String[] args) {
		
	
		// we can use Integer instead of LongAdder, but LongAdder is Atomic
		String str= "ABCD ABC ABCD";
		char[] characters = str.toCharArray();
		System.out.println(characters);
//		for(char character:str.toCharArray()) 
//		we can write it in above way also. we dont need to load in separate load in char[] array
		
		
		// 1.
		Map<Character,Integer> occurencesInteger = new HashMap<>();
		for (char character : characters) {
			Integer v=occurencesInteger.get(character);  
			// better to use Integer instead of int because if we use int , we can't compare it will null
			if (v==null) {
				occurencesInteger.put(character, 1);
			}else {
				occurencesInteger.put(character, v+1);
			}			
		}
		
		System.out.println(occurencesInteger);
		
//		 using LongAdder Atomic. only increment() is syncronized. 
//		 problem with is occurences.get(character) is not synchronized
//		 so we may miss or over update for some of them when 2 threads trying to use this method in multithreaded environment
//		here we are not having multiple threads.let's assume. see the next code which uses concurrentHashmap to avoid this
//		at that we will change this from Map<Character,LongAdder> occurences = new HashMap<>(); to cocurrentHasshMap in 1st line. 
		
//		2.
		Map<Character,LongAdder> occurencesOld = new HashMap<>();
		for (char character : characters) {
			LongAdder longAdder=occurencesOld.get(character);  
			// better to use Integer instead of int because if we use int , we can't compare it will null
			if (longAdder==null) {
				longAdder = new LongAdder();
				longAdder.increment();
			}else {
				longAdder.increment();				
			}			
			occurencesOld.put(character, longAdder);
		}
		System.out.println(occurencesOld);
		

//		uses concurrentHashmap to avoid this.

		
//		3.
		ConcurrentMap<Character,LongAdder> occurences = new ConcurrentHashMap<>();
		for (char character : characters) {
			occurences.computeIfAbsent(character, ch -> new LongAdder()).increment();  
			// occurences(key, ) key means charater is obsent, you  create mapping funtion
			// if charcter is obsent, it sets new LongAdder and increments
		}
		System.out.println(occurences);

	}

}

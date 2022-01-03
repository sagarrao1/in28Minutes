package com.in28Minutes.concurrency;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/*CopyOnWrtiteArrayLIst : implements serialization on top of normal arrayList
No need to use exeternal serilization or locks, but it mutable means every time you add elements or modify, it creates new list, it will costly operation
It suits to scenario when you read from list 10k time and write 15-20 times
*/
public class CopyOnWriteArrayListRunner {

	public static void main(String[] args) {
		List<String> list = new CopyOnWriteArrayList<>();
		
		//Threads 3
		
		list.add("Apple");
		list.add("Bat");
		list.add("Mango");
				
		// Threads 10000
		for (String string : list) {
			System.out.println(string);
		}

		/*
		 * Let's add opreration is called by 3 thread and another 10k threads to read
		 * the list data let's day there are seperate methods //add //get and 3 threads
		 * are calling add and 10k threads are calling get if you synchronize everything
		 * , there will be performance impact as all threads need to wait, only one of 2
		 * methods are accessable
		 * here copyOnwrite synchronizes only add method and copies them to new arraylist till that 10k
		 * threads access old arrayList
		 * 
		 */
		
		
		
	}

}

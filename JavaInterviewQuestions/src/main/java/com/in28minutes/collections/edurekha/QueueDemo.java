package com.in28minutes.collections.edurekha;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo<T>{

	public static void main(String[] args) {
		QueueDemo demo1= new QueueDemo();
		Queue<Integer> createQueue = demo1.createQueue();
		
		demo1.displayQueue(createQueue);
	}

	private Queue<T> createQueue() {
		Queue<Integer> numbers=  new PriorityQueue<>();
		numbers.add(100);
		numbers.add(200);
		numbers.add(50);
		return (Queue<T>) numbers;
	}
	
	private void displayQueue(Queue<T> q) {
		System.out.println("Retrieving head of queue : "+q.peek());
		System.out.println("Retrieving head & removing 1st element of queue : "+q.poll());
		System.out.println("Retrieving head & removing 2nd element of queue : "+q.poll());
	}

}

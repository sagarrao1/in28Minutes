package com.in28Minutes.collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

class DescendingQueueComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer number1, Integer number2) {
		return Integer.compare(number1, number2);
	}

}

class DescendingLengthComparator implements Comparator<String> {

	@Override
	public int compare(String value1, String value2) {
		return Integer.compare(value2.length(), value1.length());
	}

}

public class QueueRunner {

// 	Queue is like Cinima ticket booking queue
// 	first in first out
//	implementation of queue is Priority queue
//	here it is PriorityQueue , so elements are natural order i.e ascending

	public static void main(String[] args) {
		Integer[] nums = { 765432, 65432, 5432, 432, 32 };
		Queue queue = new PriorityQueue<>();
		System.out.println("poll : " + queue.poll());
		Collections.addAll(queue, nums);
		System.out.println(queue);
		System.out.println("poll : " + queue.poll());

		System.out.println("peek : " + queue.peek());
		System.out.println("queue : " + queue);
		System.out.println("offer : " + queue.offer(45));
		System.out.println("queue : " + queue);

		Integer[] numbers = { 765432, 5432, 432, 32, 65432 };
		Queue<Integer> queue1 = new PriorityQueue<>(new DescendingQueueComparator());
		Collections.addAll(queue1, numbers);
		System.out.println("queue1 : " + queue1);

		String[] values = { "Zebra", "Monkey", " Elephant" };
		Queue<String> queue2 = new PriorityQueue<>(new DescendingLengthComparator());
		Collections.addAll(queue2, values);
		System.out.println("queue2 : " + queue2);

	}

}

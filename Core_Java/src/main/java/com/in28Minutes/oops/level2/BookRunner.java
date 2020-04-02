package com.in28Minutes.oops.level2;

public class BookRunner {

	public static void main(String[] args) {
		Book book = new Book(123, "Core Java ", "Ranga Rao");

		book.addReview(new Review(10, "Great book", 5));
		book.addReview(new Review(22, "Awesome", 4));

		System.out.println(book);

	}

}

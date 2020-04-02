package com.in28Minutes.oops.level2;

import java.util.ArrayList;

public class Book {
	// state
	private int id;
	private String bookName;
	private String author;
	private ArrayList<Review> reviews = new ArrayList<>();

	// constructor
	public Book(int id, String bookName, String author) {
		this.id = id;
		this.bookName = bookName;
		this.author = author;
	}

	// behaviour
	public void addReview(Review review) {
		reviews.add(review);
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", bookName=" + bookName + ", author=" + author + ", reviews=" + reviews + "]";
	}

}

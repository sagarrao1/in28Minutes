package com.in28Minutes.oops.level2;

public class Review {
	private int id;
	private String description;
	private int rating;

	public Review(int id, String description, int rating) {
		super();
		this.id = id;
		this.description = description;
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Review [id=" + id + ", description=" + description + ", rating=" + rating + "]";
	}

}

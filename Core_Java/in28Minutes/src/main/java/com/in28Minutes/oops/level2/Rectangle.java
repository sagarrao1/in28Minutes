package com.in28Minutes.oops.level2;

public class Rectangle {

	private int length;
	private int width;

	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}

	public int area() {
		return length * width;
	}

	public int perimeter() {
		return 2 * (length + width);
	}

	public int getlength() {
		return length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public void setLength(int length) {
		this.length = length;
	}
	@Override
	public String toString() {
		return String.format("length -%d, width- %d,area - %d, parimeter -%d", length, width, area(), perimeter());
	}

}

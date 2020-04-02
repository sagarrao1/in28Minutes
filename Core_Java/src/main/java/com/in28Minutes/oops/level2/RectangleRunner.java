package com.in28Minutes.oops.level2;

public class RectangleRunner {

	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(4, 6);

		System.out.println(rectangle);
		rectangle.setLength(12);

		System.out.println(rectangle.area());
		System.out.println(rectangle.perimeter());
		System.out.println(rectangle);
	}

}

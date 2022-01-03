package com.in28Minutes.oops.inheritance;

public class Person {
	private String name;
	private String email;
	private int phoneNumber;

	public Person(String name) {
		System.out.println("Person constructor");
		this.name = name;
	}

	public String getName() {
		return name;
	}


	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", email=" + email + ", phoneNumber=" + phoneNumber + "]";
	}


}

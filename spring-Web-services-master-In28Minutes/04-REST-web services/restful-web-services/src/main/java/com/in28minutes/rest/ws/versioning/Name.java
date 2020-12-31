package com.in28minutes.rest.ws.versioning;

public class Name {
	
	private String firstName;
	private String LastName;
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	
	public Name(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		LastName = lastName;
	}
	
	public Name() {
		super();
	}

	
}

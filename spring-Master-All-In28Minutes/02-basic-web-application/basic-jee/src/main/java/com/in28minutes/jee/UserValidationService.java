package com.in28minutes.jee;

public class UserValidationService {
	
	public boolean isUserValid(String user, String password) {
//		if (user=="sagar" && password=="dummy") {
		if (user.equals("sagar") && password.equals("dummy")) {			
			return true;
		}
		
		return false;
	}

}

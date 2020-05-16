package com.in28minutes.springmvc;

import org.springframework.stereotype.Service;

@Service
public class UserValidationService {
	
	public boolean isUserValid(String user, String password) {
//		if (user=="sagar" && password=="dummy") {
		if (user.equals("sagar") && password.equals("dummy")) {			
			return true;
		}
		
		return false;
	}

}

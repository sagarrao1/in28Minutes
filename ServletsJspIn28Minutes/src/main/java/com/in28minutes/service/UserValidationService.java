package com.in28minutes.service;

public class UserValidationService {

	public boolean isUservalid(String name, String password) {

		if (name.equals("in28Minutes") && password.equals("dummy"))
			return true;
		else
			return false;
	}

}

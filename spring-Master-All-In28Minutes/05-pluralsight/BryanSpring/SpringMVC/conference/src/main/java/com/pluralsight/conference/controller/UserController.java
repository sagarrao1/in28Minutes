package com.pluralsight.conference.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pluralsight.conference.model.User;

@RestController
public class UserController { 
	
	@GetMapping("/user")
	public 	User getUser( @RequestParam(value = "firstName", defaultValue = "Sagar") String firstname,
			@RequestParam(value = "lastName", defaultValue = "Annamaneni") String lastName,
			@RequestParam(value = "age", defaultValue = "33") Integer age) {

		User user = new User();
		user.setFirstName(firstname);
		user.setLastName(lastName);
		user.setAge(age);
		return user;
	}
	
	@PostMapping("/user")
	public User postUser(User user) {
		System.out.println("in th post method of user");
		System.out.println("user firstName : "+user.getFirstName());		
		
		return user;
	}

}

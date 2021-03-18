package com.in28Minutes.jpa.commandlinerunner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.in28Minutes.jpa.entity.User;
import com.in28Minutes.jpa.service.UserDAOService;


@Component
public class UserDAOServiceCommandLineRunner implements CommandLineRunner {

	
	private static final Logger log = LoggerFactory.getLogger(UserDAOServiceCommandLineRunner.class);

	
	@Autowired
	UserDAOService service;
	
	@Override
	public void run(String... args) throws Exception {
		
		User user= new User("Sagar","Admin");		
		long userId = service.insert(user);
		log.info("New User created : "+user.toString());
		
	}

}

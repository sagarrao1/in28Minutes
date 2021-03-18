package com.in28Minutes.jpa.commandlinerunner;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.in28Minutes.jpa.entity.User;
import com.in28Minutes.jpa.service.UserDAOService;
import com.in28Minutes.jpa.service.UserRepository;


@Component
public class UserRepositoyCommandLineRunner implements CommandLineRunner {

	
	private static final Logger log = LoggerFactory.getLogger(UserRepositoyCommandLineRunner.class);

	
	@Autowired
	UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		User user= new User("Jack","accounts");		
		userRepository.save(user);
		log.info("New User created : "+user);
		
		
		Optional<User> findById = userRepository.findById(1L);		
		log.info("User fecthed : "+findById);
		
		
		List<User> findAll = userRepository.findAll();		
		log.info("Fecthing all users : "+findAll);
		
		
		
	}

}

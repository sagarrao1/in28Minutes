package com.in28Minutes.database.databasedemo;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.in28Minutes.database.databasedemo.entiry.Person;
import com.in28Minutes.database.databasedemo.jdbc.PersonJbcDAO;
import com.in28Minutes.database.databasedemo.jpa.PersonJpaRepository;
import com.in28Minutes.database.databasedemo.springdemo.PersonSpringDataRepository;

@SpringBootApplication
public class SrpingDataDemoApplication implements CommandLineRunner{

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	
	@Autowired
	PersonSpringDataRepository repository;
	
	public static void main(String[] args) {
		SpringApplication.run(SrpingDataDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
		
		logger.info("get user 10001 -> {} ",repository.findById(10001));
		
		repository.deleteById(10002);
		
		logger.info("inert user 10004 -> no of rows inserted {} ", repository.save(new Person("Mahesh","Nizampet",new Date())));		
		logger.info("inert user 10004 -> no of rows inserted {} ", repository.save(new Person("lucky","Nizampet",new Date())));
		
		logger.info("update user 10003 -> no of rows updated {} ", repository.save(new Person(10003, "pradeep2","Beeramguda",new Date())));
		
		logger.info("All users -> {} ",repository.findAll());
	}

}

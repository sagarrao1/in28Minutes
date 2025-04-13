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

//@SpringBootApplication
public class SpringJdbcDemoApplication implements CommandLineRunner{

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	
	@Autowired
	PersonJbcDAO dao;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringJdbcDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		logger.info("All users -> {} ",dao.findAll());
		
		logger.info("get user 10001 -> {} ",dao.findById(10001));
		logger.info("delete user 10002 -> no of rows deleted {} ", dao.deleteById(10002));
		logger.info("inert user 10004 -> no of rows inserted {} ", dao.insert(new Person(10004, "Mahesh","Nizampet",new Date())));
		
		logger.info("update user 10003 -> no of rows updated {} ", dao.update(new Person(10003, "pradeep","Beeramguda",new Date())));
		
	}

}

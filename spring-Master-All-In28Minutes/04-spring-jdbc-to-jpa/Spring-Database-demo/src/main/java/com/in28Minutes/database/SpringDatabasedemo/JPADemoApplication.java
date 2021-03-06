package com.in28Minutes.database.SpringDatabasedemo;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import com.in28Minutes.database.SpringDatabasedemo.entity.Person2;
import com.in28Minutes.database.SpringDatabasedemo.jpa.PersonJPARepository;

//@SpringBootApplication
public class JPADemoApplication implements CommandLineRunner{

	private Logger logger= LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	PersonJPARepository repository;
	
	public static void main(String[] args) {
//		SpringApplication.run(JPADemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		
		
		  logger.info("\n1001 user is -> {} " ,repository.findById(10001));
		  
		  logger.info("\n insert new id will be auto sequence -> {} " ,
		  repository.insert(new Person2("Sanju","Karimnagar", new Date())));
		  
		  logger.info("\n update new 10003 id -> {} " , repository.update(new
		  Person2(10003,"Srinath","Alwal", new Date() ) ) );
		  
		  logger.info("\n delete id 10004 : \n ");
		  repository.deleteById(10004);
		  
		  logger.info("\n All users-> {} " ,repository.find_All());
		 		
		
//		logger.info("\n All users-> {} " ,dao.find_All());
		
//		logger.info("\nJames user name search -> {} " ,dao.findByName("James"));
		
//		logger.info("\n User search with date -> {} " ,dao.findByDate("2020-03-08"));
		


	}
	
		
	}

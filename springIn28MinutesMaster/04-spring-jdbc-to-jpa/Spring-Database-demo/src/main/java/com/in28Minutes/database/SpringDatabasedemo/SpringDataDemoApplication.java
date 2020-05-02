package com.in28Minutes.database.SpringDatabasedemo;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.in28Minutes.database.SpringDatabasedemo.entity.Person2;
import com.in28Minutes.database.SpringDatabasedemo.springdata.PersonSpringDataRepository;

@SpringBootApplication
public class SpringDataDemoApplication implements CommandLineRunner{

	private Logger logger= LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	PersonSpringDataRepository repository;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringDataDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		
		logger.info("\n insert user is -> {} " ,repository.findById(2));
		
		logger.info("\n insert new id will be auto sequence -> {} " ,
				repository.save(new Person2("Sanju","Karimnagar", new Date())));

		logger.info("\n update new 3 id -> {} " ,
				repository.save(new Person2(3,"Srinath","Alwal", new Date() )	)
		);
		
		try {
			repository.deleteById(3);
			logger.info("\n User Id 3 deleted:\n  " );
		} catch (Exception e) {
			// TODO Auto-generated catch block
			logger.info("\n Trying to delete user Id 3 does not exist:\n  " );
		}
		
		logger.info("\n All users-> {} " ,repository.findAll());
//		
//		
//		logger.info("\n All users-> {} " ,dao.find_All());
//		
//		logger.info("\nJames user name search -> {} " ,dao.findByName("James"));
//		
//		logger.info("\n User search with date -> {} " ,dao.findByDate("2020-03-08"));
//		
//

	}
	
		
	}

package com.in28Minutes.database.SpringDatabasedemo;


import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import com.in28Minutes.database.SpringDatabasedemo.entity.Person;
import com.in28Minutes.database.SpringDatabasedemo.jdbc.PersonJbdcDao;

//@SpringBootApplication
public class SpringJdbcDemoApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	PersonJbdcDao dao;

	public static void main(String[] args) {
//		Not to run as we are running JPADemoApplication
//		SpringApplication.run(SpringJdbcDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		dao.createPersonTable();
		logger.info("\n All users-> {} ", dao.findAllWithBeanRowMapper());
		logger.info("\n1001 user is -> {} ", dao.findById(10001));
		logger.info("\nJames user name search -> {} ", dao.findByName("James"));

		logger.info("\n All users-> {} ", dao.find_All());

		logger.info("\n delete user 10004 count-> {} ", dao.deleteById(10004, "James2"));

		logger.info("\n All users-> {} ", dao.find_All());

		logger.info("\n User search with date -> {} ", dao.findByDate("2020-03-08"));

		logger.info("\n insert new 10006 id -> {} ",
				dao.insertPerson(new Person(10006, "Sanju", "Karimnagar", new Date())));

		logger.info("\n update new 10003 id -> {} ",
				dao.updatePerson(new Person(10003, "Srinath", "Alwal", new Date())));
		
		logger.info("\n All users-> {} ", dao.find_All());
	}

}

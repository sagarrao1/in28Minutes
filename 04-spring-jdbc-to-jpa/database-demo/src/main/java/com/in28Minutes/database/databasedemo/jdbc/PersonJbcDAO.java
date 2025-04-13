package com.in28Minutes.database.databasedemo.jdbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.in28Minutes.database.databasedemo.entiry.Person;

@Repository
public class PersonJbcDAO {

	@Autowired
	JdbcTemplate jdbcTemplate;

	// select * from person
	public List<Person> findAll() {
		return jdbcTemplate.query("select * from person", new BeanPropertyRowMapper(Person.class));

	}

	// select * from person where id = 10001
	public Person findById(int id) {
		return (Person) jdbcTemplate.queryForObject("select * from person where id=?", new Object[] { id },
				new BeanPropertyRowMapper(Person.class));

	}

	public int deleteById(int id) {
		return jdbcTemplate.update("delete from person where id=?", new Object[] { id });
	}

	// select * from person where id = 10001
	public int insert(Person person) {
		return  jdbcTemplate.update("insert into person values(?,?,?,?)", 
				new Object[] { person.getId(),person.getName(),person.getLocation(),person.getBirth_date()});

	}
	
	public int update(Person person) {
		return  jdbcTemplate.update("update person set name=?, " 
									+" location =? , birth_date=? "
									+" where id=? ", 
				new Object[] { person.getName(),person.getLocation(),person.getBirth_date(), person.getId()});

	}
	
	
	
	
	
	
	
	
	

}

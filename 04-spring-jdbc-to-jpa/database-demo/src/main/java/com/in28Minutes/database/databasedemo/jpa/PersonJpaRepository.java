package com.in28Minutes.database.databasedemo.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Repository;

import com.in28Minutes.database.databasedemo.entiry.Person;

@Repository
@Transactional
public class PersonJpaRepository {

	//connect to database
	@PersistenceContext
	EntityManager entityManager;
	
	// select * from person where id = 10001
	public Person findById(int id) {
		return entityManager.find(Person.class, id); //JPA
	}

	public Person update(Person person) {
		return entityManager.merge(person); //JPA
	}

	public Person insert(Person person) {
		return entityManager.merge(person); //JPA
	}

	public void deleteById(int id) {
		Person personT = findById(id);
		entityManager.remove(personT); //JPA
	}
	
	// select * from person
	public List<Person> findAll() {
		TypedQuery<Person> namedQuery = entityManager.createNamedQuery("find_all", Person.class);
		return namedQuery.getResultList();
		
		//return jdbcTemplate.query("select * from person", new BeanPropertyRowMapper(Person.class));

	}


}

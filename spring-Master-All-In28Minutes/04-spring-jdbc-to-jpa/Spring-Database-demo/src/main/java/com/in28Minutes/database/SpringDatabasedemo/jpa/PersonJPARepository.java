package com.in28Minutes.database.SpringDatabasedemo.jpa;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.in28Minutes.database.SpringDatabasedemo.entity.Person2;

@Repository
@Transactional
public class PersonJPARepository {

//	connect to database
	@PersistenceContext
	EntityManager entityManager; //EntityManager is interface and @PersistenceContext is implementation
	

	public List<Person2> find_All() {
		TypedQuery<Person2> createNamedQuery = entityManager.createNamedQuery("find_All_persons", Person2.class);
		return createNamedQuery.getResultList();
	}

	public Person2 findById(int id) {
		return entityManager.find(Person2.class, id); // jpa
		
	}
	
	public Person2 insert(Person2 person) {		
		return entityManager.merge(person);
	}

	public Person2 update(Person2 person) {		
		return entityManager.merge(person);
	}

	public void deleteById(int id) {		
		Person2 person = entityManager.find(Person2.class, id);
		entityManager.remove(person);
	}

	//	public List<Person> findByName(String searchText) {
//		return jdbcTemplate.query(
//				"SELECT * FROM PERSON where name like ?",  new String[] { "%" + searchText + "%" },
//				new BeanPropertyRowMapper<Person>(Person.class));		
//	}
//
//	
//	public int deleteById(int id ,String name ) {
//		return jdbcTemplate.update
//				("delete from person where id=? and name= ?", new Object[] { id ,name});
//	}
//
//	public List<Person> findByDate(String searchText) {
//		return jdbcTemplate.query(
//				"SELECT * FROM PERSON  where BIRTH_DATE >=PARSEDATETIME(FORMATDATETIME(?, 'yyyy-MM-dd'), 'yyyy-MM-dd')", 
//				new String[] {searchText },
//				new BeanPropertyRowMapper<Person>(Person.class));		
//	}
//	
//	
//	public int updatePerson(Person person) {		
//		return jdbcTemplate.update("update person set name=?, location=?, birth_date=? "
//				+ " where id = ? ", 
//				new Object[] {person.getName(),
//						person.getLocation(),
//						new Timestamp(person.getBirthDate().getTime() ),
//						person.getId()
//						}
//				);
//	}
}
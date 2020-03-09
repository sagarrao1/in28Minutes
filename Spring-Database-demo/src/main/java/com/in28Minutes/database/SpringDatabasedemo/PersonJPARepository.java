package com.in28Minutes.database.SpringDatabasedemo;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.in28Minutes.database.SpringDatabasedemo.entity.Person2;

@Repository
@Transactional
public class PersonJPARepository {

//	connect to database
	@PersistenceContext
	EntityManager entityManager;
	

//	public List<Person> find_All() {
//		return jdbcTemplate.query("select * from person", new CustomRowMapper());
//	}

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
package com.in28Minutes.database.SpringDatabasedemo.jdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.in28Minutes.database.SpringDatabasedemo.entity.Person;

@Repository
public class PersonJbdcDao {

	@Autowired
	JdbcTemplate jdbcTemplate;


	class CustomRowMapper implements RowMapper<Person>{

		@Override
		public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
			Person person=new Person();
			person.setId(rs.getInt("id"));
			person.setName(rs.getString("name"));
			person.setLocation(rs.getString("location"));
			person.setBirthDate(rs.getDate("birth_date"));
					
			return person;
		}
		
	}
	
	
	public List<Person> find_All() {
		return jdbcTemplate.query("select * from person", new CustomRowMapper());
	}

	public Person findById(int id) {
		return jdbcTemplate.queryForObject(
				"select * from person where id =?", new Object[]{id}, 
				new BeanPropertyRowMapper<Person>(Person.class));		
	}
	
	
	public List<Person> findByName(String searchText) {
		return jdbcTemplate.query(
				"SELECT * FROM PERSON where name like ?",  new String[] { "%" + searchText + "%" },
				new BeanPropertyRowMapper<Person>(Person.class));		
	}

	
	public int deleteById(int id ,String name ) {
		return jdbcTemplate.update
				("delete from person where id=? and name= ?", new Object[] { id ,name});
	}

	public List<Person> findByDate(String searchText) {
		return jdbcTemplate.query(
				"SELECT * FROM PERSON  where BIRTH_DATE >=PARSEDATETIME(FORMATDATETIME(?, 'yyyy-MM-dd'), 'yyyy-MM-dd')", 
				new String[] {searchText },
				new BeanPropertyRowMapper<Person>(Person.class));		
	}
	
	public int insertPerson(Person person) {		
		return jdbcTemplate.update("insert into person (id,name,location, birth_date) "
				+ "values (?,?,?,?)", 
				new Object[] {person.getId(),person.getName(),
						person.getLocation(),
						new Timestamp(person.getBirthDate().getTime())
						}
				);
	}
	
	public int updatePerson(Person person) {		
		return jdbcTemplate.update("update person set name=?, location=?, birth_date=? "
				+ " where id = ? ", 
				new Object[] {person.getName(),
						person.getLocation(),
						new Timestamp(person.getBirthDate().getTime() ),
						person.getId()
						}
				);
	}
}
package com.in28Minutes.database.SpringDatabasedemo.entity;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name="find_All_persons", query="select p from Person2 p")
public class Person2 {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String location;
	private Date birthDate;
	
	/*
	 * We need to have no arg constructor , all arg constructor, all without id
	 * constructor because we made id as auto generated column, so need not to
	 * define
	 */	
	public Person2() {
		super();
	}

	public Person2(int id, String name, String location, Date birthDate) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.birthDate = birthDate;
	}

	public Person2(String name, String location, Date birthDate) {
		super();		
		this.name = name;
		this.location = location;
		this.birthDate = birthDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	@Override
	public String toString() {
		return "\nPerson2 [id=" + id + ", name=" + name + ", location=" + location + ", birthDate=" + birthDate + "]";
	}


	
	
	
}
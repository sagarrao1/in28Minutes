package com.in28Minutes.database.SpringDatabasedemo.springdata;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.in28Minutes.database.SpringDatabasedemo.entity.Person2;

@Repository
public interface PersonSpringDataRepository 
	extends JpaRepository<Person2, Integer> {

}

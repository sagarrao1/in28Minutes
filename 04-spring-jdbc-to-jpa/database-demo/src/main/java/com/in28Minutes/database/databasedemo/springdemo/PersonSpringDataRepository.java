package com.in28Minutes.database.databasedemo.springdemo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.in28Minutes.database.databasedemo.entiry.Person;

public interface PersonSpringDataRepository extends JpaRepository<Person, Integer> {

	
}

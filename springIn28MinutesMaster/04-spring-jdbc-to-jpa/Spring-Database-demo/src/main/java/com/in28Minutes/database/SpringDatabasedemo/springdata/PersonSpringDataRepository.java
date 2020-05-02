package com.in28Minutes.database.SpringDatabasedemo.springdata;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.in28Minutes.database.SpringDatabasedemo.entity.Person2;

/*Spring Data : further simplifies JPA to remove duplicate code in Person Repository
We need to create interface and extend JPARepository
Important In Sprint data we create interface, not entity or repository class.
we need mention Entity (Person2) and Primary key is Interger or String
*/

@Repository
public interface PersonSpringDataRepository 
	extends JpaRepository<Person2, Integer> {

}


package com.in28minutes.rest.ws.dataaccess;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import com.in28minutes.rest.ws.domain.User;

@Component
public class UserDaoService {
	
	public static int userCount=3;
	
	// create static users till we learn jpa
	public static List<User> users= new ArrayList<>();
	
	static {
		users.add(new User(1,"Sagar", new Date()));
		users.add(new User(1,"Ravi", new Date()));
		users.add(new User(1,"Murali", new Date()));		
	}

	
	// methods that we want to create are
	// findALL()
	//findById(Integer id)
	//createUser(User user)
	
	public List<User> findAll(){
		return users;
	}
	
	public User findById(Integer id) {
		for (User user : users) {
			if (user.getId()==id)
				return user;
		}
		return null;
	}
	
	
	public void save(User user) {
		if (user.getId()== null)
			user.setId(++userCount);
		
		users.add(user);
	}
	
	
}



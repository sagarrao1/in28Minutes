package com.in28minutes.rest.ws.controller;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Resource;
import org.springframework.hateoas.mvc.ControllerLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.in28minutes.rest.ws.dataaccess.UserDaoService;
import com.in28minutes.rest.ws.domain.User;
import com.in28minutes.rest.ws.domain.UserNotFoundException;
@RestController
public class UserController {
	
	@Autowired
	UserDaoService service;

	// retrieve all users
	
	@GetMapping(path = "/users")
	public  List<User> getAllUsers(){
		List<User> users = service.findAll();		
			return users;
			
//		return users;
	}
	
	// retrieveUser (int id)
	
	@GetMapping(path = "/users/{id}")
	public Resource<User> getByUserId(@PathVariable("id") int id){
		
		User user = service.findById(id);	
		if (user == null)
			throw new UserNotFoundException("id - "+ id);
		
//		HATEOAS => highpermedia as the engine of application state -->
//		want to return User with additional info like link to get all users
//		all-users SERVER_PATH + "/users"
//		getAllUsers
		
		return mapResource(user);		
		
//		return user;		
	}

	private Resource<User> mapResource(User user) {
		Resource<User> resource= new Resource<User>(user);
		ControllerLinkBuilder linkTo = linkTo(methodOn(this.getClass()).getAllUsers());
		resource.add(linkTo.withRel("all-users"));
		return resource;
	}
	
	// saveUser()
	@PostMapping("/users")
	public ResponseEntity<Object> saveUser(@Valid @RequestBody  User usr) {		
		
		User savedUser = service.save(usr);
		
//		if (savedUser == null)
//			throw new InvalidUserCreationException("Unable to create user due to one missing one of them. name: "+ usr.getName()+" desc: "+usr.getBirthDate());

//		return savedUser;
		
//		when we create resource(new user here), best practice is to return created(201) status instead of ok(200) status
//		to return 201 status we need to do below
				
		URI location=ServletUriComponentsBuilder
			.fromCurrentRequestUri()
			.path("/{id}")
			.buildAndExpand(savedUser.getId()).toUri();
				
		return ResponseEntity.created(location).build();
	}

	
	@DeleteMapping(path = "/users/{id}")
	public Resource<User> deleteByUserId(@PathVariable("id")int id){
		
		User user = service.deleteById(id);	
		if (user == null)
			throw new UserNotFoundException("id - "+ id);
		
		return mapResource(user);	
	}

	
}

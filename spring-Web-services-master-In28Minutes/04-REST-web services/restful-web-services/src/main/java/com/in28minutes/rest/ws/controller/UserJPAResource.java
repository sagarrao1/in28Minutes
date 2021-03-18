package com.in28minutes.rest.ws.controller;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

import java.net.URI;
import java.util.List;
import java.util.Optional;

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

import com.in28minutes.rest.ws.dataaccess.PostRespository;
import com.in28minutes.rest.ws.dataaccess.UserRepository;
import com.in28minutes.rest.ws.domain.Post;
import com.in28minutes.rest.ws.domain.User;
import com.in28minutes.rest.ws.domain.UserNotFoundException;


@RestController
public class UserJPAResource {
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	PostRespository postRespository;
	
	// retrieve all users
	
	@GetMapping(path = "/jpa/users")
	public  List<User> getAllUsers(){
		List<User> users = userRepository.findAll();		
			return users;
	}
	
	// retrieveUser (int id)
	
	@GetMapping(path = "/jpa/users/{id}")
	public Resource<User> getByUserId(@PathVariable("id") int id){
		
		Optional<User> user = userRepository.findById(id);	
		if (!user.isPresent())
			throw new UserNotFoundException("id - "+ id);
		
//		HATEOAS => highpermedia as the engine of application state -->
//		want to return User with additional info like link to get all users
//		all-users SERVER_PATH + "/users"
//		getAllUsers
		
		return mapResource(user.get());		
		
//		return user;		
	}

	private Resource<User> mapResource(User user) {
		Resource<User> resource= new Resource<User>(user);
		ControllerLinkBuilder linkTo = linkTo(methodOn(this.getClass()).getAllUsers());
		resource.add(linkTo.withRel("all-users"));
		return resource;
	}
	
	// saveUser()
	@PostMapping("/jpa/users")
	public ResponseEntity<Object> saveUser(@Valid @RequestBody  User usr) {		
		
		User savedUser = userRepository.save(usr);
		
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

	
	@DeleteMapping(path = "/jpa/users/{id}")
	public /* Resource<User> */ void deleteByUserId(@PathVariable("id")int id){
		
//		Optional<User> user = userRepository.findById(id);	
//		if (!user.isPresent())
//			throw new UserNotFoundException("id - "+ id);
//		
		userRepository.deleteById(id);
		
//		return mapResource(user.get());	
	}
	
	
//	Get all posts of a User
	
	@GetMapping(path = "/jpa/users/{id}/posts")
	public List<Post> getAllPostsByUserId(@PathVariable("id") int id){
		
		Optional<User> user = userRepository.findById(id);	
		if (!user.isPresent())
			throw new UserNotFoundException("id - "+ id);
		
		return user.get().getPosts();		
		
//		return user;		
	}
	
	
//	Post mapping for user
	@PostMapping("/jpa/users/{id}/posts")
	public ResponseEntity<Object> createPost(@PathVariable("id") int id , @Valid @RequestBody Post post){
		
		Optional<User> userOptional = userRepository.findById(id);	
		if (!userOptional.isPresent())
			throw new UserNotFoundException("id - "+ id);
				
		User user = userOptional.get();
		
		post.setUser(user);
		postRespository.save(post);
		
				
		URI location=ServletUriComponentsBuilder
			.fromCurrentRequestUri()
			.path("/{id}")
			.buildAndExpand(post.getId()).toUri();
				
		return ResponseEntity.created(location).build();
	}

	
	//get user id post id
	
	@GetMapping(path = "/jpa/users/{id}/posts/{pd}")
	public Post getAllPostsByUserIdPostById(@PathVariable("pd") int pd){
		
		System.out.println("pd :"+pd);
		
		Optional<Post> post = postRespository.findById(pd);
		if (!post.isPresent())
			throw new UserNotFoundException("pd - "+ pd);
		
		return post.get();		
		
//		return user;		
	}
	
}

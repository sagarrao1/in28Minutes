package com.in28minutes.rest.ws.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Entity
@ApiModel(description = "All details about User Domain")
public class User {

	@Id
	@GeneratedValue
	private int id;
	
	@Size(min = 2,message = "name should be min 2 chars")
	@ApiModelProperty(notes = "name should be min 2 chars")
	private String name;
	
	@Past(message = "Date should be in past , not in future")
	@ApiModelProperty(notes ="Date should be in past , not in future")
	private Date birthDate;
	
	
	@OneToMany(mappedBy = "user")
	private List<Post> posts;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	
	
	public void setId(int id) {
		this.id = id;
	}

	public List<Post> getPosts() {
		return posts;
	}

	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}

	public User(Integer id, String name, Date birthDate) {
		super();
		this.id = id;
		this.name = name;
		this.birthDate = birthDate;
	}

	
	
	public User(int id, @Size(min = 2, message = "name should be min 2 chars") String name,
			@Past(message = "Date should be in past , not in future") Date birthDate, List<Post> posts) {
		super();
		this.id = id;
		this.name = name;
		this.birthDate = birthDate;
		this.posts = posts;
	}

	@Override
	public String toString() {
		return String.format("User [id=%s, name=%s, birthDate=%s]", id, name, birthDate);
	}

	public User() {
		super();
	}
	
	

}

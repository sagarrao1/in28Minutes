package com.in28minutes.soap.webservices.soapcoursemanagement.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;

import com.in28minutes.soap.webservices.soapcoursemanagement.bean.Course;

@Component
public class CourseService {
	
	// findByID  input : id output : Course
	// GetallCourses  input: nothing , output : List<Course>
	// deleteByCourseID , input: id, output: int
	

	public enum Status{
		SUCCESS,FAILURE;
	}

	public Course findById(int id) {
		for (Course course : courseList) {
			if (course.getId() == id) {
				return course;
			}
		}		
		return null;
	}
	
	public List<Course> findAll(){		
		return courseList;
	}
	
	
	public Status deleteCourse(int id){		
		Iterator<Course> itr = courseList.iterator();		
		while(itr.hasNext()) {
			Course course = itr.next();
			if(course.getId()==id) {
				itr.remove();
				return Status.SUCCESS;
			}
		}
		return Status.FAILURE;
	}
	

	private static List<Course> courseList =  new ArrayList<>();	
	
	  static {		
		Course course1= new Course(1,"Python","learn python in 30 days");		
		courseList.add(course1);		
		Course course2= new Course(2,"Mongo DB","learn mongo DB ");
		courseList.add(course2);
		Course course3= new Course(3,"Java REST service","learn REST which is useful for  in 30 days");
		courseList.add(course3);
		Course course4 = new Course(4, "Maven", "Most popular maven course on internet!");
		courseList.add(course4);
	}
	
}

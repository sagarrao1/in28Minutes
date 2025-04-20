package com.in28minutes.soap.webservices.soapcoursemanagement.soap;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.in28minutes.courses.CourseDetails;
import com.in28minutes.courses.DeleteCourseDetailsRequest;
import com.in28minutes.courses.DeleteCourseDetailsResponse;
import com.in28minutes.courses.GetAllCourseDetailsRequest;
import com.in28minutes.courses.GetAllCourseDetailsResponse;
import com.in28minutes.courses.GetCourseDetailsRequest;
import com.in28minutes.courses.GetCourseDetailsResponse;
import com.in28minutes.courses.XmlStatus;
import com.in28minutes.soap.webservices.soapcoursemanagement.bean.Course;
import com.in28minutes.soap.webservices.soapcoursemanagement.service.CourseService;
import com.in28minutes.soap.webservices.soapcoursemanagement.service.CourseService.Status;
import com.in28minutes.soap.webservices.soapcoursemanagement.soap.exception.CourseNotFound;




@Endpoint
public class CourseDetailsEndpoint {

	
	@Autowired
	CourseService service;	
	
	//method
	//request  GetCourseDetailsRequest
	//response GetCourseDetailsResponse
	// support for name space http://in28minutes.com/courses request only 
	// process GetCourseDetailsRequest from above name space
	
  @PayloadRoot(namespace = "http://in28minutes.com/courses" , localPart = "GetCourseDetailsRequest")
  @ResponsePayload
  public GetCourseDetailsResponse processCourseDetailsRequest
  				(@RequestPayload GetCourseDetailsRequest request) {

	  Course course = service.findById(request.getId());
	  
	  if(course==null)
//		  throw new RuntimeException("course id doesn't exist : "+request.getId());
		  throw new CourseNotFound("course id doesn't exist : "+request.getId());
	  
//	  CourseDetails courseDetails= new CourseDetails();
//	  courseDetails.setId(request.getId());
//	  courseDetails.setName("Micro services");
//	  courseDetails.setDescription("learn micro services as it is future");	  

//	  CourseDetails courseDetails= new CourseDetails();	  
//	  courseDetails.setId(course.getId());
//	  courseDetails.setName(course.getName());
//	  courseDetails.setDescription(course.getDescription());
//	  
//	  GetCourseDetailsResponse response = new GetCourseDetailsResponse();
//	  response.setCourseDetails(courseDetails);
//	  return response;
	  
		return mapCourseDetails(course);
	  
	}

  @PayloadRoot(namespace = "http://in28minutes.com/courses" , localPart = "GetAllCourseDetailsRequest")
  @ResponsePayload
  public GetAllCourseDetailsResponse processAllCourseDetailsRequest
  				(@RequestPayload GetAllCourseDetailsRequest request) {

	  List<Course> courses = service.findAll();	  
	  return mapAllCourseDetails(courses);
	}

  private GetAllCourseDetailsResponse mapAllCourseDetails(List<Course> courses) {
		GetAllCourseDetailsResponse response = new GetAllCourseDetailsResponse();
		for (Course course : courses) {
			CourseDetails mapCourse = mapCourse(course);
			response.getCourseDetails().add(mapCourse);
		}
		return response;
	}
  
	private GetCourseDetailsResponse mapCourseDetails(Course course) {
		GetCourseDetailsResponse response = new GetCourseDetailsResponse();
		response.setCourseDetails(mapCourse(course));
		return response;
	}

	private CourseDetails mapCourse(Course course) {
		CourseDetails courseDetails = new CourseDetails();

		courseDetails.setId(course.getId());
		courseDetails.setName(course.getName());
		courseDetails.setDescription(course.getDescription());
		return courseDetails;
	}

  @PayloadRoot(namespace = "http://in28minutes.com/courses" , localPart = "DeleteCourseDetailsRequest")
  @ResponsePayload
  public DeleteCourseDetailsResponse processDeleteCourseDetailsRequest
  				(@RequestPayload DeleteCourseDetailsRequest request) {

	  Status status = service.deleteCourse(request.getId());
	  DeleteCourseDetailsResponse response= new DeleteCourseDetailsResponse();
	  response.setStatus(mapStatus(status));
	  return response;
	}
  
private XmlStatus mapStatus(Status status) {
	if(status == Status.FAILURE)
		return XmlStatus.FAILURE;
	return XmlStatus.SUCCESS;
}


}

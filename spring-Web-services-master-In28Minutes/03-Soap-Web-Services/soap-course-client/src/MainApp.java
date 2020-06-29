import java.util.List;

import com.in28minutes.courses.CourseDetails;
import com.in28minutes.courses.CoursePort;
import com.in28minutes.courses.CoursePortService;
import com.in28minutes.courses.GetAllCourseDetailsRequest;
import com.in28minutes.courses.GetAllCourseDetailsResponse;
import com.in28minutes.courses.GetCourseDetailsRequest;
import com.in28minutes.courses.GetCourseDetailsResponse;

public class MainApp {

	public static void main(String[] args) {

		CoursePort service = new CoursePortService().getCoursePortSoap11();
		GetCourseDetailsRequest getCourseDetailsRequest = new GetCourseDetailsRequest();
		getCourseDetailsRequest.setId(1);
		
		
		GetCourseDetailsResponse response = service.getCourseDetails(getCourseDetailsRequest);
		System.out.println(response.getCourseDetails().getId()+" # "+response.getCourseDetails().getName()+" # "+response.getCourseDetails().getDescription());
		
		System.out.println();
		System.out.println("==========another request get all course details ==============");
		System.out.println();
		// get all course details
		
		GetAllCourseDetailsRequest getAllCourseDetailsRequest= new GetAllCourseDetailsRequest();
		GetAllCourseDetailsResponse getAllCourseDetailsResponse = service.getAllCourseDetails(getAllCourseDetailsRequest);

		
		List<CourseDetails> courseDetails = getAllCourseDetailsResponse.getCourseDetails();
		for (CourseDetails courseDetails2 : courseDetails) {
			System.out.println(courseDetails2.getId() +" : "+courseDetails2.getName()+": "+courseDetails2.getDescription() );
		}
		
	}
}

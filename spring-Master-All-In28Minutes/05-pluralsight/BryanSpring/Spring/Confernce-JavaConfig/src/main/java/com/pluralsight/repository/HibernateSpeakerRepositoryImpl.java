package com.pluralsight.repository;

import com.pluralsight.model.Speaker;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

@Repository("speakerRepository")
@Profile("dev")
public class HibernateSpeakerRepositoryImpl implements SpeakerRepository{

	@Autowired
	private  Calendar cal;
	
	
   @Override
public List<Speaker> findAll(){
	   
	   List<Speaker> speakers =  new ArrayList<>();
	   
	   Speaker speaker = new Speaker();
	   
	   speaker.setFirstName("Bryan");
	   speaker.setLastName("Hason");
	   
	   System.out.println("cal time : "+cal.getTime());
	   
	   speakers.add(speaker);
	   
	   return speakers;
	   
   }

}

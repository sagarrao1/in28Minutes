package com.pluralsight.service;

import java.util.List;

import com.pluralsight.model.Speaker;
import com.pluralsight.repository.HibernateSpeakerRepositoryImpl;
import com.pluralsight.repository.SpeakerRepository;

public class SpeakerServiceImpl implements SpeakerService {	
	
	SpeakerRepository speakerRepository;
	
	@Override
	public List<Speaker> findAll(){		
		return speakerRepository.findAll();
	}

	public void setSpeakerRepository(SpeakerRepository speakerRepository) {
		this.speakerRepository = speakerRepository;
		System.out.println("SpeakerRepository setter injection");
	}

	public SpeakerServiceImpl(SpeakerRepository respository) {
		this.speakerRepository = respository;
		System.out.println("SpeakerRepository constructor injection");
	}

	public SpeakerServiceImpl() {
		System.out.println("SpeakerRepository no arg constructor");
	}
	
}

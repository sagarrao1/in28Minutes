package com.pluralsight.service;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.pluralsight.model.Speaker;
import com.pluralsight.repository.SpeakerRepository;

@Service("speakerService")
@Profile("dev")
public class SpeakerServiceImpl implements SpeakerService {	
	
	SpeakerRepository respository;
	
	@Override
	public List<Speaker> findAll(){		
		return respository.findAll();
	}

//	@Autowired
	public void setRespository(SpeakerRepository respository) {
		this.respository = respository;
		System.out.println("Using setter injection");
	}

	@Autowired
	public SpeakerServiceImpl(SpeakerRepository respository) {
		this.respository = respository;
		System.out.println("SpeakerServiceImpl repository constructor");
	}

	public SpeakerServiceImpl() {
		System.out.println("SpeakerServiceImpl no args constructor");
	}
	
	@PostConstruct
	public void initialize() {
		System.out.println("we are calling bean post processer after constructoru");
		
	}
	
}

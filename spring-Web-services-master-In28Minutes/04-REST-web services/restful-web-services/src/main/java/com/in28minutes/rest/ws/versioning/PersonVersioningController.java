package com.in28minutes.rest.ws.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonVersioningController {

//	1. Versioning using URI's
	@GetMapping(path = "/v1/person")
	public PersonV1 getPersonV1() {
		PersonV1 v1= new PersonV1("Bob Charle");		
		return v1;
	}
	
	@GetMapping(path = "/v2/person")
	public PersonV2 getPersonV2() {
		PersonV2 v2= new PersonV2(new Name("Bob","Charle"));		
		return v2;
	}

//	2. Versioning using rquest parameter
	
	@GetMapping(path = "/person/param",params = "version=1")
	public PersonV1 paramV1() {
		PersonV1 v1= new PersonV1("Bob Charle");		
		return v1;
	}
	
	@GetMapping(path = "/person/param",params = "version=2")
	public PersonV2 paramV2() {
		PersonV2 v2= new PersonV2(new Name("Bob","Charle"));		
		return v2;
	}

//	3. Versioning using headers
	
	@GetMapping(path = "/person/header",headers = "X_API_PER_VERSION=1")
	public PersonV1 headerV1() {
		PersonV1 v1= new PersonV1("Bob Charle");		
		return v1;
	}
	
	@GetMapping(path = "/person/header",headers = "X_API_PER_VERSION=2")
	public PersonV2 headerV2() {
		PersonV2 v2= new PersonV2(new Name("Bob","Charle"));		
		return v2;
	}

//	4. Versioning using produces mime type versioning
	
	@GetMapping(path = "/person/produces" , produces = "application/vnd.company.app-v1+json")
	public PersonV1 producesV1() {
		PersonV1 v1= new PersonV1("Bob Charle");		
		return v1;
	}
	
	@GetMapping(path = "/person/produces" , produces = "application/vnd.company.app-v2+json")
	public PersonV2 producesV2() {
		PersonV2 v2= new PersonV2(new Name("Bob","Charle"));		
		return v2;
	}
	
}

package com.in28minutes.spring.example1.dataService.stub;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import com.in28minutes.spring.example1.dataService.api.TodoDataService;

@Component
class TodoDataServiceStub implements TodoDataService {
	public List<String> retriveTodos() {
//		System.out.println("retriveTodos method in TodoDatasServiceStub");
		return Arrays.asList("Learn Spring", "Learn Struts", "Learn to Dance");
	}
}

package com.in28minutes.spring.example1.BusinessService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.in28minutes.spring.example1.dataService.api.TodoDataService;

@Component
public class TodoBusinessService {
	
	@Autowired	
	TodoDataService dataservice;  

//	TodoDataService dataservice =new TodoDataServiceRealImpl();
	
	public List<String> filteredTodos() {
//		System.out.println("First step");		
		List<String> filteredlist = new ArrayList<String>();
		List<String> todos = dataservice.retriveTodos();
		
//		System.out.println("filteredTodos method in TodoBusinessService: "+todos.size());
		for (String string : todos) {
			if (string.contains("Spring")) {
				filteredlist.add(string);
			}
		}		
		return filteredlist;
	}
}








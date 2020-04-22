package com.in28minutes.spring.example1.dataService.impl;

import java.util.List;
import org.springframework.stereotype.Component;
import com.in28minutes.spring.example1.dataService.api.TodoDataService;
import com.in28minutes.spring.example1.database.Database;

@Component
public class TodoDataServiceRealImpl implements TodoDataService {
	public List<String> retriveTodos() {
//		System.out.println("retriveTodos method in TodoDatasService");
		return Database.retriveTodos("dummy");
	}
}

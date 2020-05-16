package com.in28minutes.spring.example1;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@Configuration
@ComponentScan(basePackages = { "com.in28minutes" })
class SpringContext1 {
}

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringContext1.class)
public class TodoBusinessTestFinal {
	
	@Autowired
	TodoBusinessService1 businessService;
	
	@Test
	public void testGetTodosAboutSpring(){
		List<String> todos = businessService.retrieveTodosRelatedToSpring("Ranga");
		assertEquals(1,todos.size());
		assertEquals("Learn Spring",todos.get(0));
	}
}


@Component
class TodoBusinessService1{
	
	@Autowired
	TodoDataService1 dataService ;//= new TodoDataServiceStub()
	
	List<String> retrieveTodosRelatedToSpring(String user){
		List<String> todosRelatedToSpring = new ArrayList<String>();
		
		List<String> todos = dataService.retrieveTodos(user);
		
		for(String todo:todos){
			if(todo.contains("Spring")){
				todosRelatedToSpring.add(todo);
			}
		}
		return todosRelatedToSpring;
	}
	
}

class TodoDataServiceStub implements TodoDataService1{
	public List<String> retrieveTodos(String user){
		return Arrays.asList("Learn Spring","Learn Struts","Learn to Dance");
	}
}

interface TodoDataService1{
	List<String> retrieveTodos(String user);
}

@Component
class TodoDataServiceRealImpl implements TodoDataService1{
	public List<String> retrieveTodos(String user){
		return Database1.retrieveTodos(user);
	}
}

class Database1{
	static List<String> retrieveTodos(String user){
//		throw new RuntimeException("Database Down");
		return Arrays.asList("Learn Spring","Learn Struts","Learn to Dance");
	}
}
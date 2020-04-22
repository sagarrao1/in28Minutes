package com.in28minutes.spring.example1;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.in28minutes.spring.example1.BusinessService.TodoBusinessService;

@Configuration
@ComponentScan(basePackages = { "com.in28minutes.spring.example1.BusinessService",
								"com.in28minutes.spring.example1.dataService.stub"})
class SpringContext {
}

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringContext.class)
public class TodoBusinessTest {
	
	@Autowired
	TodoBusinessService todoBusinessService;

	@Test
	public void testGetTodosAboutSpring() {
		List<String> filteredTodos = todoBusinessService.filteredTodos();
//		System.out.println("size "+filteredTodos.size());
		assertEquals(1, filteredTodos.size());
		assertEquals("Learn Spring", filteredTodos.get(0));
		
	}
}

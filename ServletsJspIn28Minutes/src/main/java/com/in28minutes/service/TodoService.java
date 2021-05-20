package com.in28minutes.service;

import java.util.ArrayList;
import java.util.List;

import com.in28minutes.todo.Todo;

public class TodoService {

	public static List<Todo> todos = new ArrayList<>();
	static {
			todos.add(new Todo("Learn Web Application", "Study"));
			todos.add(new Todo("Learn Spring MVC", "Study"));
			todos.add(new Todo("Learn Spring REST services", "Study"));
			todos.add(new Todo("Watch mvoies", "Fun"));
	}	
	
	public List<Todo> retriveTodos(){
		return todos;
	}
	
	public void addTodo(String todoName,String category) {		
		todos.add(new Todo(todoName,category));
	}
	
	
	public void deleteTodoObj(Todo todoObj) {
	   todos.remove(todoObj);		
	}
	
	
	
	public void deleteTodo(String todoName) {		
		
		System.out.println("in deleteTodo...");
		
		int j=-1;
		for (int i = 0; i < todos.size(); i++) {
			if (todos.get(i).getName().equals(todoName)) {
				j=i;
			}
		}			
		todos.remove(j);
			
	}
		
	
	
	
	
}

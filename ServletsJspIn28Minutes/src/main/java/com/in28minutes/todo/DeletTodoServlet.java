package com.in28minutes.todo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.in28minutes.service.TodoService;
import com.in28minutes.service.UserValidationService;

@WebServlet(urlPatterns = "/delete-todo.do")
public class DeletTodoServlet extends HttpServlet {

	TodoService todoService = new TodoService();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {			
		
		String deleteTodo = request.getParameter("deleteTodo");
		String deleteCategory = request.getParameter("deleteCategory");
		System.out.println("todoName in delete-todo.do: "+deleteTodo);
		System.out.println("deleteCategory in delete-todo.do: "+deleteCategory);
		
		
//		todoService.deleteTodo(deleteTodo);
		
//		another way of deleting object
		todoService.deleteTodoObj(new Todo(deleteTodo,deleteCategory));
		
		response.sendRedirect("/list-todo.do");
		
	}
	
//	protected void doPost(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {			
//		
//		String newTodo = request.getParameter("todoName");
//		todoService.addTodo(newTodo);
//			
//		response.sendRedirect("/list-todo.do");
//	}

}
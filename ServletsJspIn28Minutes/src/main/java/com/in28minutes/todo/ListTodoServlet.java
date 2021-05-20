package com.in28minutes.todo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.in28minutes.service.TodoService;
import com.in28minutes.service.UserValidationService;

@WebServlet(urlPatterns = "/list-todo.do")
public class ListTodoServlet extends HttpServlet {

	TodoService todoService = new TodoService();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {			
		
		String todoName = request.getParameter("todoName");
//		System.out.println(todoName);
		
		request.setAttribute("todos", todoService.retriveTodos());
		request.getRequestDispatcher("/WEB-INF/views/list-todo.jsp").forward(request, response);
	}
	
}
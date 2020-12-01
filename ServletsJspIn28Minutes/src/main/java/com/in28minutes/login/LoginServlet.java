package com.in28minutes.login;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.in28minutes.service.TodoService;
import com.in28minutes.service.UserValidationService;
import com.in28minutes.todo.Todo;

/*
 * Browser sends Http Request to Web Server
 * 
 * Code in Web Server => Input:HttpRequest, Output: HttpResponse
 * JEE with Servlets
 * 
 * Web Server responds with Http Response
 */

//Java Platform, Enterprise Edition (Java EE) JEE6

//Servlet is a Java programming language class 
//used to extend the capabilities of servers 
//that host applications accessed by means of 
//a request-response programming model.

//1. extends javax.servlet.http.HttpServlet
//2. @WebServlet(urlPatterns = "/login.do")
//3. doGet(HttpServletRequest request, HttpServletResponse response)
//4. How is the response created?

@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet {

	UserValidationService userValidationService = new UserValidationService();
	TodoService todoService = new TodoService();
	private List<Todo> retriveTodos;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setAttribute("name", request.getParameter("name"));
		request.setAttribute("password", request.getParameter("password"));

		request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);

//		PrintWriter out = response.getWriter();
//		out.println("<html>");
//		out.println("<head>");
//		out.println("<title>Yahoo !!!!!!</title>");
//		out.println("</head>");
//		out.println("<body>");
//		out.println("<h1>Welcome to Servlet and JSP Course</h1>");
//		out.println("</body>");
//		out.println("</html>");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String name = request.getParameter("name");
		String password = request.getParameter("password");

		boolean isUservalid = userValidationService.isUservalid(name, password);
		
		if (isUservalid) {
			request.getSession().setAttribute("name", name);
			response.sendRedirect("/list-todo.do");
			
		} else {
			request.setAttribute("errorMessage", "Invalid Login details");
			request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);

		}

	}

}
package com.in28minutes;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*we have Embeded tomcat7 server in maven pom.xml
so we run it as maven build
run as maven build .. tomcat7:run
*/

@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet {
	
	private UserValidationService service = new UserValidationService();	

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		/*
		 * PrintWriter out = response.getWriter(); out.println("<html>");
		 * out.println("<head>"); out.println("<title>Yahoo!!!!!!!!</title>");
		 * out.println("</head>"); out.println("<body>");
		 * out.println("My First Servlet New"); out.println("</body>");
		 * out.println("</html>");
		 */

		String name = request.getParameter("name");

		request.setAttribute("name", name);
		request.setAttribute("password", request.getParameter("password")); // another way passing directly

		request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {		
		
		
		String name = request.getParameter("name");		
		
		String password = request.getParameter("password");

		boolean isUserValid = service.isUserValid(name, password);
		
		if (isUserValid) {			
			request.setAttribute("name", name);
			request.setAttribute("password", password); // another way passing directly
			request.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(request, response);
		} else {
			request.setAttribute("ErrorMsg", "Invalid Credentials !!!!");
			request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
		}
		

	}

}

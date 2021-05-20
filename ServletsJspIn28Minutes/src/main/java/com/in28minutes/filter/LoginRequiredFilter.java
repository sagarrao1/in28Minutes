package com.in28minutes.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;

@WebFilter(urlPatterns = { "*.do" })
public class LoginRequiredFilter implements Filter {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain)
			throws IOException, ServletException {

		HttpServletRequest request = (HttpServletRequest) servletRequest;

		System.out.println(request.getRequestURI());
		System.out.println("name= "+request.getSession().getAttribute("name"));
		
		if (request.getSession().getAttribute("name") != null) {
			System.out.println("in if of doFilter method of LoginRequiredFilter");
			chain.doFilter(servletRequest, servletResponse);
		} else {
			System.out.println("else block of doFilter method of LoginRequiredFilter");
			request.getRequestDispatcher("/login.do").forward(servletRequest, servletResponse);
		}

	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub

	}

}

/**
 * @author : Sachin Barpete
 * @purpose : details come from register.jsp and validate for username length >=5
 */
package com.bridgelabz.filter;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/Register")
public class UsernameFilter implements Filter {

	public void destroy() {

	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		String username = request.getParameter("username");
		PrintWriter out = response.getWriter();
		if (username.length() >= 5)
			chain.doFilter(request, response);
		else
			out.print("Invalid username it should be atleast 5 character");
	}

	public void init(FilterConfig fConfig) throws ServletException {

	}

}

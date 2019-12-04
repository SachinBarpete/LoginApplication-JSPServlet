/**
 * @author : Sachin Barpete
 * @purpose : details come from register.jsp and validate for password and confirm password
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
public class PasswordFilter implements Filter {

	public void destroy() {

	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		String password = request.getParameter("password");
		String confirmPassword = request.getParameter("confirmPassword");
		PrintWriter out = response.getWriter();
		if (password.equals(confirmPassword)) {
			chain.doFilter(request, response);
		} else
			out.print("password deos not match");

	}

	public void init(FilterConfig fConfig) throws ServletException {

	}
}

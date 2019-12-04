package com.bridgelabz.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.bridgelabz.repository.Dao;
import com.bridgelabz.model.User;
/**
 * @author : Sachin Barpete
 * @purpose : details come from register.jsp and send redirect to welcome.jsp
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String username = request.getParameter("username");
		String name = request.getParameter("name");
		Long mobileNo = Long.parseLong(request.getParameter("mobileNo"));
		String email = request.getParameter("email");
		String address = request.getParameter("address");
		String password = request.getParameter("password");
		User user = new User();
		user.setUsername(username);
		user.setName(name);
		user.setMobileNo(mobileNo);
		user.setEmail(email);
		user.setAddress(address);
		user.setPassword(password);
		Dao dao = new Dao();
		if(dao.registerUser(user))
		{
			HttpSession session = request.getSession();
			session.setAttribute("username", username);
			response.sendRedirect("welcome.jsp"); 
		} else
			response.sendRedirect("register.jsp");

	}
	
	

}
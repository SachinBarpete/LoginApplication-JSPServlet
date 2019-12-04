package com.bridgelabz.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bridgelabz.repository.Dao;

/**
 * @author : Sachin Barpete
 * @purpose : details come from login.jsp and send redirect to welcome.jsp
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Dao dao = new Dao();

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		if (dao.verifyLogin(request.getParameter("username"), request.getParameter("password"))) {
			HttpSession session = request.getSession();
			session.setAttribute("username", request.getParameter("username"));
			response.sendRedirect("welcome.jsp");
		} else
			response.sendRedirect("login.jsp");
	}

}
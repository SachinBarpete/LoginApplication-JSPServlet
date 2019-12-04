package com.bridgelabz.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bridgelabz.repository.Dao;
/**
 * @author : Sachin Barpete
 * @purpose : details come from forgottPassword.jsp and send redirect to resetPassword.jsp and in the failure case send redirect to login.jsp
 */
@WebServlet("/ForgottPassword")
public class ForgottPassword extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		String username = request.getParameter("username");
		String email = request.getParameter("email");
		Dao dao = new Dao();
		if (dao.forgottPassword(username, email)) {
			HttpSession session = request.getSession();
			session.setAttribute("username", username);
			session.setAttribute("email", email);
			response.sendRedirect("resetPassword.jsp");
		} else {
			out.println("Username or Email invalid");
			response.sendRedirect("login.jsp");
		}

	}
}
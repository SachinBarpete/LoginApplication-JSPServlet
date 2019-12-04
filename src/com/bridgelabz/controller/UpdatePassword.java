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
 * @purpose : details come from resetPassword.jsp and send redirect to welcome.jsp in the failure case send redirect to login.jsp
 */
@WebServlet("/UpdatePassword")
public class UpdatePassword extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		String username = (String) session.getAttribute("username");
		String email = (String) session.getAttribute("email");
		String password = request.getParameter("password");
		PrintWriter out = response.getWriter();
		Dao dao = new Dao();
		if (dao.updatePassword(username, email, password)) {
			response.sendRedirect("welcome.jsp");
		} else {
			out.print("password not updated");
			response.sendRedirect("login.jsp");
		}
	}
}

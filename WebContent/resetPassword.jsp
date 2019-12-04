<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>reset password</title>
</head>
<body>
	<%
		response.setHeader("Cache-Control", "no-caches, no-store, must-revalidate"); // http 1.1
		response.setHeader("Pragma", "no-caches"); //http 1.0
		response.setHeader("Expire", "0"); // proxies
		if (session.getAttribute("username") == null)
			response.sendRedirect("login.jsp");
	%>
	<form action="UpdatePassword">
		<b>Enter new password</b><br>
		<input type="password" placeholder="new Password" name="password" id ="password"><br><br>
		<input type = "submit" id="resetpass_submit_btn">
	</form>
</body>
</html>
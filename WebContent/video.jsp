<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Video page</title>
</head>
<body>
	<%
		response.setHeader("Cache-Control", "no-caches, no-store, must-revalidate"); // http 1.1
		response.setHeader("Pragma", "no-caches"); //http 1.0
		response.setHeader("Expire", "0"); // proxies
		if (session.getAttribute("username") == null)
			response.sendRedirect("login.jsp");
	%>
	<iframe width="560" height="315"
		src="https://www.youtube.com/embed/Q80x-ESEuNc" frameborder="0"
		allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture"
		allowfullscreen></iframe>

	<br><br>
	<form action="Logout">
		<input type="submit" value="Logout" id ="video_logout_btn">
	</form>
</body>
</html>
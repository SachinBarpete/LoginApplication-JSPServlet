<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>welcome to Bridgelabz</title>
</head>
<body>
	<%
		response.setHeader("Cache-Control", "no-caches, no-store, must-revalidate"); // http 1.1
		response.setHeader("Pragma", "no-caches"); //http 1.0
		response.setHeader("Expire", "0"); // proxies
		if (session.getAttribute("username") == null)
			response.sendRedirect("login.jsp");
	%>
	welcome <b>${username}</b> <br></br>
	<b>for watch video </b>
	<a href="video.jsp" id ="video_link">video link</a>
	<br><br>
	<b>for visit Website </b>
	<a href ="https://www.bridgelabz.com" id ="website_link">website link</a>
	<br><br>
	<form action="Logout">
		<input type="submit" value="Logout" id="welcome_logout_btn">
	</form>

</body>
</html>
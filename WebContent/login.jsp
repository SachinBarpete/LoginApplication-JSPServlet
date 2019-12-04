<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login to Bridgelabz</title>
</head>
<body>
	<form action="Login" method="post">
		<h1>Login</h1>
		<input type="text" placeholder="Username" name="username" id="username"><br>
		<input type="text" placeholder="Password" name="password"id="password"> <br><br>
		<input type="submit" value="Login" id = "login_login_btn"> || <a href ="forgottPassword.jsp" id="forgott_password">forgott password </a>
		
	</form>
</body>
</html>
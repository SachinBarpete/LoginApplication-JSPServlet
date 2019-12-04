<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register page</title>
</head>
<body>
	<form action="Register" method = "post"> 
	
	<div align ="justify">
		<h1>Register Here</h1>
		<hr width ="15%" align ="left" color ="grey">
		Username:<br>
		<input type="text" placeholder="Username" name="username" id="username"><br>
		name:<br>
		<input type="text" placeholder="Name" name="name" id ="name"><br> 
		Mobile no:<br>
		<input type="tel" placeholder="Mobile No" name="mobileNo" id="mobileNo"><br>
		Email:<br>
		<input type="email" placeholder="Email" name="email" id="email"><br>
		Address:<br>
		<textarea placeholder="Address" name = "address" id ="address"></textarea><br>
		Password:<br>
		<input type="password" placeholder="Password" name="password" id = "password"><br>
		Confirm Password:<br>
		<input type="password" placeholder="Confirm Password" name="confirmPassword"> <br>
		<br>
		<input type = "submit" id ="register_submit_btn"> 
	</div>
	</form>
</body>
</html>
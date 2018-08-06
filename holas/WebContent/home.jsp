<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home Page</title>
</head>
<body bgcolor="grey">

<h1>Home Page</h1>
<form name="loginform" method ="get">
    <label>User Name:</label> <input type="email" name="usr" placeholder="username"> <br><br><br>
    <label>Password:</label>
    <input type="password" name="pword" placeholder="password"><br><br>
    <input type="submit" value="Login" />
    
    <a href="">Forget Password?</a><br><br>
    <a href="">New User? Register</a>
</form>


</body>
</html>
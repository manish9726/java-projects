<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Forget Page</title>
</head>
<body bgcolor="weed">
<div align="center">
<h1>Forget Password Page</h1>
<form name="loginform" method ="get">
    <label>User Name:</label>
    <input type="email" name="usr" placeholder="username"> <br><br>
    <label>What is your favourite movie?</label>
    <input type="text" name="movie" placeholder="movie name"><br><br>
    <input type="submit" value="Submit" />
    
    
 <%-- 
    <label>Enter new Password</label>
    <input type="password" name="password" placeholder="password"> <br><br><br>
    <label>Confirm Password</label>
    <input type="password" name="password" placeholder="confirm password"> <br><br><br>
    --%>

</form>
</div>
</body>
</html>
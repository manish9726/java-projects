<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Change Password</title>
</head>
<body background="D:\profilepics\bg.jpg">
<h1 style="color:red">Forget Password</h1>
	<form action="UserController.hola" method="get">
		<table style="with: 50%">

			<tr>
				<td style="color:white">Email Id: </td>
				<td><input type="email" name="emailId" placeholder="emailId" required/></td>
			</tr>



			<tr>
				<td style="color:white">Password: </td>
				<td><input type="password" name="password" placeholder="password" required/></td>
			</tr>

		</table>
		<input type="submit" value="Set Password" />
	</form>
	<%@ include file="footer.html"  %>

</body>
</html>
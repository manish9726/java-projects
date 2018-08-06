<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Page</title>
</head>
<body bgcolor="yellow">
	<form action="/signup" method="POST">
  
  <p>
    <label> Name</label>
    <input type="text"  placeholder="Name">
  </p>
  
  <p>
    <label>Email</label>
    <input type="email"  placeholder="email">
  </p>
  <p>
    <label>Password</label>
    <input type="password"  placeholder="password" pattern=[A-Za-z0-9]{8,20}>
  </p>
  <p>
    <label>Age</label>
    <input type="number" placeholder="age">
  </p>
  <p>
    <label>Gender</label>
    <select>
      <option>Male</option>
      <option>Female</option>
      <option>Others</option>
    </select>
  </p>
 <p>
    <label>City</label>
    <input type="text"  placeholder="city">
  </p>
  <p>
    <label>Favourite movie name</label>
    <input type="movie"  placeholder="movie name">
  </p>
  
  <p>
  <label>Upload Profile photo</label>
  <input type="file" name="pic" accept="image/*">
  </p>
  <p>
    <button>
     Register
    </button>
  </p>
</form>
</body>
</html>
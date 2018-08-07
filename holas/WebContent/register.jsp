<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Page</title>
</head>
<body bgcolor="yellow">
<div align="center">

<h1>Register Yourself </h1>
	<form action="/signup" method="POST">
  
  <p>
    <label> Name</label>
    <input type="text" name="name"  placeholder="Name">
  </p>
  
  <p>
    <label>Email</label>
    <input type="email" name="email_id" placeholder="email">
  </p>
  <p>
    <label>Password</label>
    <input type="password" name ="password" placeholder="password" pattern=[A-Za-z0-9]{8,20}>
  </p>
  <p>
    <label>Age</label>
    <input type="number" name="age" placeholder="age">
  </p>
  <p>
    <label>Gender</label>
    <select name="gender">
      <option value="Male" >Male</option>
      <option value="Female">Female</option>
      <option value="Others">Others</option>
    </select>
  </p>
 <p>
    <label>City</label>
    <input type="text" name="city"  placeholder="city">
  </p>
  <p>
    <label>Favourite movie name</label>
    <input type="text" name="movie" placeholder="movie name">
  </p>
  
  <p>
  <label>Upload Profile photo</label>
  <input type="file" name="photo" accept="image/*">
  </p>
  <p>
    <button>
     Register
    </button>
  </p>
</form>
</div>
</body>
</html>
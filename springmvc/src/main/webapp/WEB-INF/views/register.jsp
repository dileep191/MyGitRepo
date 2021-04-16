<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<fieldset>
<legend>REGISTRATION</legend>
<form action="./result3" method="post">
  <label for="fname">First name:</label><br>
  <input type="text" id="fname" name="fname" required="required"><br>
  <label for="lname">Last name:</label><br>
  <input type="text" id="lname" name="lname"><br>
   <label for="email">Email Id:</label><br>
  <input type="email" id="email" name="email" required="required"><br>
   <label for="password">Password:</label><br>
  <input type="password" id="password" name="password" required="required"><br><br>
  <input type="submit" value="register">
</form>
</fieldset>
</body>
</html>
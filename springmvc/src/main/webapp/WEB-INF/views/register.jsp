<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
form {
  background-color: rgb{255,255,255};
  width: 300px;
  border: 15px solid green;
  padding: 50px;
  margin: 20px;
  margin-left: auto;
  margin-right: auto;
}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1 align="center">This is REGISTRATION page</h1>

<p align="center">Please Enter USERNAME and PASSWORD. Then click submit to Register</p><br/><br/>
<h3 align="center">REGISTER</h3>
<form align="center" method="post" action="./submitregistration">
	<b>Username </b><input type="text" name="username"/><br/>
	<b>Password </b><input type="password" name="password"/><br/><br/>
	<button type="submit">SUBMIT</button>
</form>
<p align="center">Already Registered? <a href="./login">LOGIN</a> now</p><br/><br/>
</body>
</html>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<style>
img {
  width: 150px;
  height: 150px;
  display: block;
  margin-left: auto;
  margin-right: auto;
}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1 align="center">MY DAIRY</h1>
	<img src="<c:url value="resources/images/unnamed.png"/>"/>
	<p align="center">This is My Dairy homepage</p><br/>
	<p align="center">New users please click on <a href="./register">REGISTER</a> button</p>
	<p align="center">Returning users please click on <a href="./login">LOGIN</a> button to use My Dairy app</p>
	
</body>
</html>
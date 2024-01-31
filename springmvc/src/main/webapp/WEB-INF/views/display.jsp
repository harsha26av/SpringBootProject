<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<style>
.d1 {
  background-color: rgb{255,255,255};
  width: 300px;
  border: 15px solid green;
  padding: 50px;
  margin: 20px;
  margin-left: auto;
  margin-right: auto;
}
.d2{
width:25%;
float:left;
}
.d3{
width:50%;
float:right;}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3 align="center">VIEW ENTRY</h3>

<div class="d1">
	<div class="d2"><label>Date</label></div>
	<div class="d3">${userEntities.ddate}</div>
</div>

<div class="d1">
	<div class="d2"><label>Description</label></div>
	<div class="d3">${userEntities.ddescription}</div>
</div>
<br/><br/>
<p align="center"><a href="./homepage"><button type="button"> BACK TO HOME</button></a></p>
</body>
</html>
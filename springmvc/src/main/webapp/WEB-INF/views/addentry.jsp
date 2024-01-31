<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
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
<h3 align="center">ADD ENTRY</h3>
<form align="center" method="post" action="./final">
	<b>Date </b><input type="date" name="ddate"/><br/><br/><br/><br/>
	<b>Dairy Description </b><textarea rows="10" cols="30" name="ddescription"></textarea>
	<input type="hidden" name="userid" value="${homeEntities.id}"/>
	<br/><br/>
	<button type="submit">SAVE ENTRY</button>
</form>
</body>
</html>
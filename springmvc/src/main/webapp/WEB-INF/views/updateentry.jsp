<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
//<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
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
<h3 align="center">UPDATE ENTRY</h3>
<form align="center" method="post" action="./processentry">
	<b>Date </b><input type="text" name="ddate" value="<fmt:formatDate value="${userEntities.ddate}" pattern="yyyy-MM-dd"/>" readonly><br/><br/>
	<b>Dairy Description </b><textarea rows="10" cols="30" name="ddescription">${userEntities.ddescription}</textarea>
	<input type="hidden" name="userid" value="${homeEntities.id}"/>
	<input type="hidden" name="id" value="${userEntities.id}"/>
	<br/><br/>
	<button type="submit">UPDATE ENTRY</button>
</form>
</body>
</html>
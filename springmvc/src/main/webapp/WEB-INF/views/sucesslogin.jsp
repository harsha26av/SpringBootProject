<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<style>
.body{
width:100%;
text-align: center;
}
.main{
width:100%;
text-align: center;
}
.left{
width:25%;
float:left;
}
.right{
width:25%;
float:right;
}
.m1{
width:25%;
float:left;
}
.m2{
width:25%;
float:right;
}
.body1{
width:100%;
text-align: center;
}
.left1{
width:25%;
float:left;
border: 15px solid green;
}
.right1{
width:70%;
float:left;
border: 15px solid green;
}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="main">
	<div class="m1"><h1>Welcome ${homeEntities.username}!</h1></div>
	<div class="m2"><a href="./signout">SIGNOUT</a></div>
</div>
<br/>
<br/>
<br/>
<br/><br/>
<br/>
<div class="body"><br/>
	<div class="left">List of past entries</div>
	<div class="right"><a href="./addentry"><button type="button">Add Entry</button></a></div>
</div>

<br/><br/>
<table style="width:100%" border="1">
<tr>
<th>Date</th>
<th colspan="3">Actions</th>
</tr>
<c:if test="${entrieslist.size()==0}">
<tr><td align="center" style="color:green" colspan="4"><b>NOT ADDED ANY DAIRY DATA</b></td></tr>
</c:if>

<c:forEach items="${entrieslist}" var="e">
<tr>
<td> 

<fmt:formatDate value="${e.ddate}" pattern="dd/MM/yyyy"/>  </td>
<td><a href="./viewentry?id=${e.id}">View</a></td>
<td><a href="./updateentry?id=${e.id}">Update</a></td>
<td><a href="./deleteentry?id=${e.id}">Delete</a></td>
</tr>

</c:forEach>

</table>

	
</body>
</html>
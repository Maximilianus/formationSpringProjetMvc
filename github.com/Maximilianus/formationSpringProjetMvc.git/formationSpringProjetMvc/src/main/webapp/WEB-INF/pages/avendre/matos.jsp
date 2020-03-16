<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>matos</title>
</head>
<body>

<h1>Tout le matos : </h1>


<br>
<br>




<table style="border:1px solid blue">
<tr>
<th>Description</th>
<th>Prix</th>

</tr>

	<c:forEach items="${matos}" var="matos">
	
	<tr>

	<td style="border:1px solid blue"> <c:out value="${matos.designation}"/> </td>
	<td style="border:1px solid blue"> <c:out value="${matos.prix}"/> </td>
	</tr>                          
	
	</c:forEach>
 
</table>




</body>
</html>
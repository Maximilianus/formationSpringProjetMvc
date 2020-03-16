<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>poneys</title>
</head>
<body>

<h1>Tous les Poneys : </h1>


<br>
<br>




<table style="border:1px solid blue">
<tr>
<th>Nom</th>
<th>Taille</th>
<th>Robe</th>
<th>Race</th>
<th>Description</th>
<th>Prix</th>
</tr>

	<c:forEach items="${poneys}" var="poney">
	
	<tr>
	<td style="border:1px solid blue" > <c:out value="${poney.nom}"/> </td>
	<td style="border:1px solid blue"> <c:out value="${poney.taille}"/> </td>
	<td style="border:1px solid blue"> <c:out value="${poney.robe}"/> </td>
	<td style="border:1px solid blue"> <c:out value="${poney.race}"/> </td>
	<td style="border:1px solid blue"> <c:out value="${poney.description}"/> </td>
	<td style="border:1px solid blue"> <c:out value="${poney.prix}"/> </td>
	</tr>                          
	
	</c:forEach>
 
</table>


</body>
</html>
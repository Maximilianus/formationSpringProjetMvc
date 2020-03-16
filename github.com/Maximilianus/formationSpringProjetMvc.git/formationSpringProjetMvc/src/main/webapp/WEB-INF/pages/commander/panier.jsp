<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

Votre panier

poneys : 

		<table style="border:1px solid blue">
<tr>
<th>Nom</th>
<th>Prix</th>
</tr>

	<c:forEach items="${listePoneys}" var="poney">
	
	<tr>
	<td> <c:out value="${poney.nom}"/> </td>
	<td > <c:out value="${poney.prix }"/> </td>
	</tr>                          
	
	</c:forEach>
 
</table>


Matériel :

		<table style="border:1px solid blue">
<tr>
<th>Nom</th>
<th>Prix</th>
</tr>

	<c:forEach items="${listeMatos}" var="poney">
	
	<tr>
	<td> <c:out value="${poney.designation}"/> </td>
	<td > <c:out value="${poney.prix }"/> </td>
	</tr>                          
	
	</c:forEach>
 
</table>

prix total : ${prixtotal }


</body>
</html>
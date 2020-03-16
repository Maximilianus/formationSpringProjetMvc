<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>commander matos</title>
</head>
<body>



<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

	<h3>Achat de Materiel ?</h3>
	
		<div class="form-group">
		<form:form action="" method="post" modelAttribute="m">
			<form:select path="id" cssClass="form-control">
<%-- 				<form:option value="">pas de salle</form:option> --%>
				<form:options items="${matos}" itemLabel="designation" itemValue="id" />
			</form:select>
			<input type="submit">
		</form:form>
	</div>
	
	<br>
	<br>
	<br>

		<table style="border:1px solid blue">
<tr>
<th>Nom</th>
<th>Prix</th>
</tr>

	<c:forEach items="${lstM}" var="matos">
	
	<tr>
	<td> <c:out value="${matos.designation}"/> </td>
	<td > <c:out value="${matos.prix }"/> </td>
	</tr>                          
	
	</c:forEach>
 
</table>


	<br>
	<br>
	
	${total2 }
	<br>
	<br>
	<br>


<a href="/formationSpringProjetMvc/commander/panier"> Accéder au panier </a>

</body>
</html>
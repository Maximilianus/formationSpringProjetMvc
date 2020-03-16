<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>commander</title>
</head>
<body>


<!-- <h3>Achat de matériel ?</h3> -->


<!-- <label for=""> Article </label> -->
<!-- 			   		<select name="selMatos" id="selMatos"> -->
<%-- 			   			<c:forEach items="${ matos }" var="matos"> --%>
<%-- 							<option value="${ matos.id}">${ matos.designation }</option> --%>
<%-- 			   			</c:forEach> --%>
<!-- 			   		</select> -->
			   		



<h3>Achat d'un poney ?</h3>

<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

	
	<div class="form-group">
		<form:form action="" method="post" modelAttribute="p">
			<form:select path="id" cssClass="form-control">
<%-- 				<form:option value="">pas de salle</form:option> --%>
				<form:options items="${poneys}" itemLabel="nom" itemValue="id" />
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

	<c:forEach items="${lstP}" var="poney">
	
	<tr>
	<td> <c:out value="${poney.nom}"/> </td>
	<td > <c:out value="${poney.prix }"/> </td>
	</tr>                          
	
	</c:forEach>
 
</table>

	<br>
	<br>
	
	${total }

	<br>
	<br>
	<br>
	
<a href="/formationSpringProjetMvc/commander/achatmatos"> Acheter du matériel pour les poneys</a>
	
	
</body>
</html>
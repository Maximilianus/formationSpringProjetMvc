<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
	<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Inscription</title>
</head>
<body>
	
	<form name="inscription" method="post" modelAttribute="user">
		Nom: <input type="text" name="nom"> <br>
		Prenom: <input type="text" name="prenom"> <br>
		Mot de Passe: <input type="password" name="mdp"> <br>
		Adresse: <input type="text" name="adresse"> <br>
		Galop: <input type="number" name="galop"> <br>
		<input type="submit", value="Valider">
	</form>
	
	<table style="border: 1px solid black ">
		<thead>
			<tr style="border: 1px solid black ">
				<th>Nom</th>
				<th>Prenom</th>
				<th>Adresse</th>
				<th>Galop</th>
			</tr>
		</thead>
​
		<c:forEach items="${ users }" var="user">
			<tr>
				<td style="border: 1px solid black "><c:out value="${ user.nom }" /></td>
				<td style="border: 1px solid black "><c:out value="${ user.prenom }" /></td>
				<td style="border: 1px solid black "><c:out value="${ user.adresse }" /></td>
				<td style="border: 1px solid black "><c:out value="${ user.galop }" /></td>
			</tr>
		</c:forEach>
	</table>
	
</body>
</html>
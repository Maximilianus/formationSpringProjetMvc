<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
	<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
	<form name="login" method="post" modelAttribute="user">
		Id: <input type="text" name="nom"> <br>
		Mot de Passe: <input type="password" name="mdp"> <br>
		<input type="submit", value="Valider">
	</form>
	
	<h1>Bonjour mon bon ami</h1>
	
</body>
</html>
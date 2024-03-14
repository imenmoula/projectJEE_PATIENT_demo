<%@ page language="java" contentType="text/html; charset=windows-1256"
pageEncoding="windows-1256"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1256">
<title>Insert title here</title>
</head>
<body>
<form action="controleur" method="post" >
<label>MotCle:</label>
<input type="text" name="motCle" value="${modele.motCle}">
<input type="submit" value="OK">
</form>
<table border="1" width="80%">
	<tr>
	<th>ID#</th>
	<th>Nom</th>
	<th>Prenom</th>
	 <th>Date_Naissance</th>
	 <th>Genre</th>
	 <th>Adresse</th>
	 <th>Telephone</th>
	 <th>Email</th>
	</tr>
<c:forEach items="${modele.patients}" var="p">
<tr>    
<td>${p.patientId}</td>
<td>${p.nom}</td>
<td>${p.prenom}</td>
<td>${p.dateNaissance}</td>
<td>${p.genre}</td>
<td>${p.adresse}</td>
<td>${p.telephone}</td>
<td>${p.email}</td>
</tr>
</c:forEach>
</table>
</body>
</html>
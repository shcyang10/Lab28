<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link
	href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/solar/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-8nq3OiMMgrVFAHyRMMO+DTfMEciSY+c3Awhj/5ljQ1xck1Uv2BUtMjsjLD8GT5Er"
	crossorigin="anonymous">
</head>
<body>
	<h2>The Weather</h2>
	<br>
	<table class="table">
		<tr>
			<th>Temperature</th>
			<th>Weather</th>
			<th>Text</th>
		</tr>
		
			<tr>
				<td><c:forEach var="w" items="${test}">${w}</c:forEach></td>
				<td>${weather }</td>
				<td>${text }</td>
			</tr>
		
	</table>
</body>
</html>
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
<h1>Enter Location</h1>
	<form action="table">
		Latitude: <input type="text" name="latitude" placeholder="Latitude"> <br>
		Longitude: <input type="text" name="longitude" placeholder="Longitude"> 
		<input type="submit" value="Submit">
	</form>

</body>
</html>
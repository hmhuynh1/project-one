<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cat Breeds</title>
</head>
<body>
	CAT BREED, FACT, AND SIZE:
	<table>
		<c:forEach items="${requestScope.allCats}" var="currenBreed">
			<tr>
				<td>${currenBreed.breeds}|</td>
				<td>${currenBreed.factsAboutCats}|</td>
				<td>${currenBreed.catSize}</td>
			</tr>
			
			</c:forEach>
	</table>
	<br />
	<a href="index.jsp">Home</a>

</body>
</html>
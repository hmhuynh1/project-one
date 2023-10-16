<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cats</title>
</head>
<body>
	List of all cats:
	<table>
		<c:forEach items="${requestScope.allCat}" var="currenCatBreeds">
			<tr>
				<td>${currenCatBreeds.breeds}|</td>
				<td>${currenCatBreeds.factsAboutCats}|</td>
				<td>${currenCatBreeds.size}</td>
			</tr>
		</c:forEach>
	</table>
	<br>
	<a href="index.jsp">Home</a>

</body>
</html>
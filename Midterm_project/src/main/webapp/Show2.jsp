<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cat owner address</title>
</head>
<body>
	CAT BREED, FACT, AND SIZE:
	<table>
		<c:forEach items="${requestScope.alLAddress}" var="currentOwner">
			<tr>
				<td>${currentOwner.catName}|</td>
				<td>${currentOwner.ownerAddress}|</td>
				<td>${currentOwner.ownerPhoneNumber}</td>
			</tr>
			
			</c:forEach>
	</table>
	<br />
	<a href="index.jsp">Home</a>

</body>
</html>
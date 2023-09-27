<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>String Statistics</title>
</head>
<body>
	<p>${stats.getReversed()} - Reversed Text
		<br />
		${stats.getWhiteSpaces()} - White Spaces
		<br />
		${stats.getVowels()} - getVowels
		<br />
		${stats.getPunctuation()} - Punctuation
		<br />
	</p>
	<a href="index.jsp">Restart?</a>
</body>
</html>
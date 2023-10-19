<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cat Library</title>
</head>
<body>

	<h1 style="color:#006400;">Cat Information</h1>
	<form action="showAddress" method="get">
		<input type="submit" value="Show Address" />
	</form>
	<a href="update2.jsp">Update Cat name:</a>
	<a href="delete2.jsp">Delete Cat owner address:</a>
	<a href="Add2.jsp">Add Address</a>
	
	
	<h1 style="color:#006400;">Cat Library</h1>
	<form action="showCat" method="get">
		<input type="submit" value="Show breed" />
	</form>
	<a href="update.jsp">Update Cats</a>
	<a href="delete.jsp">Delete Cats</a>
	<a href="add.jsp">Add Cats</a>
		
</body>
</html>
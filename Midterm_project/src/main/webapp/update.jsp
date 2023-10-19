<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Cats</title>
</head>
<body>


	<form action="updateCat" method="post">
		New Cat Breed: <input type="text" name="breeds" size="25" /><br><br>
		New Fast About Cat: <input type="text" name="factsAboutCats" size="25" /><br><br> 
		New Cat Size: <input type="text" name="catSize" size="25" /><br><br>
		Enter the current breed: <input type="text" name="oldName"
			size="25"> <input type="submit" value="Update" />
	</form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add a Cat Breed</title>
</head>
<body>
<form action="addCatBreed" method="post">
		Cat Breed: <input
			type="text" name="breeds" size="25"/><br><br>  
		
		Fact About Cat: <input
			type="text" name="factsAboutCats" size="25"/><br><br>   
		
		Size of the Cat: <input
			type="text" name="catSize" size="25"> 
		<input type="submit"value="Submit" />
	</form>
</body>
</html>

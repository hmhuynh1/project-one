<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add a Breed</title>
</head>
<body>
<form action="addCatBreeds" method="post">
		Cat Breed: <input
			type="text" name="catBreedName" size="25"/> 
		
		Fact about cat: <input
			type="text" name="factsAboutCat" size="25"/> 
		
		Cat size: <input
			type="text" name="catSize" size="25"> 
		<input type="submit"value="Submit" />
	</form>
</body>
</html>
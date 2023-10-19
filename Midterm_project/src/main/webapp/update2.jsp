<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="updateAddress" method="post">
		New Cat Name: <input type="text" name="catName" size="25" /><br><br>
		New Cat Owner Address: <input type="text" name="ownerAddress" size="25" /><br><br> 
		New Cat Owner phone number: <input type="text" name="ownerPhoneNumber" size="25" /><br><br>
		Enter the current Name: <input type="text" name="oldName"
			size="25"> <input type="submit" value="Update" />
	</form>

</body>
</html>
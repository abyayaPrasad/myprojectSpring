<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Add Aien into the Database
	<form action="addAlien">
		<input type="text" name="aid"><br>
		<input type="text" name="aname"><br>
		<input type="submit"><br>
		
	</form>
	<br>
	Get By ID<br>
	<form action="getAlien">
		<input type="text" name="aid"><br>
		<input type="submit"><br>
	</form>
	<br>
	<br>
	Update by Aid :-<br>
	<form action="updateAlien">
		<input type="text" name="aid"><br>
		<input type="text" name="aid"><br>
		<input type="text" name="aname"><br>
		<input type="text" name="tech"><br>
		<input type="submit"><br>
	</form>
	<br>
	<br>
	<br>
	Get By Tech
	<form action="techAlien">
	<input type="text" name="tech"><br>
	<input type="submit"><br>
	</form>
	
	Get By Name
	<form action="nameAlien">
	<input type="text" name="aname"><br>
	<input type="submit"><br>
	</form>
</body>
</html>
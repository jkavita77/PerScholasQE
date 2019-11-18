<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Login</title>
</head>
<body>
    <H1> LOGIN </H1>
    <form action = "./index.jsp" method ="post">
	    <label for="User Name">User Name:</label>
	    <input type="text" name="User Name" />
	   <br /><br />
	   <label for="Password">Password:</label>
	         <input type="text" name="Password" />
	        <br /><br />
	        <br /><br />
	        <input type="submit" value="SUBMIT" />
	</form>
</body>
</html>
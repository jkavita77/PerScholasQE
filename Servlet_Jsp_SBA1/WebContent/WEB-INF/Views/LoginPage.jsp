<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
	<h1>Login Page</h1>
	
	<form action="${pageContext.request.contextPath}/HomeServletQ3/loginMember" method="post">
		UserName: <input type="text" name="name"></input> 
		Password: <input type="password" name="password"></input> 
		<input type="submit" value="Login">
</form>
</body>
</html>
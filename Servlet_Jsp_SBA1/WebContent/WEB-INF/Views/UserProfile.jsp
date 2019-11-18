<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Profile</title>
</head>
<body>
	<h1>SBA Project4</h1>
    <p>UserId: ${uid}</p>
    <p>Username: ${username}</p>
    <p>Password: ${password}</p>
    
    <a href="${pageContext.request.contextPath}/UpdateUser?uid=${uid}">Update Profile</a>
</body>
</html>
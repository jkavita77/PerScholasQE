<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Login page</h1>
	<img src="${pageContext.request.contextPath}/image/home.jpg" alt="W3Schools.com">
	</br>
	</br>

	<a
		href="${pageContext.request.contextPath}/HomeServlet/showRegistration">Register
		Here</a>
	<form action="${pageContext.request.contextPath}/HomeServlet/loginUser"
		method="post">
		FirstName: <input type="text" name="fname"></input> </br>
		</br> Password: <input type="password" name="password"></input> </br> </br> <input
			type="submit" value="Register"> <input type="submit"
			value="Login">

	</form>
</body>
</html>
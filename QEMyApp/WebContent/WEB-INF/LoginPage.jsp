<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="/style.css" rel="stylesheet" type="text/css">

</head>
<body>
	</tr>
	</tr>
		
	<div class="container">
		<h1>Login Page</h1>
		<p style="color: red;">${errorMessage}</p>
		<a
			href="${pageContext.request.contextPath}/HomeServlet/showRegistration">Register
			Here</a>
		<form
			action="${pageContext.request.contextPath}/HomeServlet/loginMember"
			method="post">
			UserName: <input type="text" name="name"></input> Password: <input
				type="password" name="password"></input> <input type="submit"
				value="Login">
		</form>
	</div>

	<tr>
		<div class="container" style="background-color: #f1f1f1">

			<span class="psw">Forgot <a href="#">password?</a></span>
		</div>
	</tr>
</body>
</html>
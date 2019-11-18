<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Page</title>
</head>
<body>
	<h1>Registration Page</h1>
	<a href="${pageContext.request.contextPath}/HomeServlet">Cancel</a>
	<form action="${pageContext.request.contextPath}/HomeServlet/registerUser" method="post">
		<div>
			<label>First Name:</label>
			<input name="fname" />
		</div>
		<div>
			<label>Last Name:</label>
			<input name="lname" />
		</div>
		<div>
			<label>Email:</label>
			<input name="email" />
		</div>
		<div>
			<label>Password:</label>
			<input name="password" />
		</div>
		
		<div>
			<input type=submit value="Register" />
		</div>
	</form>
</body>
</html>>
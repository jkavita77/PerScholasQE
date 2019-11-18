<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">  
    <title>Document</title>
</head>
<body>
    <h1>Registration</h1>
    <form action = "./Login.jsp" method ="post">
        <label  for="Name"> Name:</label>
        <input type="text" name="Name" />
        <br /><br />
        <label for="email">email:</label>
         <input type="text" name="email" />
         <br /> <br />
         <label for="DOB">DOB:</label>
         <input type="text" name="DOB" />
        <br /><br />
        <label for="gender">Gender:</label>
        <br />
        <input type="radio" name="gender" value="Female"> Female
        <input type="radio" name="gender" value="Male"> Male
        <input type="radio" name="gender" value="Other"> Other
        <br /><br />
        <label for="User Name">User name:</label>
         <input type="text" name="username" />
        <br /><br />
        <label for="Password">Password:</label>
         <input type="text" name="Password" />
        <br /><br />
        <label for="Confirm Password">Confirm Password:</label>
         <input type="text" name="Confirm Password" />
        <br /><br />
        <br /><br />
        <input type="submit" value="SUBMIT" />
    </form>
</body>
</html>




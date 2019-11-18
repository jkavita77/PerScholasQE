<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Form</title>
<!-- The Java code on this page will run any time the page is loaded. However, 
	the outer if statement below will not run unless the "Login" button has been clicked. 
	-->

<script> 

// Function to check Whether both passwords 
// is same or not. 
function checkPassword(form) { 
    password1 = form.userPassword.value; 
    password2 = form.confPassword.value; 

    // If password not entered 
    if (password1 == '') 
        alert ("Please enter Password"); 
          
    // If confirm password not entered 
    else if (password2 == '') 
        alert ("Please enter confirm password"); 
          
    // If Not same return False.     
    else if (password1 != password2) { 
        alert ("\nPassword did not match: Please try again...") 
        return false; 
    } 

    // If same return True. 
    else{ 
        alert("Password Match: Welcome to the Login page!") 
        return true; 
    } 
} 


</script> 
</head>
<body>
	<h1>Registration Form</h1>


	<!--  <form action="login.jsp" method="POST">  -->
	 <form onSubmit = "return checkPassword(this)" action="login.jsp" method="POST"> 
		<label>First Name :&nbsp;<input type="text" name="fName" Required /></label> <br>
		<label>Last Name :&nbsp;<input type="text" name="lName" Required/></label> <br>
		<!--<label>Date Of Birth :&nbsp;<input type="text" name="dob" Required /></label>-->
		<label>DOB :&nbsp;<input type="date" name="dob" Required /></label>
		<br> <label>UserName :&nbsp;<input type="text"
			name="userName" /></label> <br> <label>Password:&nbsp;<input
			type="password" name="userPassword" /></label> <br> <label>Confirm
			Password:&nbsp;<input type="password" name="confPassword"/>
		</label> <br>
		<input type="submit" name="register" value="register"/>



	</form>
</body>
</html>
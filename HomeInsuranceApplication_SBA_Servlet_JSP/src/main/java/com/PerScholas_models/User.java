package com.PerScholas_models;

import java.util.Date;

public class User {
 int userId;
 String firstName;
 String lastName;
 String userEmail;
 String password;
 Date userDOB;
 
 public User() {
 }

 public User(int userId, String firstName,String lastName,String userEmail,String password,Date userDOB) {
 this.userId = userId;
 this.firstName = firstName;
 this.lastName = lastName;
 this.userEmail = userEmail;
 this.password = password;
 this.userDOB = userDOB;
 }
 
public int getUserId() {
	return userId;
}

public void setUserId(int userId) {
	this.userId = userId;
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public String getUserEmail() {
	return userEmail;
}

public void setUserEmail(String userEmail) {
	this.userEmail = userEmail;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public Date getUserDOB() {
	return userDOB;
}

public void setUserDOB(Date userDOB) {
	this.userDOB = userDOB;
}
}
